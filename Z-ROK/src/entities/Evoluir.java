package entities;

import java.text.NumberFormat;
import java.util.Locale;

public class Evoluir {

	Locale br = new Locale("pt");
	NumberFormat nf = NumberFormat.getInstance(br);

	public int t1;
	public int t2;
	public int t3;
	public int t4;
	public int t5;

	public int[] forT5Evo() {

		int t4ForT5Evo = 6 * t4;
		int t3ForT5Evo = 7 * t3;
		int t2ForT5Evo = 8 * t2;
		int t1ForT5Evo = 9 * t1;
		int powerTotalEvoT5 = t4ForT5Evo + t3ForT5Evo + t2ForT5Evo + t1ForT5Evo;
		int[] forT5Evo = { t4ForT5Evo, t3ForT5Evo, t2ForT5Evo, t1ForT5Evo, powerTotalEvoT5 };
		return forT5Evo;

	}

	public String[] forT5EvoFormat() {

		int t4ForT5Evo = 6 * t4;
		int t3ForT5Evo = 7 * t3;
		int t2ForT5Evo = 8 * t2;
		int t1ForT5Evo = 9 * t1;
		int powerTotalEvoT5 = t4ForT5Evo + t3ForT5Evo + t2ForT5Evo + t1ForT5Evo;
		String t4ForT5EvoFormat = nf.format(t4ForT5Evo);
		String t3ForT5EvoFormat = nf.format(t3ForT5Evo);
		String t2ForT5EvoFormat = nf.format(t2ForT5Evo);
		String t1ForT5EvoFormat = nf.format(t1ForT5Evo);
		String powerTotalEvoT5Format = nf.format(powerTotalEvoT5);
		String[] forT5EvoFormat = { t4ForT5EvoFormat, t3ForT5EvoFormat, t2ForT5EvoFormat, t1ForT5EvoFormat,
				powerTotalEvoT5Format };
		return forT5EvoFormat;
	}

	public int[] forT4Evo() {

		int t3ForT4Evo = 1 * t3;
		int t2ForT4Evo = 2 * t2;
		int t1ForT4Evo = 3 * t1;
		int powerTotalEvoT4 = t3ForT4Evo + t2ForT4Evo + t1ForT4Evo;
		int[] forT4Evo = { t3ForT4Evo, t2ForT4Evo, t1ForT4Evo, powerTotalEvoT4 };
		return forT4Evo;
	}

	public String[] forT4EvoFormat() {

		int t3ForT4Evo = 1 * t3;
		int t2ForT4Evo = 2 * t2;
		int t1ForT4Evo = 3 * t1;
		int powerTotalEvoT4 = t3ForT4Evo + t2ForT4Evo + t1ForT4Evo;
		String t3ForT4EvoFormat = nf.format(t3ForT4Evo);
		String t2ForT4EvoFormat = nf.format(t2ForT4Evo);
		String t1ForT4EvoFormat = nf.format(t1ForT4Evo);
		String powerTotalEvoT4Format = nf.format(powerTotalEvoT4);
		String[] forT4EvoFormat = { t3ForT4EvoFormat, t2ForT4EvoFormat, t1ForT4EvoFormat, powerTotalEvoT4Format };
		return forT4EvoFormat;
	}

	public int[] forT3Evo() {

		int t2ForT3Evo = 1 * t2;
		int t1ForT3Evo = 2 * t1;
		int powerTotalEvoT3 = t2ForT3Evo + t1ForT3Evo;
		int[] forT3Evo = { t2ForT3Evo, t1ForT3Evo, powerTotalEvoT3 };
		return forT3Evo;
	}

	public String[] forT3EvoFormat() {

		int t2ForT3Evo = 1 * t2;
		int t1ForT3Evo = 2 * t1;
		int powerTotalEvoT3 = t2ForT3Evo + t1ForT3Evo;
		String t2ForT3EvoFormat = nf.format(t2ForT3Evo);
		String t1ForT3EvoFormat = nf.format(t1ForT3Evo);
		String powerTotalEvoT3Format = nf.format(powerTotalEvoT3);
		String[] forT3EvoFormat = { t2ForT3EvoFormat, t1ForT3EvoFormat, powerTotalEvoT3Format };
		return forT3EvoFormat;
	}

	public int forT2Evo() {

		int t1ForT2Evo = 1 * t1;
		return t1ForT2Evo;
	}

	public String forT2EvoFormat() {

		int t1ForT2Evo = 1 * t1;
		String t1ForT2EvoFormat = nf.format(t1ForT2Evo);
		return t1ForT2EvoFormat;
	}

