package testeWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TesteWriter{
	public static void main(String[] args){
			//Passamos a linha que ser� gravada no arquivo (Vir� de um objeto, ap�s melhorias)
			String tipoRegistro = "01202205012022060100000054990000005399010219876644444"; 
			String[] registro = new String[7];
			
			registro[0] = tipoRegistro.substring(0, 2);		//tipo de registro 0 e 1
			registro[1] = tipoRegistro.substring(2, 10);	//data do registro 2 at� 9
			registro[2] = tipoRegistro.substring(10, 18);	//data da transacao 10 at� 17
			registro[3] = tipoRegistro.substring(18, 28);	//valor bruto 18 at� 27
			registro[4] = tipoRegistro.substring(28, 38);	//valor liquido 28 at� 37
			registro[5] = tipoRegistro.substring(38, 44);	//nsu 38 at� 43
			registro[6] = tipoRegistro.substring(44, 52);	//autorizacao 44 at� 52
			
			System.out.println("Tipo do registro: ");
			System.out.println(registro[0]);
			
			System.out.println("Data do registro: ");
			System.out.println(registro[1]);
			
			System.out.println("Data da transa��o: ");
			System.out.println(registro[2]);
			
			System.out.println("Valor bruto: ");
			System.out.println(registro[3]);
			
			System.out.println("Valor liquido: ");
			System.out.println(registro[4]);
			
			System.out.println("N�mero sequencial �nico: ");
			System.out.println(registro[5]);
			
			System.out.println("N�mero de autoriza��o");
			System.out.println(registro[6]);
			
		
			File arquivo = new File("C:\\Users\\luan_\\OneDrive\\Ambiente de Trabalho\\javaArquivos\\NovoArquivoTeste.txt");

			try {
				FileWriter file = new FileWriter(arquivo, true);
				file.write(registro[0]);
				file.write(registro[1]);
				file.write(registro[2]);
				file.write(registro[3]);
				file.write(registro[4]);
				file.write(registro[5]);
				file.write(registro[6]);
				file.write("\n");
				
				System.out.println("Arquivo montado com �xito");
				file.flush();
				file.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}
}