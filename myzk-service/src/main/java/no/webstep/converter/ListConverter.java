package no.webstep.converter;

/**
 * User: stlandsverk
 * Date: 15.11.13
 * Time: 12:15
 */

import java.util.Collection;
import java.util.List;

/**
 *
 * @param <T> Domain model bean
 * @param <V> Business model bean
 */
public interface ListConverter<T, V> extends Converter<T, V> {

    /**
     * Converts from a domain model list to a business model list.
     */
    public List<V> convertListTo(Collection<T> list);

    /**
     * Converts from a business model list to a domain model list.
     */
    public List<T> convertListFrom(Collection<V> list);
}
