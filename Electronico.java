public class Electronico extends Medios {
	private String marca ;
	private String posibleProvedor;
	private int garantia;

	
	public Electronico(String tipo, String estado, String proveedor, int noInventario, float precio, String marca,
			String posibleProvedor, int garantia) {
		super(tipo, estado, proveedor, noInventario, precio);
		this.marca = marca;
		this.posibleProvedor = posibleProvedor;
		this.garantia = garantia;
	}
	@Override
	public float Costo (){
		return precio * garantia;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getGarantia() {
		return garantia;
	}
	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

}

