package application;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import entities.Evoluir;
import entities.Treinar;

public class ProgramZ {

	public static void main(String[] args) {

		Locale br = new Locale("pt");
		NumberFormat nf = NumberFormat.getInstance(br);
		Scanner sc = new Scanner(System.in);

		int resp;
		int treinar;
		int evol;
		int forEvo;

		Evoluir evoInf, evoCav, evoArq;
		evoInf = new Evoluir();
		evoCav = new Evoluir();
		evoArq = new Evoluir();

		Treinar treiInf, treiCav, treiArq;
		treiInf = new Treinar();
		treiCav = new Treinar();
		treiArq = new Treinar();

		System.out.println("Você deseja treinar ou evoluir? ");
		System.out.println("Digite 1 para treinar.");
		System.out.println("Digite 2 para evoluir.");

		resp = sc.nextInt();

		if (resp == 1) {
			System.out.println("Você deseja treinar Infantaria, Cavalaria, Arquearia ou todos?");
			System.out.println("Digite 1 para treinar Infantaria.");
			System.out.println("Digite 2 para treinar Cavalaria.");
			System.out.println("Digite 3 para treinar Arquearia.");
			System.out.println("Digite 4 para treinar todos.");
			treinar = sc.nextInt();

			if (treinar == 1) {
				System.out.println("Treinar Infantaria.");
				System.out.print("Digite a quantidade de T1 que deseja treinar:");
				treiInf.t1 = sc.nextInt();
				System.out.print("Digite a quantidade de T2 que deseja treinar:");
				treiInf.t2 = sc.nextInt();
				System.out.print("Digite a quantidade de T3 que deseja treinar:");
				treiInf.t3 = sc.nextInt();
				System.out.print("Digite a quantidade de T4 que deseja treinar:");
				treiInf.t4 = sc.nextInt();
				System.out.print("Digite a quantidade de T5 que deseja treinar:");
				treiInf.t5 = sc.nextInt();

				String[] infPowerFormat = treiInf.powerFormat();
				String[] recursosInfTotalFormat = treiInf.recursosInfFormat();

				System.out.println("Poder de tropas T1 de infantaria treinada: " + infPowerFormat[0]);
				System.out.println("Poder de tropas T2 de infantaria treinada: " + infPowerFormat[1]);
				System.out.println("Poder de tropas T3 de infantaria treinada: " + infPowerFormat[2]);
				System.out.println("Poder de tropas T4 de infantaria treinada: " + infPowerFormat[3]);
				System.out.println("Poder de tropas T5 de infantaria treinada: " + infPowerFormat[4]);
				System.out.println("Poder de tropas total de infantaria treinada: " + infPowerFormat[5]);
				System.out.println();
				System.out.println("Comida necessária para treinamentos: " + recursosInfTotalFormat[0]);
				System.out.println("Madeira necessária para treinamentos: " + recursosInfTotalFormat[1]);
				System.out.println("Pedra necessária para treinamentos: " + recursosInfTotalFormat[2]);
				System.out.println("Ouro necessário para treinamentos: " + recursosInfTotalFormat[3]);

			}

			else if (treinar == 2) {
				System.out.println("Treinar Cavalaria.");
				System.out.print("Digite a quantidade de T1 que deseja treinar:");
				treiCav.t1 = sc.nextInt();
				System.out.print("Digite a quantidade de T2 que deseja treinar:");
				treiCav.t2 = sc.nextInt();
				System.out.print("Digite a quantidade de T3 que deseja treinar:");
				treiCav.t3 = sc.nextInt();
				System.out.print("Digite a quantidade de T4 que deseja treinar:");
				treiCav.t4 = sc.nextInt();
				System.out.print("Digite a quantidade de T5 que deseja treinar:");
				treiCav.t5 = sc.nextInt();

				String[] cavPowerFormat = treiCav.powerFormat();
				String[] recursosCavTotalFormat = treiCav.recursosCavFormat();

				System.out.println("Poder de tropas T1 de cavalaria treinada: " + cavPowerFormat[0]);
				System.out.println("Poder de tropas T2 de cavalaria treinada: " + cavPowerFormat[1]);
				System.out.println("Poder de tropas T3 de cavalaria treinada: " + cavPowerFormat[2]);
				System.out.println("Poder de tropas T4 de cavalaria treinada: " + cavPowerFormat[3]);
				System.out.println("Poder de tropas T5 de cavalaria treinada: " + cavPowerFormat[4]);
				System.out.println("Poder de tropas total de cavalaria treinada: " + cavPowerFormat[5]);
				System.out.println();
				System.out.println("Comida necessária para treinamentos: " + recursosCavTotalFormat[0]);
				System.out.println("Madeira necessária para treinamentos: " + recursosCavTotalFormat[1]);
				System.out.println("Pedra necessária para treinamentos: " + recursosCavTotalFormat[2]);
				System.out.println("Ouro necessário para treinamentos: " + recursosCavTotalFormat[3]);
			}

			else if (treinar == 3) {
				System.out.println("Treinar arquearia.");
				System.out.print("Digite a quantidade de T1 que deseja treinar:");
				treiArq.t1 = sc.nextInt();
				System.out.print("Digite a quantidade de T2 que deseja treinar:");
				treiArq.t2 = sc.nextInt();
				System.out.print("Digite a quantidade de T3 que deseja treinar:");
				treiArq.t3 = sc.nextInt();
				System.out.print("Digite a quantidade de T4 que deseja treinar:");
				treiArq.t4 = sc.nextInt();
				System.out.print("Digite a quantidade de T5 que deseja treinar:");
				treiArq.t5 = sc.nextInt();

				String[] arqPowerFormat = treiArq.powerFormat();
				String[] recursosArqTotalFormat = treiArq.recursosArqFormat();

				System.out.println("Poder de tropas T1 de arquearia treinada: " + arqPowerFormat[0]);
				System.out.println("Poder de tropas T2 de arquearia treinada: " + arqPowerFormat[1]);
				System.out.println("Poder de tropas T3 de arquearia treinada: " + arqPowerFormat[2]);
				System.out.println("Poder de tropas T4 de arquearia treinada: " + arqPowerFormat[3]);
				System.out.println("Poder de tropas T5 de arquearia treinada: " + arqPowerFormat[4]);
				System.out.println("Poder de tropas total de arquearia treinada: " + arqPowerFormat[5]);

				System.out.println("Comida necessária para treinamentos: " + recursosArqTotalFormat[0]);
				System.out.println("Madeira necessária para treinamentos: " + recursosArqTotalFormat[1]);
				System.out.println("Pedra necessária para treinamentos: " + recursosArqTotalFormat[2]);
				System.out.println("Ouro necessário para treinamentos: " + recursosArqTotalFormat[3]);

			}

			else if (treinar == 4) {
				System.out.println("Treinar Infantaria.");
				System.out.print("Digite a quantidade de T1 que deseja treinar:");
				treiInf.t1 = sc.nextInt();
				System.out.print("Digite a quantidade de T2 que deseja treinar:");
				treiInf.t2 = sc.nextInt();
				System.out.print("Digite a quantidade de T3 que deseja treinar:");
				treiInf.t3 = sc.nextInt();
				System.out.print("Digite a quantidade de T4 que deseja treinar:");
				treiInf.t4 = sc.nextInt();
				System.out.print("Digite a quantidade de T5 que deseja treinar:");
				treiInf.t5 = sc.nextInt();

				System.out.println("Treinar Cavalaria.");
				System.out.print("Digite a quantidade de T1 que deseja treinar:");
				treiCav.t1 = sc.nextInt();
				System.out.print("Digite a quantidade de T2 que deseja treinar:");
				treiCav.t2 = sc.nextInt();
				System.out.print("Digite a quantidade de T3 que deseja treinar:");
				treiCav.t3 = sc.nextInt();
				System.out.print("Digite a quantidade de T4 que deseja treinar:");
				treiCav.t4 = sc.nextInt();
				System.out.print("Digite a quantidade de T5 que deseja treinar:");
				treiCav.t5 = sc.nextInt();

				System.out.println("Treinar arquearia.");
				System.out.print("Digite a quantidade de T1 que deseja treinar:");
				treiArq.t1 = sc.nextInt();
				System.out.print("Digite a quantidade de T2 que deseja treinar:");
				treiArq.t2 = sc.nextInt();
				System.out.print("Digite a quantidade de T3 que deseja treinar:");
				treiArq.t3 = sc.nextInt();
				System.out.print("Digite a quantidade de T4 que deseja treinar:");
				treiArq.t4 = sc.nextInt();
				System.out.print("Digite a quantidade de T5 que deseja treinar:");
				treiArq.t5 = sc.nextInt();

				String[] infPowerFormat = treiInf.powerFormat();
				String[] cavPowerFormat = treiCav.powerFormat();
				String[] arqPowerFormat = treiArq.powerFormat();
				double powerTotal = treiInf.power() + treiCav.power() + treiArq.power();
				String powerTotalFormat = nf.format(powerTotal);
				String[] recursosInfTotalFormat = treiInf.recursosInfFormat();
				String[] recursosCavTotalFormat = treiCav.recursosCavFormat();
				String[] recursosArqTotalFormat = treiArq.recursosArqFormat();
				double[] recursosInfTotal = treiInf.recursosInf();
				double[] recursosCavTotal = treiCav.recursosCav();
				double[] recursosArqTotal = treiArq.recursosArq();
				double recursosComidaTotal = recursosInfTotal[0] + recursosCavTotal[0] + recursosArqTotal[0];
				double recursosMadeiraTotal = recursosInfTotal[1] + recursosCavTotal[1] + recursosArqTotal[1];
				double recursosPedraTotal = recursosInfTotal[2] + recursosCavTotal[2] + recursosArqTotal[2];
				double recursosOuroTotal = recursosInfTotal[3] + recursosCavTotal[3] + recursosArqTotal[3];
				String comidaTotalFormat = nf.format(recursosComidaTotal);
				String madeiraTotalFormat = nf.format(recursosMadeiraTotal);
				String pedraTotalFormat = nf.format(recursosPedraTotal);
				String ouroTotalFormat = nf.format(recursosOuroTotal);

				System.out.println("Treinamento de infantaria");
				System.out.println("Poder de tropas T1 de infantaria treinada: " + infPowerFormat[0]);
				System.out.println("Poder de tropas T2 de infantaria treinada: " + infPowerFormat[1]);
				System.out.println("Poder de tropas T3 de infantaria treinada: " + infPowerFormat[2]);
				System.out.println("Poder de tropas T4 de infantaria treinada: " + infPowerFormat[3]);
				System.out.println("Poder de tropas T5 de infantaria treinada: " + infPowerFormat[4]);
				System.out.println();
				System.out.println("Treinamento de cavalaria");
				System.out.println("Poder de tropas T1 de cavalaria treinada: " + cavPowerFormat[0]);
				System.out.println("Poder de tropas T2 de cavalaria treinada: " + cavPowerFormat[1]);
				System.out.println("Poder de tropas T3 de cavalaria treinada: " + cavPowerFormat[2]);
				System.out.println("Poder de tropas T4 de cavalaria treinada: " + cavPowerFormat[3]);
				System.out.println("Poder de tropas T5 de cavalaria treinada: " + cavPowerFormat[4]);
				System.out.println();
				System.out.println("Treinamento de arquearia");
				System.out.println("Poder de tropas T1 de arquearia treinada: " + arqPowerFormat[0]);
				System.out.println("Poder de tropas T2 de arquearia treinada: " + arqPowerFormat[1]);
				System.out.println("Poder de tropas T3 de arquearia treinada: " + arqPowerFormat[2]);
				System.out.println("Poder de tropas T4 de arquearia treinada: " + arqPowerFormat[3]);
				System.out.println("Poder de tropas T5 de arquearia treinada: " + arqPowerFormat[4]);
				System.out.println();
				System.out.println("Poder total de todos treinamentos: " + powerTotalFormat);
				System.out.println();

				System.out.println("Comida necessária para treinamentos de infantaria: " + recursosInfTotalFormat[0]);
				System.out.println("Madeira necessária para treinamentos de infantaria: " + recursosInfTotalFormat[1]);
				System.out.println("Pedra necessária para treinamentos de infantaria: " + recursosInfTotalFormat[2]);
				System.out.println("Ouro necessário para treinamentos de infantaria: " + recursosInfTotalFormat[3]);
				System.out.println();

				System.out.println("Comida necessária para treinamentos de cavalaria: " + recursosCavTotalFormat[0]);
				System.out.println("Madeira necessária para treinamentos de cavalaria: " + recursosCavTotalFormat[1]);
				System.out.println("Pedra necessária para treinamentos de cavalaria: " + recursosCavTotalFormat[2]);
				System.out.println("Ouro necessário para treinamentos de cavalaria: " + recursosCavTotalFormat[3]);
				System.out.println();

				System.out.println("Comida necessária para treinamentos de arquearia: " + recursosArqTotalFormat[0]);
				System.out.println("Madeira necessária para treinamentos de arquearia: " + recursosArqTotalFormat[1]);
				System.out.println("Pedra necessária para treinamentos de arquearia: " + recursosArqTotalFormat[2]);
				System.out.println("Ouro necessário para treinamentos de arquearia: " + recursosArqTotalFormat[3]);
				System.out.println();

				System.out.println("Comida total necessária: " + comidaTotalFormat);
				System.out.println("Madeira total necessária: " + madeiraTotalFormat);
				System.out.println("Pedra total necessária: " + pedraTotalFormat);
				System.out.println("Ouro total necessário: " + ouroTotalFormat);

			}

			else {

				System.out.println("Tentativa inválida");
			}

		}

		else if (resp == 2) {
			System.out.println("Você deseja evoluir Infantaria, Cavalaria, Arquearia ou todos?");
			System.out.println("Digite 1 para evoluir Infantaria.");
			System.out.println("Digite 2 para evoluir Cavalaria.");
			System.out.println("Digite 3 para evoluir Arquearia.");
			System.out.println("Digite 4 para evoluir todos.");
			evol = sc.nextInt();

			if (evol == 1) {
				System.out.println("Evoluir infantaria");
				System.out.println();
				System.out.println("Você deseja evoluir para T5, T4, T3 ou T2?");
				System.out.println("Digite 1 para evoluir para T5.");
				System.out.println("Digite 2 para evoluir para T4.");
				System.out.println("Digite 3 para evoluir para T3.");
				System.out.println("Digite 4 para evoluir para T2.");
				forEvo = sc.nextInt();

				if (forEvo == 1) {
					System.out.println("Evoluir Infantaria para T5.");
					System.out.println();
					System.out.print("Digite a quantidade de T4 que você deseja evoluir para T5: ");
					evoInf.t4 = sc.nextInt();
					System.out.print("Digite a quantidade de T3 que você deseja evoluir para T5: ");
					evoInf.t3 = sc.nextInt();
					System.out.print("Digite a quantidade de T2 que você deseja evoluir para T5: ");
					evoInf.t2 = sc.nextInt();
					System.out.print("Digite a quantidade de T1 que você deseja evoluir para T5: ");
					evoInf.t1 = sc.nextInt();
					System.out.println();

					String[] infForT5EvoFormat = evoInf.forT5EvoFormat();
					String[] recursosEvoInfFormat = evoInf.recursosEvoInfFormat();

					System.out.println("Poder ganho com a evolução de T4: " + infForT5EvoFormat[0]);
					System.out.println("Poder ganho com a evolução de T3: " + infForT5EvoFormat[1]);
					System.out.println("Poder ganho com a evolução de T2: " + infForT5EvoFormat[2]);
					System.out.println("Poder ganho com a evolução de T1: " + infForT5EvoFormat[3]);
					System.out.println();
					System.out.println("Poder total ganho com evoluções: " + infForT5EvoFormat[4]);
					System.out.println("Comida total para evoluções: " + recursosEvoInfFormat[0]);
					System.out.println("Madeira total para evoluções: " + recursosEvoInfFormat[1]);
					System.out.println("Pedra total para evoluções: " + recursosEvoInfFormat[2]);
					System.out.println("Ouro total para evoluções: " + recursosEvoInfFormat[3]);
				}

				else if (forEvo == 2) {
					System.out.println("Evoluir Infantaria para T4.");
					System.out.print("Digite a quantidade de T3 que você deseja evoluir para T4: ");
					evoInf.t3 = sc.nextInt();
					System.out.print("Digite a quantidade de T2 que você deseja evoluir para T4: ");
					evoInf.t2 = sc.nextInt();
					System.out.print("Digite a quantidade de T1 que você deseja evoluir para T4: ");
					evoInf.t1 = sc.nextInt();
					System.out.println();

					String[] infForT4EvoFormat = evoInf.forT4EvoFormat();
					String[] recursosEvoInfFormat = evoInf.recursosEvoInfFormat();

					System.out.println("Poder ganho com a evolução de T3: " + infForT4EvoFormat[0]);
					System.out.println("Poder ganho com a evolução de T2: " + infForT4EvoFormat[1]);
					System.out.println("Poder ganho com a evolução de T1: " + infForT4EvoFormat[2]);
					System.out.println();
					System.out.println("Poder total ganho com evoluções: " + infForT4EvoFormat[3]);
					System.out.println("Comida total para evoluções: " + recursosEvoInfFormat[0]);
					System.out.println("Madeira total para evoluções: " + recursosEvoInfFormat[1]);
					System.out.println("Pedra total para evoluções: " + recursosEvoInfFormat[2]);
					System.out.println("Ouro total para evoluções: " + recursosEvoInfFormat[3]);

				} else if (forEvo == 3) {
					System.out.println("Evoluir Infantaria para T3.");
					System.out.print("Digite a quantidade de T2 que você deseja evoluir para T3: ");
					evoInf.t2 = sc.nextInt();
					System.out.print("Digite a quantidade de T1 que você deseja evoluir para T3: ");
					evoInf.t1 = sc.nextInt();
					System.out.println();

					String[] infForT3EvoFormat = evoInf.forT3EvoFormat();
					String[] recursosEvoInfFormat = evoInf.recursosEvoInfFormat();

					System.out.println("Poder ganho com a evolução de T2: " + infForT3EvoFormat[0]);
					System.out.println("Poder ganho com a evolução de T1: " + infForT3EvoFormat[1]);
					System.out.println();
					System.out.println("Poder total ganho com evoluções: " + infForT3EvoFormat[2]);
					System.out.println("Comida total para evoluções: " + recursosEvoInfFormat[0]);
					System.out.println("Madeira total para evoluções: " + recursosEvoInfFormat[1]);
					System.out.println("Pedra total para evoluções: " + recursosEvoInfFormat[2]);
					System.out.println("Ouro total para evoluções: " + recursosEvoInfFormat[3]);
				} else if (forEvo == 4) {
					System.out.println("Evoluir Infantaria para T2.");
					System.out.print("Digite a quantidade de T1 que você deseja evoluir para T2: ");
					evoInf.t1 = sc.nextInt();
					System.out.println();
					String infForT2Evo = evoInf.forT2EvoFormat();
					String[] recursosEvoInfFormat = evoInf.recursosEvoInfFormat();
					System.out.println("Poder ganho com a evolução de T1: " + infForT2Evo);
					System.out.println("Comida total para evoluções: " + recursosEvoInfFormat[0]);
					System.out.println("Madeira total para evoluções: " + recursosEvoInfFormat[1]);
					System.out.println("Pedra total para evoluções: " + recursosEvoInfFormat[2]);
					System.out.println("Ouro total para evoluções: " + recursosEvoInfFormat[3]);

				} else {
					System.out.println("Comando inválido");
				}

			}

			else if (evol == 2) {
				System.out.println("Evoluir Cavalaria");
				System.out.println();
				System.out.println("Você deseja evoluir para T5, T4, T3 ou T2?");
				System.out.println("Digite 1 para evoluir para T5.");
				System.out.println("Digite 2 para evoluir para T4.");
				System.out.println("Digite 3 para evoluir para T3.");
				System.out.println("Digite 4 para evoluir para T2.");
				forEvo = sc.nextInt();
				if (forEvo == 1) {
					System.out.println("Evoluir Cavalaria para T5.");
					System.out.println();
					System.out.print("Digite a quantidade de T4 que você deseja evoluir para T5: ");
					evoCav.t4 = sc.nextInt();
					System.out.print("Digite a quantidade de T3 que você deseja evoluir para T5: ");
					evoCav.t3 = sc.nextInt();
					System.out.print("Digite a quantidade de T2 que você deseja evoluir para T5: ");
					evoCav.t2 = sc.nextInt();
					System.out.print("Digite a quantidade de T1 que você deseja evoluir para T5: ");
					evoCav.t1 = sc.nextInt();
					System.out.println();

					String[] cavForT5EvoFormat = evoCav.forT5EvoFormat();
					String[] recursosEvoCavFormat = evoCav.recursosEvoCavFormat();

					System.out.println("Poder ganho com a evolução de T4: " + cavForT5EvoFormat[0]);
					System.out.println("Poder ganho com a evolução de T3: " + cavForT5EvoFormat[1]);
					System.out.println("Poder ganho com a evolução de T2: " + cavForT5EvoFormat[2]);
					System.out.println("Poder ganho com a evolução de T1: " + cavForT5EvoFormat[3]);
					System.out.println();
					System.out.println("Poder total ganho com evoluções: " + cavForT5EvoFormat[4]);
					System.out.println("Comida total para evoluções: " + recursosEvoCavFormat[0]);
					System.out.println("Madeira total para evoluções: " + recursosEvoCavFormat[1]);
					System.out.println("Pedra total para evoluções: " + recursosEvoCavFormat[2]);
					System.out.println("Ouro total para evoluções: " + recursosEvoCavFormat[3]);
				} else if (forEvo == 2) {
					System.out.println("Evoluir Cavalaria para T4.");
					System.out.print("Digite a quantidade de T3 que você deseja evoluir para T4: ");
					evoCav.t3 = sc.nextInt();
					System.out.print("Digite a quantidade de T2 que você deseja evoluir para T4: ");
					evoCav.t2 = sc.nextInt();
					System.out.print("Digite a quantidade de T1 que você deseja evoluir para T4: ");
					evoCav.t1 = sc.nextInt();
					System.out.println();

					String[] cavForT4EvoFormat = evoCav.forT4EvoFormat();
					String[] recursosEvoCavFormat = evoCav.recursosEvoCavFormat();

					System.out.println("Poder ganho com a evolução de T3: " + cavForT4EvoFormat[0]);
					System.out.println("Poder ganho com a evolução de T2: " + cavForT4EvoFormat[1]);
					System.out.println("Poder ganho com a evolução de T1: " + cavForT4EvoFormat[2]);
					System.out.println();
					System.out.println("Poder total ganho com evoluções: " + cavForT4EvoFormat[3]);
					System.out.println("Comida total para evoluções: " + recursosEvoCavFormat[0]);
					System.out.println("Madeira total para evoluções: " + recursosEvoCavFormat[1]);
					System.out.println("Pedra total para evoluções: " + recursosEvoCavFormat[2]);
					System.out.println("Ouro total para evoluções: " + recursosEvoCavFormat[3]);
				} else if (forEvo == 3) {
					System.out.println("Evoluir Cavalaria para T3.");
					System.out.print("Digite a quantidade de T2 que você deseja evoluir para T3: ");
					evoCav.t2 = sc.nextInt();
					System.out.print("Digite a quantidade de T1 que você deseja evoluir para T3: ");
					evoCav.t1 = sc.nextInt();
					System.out.println();

					String[] cavForT3EvoFormat = evoCav.forT3EvoFormat();
					String[] recursosEvoCavFormat = evoCav.recursosEvoCavFormat();

					System.out.println("Poder ganho com a evolução de T2: " + cavForT3EvoFormat[0]);
					System.out.println("Poder ganho com a evolução de T1: " + cavForT3EvoFormat[1]);
					System.out.println();
					System.out.println("Poder total ganho com evoluções: " + cavForT3EvoFormat[2]);
					System.out.println("Comida total para evoluções: " + recursosEvoCavFormat[0]);
					System.out.println("Madeira total para evoluções: " + recursosEvoCavFormat[1]);
					System.out.println("Pedra total para evoluções: " + recursosEvoCavFormat[2]);
					System.out.println("Ouro total para evoluções: " + recursosEvoCavFormat[3]);
				} else if (forEvo == 4) {
					System.out.println("Evoluir Cavalaria para T2.");
					System.out.print("Digite a quantidade de T1 que você deseja evoluir para T2: ");
					evoCav.t1 = sc.nextInt();
					System.out.println();
					String cavForT2EvoFormat = evoCav.forT2EvoFormat();
					String[] recursosEvoCavFormat = evoCav.recursosEvoCavFormat();
					System.out.println("Poder ganho com a evolução de T1: " + cavForT2EvoFormat);
					System.out.println("Comida total para evoluções: " + recursosEvoCavFormat[0]);
					System.out.println("Madeira total para evoluções: " + recursosEvoCavFormat[1]);
					System.out.println("Pedra total para evoluções: " + recursosEvoCavFormat[2]);
					System.out.println("Ouro total para evoluções: " + recursosEvoCavFormat[3]);

				} else {
					System.out.println("Comando inválido");
				}

			}

			else if (evol == 3) {
				System.out.println("Evoluir Arquearia.");
				System.out.println();
				System.out.println("Você deseja evoluir para T5, T4, T3 ou T2?");
				System.out.println("Digite 1 para evoluir para T5.");
				System.out.println("Digite 2 para evoluir para T4.");
				System.out.println("Digite 3 para evoluir para T3.");
				System.out.println("Digite 4 para evoluir para T2.");
				forEvo = sc.nextInt();
				if (forEvo == 1) {
					System.out.println("Evoluir Arquearia para T5.");
					System.out.println();
					System.out.print("Digite a quantidade de T4 que você deseja evoluir para T5: ");
					evoArq.t4 = sc.nextInt();
					System.out.print("Digite a quantidade de T3 que você deseja evoluir para T5: ");
					evoArq.t3 = sc.nextInt();
					System.out.print("Digite a quantidade de T2 que você deseja evoluir para T5: ");
					evoArq.t2 = sc.nextInt();
					System.out.print("Digite a quantidade de T1 que você deseja evoluir para T5: ");
					evoArq.t1 = sc.nextInt();
					System.out.println();

					String[] arqForT5EvoFormat = evoArq.forT5EvoFormat();
					String[] recursosEvoArqFormat = evoArq.recursosEvoArqFormat();

					System.out.println("Poder ganho com a evolução de T4: " + arqForT5EvoFormat[0]);
					System.out.println("Poder ganho com a evolução de T3: " + arqForT5EvoFormat[1]);
					System.out.println("Poder ganho com a evolução de T2: " + arqForT5EvoFormat[2]);
					System.out.println("Poder ganho com a evolução de T1: " + arqForT5EvoFormat[3]);
					System.out.println();
					System.out.println("Poder total ganho com evoluções: " + arqForT5EvoFormat[4]);
					System.out.println("Comida total para evoluções: " + recursosEvoArqFormat[0]);
					System.out.println("Madeira total para evoluções: " + recursosEvoArqFormat[1]);
					System.out.println("Pedra total para evoluções: " + recursosEvoArqFormat[2]);
					System.out.println("Ouro total para evoluções: " + recursosEvoArqFormat[3]);
				} else if (forEvo == 2) {
					System.out.println("Evoluir Arquearia para T4.");
					System.out.print("Digite a quantidade de T3 que você deseja evoluir para T4: ");
					evoArq.t3 = sc.nextInt();
					System.out.print("Digite a quantidade de T2 que você deseja evoluir para T4: ");
					evoArq.t2 = sc.nextInt();
					System.out.print("Digite a quantidade de T1 que você deseja evoluir para T4: ");
					evoArq.t1 = sc.nextInt();
					System.out.println();

					String[] arqForT4EvoFormat = evoArq.forT4EvoFormat();
					String[] recursosEvoArqFormat = evoArq.recursosEvoArqFormat();

					System.out.println("Poder ganho com a evolução de T3: " + arqForT4EvoFormat[0]);
					System.out.println("Poder ganho com a evolução de T2: " + arqForT4EvoFormat[1]);
					System.out.println("Poder ganho com a evolução de T1: " + arqForT4EvoFormat[2]);
					System.out.println();
					System.out.println("Poder total ganho com evoluções: " + arqForT4EvoFormat[3]);
					System.out.println("Comida total para evoluções: " + recursosEvoArqFormat[0]);
					System.out.println("Madeira total para evoluções: " + recursosEvoArqFormat[1]);
					System.out.println("Pedra total para evoluções: " + recursosEvoArqFormat[2]);
					System.out.println("Ouro total para evoluções: " + recursosEvoArqFormat[3]);
				} else if (forEvo == 3) {
					System.out.println("Evoluir Arquearia para T3.");
					System.out.print("Digite a quantidade de T2 que você deseja evoluir para T3: ");
					evoArq.t2 = sc.nextInt();
					System.out.print("Digite a quantidade de T1 que você deseja evoluir para T3: ");
					evoArq.t1 = sc.nextInt();
					System.out.println();

					String[] arqForT3EvoFormat = evoArq.forT3EvoFormat();
					String[] recursosEvoArqFormat = evoArq.recursosEvoArqFormat();

					System.out.println("Poder ganho com a evolução de T2: " + arqForT3EvoFormat[0]);
					System.out.println("Poder ganho com a evolução de T1: " + arqForT3EvoFormat[1]);
					System.out.println();
					System.out.println("Poder total ganho com evoluções: " + arqForT3EvoFormat[2]);
					System.out.println("Comida total para evoluções: " + recursosEvoArqFormat[0]);
					System.out.println("Madeira total para evoluções: " + recursosEvoArqFormat[1]);
					System.out.println("Pedra total para evoluções: " + recursosEvoArqFormat[2]);
					System.out.println("Ouro total para evoluções: " + recursosEvoArqFormat[3]);
				} else if (forEvo == 4) {
					System.out.println("Evoluir Arquearia para T2.");
					System.out.print("Digite a quantidade de T1 que você deseja evoluir para T2: ");
					evoArq.t1 = sc.nextInt();
					System.out.println();

					String arqForT2Evo = evoArq.forT2EvoFormat();
					String[] recursosEvoArqFormat = evoArq.recursosEvoArqFormat();
					System.out.println("Poder ganho com a evolução de T1: " + arqForT2Evo);
					System.out.println("Comida total para evoluções: " + recursosEvoArqFormat[0]);
					System.out.println("Madeira total para evoluções: " + recursosEvoArqFormat[1]);
					System.out.println("Pedra total para evoluções: " + recursosEvoArqFormat[2]);
					System.out.println("Ouro total para evoluções: " + recursosEvoArqFormat[3]);
				} else {
					System.out.println("Comando inválido");
				}

			}

			else if (evol == 4) {
				System.out.println("Evoluir Todos.");
				System.out.println();
				System.out.println("Você deseja evoluir para T5, T4, T3 ou T2?");
				System.out.println("Digite 1 para evoluir para T5.");
				System.out.println("Digite 2 para evoluir para T4.");
				System.out.println("Digite 3 para evoluir para T3.");
				System.out.println("Digite 4 para evoluir para T2.");
				forEvo = sc.nextInt();
				if (forEvo == 1) {
					System.out.println("Evoluir Todos para T5.");
					System.out.println();
					System.out.println("Quantidade de tropas de Infantaria para evoluir.");
					System.out.print("Digite a quantidade de T4 de Infantaria que você deseja evoluir para T5: ");
					evoInf.t4 = sc.nextInt();
					System.out.print("Digite a quantidade de T3 de Infantaria que você deseja evoluir para T5: ");
					evoInf.t3 = sc.nextInt();
					System.out.print("Digite a quantidade de T2 de Infantaria que você deseja evoluir para T5: ");
					evoInf.t2 = sc.nextInt();
					System.out.print("Digite a quantidade de T1 de Infantaria que você deseja evoluir para T5: ");
					evoInf.t1 = sc.nextInt();
					System.out.println();

					System.out.println("Quantidade de tropas de Cavalaria para evoluir.");
					System.out.print("Digite a quantidade de T4 de Cavalaria que você deseja evoluir para T5: ");
					evoCav.t4 = sc.nextInt();
					System.out.print("Digite a quantidade de T3 de Cavalaria que você deseja evoluir para T5: ");
					evoCav.t3 = sc.nextInt();
					System.out.print("Digite a quantidade de T2 de Cavalaria que você deseja evoluir para T5: ");
					evoCav.t2 = sc.nextInt();
					System.out.print("Digite a quantidade de T1 de Cavalaria que você deseja evoluir para T5: ");
					evoCav.t1 = sc.nextInt();
					System.out.println();

					System.out.println("Quantidade de tropas de Arquearia para evoluir.");
					System.out.print("Digite a quantidade de T4 de Arquearia que você deseja evoluir para T5: ");
					evoArq.t4 = sc.nextInt();
					System.out.print("Digite a quantidade de T3 de Arquearia que você deseja evoluir para T5: ");
					evoArq.t3 = sc.nextInt();
					System.out.print("Digite a quantidade de T2 de Arquearia que você deseja evoluir para T5: ");
					evoArq.t2 = sc.nextInt();
					System.out.print("Digite a quantidade de T1 de Arquearia que você deseja evoluir para T5: ");
					evoArq.t1 = sc.nextInt();
					System.out.println();

					String[] infForT5EvoFormat = evoInf.forT5EvoFormat();
					String[] cavForT5EvoFormat = evoCav.forT5EvoFormat();
					String[] arqForT5EvoFormat = evoArq.forT5EvoFormat();
					int[] recursosEvoInf = evoInf.recursosEvoInf();
					int[] recursosEvoCav = evoCav.recursosEvoCav();
					int[] recursosEvoArq = evoArq.recursosEvoArq();
					int comidaTotal = recursosEvoInf[0] + recursosEvoCav[0] + recursosEvoArq[0];
					int madeiraTotal = recursosEvoInf[1] + recursosEvoCav[1] + recursosEvoArq[1];
					int pedraTotal = recursosEvoInf[2] + recursosEvoCav[2] + recursosEvoArq[2];
					int ouroTotal = recursosEvoInf[3] + recursosEvoCav[3] + recursosEvoArq[3];
					String comidaTotalFormat = nf.format(comidaTotal);
					String madeiraTotalFormat = nf.format(madeiraTotal);
					String pedraTotalFormat = nf.format(pedraTotal);
					String ouroTotalFormat = nf.format(ouroTotal);
					int[] infForT5Evo = evoInf.forT5Evo();
					int[] cavForT5Evo = evoCav.forT5Evo();
					int[] arqForT5Evo = evoArq.forT5Evo();
					int forT5EvoTotal = infForT5Evo[4] + cavForT5Evo[4] + arqForT5Evo[4];
					String forT5EvoTotalFormat = nf.format(forT5EvoTotal);

					System.out.println("Poder total de evolução de Infantaria: " + infForT5EvoFormat[4]);
					System.out.println("Poder total de evolução de Cavalaria: " + cavForT5EvoFormat[4]);
					System.out.println("Poder total de evolução de Arquearia: " + arqForT5EvoFormat[4]);
					System.out.println();
					System.out.println("Poder total ganho com todas evoluções: " + forT5EvoTotalFormat);
					System.out.println("Comida total para evoluções: " + comidaTotalFormat);
					System.out.println("Madeira total para evoluções: " + madeiraTotalFormat);
					System.out.println("Pedra total para evoluções: " + pedraTotalFormat);
					System.out.println("Ouro total para evoluções: " + ouroTotalFormat);

				} else if (forEvo == 2) {
					System.out.println("Evoluir Todos para T4.");
					System.out.println();
					System.out.println("Quantidade de tropas de Infantaria para evoluir.");
					System.out.print("Digite a quantidade de T3 de Infantaria que você deseja evoluir para T4: ");
					evoInf.t3 = sc.nextInt();
					System.out.print("Digite a quantidade de T2 de Infantaria que você deseja evoluir para T4: ");
					evoInf.t2 = sc.nextInt();
					System.out.print("Digite a quantidade de T1 de Infantaria que você deseja evoluir para T4: ");
					evoInf.t1 = sc.nextInt();
					System.out.println();

					System.out.println("Quantidade de tropas de Cavalaria para evoluir.");
					System.out.print("Digite a quantidade de T3 de Cavalaria que você deseja evoluir para T4: ");
					evoCav.t3 = sc.nextInt();
					System.out.print("Digite a quantidade de T2 de Cavalaria que você deseja evoluir para T4: ");
					evoCav.t2 = sc.nextInt();
					System.out.print("Digite a quantidade de T1 de Cavalaria que você deseja evoluir para T4: ");
					evoCav.t1 = sc.nextInt();
					System.out.println();

					System.out.println("Quantidade de tropas de Arquearia para evoluir.");
					System.out.print("Digite a quantidade de T3 de Arquearia que você deseja evoluir para T4: ");
					evoArq.t3 = sc.nextInt();
					System.out.print("Digite a quantidade de T2 de Arquearia que você deseja evoluir para T4: ");
					evoArq.t2 = sc.nextInt();
					System.out.print("Digite a quantidade de T1 de Arquearia que você deseja evoluir para T4: ");
					evoArq.t1 = sc.nextInt();
					System.out.println();

					String[] infForT4EvoFormat = evoInf.forT4EvoFormat();
					String[] cavForT4EvoFormat = evoCav.forT4EvoFormat();
					String[] arqForT4EvoFormat = evoArq.forT4EvoFormat();
					int[] recursosEvoInf = evoInf.recursosEvoInf();
					int[] recursosEvoCav = evoCav.recursosEvoCav();
					int[] recursosEvoArq = evoArq.recursosEvoArq();
					int comidaTotal = recursosEvoInf[0] + recursosEvoCav[0] + recursosEvoArq[0];
					int madeiraTotal = recursosEvoInf[1] + recursosEvoCav[1] + recursosEvoArq[1];
					int pedraTotal = recursosEvoInf[2] + recursosEvoCav[2] + recursosEvoArq[2];
					int ouroTotal = recursosEvoInf[3] + recursosEvoCav[3] + recursosEvoArq[3];
					String comidaTotalFormat = nf.format(comidaTotal);
					String madeiraTotalFormat = nf.format(madeiraTotal);
					String pedraTotalFormat = nf.format(pedraTotal);
					String ouroTotalFormat = nf.format(ouroTotal);
					int[] infForT4Evo = evoInf.forT4Evo();
					int[] cavForT4Evo = evoCav.forT4Evo();
					int[] arqForT4Evo = evoArq.forT4Evo();
					int forT4EvoTotal = infForT4Evo[3] + cavForT4Evo[3] + arqForT4Evo[3];
					String forT4EvoTotalFormat = nf.format(forT4EvoTotal);

					System.out.println("Poder total de evolução de Infantaria: " + infForT4EvoFormat[3]);
					System.out.println("Poder total de evolução de Cavalaria: " + cavForT4EvoFormat[3]);
					System.out.println("Poder total de evolução de Arquearia: " + arqForT4EvoFormat[3]);
					System.out.println();
					System.out.println("Poder total ganho com todas evoluções: " + forT4EvoTotalFormat);
					System.out.println("Comida total para evoluções: " + comidaTotalFormat);
					System.out.println("Madeira total para evoluções: " + madeiraTotalFormat);
					System.out.println("Pedra total para evoluções: " + pedraTotalFormat);
					System.out.println("Ouro total para evoluções: " + ouroTotalFormat);

				} else if (forEvo == 3) {
					System.out.println("Evoluir Todos para T3.");
					System.out.println();
					System.out.println("Quantidade de tropas de Infantaria para evoluir.");
					System.out.print("Digite a quantidade de T2 de Infantaria que você deseja evoluir para T3: ");
					evoInf.t2 = sc.nextInt();
					System.out.print("Digite a quantidade de T1 de Infantaria que você deseja evoluir para T3: ");
					evoInf.t1 = sc.nextInt();
					System.out.println();
					System.out.println("Quantidade de tropas de Cavalaria para evoluir.");
					System.out.print("Digite a quantidade de T2 de Cavalaria que você deseja evoluir para T3: ");
					evoCav.t2 = sc.nextInt();
					System.out.print("Digite a quantidade de T1 de Cavalaria que você deseja evoluir para T3: ");
					evoCav.t1 = sc.nextInt();
					System.out.println();
					System.out.println("Quantidade de tropas de Arquearia para evoluir.");
					System.out.print("Digite a quantidade de T2 de Arquearia que você deseja evoluir para T3: ");
					evoArq.t2 = sc.nextInt();
					System.out.print("Digite a quantidade de T1 de Arquearia que você deseja evoluir para T3: ");
					evoArq.t1 = sc.nextInt();
					System.out.println();

					String[] infForT3EvoFormat = evoInf.forT3EvoFormat();
					String[] cavForT3EvoFormat = evoCav.forT3EvoFormat();
					String[] arqForT3EvoFormat = evoArq.forT3EvoFormat();
					int[] recursosEvoInf = evoInf.recursosEvoInf();
					int[] recursosEvoCav = evoCav.recursosEvoCav();
					int[] recursosEvoArq = evoArq.recursosEvoArq();
					int comidaTotal = recursosEvoInf[0] + recursosEvoCav[0] + recursosEvoArq[0];
					int madeiraTotal = recursosEvoInf[1] + recursosEvoCav[1] + recursosEvoArq[1];
					int pedraTotal = recursosEvoInf[2] + recursosEvoCav[2] + recursosEvoArq[2];
					int ouroTotal = recursosEvoInf[3] + recursosEvoCav[3] + recursosEvoArq[3];
					String comidaTotalFormat = nf.format(comidaTotal);
					String madeiraTotalFormat = nf.format(madeiraTotal);
					String pedraTotalFormat = nf.format(pedraTotal);
					String ouroTotalFormat = nf.format(ouroTotal);
					int[] infForT3Evo = evoInf.forT3Evo();
					int[] cavForT3Evo = evoCav.forT3Evo();
					int[] arqForT3Evo = evoArq.forT3Evo();
					int forT3EvoTotal = infForT3Evo[2] + cavForT3Evo[2] + arqForT3Evo[2];
					String forT3EvoTotalFormat = nf.format(forT3EvoTotal);

					System.out.println("Poder total de evolução de Infantaria: " + infForT3EvoFormat[2]);
					System.out.println("Poder total de evolução de Cavalaria: " + cavForT3EvoFormat[2]);
					System.out.println("Poder total de evolução de Arquearia: " + arqForT3EvoFormat[2]);
					System.out.println();
					System.out.println("Poder total ganho com todas evoluções: " + forT3EvoTotalFormat);
					System.out.println("Comida total para evoluções: " + comidaTotalFormat);
					System.out.println("Madeira total para evoluções: " + madeiraTotalFormat);
					System.out.println("Pedra total para evoluções: " + pedraTotalFormat);
					System.out.println("Ouro total para evoluções: " + ouroTotalFormat);

				} else if (forEvo == 4) {
					System.out.println("Evoluir Todos para T2.");
					System.out.println();
					System.out.println("Quantidade de tropas de Infantaria para evoluir.");
					System.out.print("Digite a quantidade de T1 de Infantaria que você deseja evoluir para T2: ");
					evoInf.t1 = sc.nextInt();
					System.out.println();
					System.out.println("Quantidade de tropas de Cavalaria para evoluir.");
					System.out.print("Digite a quantidade de T1 de Cavalaria que você deseja evoluir para T2: ");
					evoCav.t1 = sc.nextInt();
					System.out.println();
					System.out.println("Quantidade de tropas de Arquearia para evoluir.");
					System.out.print("Digite a quantidade de T1 de Arquearia que você deseja evoluir para T2: ");
					evoArq.t1 = sc.nextInt();
					System.out.println();

					String infForT2EvoFormat = evoInf.forT2EvoFormat();
					String cavForT2EvoFormat = evoCav.forT2EvoFormat();
					String arqForT2EvoFormat = evoArq.forT2EvoFormat();
					int[] recursosEvoInf = evoInf.recursosEvoInf();
					int[] recursosEvoCav = evoCav.recursosEvoCav();
					int[] recursosEvoArq = evoArq.recursosEvoArq();
					int comidaTotal = recursosEvoInf[0] + recursosEvoCav[0] + recursosEvoArq[0];
					int madeiraTotal = recursosEvoInf[1] + recursosEvoCav[1] + recursosEvoArq[1];
					int pedraTotal = recursosEvoInf[2] + recursosEvoCav[2] + recursosEvoArq[2];
					int ouroTotal = recursosEvoInf[3] + recursosEvoCav[3] + recursosEvoArq[3];
					String comidaTotalFormat = nf.format(comidaTotal);
					String madeiraTotalFormat = nf.format(madeiraTotal);
					String pedraTotalFormat = nf.format(pedraTotal);
					String ouroTotalFormat = nf.format(ouroTotal);
					int infForT2Evo = evoInf.forT2Evo();
					int cavForT2Evo = evoCav.forT2Evo();
					int arqForT2Evo = evoArq.forT2Evo();
					int forT2EvoTotal = infForT2Evo + cavForT2Evo + arqForT2Evo;
					String forT2EvoTotalFormat = nf.format(forT2EvoTotal);

					System.out.println("Poder total de evolução de Infantaria: " + infForT2EvoFormat);
					System.out.println("Poder total de evolução de Cavalaria: " + cavForT2EvoFormat);
					System.out.println("Poder total de evolução de Arquearia: " + arqForT2EvoFormat);
					System.out.println();
					System.out.println("Poder total ganho com todas evoluções: " + forT2EvoTotalFormat);
					System.out.println("Comida total para evoluções: " + comidaTotalFormat);
					System.out.println("Madeira total para evoluções: " + madeiraTotalFormat);
					System.out.println("Pedra total para evoluções: " + pedraTotalFormat);
					System.out.println("Ouro total para evoluções: " + ouroTotalFormat);

				}

				else {
					System.out.println("Alternativa inválida.");

				}

			}

			else {
				System.out.println("Alternativa inválida");

			}

			sc.close();

		}
	}

}
