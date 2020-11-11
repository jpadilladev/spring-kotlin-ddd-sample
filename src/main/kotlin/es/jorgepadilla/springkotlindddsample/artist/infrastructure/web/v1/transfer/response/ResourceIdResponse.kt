package es.jorgepadilla.springkotlindddsample.artist.infrastructure.web.v1.transfer.response

import es.jorgepadilla.springkotlindddsample.shared.domain.AbstractId
import java.util.*

data class ResourceIdResponse(val id: UUID) {

    constructor(id: AbstractId) : this(id.id)

}