	public int[] recursosEvoInf(){

		int comidaInfT1ForT5 = 740 * t1;
		int madeiraInfT1ForT5 = 740 * t1;
		int pedraInfT1ForT5 = 0;
		int ouroInfT1ForT5 = 400 * t1;
		int comidaInfT2ForT5 = 700 * t2;
		int madeiraInfT2ForT5 = 700 * t2;
		int pedraInfT2ForT5 = 0;
		int ouroInfT2ForT5 = 400 * t2;
		int comidaInfT3ForT5 = 650 * t3;
		int madeiraInfT3ForT5 = 650 * t3;
		int pedraInfT3ForT5 = 0;
		int ouroInfT3ForT5 = 390 * t3;
		int comidaInfT4ForT5 = 500 * t4;
		int madeiraInfT4ForT5 = 500 * t4;
		int pedraInfT4ForT5 = 0;
		int ouroInfT4ForT5 = 380 * t4;

		int comidaInfT1ForT4 = 240 * t1;
		int madeiraInfT1ForT4 = 240 * t1;
		int pedraInfT1ForT4 = 0;
		int ouroInfT1ForT4 = 20 * t1;
		int comidaInfT2ForT4 = 200 * t2;
		int madeiraInfT2ForT4 = 200 * t2;
		int pedraInfT2ForT4 = 0;
		int ouroInfT2ForT4 = 20 * t2;
		int comidaInfT3ForT4 = 150 * t3;
		int madeiraInfT3ForT4 = 150 * t3;
		int pedraInfT3ForT4 = 0;
		int ouroInfT3ForT4 = 10 * t3;

		int comidaInfT1ForT3 = 100 * t1;
		int madeiraInfT1ForT3 = 100 * t1;
		int pedraInfT1ForT3 = 0;
		int ouroInfT1ForT3 = 10 * t1;
		int comidaInfT2ForT3 = 50 * t2;
		int madeiraInfT2ForT3 = 50 * t2;
		int pedraInfT2ForT3 = 0;
		int ouroInfT2ForT3 = 10 * t2;

		int comidaInfT1ForT2 = 50 * t1;
		int madeiraInfT1ForT2 = 50 * t1;
		int pedraInfT1ForT2 = 0;
		int ouroInfT1ForT2 = 10 * t1;

		int comidaTotalForT5Inf = comidaInfT1ForT5 + comidaInfT2ForT5 + comidaInfT3ForT5 + comidaInfT4ForT5;
		int madeiraTotalForT5Inf = madeiraInfT1ForT5 + madeiraInfT2ForT5 + madeiraInfT3ForT5 + madeiraInfT4ForT5;
		int pedraTotalForT5Inf = pedraInfT1ForT5 + pedraInfT2ForT5 + pedraInfT3ForT5 + pedraInfT4ForT5;
		int ouroTotalForT5Inf = ouroInfT1ForT5 + ouroInfT2ForT5 + ouroInfT3ForT5 + ouroInfT4ForT5;

		int comidaTotalForT4Inf = comidaInfT1ForT4 + comidaInfT2ForT4 + comidaInfT3ForT4;
		int madeiraTotalForT4Inf = madeiraInfT1ForT4 + madeiraInfT2ForT4 + madeiraInfT3ForT4;
		int pedraTotalForT4Inf = pedraInfT1ForT4 + pedraInfT2ForT4 + pedraInfT3ForT4;
		int ouroTotalForT4Inf = ouroInfT1ForT4 + ouroInfT2ForT4 + ouroInfT3ForT4;

		int comidaTotalForT3Inf = comidaInfT1ForT3 + comidaInfT2ForT3;
		int madeiraTotalForT3Inf = madeiraInfT1ForT3 + madeiraInfT2ForT3;
		int pedraTotalForT3Inf = pedraInfT1ForT3 + pedraInfT2ForT3;
		int ouroTotalForT3Inf = ouroInfT1ForT3 + ouroInfT2ForT3;

		int comidaTotalForT2Inf = comidaInfT1ForT2;
		int madeiraTotalForT2Inf = madeiraInfT1ForT2;
		int pedraTotalForT2Inf = pedraInfT1ForT2;
		int ouroTotalForT2Inf = ouroInfT1ForT2;

		int[] recursosEvoInf = { comidaTotalForT5Inf, madeiraTotalForT5Inf, pedraTotalForT5Inf, ouroTotalForT5Inf,
				comidaTotalForT4Inf, madeiraTotalForT4Inf, pedraTotalForT4Inf, ouroTotalForT4Inf, comidaTotalForT3Inf,
				madeiraTotalForT3Inf, pedraTotalForT3Inf, ouroTotalForT3Inf, comidaTotalForT2Inf, madeiraTotalForT2Inf,
				pedraTotalForT2Inf, ouroTotalForT2Inf };
		return recursosEvoInf;

	}

