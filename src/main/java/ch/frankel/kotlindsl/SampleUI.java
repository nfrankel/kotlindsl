package ch.frankel.kotlindsl;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import static com.vaadin.shared.ui.ContentMode.HTML;

public class SampleUI extends UI {

    protected void init(VaadinRequest request) {
        setTheme("valo");
        VerticalLayout layout = UIUtils.verticalLayout(this);
        Label label = new Label("<strong>Hello</strong>", HTML);
        TextField field = new TextField("world!");
        layout.addComponents(label, field);
        layout.setMargin(true);
        setContent(layout);
    }
}

class UIUtils {

    static VerticalLayout verticalLayout(UI ui) {
        VerticalLayout verticalLayout = new VerticalLayout();
        ui.setContent(verticalLayout);
        return verticalLayout;
    }
}
