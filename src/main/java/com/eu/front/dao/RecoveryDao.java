package com.eu.front.dao;

import com.eu.front.entity.Recovery;

import java.util.List;
import java.util.Map;

public interface RecoveryDao{
	/**
	 * 分页查询数据
	 */
	List<Map<String, String>> queryRecovery(Map<String, Object> data) throws Exception;

	Long queryRecoveryCount() throws Exception;

	/**
	 * 插入
	 *
	 * @param recovery
	 */
	void addRecovery(Recovery recovery) throws Exception;

	/**
	 * 通过ID删除
	 * @param id
	 */
	void deleteRecovery(String id) throws Exception;

}