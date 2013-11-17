package no.toyota.model;

import no.webstep.domain.Dealer;
import no.webstep.service.DealerService;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.ListModelList;

import java.io.Serializable;
import java.util.List;

/**
 * User: stlandsverk
 * Date: 15.11.13
 * Time: 11:47
 */
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class DealerListViewModel implements Serializable {
    private static final long serialVersionUID = -3118552283609723849L;

    @WireVariable
    private DealerService dealerService;

    ListModelList<Dealer> dealerListModel;

    @Init
    public void init() {
        List<Dealer> dealerList = dealerService.findAll();
        dealerListModel = new ListModelList<Dealer>(dealerList);
    }

    public ListModelList<Dealer> getDealerListModel() {
        return dealerListModel;
    }
}
