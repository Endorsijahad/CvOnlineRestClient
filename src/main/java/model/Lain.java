/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nande
 */
@Entity
@Table(name = "lain")
public class Lain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLain;

    private String jawaban;

    @JoinColumn(name = "id_kandidat", referencedColumnName = "id_kandidat")
    @ManyToOne
    private Kandidat kandidat;

    @JoinColumn(name = "id_pertanyaan", referencedColumnName = "id_pertanyaan")
    @ManyToOne
    private Pertanyaan pertanyaan;

    public Lain() {
    }

    public Lain(Long idLain) {
        this.idLain = idLain;
    }

    public Long getIdLain() {
        return idLain;
    }

    public void setIdLain(Long idLain) {
        this.idLain = idLain;
    }

    public String getJawaban() {
        return jawaban;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    public Kandidat getKandidat() {
        return kandidat;
    }

    public void setKandidat(Kandidat kandidat) {
        this.kandidat = kandidat;
    }

    public Pertanyaan getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(Pertanyaan pertanyaan) {
        this.pertanyaan = pertanyaan;
    }
}
