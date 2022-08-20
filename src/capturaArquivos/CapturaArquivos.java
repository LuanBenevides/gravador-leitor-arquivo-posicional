package capturaArquivos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CapturaArquivos {

	public static void main(String[] args) throws FileNotFoundException {
		//Localiza um arquivo na memória e realiza a leitura, linha a linha;
		
		File arquivo = new File("C:\\Users\\luan_\\OneDrive\\Documentos\\utilitarios\\document.txt");
		Scanner entrada = new Scanner(arquivo);
		while(entrada.hasNext()) {
			System.out.println(entrada.nextLine());
		}
		entrada.close();
	}
}
