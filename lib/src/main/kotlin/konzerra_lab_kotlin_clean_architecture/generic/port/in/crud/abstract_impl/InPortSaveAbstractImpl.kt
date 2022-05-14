package konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl

import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import konzerra_lab_kotlin_clean_architecture.generic.data.SaveDtoI
import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.InPortSave
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseSave


abstract class InPortSaveAbstractImpl<Entity:EntityI,Id:Any,SaveDto: SaveDtoI>
    :InPortSave<SaveDto>
{
    protected abstract val useCaseInPortSave:UseCaseSave<SaveDto>
}