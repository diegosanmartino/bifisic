/*
 * Created on 18 nov 2016 ( Time 17:08:42 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dao;

import it.csi.sira.backend.metadata.integration.dto.MtdDTipoCategoria;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;




/**
 * MtdDTipoCategoria DAO interface
 * 
 * @author Telosys Tools
 */
public interface MtdDTipoCategoriaDAO {

	//----------------------------------------------------------------------
	/**
	 * Finds a bean by its primary key 
	 * @param idTipoCategoria
	 * @return the bean found or null if not found 
	 */
	public MtdDTipoCategoria findByPK(Integer idTipoCategoria);

	public List<MtdDTipoCategoria> findAll();
	
	public List<MtdDTipoCategoria> findByCriteria(java.util.Map<String, Object> params);
	public List<MtdDTipoCategoria> findByCriteria(MapSqlParameterSource params);
	
	public <V> List<V> findByGenericCriteria(String query, RowMapper<V>  rowMapper, Map<String, Object> params);
	public <V> List<V> findByGenericCriteria(String query, RowMapper<V>  rowMapper, MapSqlParameterSource params);
	public List<MtdDTipoCategoria> findByGenericCriteria(String query, MapSqlParameterSource params);
	
	public void insert(MtdDTipoCategoria bean);

	public void update(MtdDTipoCategoria bean);
	
	public void update(String sql, Map<String, Object> param);

	public int deleteByPK(Integer idTipoCategoria);
	
	public int delete(String query, Map<String, Object> params);
	public int delete(String query, MapSqlParameterSource params);

	public boolean exist(Map<String, Object> params);

    public RowMapper<MtdDTipoCategoria> getRowMapper();
}
