package com.front;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class FrontEndDAO {
	
	@Autowired
	FrontEndRepository fr;
	
	public FrontEndEntity postvalue(FrontEndEntity a) {
		return fr.save(a);
	}
	
	public List<FrontEndEntity> getvalue() {
		return fr.findAll();
	}
	
	public FrontEndEntity getid(int a) {
		return fr.findById(a).get();
	}
	
	public FrontEndEntity putvalue(int a,FrontEndEntity b) {
		return fr.save(b);
		
	}
	
	public FrontEndEntity deletevalue(@PathVariable int a) {
		FrontEndEntity f=fr.findById(a).get();
		fr.deleteById(f.getId());
		return f;
	}

}
