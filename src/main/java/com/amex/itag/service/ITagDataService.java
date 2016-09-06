package com.amex.itag.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.amex.itag.model.ITagData;

@Service
public class ITagDataService {
HashMap<String, ITagData> map = new HashMap<String, ITagData>();
	
	public ITagDataService(){
		ITagData iTagInfo = new ITagData();
		iTagInfo.setId(1);
		iTagInfo.setTaskCreated("Ram");
		iTagInfo.setTaskJson("dfdscxv");
		iTagInfo.setTaskStatus("Completed");
		map.put("1", iTagInfo);
		iTagInfo = new ITagData();
		iTagInfo.setId(2);
		iTagInfo.setTaskCreated("Ram");
		iTagInfo.setTaskJson("dfdscxv");
		iTagInfo.setTaskStatus("Completed");
		map.put("2", iTagInfo);
	}
	
	public ITagData getDetails(String id){
		if(map.containsKey(id)){
			return map.get(id);
		}else{
		return null;
		}
	}
	public HashMap<String, ITagData> getAllInfo(){
		return map;
	}
}
