package konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud

import konzerra_lab_kotlin_clean_architecture.generic.data.UpdateDtoI

interface InPortUpdate<UpdateDto: UpdateDtoI> {
    fun update(updateDto: UpdateDto): Any
}