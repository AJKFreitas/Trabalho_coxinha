package br.cesjf.lucaslpwd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Curso.class)
public abstract class Curso_ {

	public static volatile SingularAttribute<Curso, String> sigla;
	public static volatile ListAttribute<Curso, Usuario> usuarioList;
	public static volatile ListAttribute<Curso, Prova> provaList;
	public static volatile SingularAttribute<Curso, Integer> idCurso;
	public static volatile SingularAttribute<Curso, String> nmCurso;

}

