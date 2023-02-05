package cn.vertxup.micro.jsr311;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.FileUpload;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.StreamParam;
import java.io.File;
import java.util.Set;

@EndPoint
public class StreamAgent {

    @POST
    @Path("/hi/jsr311/stream")
    public JsonObject sayStream(@StreamParam final FileUpload fileUpload) {
        return new JsonObject().put("server-file", fileUpload.uploadedFileName());
    }

    @POST
    @Path("/hi/jsr311/file")
    public JsonObject sayFile(@StreamParam final File file) {
        return new JsonObject().put("server-file", file.getAbsolutePath());
    }

    @POST
    @Path("/hi/jsr311/streams")
    public JsonArray sayStreams(@StreamParam final Set<FileUpload> fileUploads) {
        final JsonArray normalized = new JsonArray();
        fileUploads.stream().map(FileUpload::uploadedFileName).forEach(normalized::add);
        return normalized;
    }

    @POST
    @Path("/hi/jsr311/buffer")
    public JsonObject sayBuffer(@StreamParam final Buffer buffer) {
        return new JsonObject().put("buffer", buffer.length());
    }
}
