package no.webstep.converter;

/**
 * User: stlandsverk
 * Date: 15.11.13
 * Time: 12:12
 */

/**
 *
 * @param <T> Domain model bean
 * @param <V> Business model bean
 */
public interface Converter<T, V> {

    /**
     * Converts from a domain model to the business model.
     */
    public V convertTo(T source);

    /**
     * Converts from a business model to the domain model.
     */
    public T convertFrom(V source);
}
