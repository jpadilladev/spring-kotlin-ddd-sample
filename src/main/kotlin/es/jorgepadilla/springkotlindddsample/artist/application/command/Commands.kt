package es.jorgepadilla.springkotlindddsample.artist.application.command

import es.jorgepadilla.springkotlindddsample.artist.domain.ArtistId
import es.jorgepadilla.springkotlindddsample.shared.application.Command
import java.time.LocalDate


data class CreateArtistCommand(val artistId: ArtistId, val name: String, val dateOfBirth: LocalDate) : Command