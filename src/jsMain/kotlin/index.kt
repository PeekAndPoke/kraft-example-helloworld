package io.peekandpoke.kraft.examples.helloworld

import io.peekandpoke.kraft.kraftApp
import io.peekandpoke.kraft.vdom.preact.PreactVDomEngine
import kotlinx.html.h1

val kraft = kraftApp {

}

fun main() {
    kraft.mount(selector = "#spa", engine = PreactVDomEngine()) {
        h1 { +"Hello World!" }
    }
}
