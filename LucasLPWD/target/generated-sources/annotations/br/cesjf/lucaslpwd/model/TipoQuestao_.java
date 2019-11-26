package br.cesjf.lucaslpwd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TipoQuestao.class)
public abstract class TipoQuestao_ {

	public static volatile SingularAttribute<TipoQuestao, String> tipoQuest;
	public static volatile SingularAttribute<TipoQuestao, Integer> idTipoQuestao;
	public static volatile ListAttribute<TipoQuestao, Questao> questaoList;

}

