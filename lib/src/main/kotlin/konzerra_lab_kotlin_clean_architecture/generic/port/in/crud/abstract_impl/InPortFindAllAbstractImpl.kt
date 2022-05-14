package konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl

import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import konzerra_lab_kotlin_clean_architecture.generic.data.ResponseDtoI
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseFindAll

abstract class InPortFindAllAbstractImpl<Entity:EntityI,ResponseDto: ResponseDtoI> {
    protected abstract val useCaseFindAll:UseCaseFindAll<Entity,ResponseDto>
}