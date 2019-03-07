package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dao.UserMapper;
import com.example.demo.domain.UserVO;
import net.minidev.json.JSONUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

	@Resource
	private UserMapper userMapper;

	@Test
	public void select() throws Exception {
		UserVO userVO = new UserVO("ppp", "a123456");
		List<UserVO> list = userMapper.getBatch(userVO);
		for (UserVO u:list) {
			System.out.println("打印出来的"+u.getNickName());
		}
		//userVO.setId(2L);
//		UserVO userVO1 = userMapper.getOne(12L);
//		System.out.println("afdssssssssssssssss::::"+userVO1.getNickName());
		/*List<UserVO> list = userMapper.getBatch(userVO);
		System.out.println("打印出来的"+list);*/
//		userMapper.insert(new UserVO("ppp", "a123456"));
//		userMapper.insert(new User("bb", "b123456"));
//		userMapper.insert(new User("cc", "b123456"));

//		Assert.assertEquals(3, userMapper.getAll().size());
	}

//	@Test
//	public void testInsert() throws Exception {
//		UserVO userVO = new UserVO("vvv", "a123456");
//		UserVO userVO1 = new UserVO("uuu", "a123456");
//		UserVO userVO2 = new UserVO("ttt", "a123456");
//		List<UserVO> list = new ArrayList<>();
//		list.add(userVO);
//		list.add(userVO1);
//		list.add(userVO2);
//		userMapper.insertBatch(list);
//		userMapper.insert(new UserVO("ppp", "a123456"));
//		userMapper.insert(new User("bb", "b123456"));
//		userMapper.insert(new User("cc", "b123456"));

//		Assert.assertEquals(3, userMapper.getAll().size());
	//}

	/*@Test
	public void testQuery() throws Exception {
		List<User> users = userMapper.getAll();
		if(users==null || users.size()==0){
			System.out.println("is null");
		}else{
			System.out.println(users.toString());
		}
	}
	
	
	@Test
	public void testUpdate() throws Exception {
		User user = userMapper.getOne(6l);
		System.out.println(user.toString());
		user.setNickName("neo");
		userMapper.update(user);
		Assert.assertTrue(("neo".equals(userMapper.getOne(6l).getNickName())));
	}*/

}