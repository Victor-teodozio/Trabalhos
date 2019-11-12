public class Teste {

	public static void main(String[] args) {
		Filme shrek = new Filme("shrek", 2002,1);
		Copia copia = new Copia(shrek,1);
		Socio socio = new Socio("Victor","Rua01","88");
        Locacao locacao = new Locacao(socio,shrek);
       
        System.out.println(locacao);
        
	}
}
