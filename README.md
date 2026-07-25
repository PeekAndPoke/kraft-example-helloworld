# Kraft Example — Hello World

The smallest possible [Kraft](https://github.com/PeekAndPoke/kraft) application: mount a SPA into the DOM and render markup, in pure Kotlin.

```kotlin
val kraft = kraftApp { }

fun main() {
    kraft.mount(selector = "#spa", engine = PreactVDomEngine()) {
        h1 { +"Hello World!" }
    }
}
```

That's the whole app. Markup comes from `kotlinx.html` — no template language, no JSX; the VDOM is driven by Preact under the hood.

## Run it

```bash
./gradlew jsBrowserDevelopmentRun
```

Then open the printed localhost URL.

## Kraft in one line

**K**otlin **R**apid **A**pp **F**ramework & **T**oolkit — build browser SPAs in pure Kotlin: components, reactive state, routing, forms.

More examples: [router](https://github.com/PeekAndPoke/kraft-example-router) · [remote data](https://github.com/PeekAndPoke/kraft-example-remote)
