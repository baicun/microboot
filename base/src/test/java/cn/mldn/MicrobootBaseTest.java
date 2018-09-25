package cn.mldn;

import cn.mldn.controller.BaseController;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * Created by super on 2018/9/19.
 */
@SpringBootTest(classes = BaseController.class)
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class MicrobootBaseTest {
    @Resource
    private BaseController baseController;

    @Test
    public void testWorld() {
        TestCase.assertEquals(this.baseController.base(),"peace World");
    }
}
