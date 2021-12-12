package by.itacademy.javaenterprise.lepnikau.pojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SomePojo {
    private static final Logger LOG = LoggerFactory.getLogger(SomePojo.class);

    public String firstMethod() {
        LOG.info("The first method is called.");
        return "The first method return value.";
    }

    public String secondMethod(String str, int intNumb, double doubleNumb) {
        LOG.info("The second method is called. First argument: " + str  +", " +
                "second argument: " + intNumb + ", third argument: " + doubleNumb);
        return "The second method return value.";
    }

    public void throwExceptionMethod() throws Exception {
        LOG.info("Throw exception in SomePojo");
        throw new Exception("SomePojo Exception");
    }

}
