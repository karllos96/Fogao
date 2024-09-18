
public class Fogao {
	
	private String marca;
	private String modelo;
	private String cor;
	private int ndechamas;
	private int volumedoforno;
	
	public Fogao (String marca, String modelo, String cor, int ndechamas, int volumedoforno) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ndechamas = ndechamas;
		this.volumedoforno = volumedoforno;
	}
	
	public void ImprimirInfoFogao (){
		System.out.println("_________Fogão_________");
		System.out.println("*****"+ marca + "  " + modelo + "*****");
		System.out.println("Cor: " + cor);
		System.out.println("Número de Chamas: " + ndechamas);
		System.out.println("Volume do Forno: " + volumedoforno + "Litros");
	}
	
	public static void main(String[] args) {
		
		Fogao fogaoelectrolux = new Fogao ("Electrolux", "FE5GP", "Prata Inox", 5, 109);
		Fogao fogaoconsul = new Fogao ("Consul", "CFS5VAR", "Preto", 6, 96);
		
		fogaoelectrolux.ImprimirInfoFogao();
		fogaoconsul.ImprimirInfoFogao();
	}

}
