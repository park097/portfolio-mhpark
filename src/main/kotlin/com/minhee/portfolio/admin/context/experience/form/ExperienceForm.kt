package com.minhee.portfolio.admin.context.experience.form

import com.minhee.portfolio.domain.entity.Experience
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Positive

data class ExperienceForm(

    @field:NotBlank(message = "필수값입니다.")
    val title: String,

    @field:NotBlank(message = "필수값입니다.")
    val description: String,

    @field:Positive(message = "0보다 커야 합니다.")
    val startYear: Int,

    @field:Min(value = 1, message = "최솟값은 1입니다.")
    @field:Max(value = 12, message = "최댓값은 12입니다.")
    val startMonth: Int,

    val endYear: Int?,

    val endMonth: Int?,

    val isActive: Boolean,

    val details: List<ExperienceDetailForm>?

) {
    fun toEntity(): Experience {
        return Experience(
            title = this.title,
            description = this.description,
            startYear = this.startYear,
            startMonth = this.startMonth,
            endYear = this.endYear,
            endMonth = this.endMonth,
            isActive = this.isActive
        )
    }
}