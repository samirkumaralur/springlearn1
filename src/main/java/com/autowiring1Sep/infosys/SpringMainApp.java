package com.autowiring1Sep.infosys;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();
		
		Employee employee= (Employee) context.getBean("employeeBeanAnyName");
		employee.setEmpId("72752");
		employee.setEmpName("Samir");
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		
		HydLocation hydLocation= (HydLocation) context.getBean("componenthydlocation");
		System.out.println(hydLocation.getAreaName());
		System.out.println(hydLocation.getPincode());
		
		SalaryAccount compsalaryAccount= (SalaryAccount) context.getBean("componentSalaryAccount");
		System.out.println(compsalaryAccount.getAccNumber());
		System.out.println(compsalaryAccount.getBankName());
		System.out.println(compsalaryAccount.getName());
		
		SalaryAccount beanSalaryAccount= (SalaryAccount) context.getBean("BeanSalaryAccount");
		System.out.println(beanSalaryAccount.getAccNumber());
		System.out.println(beanSalaryAccount.getBankName());
		System.out.println(beanSalaryAccount.getName());
	}

}
