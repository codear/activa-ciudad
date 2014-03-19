package Singleton;

public enum LevantamientoSingleton {
	SINGLETON;

	private static String Uso;
	private static String Giro;
	private static String Responsable;
	private static String Zona;
	private static String Manzana;
	private static String Cedula;
	private static String Fecha;
	
	public static void limpiarSingleton() {
	LevantamientoSingleton.setUso(null);
	LevantamientoSingleton.setGiro(null);
	LevantamientoSingleton.setResponsable(null);
	LevantamientoSingleton.setZona(null);
	LevantamientoSingleton.setManzana(null);
	LevantamientoSingleton.setCedula(null);
	LevantamientoSingleton.setFecha(null);
	}

	public static String getUso() {
		return Uso;
	}

	public static void setUso(String uso) {
		Uso = uso;
	}

	public static String getGiro() {
		return Giro;
	}

	public static void setGiro(String giro) {
		Giro = giro;
	}

	public static String getResponsable() {
		return Responsable;
	}

	public static void setResponsable(String responsable) {
		Responsable = responsable;
	}

	public static String getZona() {
		return Zona;
	}

	public static void setZona(String zona) {
		Zona = zona;
	}

	public static String getManzana() {
		return Manzana;
	}

	public static void setManzana(String manzana) {
		Manzana = manzana;
	}

	public static String getCedula() {
		return Cedula;
	}

	public static void setCedula(String cedula) {
		Cedula = cedula;
	}

	public static String getFecha() {
		return Fecha;
	}

	public static void setFecha(String fecha) {
		Fecha = fecha;
	}

}
