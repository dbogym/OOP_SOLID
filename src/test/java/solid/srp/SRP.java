package solid.srp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import solid.srp.s1.SmartPhone;

public class SRP {

    @Test
    @DisplayName("srp_test")
    void Smartphone_test() throws Exception {

        SmartPhone smartphone = new SmartPhone();

        smartphone.calling();

    }
}
