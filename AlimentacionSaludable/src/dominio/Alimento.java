package dominio;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class Alimento implements Serializable {

    
    private static final long serialVersionUID = 6106269076155338045L;
    private String nombre;
    private TipoAlimento tipo;
    private TipoAlimento[] listaTipoAlimento = inicializoTipoAlimento();
    private Nutrientes[] listaNutrientes = inicializoNutrientes();
    private boolean[] listaNutrientesSeleccionados;

   
    public Alimento() {
        this.nombre = "sin nombre";
        this.tipo = TipoAlimento.Otro;
        this.listaNutrientesSeleccionados = new boolean[listaNutrientes
                                                        .length];
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public TipoAlimento getTipo() {
        return tipo;
    }

    public void setTipo(TipoAlimento tipo) {
        this.tipo = tipo;
    }

    public Nutrientes[] getListaNutrientes() {
        Nutrientes[] lista = listaNutrientes;
        return lista;
    }

    public void setListaNutrientes(Nutrientes[] listaNutrientes) {
        this.listaNutrientes = Optional
                .ofNullable(listaNutrientes)
                .orElse(null);
    }

    public TipoAlimento[] getListaTipoAlimento() {
        TipoAlimento[] lista = listaTipoAlimento;
        return lista;
    }

    public void setListaTipoAlimento(TipoAlimento[]
                                         listaTipoAlimento) {
        this.listaTipoAlimento = Optional
                .ofNullable(listaTipoAlimento)
                .orElse(null);
    }

    public boolean[] getListaNutrientesSeleccionados() {
        boolean[] lista = listaNutrientesSeleccionados;
        return lista;
    }

    public void setListaNutrientesSeleccionados(boolean[]
                                                listaNutrientesSeleccionados) {
        this.listaNutrientesSeleccionados = Optional
                .ofNullable(listaNutrientesSeleccionados)
                .orElse(null);
    }

    public enum TipoAlimento {
        Fruta, Cereal, Legumbre, CarnesBlancas, CarnesRojas, Vegetales,
        Embutidos, Lacteos, Bebidas, Mariscos, Postres, Otro,
        ProvenienteDeAnimales
    }

    public TipoAlimento[] inicializoTipoAlimento() {
        TipoAlimento[] listaEnumPivot = {
            TipoAlimento.Bebidas, TipoAlimento.CarnesBlancas,
            TipoAlimento.CarnesRojas, TipoAlimento.Cereal,
            TipoAlimento.Embutidos, TipoAlimento.Fruta,
            TipoAlimento.Lacteos, TipoAlimento.Legumbre,
            TipoAlimento.Mariscos, TipoAlimento.Otro,
            TipoAlimento.Postres, TipoAlimento.ProvenienteDeAnimales,
            TipoAlimento.Vegetales
        };
        return listaEnumPivot;
    }

    public enum Nutrientes {
        Proteinas, Lipidos, HidratosDeCarbono, Vitaminas, Minerales, Agua,
        Fibra, Ninguno
    }

    public Nutrientes[] inicializoNutrientes() {
        Nutrientes[] listaNutrientes = {
            Nutrientes.Agua, Nutrientes.Fibra,
            Nutrientes.HidratosDeCarbono,
            Nutrientes.Lipidos, Nutrientes.Minerales,
            Nutrientes.Proteinas, Nutrientes.Vitaminas, Nutrientes.Ninguno
        };
        return listaNutrientes;
    }
 
    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    } 

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alimento other = (Alimento) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        if (!Arrays.deepEquals(this.listaTipoAlimento, other.listaTipoAlimento)) {
            return false;
        }
        if (!Arrays.deepEquals(this.listaNutrientes, other.listaNutrientes)) {
            return false;
        }
        if (!Arrays.equals(this.listaNutrientesSeleccionados, other.listaNutrientesSeleccionados)) {
            return false;
        }
        return true;
    }
    

}
