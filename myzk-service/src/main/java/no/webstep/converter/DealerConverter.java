package no.webstep.converter;

import no.webstep.domain.Dealer;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * User: stlandsverk
 * Date: 15.11.13
 * Time: 12:30
 */
@Component
public class DealerConverter extends AbstractMapperListConverter<no.webstep.orm.entity.Dealer, Dealer>{

    @Autowired
    public DealerConverter(Mapper mapper) {
        super(mapper, no.webstep.orm.entity.Dealer.class, Dealer.class);
    }
}
