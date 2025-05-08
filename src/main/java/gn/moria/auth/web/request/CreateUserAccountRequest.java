package gn.moria.auth.web.request;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class CreateUserAccountRequest {
    private Map<String,Object> structure;
}
