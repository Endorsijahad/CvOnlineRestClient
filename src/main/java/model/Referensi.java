/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Nande
 */
@Entity
@Table(name = "referensi")
public class Referensi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idReferensi;
    
    private String nama;
    
    private String noHp;
    
    private String email;
    
    private String lamaKenal;
    
    private String konfirmasi;
    
    private String alamat;
    
    @JoinColumn(name = "id_kandidat", referencedColumnName = "id_kandidat")
    @ManyToOne
    private Kandidat kandidat;

    public Referensi() {
    }

    public Referensi(Long idReferensi) {
        this.idReferensi = idReferensi;
    }

    public Long getIdReferensi() {
        return idReferensi;
    }

    public void setIdReferensi(Long idReferensi) {
        this.idReferensi = idReferensi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLamaKenal() {
        return lamaKenal;
    }

    public void setLamaKenal(String lamaKenal) {
        this.lamaKenal = lamaKenal;
    }

    public String getKonfirmasi() {
        return konfirmasi;
    }

    public void setKonfirmasi(String konfirmasi) {
        this.konfirmasi = konfirmasi;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Kandidat getKandidat() {
        return kandidat;
    }

    public void setKandidat(Kandidat kandidat) {
        this.kandidat = kandidat;
    }
 
}
