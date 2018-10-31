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
@Table(name = "detillowongan")
public class Detillowongan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDetillowongan;
    
    @JoinColumn(name = "id_kandidat", referencedColumnName = "id_kandidat")
    @ManyToOne
    private Kandidat kandidat;
    
    @JoinColumn(name = "id_lowongan", referencedColumnName = "id_lowongan")
    @ManyToOne
    private Lowongan lowongan;

    public Detillowongan() {
    }

    public Detillowongan(Long idDetillowongan) {
        this.idDetillowongan = idDetillowongan;
    }

    public Long getIdDetillowongan() {
        return idDetillowongan;
    }

    public void setIdDetillowongan(Long idDetillowongan) {
        this.idDetillowongan = idDetillowongan;
    }

    public Kandidat getKandidat() {
        return kandidat;
    }

    public void setKandidat(Kandidat kandidat) {
        this.kandidat = kandidat;
    }

    public Lowongan getLowongan() {
        return lowongan;
    }

    public void setLowongan(Lowongan lowongan) {
        this.lowongan = lowongan;
    }
}
