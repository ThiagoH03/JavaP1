import java.util.List;
import java.util.ArrayList;

public class Questao3 {
    public static void main(String[] args){
        List<String> commodities = new ArrayList<>();
        commodities.add("Soja (SACA DE 60 KG)");
        commodities.add("Laranja Pera (CX DE 40,8 KG)");
        commodities.add("Cacau (Arroba - 15kg)");
        commodities.add("Café Arábica Tipo 6 (SACA 60 KG)");
        commodities.add("Milho (SACA 60 KG)");

        List<Double> preco = new ArrayList<>();
        preco.add(176.00);
        preco.add(45.00);
        preco.add(220.00);
        preco.add(1230.00);
        preco.add(74.77);

        for(int i = 0; i < commodities.size(); i++){
            System.out.println(commodities.get(i) + ": R$ " + preco.get(i));
        }
    }    
}
