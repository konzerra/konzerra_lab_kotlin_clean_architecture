package konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.abstract_impl

import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseDeleteById
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortDeleteById

abstract class UseCaseDeleteByIdAbstractImpl<Entity: EntityI, Id:Any>
    : UseCaseDeleteById<Entity, Id>
{
    protected abstract val outPortDeleteById: OutPortDeleteById<Entity, Id>
    override fun deleteById(id: Id) {
        outPortDeleteById.deleteById(id)
    }
}
