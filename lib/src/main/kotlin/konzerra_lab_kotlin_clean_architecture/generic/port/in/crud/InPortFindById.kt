package konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud

import konzerra_lab_kotlin_clean_architecture.generic.data.ResponseDtoI


interface InPortFindById<ResponseDto: ResponseDtoI, Id:Any> {
    fun findById(id:Id): Any
}