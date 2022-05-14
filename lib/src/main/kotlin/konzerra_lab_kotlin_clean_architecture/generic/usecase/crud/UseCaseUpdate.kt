package konzerra_lab_kotlin_clean_architecture.generic.usecase.crud

import konzerra_lab_kotlin_clean_architecture.generic.data.UpdateDtoI

interface UseCaseUpdate<UpdateDto : UpdateDtoI> {
    fun update(updateDto: UpdateDto)
}