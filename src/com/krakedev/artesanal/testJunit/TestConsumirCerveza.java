package com.krakedev.artesanal.testJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestConsumirCerveza {
	@Test
    public void testConsumirCerveza() {

        NegocioMejorado negocio = new NegocioMejorado();

        // Registrar cliente
        negocio.registrarCliente("Dustin", "1234567890");

        // Agregar máquina
        negocio.agregarMaquina(
                "Pilsener",
                "Cerveza artesanal",
                0.05
        );

        // Obtener cliente y máquina
        Cliente cliente = negocio.buscarClientePorCodigo("C-1");
        Maquina maquina = negocio.getMaquinas().get(0);

        assertNotNull(cliente);
        assertNotNull(maquina);

        // Llenamos la máquina
        maquina.llenarMaquina();

        double cantidadAntes = maquina.getCantidadActual();

        // Consumir 500 ml
        negocio.consumirCerveza(
                cliente.getCodigo(),
                maquina.getCodigo(),
                500
        );

        // Comprobar máquina
        assertEquals(cantidadAntes - 500, maquina.getCantidadActual());

        // Comprobar cliente
        assertEquals(25.0, cliente.getTotalConsumido());
    }
}
