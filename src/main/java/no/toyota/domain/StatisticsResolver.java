package no.toyota.domain;

import org.zkoss.xel.XelException;

import java.util.ArrayList;

/**
 * User: stlandsverk
 * Date: 07.11.13
 * Time: 10:51
 */
public class StatisticsResolver implements org.zkoss.xel.VariableResolver {


    @Override
    public Object resolveVariable(String s) throws XelException {
        ArrayList<Statistics> statisticses = new ArrayList<Statistics>();
        statisticses.add(new Statistics(CarType.Statsjonsvogn, 200));
        statisticses.add(new Statistics(CarType.Personbil, 350));
        statisticses.add(new Statistics(CarType.SUV, 143));
        statisticses.add(new Statistics(CarType.Sportsbil, 86));
        statisticses.add(new Statistics(CarType.Elbil, 120));


        return s.equals("statistics") ? statisticses : null;
    }
}
