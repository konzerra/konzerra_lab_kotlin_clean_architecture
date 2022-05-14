package konzerra_lab_kotlin_clean_architecture.generic.port.out.crud

import konzerra_lab_kotlin_clean_architecture.generic.data.SaveDtoI

interface OutPortSave<SaveDto: SaveDtoI> {
    fun save(saveDto: SaveDto)
}