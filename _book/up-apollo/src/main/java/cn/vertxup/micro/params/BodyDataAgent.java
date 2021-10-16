package cn.vertxup.micro.params;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.FileUpload;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.util.Ut;

import javax.ws.rs.BodyParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.StreamParam;
import java.util.UUID;

@EndPoint
public class BodyDataAgent {

    @POST
    @Path("/hi/param/body-string")
    public JsonObject sayBody(@BodyParam final JsonObject data) {
        return data;
    }

    @POST
    @Path("/hi/param/body-file")
    public JsonObject sayFile(@StreamParam final FileUpload fileUpload) {
        final JsonObject uploaded = new JsonObject();
        // 上传文件
        final String originalFile = fileUpload.fileName();
        final int lastIndex = originalFile.lastIndexOf('.');
        final String fileName = originalFile.substring(0, lastIndex);
        final String extension = originalFile.substring(lastIndex + 1);

        uploaded.put("key", UUID.randomUUID().toString())

                // .put("storeWay", config.getFileStorage())
                .put("status", "PROGRESS")
                .put("name", originalFile)
                .put("fileKey", Ut.randomString(64))
                .put("fileName", fileName)

                // .put("fileUrl", downloadUrl)
                .put("filePath", fileUpload.uploadedFileName())
                .put("extension", extension)
                .put("module", "x_module")
                .put("mime", fileUpload.contentType())
                .put("size", fileUpload.size())
                .put("language", "cn")
                .put("metadata", new JsonObject().encode());
        // Zero Extension 中的 Ambient 模块专用
        // return At.upload("stream.file", file);
        return uploaded;
    }
}
