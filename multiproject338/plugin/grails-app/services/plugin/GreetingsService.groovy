package plugin

import grails.gorm.transactions.Transactional

@Transactional
class GreetingsService {

    String greet() {
        return 'Hello'
    }
}
