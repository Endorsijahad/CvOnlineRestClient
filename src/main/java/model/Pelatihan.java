/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Nande
 */
@Entity
@Table(name = "pelatihan")
public class Pelatihan implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPelatihan;
    
    private String lembaga;
    
    private String namaPelatihan;
    
    @Temporal(TemporalType.DATE)
    private Date tglPelatihan;
    
    private String sertifikat;
    
    @JoinColumn(name = "id_kandidat", referencedColumnName = "id_kandidat")
    @ManyToOne
    private Kandidat kandidat;

    public Pelatihan() {
    }

    public Pelatihan(Long idPelatihan) {
        this.idPelatihan = idPelatihan;
    }

    public Long getIdPelatihan() {
        return idPelatihan;
    }

    public void setIdPelatihan(Long idPelatihan) {
        this.idPelatihan = idPelatihan;
    }

    public String getLembaga() {
        return lembaga;
    }

    public void setLembaga(String lembaga) {
        this.lembaga = lembaga;
    }

    public String getNamaPelatihan() {
        return namaPelatihan;
    }

    public void setNamaPelatihan(String namaPelatihan) {
        this.namaPelatihan = namaPelatihan;
    }

    public Date getTglPelatihan() {
        return tglPelatihan;
    }

    public void setTglPelatihan(Date tglPelatihan) {
        this.tglPelatihan = tglPelatihan;
    }

    public String getSertifikat() {
        return sertifikat;
    }

    public void setSertifikat(String sertifikat) {
        this.sertifikat = sertifikat;
    }

    public Kandidat getKandidat() {
        return kandidat;
    }

    public void setKandidat(Kandidat kandidat) {
        this.kandidat = kandidat;
    }

}
