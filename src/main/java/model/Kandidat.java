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
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Nande
 */
@Entity
@Table(name = "kandidat")
public class Kandidat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_kandidat")
    private Long idKandidat;

    private String namaKandidat;

    private String email;

    private String noHp;

    private String noTelp;

    private String noTelpkerabat;

    private String namaKerabat;

    private String tempatLahir;

    @Temporal(TemporalType.DATE)
    private Date tglLahir;

    private String nik;

    private String alamatKtp;

    private String alamatSekarang;

    private String npwp;

    private String agama;

    private String jenisKelamin;

    private String statusNikah;

    private String username;

    private String password;

    @Lob
    private byte[] foto;

    private String statusKandidat;

    private String statusLamaran;

    private String uploadCv;

    public Kandidat() {
    }

    public Kandidat(Long idKandidat) {
        this.idKandidat = idKandidat;
    }

    public Long getIdKandidat() {
        return idKandidat;
    }

    public void setIdKandidat(Long idKandidat) {
        this.idKandidat = idKandidat;
    }

    public String getNamaKandidat() {
        return namaKandidat;
    }

    public void setNamaKandidat(String namaKandidat) {
        this.namaKandidat = namaKandidat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getNoTelpkerabat() {
        return noTelpkerabat;
    }

    public void setNoTelpkerabat(String noTelpkerabat) {
        this.noTelpkerabat = noTelpkerabat;
    }

    public String getNamaKerabat() {
        return namaKerabat;
    }

    public void setNamaKerabat(String namaKerabat) {
        this.namaKerabat = namaKerabat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getAlamatKtp() {
        return alamatKtp;
    }

    public void setAlamatKtp(String alamatKtp) {
        this.alamatKtp = alamatKtp;
    }

    public String getAlamatSekarang() {
        return alamatSekarang;
    }

    public void setAlamatSekarang(String alamatSekarang) {
        this.alamatSekarang = alamatSekarang;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getStatusNikah() {
        return statusNikah;
    }

    public void setStatusNikah(String statusNikah) {
        this.statusNikah = statusNikah;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getStatusKandidat() {
        return statusKandidat;
    }

    public void setStatusKandidat(String statusKandidat) {
        this.statusKandidat = statusKandidat;
    }

    public String getStatusLamaran() {
        return statusLamaran;
    }

    public void setStatusLamaran(String statusLamaran) {
        this.statusLamaran = statusLamaran;
    }

    public String getUploadCv() {
        return uploadCv;
    }

    public void setUploadCv(String uploadCv) {
        this.uploadCv = uploadCv;
    }
}
