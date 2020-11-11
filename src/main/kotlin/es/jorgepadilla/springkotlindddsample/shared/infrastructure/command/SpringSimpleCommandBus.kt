package es.jorgepadilla.springkotlindddsample.shared.infrastructure.command

import es.jorgepadilla.springkotlindddsample.shared.application.Command
import es.jorgepadilla.springkotlindddsample.shared.application.CommandBus
import es.jorgepadilla.springkotlindddsample.shared.application.CommandHandler
import org.springframework.stereotype.Component
import kotlin.reflect.KClass

@Component
class SpringSimpleCommandBus(handlers: List<CommandHandler<*>>) : CommandBus {

    private val handlersMap: Map<KClass<out Command>, List<CommandHandler<*>>> = handlers.groupBy { it.getType() }

    override fun dispatch(command: Command) {
        val handler = handlersMap[command::class] ?: throw IllegalArgumentException("Handler not found")
        return handler.forEach {
            (it as CommandHandler<Command>).handle(command)
        }
    }

}