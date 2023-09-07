package com.nissan.model;

import com.nissan.service.IVehicle;

public class Honda implements IVehicle{

	@Override
	public String getVehicleName() {
		// TODO Auto-generated method stub
		return "Civic";
	}

	@Override
	public String getBrandName() {
		// TODO Auto-generated method stub
		return "Honda";
	}

}
