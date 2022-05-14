package konzerra_lab_kotlin_clean_architecture.generic.usecase.crud

import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI

interface UseCaseDeleteById<Entity: EntityI, Id> {
    fun deleteById(id:Id)
}