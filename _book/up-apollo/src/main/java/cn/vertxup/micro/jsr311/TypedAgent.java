package cn.vertxup.micro.jsr311;

import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.User;
import io.vertx.ext.web.FileUpload;
import io.vertx.ext.web.Session;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.commune.config.XHeader;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import java.util.Objects;
import java.util.Set;

@EndPoint
public class TypedAgent {
    /*
     * 多语言多租户对象
     */
    @GET
    @Path("/hi/params/typed/x-header")
    public JsonObject header(final XHeader header) {
        return header.toJson();
    }

    /*
     * 会话对象
     */
    @GET
    @Path("/hi/params/typed/session")
    public JsonObject session(final Session session) {
        return new JsonObject().put("session.id", session.id());
    }

    /*
     * 请求、响应对象
     */
    @GET
    @Path("/hi/params/typed/request-response")
    public JsonObject request(final HttpServerRequest request,
                              final HttpServerResponse response) {
        return new JsonObject()
                .put("path", request.path())
                .put("key", response.getStatusCode());
    }

    /*
     * Vertx 引用对象
     */
    @GET
    @Path("/hi/params/typed/vertx")
    public JsonObject vertx(final Vertx vertx) {
        return new JsonObject()
                .put("vertx", vertx.toString());
    }

    /*
     * EventBus 对象
     */
    @GET
    @Path("/hi/params/typed/event-bus")
    public JsonObject eventbus(final EventBus bus) {
        return new JsonObject()
                .put("event-bus", bus.toString());
    }

    /*
     * User 用户对象
     */
    @GET
    @Path("/hi/params/typed/user")
    public JsonObject user(final User user) {
        final String userString = Objects.isNull(user) ? "Public" : user.toString();
        return new JsonObject()
                .put("user", userString);
    }

    /*
     * JsonArray 对象
     */
    @GET
    @Path("/hi/params/typed/json-array")
    public JsonObject jarray(final JsonArray array) {
        return new JsonObject()
                .put("jarray", array);
    }

    /*
     * JsonObject 对象
     */
    @GET
    @Path("/hi/params/typed/json-object")
    public JsonObject jobject(final JsonObject object) {
        return new JsonObject()
                .put("jobject", object);
    }

    /*
     * Buffer 对象
     */
    @POST
    @Path("/hi/params/typed/buffer")
    public JsonObject buffer(final Buffer buffer) {
        return new JsonObject()
                .put("buffer", buffer.length());
    }

    /*
     * 多文件上传对象
     */
    @POST
    @Path("/hi/params/typed/set")
    public JsonObject uploads(final Set<FileUpload> fileUploads) {
        return new JsonObject()
                .put("files", fileUploads.size());
    }

    /*
     * 单文件上传
     */
    @POST
    @Path("/hi/params/typed/upload")
    public JsonObject upload(final FileUpload upload) {
        if (Objects.isNull(upload)) {
            return new JsonObject();
        } else {
            return new JsonObject()
                    .put("filename", upload.uploadedFileName());
        }
    }
}
