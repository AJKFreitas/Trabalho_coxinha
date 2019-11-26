package br.cesjf.lucaslpwd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Questao.class)
public abstract class Questao_ {

	public static volatile SingularAttribute<Questao, TipoQuestao> idTipoQuestaoFk;
	public static volatile SingularAttribute<Questao, Prova> prova;
	public static volatile SingularAttribute<Questao, QuestaoPK> questaoPK;
	public static volatile SingularAttribute<Questao, String> descricaoQuestao;
	public static volatile SingularAttribute<Questao, Integer> idRespostaFk;
	public static volatile ListAttribute<Questao, UsuarioHasQuestao> usuarioHasQuestaoList;
	public static volatile ListAttribute<Questao, Resposta> respostaList;

}

