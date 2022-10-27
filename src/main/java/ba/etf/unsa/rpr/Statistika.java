package ba.etf.unsa.rpr;
import java.util.List;

public class Statistika {
    public static double min(List<Double> lista){
        Double min = lista.get(0);
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) < min) min = lista.get(i);
        }
        return min;

    }
    public static double max(List<Double> lista){
        Double max = lista.get(0);
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) > max) max = lista.get(i);
        }
        return max;

    }



    public static double mean(List<Double> lista){
        Double m = 0.0;
        for(int i = 0; i < lista.size(); i++){
            m += lista.get(i);
        }
        return m/lista.size();
    }

    public static Double varijansa(List<Double> lista){
            Double varijansa = 0.0;
            for(int i = 0; i < lista.size();i++){
                varijansa += Math.pow(lista.get(i) - mean(lista),2);


            }

            return varijansa / (lista.size() - 1);
    }

    public static Double standardnaDevijacija(List <Double> lista){
        return Math.sqrt(varijansa(lista));
    }
}
