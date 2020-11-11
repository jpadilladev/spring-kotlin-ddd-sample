package es.jorgepadilla.springkotlindddsample.artist.application.command.handler

import es.jorgepadilla.springkotlindddsample.artist.application.command.CreateArtistCommand
import es.jorgepadilla.springkotlindddsample.artist.domain.Artist
import es.jorgepadilla.springkotlindddsample.artist.domain.ArtistName
import es.jorgepadilla.springkotlindddsample.artist.domain.ArtistRepository
import es.jorgepadilla.springkotlindddsample.artist.domain.DateOfBirth
import es.jorgepadilla.springkotlindddsample.shared.application.Command
import es.jorgepadilla.springkotlindddsample.shared.application.CommandHandler
import org.springframework.stereotype.Service
import kotlin.reflect.KClass

@Service
class CreateArtistCommandHandler(
        private val artistRepository: ArtistRepository
) : CommandHandler<CreateArtistCommand> {

    override fun handle(command: CreateArtistCommand) {
        val artist = Artist(
                command.artistId,
                ArtistName(command.name),
                DateOfBirth.ofDate(command.dateOfBirth)
        )
        artistRepository.save(artist)
    }

    override fun getType(): KClass<out Command> {
        return CreateArtistCommand::class
    }

}