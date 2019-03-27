package com.db.sys.service;

import java.util.List;
import java.util.Map;

public interface SysLogService {
	List<Map<String,Object>> findLogs();
}
