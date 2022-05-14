package konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud

import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI

interface InPortDeleteById<Entity: EntityI, Id:Any> {
    fun deleteById(id: Id):Any
}