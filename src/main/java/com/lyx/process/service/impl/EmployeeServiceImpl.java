package com.lyx.process.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyx.entity.Employee;
import com.lyx.process.mapper.EmployeeMapper;
import com.lyx.process.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service("employeeServiceImpl")
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService
{
}