package ch.frankel.kotlindsl

import com.vaadin.server.*
import com.vaadin.shared.ui.*
import com.vaadin.shared.ui.ContentMode.*
import com.vaadin.ui.*

class KotlinUI : UI() {

    override fun init(request: VaadinRequest) {
        theme = "valo"
        verticalLayout(spacing = true) {
            html("<strong>Hello</strong>")
        }
    }
}

fun UI.verticalLayout(spacing: Boolean = false,
                      margin: Boolean = false,
                      init: VerticalLayout.() -> Unit) {
    content = VerticalLayout().apply {
        this.isSpacing = spacing
        this.margin = MarginInfo(margin)
    }.apply(init)
}

fun VerticalLayout.label(label: String, init: Label.() -> Unit) = Label().apply(init).apply {
    this@label.addComponent(this)
}

fun VerticalLayout.html(label: String, init: Label.() -> Unit = {}) =
        label(label, init).apply { contentMode = HTML }
