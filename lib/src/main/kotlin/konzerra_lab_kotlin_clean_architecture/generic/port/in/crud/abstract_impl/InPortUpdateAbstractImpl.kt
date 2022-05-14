package konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl

import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import konzerra_lab_kotlin_clean_architecture.generic.data.UpdateDtoI
import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.InPortUpdate
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseUpdate


abstract class InPortUpdateAbstractImpl<Entity: EntityI, Id:Any, UpdateDto: UpdateDtoI>
    :InPortUpdate<UpdateDto>
{
    protected abstract val useCaseUpdate:UseCaseUpdate<UpdateDto>
}