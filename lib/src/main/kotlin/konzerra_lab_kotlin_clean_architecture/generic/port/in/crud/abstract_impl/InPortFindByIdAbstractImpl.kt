package konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl

import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import konzerra_lab_kotlin_clean_architecture.generic.data.ResponseDtoI
import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.InPortFindById
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseFindById


abstract class InPortFindByIdAbstractImpl<Entity:EntityI,Id:Any,ResponseDto: ResponseDtoI>
    : InPortFindById<ResponseDto,Id>
{
    protected abstract val useCaseFindById:UseCaseFindById<Entity,Id,ResponseDto>
}