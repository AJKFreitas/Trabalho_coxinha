/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lucaslpwd.dao;

import br.cesjf.lucaslpwd.model.Assunto;
import br.cesjf.lucaslpwd.util.PersistenceUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author alunoces
 */
public class AssuntoDAO {

    public static AssuntoDAO assuntoDao;

    public static AssuntoDAO getInstance() {
        if (assuntoDao == null) {
            assuntoDao = new AssuntoDAO();
        }
        return assuntoDao;
    }

    public String remover(Assunto assunto) {
        try {
            EntityManager em = PersistenceUtil.getEntityManager();
            em.getTransaction().begin();
            assunto = em.merge(assunto);
            em.remove(assunto);
            em.getTransaction().commit();
            Logger.getLogger(PersistenceUtil.class.getName()).log(
                    Level.INFO, "Assunto removido com sucesso!");
            return "Assunto" + assunto.GetAssunto() + " não pode ser apresentado";
        } catch (Exception e) {
            Logger.getLogger(PersistenceUtil.class.getName()).log(Level.WARNING, "Não foi possível remover o assunto!", e.getMessage());
            return "Não foi possível remover o assunto " + assunto.GetAssunto();
        }
    }

    public String persistir(Assunto assunto) {
        EntityManager em = PersistenceUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            assunto = em.merge(assunto);
            em.getTransaction().commit();
            Logger.getLogger(PersistenceUtil.class.getName()).log(Level.INFO, "Assunto salvo com sucesso!");
            return "O assunto" + assunto.GetAssunto() + " foi salvo com sucesso!";
        } catch (Exception e) {
            em.getTransaction().rollback();
            Logger.getLogger(PersistenceUtil.class.getName()).log(Level.WARNING, "Não foi possivel salvar o assunto");
            if(e.getMessage().contains("ConstraintViolationException")){
            return "Não foi possível salvar o assunto " + assunto.GetAssunto() + " pois sua chave deve ser única!";
            }
            return "Não foi possível salvar o assunto " + assunto.GetAssunto() + "!";
        }
    }
    
    

}