	public String[] recursosEvoInfFormat(){

		int comidaInfT1ForT5 = 740 * t1;
		int madeiraInfT1ForT5 = 740 * t1;
		int pedraInfT1ForT5 = 0;
		int ouroInfT1ForT5 = 400 * t1;
		int comidaInfT2ForT5 = 700 * t2;
		int madeiraInfT2ForT5 = 700 * t2;
		int pedraInfT2ForT5 = 0;
		int ouroInfT2ForT5 = 400 * t2;
		int comidaInfT3ForT5 = 650 * t3;
		int madeiraInfT3ForT5 = 650 * t3;
		int pedraInfT3ForT5 = 0;
		int ouroInfT3ForT5 = 390 * t3;
		int comidaInfT4ForT5 = 500 * t4;
		int madeiraInfT4ForT5 = 500 * t4;
		int pedraInfT4ForT5 = 0;
		int ouroInfT4ForT5 = 380 * t4;

		int comidaInfT1ForT4 = 240 * t1;
		int madeiraInfT1ForT4 = 240 * t1;
		int pedraInfT1ForT4 = 0;
		int ouroInfT1ForT4 = 20 * t1;
		int comidaInfT2ForT4 = 200 * t2;
		int madeiraInfT2ForT4 = 200 * t2;
		int pedraInfT2ForT4 = 0;
		int ouroInfT2ForT4 = 20 * t2;
		int comidaInfT3ForT4 = 150 * t3;
		int madeiraInfT3ForT4 = 150 * t3;
		int pedraInfT3ForT4 = 0;
		int ouroInfT3ForT4 = 10 * t3;

		int comidaInfT1ForT3 = 100 * t1;
		int madeiraInfT1ForT3 = 100 * t1;
		int pedraInfT1ForT3 = 0;
		int ouroInfT1ForT3 = 10 * t1;
		int comidaInfT2ForT3 = 50 * t2;
		int madeiraInfT2ForT3 = 50 * t2;
		int pedraInfT2ForT3 = 0;
		int ouroInfT2ForT3 = 10 * t2;

		int comidaInfT1ForT2 = 50 * t1;
		int madeiraInfT1ForT2 = 50 * t1;
		int pedraInfT1ForT2 = 0;
		int ouroInfT1ForT2 = 10 * t1;

		int comidaTotalForT5Inf = comidaInfT1ForT5 + comidaInfT2ForT5 + comidaInfT3ForT5 + comidaInfT4ForT5;
		int madeiraTotalForT5Inf = madeiraInfT1ForT5 + madeiraInfT2ForT5 + madeiraInfT3ForT5 + madeiraInfT4ForT5;
		int pedraTotalForT5Inf = pedraInfT1ForT5 + pedraInfT2ForT5 + pedraInfT3ForT5 + pedraInfT4ForT5;
		int ouroTotalForT5Inf = ouroInfT1ForT5 + ouroInfT2ForT5 + ouroInfT3ForT5 + ouroInfT4ForT5;

		int comidaTotalForT4Inf = comidaInfT1ForT4 + comidaInfT2ForT4 + comidaInfT3ForT4;
		int madeiraTotalForT4Inf = madeiraInfT1ForT4 + madeiraInfT2ForT4 + madeiraInfT3ForT4;
		int pedraTotalForT4Inf = pedraInfT1ForT4 + pedraInfT2ForT4 + pedraInfT3ForT4;
		int ouroTotalForT4Inf = ouroInfT1ForT4 + ouroInfT2ForT4 + ouroInfT3ForT4;

		int comidaTotalForT3Inf = comidaInfT1ForT3 + comidaInfT2ForT3;
		int madeiraTotalForT3Inf = madeiraInfT1ForT3 + madeiraInfT2ForT3;
		int pedraTotalForT3Inf = pedraInfT1ForT3 + pedraInfT2ForT3;
		int ouroTotalForT3Inf = ouroInfT1ForT3 + ouroInfT2ForT3;

		int comidaTotalForT2Inf = comidaInfT1ForT2;
		int madeiraTotalForT2Inf = madeiraInfT1ForT2;
		int pedraTotalForT2Inf = pedraInfT1ForT2;
		int ouroTotalForT2Inf = ouroInfT1ForT2;
		
		String comidaTotalForT5InfFormat = nf.format(comidaTotalForT5Inf);
		String madeiraTotalForT5InfFormat = nf.format(madeiraTotalForT5Inf);
		String pedraTotalForT5InfFormat = nf.format(pedraTotalForT5Inf);
		String ouroTotalForT5InfFormat = nf.format(ouroTotalForT5Inf);
		String comidaTotalForT4InfFormat = nf.format(comidaTotalForT4Inf);
		String madeiraTotalForT4InfFormat = nf.format(madeiraTotalForT4Inf);
		String pedraTotalForT4InfFormat = nf.format(pedraTotalForT4Inf);
		String ouroTotalForT4InfFormat = nf.format(ouroTotalForT4Inf);
		String comidaTotalForT3InfFormat = nf.format(comidaTotalForT3Inf);
		String madeiraTotalForT3InfFormat = nf.format(madeiraTotalForT3Inf);
		String pedraTotalForT3InfFormat = nf.format(pedraTotalForT3Inf);
		String ouroTotalForT3InfFormat = nf.format(ouroTotalForT3Inf);
		String comidaTotalForT2InfFormat = nf.format(comidaTotalForT2Inf);
		String madeiraTotalForT2InfFormat = nf.format(madeiraTotalForT2Inf);
		String pedraTotalForT2InfFormat = nf.format(pedraTotalForT2Inf);
		String ouroTotalForT2InfFormat = nf.format(ouroTotalForT2Inf);
		String[] recursosEvoInf = { comidaTotalForT5InfFormat, madeiraTotalForT5InfFormat, pedraTotalForT5InfFormat, ouroTotalForT5InfFormat,
				comidaTotalForT4InfFormat, madeiraTotalForT4InfFormat, pedraTotalForT4InfFormat, ouroTotalForT4InfFormat, comidaTotalForT3InfFormat,
				madeiraTotalForT3InfFormat, pedraTotalForT3InfFormat, ouroTotalForT3InfFormat, comidaTotalForT2InfFormat, madeiraTotalForT2InfFormat,
				pedraTotalForT2InfFormat, ouroTotalForT2InfFormat };
		return recursosEvoInf;

	}
	
