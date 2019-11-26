package br.cesjf.lucaslpwd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Resposta.class)
public abstract class Resposta_ {

	public static volatile SingularAttribute<Resposta, Integer> idResposta;
	public static volatile SingularAttribute<Resposta, String> opcao;
	public static volatile SingularAttribute<Resposta, Questao> questaoIdQuestao;
	public static volatile SingularAttribute<Resposta, String> justificativa;
	public static volatile SingularAttribute<Resposta, String> respostaCorreta;
	public static volatile ListAttribute<Resposta, UsuarioHasQuestao> usuarioHasQuestaoList;

}

