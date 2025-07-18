package com.minhee.portfolio.domain.repository

import com.minhee.portfolio.domain.entity.Achievement
import com.minhee.portfolio.domain.entity.ProjectSkill
import org.aspectj.apache.bcel.Repository
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface ProjectSkillRepository : JpaRepository<ProjectSkill, Long> {

    // select * from project_skill where project_id = :projectId and skill_id = :skillId
    fun findByProjectIdAndSkillId(projectId: Long, skillId: Long): Optional<ProjectSkill>

}