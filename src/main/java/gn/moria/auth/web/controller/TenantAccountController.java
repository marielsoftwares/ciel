package gn.moria.auth.web.controller;

import gn.moria.auth.entity.TenantAccount;
import gn.moria.auth.service.TenantAccountService;
import gn.moria.auth.web.api.TenantAccountApi;
import gn.moria.auth.web.request.CreateTenantAccountRequest;
import gn.moria.auth.web.response.ApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("accounts")
public class TenantAccountController implements TenantAccountApi {
    private final TenantAccountService tenantAccountService;

    @PostMapping
    @Override
    public ResponseEntity<ApiResponse> create(@RequestBody Map<String,Object> request, @RequestHeader(HttpHeaders.AUTHORIZATION) String authorization) {
        return null;
    }
}
