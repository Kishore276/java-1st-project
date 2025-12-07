package test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ ConcateTest.class, MultiplyTest.class })
public class AllTests {

}
