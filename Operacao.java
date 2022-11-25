package Hospital;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Operacao {
	
	private Date inicio;
	private Date fim;
	
	
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getFim() {
		return fim;
	}
	public void setFim(Date fim) {
		this.fim = fim;
	}
	public String tempototal(Date inicio, Date fim)  {
		
		Calendar datainicio = new GregorianCalendar();

		datainicio.setTime(inicio);

		Calendar datafim = new GregorianCalendar();

		datafim.setTime(fim);
 
		long periodo = (datafim.getTimeInMillis() - datainicio.getTimeInMillis());
		long segundos = ( periodo/ 1000 ) % 60;      
		long minutos  = ( periodo / 60000 ) % 60;    
		long horas    = periodo/ 3600000;            


		return ( String.format( "%03d:%02d", horas, minutos,segundos ));
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operacao [inicio=");
		builder.append(inicio);
		builder.append(", fim=");
		builder.append(fim);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}


	
}
