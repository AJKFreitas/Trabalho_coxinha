package br.cesjf.lucaslpwd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	public static volatile SingularAttribute<Usuario, String> senha;
	public static volatile SingularAttribute<Usuario, TipoUsuario> idTipoUsuario;
	public static volatile SingularAttribute<Usuario, Integer> idUsuario;
	public static volatile ListAttribute<Usuario, Prova> provaList;
	public static volatile SingularAttribute<Usuario, String> cpf;
	public static volatile SingularAttribute<Usuario, Short> reset;
	public static volatile SingularAttribute<Usuario, String> nmUsuario;
	public static volatile SingularAttribute<Usuario, String> tipoUsuario;
	public static volatile SingularAttribute<Usuario, String> email;
	public static volatile ListAttribute<Usuario, Curso> cursoList;
	public static volatile ListAttribute<Usuario, UsuarioHasQuestao> usuarioHasQuestaoList;

}

