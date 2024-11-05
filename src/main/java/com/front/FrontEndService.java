package com.front;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class FrontEndService {
	
	@Autowired
	FrontEndDAO fd;
	
	public FrontEndEntity postvalue(FrontEndEntity a) {
		return fd.postvalue(a);
	}
	
	public List<FrontEndEntity> getvalue() {
		return fd.getvalue();
	}
	
	public FrontEndEntity getid(int a) {
		return fd.getid(a);
	}
	
	public FrontEndEntity putvalue(int a,FrontEndEntity b) {
		return fd.putvalue(a,b);
	}
	
	public FrontEndEntity deletevalue(int a) {
		return fd.deletevalue(a);
	}

}
