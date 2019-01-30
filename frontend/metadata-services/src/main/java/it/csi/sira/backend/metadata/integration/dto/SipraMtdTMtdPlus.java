/*
 * Created on 25 nov 2016 ( Time 10:35:38 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dto;

import java.io.Serializable;


/**
 * Java bean for 'SipraMtdTMtdPlus' entity
 * 
 * @author Telosys Tools
 *
 */
public class SipraMtdTMtdPlus implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    // DB : id_metadato int4 
    private Integer idMetadato;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    // DB : object_num_dataset_calc int4 
    private Integer nrOggettiDatasetCalc;

    // DB : fk_tipo_oggetto int4 
    private Integer fkTipoOggetto;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setIdMetadato( Integer idMetadato ) {
        this.idMetadato = idMetadato ;
    }

    public Integer getIdMetadato() {
        return this.idMetadato;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setNrOggettiDatasetCalc( Integer nrOggettiDatasetCalc ) {
        this.nrOggettiDatasetCalc = nrOggettiDatasetCalc;
    }
    public Integer getNrOggettiDatasetCalc() {
        return this.nrOggettiDatasetCalc;
    }

    public void setFkTipoOggetto( Integer fkTipoOggetto ) {
        this.fkTipoOggetto = fkTipoOggetto;
    }
    public Integer getFkTipoOggetto() {
        return this.fkTipoOggetto;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(idMetadato);
        sb.append("|");
        sb.append(nrOggettiDatasetCalc);
        sb.append("|");
        sb.append(fkTipoOggetto);
        return sb.toString(); 
    } 


}
