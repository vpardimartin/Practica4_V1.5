package org.prat4orm;

public class VillanosClass {
    private int villanoId;
    private String alias;
    private Double ataque;
    private String debilidad;
    private Double defensa;
    private Integer nivel;
    private String nombre;
    private Double vida;

    public int getVillanoId() {
        return villanoId;
    }

    public void setVillanoId(int villanoId) {
        this.villanoId = villanoId;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Double getAtaque() {
        return ataque;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public Double getDefensa() {
        return defensa;
    }

    public void setDefensa(Double defensa) {
        this.defensa = defensa;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VillanosClass that = (VillanosClass) o;

        if (villanoId != that.villanoId) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (ataque != null ? !ataque.equals(that.ataque) : that.ataque != null) return false;
        if (debilidad != null ? !debilidad.equals(that.debilidad) : that.debilidad != null) return false;
        if (defensa != null ? !defensa.equals(that.defensa) : that.defensa != null) return false;
        if (nivel != null ? !nivel.equals(that.nivel) : that.nivel != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (vida != null ? !vida.equals(that.vida) : that.vida != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = villanoId;
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + (ataque != null ? ataque.hashCode() : 0);
        result = 31 * result + (debilidad != null ? debilidad.hashCode() : 0);
        result = 31 * result + (defensa != null ? defensa.hashCode() : 0);
        result = 31 * result + (nivel != null ? nivel.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (vida != null ? vida.hashCode() : 0);
        return result;
    }
}
