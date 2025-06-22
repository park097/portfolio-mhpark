package com.minhee.portfolio.domain.repository

import com.minhee.portfolio.domain.entity.Achievement
import com.minhee.portfolio.domain.entity.Link
import org.aspectj.apache.bcel.Repository
import org.springframework.data.jpa.repository.JpaRepository
interface LinkRepository : JpaRepository<Link, Long> {

    // select * from link where is_active = :isActive
    fun findAllByIsActive(isActive: Boolean): List<Link>

}