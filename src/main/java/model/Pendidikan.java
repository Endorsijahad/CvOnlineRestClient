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
@Table(name = "pendidikan")
public class Pendidikan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPendidikan;
    
    private String jenjangPendidikan;
    
    private String namaSekolah;
    
    @Temporal(TemporalType.DATE)
    private Date tahunMasuk;
    
    @Temporal(TemporalType.DATE)
    private Date tahunSelesai;
    
    private Float nilaiAkhir;
    
    @JoinColumn(name = "id_kandidat", referencedColumnName = "id_kandidat")
    @ManyToOne
    private Kandidat kandidat;

    public Pendidikan() {
    }

    public Pendidikan(Long idPendidikan) {
        this.idPendidikan = idPendidikan;
    }

    public Long getIdPendidikan() {
        return idPendidikan;
    }

    public void setIdPendidikan(Long idPendidikan) {
        this.idPendidikan = idPendidikan;
    }

    public String getJenjangPendidikan() {
        return jenjangPendidikan;
    }

    public void setJenjangPendidikan(String jenjangPendidikan) {
        this.jenjangPendidikan = jenjangPendidikan;
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }

    public void setNamaSekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public Date getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(Date tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public Date getTahunSelesai() {
        return tahunSelesai;
    }

    public void setTahunSelesai(Date tahunSelesai) {
        this.tahunSelesai = tahunSelesai;
    }

    public Float getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNilaiAkhir(Float nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }

    public Kandidat getKandidat() {
        return kandidat;
    }

    public void setKandidat(Kandidat kandidat) {
        this.kandidat = kandidat;
    }

}
