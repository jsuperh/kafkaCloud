package com.joshuacc.kafkaCloud;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EjemploMensaje {

    private final Integer id;
    private String mensaje;

    @JsonCreator
    public EjemploMensaje(@JsonProperty("id") Integer id, @JsonProperty("mensaje") String mensaje) {
        this.id = id;
        this.mensaje = mensaje;
    }

    public Integer getId() {
        return id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "EjemploMensaje{" +
                "id=" + id +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }
}
