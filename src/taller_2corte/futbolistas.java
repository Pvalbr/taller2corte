
package taller_2corte;

public class futbolistas {

    int id, edad, fechapartido, horapartido;
    String nombre, apellido, lugarpartido, destinopartido;
    private int numero_camisa, puesto_en_el_campo;

    public futbolistas(int id, int edad, int fechapartido, int horapartido, String nombre, String apellido, String lugarpartido, String destinopartido, int numero_camisa, int puesto_en_el_campo) {
        this.id = id;
        this.edad = edad;
        this.fechapartido = fechapartido;
        this.horapartido = horapartido;
        this.nombre = nombre;
        this.apellido = apellido;
        this.lugarpartido = lugarpartido;
        this.destinopartido = destinopartido;
        this.numero_camisa = numero_camisa;
        this.puesto_en_el_campo = puesto_en_el_campo;
    }
    
    public int getNumero_camisa() {
        return numero_camisa;
    }

    public void setNumero_camisa(int numero_camisa) {
        this.numero_camisa = numero_camisa;
    }

    public int getPuesto_en_el_campo() {
        return puesto_en_el_campo;
    }

    public void setPuesto_en_el_campo(int puesto_en_el_campo) {
        this.puesto_en_el_campo = puesto_en_el_campo;
    }

    public void concentracion(String lugarpartido, int fechapartido, int horapartido) {
        System.out.println("Lugar: " + lugarpartido);
        System.out.println("Fecha: " + fechapartido);
        System.out.println("Hora: " + horapartido);
    }

    public void viajar(String destinopartido) {
        System.out.println("Destino: " + destinopartido);
    }

    public void JugarPartidos(int cant_partidos) {
        System.out.println("Cantidad de partidos: " + cant_partidos);
    }

    public void Entrenar(String lugarentreno, int fechaentreno, int horaentreno) {
        System.out.println("Lugar: " + lugarentreno);
        System.out.println("Fecha: " + fechaentreno);
        System.out.println("Hora: " + horaentreno);
    }
}
