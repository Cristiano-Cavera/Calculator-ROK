package entities;

import java.text.NumberFormat;
import java.util.Locale;


public class Treinar {

	Locale br = new Locale("pt");
	NumberFormat nf = NumberFormat.getInstance(br);

	public int t1;
	public int t2;
	public int t3;
	public int t4;
	public int t5;

	public double power() {
		double powerT1 = 1 * t1;
		double powerT2 = 2 * t2;
		double powerT3 = 3 * t3;
		double powerT4 = 4 * t4;
		double powerT5 = 10 * t5;
		double powerTotal = powerT1 + powerT2 + powerT3 + powerT4 + powerT5;
		return powerTotal;
	}

	public String[] powerFormat() {
		
		int powerT1 = 1 * t1;
		int powerT2 = 2 * t2;
		int powerT3 = 3 * t3;
		int powerT4 = 4 * t4;
		int powerT5 = 10 * t5;
		int powerTotal = powerT1+powerT2+powerT3+powerT4+powerT5;
		String powerT1Format = nf.format(powerT1);
		String powerT2Format = nf.format(powerT2);
		String powerT3Format = nf.format(powerT3);
		String powerT4Format = nf.format(powerT4);
		String powerT5Format = nf.format(powerT5);
		String powerTotalFormat = nf.format(powerTotal);
		String[] powerFormat = { powerT1Format, powerT2Format, powerT3Format, powerT4Format, powerT5Format, powerTotalFormat };
		return powerFormat;
	}

	public double[] recursosInf() {

		double recursosInfT1Comida = 50 * t1;
		double recursosInfT1Madeira = 50 * t1;
		double recursosInfT1Pedra = 0;
		double recursosInfT1Ouro = 0;
		double recursosInfT2Comida = 100 * t2;
		double recursosInfT2Madeira = 100 * t2;
		double recursosInfT2Pedra = 0;
		double recursosInfT2Ouro = 0;
		double recursosInfT3Comida = 150 * t3;
		double recursosInfT3Madeira = 150 * t3;
		double recursosInfT3Pedra = 0;
		double recursosInfT3Ouro = 10 * t3;
		double recursosInfT4Comida = 300 * t4;
		double recursosInfT4Madeira = 300 * t4;
		double recursosInfT4Pedra = 0;
		double recursosInfT4Ouro = 20 * t4;

		double recursosInfT5Comida = 800 * t5;
		double recursosInfT5Madeira = 800 * t5;
		double recursosInfT5Pedra = 0;
		double recursosInfT5Ouro = 400 * t5;
		double comidaInfTotal = recursosInfT1Comida + recursosInfT2Comida + recursosInfT3Comida + recursosInfT4Comida
				+ recursosInfT5Comida;
		double madeiraInfTotal = recursosInfT1Madeira + recursosInfT2Madeira + recursosInfT3Madeira
				+ recursosInfT4Madeira + recursosInfT5Madeira;
		double pedraInfTotal = recursosInfT1Pedra + recursosInfT2Pedra + recursosInfT3Pedra + recursosInfT4Pedra
				+ recursosInfT5Pedra;
		double ouroInfTotal = recursosInfT1Ouro + recursosInfT2Ouro + recursosInfT3Ouro + recursosInfT4Ouro
				+ recursosInfT5Ouro;
		double[] recursosInfTotal = { comidaInfTotal, madeiraInfTotal, pedraInfTotal, ouroInfTotal };
		return recursosInfTotal;
	}
	public String[] recursosInfFormat() {

		double recursosInfT1Comida = 50 * t1;
		double recursosInfT1Madeira = 50 * t1;
		double recursosInfT1Pedra = 0;
		double recursosInfT1Ouro = 0;
		double recursosInfT2Comida = 100 * t2;
		double recursosInfT2Madeira = 100 * t2;
		double recursosInfT2Pedra = 0;
		double recursosInfT2Ouro = 0;
		double recursosInfT3Comida = 150 * t3;
		double recursosInfT3Madeira = 150 * t3;
		double recursosInfT3Pedra = 0;
		double recursosInfT3Ouro = 10 * t3;
		double recursosInfT4Comida = 300 * t4;
		double recursosInfT4Madeira = 300 * t4;
		double recursosInfT4Pedra = 0;
		double recursosInfT4Ouro = 20 * t4;

		double recursosInfT5Comida = 800 * t5;
		double recursosInfT5Madeira = 800 * t5;
		double recursosInfT5Pedra = 0;
		double recursosInfT5Ouro = 400 * t5;
		double comidaInfTotal = recursosInfT1Comida + recursosInfT2Comida + recursosInfT3Comida + recursosInfT4Comida
				+ recursosInfT5Comida;
		double madeiraInfTotal = recursosInfT1Madeira + recursosInfT2Madeira + recursosInfT3Madeira
				+ recursosInfT4Madeira + recursosInfT5Madeira;
		double pedraInfTotal = recursosInfT1Pedra + recursosInfT2Pedra + recursosInfT3Pedra + recursosInfT4Pedra
				+ recursosInfT5Pedra;
		double ouroInfTotal = recursosInfT1Ouro + recursosInfT2Ouro + recursosInfT3Ouro + recursosInfT4Ouro
				+ recursosInfT5Ouro;
		String comidaInfTotalFormat = nf.format(comidaInfTotal);
		String madeiraInfTotalFormat = nf.format(madeiraInfTotal);
		String pedraInfTotalFormat = nf.format(pedraInfTotal);
		String ouroInfTotalFormat = nf.format(ouroInfTotal);
		String[] recursosInfTotalFormat = { comidaInfTotalFormat, madeiraInfTotalFormat, pedraInfTotalFormat, ouroInfTotalFormat };
		return recursosInfTotalFormat;
	}

