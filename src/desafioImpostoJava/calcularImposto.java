package desafioImpostoJava;

import java.util.Locale;
import java.util.Scanner;

public class calcularImposto {

	public static void main(String[] args) {
		//%.1f\n
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double rendaAnualSalario;
		double rendaAnualPresServico ;
		double rendaAnualCapital;
		double gastosMedicos;
		double gastosEducaionais;
		
		double impostoSobreSalario ,impostoSobreServicos ,impostoSObreCapital;
		
		
		double gastosdedutiveis, maximoDedutiveis, impostoBruto, impostoDevido = 0;
		
		double porcImpostoBruto = 0;
		double resultGastosExtra;
		
		System.out.println("Renda anaul com salário: ");
		rendaAnualSalario = sc.nextDouble();
		System.out.println("Renda anual com prestação de serviço: ");
		rendaAnualPresServico = sc.nextDouble();
		System.out.println("Renda anual com ganho de capital: ");
		rendaAnualCapital = sc.nextDouble();
		System.out.println("Gastos médicos: ");
		gastosMedicos = sc.nextDouble();
		System.out.println("Gastos educaionais: ");
		gastosEducaionais = sc.nextDouble();
		
		if (rendaAnualSalario <= 36000) {
			System.out.println("Isento");
			
		}
		else if ((rendaAnualSalario > 36000 && rendaAnualSalario <= 59988) ) {
			impostoSobreSalario = rendaAnualSalario * 0.10;
			impostoSobreServicos = rendaAnualPresServico * 0.15;
			impostoSObreCapital = rendaAnualCapital * 0.20;
			System.out.println("Relatório de imposto de renda");
			System.out.println("");
			System.out.println("Imposto sobre salário: "+impostoSobreSalario);
			System.out.println("Imposto sobre serviço: "+impostoSobreServicos);
			System.out.println("Imposto sobre ganho de capital: "+impostoSObreCapital);
				
			
			porcImpostoBruto = impostoSobreSalario + impostoSobreServicos + impostoSObreCapital * 0.30;
			double ImpostoBruto = impostoSobreSalario + impostoSobreServicos + impostoSObreCapital;
			resultGastosExtra = gastosMedicos + gastosEducaionais;
			
			if (resultGastosExtra > porcImpostoBruto ) {
				ImpostoBruto = ImpostoBruto - porcImpostoBruto;
			} else {
				ImpostoBruto = ImpostoBruto - gastosMedicos - gastosEducaionais;
			}
			
			gastosdedutiveis = gastosEducaionais + gastosMedicos;
			impostoBruto = impostoSobreSalario + impostoSobreServicos + impostoSObreCapital;
			maximoDedutiveis = impostoBruto *0.30;
			impostoDevido = impostoBruto - maximoDedutiveis;
			
			if (maximoDedutiveis > gastosdedutiveis) {
				double impostoBrutoMenos = impostoBruto * 0.30;  
				impostoBruto= impostoBruto - impostoBrutoMenos;
			} else {
				impostoBruto = impostoBruto;
			}
			
		
			
			System.out.println("");
			
			System.out.println("Deduções");
			System.out.println("Máximo dedutível: "+maximoDedutiveis);
			System.out.println("Gastos dedutíveis: "+gastosdedutiveis);
			
			System.out.println("");
			System.out.println("Resumo");	
			System.out.println("Imposto bruto: "+impostoBruto);
			System.out.println("Abatimento: "+maximoDedutiveis);
			System.out.println("Gastos dedutíveis: "+impostoDevido);
		
		} 
		else if (rendaAnualSalario >= 60000) {
			impostoSobreSalario = rendaAnualSalario * 0.20;
			impostoSobreServicos = rendaAnualPresServico * 0.15;
			impostoSObreCapital = rendaAnualCapital * 0.20;
			System.out.println("Relatório de imposto de renda");
			System.out.println("");
			System.out.println("Imposto sobre salário: "+impostoSobreSalario);
			System.out.println("Imposto sobre serviço: "+impostoSobreServicos);
			System.out.println("Imposto sobre ganho de capital: "+impostoSObreCapital);
			
			porcImpostoBruto = impostoSobreSalario + impostoSobreServicos + impostoSObreCapital *0.30;
			double ImpostoBruto = impostoSobreSalario + impostoSobreServicos + impostoSObreCapital;
			resultGastosExtra = gastosMedicos +gastosEducaionais;
			
			if (resultGastosExtra > porcImpostoBruto ) {
				ImpostoBruto = ImpostoBruto - porcImpostoBruto;
			} else {
				ImpostoBruto = ImpostoBruto - gastosMedicos -gastosEducaionais;
			}
			
			gastosdedutiveis = gastosEducaionais + gastosMedicos;
			impostoBruto = impostoSobreSalario + impostoSobreServicos + impostoSObreCapital;
			maximoDedutiveis = impostoBruto *0.30;
			impostoDevido = impostoBruto - gastosdedutiveis;
			
			if (maximoDedutiveis < gastosdedutiveis) {
				double impostoBrutoMenos = impostoBruto * 0.30;  
				impostoBruto= impostoBruto - impostoBrutoMenos;
			} else {
				impostoBruto = impostoBruto ;
			}
			
			System.out.println("");
			
			System.out.println("Deduções");
			System.out.println("Máximo dedutível: "+maximoDedutiveis);
			System.out.println("Gastos dedutíveis: "+gastosdedutiveis);
			
			System.out.println("");
			System.out.println("Resumo");	
			System.out.println("Imposto bruto: "+impostoBruto);
			System.out.println("Abatimento: "+gastosdedutiveis);
			System.out.println("Imposto devido: "+impostoDevido);
			
			//
			

		}
	}
}