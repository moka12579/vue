
import com.vue.Application;
import com.vue.entity.vueUser;
import com.vue.mapper.userMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)
public class testMysql {
    @Autowired
    private userMapper userMapper;
    @Test
    public void test(){
        vueUser vueUser = new vueUser();
//        List<vueUser> userList = userMapper.selectList(null);
//        System.out.println(userList);
//        vueUser.setId(userList.size() + 1);
        vueUser.setUsername("zhangsan");
        vueUser.setPassword("123456");
        userMapper.insert(vueUser);
    }

}
