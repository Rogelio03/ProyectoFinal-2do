public class Mobiliario extends Medios {
	private int tiempoEx;
	private String local; 





	
	 	public Mobiliario(String tipo, String estado, String proveedor, int noInventario, float precio, int tiempoEx,
			String local) {
		super(tipo, estado, proveedor, noInventario, precio);
		this.tiempoEx = tiempoEx;
		this.local = local;
	}






		@Override
	public float Costo() {
          float aux = 0;
          aux = precio * tiempoEx;
		
		  switch (local) {
			case "aula":
                    return aux + 20;
				
            case "laboratorio":
			        return aux + 30;
				
            case "apartamento":
                    return aux + 40;
				
			case "oficina":
				    return aux + 50;
				

			default:
				   return 0;
                
		}
	}


        
}
