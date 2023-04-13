import com.mark.Dal.UserDao;
import com.mark.Service.UserService.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//让测试运行于Spring测试环境
@ContextConfiguration(locations = "classpath:applicationContext.xml")//设置Spring配置文件或者配置类
public class SpringTest {

    @Autowired
    public UserDao usDao;

    @Autowired
    public UserService userService;

    @Test
    public void Test1()
    {
        System.out.println(usDao.selectUserAll());
        System.out.println(userService.selectUserAll());
    }
}