	public double[] recursosCav() {

		double recursosCavT1Comida = 60 * t1;
		double recursosCavT1Madeira = 40 * t1;
		double recursosCavT1Pedra = 0;
		double recursosCavT1Ouro = 0;
		double recursosCavT2Comida = 100 * t2;
		double recursosCavT2Madeira = 0;
		double recursosCavT2Pedra = 75 * t2;
		double recursosCavT2Ouro = 0;
		double recursosCavT3Comida = 150 * t3;
		double recursosCavT3Madeira = 0;
		double recursosCavT3Pedra = 112 * t3;
		double recursosCavT3Ouro = 10 * t3;
		double recursosCavT4Comida = 300 * t4;
		double recursosCavT4Madeira = 0;
		double recursosCavT4Pedra = 225 * t4;
		double recursosCavT4Ouro = 20 * t4;
		double recursosCavT5Comida = 800 * t5;
		double recursosCavT5Madeira = 0;
		double recursosCavT5Pedra = 600 * t5;
		double recursosCavT5Ouro = 400 * t5;
		double comidaCavTotal = recursosCavT1Comida + recursosCavT2Comida + recursosCavT3Comida + recursosCavT4Comida
				+ recursosCavT5Comida;
		double madeiraCavTotal = recursosCavT1Madeira + recursosCavT2Madeira + recursosCavT3Madeira
				+ recursosCavT4Madeira + recursosCavT5Madeira;
		double pedraCavTotal = recursosCavT1Pedra + recursosCavT2Pedra + recursosCavT3Pedra + recursosCavT4Pedra
				+ recursosCavT5Pedra;
		double ouroCavTotal = recursosCavT1Ouro + recursosCavT2Ouro + recursosCavT3Ouro + recursosCavT4Ouro
				+ recursosCavT5Ouro;
		double[] recursosCavTotal = { comidaCavTotal, madeiraCavTotal, pedraCavTotal, ouroCavTotal };
		return recursosCavTotal;
	}
	
	public String[] recursosCavFormat() {

		double recursosCavT1Comida = 60 * t1;
		double recursosCavT1Madeira = 40 * t1;
		double recursosCavT1Pedra = 0;
		double recursosCavT1Ouro = 0;
		double recursosCavT2Comida = 100 * t2;
		double recursosCavT2Madeira = 0;
		double recursosCavT2Pedra = 75 * t2;
		double recursosCavT2Ouro = 0;
		double recursosCavT3Comida = 150 * t3;
		double recursosCavT3Madeira = 0;
		double recursosCavT3Pedra = 112 * t3;
		double recursosCavT3Ouro = 10 * t3;
		double recursosCavT4Comida = 300 * t4;
		double recursosCavT4Madeira = 0;
		double recursosCavT4Pedra = 225 * t4;
		double recursosCavT4Ouro = 20 * t4;
		double recursosCavT5Comida = 800 * t5;
		double recursosCavT5Madeira = 0;
		double recursosCavT5Pedra = 600 * t5;
		double recursosCavT5Ouro = 400 * t5;
		double comidaCavTotal = recursosCavT1Comida + recursosCavT2Comida + recursosCavT3Comida + recursosCavT4Comida
				+ recursosCavT5Comida;
		double madeiraCavTotal = recursosCavT1Madeira + recursosCavT2Madeira + recursosCavT3Madeira
				+ recursosCavT4Madeira + recursosCavT5Madeira;
		double pedraCavTotal = recursosCavT1Pedra + recursosCavT2Pedra + recursosCavT3Pedra + recursosCavT4Pedra
				+ recursosCavT5Pedra;
		double ouroCavTotal = recursosCavT1Ouro + recursosCavT2Ouro + recursosCavT3Ouro + recursosCavT4Ouro
				+ recursosCavT5Ouro;
		String comidaCavTotalFormat = nf.format(comidaCavTotal);
		String madeiraCavTotalFormat = nf.format(madeiraCavTotal);
		String pedraCavTotalFormat = nf.format(pedraCavTotal);
		String ouroCavTotalFormat = nf.format(ouroCavTotal);
		String[] recursosCavTotalFormat = { comidaCavTotalFormat, madeiraCavTotalFormat, pedraCavTotalFormat, ouroCavTotalFormat };
		return recursosCavTotalFormat;
	}

