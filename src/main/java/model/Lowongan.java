/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Nande
 */
@Entity
@Table(name = "lowongan")
public class Lowongan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_lowongan")
    private Long idLowongan;
    
    private String namaPosisi;
    
    private String syarat;
    
    @Temporal(TemporalType.DATE)
    private Date batasAkhir;
    
    public Lowongan() {
    }

    public Lowongan(Long idLowongan) {
        this.idLowongan = idLowongan;
    }

    public Lowongan(Long idLowongan, Date batasAkhir) {
        this.idLowongan = idLowongan;
        this.batasAkhir = batasAkhir;
    }

    public Long getIdLowongan() {
        return idLowongan;
    }

    public void setIdLowongan(Long idLowongan) {
        this.idLowongan = idLowongan;
    }

    public String getNamaPosisi() {
        return namaPosisi;
    }

    public void setNamaPosisi(String namaPosisi) {
        this.namaPosisi = namaPosisi;
    }

    public String getSyarat() {
        return syarat;
    }

    public void setSyarat(String syarat) {
        this.syarat = syarat;
    }

    public Date getBatasAkhir() {
        return batasAkhir;
    }

    public void setBatasAkhir(Date batasAkhir) {
        this.batasAkhir = batasAkhir;
    }
}
