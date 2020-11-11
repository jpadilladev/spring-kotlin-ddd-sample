package es.jorgepadilla.springkotlindddsample.artist.infrastructure.repository

import es.jorgepadilla.springkotlindddsample.artist.domain.Artist
import es.jorgepadilla.springkotlindddsample.artist.domain.ArtistId
import es.jorgepadilla.springkotlindddsample.artist.domain.ArtistRepository
import org.springframework.data.jpa.repository.JpaRepository

interface ArtistSpringDataRepository : ArtistRepository, JpaRepository<Artist, ArtistId>