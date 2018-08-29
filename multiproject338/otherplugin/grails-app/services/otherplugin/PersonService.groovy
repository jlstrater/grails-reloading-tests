package otherplugin

import grails.gorm.transactions.Transactional
import plugin.GreetingsService

@Transactional
class PersonService {

    GreetingsService greetingsService

    def fetchGreetingForPerson() {
        return greetingsService.greet() + ' Jenn'
    }
}
