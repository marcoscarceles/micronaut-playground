package micronaut.playground

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("micronaut.playground")
                .mainClass(Application.javaClass)
                .start()
    }
}