package es.jorgepadilla.springkotlindddsample.artist.domain

import es.jorgepadilla.springkotlindddsample.shared.domain.ValueObject
import java.time.LocalDate
import javax.persistence.Embeddable

@Embeddable
class DateOfBirth(year: Int, month: Int, day: Int) : ValueObject {

    val date: LocalDate = LocalDate.of(year, month, day)

    companion object {

        fun ofDate(date: LocalDate): DateOfBirth {
            return DateOfBirth(date.year, date.monthValue, date.dayOfMonth)
        }

    }

}