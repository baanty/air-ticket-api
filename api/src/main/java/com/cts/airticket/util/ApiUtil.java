package com.cts.airticket.util;

import com.cts.airticket.entity.AirportEntity;
import com.cts.airticket.vo.AirportVo;

public class ApiUtil {

	
	/**
	 * This utility will convert from Entity to Value objects.
	 * @param entity
	 * @return
	 */
	public static final AirportVo converFromEntityToVo(AirportEntity entity) {
		
		if (entity != null) {
			AirportVo vo = new AirportVo();
			vo.setAirportCode(entity.getAirportCode());
			vo.setAirportDescription(entity.getAirportDescription());
			vo.setAirportXCordinate(entity.getAirportXCordinate());
			vo.setAirportYCordinate(entity.getAirportYCordinate());
			return vo;
		}
		return null;
	}
}
