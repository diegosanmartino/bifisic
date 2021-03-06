/*
 * Created on 18 nov 2016 ( Time 17:08:43 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dao;

import it.csi.sira.backend.metadata.integration.dto.MtdTMetadato;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;


import java.util.Date;


/**
 * MtdTMetadato DAO interface
 * 
 * @author Telosys Tools
 */
public interface MtdTMetadatoDAO {

	//----------------------------------------------------------------------
	/**
	 * Finds a bean by its primary key 
	 * @param idMetadato
	 * @return the bean found or null if not found 
	 */
	public MtdTMetadato findByPK(Integer idMetadato);

	public List<MtdTMetadato> findAll();
	
	public List<MtdTMetadato> findByCriteria(java.util.Map<String, Object> params);
	public List<MtdTMetadato> findByCriteria(MapSqlParameterSource params);
	
	public <V> List<V> findByGenericCriteria(String query, RowMapper<V>  rowMapper, Map<String, Object> params);
	public <V> List<V> findByGenericCriteria(String query, RowMapper<V>  rowMapper, MapSqlParameterSource params);
	public List<MtdTMetadato> findByGenericCriteria(String query, MapSqlParameterSource params);
	
	public void insert(MtdTMetadato bean);

	public void update(MtdTMetadato bean);
	
	public void update(String sql, Map<String, Object> param);

	public int deleteByPK(Integer idMetadato);
	
	public int delete(String query, Map<String, Object> params);
	public int delete(String query, MapSqlParameterSource params);

	public boolean exist(Map<String, Object> params);

    public RowMapper<MtdTMetadato> getRowMapper();
}
