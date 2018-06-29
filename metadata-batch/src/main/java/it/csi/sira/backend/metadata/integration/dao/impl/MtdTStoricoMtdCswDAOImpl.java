/*
 * Created on 18 nov 2016 ( Time 17:08:44 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import it.csi.sira.backend.metadata.integration.dto.MtdTStoricoMtdCsw;
import it.csi.sira.backend.metadata.integration.dao.MtdTStoricoMtdCswDAO;
import it.csi.sira.backend.metadata.utils.GenericDAO;
import org.springframework.jdbc.core.RowMapper;

/**
 * MtdTStoricoMtdCsw DAO implementation 
 * 
 * @author Telosys Tools
 *
 */
public class MtdTStoricoMtdCswDAOImpl extends GenericDAO<MtdTStoricoMtdCsw> implements MtdTStoricoMtdCswDAO {
	//----------------------------------------------------------------------
	/**
	 * DAO constructor
	 */
	public MtdTStoricoMtdCswDAOImpl() {
		super();
	}

	private final static String QUERY_PRIMARY_KEY = 
		"select * from bifisic_mtd_t_history_mtd_csw where id_metadata_history = :id_metadata_history";
	
	private final static String QUERY_INSERT = 
		"insert into bifisic_mtd_t_history_mtd_csw(id_metadata_history,dc_identifier,title,text_abstract,metadata_type,metadata_calc_url,bound_box_crs,bound_box_lower_corner,bound_box_upper_corner) values(:id_metadata_history,:dc_identifier,:title,:text_abstract,:metadata_type,:metadata_calc_url,:bound_box_crs,:bound_box_lower_corner,:bound_box_upper_corner)";

	private final static String QUERY_UPDATE = 
		"update bifisic_mtd_t_history_mtd_csw set dc_identifier = :dc_identifier, title = :title, text_abstract = :text_abstract, metadata_type = :metadata_type, metadata_calc_url = :metadata_calc_url, bound_box_crs = :bound_box_crs, bound_box_lower_corner = :bound_box_lower_corner, bound_box_upper_corner = :bound_box_upper_corner  where id_metadata_history = :id_metadata_history";

	private final static String QUERY_DELETE = 
		"delete from bifisic_mtd_t_history_mtd_csw where  id_metadata_history = :id_metadata_history";

	private final static String SQL_COUNT_ALL = 
		"select count(*) from bifisic_mtd_t_history_mtd_csw";
	
	@Override
	public String getPrimaryKeySelect() {
		return QUERY_PRIMARY_KEY;		
	}
	
	@Override
	public String getTableName(){
		return "bifisic_mtd_t_history_mtd_csw";
	}

	@Override
	public String getSqlSelect() {
		return "select * from bifisic_mtd_t_history_mtd_csw";
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

	public MtdTStoricoMtdCsw findByPK(Integer idStoricoMetadato) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_metadata_history", idStoricoMetadato);
		return super.findByPK(map);		
	}

