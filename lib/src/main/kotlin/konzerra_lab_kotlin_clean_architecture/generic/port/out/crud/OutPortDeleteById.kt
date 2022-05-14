package konzerra_lab_kotlin_clean_architecture.generic.port.out.crud

import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI

interface OutPortDeleteById<Entity: EntityI, Id:Any> {
    fun deleteById(id: Id)
}