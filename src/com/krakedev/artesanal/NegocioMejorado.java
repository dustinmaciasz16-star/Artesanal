package com.krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {
	
	private ArrayList<Maquina> maquinas = new ArrayList<>();
	private ArrayList<Cliente> clientes = new ArrayList<>();
	private int ultimoCodigo = 0;

    public ArrayList<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(ArrayList<Maquina> maquinas) {
        this.maquinas = maquinas;
    }
    
    public String generarCodigo() {
        int numero = (int) (Math.random() * 100) + 1;
        return "M-" + numero;
    }
    
    public boolean agregarMaquina(String nombreCerbeza, String descripcion, double precioPorML) {

        String codigo = generarCodigo();

        Maquina maquinaExistente = recuperarMaquina(codigo);

        if (maquinaExistente != null) {
            return false;
        }

        Maquina maquina = new Maquina(
                nombreCerbeza,
                descripcion,
                precioPorML,
                codigo
        );

        maquinas.add(maquina);

        return true;
    }
    
    public void cargarMaquinas() {

        for (Maquina maquina : maquinas) {
            maquina.llenarMaquina();
        }

    }
    
    public Maquina recuperarMaquina(String codigo) {

        for (Maquina maquina : maquinas) {

            if (maquina.getCodigo().equals(codigo)) {
                return maquina;
            }

        }

        return null;
    }
    
    public void registrarCliente(String nombre, String cedula) {
        ultimoCodigo++;

        String codigo = "C-" + ultimoCodigo;

        Cliente cliente = new Cliente(nombre, cedula, codigo);

        clientes.add(cliente);
    }
    
    public Cliente buscarClientePorCedula(String cedula) {

        for (Cliente cliente : clientes) {

            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }

        return null;
    }
    
    public Cliente buscarClientePorCodigo(String codigo) {

        for (Cliente cliente : clientes) {

            if (cliente.getCodigo().equals(codigo)) {
                return cliente;
            }
        }

        return null;
    }
    
    public void consumirCerveza(String codigoCliente, String codigoMaquina, double cantidad) {

        Maquina maquina = recuperarMaquina(codigoMaquina);

        Cliente cliente = buscarClientePorCodigo(codigoCliente);

        double valor = maquina.servirCerveza(cantidad);
        
        registrarConsumo(cliente, valor);
    }
    
    public void registrarConsumo(Cliente cliente, double valor) {
        cliente.agregarConsumo(valor);
    }
    
    public double consultarValorVendido() {

        double total = 0;

        for (Cliente cliente : clientes) {
            total += cliente.getTotalConsumido();
        }

        return total;
    }
    
    

}
