package no.webstep.converter;

import org.dozer.Mapper;
import org.springframework.util.Assert;

/**
 * User: stlandsverk
 * Date: 15.11.13
 * Time: 12:38
 */
public abstract class AbstractMapperListConverter<T, V> extends AbstractListConverter<T, V> {
    private final Mapper mapper;
    private final Class<T> tClazz;
    private final Class<V> vClazz;

    public AbstractMapperListConverter(Mapper mapper,
                                       Class<T> tClazz, Class<V> vClazz) {
        this.mapper = mapper;
        this.tClazz = tClazz;
        this.vClazz = vClazz;
    }

    @Override
    public V convertTo(T source) {
        Assert.notNull(source, "Source must not be null.");

        return mapper.map(source, vClazz);
    }

    @Override
    public T convertFrom(V source) {
        Assert.notNull(source, "Source must not be null.");

        return mapper.map(source, tClazz);
    }
}
