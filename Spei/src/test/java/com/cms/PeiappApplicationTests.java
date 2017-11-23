package com.cms;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cms.mapper.content.IContentMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PeiappApplicationTests {
	
	@Autowired
	private IContentMapper contentMapper;

	@Test
	public void contextLoads() {
		List<HashMap<String, Object>> chart=contentMapper.charts();
		for (HashMap<String, Object> hashMap : chart) {
			System.out.println(hashMap);
		}
	}

}
