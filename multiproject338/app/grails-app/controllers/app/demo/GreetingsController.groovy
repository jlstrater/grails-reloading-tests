package app.demo

import otherplugin.PersonService

class GreetingsController {
    PersonService personService

    def index() {
        println 'hello'
        
        render personService.fetchGreetingForPerson()
    }
}
