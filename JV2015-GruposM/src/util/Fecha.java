package modelo;



import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

	private Calendar calendario;

	public Fecha(int a�o, int mes, int dia) {
		calendario = new GregorianCalendar(a�o, mes-1, dia);
	}

	public Fecha() {
		calendario = new GregorianCalendar(); 
	}

	public Fecha(Fecha fecha) {
		this(fecha.getA�o(), fecha.getMes(), fecha.getDia());
	}

	public int getA�o() {
		return calendario.get(Calendar.YEAR);
	}

	public int getMes() {
		return calendario.get(Calendar.MONTH) + 1 ;
	}
	

	
	public int getDia() {
		return calendario.get(Calendar.DAY_OF_MONTH);
	}
	//Clases Faltantes
	
	public int getHora() {
		return calendario.get(Calendar.HOUR) + 1 ;
	}
	
	public int getMinuto() {
		return calendario.get(Calendar.MINUTE) + 1 ;
	}
	
	public int getSegundo() {
		return calendario.get(Calendar.SECOND) + 1 ;
	}
	
	public void setHora(int hora) {
		calendario.set(Calendar.HOUR, hora);
	}
	
	public void setMinuto(int minuto) {
		calendario.set(Calendar.MINUTE, minuto);
	}
	public void setSegundo(int segundo) {
		calendario.set(Calendar.SECOND, segundo);
	}
	
	
	
	public void setA�o(int a�o) {
		calendario.set(Calendar.YEAR, a�o);
	}
	
	public void setMes(int mes) {
		calendario.set(Calendar.MONTH, mes-1);
	}
	
	public void setDia(int dia) {
		calendario.set(Calendar.DAY_OF_MONTH, dia);
	}
	
	/**
	 * Obtiene la diferencia en segundos entre dos fechas
	 * @param fecha
	 * @return n�mero de segundos
	 */
	public long difSegundos(Fecha fecha) {
		return ((calendario.getTimeInMillis() 
				- fecha.calendario.getTimeInMillis()) / 1000);
	}

	/**
	 * Obtiene la diferencia en minutos entre dos fechas
	 * @param fecha
	 * @return n�mero de minutos
	 */
	public long difMinutos(Fecha fecha) {
		return (long) (calendario.getTimeInMillis() 
				- fecha.calendario.getTimeInMillis()) / (60*1000);
	}
	
	/**
	 * Obtiene la diferencia en horas entre dos fechas
	 * @param fecha
	 * @return n�mero de horas
	 */
	public long difHoras(Fecha fecha) {
		return (long) (calendario.getTimeInMillis() 
				- fecha.calendario.getTimeInMillis()) / (60*60*1000);
	}
	
	/**
	 * Obtiene la diferencia en dias entre dos fechas
	 * @param fecha
	 * @return n�mero de dias
	 */
	public int difDias(Fecha fecha) {
		return (int) (calendario.getTimeInMillis() 
				- fecha.calendario.getTimeInMillis()) / (24*60*60*1000);
	}
	
	/**
	 * Obtiene la diferencia en semanas entre dos fechas
	 * @param fecha
	 * @return n�mero de semanas
	 */
	public int difSemanas(Fecha fecha) {
		return (int) (calendario.getTimeInMillis() 
				- fecha.calendario.getTimeInMillis()) / (7*24*60*60*1000);
	}
	
	/**
	 * Obtiene la diferencia en meses de 30 d�as entre dos fechas
	 * @param fecha
	 * @return n�mero de meses
	 */
	public int difMeses(Fecha fecha) {
		return (int) (calendario.getTimeInMillis() 
				- fecha.calendario.getTimeInMillis()) / (30*24*60*60*1000);
	}
	
	/**
	 * Obtiene la diferencia en a�os de 365 d�as entre dos fechas
	 * @param fecha
	 * @return n�mero de a�os
	 */
	public int difA�os(Fecha fecha) {
		return (int) (calendario.getTimeInMillis() 
				- fecha.calendario.getTimeInMillis()) / (365*24*60*60*1000);
	}
	
	/**
	 * A�ade una cantidad de segundos a la hora y fecha
	 * @param segundos - segundos a a�adir
	 */
	public void addSegundos(int segundos) {
		calendario.add(Calendar.SECOND, segundos);
	}
	
	/**
	 * A�ade una cantidad de minutos a la hora y fecha
	 * @param minutos - minutos a a�adir
	 */
	public void addMinutos(int minutos) {
		calendario.add(Calendar.MINUTE, minutos);
	}
	
	/**
	 * A�ade una cantidad de horas a la hora y fecha
	 * @param horas - horas a a�adir
	 */
	public void addHoras(int horas) {
		calendario.add(Calendar.HOUR, horas);
	}
	
	/**
	 * A�ade una cantidad de dias a la fecha
	 * @param dias - dias a a�adir
	 */
	public void addDias(int dias) {
		calendario.add(Calendar.DAY_OF_MONTH, dias);
	}
	
	/**
	 * A�ade una cantidad de semanas a la fecha
	 * @param semanas - semanas a a�adir
	 */
	public void addSemanas(int semanas) {
		calendario.add(Calendar.WEEK_OF_MONTH, semanas);	
	}

	/**
	 * A�ade una cantidad de meses a la fecha
	 * @param meses - meses a a�adir
	 */
	public void addMeses(int meses) {
		calendario.add(Calendar.MONTH, meses);	
	}
	
	/**
	 * A�ade una cantidad de a�os a la fecha
	 * @param a�os - a�os a a�adir
	 */
	public void addA�os(int a�os) {
		calendario.add(Calendar.YEAR, a�os);	
	}
	
	public Date toDate() {
		return calendario.getTime();
		//return new Date(calendario.getTimeInMillis());
	}
	
	public int compareTo(Fecha fecha) {
		return calendario.compareTo(fecha.calendario);
	}
	
	@Override
	public String toString() {
		return "" + getA�o() + "." + getMes() + "." + getDia();
	}

	@Override
	public boolean equals(Object obj) {
		return calendario.getTimeInMillis() 
				== ((Fecha) obj).calendario.getTimeInMillis();
	}

	@Override
	public Object clone() {
		return new Fecha(this);
	}
	
} // class