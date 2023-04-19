package com.example.demo.mybatisplusTest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.demo.mybatisplus.mapper.TblEmployeeMapper;
import com.example.demo.mybatisplus.pojo.TblEmployee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisPlusTest {



	@Autowired
	private TblEmployeeMapper employeeMapper;

	@Test
	void contextLoads() {
		List<TblEmployee> employees = employeeMapper.selectList(null);
		employees.forEach(System.out::println);

		TblEmployee employee = new TblEmployee();
	}


	@Test
	void testSelectById() {
		TblEmployee employee = employeeMapper.selectById(1);
		System.out.println(employee);
	}


	@Test
	void testSelectByMap() {
		Map<String, Object> map = new HashMap<>();
		map.put("gender",0);
		map.put("age",25);
		List<TblEmployee> employees = employeeMapper.selectByMap(map);
		employees.forEach(System.out::println);
	}


	@Test
	void testSelectBatchIds() {
		List<TblEmployee> employees = employeeMapper.selectBatchIds(Arrays.asList(1, 2, 3));
		employees.forEach(System.out::println);
	}

	@Test
	void testDeleteById() {
		int result = employeeMapper.deleteById(1);
		System.out.println(result);
	}


	@Test
	void testDeleteByMap() {
		Map<String, Object> map = new HashMap<>();
		map.put("gender", 0);
		map.put("age", 25);
		int result = employeeMapper.deleteByMap(map);
		System.out.println(result);
	}


	@Test
	void testDeleteBatchIds() {
		int result = employeeMapper.deleteBatchIds(Arrays.asList(4, 5, 6));
		System.out.println(result);
	}

	@Test
	void testSelectList1() {
		QueryWrapper<TblEmployee> queryWrapper = new QueryWrapper<>();
		queryWrapper
				.like("last_name","B")
				.eq("gender",1)
				.gt("age",24);
		List<TblEmployee> employees = employeeMapper.selectList(queryWrapper);
		employees.forEach(System.out::println);
	}

	@Test
	void testSelectList2() {
		List<TblEmployee> employees = employeeMapper.selectList(null);
		employees.forEach(System.out::println);
	}


	@Test
	void testSelectList3() {
		QueryWrapper<TblEmployee> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("gender", 1);
		Integer count = employeeMapper.selectCount(queryWrapper);
		System.out.println(count);
	}

	@Test
	void testUpdate() {
		UpdateWrapper<TblEmployee> updateWrapper = new UpdateWrapper<>();
		updateWrapper
				.eq("gender", 1)
				.gt("age", 25)
		;
		TblEmployee employee = new TblEmployee();
		employee.setGender("0");
		employeeMapper.update(employee, updateWrapper);
	}

	@Test
	void testDelete() {
		QueryWrapper<TblEmployee> queryWrapper = new QueryWrapper<>();
		queryWrapper.like("last_name", "Tom");
		int result = employeeMapper.delete(queryWrapper);
		System.out.println(result);


	}



	@Test
	void testInsert() {
		int result = employeeMapper.insert(new TblEmployee(null, "zhangsan", "zhangsan@qq.com", "0", 25));
		System.out.println("result:" + result);
	}


	@Test
	void testUpdateById() {
		// 先查询
		TblEmployee employee = employeeMapper.selectById(1);
		employee.setLastName("Jennie");
		// 再修改
		int result = employeeMapper.updateById(employee);
		System.out.println(result);
	}


}
