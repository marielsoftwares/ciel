package gn.moria.auth.web.response;

import lombok.Builder;

@Builder
public class ApiResponse {
    private String message;
    private Object payload;
}
