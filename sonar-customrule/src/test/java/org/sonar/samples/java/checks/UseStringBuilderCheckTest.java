package org.sonar.samples.java.checks;

import org.junit.Test;
import org.sonar.java.checks.verifier.JavaCheckVerifier;

public class UseStringBuilderCheckTest {

    @Test
    public void test() {
        UseStringBuilderCheck a =  new UseStringBuilderCheck();
        a.nodesToVisit();
        JavaCheckVerifier.verify("src/test/files/UseStringBuilderCheck.java", new UseStringBuilderCheck());
    }
}