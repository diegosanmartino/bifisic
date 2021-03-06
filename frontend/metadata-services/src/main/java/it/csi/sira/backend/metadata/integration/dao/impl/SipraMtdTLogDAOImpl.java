/*
 * Created on 25 nov 2016 ( Time 10:35:37 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import it.csi.sira.backend.metadata.integration.dto.SipraMtdTLog;
import it.csi.sira.backend.metadata.integration.dao.SipraMtdTLogDAO;
import it.csi.sira.backend.metadata.utils.GenericDAO;
import org.springframework.jdbc.core.RowMapper;
import java.util.Date;

/**
 * SipraMtdTLog DAO implementation 
 * 
 * @author Telosys Tools
 *
 */
public class SipraMtdTLogDAOImpl extends GenericDAO<SipraMtdTLog> implements SipraMtdTLogDAO {
	//----------------------------------------------------------------------
	/**
	 * DAO constructor
	 */
	public SipraMtdTLogDAOImpl() {
		super();
	}

	private final static String QUERY_PRIMARY_KEY = 
		"select * from sipra_mtd_t_log where id_log = :id_log";
	
	private final static String QUERY_INSERT = 
		"insert into sipra_mtd_t_log(id_log,des_log,data_log) values(:id_log,:des_log,:data_log)";

	private final static String QUERY_UPDATE = 
		"update sipra_mtd_t_log set des_log = :des_log, data_log = :data_log  where id_log = :id_log";

	private final static String QUERY_DELETE = 
		"delete from sipra_mtd_t_log where  id_log = :id_log";

	private final static String SQL_COUNT_ALL = 
		"select count(*) from sipra_mtd_t_log";
	
	@Override
	public String getPrimaryKeySelect() {
		return QUERY_PRIMARY_KEY;		
	}
	
	@Override
	public String getTableName(){
		return "sipra_mtd_t_log";
	}

	@Override
	public String getSqlSelect() {
		return "select * from sipra_mtd_t_log";
	}

	@Override
	public String getSqlInsert() {
		return QUERY_INSERT;
	}

	@Override
	public String getSqlUpdate() {
		return QUERY_UPDATE;
	}

	@Override
	public String getSqlDelete() {
		return QUERY_DELETE;
	}

	@Override
	public String getSqlCount() {
		return SQL_COUNT_ALL;
	}

	public SipraMtdTLog findByPK(Integer idLog) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_log", idLog);
		return super.findByPK(map);		
	}

	public int deleteByPK(Integer idLog) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_log", idLog);
		return super.delete(getSqlDelete(), map);		
	}

	@Override
	public java.util.Map<String, Object> getValuesForInsert(SipraMtdTLog sipraMtdTLog) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_log", sipraMtdTLog.getIdLog());
		map.put("des_log", sipraMtdTLog.getDesLog());
		map.put("data_log", sipraMtdTLog.getDataLog());
		return map;
	}

	@Override
	public java.util.Map<String, Object> getValuesForUpdate(SipraMtdTLog sipraMtdTLog) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("des_log", sipraMtdTLog.getDesLog());
		map.put("data_log", sipraMtdTLog.getDataLog());
		map.put("id_log", sipraMtdTLog.getIdLog());
		return map;
	}

	public java.util.Map<String, Object> getValuesForPrimaryKey(SipraMtdTLog sipraMtdTLog) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_log", sipraMtdTLog.getIdLog());
		return map;
	}

	@Override
	public java.util.Map<String, Object> getValuesForDelete(SipraMtdTLog sipraMtdTLog) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_log", sipraMtdTLog.getIdLog());
		return map;
	}

	@Override
	public RowMapper<SipraMtdTLog> getRowMapper()  {
		//--- RowMapper to populate a new bean instance
		//return new SipraMtdTLogRowMapper( new SipraMtdTLog() ) ;

       return new SipraMtdTLogRowMapper() ;
	}

	//----------------------------------------------------------------------
	/**
	 * Populates the given bean with the data retrieved from the given ResultSet
	 * @param rs
	 * @param sipraMtdTLog
	 * @throws SQLException
	 */
	private static void populateBean(ResultSet rs, SipraMtdTLog sipraMtdTLog) throws SQLException {

		//--- Set data from ResultSet to Bean attributes
		sipraMtdTLog.setIdLog(rs.getInt("id_log")); // java.lang.Integer
		if ( rs.wasNull() ) { sipraMtdTLog.setIdLog(null); }; // not primitive number => keep null value if any
		sipraMtdTLog.setDesLog(rs.getString("des_log")); // java.lang.String
		sipraMtdTLog.setDataLog(rs.getDate("data_log")); // java.util.Date
	}


	/**
	 * Specific inner class for 'RowMapper' implementation
	 */
	public static class SipraMtdTLogRowMapper implements RowMapper<SipraMtdTLog> {
	
		public SipraMtdTLogRowMapper() {
			
		}
		
		public SipraMtdTLog mapRow(ResultSet rs, int rowNum) throws SQLException {
			SipraMtdTLog bean = new SipraMtdTLog();
			populateBean(rs, bean);
			return bean;
		}
	}
}