	public int[] recursosEvoCav(){

		int comidaCavT1ForT5 = 740 * t1;
		int madeiraCavT1ForT5 = 0;
		int pedraCavT1ForT5 = 600*t1;
		int ouroCavT1ForT5 = 400 * t1;
		int comidaCavT2ForT5 = 700 * t2;
		int madeiraCavT2ForT5 = 0;
		int pedraCavT2ForT5 = 525*t2;
		int ouroCavT2ForT5 = 400 * t2;
		int comidaCavT3ForT5 = 650 * t3;
		int madeiraCavT3ForT5 = 0;
		int pedraCavT3ForT5 = 480*t3;
		int ouroCavT3ForT5 = 390 * t3;
		int comidaCavT4ForT5 = 500 * t4;
		int madeiraCavT4ForT5 = 0;
		int pedraCavT4ForT5 = 375*t4;
		int ouroCavT4ForT5 = 380 * t4;

		int comidaCavT1ForT4 = 240 * t1;
		int madeiraCavT1ForT4 = 0;
		int pedraCavT1ForT4 = 225*t1;
		int ouroCavT1ForT4 = 20* t1;
		int comidaCavT2ForT4 = 200 * t2;
		int madeiraCavT2ForT4 = 0;
		int pedraCavT2ForT4 = 150*t2;
		int ouroCavT2ForT4 = 20 * t2;
		int comidaCavT3ForT4 = 150 * t3;
		int madeiraCavT3ForT4 = 0;
		int pedraCavT3ForT4 = 113*t3;
		int ouroCavT3ForT4 = 10 * t3;

		int comidaCavT1ForT3 = 150 * t1;
		int madeiraCavT1ForT3 = 0;
		int pedraCavT1ForT3 = 113*t1;
		int ouroCavT1ForT3 = 10 * t1;
		int comidaCavT2ForT3 = 50 * t2;
		int madeiraCavT2ForT3 = 0;
		int pedraCavT2ForT3 = 37*t2;
		int ouroCavT2ForT3 = 10 * t2;

		int comidaCavT1ForT2 = 40 * t1;
		int madeiraCavT1ForT2 = 0;
		int pedraCavT1ForT2 = 75*t1;
		int ouroCavT1ForT2 = 0;

		int comidaTotalForT5Cav = comidaCavT1ForT5 + comidaCavT2ForT5 + comidaCavT3ForT5 + comidaCavT4ForT5;
		int madeiraTotalForT5Cav = madeiraCavT1ForT5 + madeiraCavT2ForT5 + madeiraCavT3ForT5 + madeiraCavT4ForT5;
		int pedraTotalForT5Cav = pedraCavT1ForT5 + pedraCavT2ForT5 + pedraCavT3ForT5 + pedraCavT4ForT5;
		int ouroTotalForT5Cav = ouroCavT1ForT5 + ouroCavT2ForT5 + ouroCavT3ForT5 + ouroCavT4ForT5;

		int comidaTotalForT4Cav = comidaCavT1ForT4 + comidaCavT2ForT4 + comidaCavT3ForT4;
		int madeiraTotalForT4Cav = madeiraCavT1ForT4 + madeiraCavT2ForT4 + madeiraCavT3ForT4;
		int pedraTotalForT4Cav = pedraCavT1ForT4 + pedraCavT2ForT4 + pedraCavT3ForT4;
		int ouroTotalForT4Cav = ouroCavT1ForT4 + ouroCavT2ForT4 + ouroCavT3ForT4;

		int comidaTotalForT3Cav = comidaCavT1ForT3 + comidaCavT2ForT3;
		int madeiraTotalForT3Cav = madeiraCavT1ForT3 + madeiraCavT2ForT3;
		int pedraTotalForT3Cav = pedraCavT1ForT3 + pedraCavT2ForT3;
		int ouroTotalForT3Cav = ouroCavT1ForT3 + ouroCavT2ForT3;

		int comidaTotalForT2Cav = comidaCavT1ForT2;
		int madeiraTotalForT2Cav = madeiraCavT1ForT2;
		int pedraTotalForT2Cav = pedraCavT1ForT2;
		int ouroTotalForT2Cav = ouroCavT1ForT2;

		int[] recursosEvoCav = { comidaTotalForT5Cav, madeiraTotalForT5Cav, pedraTotalForT5Cav, ouroTotalForT5Cav,
				comidaTotalForT4Cav, madeiraTotalForT4Cav, pedraTotalForT4Cav, ouroTotalForT4Cav, comidaTotalForT3Cav,
				madeiraTotalForT3Cav, pedraTotalForT3Cav, ouroTotalForT3Cav, comidaTotalForT2Cav, madeiraTotalForT2Cav,
				pedraTotalForT2Cav, ouroTotalForT2Cav };
		return recursosEvoCav;

	}

