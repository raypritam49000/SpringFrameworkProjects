package com.concretepage;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.concretepage.mapper.VillageMapper;

public class RunApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();

		VillageMapper mapper = ctx.getBean(VillageMapper.class);

		Village village = new Village();
		village.setName("Dhananjaypur");
		village.setDistrict("Varanasi");

		//mapper.insertVillage(village);
		System.out.println("---Data saved---");

		List<Village> villages = mapper.findAll();
		System.out.println(villages);
		
//		Village getVillage = mapper.findById(2);
//		System.out.println(getVillage);
//		
//		mapper.delete(3);
		
		//mapper.deleteAll();
	}
}