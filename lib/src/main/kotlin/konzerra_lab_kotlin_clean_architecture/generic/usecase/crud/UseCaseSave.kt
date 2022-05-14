package konzerra_lab_kotlin_clean_architecture.generic.usecase.crud

import konzerra_lab_kotlin_clean_architecture.generic.data.SaveDtoI

interface UseCaseSave<SaveDto : SaveDtoI> {
    fun save(saveDto: SaveDto)
}

