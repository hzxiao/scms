package server.db;

import com.scms.entity.User;
import com.scms.system.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by hz on 17-3-23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mvc.xml"})
public class TestUser {

    @Resource(name = "userServiceImpl")
    UserService userService;


    @Test
    public void TestInsert() {
        User user = userService.checkByPassword("hz", "hh");
        System.out.println(user.getUsername());
    }
}
