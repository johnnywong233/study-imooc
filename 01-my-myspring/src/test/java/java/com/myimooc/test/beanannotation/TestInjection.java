package java.com.myimooc.test.beanannotation;

import com.myimooc.spring.beanannotation.multibean.BeanInvoker;
import com.myimooc.spring.ioc.injection.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.com.myimooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {

    public TestInjection() {
        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void testAutowired() {
        InjectionService service = super.getBean("injectionServiceImpl");
        service.save("This is autowired.");
    }

    @Test
    public void testMultiBean() {
        BeanInvoker invoker = super.getBean("beanInvoker");
        invoker.say();
    }

}
