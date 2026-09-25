package com.krakedev.artesanal.testJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestConsultarValorVendido {
	@Test
    public void testConsultarValorVendido() {

        NegocioMejorado negocio = new NegocioMejorado();

        // Registrar clientes
        negocio.registrarCliente("Dustin", "1234567890");
        negocio.registrarCliente("Kevin", "0987654321");

        // Agregar máquina
        negocio.agregarMaquina(
                "Pilsener",
                "Cerveza artesanal",
                0.05
        );

        Maquina maquina = negocio.getMaquinas().get(0);

        // Llenar máquina
        maquina.llenarMaquina();

        // Obtener clientes
        Cliente cliente1 = negocio.buscarClientePorCodigo("C-1");
        Cliente cliente2 = negocio.buscarClientePorCodigo("C-2");

        // Consumo del cliente 1: 500 ml × 0.05 = 25
        negocio.consumirCerveza(
                cliente1.getCodigo(),
                maquina.getCodigo(),
                500
        );

        // Consumo del cliente 2: 200 ml × 0.05 = 10
        negocio.consumirCerveza(
                cliente2.getCodigo(),
                maquina.getCodigo(),
                200
        );

        // Total vendido: 25 + 10 = 35
        double totalVendido = negocio.consultarValorVendido();

        assertEquals(35.0, totalVendido);
    }
}
