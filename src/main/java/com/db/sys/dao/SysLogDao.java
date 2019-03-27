package com.db.sys.dao;

import java.util.List;
import java.util.Map;

public interface SysLogDao {
	List<Map<String,Object>> findLogs();
}
