package BDD.BaseClassPackege;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    public DriverFactory driverFactory = new DriverFactory();

    @Before
    public void setUp(){
        driverFactory.openbrowser();
    }

    @After
    public void teardown(){
        driverFactory.closebrowser();
    }
}
