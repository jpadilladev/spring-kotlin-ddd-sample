package es.jorgepadilla.springkotlindddsample.artist.domain

interface ArtistRepository {

    fun save(artist: Artist): Artist
}