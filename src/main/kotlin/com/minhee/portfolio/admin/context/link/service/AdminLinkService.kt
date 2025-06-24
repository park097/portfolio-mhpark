package com.minhee.portfolio.admin.context.link.service

import com.minhee.portfolio.admin.context.link.form.LinkForm
import com.minhee.portfolio.admin.data.TableDTO
import com.minhee.portfolio.domain.entity.Link
import com.minhee.portfolio.domain.repository.LinkRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class AdminLinkService(
    private val linkRepository: LinkRepository
) {

    fun getLinkTable(): TableDTO {
        val classInfo = Link::class
        val entities = linkRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }

    @Transactional
    fun save(form: LinkForm) {
        val link = form.toEntity()

        linkRepository.save(link)
    }

    @Transactional
    fun update(id: Long, form: LinkForm) {
        val link = form.toEntity(id)

        linkRepository.save(link)
    }
}