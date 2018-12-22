package com.wisdomschool.student.util;

import java.util.HashMap;
import java.util.Map;

public class MapInfo {
	public static Map<String, Object> getMap(String checkInfo, Boolean flg) {
		Map<String, Object> map = new HashMap<String, Object>();

		if (flg == null) {
			map.put("msg", checkInfo + "异常");
			map.put("status", 109);
		} else {
			if (flg) {
				map.put("msg", checkInfo + "成功");
				map.put("status", 200);
			} else {
				map.put("msg", checkInfo + "失败");
				map.put("status", 201);
			}
		}
		return map;
	}

	public static Map<String, Object> getMap(String objKey, Object objVal, String checkInfo, Boolean flg) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(objKey, objVal);
		if (flg == null) {
			map.put("msg", checkInfo + "异常");
			map.put("status", 199);
		} else {
			if (flg) {
				map.put("msg", checkInfo + "成功");
				map.put("status", 200);
			} else {
				map.put("msg", checkInfo + "失败");
				map.put("status", 201);
			}
		}
		return map;
	}
}
