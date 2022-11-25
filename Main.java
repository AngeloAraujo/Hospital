package Hospital;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);

		Pessoa p = new Pessoa();
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.DAY_OF_MONTH, 14);
		calendario.set(Calendar.MONTH, 5);
		calendario.set(Calendar.YEAR, 1990);
		Date dt = calendario.getTime();
			
		System.out.println("Idade do Paciente: "+p.calcularidade(dt));
		
		Atendimento atendimento = new Atendimento();
		Atestado atestado = new Atestado();
		Operacao operacao=new Operacao();
		
		atestado.emitirAtestado(atendimento);
		
		
		Calendar entrada = Calendar.getInstance();
		entrada.set(Calendar.HOUR, 10);
		entrada.set(Calendar.MINUTE, 5);
		Date entradaatendimeto = entrada.getTime();
		Calendar saida = Calendar.getInstance();
		saida.set(Calendar.HOUR, 11);
		saida.set(Calendar.MINUTE, 15);
		Date saidaatendimeto = saida.getTime();
		operacao.setInicio(entradaatendimeto);
		operacao.setFim(saidaatendimeto);
		
		System.out.println("Tempo de consulta: "+operacao.tempototal(entradaatendimeto, saidaatendimeto));
		
		System.out.println("Insira o valor da prioridade de atendimento:");
		int valor= input.nextInt();
		Boolean[] prioridade = new Boolean[valor];
		for (int i = 0; i < prioridade.length; i++) {
			prioridade[i] = true;
		}
		
		prioridade[0] = false;
		
		System.out.println("Prioridade: " +atendimento.calculaPrioridade(prioridade));
	
		input.close();
	}

}

