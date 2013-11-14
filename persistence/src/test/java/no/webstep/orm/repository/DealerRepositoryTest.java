package no.webstep.orm.repository;

import org.junit.Test;
import no.webstep.orm.entity.Dealer;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * User: stlandsverk
 * Date: 14.11.13
 * Time: 21:35
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/DealerRepositoryTest-context.xml"})
@TransactionConfiguration
@Transactional
public class DealerRepositoryTest {

    final Logger logger = LoggerFactory.getLogger(DealerRepositoryTest.class);

    @Autowired
    private DealerRepository dealerRepository;

    @Test
    public void testFindOne() {
        Dealer dealer = dealerRepository.findOne(2);
        assertThat(dealer.getName(), is("Toyota Oppsal"));
    }

}
