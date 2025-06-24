package com.minhee.portfolio.admin.context.introduction.service

import com.minhee.portfolio.admin.context.introduction.form.IntroductionForm
import com.minhee.portfolio.admin.data.TableDTO
import com.minhee.portfolio.domain.entity.Introduction
import com.minhee.portfolio.domain.repository.IntroductionRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class AdminIntroductionService(
    private val introductionRepository: IntroductionRepository
) {

    fun getIntroductionTable(): TableDTO {
        val classInfo = Introduction::class
        val entities = introductionRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }

    @Transactional
    fun save(form: IntroductionForm) {
        val introduction = form.toEntity()
        introductionRepository.save(introduction)
    }

    @Transactional
    fun update(id: Long, form: IntroductionForm) {
        val introduction = form.toEntity(id)
        introductionRepository.save(introduction)
    }
}