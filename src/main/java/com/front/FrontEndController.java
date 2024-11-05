package com.front;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="crud")
@CrossOrigin("http://localhost:4200") //crossorigin("*")
public class FrontEndController {
	
	@Autowired
	FrontEndService fs;
	
	@PostMapping(value="/postvalue")
	public FrontEndEntity postvalue(@RequestBody FrontEndEntity a) {
		return fs.postvalue(a);
	}
	
	@GetMapping(value="/getvalue")
	public List<FrontEndEntity> getvalue() {
		return fs.getvalue();
	}
	
	@GetMapping(value="/getid/{a}") 
	public FrontEndEntity getid(@PathVariable int a) {
		return fs.getid(a);
	}
	
	@PutMapping(value="/putvalue/{a}") 
	public FrontEndEntity putvalue(@PathVariable int a,@RequestBody FrontEndEntity b) {
		return fs.putvalue(a,b);
	}
	
	@DeleteMapping(value="/deletevalue/{a}")
	public FrontEndEntity deletevalue(@PathVariable int a) {
		return fs.deletevalue(a);
	}

}
