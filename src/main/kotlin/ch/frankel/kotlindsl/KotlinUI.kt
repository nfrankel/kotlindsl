package ch.frankel.kotlindsl

import com.vaadin.server.*
import com.vaadin.shared.ui.*
import com.vaadin.ui.*

class KotlinUI : UI() {

    override fun init(request: VaadinRequest) {
        theme = "valo"
        verticalLayout(spacing = true) {
            addComponent(Label())
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