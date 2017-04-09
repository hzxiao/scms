package server.db;

import com.scms.entity.Teacher;
import com.scms.entity.User;
import com.scms.system.service.UserService;
import com.scms.teacher.service.TeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hz on 17-3-24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mvc.xml"})
public class TestTeacher {

    @Resource(name = "teacherServiceImpl")
    TeacherService service;


    @Test
    public void TestInsert() {

    }

    @Test
    public void TestSelectAll(){
        List<Teacher> all = service.findAll();
        assert all != null;

        System.out.println("size: " + all.size());
        for (int i = 0; i < all.size(); i++) {

        }
    }

    @Test
    public void TestSelectByDept(){
        List<Teacher> all = service.findByDept("11");
        assert all != null;

        System.out.println("size: " + all.size());
    }

    @Test
    public void TestSelectSinceId(){
        List<Teacher> all = service.findSinceID(1L);
        assert all != null;

        System.out.println("size: " + all.size());
    }


}
