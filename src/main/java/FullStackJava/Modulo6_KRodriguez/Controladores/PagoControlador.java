package FullStackJava.Modulo6_KRodriguez.Controladores;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import FullStackJava.Modulo6_KRodriguez.Modelo.Servicios.ClienteServicio;
import FullStackJava.Modulo6_KRodriguez.Modelo.Servicios.PagoServicio;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Cliente;
import FullStackJava.Modulo6_KRodriguez.Modelo.bean.Pago;

@Controller
public class PagoControlador {
	
	@Autowired
	PagoServicio pagoAux;
	
	@Autowired
	ClienteServicio clienteAux;
	
	//Retornamos vista para crear pago.
    @RequestMapping(path = "/crear_pago", method = RequestMethod.GET)
    public String mostrarCrearPago(HttpServletRequest request) {
    	
		//Creamos ArrayList y le asignamos objetos mediante el método obtenerClientes.
    	ArrayList<Cliente> listaClientes = new ArrayList<>(clienteAux.obtenerClientes().size());
    	listaClientes.addAll(clienteAux.obtenerClientes());
		
		//Asignamos el atributo.
		request.setAttribute("clientes",listaClientes);
        return "crear_pago";
    }
    
	@PostMapping(value= "/pagoCreado")
    public String mostrarPagoCreado(HttpServletRequest request) {
		
			//Obtenemos datos de creación de pago.	
			Pago pago = new Pago();
			pago.setClienteId(Integer.parseInt(request.getParameter("cliente_id")));
			pago.setFechaPago(request.getParameter("fecha_pago"));
			pago.setMonto(Integer.parseInt(request.getParameter("monto")));

			pagoAux.crear(pago);
		
		//retornamos la vista.
        return "pago_creado";
    }
	
	//Retornamos vista para listar pagos.
    @RequestMapping(path = "/listar_pagos", method = RequestMethod.GET)
    public String mostrarListaPagos(HttpServletRequest request) {
    		
		//Creamos ArrayList y le asignamos objetos mediante el método obtenerPagos.	    	
    	ArrayList<Pago> listaPagos = new ArrayList<>(pagoAux.obtenerPagos().size());
    	listaPagos.addAll(pagoAux.obtenerPagos());
		
		//Asignamos el atributo.
		request.setAttribute("pagos",listaPagos);
		
		//retornamos la vista.
        return "listar_pagos";
    }  
}
