package app

import plugin.GreetingService

class GreetingController {

    GreetingService greetingService

    def index() {
        render greetingService.greet()
    }
}
