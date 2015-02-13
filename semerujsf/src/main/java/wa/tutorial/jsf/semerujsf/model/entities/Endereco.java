/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wa.tutorial.jsf.semerujsf.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Taw
 */
@Entity
@Table(name="endereco")
public class Endereco implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name="idEndereco", nullable=false)
    private Integer idEndereco;
    
    @Column(name="bairro",nullable=false,length = 80)
    private String bairro;
    
    @Column(name="nomeLogradouro",nullable=false,length = 80)
    private String nomeLogradouro;
    
    @Column(name="cep",nullable=false,length = 9)
    private String cep;
    
    @Column(name="numero",nullable=false,length = 10)
    private String numero;
    
    @Column(name="complemento",nullable=false,length = 80)
    private String complemento;
}