	public int deleteByPK(Integer idStoricoMetadato) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_metadata_history", idStoricoMetadato);
		return super.delete(getSqlDelete(), map);		
	}

	@Override
	public java.util.Map<String, Object> getValuesForInsert(MtdTStoricoMtdCsw MtdTStoricoMtdCsw) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_metadata_history", MtdTStoricoMtdCsw.getIdStoricoMetadato());
		map.put("dc_identifier", MtdTStoricoMtdCsw.getDcIdentifier());
		map.put("title", MtdTStoricoMtdCsw.getTitolo());
		map.put("text_abstract", MtdTStoricoMtdCsw.getTestoAbstract());
		map.put("metadata_type", MtdTStoricoMtdCsw.getTipoMetadato());
		map.put("metadata_calc_url", MtdTStoricoMtdCsw.getUrlMetadatoCalc());
		map.put("bound_box_crs", MtdTStoricoMtdCsw.getBoundBoxCrs());
		map.put("bound_box_lower_corner", MtdTStoricoMtdCsw.getBoundBoxLowerCorner());
		map.put("bound_box_upper_corner", MtdTStoricoMtdCsw.getBoundBoxUpperCorner());
		return map;
	}

	@Override
	public java.util.Map<String, Object> getValuesForUpdate(MtdTStoricoMtdCsw MtdTStoricoMtdCsw) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("dc_identifier", MtdTStoricoMtdCsw.getDcIdentifier());
		map.put("title", MtdTStoricoMtdCsw.getTitolo());
		map.put("text_abstract", MtdTStoricoMtdCsw.getTestoAbstract());
		map.put("metadata_type", MtdTStoricoMtdCsw.getTipoMetadato());
		map.put("metadata_calc_url", MtdTStoricoMtdCsw.getUrlMetadatoCalc());
		map.put("bound_box_crs", MtdTStoricoMtdCsw.getBoundBoxCrs());
		map.put("bound_box_lower_corner", MtdTStoricoMtdCsw.getBoundBoxLowerCorner());
		map.put("bound_box_upper_corner", MtdTStoricoMtdCsw.getBoundBoxUpperCorner());
		map.put("id_metadata_history", MtdTStoricoMtdCsw.getIdStoricoMetadato());
		return map;
	}

	public java.util.Map<String, Object> getValuesForPrimaryKey(MtdTStoricoMtdCsw MtdTStoricoMtdCsw) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_metadata_history", MtdTStoricoMtdCsw.getIdStoricoMetadato());
		return map;
	}

	@Override
	public java.util.Map<String, Object> getValuesForDelete(MtdTStoricoMtdCsw MtdTStoricoMtdCsw) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_metadata_history", MtdTStoricoMtdCsw.getIdStoricoMetadato());
		return map;
	}

	@Override
	public RowMapper<MtdTStoricoMtdCsw> getRowMapper()  {
		//--- RowMapper to populate a new bean instance
		//return new MtdTStoricoMtdCswRowMapper( new MtdTStoricoMtdCsw() ) ;

       return new MtdTStoricoMtdCswRowMapper() ;
	}

	//----------------------------------------------------------------------
	/**
	 * Populates the given bean with the data retrieved from the given ResultSet
	 * @param rs
	 * @param MtdTStoricoMtdCsw
	 * @throws SQLException
	 */
	private static void populateBean(ResultSet rs, MtdTStoricoMtdCsw MtdTStoricoMtdCsw) throws SQLException {

		//--- Set data from ResultSet to Bean attributes
		MtdTStoricoMtdCsw.setIdStoricoMetadato(rs.getInt("id_metadata_history")); // java.lang.Integer
		if ( rs.wasNull() ) { MtdTStoricoMtdCsw.setIdStoricoMetadato(null); }; // not primitive number => keep null value if any
		MtdTStoricoMtdCsw.setDcIdentifier(rs.getString("dc_identifier")); // java.lang.String
		MtdTStoricoMtdCsw.setTitolo(rs.getString("title")); // java.lang.String
		MtdTStoricoMtdCsw.setTestoAbstract(rs.getString("text_abstract")); // java.lang.String
		MtdTStoricoMtdCsw.setTipoMetadato(rs.getString("metadata_type")); // java.lang.String
		MtdTStoricoMtdCsw.setUrlMetadatoCalc(rs.getString("metadata_calc_url")); // java.lang.String
		MtdTStoricoMtdCsw.setBoundBoxCrs(rs.getString("bound_box_crs")); // java.lang.String
		MtdTStoricoMtdCsw.setBoundBoxLowerCorner(rs.getString("bound_box_lower_corner")); // java.lang.String
		MtdTStoricoMtdCsw.setBoundBoxUpperCorner(rs.getString("bound_box_upper_corner")); // java.lang.String
	}


	/**
	 * Specific inner class for 'RowMapper' implementation
	 */
	public static class MtdTStoricoMtdCswRowMapper implements RowMapper<MtdTStoricoMtdCsw> {
	
		public MtdTStoricoMtdCswRowMapper() {
			
		}
		
		public MtdTStoricoMtdCsw mapRow(ResultSet rs, int rowNum) throws SQLException {
			MtdTStoricoMtdCsw bean = new MtdTStoricoMtdCsw();
			populateBean(rs, bean);
			return bean;
		}
	}
}