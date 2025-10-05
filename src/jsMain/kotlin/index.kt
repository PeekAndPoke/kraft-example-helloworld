package io.peekandpoke.kraft.examples.helloworld

import de.peekandpoke.kraft.kraftApp
import de.peekandpoke.kraft.vdom.preact.PreactVDomEngine
import kotlinx.html.h1

val kraft = kraftApp {

}

fun main() {
    kraft.mount(selector = "#spa", engine = PreactVDomEngine()) {
        h1 { +"Hello World!" }
    }
}
