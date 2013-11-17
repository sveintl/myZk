package no.webstep.converter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * User: stlandsverk
 * Date: 15.11.13
 * Time: 12:36
 */
public abstract class AbstractListConverter<T, V> implements ListConverter<T, V> {

    @Override
    public List<V> convertListTo(Collection<T> sourceList) {
        List<V> results = new ArrayList<V>();

        for (T item : sourceList) {
            results.add(convertTo(item));
        }

        return results;
    }

    @Override
    public List<T> convertListFrom(Collection<V> sourceList) {
        List<T> results = new ArrayList<T>();

        for (V item : sourceList) {
            results.add(convertFrom(item));
        }

        return results;
    }
}
