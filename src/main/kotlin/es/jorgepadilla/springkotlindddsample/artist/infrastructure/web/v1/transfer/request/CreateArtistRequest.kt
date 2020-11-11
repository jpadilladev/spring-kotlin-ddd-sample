package es.jorgepadilla.springkotlindddsample.artist.infrastructure.web.v1.transfer.request

data class CreateArtistRequest(val name: String, val dateOfBirth: String)