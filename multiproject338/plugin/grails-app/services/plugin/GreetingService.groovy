package plugin

import grails.gorm.transactions.Transactional

@Transactional
class GreetingService {

    String greet() {
        return 'hello!'
    }
}
