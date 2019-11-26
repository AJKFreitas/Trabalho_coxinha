package br.cesjf.lucaslpwd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UsuarioHasQuestao.class)
public abstract class UsuarioHasQuestao_ {

	public static volatile SingularAttribute<UsuarioHasQuestao, UsuarioHasQuestaoPK> usuarioHasQuestaoPK;
	public static volatile SingularAttribute<UsuarioHasQuestao, Resposta> respostaIdResposta;
	public static volatile SingularAttribute<UsuarioHasQuestao, Usuario> usuario;
	public static volatile SingularAttribute<UsuarioHasQuestao, Questao> questao;

}

