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
@Table(name = "penghargaan")
public class Penghargaan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPenghargaan;
    
    private String namaPenghargaan;
    
    @JoinColumn(name = "id_kandidat", referencedColumnName = "id_kandidat")
    @ManyToOne
    private Kandidat kandidat;

    public Penghargaan() {
    }

    public Penghargaan(Long idPenghargaan) {
        this.idPenghargaan = idPenghargaan;
    }

    public Long getIdPenghargaan() {
        return idPenghargaan;
    }

    public void setIdPenghargaan(Long idPenghargaan) {
        this.idPenghargaan = idPenghargaan;
    }

    public String getNamaPenghargaan() {
        return namaPenghargaan;
    }

    public void setNamaPenghargaan(String namaPenghargaan) {
        this.namaPenghargaan = namaPenghargaan;
    }

    public Kandidat getKandidat() {
        return kandidat;
    }

    public void setKandidat(Kandidat kandidat) {
        this.kandidat = kandidat;
    }


}
