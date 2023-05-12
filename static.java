//KAY FERRAZ 
//CIENCIA DA COMPUTAÇÃO FCT UNESP - PROGRAMAÇÃO ORIENTADA A OBJETOS
// AULA 6 
// area de memoria compartilhada 
//compartilhar informações a aprtir de uma classe
public class Funcionario {
      private static int codAtual=0;
         private int cod;
           private String nome;
  
public Funcionario(String nome, int idade){
    this.cod = this.codAtual;
    this.codAtual++;
    this.nome = nome;
    this idade = idade;
  }
}

Funcionario f1 = new Funcionario ("Func1", 33);
Funcionario f2 = new Funcionario ("Func1", 22);
Funcionario f3 = new Funcionario ("Func1", 44);

f1.exibir();
f2.exibir();
f3.exibir();



public void exibir (){
   System.out.println("Cod: "+cod);
   System.out.println("Nome: "+nome);
   System.out.println("Idade: "+idade);
}
