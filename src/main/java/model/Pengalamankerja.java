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

/**
 *
 * @author Nande
 */
@Entity
@Table(name = "pengalamankerja")
public class Pengalamankerja {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPengalamankerja;
    
    private String namaPt;
    
    private String bidang;
    
    private String alamat;
    
    private String telepon;
    
    @Temporal(TemporalType.DATE)
    private Date tglAwal;
    
    @Temporal(TemporalType.DATE)
    private Date tglAkhir;
    
    private String posisi;
    
    private Integer gaji;
    
    private String jenisGaji;
    
    private String proyek;
    
    private String namaAtasan;
    
    private String alasan;
    
    private String uraianJabatan;
    
    @JoinColumn(name = "id_kandidat", referencedColumnName = "id_kandidat")
    @ManyToOne
    private Kandidat kandidat;

    public Pengalamankerja() {
    }

    public Pengalamankerja(Long idPengalamankerja) {
        this.idPengalamankerja = idPengalamankerja;
    }

    public Pengalamankerja(Long idPengalamankerja, String namaPt, Date tglAwal, Date tglAkhir) {
        this.idPengalamankerja = idPengalamankerja;
        this.namaPt = namaPt;
        this.tglAwal = tglAwal;
        this.tglAkhir = tglAkhir;
    }

    public Long getIdPengalamankerja() {
        return idPengalamankerja;
    }

    public void setIdPengalamankerja(Long idPengalamankerja) {
        this.idPengalamankerja = idPengalamankerja;
    }

    public String getNamaPt() {
        return namaPt;
    }

    public void setNamaPt(String namaPt) {
        this.namaPt = namaPt;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public Date getTglAwal() {
        return tglAwal;
    }

    public void setTglAwal(Date tglAwal) {
        this.tglAwal = tglAwal;
    }

    public Date getTglAkhir() {
        return tglAkhir;
    }

    public void setTglAkhir(Date tglAkhir) {
        this.tglAkhir = tglAkhir;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public Integer getGaji() {
        return gaji;
    }

    public void setGaji(Integer gaji) {
        this.gaji = gaji;
    }

    public String getJenisGaji() {
        return jenisGaji;
    }

    public void setJenisGaji(String jenisGaji) {
        this.jenisGaji = jenisGaji;
    }

    public String getProyek() {
        return proyek;
    }

    public void setProyek(String proyek) {
        this.proyek = proyek;
    }

    public String getNamaAtasan() {
        return namaAtasan;
    }

    public void setNamaAtasan(String namaAtasan) {
        this.namaAtasan = namaAtasan;
    }

    public String getAlasan() {
        return alasan;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }

    public String getUraianJabatan() {
        return uraianJabatan;
    }

    public void setUraianJabatan(String uraianJabatan) {
        this.uraianJabatan = uraianJabatan;
    }

    public Kandidat getKandidat() {
        return kandidat;
    }

    public void setKandidat(Kandidat kandidat) {
        this.kandidat = kandidat;
    }
}
