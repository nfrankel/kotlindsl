package ch.frankel.kotlindsl

import com.vaadin.server.*
import com.vaadin.shared.ui.*
import com.vaadin.ui.*

class KotlinUI : UI() {

    override fun init(request: VaadinRequest) {
        theme = "valo"
        verticalLayout()
    }
}

fun UI.verticalLayout(spacing: Boolean = false, margin: Boolean = false) {
    val verticalLayout = VerticalLayout()
    verticalLayout.isSpacing = spacing
    verticalLayout.margin = MarginInfo(margin)
    content = verticalLayout
}