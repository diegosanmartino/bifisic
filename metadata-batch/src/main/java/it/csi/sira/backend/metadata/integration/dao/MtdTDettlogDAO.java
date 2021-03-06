/*
 * Created on 18 nov 2016 ( Time 17:08:43 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dao;

import it.csi.sira.backend.metadata.integration.dto.MtdTDettlog;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;




/**
 * MtdTDettlog DAO interface
 * 
 * @author Telosys Tools
 */
public interface MtdTDettlogDAO {

	//----------------------------------------------------------------------
	/**
	 * Finds a bean by its primary key 
	 * @param idDettLog
	 * @return the bean found or null if not found 
	 */
	public MtdTDettlog findByPK(Integer idDettLog);

	public List<MtdTDettlog> findAll();
	
	public List<MtdTDettlog> findByCriteria(java.util.Map<String, Object> params);
	public List<MtdTDettlog> findByCriteria(MapSqlParameterSource params);
	
	public <V> List<V> findByGenericCriteria(String query, RowMapper<V>  rowMapper, Map<String, Object> params);
	public <V> List<V> findByGenericCriteria(String query, RowMapper<V>  rowMapper, MapSqlParameterSource params);
	public List<MtdTDettlog> findByGenericCriteria(String query, MapSqlParameterSource params);
	
	public void insert(MtdTDettlog bean);

	public void update(MtdTDettlog bean);
	
	public void update(String sql, Map<String, Object> param);

	public int deleteByPK(Integer idDettLog);
	
	public int delete(String query, Map<String, Object> params);
	public int delete(String query, MapSqlParameterSource params);

	public boolean exist(Map<String, Object> params);

    public RowMapper<MtdTDettlog> getRowMapper();
}