	public String[] recursosEvoCavFormat(){

		int comidaCavT1ForT5 = 740 * t1;
		int madeiraCavT1ForT5 = 0;
		int pedraCavT1ForT5 = 600*t1;
		int ouroCavT1ForT5 = 400 * t1;
		int comidaCavT2ForT5 = 700 * t2;
		int madeiraCavT2ForT5 = 0;
		int pedraCavT2ForT5 = 525*t2;
		int ouroCavT2ForT5 = 400 * t2;
		int comidaCavT3ForT5 = 650 * t3;
		int madeiraCavT3ForT5 = 0;
		int pedraCavT3ForT5 = 480*t3;
		int ouroCavT3ForT5 = 390 * t3;
		int comidaCavT4ForT5 = 500 * t4;
		int madeiraCavT4ForT5 = 0;
		int pedraCavT4ForT5 = 375*t4;
		int ouroCavT4ForT5 = 380 * t4;

		int comidaCavT1ForT4 = 240 * t1;
		int madeiraCavT1ForT4 = 0;
		int pedraCavT1ForT4 = 225*t1;
		int ouroCavT1ForT4 = 20* t1;
		int comidaCavT2ForT4 = 200 * t2;
		int madeiraCavT2ForT4 = 0;
		int pedraCavT2ForT4 = 150*t2;
		int ouroCavT2ForT4 = 20 * t2;
		int comidaCavT3ForT4 = 150 * t3;
		int madeiraCavT3ForT4 = 0;
		int pedraCavT3ForT4 = 113*t3;
		int ouroCavT3ForT4 = 10 * t3;

		int comidaCavT1ForT3 = 150 * t1;
		int madeiraCavT1ForT3 = 0;
		int pedraCavT1ForT3 = 113*t1;
		int ouroCavT1ForT3 = 10 * t1;
		int comidaCavT2ForT3 = 50 * t2;
		int madeiraCavT2ForT3 = 0;
		int pedraCavT2ForT3 = 37*t2;
		int ouroCavT2ForT3 = 10 * t2;

		int comidaCavT1ForT2 = 40 * t1;
		int madeiraCavT1ForT2 = 0;
		int pedraCavT1ForT2 = 75*t1;
		int ouroCavT1ForT2 = 0;

		int comidaTotalForT5Cav = comidaCavT1ForT5 + comidaCavT2ForT5 + comidaCavT3ForT5 + comidaCavT4ForT5;
		int madeiraTotalForT5Cav = madeiraCavT1ForT5 + madeiraCavT2ForT5 + madeiraCavT3ForT5 + madeiraCavT4ForT5;
		int pedraTotalForT5Cav = pedraCavT1ForT5 + pedraCavT2ForT5 + pedraCavT3ForT5 + pedraCavT4ForT5;
		int ouroTotalForT5Cav = ouroCavT1ForT5 + ouroCavT2ForT5 + ouroCavT3ForT5 + ouroCavT4ForT5;

		int comidaTotalForT4Cav = comidaCavT1ForT4 + comidaCavT2ForT4 + comidaCavT3ForT4;
		int madeiraTotalForT4Cav = madeiraCavT1ForT4 + madeiraCavT2ForT4 + madeiraCavT3ForT4;
		int pedraTotalForT4Cav = pedraCavT1ForT4 + pedraCavT2ForT4 + pedraCavT3ForT4;
		int ouroTotalForT4Cav = ouroCavT1ForT4 + ouroCavT2ForT4 + ouroCavT3ForT4;

		int comidaTotalForT3Cav = comidaCavT1ForT3 + comidaCavT2ForT3;
		int madeiraTotalForT3Cav = madeiraCavT1ForT3 + madeiraCavT2ForT3;
		int pedraTotalForT3Cav = pedraCavT1ForT3 + pedraCavT2ForT3;
		int ouroTotalForT3Cav = ouroCavT1ForT3 + ouroCavT2ForT3;

		int comidaTotalForT2Cav = comidaCavT1ForT2;
		int madeiraTotalForT2Cav = madeiraCavT1ForT2;
		int pedraTotalForT2Cav = pedraCavT1ForT2;
		int ouroTotalForT2Cav = ouroCavT1ForT2;
		
		String comidaTotalForT5CavFormat = nf.format(comidaTotalForT5Cav);
		String madeiraTotalForT5CavFormat = nf.format(madeiraTotalForT5Cav);
		String pedraTotalForT5CavFormat = nf.format(pedraTotalForT5Cav);
		String ouroTotalForT5CavFormat = nf.format(ouroTotalForT5Cav);
		String comidaTotalForT4CavFormat = nf.format(comidaTotalForT4Cav);
		String madeiraTotalForT4CavFormat = nf.format(madeiraTotalForT4Cav);
		String pedraTotalForT4CavFormat = nf.format(pedraTotalForT4Cav);
		String ouroTotalForT4CavFormat = nf.format(ouroTotalForT4Cav);
		String comidaTotalForT3CavFormat = nf.format(comidaTotalForT3Cav);
		String madeiraTotalForT3CavFormat = nf.format(madeiraTotalForT3Cav);
		String pedraTotalForT3CavFormat = nf.format(pedraTotalForT3Cav);
		String ouroTotalForT3CavFormat = nf.format(ouroTotalForT3Cav);
		String comidaTotalForT2CavFormat = nf.format(comidaTotalForT2Cav);
		String madeiraTotalForT2CavFormat = nf.format(madeiraTotalForT2Cav);
		String pedraTotalForT2CavFormat = nf.format(pedraTotalForT2Cav);
		String ouroTotalForT2CavFormat = nf.format(ouroTotalForT2Cav);
		String[] recursosEvoCav = { comidaTotalForT5CavFormat, madeiraTotalForT5CavFormat, pedraTotalForT5CavFormat, ouroTotalForT5CavFormat,
				comidaTotalForT4CavFormat, madeiraTotalForT4CavFormat, pedraTotalForT4CavFormat, ouroTotalForT4CavFormat, comidaTotalForT3CavFormat,
				madeiraTotalForT3CavFormat, pedraTotalForT3CavFormat, ouroTotalForT3CavFormat, comidaTotalForT2CavFormat, madeiraTotalForT2CavFormat,
				pedraTotalForT2CavFormat, ouroTotalForT2CavFormat };
		return recursosEvoCav;

	}

