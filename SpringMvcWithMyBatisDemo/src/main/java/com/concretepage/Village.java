package com.concretepage;

public class Village {
	private Integer id;
	private String name;
	private String district;

	public Integer getId() {
		return id;
	}

	public void setVid(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "Village [vid=" + id + ", villageName=" + name + ", district=" + district + "]";
	}

}