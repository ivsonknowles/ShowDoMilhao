//Autor: Ivson Gomes de França Silva


package showdomilhao;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		 int premio1=0; String resposta1; String jogador;
	       int premio2=0; String resposta2;  
	       int premio3=0; String resposta3;
	       int premio4=0; String resposta4;
	       int premio5=0; String resposta5;
	       int premio6=0; String resposta6;
	       int premio7=0; String resposta7;
	       int premio8=0; String resposta8;
	       int premio9=0; String resposta9;
	       
	       
	       
	       jogador=JOptionPane.showInputDialog(null,"Digite seu Nome","Cadastro",JOptionPane.INFORMATION_MESSAGE); 
	       JOptionPane.showMessageDialog(null,"Seu Nome no Jogo séra "+jogador); 
	       JOptionPane.showMessageDialog(null,"Vamos Começar a Primeira fase"); 
	       
	       resposta1=JOptionPane.showInputDialog(jogador+ ", Valendo R$100.000,00 \nO que é Java? \n\nA:É um Programa. \nB:Uma Linguagem de Programação. \nC:Linguagem de Maquina \nD:um café \n\nPremio atual: "+premio1); 
	       
	       if ("B".equalsIgnoreCase(resposta1)) { 
	            premio1=+100000; 
	            JOptionPane.showMessageDialog(null,"Voce acertou!!\nSeu premio esta acumulado em "+premio1);
	       }else { 
	            JOptionPane.showMessageDialog(null,"Você errou!! \nVocê ganhou "+premio1); 
	            System.exit(0);
	       }
	       
	       
	       resposta2=JOptionPane.showInputDialog(jogador+", Valendo R$200.000,00 \nDe quem é a famosa frase “Penso, logo existo”? \n\nA:Platão \nB:Galileu Galilei \nC:Descartes \nD:Sócrates \n\nPremio atual: "+premio1); 
	            if ("C".equalsIgnoreCase(resposta2)) { 
	                premio2 = 100000+premio1; 
	                JOptionPane.showMessageDialog(null,"Voce acertou!!\nSeu premio esta acumulado em "+premio2);
	            }else{
	                JOptionPane.showMessageDialog(null, "Voce errou!!1 \nVocê ganhou " + premio1);
	                System.exit(0);
	            }
	            
	       resposta3 = JOptionPane.showInputDialog(jogador + ", Valendo R$300.000,00 \n Quais o menor e o maior país do mundo? \n\nA:Vaticano e Russia \nB:Nauru e China \nC:Mônaco e Canadá \nD:Malta e Estados Unidos \n\nPremio Atual: " + premio2);
	       if("A".equalsIgnoreCase(resposta3)){
	           premio3 = 100000 + premio2;
	           JOptionPane.showMessageDialog(null, "Voce Acertou!! \nSeu premio esta acumulado em " + premio3);
	       } else{
	           JOptionPane.showMessageDialog(null, "Voce errou!! \nVoce ganhou" + premio1);
	           System.exit(0);
	       }    
	       
	       resposta4 = JOptionPane.showInputDialog(jogador + ", Valendo R$400.000,00 \n  Qual o livro mais vendido no mundo a seguir à Bíblia? \n\nA: O Senhor do anéis \nB: Dom Quixote \nC: O pequeno principe \nD:Ela, a feiticeira\n\nPremio atual: " + premio3);
	       if("B".equalsIgnoreCase(resposta4)){
	           premio4 = 100000 + premio3;
	           JOptionPane.showMessageDialog(null, "Voce acertou!! \nSeu premio está acumulado em "+ premio4);
	       }else{
	         JOptionPane.showMessageDialog(null, "Voce errou!! \nVoce ganhou: " + premio1  );
	         System.exit(0);
	       }
	       
	       resposta5 = JOptionPane.showInputDialog(jogador + ", Valendo R$500.000,00 \n O que a palavra legend significa em português? \n\nA: Legenda \nB: Conto \nC: Lenda \nD:Historia \nPremio Atual: " + premio4);
	        if("C".equalsIgnoreCase(resposta5)){
	           premio5 = 100000 + premio4;
	           JOptionPane.showMessageDialog(null, "Voce acertou!! \nSeu premio está acumulado em: " +premio5 );
	       }else {
	           JOptionPane.showMessageDialog(null, "Voce errou!! \nVoce ganhou:  " + premio1);
	           System.exit(0);
	       }
	       
	       resposta6 = JOptionPane.showInputDialog(jogador + ", Valendo R$ 600.000,00 \n Qual o número mínimo de jogadores numa partida de futebol? \n\nA:8 \nB:10 \nC: 11 \nD: 7 \nPremio Atual: " + premio5);
	       if("D".equalsIgnoreCase(resposta6)){
	           premio6 = 100000 + premio5;
	           JOptionPane.showMessageDialog(null, "Voce acertou!! \nSeu premio está acumulado em: " + premio6);
	       }else{
	           JOptionPane.showMessageDialog(null, "Voce errou! \nVoce ganhou: " + premio1);
	           System.exit(0);
	       }
	       
	       resposta7 = JOptionPane.showInputDialog(jogador + ", Valendo 700.000,00 \n Em que período da pré-história o fogo foi descoberto? \n\nA:Paleolítico \nB:Neolitico \nC:Idade Média \nD:Idade dos metais \nPremio Atual " + premio6);
	       if("A".equalsIgnoreCase(resposta7)){
	           premio7 = 100000 + premio6;
	           JOptionPane.showMessageDialog(null, "Voce acertou!! \nSeu premio está acumulado em: " + premio7);
	       }else{
	           JOptionPane.showMessageDialog(null, "Voce errou!! \n Voce ganhou " + premio1);
	           System.exit(0);
	       }
	       
	       resposta8 = JOptionPane.showInputDialog(jogador + ", valendo 800.000,00 \n Qual destes países é transcontinental? \n\nA: Asia \nB: Russia \nC: India \nD:China \nPremio Atual: "+ premio7);
	       if("B".equalsIgnoreCase(resposta8)){
	           premio8 = 100000 + premio7;
	           JOptionPane.showMessageDialog(null, "Voce acertou!! \nSeu premio está acumulado em: " + premio8);
	       }else {
	           JOptionPane.showMessageDialog(null, "Voce errou!! \n Voce ganhou: " + premio1);
	           System.exit(0);
	       }
	       
	       resposta9 = JOptionPane.showInputDialog(jogador + ", Valendo o premio final de 1 MILHÃO DE REAIS!! \n  Quais os planetas do sistema solar? \n\nA: Terra, Vênus, Saturno, Urano, Júpiter, Marte, Netuno, Mercúrio \nb:Júpiter, Marte, Mercúrio, Netuno, Plutão, Saturno, Terra, Urano, Vênus \nC:Vênus, Saturno, Urano, Júpiter, Marte, Netuno, Mercúrio \nD: Terra, Vênus, Saturno, Júpiter, Marte, Netuno, Mercúrio \nPremio atual: " + premio8);
	       if("A".equalsIgnoreCase(resposta9)){
	           premio9 = 200000 + premio8;
	           JOptionPane.showMessageDialog(null, "VOCÊ ACABA DE GANHAR 1 MILHÃO DE REAIS!!!! =)" );
	       }else{
	           JOptionPane.showMessageDialog(null, "Voce errou!! \n Voce ganhou " + premio1);
	           System.exit(0);
	       }
	       

	}

}
