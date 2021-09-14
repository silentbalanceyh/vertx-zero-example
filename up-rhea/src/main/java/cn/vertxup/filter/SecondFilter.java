package cn.vertxup.filter;

import io.vertx.core.VertxException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.up.annotations.Ordered;
import io.vertx.up.uca.web.filter.HttpFilter;

import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/hi/jsr340/*")
@Ordered(2)
public class SecondFilter extends HttpFilter {

    @Override
    public void doFilter(final HttpServerRequest request,
                         final HttpServerResponse response)
            throws IOException, VertxException {
        System.out.println("2. Second Filter");
        this.put("nextKey", "Second Filter");
    }
}
