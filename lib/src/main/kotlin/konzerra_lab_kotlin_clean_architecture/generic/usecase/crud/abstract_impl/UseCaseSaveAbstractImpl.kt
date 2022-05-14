package konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.abstract_impl

import konzerra_lab_kotlin_clean_architecture.generic.data.SaveDtoI
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseSave
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortSave



abstract class UseCaseSaveAbstractImpl<SaveDto: SaveDtoI>
     : UseCaseSave<SaveDto>
{
    protected abstract val outPortSave: OutPortSave<SaveDto>
    override fun save(saveDto: SaveDto){
        outPortSave.save(saveDto)
    }
}