package no.webstep.service;

import no.webstep.orm.repository.DealerRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * User: stlandsverk
 * Date: 15.11.13
 * Time: 08:50
 */
@RunWith(MockitoJUnitRunner.class)
public class DealerServiceTest {

    private DealerService dealerService;

    @Mock
    private DealerRepository dealerRepository;

    @Before
    public void setUp() {
        dealerService = new DealerService();
        dealerService.setDealerRepository(dealerRepository);
    }

    @Test
    public void testFindAllToRepository() {
        dealerService.findAll();
        verify(dealerRepository, times(1)).findAll();
    }


}
