package no.webstep.orm.repository;

import no.webstep.orm.entity.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User: stlandsverk
 * Date: 14.11.13
 * Time: 22:13
 */
public interface DealerRepository extends JpaRepository<Dealer, Integer> {
}
