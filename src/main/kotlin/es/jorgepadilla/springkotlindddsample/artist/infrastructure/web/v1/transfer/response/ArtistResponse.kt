package es.jorgepadilla.springkotlindddsample.artist.infrastructure.web.v1.transfer.response

import java.time.LocalDate
import java.util.*

data class ArtistResponse(
        val id: UUID,
        val name: String,
        val dateOfBirth: LocalDate
)