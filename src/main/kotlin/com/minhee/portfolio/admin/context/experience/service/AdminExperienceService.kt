package com.minhee.portfolio.admin.context.experience.service

import com.minhee.portfolio.admin.data.TableDTO
import com.minhee.portfolio.admin.exception.AdminBadReqeustException
import com.minhee.portfolio.domain.entity.Experience
import com.minhee.portfolio.domain.entity.ExperienceDetail
import com.minhee.portfolio.domain.repository.ExperienceRepository
import org.springframework.stereotype.Service

@Service
class AdminExperienceService(
    private val experienceRepository: ExperienceRepository
) {

    fun getExperienceTable(): TableDTO {
        val classInfo = Experience::class
        val entities = experienceRepository.findAll()

        return TableDTO.from(classInfo, entities, "details")
    }

    fun getExperienceDetailTable(id: Long?): TableDTO {
        val classInfo = ExperienceDetail::class
        val entities = if (id != null) experienceRepository.findById(id)
            .orElseThrow { throw AdminBadReqeustException("ID ${id}에 해당하는 데이터를 찾을 수 없습니다.") }
            .details else emptyList()

        return TableDTO.from(classInfo, entities)
    }
}