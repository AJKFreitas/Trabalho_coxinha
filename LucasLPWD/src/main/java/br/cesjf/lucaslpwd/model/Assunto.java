/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lucaslpwd.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author alunoces
 */
@Embeddable
public class Assunto implements Serializable {

    @Basic(optional = false)
    @Column(name = "assunto")
    private String assunto;


    public Assunto() {
    }


    public String GetAssunto() {
        return this.assunto;
    }



    
}
