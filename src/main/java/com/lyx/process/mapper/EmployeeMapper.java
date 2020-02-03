package com.lyx.process.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyx.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("employeeMapper")
public interface EmployeeMapper extends BaseMapper<Employee>
{
}
