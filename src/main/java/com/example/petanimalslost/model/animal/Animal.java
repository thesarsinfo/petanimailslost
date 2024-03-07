package com.example.petanimalslost.model.animal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Animal {
    private int idAnimal;
    private String nome;
    private String tipo;
    private String fotoUrl;
    private int idade;
    private int idUsuario;
    private String endereco;
}
