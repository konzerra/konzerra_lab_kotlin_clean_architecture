package konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.abstract_impl

import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import konzerra_lab_kotlin_clean_architecture.generic.data.ResponseDtoI
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseFindAll
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortFindAll
import konzerra_lab_kotlin_clean_architecture.generic.util.Mapper

abstract class UseCaseFindAllAbstractImpl<Entity: EntityI, ResponseDto: ResponseDtoI>
    : UseCaseFindAll<Entity, ResponseDto> {
    protected abstract val outPortFindAll: OutPortFindAll<Entity>
    protected abstract val mapper: Mapper<Entity, ResponseDto>
    override fun findAll(): List<ResponseDto> {
        val list = outPortFindAll.findAll()
        return list.map {
            mapper.toResponseDto(it)
        }
    }
}