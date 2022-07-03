public abstract class Medios {
	protected String tipo ;
	protected float precio;
	protected String estado; 
	protected String proveedor;
	protected int noInventario;
	

	public Medios(String tipo, String estado, String proveedor, int noInventario, float precio) {
		this.tipo = tipo;
		this.precio = precio;
		this.estado = estado;
		this.proveedor = proveedor;
		this.noInventario = noInventario;
}

	public abstract float Costo();




	

} 
