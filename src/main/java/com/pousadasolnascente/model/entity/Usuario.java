package com.pousadasolnascente.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String sobrenome;
    private String username;
    private String email;
    private String password;
    private String documento;
    private String telefone;

    @OneToOne(cascade = CascadeType.ALL)
    private Foto fotoPerfil;

    @Enumerated(EnumType.STRING)
    private Endereco endereco;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Reserva> reservas;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getSobrenome() {return sobrenome;}
    public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}

    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    public String getDocumento() {return documento;}
    public void setDocumento(String documento) {this.documento = documento;}

    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}

    public Foto getFotoPerfil() {return fotoPerfil;}
    public void setFotoPerfil(Foto fotoPerfil) {this.fotoPerfil = fotoPerfil;}

    public Endereco getEndereco() {return endereco;}
    public void setEndereco(Endereco endereco) {this.endereco = endereco;}

    public List<Reserva> getReservas() {return reservas;}
    public void setReservas(List<Reserva> reservas) {this.reservas = reservas;}
}
