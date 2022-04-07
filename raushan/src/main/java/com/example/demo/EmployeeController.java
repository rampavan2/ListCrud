package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
	List<Employe> e=new ArrayList<>();
	
//	 private List<Employe> e=Stream.of(new Employe(2,"ram","hyd"), new Employe(1,"rau","bang"))
//			.collect(Collectors.toList());
//	
	@RequestMapping("/add")
	public Employe addE(Employe emp)
	{
		e.add(emp);
		return emp;
	}
	@RequestMapping("/getemp")
	public List<Employe> showEmployee() 
	{
//		System.out.println("executed sample");
		return e;
		//return new Employe(1,"ram","hyd");
	}
	@RequestMapping("/srt")
	public List<Employe> srt()
	{
		
     	Collections.sort(e, new Comparator<Employe>() {
	        @Override
	        public int compare(Employe h1,Employe h2) {
	            return h1.getLoc().compareTo(h2.getLoc());
	        }
	    });
		return e;
	}
	
	

}
