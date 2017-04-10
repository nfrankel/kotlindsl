package ch.frankel.kotlindsl

import com.vaadin.server.*
import com.vaadin.ui.*

class KotlinUI : UI() {

    override fun init(request: VaadinRequest) {
        theme = "valo"
        verticalLayout()
    }
}

fun UI.verticalLayout() {
    val verticalLayout = VerticalLayout()
    content = verticalLayout
}