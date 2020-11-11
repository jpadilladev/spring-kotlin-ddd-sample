package es.jorgepadilla.springkotlindddsample.artist.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArtistTest {

    @Test
    fun `given artist name when create artist then should create artist correctly`() {
        val name = ArtistName("James Hetfield")
        val dateOfBirth = DateOfBirth(1963, 8, 3)

        val artist = Artist(ArtistId(), name, dateOfBirth)

        assertThat(artist.name.name).isEqualTo("James Hetfield")
    }
}