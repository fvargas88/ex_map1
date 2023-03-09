package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("usarname", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99087898");
		
		cookies.remove("email");
		
		System.out.println("contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		
		System.out.println("ALL COOKIES");
		for(String  key: cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}

//TreeMap ele ordena, como o exemplo � com string ele vai ordenar em ordem alfab�tica
//obs: o m�todo n�o aceita repeti��o da chave, caso haja ele vai sobrescrever a chave
