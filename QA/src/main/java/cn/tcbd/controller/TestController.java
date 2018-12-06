package cn.tcbd.controller;

import cn.tcbd.dao.CourseMapper;
import cn.tcbd.entity.*;
import cn.tcbd.service.*;
import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static cn.tcbd.Common.Comm.USER_SESSION;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("toMain")
    public String toMain(){
        return "main";
    }

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(String userName, String password, Model model, HttpSession session){
        User user = userService.login(userName, password);
        if(user!=null){
            session.setAttribute(USER_SESSION, user);
            return "welcome";
        } else {
            model.addAttribute("loginFailed", "falied");
            return "main";
        }
    }


    @Autowired
    private MenuService menuService;

    @ResponseBody
    @RequestMapping(value="/getAllMenu",produces={"application/json;charset=UTF-8"})
    public String getAllMenu(HttpSession session){
        User user = (User) session.getAttribute(USER_SESSION);
        List<TMenu> list = menuService.getAllMenu(user.getId());
        String json = JSONArray.toJSONString(list);
        return json;
    }

    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.removeAttribute(USER_SESSION);
        return "main";
    }

    @Autowired
    private GradeService gradeService;

    @RequestMapping("toPage")
    public ModelAndView toList(int pageNum){
        Map<String,Object> resultMap = new HashMap<String, Object>();
        resultMap.put("pageInfo", gradeService.getGrade(pageNum, 5));
        return new ModelAndView("gradeList", resultMap);
    }

//    @RequestMapping("showDetail")
//    public ModelAndView showDetail(int gradeId){
//        Map<String,Object> resultMap = new HashMap<String, Object>();
//        String detail = gradeService.getDetail(gradeId);
//        resultMap.put("details", detail);
//        return new ModelAndView("detail", resultMap);
//    }

    @Autowired
    private StudentService studentService;

    @RequestMapping("getStudent")
    public ModelAndView getStudent(Integer pageNum, Integer pageSize){
        pageSize = pageSize==null?5:pageSize;
        Map<String, Object> result = new HashMap<String, Object>();
        PageInfo<Student> pageInfo = studentService.getStudent(pageNum, pageSize);
        result.put("pageInfo", pageInfo);
        return new ModelAndView("student", result);
    }

    @RequestMapping("getUser")
    public ModelAndView getUser(Integer pageNum, Integer pageSize){
        pageSize = pageSize==null?5:pageSize;
        Map<String, Object> result = new HashMap<String, Object>();
        PageInfo<User> pageInfo = userService.getUser(pageNum, pageSize);
        result.put("pageInfo", pageInfo);
        return new ModelAndView("user", result);
    }

    @Autowired
    private CourseService courseService;

    @RequestMapping("getCourse")
    public ModelAndView getCourse(Integer pageNum, Integer pageSize){
        pageSize = pageSize==null?5:pageSize;
        Map<String, Object> result = new HashMap<String, Object>();
        PageInfo<Course> pageInfo = courseService.getCourse(pageNum, pageSize);
        result.put("pageInfo", pageInfo);
        return new ModelAndView("course", result);
    }

    @RequestMapping("getMenu")
    public ModelAndView getMenu(Integer pageNum, Integer pageSize){
        pageSize = pageSize==null?5:pageSize;
        Map<String, Object> result = new HashMap<String, Object>();
        PageInfo<TMenu> pageInfo = menuService.getMenu(pageNum, pageSize);
        result.put("pageInfo", pageInfo);
        return new ModelAndView("menu", result);
    }

    @RequestMapping("getGradeDetail")
    public ModelAndView getGradeDetail(Integer gradeId, Integer pageNum, Integer pageSize){
        pageSize = pageSize==null?5:pageSize;
        pageNum = pageNum==null?1:pageNum;
        Map<String, Object> result = new HashMap<String, Object>();
        Grade grade = gradeService.getDetail(gradeId);
        PageInfo<Student> pageInfo = studentService.getStudentByGradeId(gradeId, pageNum, pageSize);
        result.put("pageInfo", pageInfo);
        result.put("grade", grade);
        return new ModelAndView("gradeDetail", result);
    }

    @ResponseBody
    @RequestMapping( value = "/deleteGrade")
    public int deleteGrade(Integer gradeId){
        return gradeService.deleteGrade(gradeId);
    }
}
