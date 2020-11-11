package es.jorgepadilla.springkotlindddsample.artist.infrastructure.web.v1

import es.jorgepadilla.springkotlindddsample.artist.application.command.CreateArtistCommand
import es.jorgepadilla.springkotlindddsample.artist.domain.ArtistId
import es.jorgepadilla.springkotlindddsample.artist.infrastructure.web.v1.transfer.request.CreateArtistRequest
import es.jorgepadilla.springkotlindddsample.artist.infrastructure.web.v1.transfer.response.ResourceIdResponse
import es.jorgepadilla.springkotlindddsample.shared.application.CommandBus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
@RequestMapping("/v1")
class ArtistController(private val commandBus: CommandBus) {

    @PostMapping("/artists")
    fun creteArtist(@RequestBody request: CreateArtistRequest): ResourceIdResponse {
        val artistId = ArtistId()
        commandBus.dispatch(CreateArtistCommand(
                artistId,
                request.name,
                LocalDate.parse(request.dateOfBirth)
        ))
        return ResourceIdResponse(artistId)
    }

}