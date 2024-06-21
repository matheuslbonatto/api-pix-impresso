package br.senac.pr.api_pix_impresso.dtos;

public class UpdateContaDto {
    private long agencia;
    private long numeroConta;
    private long digitoVerificador;
    private String nome;
    private String cpf;
    private long tipoConta;
    private String numeroCartao;
    private String senha;
    private Double saldo;
  
    public UpdateContaDto(Long id, Long agencia, Long numeroConta, 
    Long digitoVerificador, String nome, String cpf, Long tipoConta,
    String numeroCartao, String senha, Double saldo) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.digitoVerificador = digitoVerificador;
        this.nome = nome;
        this.cpf = cpf;
        this.tipoConta = tipoConta;
        this.numeroCartao = numeroCartao;
        this.senha = senha;
        this.saldo = saldo;
    }
  
    public long getAgencia() {
      return agencia;
    }
  
    public void setAgencia(long agencia) {
      this.agencia = agencia;
    }

    public long getNumeroConta() {
        return numeroConta;
      }
    
    public void setNumeroConta(long numeroConta) {
    this.numeroConta = numeroConta;
      }
  
    public long getDigitoVerificador() {
        return digitoVerificador;
      }
    
    public void setdigitoVerificador(long digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
      }
      
    public String getNome() {
        return nome;
      }
    
    public void setNome(String nome) {
        this.nome = nome;
      } 
      
      public String getCpf() {
        return cpf;
      }
    
      public void setCpf(String cpf) {
        this.cpf = cpf;
      }  
      public long getTipoConta() {
        return tipoConta;
      }
    
      public void setTipoConta(long tipoConta) {
        this.tipoConta = tipoConta;
      }

      public String getNumeroCartao() {
        return numeroCartao;
      }
    
      public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
      } 
      
      public String getSenha() {
        return senha;
      }
    
      public void setSenha(String senha) {
        this.senha = senha;
      } 
      
      public Double getSaldo() {
        return saldo;
      }
    
      public void setSaldo(Double saldo) {
        this.saldo = saldo;
      } 

    }


