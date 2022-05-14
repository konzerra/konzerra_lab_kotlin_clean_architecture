package konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl

import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.InPortDeleteById
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseDeleteById


abstract class InPortDeleteByIdAbstractImpl<Entity: EntityI, Id:Any>
    : InPortDeleteById<Entity, Id> {
    protected abstract val useCaseDeleteById: UseCaseDeleteById<Entity, Id>
}