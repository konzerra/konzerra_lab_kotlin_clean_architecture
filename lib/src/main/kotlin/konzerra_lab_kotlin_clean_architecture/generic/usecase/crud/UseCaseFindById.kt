package konzerra_lab_kotlin_clean_architecture.generic.usecase.crud

import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import konzerra_lab_kotlin_clean_architecture.generic.data.ResponseDtoI


interface UseCaseFindById<Entity : EntityI, Id, ResponseDto : ResponseDtoI> {
    fun findById(id:Id): ResponseDto
}