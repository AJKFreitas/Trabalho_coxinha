
package br.com.lucas.enadesimulator.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@SessionScoped
@ManagedBean
public class UsuarioBean {
    private String nome;
    private String senha;
    private int cpf;
    private int permissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getPermissao() {
        return permissao;
    }

    public void setPermissao(int permissao) {
        this.permissao = permissao;
    }
    
}
