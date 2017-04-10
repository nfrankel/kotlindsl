package ch.frankel.kotlindsl

import com.vaadin.server.*
import com.vaadin.ui.*

class KotlinUI : UI() {

    override fun init(request: VaadinRequest) {
        theme = "valo"
    }
}