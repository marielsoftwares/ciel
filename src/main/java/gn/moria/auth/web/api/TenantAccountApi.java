package gn.moria.auth.web.api;

import gn.moria.auth.web.response.ApiResponse;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface TenantAccountApi {
    ResponseEntity<ApiResponse> create(Map<String,Object> request,String authorization);
}
