import java.util.HashMap;
import java.util.Map;

public class Tabela {

	Map <String, Variavel> Mapa = new HashMap <String, Variavel>();

	public void insere (String chave, String valor, String tipo) {
		Variavel Objeto = new Variavel();
		Objeto.setNome(chave);
		Objeto.setTipo(tipo);
		Objeto.setValor(valor);

		Mapa.put(chave, Objeto);
	}

	public void imprime() {
		System.out.println ("Chave	Valor	Tipo");
		for(String key:  Mapa.keySet()  ){
			String value = Mapa.get(key).getValor();
			String tipo= Mapa.get(key).getTipo();
			System.out.println(key +"	"+ value + "	"+ tipo);
		}
	}

	public String pesquisa_valor (String chave) {
		String Nome = Mapa.get(chave).getValor();
		return Nome;
	}
}