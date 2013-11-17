package no.webstep.service;

import no.webstep.converter.DealerConverter;
import no.webstep.domain.Dealer;
import no.webstep.orm.repository.DealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: stlandsverk
 * Date: 15.11.13
 * Time: 08:39
 */
@Service
@Repository
public class DealerService {

    @Autowired
    private DealerRepository dealerRepository;

    @Autowired
    private DealerConverter converter;

    @Transactional(readOnly = true)
    public List<Dealer> findAll() {
        return converter.convertListTo(dealerRepository.findAll());
    }

    public void setDealerRepository(DealerRepository dealerRepository) {
        this.dealerRepository = dealerRepository;
    }

    public void setConverter(DealerConverter converter) {
        this.converter = converter;
    }
}
