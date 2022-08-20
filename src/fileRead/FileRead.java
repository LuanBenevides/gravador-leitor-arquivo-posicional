package fileRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class FileRead {
	public static void main(String[] args) throws IOException {
		File arquivo = new File("C:\\Users\\luan_\\OneDrive\\Ambiente de Trabalho\\javaArquivos\\NovoArquivoTeste.txt");
		Scanner entrada = new Scanner(arquivo);

		String[] registro = new String[100];
		String[] subregistroTransac = new String[7];
		
		try (BufferedReader arq = new BufferedReader(new FileReader(arquivo))) {
			
			//contagem de linhas no arquivo
			LineNumberReader linhaLeitura = new LineNumberReader(new FileReader(arquivo));
			
			linhaLeitura.skip(arquivo.length());
			int qtdLinhas = linhaLeitura.getLineNumber();
			qtdLinhas = qtdLinhas - 1;
			
			boolean condit = entrada.hasNextLine();
			int controle = 0;
			
			while(condit == true && controle <= qtdLinhas) {
				registro[controle] = arq.readLine();
				
				subregistroTransac[0] = registro[controle].substring(0, 2);
				subregistroTransac[1] = registro[controle].substring(2, 10);
				subregistroTransac[2] = registro[controle].substring(10, 18);
				subregistroTransac[3] = registro[controle].substring(18, 28);
				subregistroTransac[4] = registro[controle].substring(28, 38);
				subregistroTransac[5] = registro[controle].substring(38, 44);
				subregistroTransac[6] = registro[controle].substring(44, 52);
				
				System.out.println("Transação n° " + controle);
				System.out.println("Tipo de registro: ");
				System.out.println(subregistroTransac[0]);
				
				System.out.println("Data do registro: ");
				System.out.println(subregistroTransac[1]);
				
				System.out.println("Data da transação: ");
				System.out.println(subregistroTransac[2]);
				
				System.out.println("Valor bruto: ");
				System.out.println(subregistroTransac[3]);
				
				System.out.println("Valor líquido: ");
				System.out.println(subregistroTransac[4]);
				
				System.out.println("Número sequencial único: ");
				System.out.println(subregistroTransac[5]);
				
				System.out.println("Número de autorização: ");
				System.out.println(subregistroTransac[6]);
				
				controle++;
			}
			linhaLeitura.close();
		}
		
		entrada.close();
	}
}