package no.toyota.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * User: stlandsverk
 * Date: 05.11.13
 * Time: 13:59
 */
public class DealerResolver implements org.zkoss.xel.VariableResolver {
    private static List<Dealer> dealers = new ArrayList<Dealer>();

    static {
        Dealer okern = new Dealer();
        okern.setAddress("Kabelgaten 6, 0580 Oslo");
        okern.setName("Toyota Økern");
        okern.setEmail("post.okern@toyota.no");
        okern.setLatitude(59.927173);
        okern.setLongitude(10.815783);

        Dealer oppsal = new Dealer();
        oppsal.setName("Toyota Oppsal");
        oppsal.setAddress("Østmarkveien 25, 0687 Oslo");
        oppsal.setEmail("post.oppsal@toyota.no");
        oppsal.setLatitude(59.892242);
        oppsal.setLongitude(10.851274);

        Dealer skoyen = new Dealer();
        skoyen.setName("Toyota Skøyen");
        skoyen.setAddress("Drammensveien 161, 0277 Oslo");
        skoyen.setEmail("post.skoyen@toyota.no");
        skoyen.setLatitude(59.922356);
        skoyen.setLongitude(10.676115);

        Dealer alnabru = new Dealer();
        alnabru.setName("Toyota Alnabru Skadesenter");
        alnabru.setAddress("Breivollveien 27, 0668 Oslo");
        alnabru.setEmail("skadeavdeling@oslo.toyota.no");
        alnabru.setLatitude(59.923055);
        alnabru.setLongitude(10.838935);

        dealers.add(okern);
        dealers.add(oppsal);
        dealers.add(skoyen);
        dealers.add(alnabru);
    }

    public Object resolveVariable(String name) {
        return "dealers".equals(name) ? dealers : null;
    }

}
