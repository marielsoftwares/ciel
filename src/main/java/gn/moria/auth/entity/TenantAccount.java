package gn.moria.auth.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Document("tenants")
public class TenantAccount extends BaseMongoAudit implements UserDetails {

    @Indexed(unique = true)
    private String tenantSku;

    private String passWord;

    @Indexed
    private boolean accountExpired;

    @Indexed
    private boolean accountLocked;

    @Indexed
    private boolean credentialsExpired;

    @Indexed
    @Builder.Default
    private boolean enabled = true;

    @Indexed
    private boolean emailVerified;

    private boolean phoneNumberVerified;

    @Indexed(unique = true)
    private String email;


    @Version
    private Integer version;

    @Indexed
    private boolean deleted;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return this.passWord;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return !this.accountExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !this.accountLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return !this.credentialsExpired;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
}
