package konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.abstract_impl

import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import konzerra_lab_kotlin_clean_architecture.generic.data.ResponseDtoI
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseFindById
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortFindById
import konzerra_lab_kotlin_clean_architecture.generic.util.Mapper


abstract class UseCaseFindByIdAbstractImpl<Entity: EntityI,Id:Any, ResponseDto: ResponseDtoI>
    : UseCaseFindById<Entity, Id, ResponseDto> {
    protected abstract val outPortFindById: OutPortFindById<Entity, Id>
    protected abstract val mapper: Mapper<Entity, ResponseDto>

    override fun findById(id: Id): ResponseDto {
        return  mapper.toResponseDto(outPortFindById.findById(id))
    }

}