	public int[] recursosEvoArq(){

		int comidaArqT1ForT5 = 0;
		int madeiraArqT1ForT5 = 740 * t1;
		int pedraArqT1ForT5 = 600*t1;
		int ouroArqT1ForT5 = 400 * t1;
		int comidaArqT2ForT5 = 0;
		int madeiraArqT2ForT5 = 700 * t2;
		int pedraArqT2ForT5 = 525*t2;
		int ouroArqT2ForT5 = 400 * t2;
		int comidaArqT3ForT5 = 0;
		int madeiraArqT3ForT5 = 650 * t3;
		int pedraArqT3ForT5 = 488*t3;
		int ouroArqT3ForT5 = 390 * t3;
		int comidaArqT4ForT5 = 0;
		int madeiraArqT4ForT5 = 500 * t4;
		int pedraArqT4ForT5 = 375*t4;
		int ouroArqT4ForT5 = 380 * t4;

		int comidaArqT1ForT4 = 0;
		int madeiraArqT1ForT4 = 240 * t1;
		int pedraArqT1ForT4 = 225*t1;
		int ouroArqT1ForT4 = 20 * t1;
		int comidaArqT2ForT4 = 0 ;
		int madeiraArqT2ForT4 = 200 * t2;
		int pedraArqT2ForT4 = 150*t2;
		int ouroArqT2ForT4 = 20 * t2;
		int comidaArqT3ForT4 = 0;
		int madeiraArqT3ForT4 = 150 * t3;
		int pedraArqT3ForT4 = 113*t3;
		int ouroArqT3ForT4 = 10 * t3;

		int comidaArqT1ForT3 = 0;
		int madeiraArqT1ForT3 = 90 * t1;
		int pedraArqT1ForT3 = 113*t1;
		int ouroArqT1ForT3 = 10 * t1;
		int comidaArqT2ForT3 = 0;
		int madeiraArqT2ForT3 = 50 * t2;
		int pedraArqT2ForT3 = 37*t2;
		int ouroArqT2ForT3 = 10 * t2;

		int comidaArqT1ForT2 = 0;
		int madeiraArqT1ForT2 = 40 * t1;
		int pedraArqT1ForT2 = 75*t1;
		int ouroArqT1ForT2 = 0;

		int comidaTotalForT5Arq = comidaArqT1ForT5 + comidaArqT2ForT5 + comidaArqT3ForT5 + comidaArqT4ForT5;
		int madeiraTotalForT5Arq = madeiraArqT1ForT5 + madeiraArqT2ForT5 + madeiraArqT3ForT5 + madeiraArqT4ForT5;
		int pedraTotalForT5Arq = pedraArqT1ForT5 + pedraArqT2ForT5 + pedraArqT3ForT5 + pedraArqT4ForT5;
		int ouroTotalForT5Arq = ouroArqT1ForT5 + ouroArqT2ForT5 + ouroArqT3ForT5 + ouroArqT4ForT5;

		int comidaTotalForT4Arq = comidaArqT1ForT4 + comidaArqT2ForT4 + comidaArqT3ForT4;
		int madeiraTotalForT4Arq = madeiraArqT1ForT4 + madeiraArqT2ForT4 + madeiraArqT3ForT4;
		int pedraTotalForT4Arq = pedraArqT1ForT4 + pedraArqT2ForT4 + pedraArqT3ForT4;
		int ouroTotalForT4Arq = ouroArqT1ForT4 + ouroArqT2ForT4 + ouroArqT3ForT4;

		int comidaTotalForT3Arq = comidaArqT1ForT3 + comidaArqT2ForT3;
		int madeiraTotalForT3Arq = madeiraArqT1ForT3 + madeiraArqT2ForT3;
		int pedraTotalForT3Arq = pedraArqT1ForT3 + pedraArqT2ForT3;
		int ouroTotalForT3Arq = ouroArqT1ForT3 + ouroArqT2ForT3;

		int comidaTotalForT2Arq = comidaArqT1ForT2;
		int madeiraTotalForT2Arq = madeiraArqT1ForT2;
		int pedraTotalForT2Arq = pedraArqT1ForT2;
		int ouroTotalForT2Arq = ouroArqT1ForT2;

		int[] recursosEvoArq = { comidaTotalForT5Arq, madeiraTotalForT5Arq, pedraTotalForT5Arq, ouroTotalForT5Arq,
				comidaTotalForT4Arq, madeiraTotalForT4Arq, pedraTotalForT4Arq, ouroTotalForT4Arq, comidaTotalForT3Arq,
				madeiraTotalForT3Arq, pedraTotalForT3Arq, ouroTotalForT3Arq, comidaTotalForT2Arq, madeiraTotalForT2Arq,
				pedraTotalForT2Arq, ouroTotalForT2Arq };
		return recursosEvoArq;

	}

