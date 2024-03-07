package com.example.petanimalslost.model.usuario;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
}
