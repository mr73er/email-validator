package email_validator_ui.email_validator_ui;
import javax.servlet.annotation.WebServlet;
import com.vaadin.*;
import com.vaadin.event.ShortcutAction;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.themes.ValoTheme;

public class emailValidatorUI {
Button check = new Button("Check");
TextField email = new TextField("Email");

public emailValidatorUI() {
    configureComponents();
    buildLayout();
}

private void configureComponents() {
    /*
     * Highlight primary actions.
     *
     * With Vaadin built-in styles you can highlight the primary save button
     * and give it a keyboard shortcut for a better UX.
     */
    check.setStyleName(ValoTheme.BUTTON_PRIMARY);
    check.setClickShortcut(ShortcutAction.KeyCode.ENTER);
    setVisible(false);
}

private void buildLayout() {
    setSizeUndefined();
    setMargin(true);

    HorizontalLayout actions = new HorizontalLayout(check);
    actions.setSpacing(true);

    addComponents(actions, email);
}

}
