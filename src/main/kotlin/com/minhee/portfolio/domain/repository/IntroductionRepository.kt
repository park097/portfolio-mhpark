package com.minhee.portfolio.domain.repository

import com.minhee.portfolio.domain.entity.Achievement
import com.minhee.portfolio.domain.entity.Introduction
import org.aspectj.apache.bcel.Repository
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Repository> {
}