	public String[] recursosEvoArqFormat(){

		int comidaArqT1ForT5 = 0;
		int madeiraArqT1ForT5 = 740 * t1;
		int pedraArqT1ForT5 = 600*t1;
		int ouroArqT1ForT5 = 400 * t1;
		int comidaArqT2ForT5 = 0;
		int madeiraArqT2ForT5 = 700 * t2;
		int pedraArqT2ForT5 = 525*t2;
		int ouroArqT2ForT5 = 400 * t2;
		int comidaArqT3ForT5 = 0;
		int madeiraArqT3ForT5 = 650 * t3;
		int pedraArqT3ForT5 = 488*t3;
		int ouroArqT3ForT5 = 390 * t3;
		int comidaArqT4ForT5 = 0;
		int madeiraArqT4ForT5 = 500 * t4;
		int pedraArqT4ForT5 = 375*t4;
		int ouroArqT4ForT5 = 380 * t4;

		int comidaArqT1ForT4 = 0;
		int madeiraArqT1ForT4 = 240 * t1;
		int pedraArqT1ForT4 = 225*t1;
		int ouroArqT1ForT4 = 20 * t1;
		int comidaArqT2ForT4 = 0 ;
		int madeiraArqT2ForT4 = 200 * t2;
		int pedraArqT2ForT4 = 150*t2;
		int ouroArqT2ForT4 = 20 * t2;
		int comidaArqT3ForT4 = 0;
		int madeiraArqT3ForT4 = 150 * t3;
		int pedraArqT3ForT4 = 113*t3;
		int ouroArqT3ForT4 = 10 * t3;

		int comidaArqT1ForT3 = 0;
		int madeiraArqT1ForT3 = 90 * t1;
		int pedraArqT1ForT3 = 113*t1;
		int ouroArqT1ForT3 = 10 * t1;
		int comidaArqT2ForT3 = 0;
		int madeiraArqT2ForT3 = 50 * t2;
		int pedraArqT2ForT3 = 37*t2;
		int ouroArqT2ForT3 = 10 * t2;

		int comidaArqT1ForT2 = 0;
		int madeiraArqT1ForT2 = 40 * t1;
		int pedraArqT1ForT2 = 75*t1;
		int ouroArqT1ForT2 = 0;

		int comidaTotalForT5Arq = comidaArqT1ForT5 + comidaArqT2ForT5 + comidaArqT3ForT5 + comidaArqT4ForT5;
		int madeiraTotalForT5Arq = madeiraArqT1ForT5 + madeiraArqT2ForT5 + madeiraArqT3ForT5 + madeiraArqT4ForT5;
		int pedraTotalForT5Arq = pedraArqT1ForT5 + pedraArqT2ForT5 + pedraArqT3ForT5 + pedraArqT4ForT5;
		int ouroTotalForT5Arq = ouroArqT1ForT5 + ouroArqT2ForT5 + ouroArqT3ForT5 + ouroArqT4ForT5;

		int comidaTotalForT4Arq = comidaArqT1ForT4 + comidaArqT2ForT4 + comidaArqT3ForT4;
		int madeiraTotalForT4Arq = madeiraArqT1ForT4 + madeiraArqT2ForT4 + madeiraArqT3ForT4;
		int pedraTotalForT4Arq = pedraArqT1ForT4 + pedraArqT2ForT4 + pedraArqT3ForT4;
		int ouroTotalForT4Arq = ouroArqT1ForT4 + ouroArqT2ForT4 + ouroArqT3ForT4;

		int comidaTotalForT3Arq = comidaArqT1ForT3 + comidaArqT2ForT3;
		int madeiraTotalForT3Arq = madeiraArqT1ForT3 + madeiraArqT2ForT3;
		int pedraTotalForT3Arq = pedraArqT1ForT3 + pedraArqT2ForT3;
		int ouroTotalForT3Arq = ouroArqT1ForT3 + ouroArqT2ForT3;

		int comidaTotalForT2Arq = comidaArqT1ForT2;
		int madeiraTotalForT2Arq = madeiraArqT1ForT2;
		int pedraTotalForT2Arq = pedraArqT1ForT2;
		int ouroTotalForT2Arq = ouroArqT1ForT2;
		
		String comidaTotalForT5ArqFormat = nf.format(comidaTotalForT5Arq);
		String madeiraTotalForT5ArqFormat = nf.format(madeiraTotalForT5Arq);
		String pedraTotalForT5ArqFormat = nf.format(pedraTotalForT5Arq);
		String ouroTotalForT5ArqFormat = nf.format(ouroTotalForT5Arq);
		String comidaTotalForT4ArqFormat = nf.format(comidaTotalForT4Arq);
		String madeiraTotalForT4ArqFormat = nf.format(madeiraTotalForT4Arq);
		String pedraTotalForT4ArqFormat = nf.format(pedraTotalForT4Arq);
		String ouroTotalForT4ArqFormat = nf.format(ouroTotalForT4Arq);
		String comidaTotalForT3ArqFormat = nf.format(comidaTotalForT3Arq);
		String madeiraTotalForT3ArqFormat = nf.format(madeiraTotalForT3Arq);
		String pedraTotalForT3ArqFormat = nf.format(pedraTotalForT3Arq);
		String ouroTotalForT3ArqFormat = nf.format(ouroTotalForT3Arq);
		String comidaTotalForT2ArqFormat = nf.format(comidaTotalForT2Arq);
		String madeiraTotalForT2ArqFormat = nf.format(madeiraTotalForT2Arq);
		String pedraTotalForT2ArqFormat = nf.format(pedraTotalForT2Arq);
		String ouroTotalForT2ArqFormat = nf.format(ouroTotalForT2Arq);
		String[] recursosEvoArq = { comidaTotalForT5ArqFormat, madeiraTotalForT5ArqFormat, pedraTotalForT5ArqFormat, ouroTotalForT5ArqFormat,
				comidaTotalForT4ArqFormat, madeiraTotalForT4ArqFormat, pedraTotalForT4ArqFormat, ouroTotalForT4ArqFormat, comidaTotalForT3ArqFormat,
				madeiraTotalForT3ArqFormat, pedraTotalForT3ArqFormat, ouroTotalForT3ArqFormat, comidaTotalForT2ArqFormat, madeiraTotalForT2ArqFormat,
				pedraTotalForT2ArqFormat, ouroTotalForT2ArqFormat };
		return recursosEvoArq;

	}

}