package patronesdisenoprimerparcialpractica.ejercicio2Prototype;

public class ContratoDocente implements IContratoDocente{

    private double sueldo;
    private int cargaHoraria;
    private boolean cursoEducacionSuperior;
    private boolean accesoPlataforma;
    private boolean marcadoBiometrico;
    private String marcadoHoraEntrada;
    private String marcadoHoraSalida;
    private String nombre;
    private String apellido;

    public ContratoDocente(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public double getSueldo() {
        return sueldo;
    }



    public ContratoDocente setSueldo(double sueldo) {
        this.sueldo = sueldo;
        return this;
    }



    public int getCargaHoraria() {
        return cargaHoraria;
    }



    public ContratoDocente setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        return this;
    }



    public boolean isCursoEducacionSuperior() {
        return cursoEducacionSuperior;
    }



    public ContratoDocente setCursoEducacionSuperior(boolean cursoEducacionSuperior) {
        this.cursoEducacionSuperior = cursoEducacionSuperior;
        return this;
    }



    public boolean isAccesoPlataforma() {
        return accesoPlataforma;
    }



    public ContratoDocente setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
        return this;
    }



    public boolean isMarcadoBiometrico() {
        return marcadoBiometrico;
    }



    public ContratoDocente setMarcadoBiometrico(boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
        return this;
    }



    public String getMarcadoHoraEntrada() {
        return marcadoHoraEntrada;
    }



    public ContratoDocente setMarcadoHoraEntrada(String marcadoHoraEntrada) {
        this.marcadoHoraEntrada = marcadoHoraEntrada;
        return this;
    }



    public String getMarcadoHoraSalida() {
        return marcadoHoraSalida;
    }



    public ContratoDocente setMarcadoHoraSalida(String marcadoHoraSalida) {
        this.marcadoHoraSalida = marcadoHoraSalida;
        return this;
    }



    public String getNombre() {
        return nombre;
    }



    public ContratoDocente setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }



    public String getApellido() {
        return apellido;
    }



    public ContratoDocente setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }



    @Override
    public Object clone(String nombre, String apellido){
        ContratoDocente clone = new ContratoDocente(nombre, apellido);
        clone.setSueldo(this.sueldo).setCursoEducacionSuperior(this.cursoEducacionSuperior)
        .setCargaHoraria(this.cargaHoraria).setAccesoPlataforma(this.accesoPlataforma)
        .setMarcadoBiometrico(this.marcadoBiometrico).setMarcadoHoraEntrada(this.marcadoHoraEntrada)
        .setMarcadoHoraSalida(this.marcadoHoraSalida);

        return clone;
    }

    public void show(){
        System.out.println("-------------------------------------");
        System.out.println(nombre+" "+apellido);
        System.out.println("Sueldo: "+sueldo);
        System.out.println("Educacion Superior: "+cursoEducacionSuperior);
        System.out.println("Carga Horaria: "+cargaHoraria);
        System.out.println("Acceso Plataforma: "+accesoPlataforma);
        System.out.println("Marcado Biometrico: "+marcadoBiometrico);
        System.out.println("Hora Entrada: "+marcadoHoraEntrada);
        System.out.println("Hora Salida: "+marcadoHoraSalida);
    }

    
    
}
