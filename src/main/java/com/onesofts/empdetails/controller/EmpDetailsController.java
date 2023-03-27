package com.onesofts.empdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onesofts.empdetails.entity.EmpDetails;
import com.onesofts.empdetails.service.EmpDetailsService;

@RestController
public class EmpDetailsController {
@Autowired

EmpDetailsService s;
@PostMapping(value="/add")
public String getList(@RequestBody List<EmpDetails> e) {
	return s.getList(e);
}
@GetMapping(value="/getlist")
public List<EmpDetails> getAll() {
	return s.getAll();
}
@GetMapping(value="/getfemale") 
public List<EmpDetails> getDetails() {
		return s.getDetails();
	}
@GetMapping(value="/getmale") 
public List<EmpDetails> getDetailsMale() {
		return s.getDetailsMale();
}
@GetMapping(value="/getname") 
public List<String> getName() {
	return s.getName();
}
@GetMapping(value="/getnamelist/{name}")
public List<EmpDetails> getNameList(@PathVariable String name) {
	return s.getNameList(name);
}
@GetMapping(value="/findage/{age}")
public List<EmpDetails> getAge(@PathVariable int age) {
	return s.getAge(age);
}
@GetMapping(value="/findsalary/{salary}")
public List<EmpDetails> findSalaryDetails(@PathVariable int salary) {
	return s.findSalaryDetails(salary);
}
@PutMapping(value="/addlist") 
public String addList(@RequestBody List<EmpDetails> e) {
return s.addList(e);
}
@GetMapping(value="/twosalary/{salary1}/{salary2}")
public List<EmpDetails> findTwoSalary(@PathVariable int salary1,@PathVariable int salary2) {
	return s.findTwoSalary(salary1,salary2);
	
	
	
}
@GetMapping(value="/finddifferent/{name}")
public List<Integer> findName(@PathVariable String name) {
	return s.findName(name);
	
}
@GetMapping(value="/getnamealllist/{salary}")
public List<String> findSalary(@PathVariable int salary) {
	return s.findSalary(salary);
}

}
