package patronesdisenoprimerparcialpractica.ejercicio2Prototype;

public class Main {
    public static void main(String[] args) {
        ContratoDocente d1 = new ContratoDocente("Julio", "Cesar");
        d1.setSueldo(5000.0).setCursoEducacionSuperior(true)
        .setCargaHoraria(80).setAccesoPlataforma(true)
        .setMarcadoBiometrico(false).setMarcadoHoraEntrada("08:00")
        .setMarcadoHoraSalida("18:00");

        ContratoDocente d2 = (ContratoDocente) d1.clone("Javier", "Santos");
        ContratoDocente d3 = (ContratoDocente) d1.clone("Sandra", "Molina");
        ContratoDocente d4 = (ContratoDocente) d1.clone("Javier", "Molina");
        ContratoDocente d5 = (ContratoDocente) d1.clone("Rosa", "Santos");
        ContratoDocente d6 = (ContratoDocente) d1.clone("Laura", "Monterrey");
        ContratoDocente d7 = (ContratoDocente) d1.clone("Carlos", "Rosales");
        ContratoDocente d8 = (ContratoDocente) d1.clone("Maria", "Perez");
        ContratoDocente d9 = (ContratoDocente) d1.clone("Natalia", "Sanchez");
        ContratoDocente d10 = (ContratoDocente) d1.clone("Carlos", "Rosales");
        ContratoDocente d11 = (ContratoDocente) d1.clone("Javier", "Carrasco");
        ContratoDocente d12 = (ContratoDocente) d1.clone("Juan", "Sanchez");
        ContratoDocente d13 = (ContratoDocente) d1.clone("Miranda", "Torrez");
        ContratoDocente d14 = (ContratoDocente) d1.clone("Carlos", "Perez");
        ContratoDocente d15 = (ContratoDocente) d1.clone("Natalia", "Carrasco");

        d1.show();
        d2.show();
        d3.show();
        d4.show();
        d5.show();
        d6.show();
        d7.show();
        d8.show();
        d9.show();
        d10.show();
        d11.show();
        d12.show();
        d13.show();
        d14.show();
        d15.show();
    }
}
