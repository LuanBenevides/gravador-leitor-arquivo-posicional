package contaLinhas;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ContaLinhas {
	
	public static void main(String[] args) throws IOException {
		
		File arquivo = new File("C:\\Users\\luan_\\OneDrive\\Documentos\\utilitarios\\document.txt");
		LineNumberReader linhaLeitura = new LineNumberReader(new FileReader(arquivo));
		
		/*usamos o skip para pular uma quantidade de caracteres informada;
		 * Nesse caso, com o .length, passamos o arquivo todo, para ele percorrer todo
		 * utilizamos o método getLineNumber, para obter a quantidade de linhas; 
		 * */
		linhaLeitura.skip(arquivo.length());
		//A contagem é indexada apartir da 0, adcionamos mais 1;
		int qtdLinhas = linhaLeitura.getLineNumber() + 1; 
		
		
		System.out.println("O arquivo tem " + qtdLinhas + " linhas.");
		linhaLeitura.close();
	}	
}
