package konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud

import konzerra_lab_kotlin_clean_architecture.generic.data.ResponseDtoI

interface InPortFindAll<ResponseDto: ResponseDtoI> {
    fun findAll(): Any
}