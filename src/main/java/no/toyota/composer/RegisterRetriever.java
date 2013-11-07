package no.toyota.composer;

import no.toyota.domain.User;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: larserb
 * Date: 11/7/13
 * Time: 1:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class RegisterRetriever extends SelectorComposer<Window>{

    @Wire
    private Textbox username;

    @Wire
    private Textbox password;

    @Wire
    private Intbox age;

    @Wire
    private Intbox phoneNo;

    @Wire
    private Datebox birthday;

    @Wire
    private Textbox address;

    @Wire
    private Intbox postalCode;

    @Wire
    private Textbox email;

    @Listen("onClick=#submitButton")
    public void submit(Event event) throws IOException {
        User user = new User();
        user.setUsername(username.getValue());
        user.setPassword(password.getValue());
        user.setAddress(address.getValue());
        user.setAge(age.getValue());
        user.setBirthday(birthday.getValue());
        user.setEmail(email.getValue());
        user.setPhoneNo(phoneNo.getValue());
        user.setPostalCode(postalCode.getValue());
        Sessions.getCurrent().setAttribute("registeredUser", user);
        Executions.sendRedirect("confirm_registration.zul");
    }


}