	public double[] recursosArq() {

		double recursosArqT1Comida = 40 * t1;
		double recursosArqT1Madeira = 60 * t1;
		double recursosArqT1Pedra = 0;
		double recursosArqT1Ouro = 0;
		double recursosArqT2Comida = 0;
		double recursosArqT2Madeira = 100 * t2;
		double recursosArqT2Pedra = 75 * t2;
		double recursosArqT2Ouro = 0;
		double recursosArqT3Comida = 0;
		double recursosArqT3Madeira = 150 * t3;
		double recursosArqT3Pedra = 112 * t3;
		double recursosArqT3Ouro = 10 * t3;
		double recursosArqT4Comida = 0;
		double recursosArqT4Madeira = 300 * t4;
		double recursosArqT4Pedra = 225 * t4;
		double recursosArqT4Ouro = 20 * t4;
		double recursosArqT5Comida = 0;
		double recursosArqT5Madeira = 800 * t5;
		double recursosArqT5Pedra = 600 * t5;
		double recursosArqT5Ouro = 400 * t5;
		double comidaArqTotal = recursosArqT1Comida + recursosArqT2Comida + recursosArqT3Comida + recursosArqT4Comida
				+ recursosArqT5Comida;
		double madeiraArqTotal = recursosArqT1Madeira + recursosArqT2Madeira + recursosArqT3Madeira
				+ recursosArqT4Madeira + recursosArqT5Madeira;
		double pedraArqTotal = recursosArqT1Pedra + recursosArqT2Pedra + recursosArqT3Pedra + recursosArqT4Pedra
				+ recursosArqT5Pedra;
		double ouroArqTotal = recursosArqT1Ouro + recursosArqT2Ouro + recursosArqT3Ouro + recursosArqT4Ouro
				+ recursosArqT5Ouro;
		double[] recursosArqTotal = { comidaArqTotal, madeiraArqTotal, pedraArqTotal, ouroArqTotal };
		return recursosArqTotal;
	}

	public String[] recursosArqFormat() {

		double recursosArqT1Comida = 40 * t1;
		double recursosArqT1Madeira = 60 * t1;
		double recursosArqT1Pedra = 0;
		double recursosArqT1Ouro = 0;
		double recursosArqT2Comida = 0;
		double recursosArqT2Madeira = 100 * t2;
		double recursosArqT2Pedra = 75 * t2;
		double recursosArqT2Ouro = 0;
		double recursosArqT3Comida = 0;
		double recursosArqT3Madeira = 150 * t3;
		double recursosArqT3Pedra = 112 * t3;
		double recursosArqT3Ouro = 10 * t3;
		double recursosArqT4Comida = 0;
		double recursosArqT4Madeira = 300 * t4;
		double recursosArqT4Pedra = 225 * t4;
		double recursosArqT4Ouro = 20 * t4;
		double recursosArqT5Comida = 0;
		double recursosArqT5Madeira = 800 * t5;
		double recursosArqT5Pedra = 600 * t5;
		double recursosArqT5Ouro = 400 * t5;
		double comidaArqTotal = recursosArqT1Comida + recursosArqT2Comida + recursosArqT3Comida + recursosArqT4Comida
				+ recursosArqT5Comida;
		double madeiraArqTotal = recursosArqT1Madeira + recursosArqT2Madeira + recursosArqT3Madeira
				+ recursosArqT4Madeira + recursosArqT5Madeira;
		double pedraArqTotal = recursosArqT1Pedra + recursosArqT2Pedra + recursosArqT3Pedra + recursosArqT4Pedra
				+ recursosArqT5Pedra;
		double ouroArqTotal = recursosArqT1Ouro + recursosArqT2Ouro + recursosArqT3Ouro + recursosArqT4Ouro
				+ recursosArqT5Ouro;
		String comidaArqTotalFormat =nf.format(comidaArqTotal);
		String madeiraArqTotalFormat = nf.format(madeiraArqTotal);
		String pedraArqTotalFormat = nf.format(pedraArqTotal);
		String ouroArqTotalFormat = nf.format(ouroArqTotal);
		String[] recursosArqTotalFormat = { comidaArqTotalFormat, madeiraArqTotalFormat, pedraArqTotalFormat, ouroArqTotalFormat };
		return recursosArqTotalFormat;
	}


}
