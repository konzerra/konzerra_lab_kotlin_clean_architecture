package konzerra_lab_kotlin_clean_architecture.generic.usecase.crud

import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import konzerra_lab_kotlin_clean_architecture.generic.data.ResponseDtoI

interface UseCaseFindAll<Entity : EntityI, ResponseDto : ResponseDtoI> {
    fun findAll(): List<ResponseDto>
}