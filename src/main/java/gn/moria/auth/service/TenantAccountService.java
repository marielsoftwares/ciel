package gn.moria.auth.service;


import gn.moria.auth.repository.TenantAccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TenantAccountService {
    private final TenantAccountRepository tenantAccountRepository;
}
