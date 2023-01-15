package com.concretepage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.concretepage.Village;

public interface VillageMapper {

	@Insert("INSERT into village(name,district) VALUES(#{name}, #{district})")
	public abstract void insertVillage(Village village);

	@Select("select * from village")
	public abstract List<Village> findAll();

	@Select("select * from village where id = #{id}")
	public abstract Village findById(int id);

	@Delete("delete from village where id = #{id}")
	public abstract void delete(int id);
	
	@Delete("delete from village")
	public abstract void deleteAll();
	
	
}