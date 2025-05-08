package gn.moria.auth.entity;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class UserAccount extends BaseMongoAudit {
    @Indexed(unique = true)
    private String sku;

    @Indexed(unique = true)

    private String identity;
    private String password;
    private Map<String,Object> structure;

    @DocumentReference
    @NotBlank(message = "tenant account is required")
    private TenantAccount tenantAccount;
}
