package konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.abstract_impl

import konzerra_lab_kotlin_clean_architecture.generic.data.UpdateDtoI
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseUpdate
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortUpdate

abstract class UseCaseUpdateAbstractImpl<UpdateDto: UpdateDtoI>
    : UseCaseUpdate<UpdateDto> {

    protected abstract val outPortUpdate: OutPortUpdate<UpdateDto>
    override fun update(updateDto: UpdateDto) {
        outPortUpdate.update(updateDto)
    }

}