package com.minhee.portfolio.admin.security

import com.minhee.portfolio.admin.exception.AdminBadReqeustException
import com.minhee.portfolio.domain.repository.AccountRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class AdminSecurityService(
    private val accountRepository: AccountRepository
) : UserDetailsService {
    override fun loadUserByUsername(loginId: String): UserDetails {
        return accountRepository.findByLoginId(loginId)
            .orElseThrow { throw AdminBadReqeustException("사용자 정보를 찾을 수 없습니다.") }
    }
}