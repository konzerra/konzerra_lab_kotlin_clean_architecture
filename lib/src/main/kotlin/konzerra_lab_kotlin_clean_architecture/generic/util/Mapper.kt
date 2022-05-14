package konzerra_lab_kotlin_clean_architecture.generic.util

import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import konzerra_lab_kotlin_clean_architecture.generic.data.ResponseDtoI


interface Mapper<Entity: EntityI, ResponseDto: ResponseDtoI> {
   fun toResponseDto(entity:Entity): ResponseDto
}