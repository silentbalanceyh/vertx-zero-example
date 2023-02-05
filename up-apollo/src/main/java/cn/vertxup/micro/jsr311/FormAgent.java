package cn.vertxup.micro.jsr311;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.FileUpload;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import java.io.File;
import java.util.Arrays;
import java.util.Set;

/**
 * `jakarta.ws.rs.FormParam`
 */
@EndPoint
public class FormAgent {
    /*
     * 直接参数：java.io.File
     * 集合参数：Set<FileUpload>
     */
    @POST
    @Path("/hi/jsr311/form")
    public JsonObject sayForm(@FormParam("username") final String username,
                              @FormParam("file") final File file,
                              @FormParam("file1") final Set<FileUpload> fileUploads) {
        final JsonObject response = new JsonObject();
        response.put("username", username);
        response.put("file", file.getAbsolutePath());
        /* Secondary */
        final JsonArray secondary = new JsonArray();
        fileUploads.stream().map(FileUpload::uploadedFileName)
                .forEach(secondary::add);
        response.put("file1", secondary);
        return response;
    }

    /*
     * 直接提取内容的参数：bytes，计算长度
     * 数组参数：File[] file
     */
    @POST
    @Path("/hi/jsr311/form-advanced")
    public JsonObject sayForm1(@FormParam("username") final String username,
                               @FormParam("file") final byte[] bytes,
                               @FormParam("file1") final File[] files) {
        final JsonObject response = new JsonObject();
        response.put("username", username);
        response.put("file", bytes.length);
        /* Secondary */
        final JsonArray secondary = new JsonArray();
        Arrays.stream(files)
                .map(File::getAbsolutePath)
                .forEach(secondary::add);
        response.put("file1", secondary);
        return response;
    }

    @POST
    @Path("/hi/jsr311/form-complex")
    public JsonObject sayForm3(@FormParam("username") final String username,
                               @FormParam("file") final Buffer buffer,
                               @FormParam("file1") final FileUpload[] fileUploads) {
        final JsonObject response = new JsonObject();
        response.put("username", username);
        response.put("file", buffer.length());
        /* Secondary */
        final JsonArray secondary = new JsonArray();
        Arrays.stream(fileUploads)
                .map(FileUpload::uploadedFileName)
                .forEach(secondary::add);
        response.put("file1", secondary);
        return response;
    }
}
