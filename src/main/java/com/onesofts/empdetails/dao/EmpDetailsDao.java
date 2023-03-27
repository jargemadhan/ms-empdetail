package com.onesofts.empdetails.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.onesofts.empdetails.entity.EmpDetails;
import com.onesofts.empdetails.repository.EmpDetailsRepository;

@Repository
public class EmpDetailsDao {
@Autowired
EmpDetailsRepository r;
public String getList(List<EmpDetails> e) {
	r.saveAll(e);
	return "SuccessFully SaveAll";
}
public List<EmpDetails> getAll() {
	return r.findAll();
}
public List<EmpDetails> getDetails(){
	return r.findAll();
}
public List<EmpDetails> getDetailsMale(){
	return r.findAll();
}
public List<EmpDetails> getName(){
	return r.findAll();
}
public List<EmpDetails> getNameList() {
	return r.findAll();
}
public List<EmpDetails> getAge() {
	return r.findAll();
}
public List<EmpDetails> findSalaryDetails() {
	return r.findAll();
}
public String addList(List<EmpDetails> e) {
	r.saveAll(e);
	return "Successfully saveAll";
}
public List<EmpDetails> findTwoSalary() {
	return r.findAll();
	
}
public List<EmpDetails> findName() {
	return r.findAll();
}
public List<EmpDetails> findSalary() {
	return r.findAll();
}
}
