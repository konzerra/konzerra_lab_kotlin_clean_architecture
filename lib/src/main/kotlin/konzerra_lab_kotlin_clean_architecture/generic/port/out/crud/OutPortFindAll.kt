package konzerra_lab_kotlin_clean_architecture.generic.port.out.crud

import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI

interface OutPortFindAll<Entity: EntityI> {
    fun findAll(): List<Entity>
}