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
        this.tipo = TipoAlimento.OTRO;
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
        return listaNutrientes;        
    }

    public void setListaNutrientes(Nutrientes[] listaNutrientes) {
        this.listaNutrientes = Optional
                .ofNullable(listaNutrientes)
                .orElse(null);
    }

    public TipoAlimento[] getListaTipoAlimento() {
        return listaTipoAlimento;
    }

    public void setListaTipoAlimento(TipoAlimento[]
                                         listaTipoAlimento) {
        this.listaTipoAlimento = Optional
                .ofNullable(listaTipoAlimento)
                .orElse(null);
    }

    public boolean[] getListaNutrientesSeleccionados() {
       return listaNutrientesSeleccionados;       
    }

    public void setListaNutrientesSeleccionados(boolean[]
                                                listaNutrientesSeleccionados) {
        this.listaNutrientesSeleccionados = Optional
                .ofNullable(listaNutrientesSeleccionados)
                .orElse(null);
    }

    public enum TipoAlimento {
        
        FRUTA, CEREAL, LEGUMBRE, CARNESBLANCAS, CARNESROJAS, VEGETALES,
        EMBUTIDOS, LACTEOS, BEBIDAS, MARISCOS, POSTRES, OTRO,
        PROVENIENTEDEANIMALES
    }

    public TipoAlimento[] inicializoTipoAlimento() {
        return new TipoAlimento[]{
            TipoAlimento.BEBIDAS, TipoAlimento.CARNESBLANCAS,
            TipoAlimento.CARNESROJAS, TipoAlimento.CEREAL,
            TipoAlimento.EMBUTIDOS, TipoAlimento.FRUTA,
            TipoAlimento.LACTEOS, TipoAlimento.LEGUMBRE,
            TipoAlimento.MARISCOS, TipoAlimento.OTRO,
            TipoAlimento.POSTRES, TipoAlimento.PROVENIENTEDEANIMALES,
            TipoAlimento.VEGETALES
        };
    }

    public enum Nutrientes {
        PROTEINAS, LIPIDOS, HIDRATOSDECARBONO, VITAMINAS, MINERALES, AGUA,
        FIBRA, NINGUNO
    }

    public Nutrientes[] inicializoNutrientes() {
        return new Nutrientes[]{
            Nutrientes.AGUA, Nutrientes.FIBRA,
            Nutrientes.HIDRATOSDECARBONO,
            Nutrientes.LIPIDOS, Nutrientes.MINERALES,
            Nutrientes.PROTEINAS, Nutrientes.VITAMINAS, Nutrientes.NINGUNO
        };
    }
 
    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int hashCode() {
        return 7;
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
        return Arrays.equals(this.listaNutrientesSeleccionados, other.listaNutrientesSeleccionados);
    }
    

}
