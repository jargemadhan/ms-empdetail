package com.onesofts.empdetails.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.onesofts.empdetails.dao.EmpDetailsDao;
import com.onesofts.empdetails.entity.EmpDetails;

@Service
public class EmpDetailsService {
@Autowired
EmpDetailsDao d;
public String getList(List<EmpDetails> e) {
	return d.getList(e);
}
public List<EmpDetails> getAll() {
	return d.getAll();
}
public List<EmpDetails> getDetails(){
	List<EmpDetails> emps = d.getDetails();
    List<EmpDetails> femaleEmps=new ArrayList<>();
	for(EmpDetails x:emps) {
		if(x.getGender().equalsIgnoreCase("Female")) {
			femaleEmps.add(x);
		}
	}
	return femaleEmps;
	}

public List<EmpDetails> getDetailsMale(){
	List<EmpDetails> emps=d.getDetailsMale();
	return emps.stream().filter(x->x.getGender().equalsIgnoreCase("male")).collect(Collectors.toList());
}
public List<String> getName(){
	List<EmpDetails> emps=d.getName();
	return emps.stream().map(x->x.getName()).collect(Collectors.toList());
}
public List<EmpDetails> getNameList(String name) {
	List<EmpDetails> emps=d.getNameList();
	return emps.stream().filter(x->x.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
	}
public List<EmpDetails> getAge(int age) {
	List<EmpDetails> emps=d.getAge();
	return emps.stream().filter(x->x.getAge()==age).collect(Collectors.toList());
}
public List<EmpDetails> findSalaryDetails(int salary) {
	List<EmpDetails> emps=d.findSalaryDetails();
	return emps.stream().filter(x->x.getSalary()==salary).collect(Collectors.toList());
}
public String addList(List<EmpDetails> e) {
	return d.addList(e);
}
public List<EmpDetails> findTwoSalary(int salary1,int salary2) {
	List<EmpDetails> empsDetails=d.findTwoSalary();
	return empsDetails.stream().filter(x->(x.getSalary()>salary1&&x.getSalary()<salary2)).collect(Collectors.toList());
}
public List<Integer> findName(String name) {
	List<EmpDetails> emps=d.findName();
	return emps.stream().filter(x->x.getName().equalsIgnoreCase(name)).map(y->y.getSalary()).collect(Collectors.toList());
}
//public List<String> findSalary(int salary) {
//	List<EmpDetails> emps=d.findTwoSalary();
//	return emps.stream().filter(x->x.getSalary()==salary).map(y->y.getName()).collect(Collectors.toList());
//}
public List<String> findSalary(int salary) {
	List<EmpDetails> emps=d.findSalary();
	List<String> salaryEmps=new ArrayList<>();
	for(EmpDetails x:emps) {
		if(x.getSalary()==salary) {
			salaryEmps.add(x.getName());
		}
	}
	return salaryEmps;
}
}
