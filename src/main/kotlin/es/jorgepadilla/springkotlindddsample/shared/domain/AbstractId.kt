package es.jorgepadilla.springkotlindddsample.shared.domain

import java.io.Serializable
import java.util.*
import javax.persistence.Embeddable
import javax.persistence.MappedSuperclass

@Embeddable
@MappedSuperclass
abstract class AbstractId(
        val id: UUID = UUID.randomUUID()
): Serializable