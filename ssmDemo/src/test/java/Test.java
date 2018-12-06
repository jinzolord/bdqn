import cn.tcbd.entity.Grade;
import cn.tcbd.entity.Student;
import cn.tcbd.entity.User;
import cn.tcbd.service.GradeService;
import cn.tcbd.service.StudentService;
import cn.tcbd.service.UserService;
import com.github.pagehelper.PageInfo;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Test {

    @Autowired
    private GradeService gradeService;

    @org.junit.Test
    public void gradeTest() {
        PageInfo<Grade> pageInfo = gradeService.getGrade(2, 5);
        System.out.println(pageInfo);
        List<Grade> list = pageInfo.getList();
        for (Grade grade : list) {
            System.out.println(grade);
        }
    }

    @org.junit.Test
    public void userTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService) context.getBean("userService");

        User user = service.login("admin", "abc");
        System.out.println(user);

    }

    @Autowired
    private StudentService studentService;

    @org.junit.Test
    public void testGradeStudent() {
        Grade grade = gradeService.getDetail(90);
        System.out.println(grade);

        PageInfo<Student> student = studentService.getStudentByGradeId(90, 1, 5);
        for (Student student1 : student.getList()) {
            System.out.println(student1);
        }
    }


    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }
}
