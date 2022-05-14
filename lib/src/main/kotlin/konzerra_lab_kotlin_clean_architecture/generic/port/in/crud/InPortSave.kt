package konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud

import konzerra_lab_kotlin_clean_architecture.generic.data.SaveDtoI

interface InPortSave<SaveDto: SaveDtoI> {
    fun save(saveDto: SaveDto): Any
}