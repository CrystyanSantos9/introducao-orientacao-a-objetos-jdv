package com.crys.aula.orientacao_a_objetos;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno();
		aluno.setNome("Paulo");
		aluno.setNomeEscola("JDEV - Treinamento");
		aluno.setIdade(22);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("45213545-78");
		diretor.setNome("Godofredo");
		aluno.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Aministração");
		secretario.setNumeroCpf("123.455.445-89");
		aluno.setIdade(38);
		
		System.out.println(aluno.pessoaMaiorIdadade() + " Aluno é maior de idade? " + aluno.msgMaiorDeIdade() +"Salario igual a : " + aluno.Salario());
		System.out.println(diretor.pessoaMaiorIdadade());
		System.out.println(secretario.pessoaMaiorIdadade());
		

		teste(aluno);
		teste(secretario);
		
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais "+ pessoa.getNome());
	}

}
