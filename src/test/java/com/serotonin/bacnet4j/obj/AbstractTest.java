package com.serotonin.bacnet4j.obj;

import org.junit.After;
import org.junit.Before;

import com.serotonin.bacnet4j.LocalDevice;
import com.serotonin.bacnet4j.RemoteDevice;
import com.serotonin.bacnet4j.npdu.test.TestNetwork;
import com.serotonin.bacnet4j.transport.DefaultTransport;

abstract public class AbstractTest {
    LocalDevice d1;
    LocalDevice d2;
    RemoteDevice rd1;
    RemoteDevice rd2;

    @Before
    public void abstractBefore() throws Exception {
        d1 = new LocalDevice(1, new DefaultTransport(new TestNetwork(1, 10)));
        d1.initialize();

        d2 = new LocalDevice(2, new DefaultTransport(new TestNetwork(2, 20)));
        d2.initialize();

        // Announce d1 to d2.
        d1.sendGlobalBroadcast(d1.getIAm());
        d2.sendGlobalBroadcast(d2.getIAm());

        // Wait a bit
        Thread.sleep(300);

        // Get d1 as a remote object.
        rd1 = d2.getRemoteDevice(1).get();
        rd2 = d1.getRemoteDevice(2).get();

        before();
    }

    abstract public void before() throws Exception;

    @After
    public void abstractAfter() {
        // Shut down
        d1.terminate();
        d2.terminate();
    }
}
