package gn.moria.auth.repository;

import gn.moria.auth.entity.TenantAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TenantAccountRepository extends MongoRepository<TenantAccount, String> {
}
