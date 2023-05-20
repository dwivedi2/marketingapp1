package com.marketingapp1.servic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapp1.Entity.Mark;
import com.marketingapp1.repository.Marketingapp1Repository;

@Service
public class MarkServicImpl implements MarkServic {
	
	@Autowired
	public Marketingapp1Repository  MarkRepo;

	@Override
	public void saveMark(Mark mark) {
		MarkRepo.save(mark);

	}

}
