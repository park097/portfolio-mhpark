package com.minhee.portfolio.domain.repository

import com.minhee.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository


interface ProjectRepository : JpaRepository<Project, Long> {
}