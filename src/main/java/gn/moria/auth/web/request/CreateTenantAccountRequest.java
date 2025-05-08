package gn.moria.auth.web.request;

import lombok.Data;

@Data
public class CreateTenantAccountRequest {
    private String email;
    private String passWord;
}
