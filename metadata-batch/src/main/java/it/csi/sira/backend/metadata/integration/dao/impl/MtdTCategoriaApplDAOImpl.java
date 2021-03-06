/*
 * Created on 18 nov 2016 ( Time 17:08:43 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import it.csi.sira.backend.metadata.integration.dto.MtdTCategoriaAppl;
import it.csi.sira.backend.metadata.integration.dao.MtdTCategoriaApplDAO;
import it.csi.sira.backend.metadata.utils.GenericDAO;
import org.springframework.jdbc.core.RowMapper;

/**
 * MtdTCategoriaAppl DAO implementation 
 * 
 * @author Telosys Tools
 *
 */
public class MtdTCategoriaApplDAOImpl extends GenericDAO<MtdTCategoriaAppl> implements MtdTCategoriaApplDAO {
	//----------------------------------------------------------------------
	/**
	 * DAO constructor
	 */
	public MtdTCategoriaApplDAOImpl() {
		super();
	}

	private final static String QUERY_PRIMARY_KEY = 
		"select * from bifisic_mtd_t_category_appl where id_category_appl = :id_category_appl";
	
	private final static String QUERY_INSERT = 
		"insert into bifisic_mtd_t_category_appl(id_category_appl,fk_parent,level,des_category,url_icon,object_number,view_number) values(:id_category_appl,:fk_parent,:level,:des_category,:url_icon,:object_number,:view_number)";

	private final static String QUERY_UPDATE = 
		"update bifisic_mtd_t_category_appl set fk_parent = :fk_parent, level = :level, des_category = :des_category, url_icon = :url_icon, object_number = :object_number, view_number = :view_number  where id_category_appl = :id_category_appl";

	private final static String QUERY_DELETE = 
		"delete from bifisic_mtd_t_category_appl where  id_category_appl = :id_category_appl";

	private final static String SQL_COUNT_ALL = 
		"select count(*) from bifisic_mtd_t_category_appl";
	
	@Override
	public String getPrimaryKeySelect() {
		return QUERY_PRIMARY_KEY;		
	}
	
	@Override
	public String getTableName(){
		return "bifisic_mtd_t_category_appl";
	}

	@Override
	public String getSqlSelect() {
		return "select * from bifisic_mtd_t_category_appl";
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

	public MtdTCategoriaAppl findByPK(Integer idCategoriaAppl) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_category_appl", idCategoriaAppl);
		return super.findByPK(map);		
	}

	public int deleteByPK(Integer idCategoriaAppl) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_category_appl", idCategoriaAppl);
		return super.delete(getSqlDelete(), map);		
	}

	@Override
	public java.util.Map<String, Object> getValuesForInsert(MtdTCategoriaAppl MtdTCategoriaAppl) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_category_appl", MtdTCategoriaAppl.getIdCategoriaAppl());
		map.put("fk_parent", MtdTCategoriaAppl.getFkPadre());
		map.put("level", MtdTCategoriaAppl.getLivello());
		map.put("des_category", MtdTCategoriaAppl.getDesCategoria());
		map.put("url_icon", MtdTCategoriaAppl.getUrlIcona());
		map.put("object_number", MtdTCategoriaAppl.getObjectNumber());
		map.put("view_number", MtdTCategoriaAppl.getViewNumber());
		return map;
	}

	@Override
	public java.util.Map<String, Object> getValuesForUpdate(MtdTCategoriaAppl MtdTCategoriaAppl) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("fk_parent", MtdTCategoriaAppl.getFkPadre());
		map.put("level", MtdTCategoriaAppl.getLivello());
		map.put("des_category", MtdTCategoriaAppl.getDesCategoria());
		map.put("url_icon", MtdTCategoriaAppl.getUrlIcona());
		map.put("object_number", MtdTCategoriaAppl.getObjectNumber());
		map.put("view_number", MtdTCategoriaAppl.getViewNumber());
		map.put("id_category_appl", MtdTCategoriaAppl.getIdCategoriaAppl());
		return map;
	}

	public java.util.Map<String, Object> getValuesForPrimaryKey(MtdTCategoriaAppl MtdTCategoriaAppl) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_category_appl", MtdTCategoriaAppl.getIdCategoriaAppl());
		return map;
	}

	@Override
	public java.util.Map<String, Object> getValuesForDelete(MtdTCategoriaAppl MtdTCategoriaAppl) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_category_appl", MtdTCategoriaAppl.getIdCategoriaAppl());
		return map;
	}

	@Override
	public RowMapper<MtdTCategoriaAppl> getRowMapper()  {
		//--- RowMapper to populate a new bean instance
		//return new MtdTCategoriaApplRowMapper( new MtdTCategoriaAppl() ) ;

       return new MtdTCategoriaApplRowMapper() ;
	}

	//----------------------------------------------------------------------
	/**
	 * Populates the given bean with the data retrieved from the given ResultSet
	 * @param rs
	 * @param MtdTCategoriaAppl
	 * @throws SQLException
	 */
	private static void populateBean(ResultSet rs, MtdTCategoriaAppl MtdTCategoriaAppl) throws SQLException {

		//--- Set data from ResultSet to Bean attributes
		MtdTCategoriaAppl.setIdCategoriaAppl(rs.getInt("id_category_appl")); // java.lang.Integer
		if ( rs.wasNull() ) { MtdTCategoriaAppl.setIdCategoriaAppl(null); }; // not primitive number => keep null value if any
		MtdTCategoriaAppl.setFkPadre(rs.getInt("fk_parent")); // java.lang.Integer
		if ( rs.wasNull() ) { MtdTCategoriaAppl.setFkPadre(null); }; // not primitive number => keep null value if any
		MtdTCategoriaAppl.setLivello(rs.getInt("level")); // java.lang.Integer
		if ( rs.wasNull() ) { MtdTCategoriaAppl.setLivello(null); }; // not primitive number => keep null value if any
		MtdTCategoriaAppl.setDesCategoria(rs.getString("des_category")); // java.lang.String
		MtdTCategoriaAppl.setUrlIcona(rs.getString("url_icon")); // java.lang.String
		MtdTCategoriaAppl.setObjectNumber(rs.getInt("object_number")); // java.lang.Integer
		if ( rs.wasNull() ) { MtdTCategoriaAppl.setObjectNumber(null); }; // not primitive number => keep null value if any
		MtdTCategoriaAppl.setViewNumber(rs.getInt("view_number")); // java.lang.Integer
		if ( rs.wasNull() ) { MtdTCategoriaAppl.setViewNumber(null); }; // not primitive number => keep null value if any
	}


	/**
	 * Specific inner class for 'RowMapper' implementation
	 */
	public static class MtdTCategoriaApplRowMapper implements RowMapper<MtdTCategoriaAppl> {
	
		public MtdTCategoriaApplRowMapper() {
			
		}
		
		public MtdTCategoriaAppl mapRow(ResultSet rs, int rowNum) throws SQLException {
			MtdTCategoriaAppl bean = new MtdTCategoriaAppl();
			populateBean(rs, bean);
			return bean;
		}
	}
}
