package com.amex.itag.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amex.itag.model.ITagData;
import com.amex.itag.service.ITagDataService;

@RestController
@RequestMapping("/iTagInfo")
public class ITagDataController {
	@Autowired
	ITagDataService iTagDataService;

	@RequestMapping("/all")
	public HashMap<String, ITagData> getAll() {
		return iTagDataService.getAllInfo();
	}

	@RequestMapping("{id}")
	public ITagData getITagData(@PathVariable("id") String id) {
		return iTagDataService.getDetails(id);
	}
}
