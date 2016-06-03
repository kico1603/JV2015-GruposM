package modelo;



import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

	private Calendar calendario;

	public Fecha(int año, int mes, int dia) {
		calendario = new GregorianCalendar(año, mes-1, dia);
	}

	public Fecha() {
		calendario = new GregorianCalendar(); 
	}

	public Fecha(Fecha fecha) {
		this(fecha.getAño(), fecha.getMes(), fecha.getDia());
	}

	public int getAño() {
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
	
	
	
	public void setAño(int año) {
		calendario.set(Calendar.YEAR, año);
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
	 * @return número de segundos
	 */
	public long difSegundos(Fecha fecha) {
		return ((calendario.getTimeInMillis() 
				- fecha.calendario.getTimeInMillis()) / 1000);
	}

	/**
	 * Obtiene la diferencia en minutos entre dos fechas
	 * @param fecha
	 * @return número de minutos
	 */
	public long difMinutos(Fecha fecha) {
		return (long) (calendario.getTimeInMillis() 
				- fecha.calendario.getTimeInMillis()) / (60*1000);
	}
	
	/**
	 * Obtiene la diferencia en horas entre dos fechas
	 * @param fecha
	 * @return número de horas
	 */
	public long difHoras(Fecha fecha) {
		return (long) (calendario.getTimeInMillis() 
				- fecha.calendario.getTimeInMillis()) / (60*60*1000);
	}
	
	/**
	 * Obtiene la diferencia en dias entre dos fechas
	 * @param fecha
	 * @return número de dias
	 */
	public int difDias(Fecha fecha) {
		return (int) (calendario.getTimeInMillis() 
				- fecha.calendario.getTimeInMillis()) / (24*60*60*1000);
	}
	
	/**
	 * Obtiene la diferencia en semanas entre dos fechas
	 * @param fecha
	 * @return número de semanas
	 */
	public int difSemanas(Fecha fecha) {
		return (int) (calendario.getTimeInMillis() 
				- fecha.calendario.getTimeInMillis()) / (7*24*60*60*1000);
	}
	
	/**
	 * Obtiene la diferencia en meses de 30 días entre dos fechas
	 * @param fecha
	 * @return número de meses
	 */
	public int difMeses(Fecha fecha) {
		return (int) (calendario.getTimeInMillis() 
				- fecha.calendario.getTimeInMillis()) / (30*24*60*60*1000);
	}
	
	/**
	 * Obtiene la diferencia en años de 365 días entre dos fechas
	 * @param fecha
	 * @return número de años
	 */
	public int difAños(Fecha fecha) {
		return (int) (calendario.getTimeInMillis() 
				- fecha.calendario.getTimeInMillis()) / (365*24*60*60*1000);
	}
	
	/**
	 * Añade una cantidad de segundos a la hora y fecha
	 * @param segundos - segundos a añadir
	 */
	public void addSegundos(int segundos) {
		calendario.add(Calendar.SECOND, segundos);
	}
	
	/**
	 * Añade una cantidad de minutos a la hora y fecha
	 * @param minutos - minutos a añadir
	 */
	public void addMinutos(int minutos) {
		calendario.add(Calendar.MINUTE, minutos);
	}
	
	/**
	 * Añade una cantidad de horas a la hora y fecha
	 * @param horas - horas a añadir
	 */
	public void addHoras(int horas) {
		calendario.add(Calendar.HOUR, horas);
	}
	
	/**
	 * Añade una cantidad de dias a la fecha
	 * @param dias - dias a añadir
	 */
	public void addDias(int dias) {
		calendario.add(Calendar.DAY_OF_MONTH, dias);
	}
	
	/**
	 * Añade una cantidad de semanas a la fecha
	 * @param semanas - semanas a añadir
	 */
	public void addSemanas(int semanas) {
		calendario.add(Calendar.WEEK_OF_MONTH, semanas);	
	}

	/**
	 * Añade una cantidad de meses a la fecha
	 * @param meses - meses a añadir
	 */
	public void addMeses(int meses) {
		calendario.add(Calendar.MONTH, meses);	
	}
	
	/**
	 * Añade una cantidad de años a la fecha
	 * @param años - años a añadir
	 */
	public void addAños(int años) {
		calendario.add(Calendar.YEAR, años);	
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
		return "" + getAño() + "." + getMes() + "." + getDia();
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