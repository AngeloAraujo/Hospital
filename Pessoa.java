package Hospital;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pessoa {

	private Date dataNascimento;
	private String nome;
	
	
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int calcularidade(java.util.Date dataNasc) {
		//Calcula a Idade baseado em java.util.Date


		Calendar dateOfBirth = new GregorianCalendar();

		dateOfBirth.setTime(dataNasc);

		 

		// Cria um objeto calendar com a data atual

		Calendar today = Calendar.getInstance();

		 

		// Obtém a idade baseado no ano

		int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);

		 

		dateOfBirth.add(Calendar.YEAR, age);

		 

		//se a data de hoje é antes da data de Nascimento, então diminui 1(um)

		if (today.before(dateOfBirth)) {

		age--;

		}

		return age;

		}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [dataNascimento=");
		builder.append(dataNascimento);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	

	
	
	
	
}
