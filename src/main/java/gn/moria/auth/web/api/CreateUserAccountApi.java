package gn.moria.auth.web.api;

import gn.moria.auth.web.request.CreateUserAccountRequest;
import gn.moria.auth.web.response.ApiResponse;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

public interface CreateUserAccountApi {
    ResponseEntity<ApiResponse> createUserAccount(CreateUserAccountRequest createUserAccountRequest);
}
