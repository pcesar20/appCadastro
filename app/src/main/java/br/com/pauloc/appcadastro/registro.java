package br.com.pauloc.appcadastro;

public class registro {
    private String nome;
    private String endereco;
    private String telefone;

public registro(String nome, String endereco, String telefone){
   setNome(nome);
   setEndereco(endereco);
   setTelefone(telefone);
}

public String getNome(){
    return this.nome;
}

public void setNome(String nome){
    this.nome = nome;
}

public String getEndereco(){
    return this.endereco;
}

public void setEndereco(String endereco){
    this.endereco = endereco;
}

public String getTelefone(){
    return this.telefone;
}

public void setTelefone(String telefone){
    this.telefone = telefone;
}

}

