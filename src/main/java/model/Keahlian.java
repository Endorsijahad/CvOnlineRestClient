/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
import javax.validation.constraints.Size;

/**
 *
 * @author Nande
 */
@Entity
@Table(name = "keahlian")
public class Keahlian {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idKeahlian;
    
    private String sertifikat;
    
    @Temporal(TemporalType.DATE)
    private Date tglSertifikat;
    
    @Size(min = 1, max = 255)
    private String deskripsi;
    
    @JoinColumn(name = "id_kandidat", referencedColumnName = "id_kandidat")
    @ManyToOne
    private Kandidat kandidat;

    public Keahlian() {
    }

    public Keahlian(Long idKeahlian) {
        this.idKeahlian = idKeahlian;
    }

    public Keahlian(Long idKeahlian, String deskripsi) {
        this.idKeahlian = idKeahlian;
        this.deskripsi = deskripsi;
    }

    public Long getIdKeahlian() {
        return idKeahlian;
    }

    public void setIdKeahlian(Long idKeahlian) {
        this.idKeahlian = idKeahlian;
    }

    public String getSertifikat() {
        return sertifikat;
    }

    public void setSertifikat(String sertifikat) {
        this.sertifikat = sertifikat;
    }

    public Date getTglSertifikat() {
        return tglSertifikat;
    }

    public void setTglSertifikat(Date tglSertifikat) {
        this.tglSertifikat = tglSertifikat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Kandidat getKandidat() {
        return kandidat;
    }

    public void setKandidat(Kandidat kandidat) {
        this.kandidat = kandidat;
    }
    
}
