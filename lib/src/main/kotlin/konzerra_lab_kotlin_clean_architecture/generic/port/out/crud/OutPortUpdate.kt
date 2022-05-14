package konzerra_lab_kotlin_clean_architecture.generic.port.out.crud

import konzerra_lab_kotlin_clean_architecture.generic.data.UpdateDtoI

interface OutPortUpdate<UpdateDto: UpdateDtoI> {
    fun update(updateDto: UpdateDto)
}