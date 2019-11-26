package br.cesjf.lucaslpwd.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Prova.class)
public abstract class Prova_ {

	public static volatile SingularAttribute<Prova, Integer> idProva;
	public static volatile SingularAttribute<Prova, Date> ano;
	public static volatile ListAttribute<Prova, Usuario> usuarioList;
	public static volatile SingularAttribute<Prova, Curso> cursoIdCurso;
	public static volatile ListAttribute<Prova, Questao> questaoList;

}

