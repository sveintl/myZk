package no.toyota.composer;

import no.toyota.domain.Dealer;
import org.zkoss.zhtml.Messagebox;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zul.Menuitem;
import org.zkoss.zul.Menupopup;

/**
 * Created with IntelliJ IDEA.
 * User: larserb
 * Date: 11/6/13
 * Time: 10:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class DealerComposer extends SelectorComposer<Menupopup>{

    @Listen("onClick=#forhandler > menuitem")
    public void submit(Event event) {
        Menuitem clicked = (Menuitem)event.getTarget();
        Dealer dealer = (Dealer)clicked.getAttribute("dealer");
        Messagebox.show("Clicked " + dealer.getName());
    }



}
