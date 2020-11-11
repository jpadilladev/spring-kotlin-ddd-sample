package es.jorgepadilla.springkotlindddsample.shared.application

interface Command

interface CommandBus {

    fun dispatch(command: Command)

}