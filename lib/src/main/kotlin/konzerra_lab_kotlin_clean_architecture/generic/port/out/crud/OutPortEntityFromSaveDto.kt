package konzerra_lab_kotlin_clean_architecture.generic.port.out.crud

import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import konzerra_lab_kotlin_clean_architecture.generic.data.SaveDtoI

interface OutPortEntityFromSaveDto<Entity: EntityI,SaveDto: SaveDtoI> {
    fun entityFromSaveDto(saveDto: SaveDto):Entity
}