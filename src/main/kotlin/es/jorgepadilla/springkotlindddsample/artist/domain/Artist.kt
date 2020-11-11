package es.jorgepadilla.springkotlindddsample.artist.domain

import es.jorgepadilla.springkotlindddsample.shared.domain.AbstractId
import es.jorgepadilla.springkotlindddsample.shared.domain.BaseEntity
import es.jorgepadilla.springkotlindddsample.shared.domain.ValueObject
import javax.persistence.Embeddable
import javax.persistence.Embedded
import javax.persistence.Entity

class ArtistId : AbstractId()

@Embeddable
data class ArtistName(val name: String) : ValueObject {
    init {
        require(name.isNotBlank()) { "Name cannot be blank" }
    }
}

@Entity
class Artist(

        id: ArtistId,
        @Embedded
        val name: ArtistName,
        @Embedded
        val dateOfBirth: DateOfBirth
) : BaseEntity<ArtistId>(id)