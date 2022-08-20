package fileRead;

public class CardTransactions {
	static String typeTransaction;
	static String transactionRegister;
	static String transactionDate;
	static String brutalValue;
	static String finalValue;
	static String nsu;
	static String pass;
	
	public static void getValues(String[] subregistroTransac) {
		typeTransaction = subregistroTransac[0];
		transactionRegister = subregistroTransac[1];
		transactionDate = subregistroTransac[2];
		brutalValue = subregistroTransac[3];
		finalValue = subregistroTransac[4];
		nsu = subregistroTransac[5];
		pass = subregistroTransac[6];
	}
}
