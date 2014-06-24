package portable;

import com.hazelcast.nio.serialization.Portable;
import com.hazelcast.nio.serialization.PortableFactory;

/**
 * Created by Mustafa Orkun Acar <mustafaorkunacar@gmail.com> on 18.06.2014.
 */

public class CustomerFactory implements PortableFactory
{
    @Override
    public Portable create(int x) { return new Customer(); }
}