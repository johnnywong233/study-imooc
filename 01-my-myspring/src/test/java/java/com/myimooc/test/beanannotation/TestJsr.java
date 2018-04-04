package java.com.myimooc.test.beanannotation;

import com.myimooc.spring.beanannotation.jsr.JsrServie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.com.myimooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJsr extends UnitTestBase {

    public TestJsr() {
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testSave() {
        JsrServie service = getBean("jsrServie");
        service.save();
    }

}
