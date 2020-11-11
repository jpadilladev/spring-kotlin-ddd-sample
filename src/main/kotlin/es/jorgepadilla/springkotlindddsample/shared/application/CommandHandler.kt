package es.jorgepadilla.springkotlindddsample.shared.application

import javax.transaction.Transactional
import kotlin.reflect.KClass

interface CommandHandler<T : Command> {

    @Transactional
    fun handle(command: T)

    fun getType(): KClass<out Command>

}