package cn.vertxup.filter;

import io.vertx.core.VertxException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.up.uca.web.filter.HttpFilter;

import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/hi/jsr340/*")
public class FirstFilter extends HttpFilter {
    @Override
    public void doFilter(final HttpServerRequest request,
                         final HttpServerResponse response)
            throws IOException, VertxException {
        System.out.println("1. First Filter");
        this.put("contextKey", "Lang Filter");
    }
}
