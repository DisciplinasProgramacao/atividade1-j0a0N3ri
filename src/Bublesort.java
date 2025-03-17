import java.time.Duration;
import java.time.LocalDate;
import java.util.Arrays;

public class Bublesort<T extends Comparable<T>> 
        implements IOrdenador {


        private long comparacoes;
        private long movimentacoes;
        private LocalDate inicio , fim ;

    @Override
    public T[] ordenar(T[] dados){

        T[] copiaDados = Arrays.copyOf(dados, dados.length);
        int tamanho =copiaDados.length;
        comparacoes = movimentacoes = 0;
        inicio = LocalDate.now();
        for(int posRefencia = tamanho -1 ; posRefencia > 0 ; posRefencia -- ){
            for(int posicao = 0 ; posicao < posRefencia ; posicao++){
                if(copiaDados[posicao].compareTo(copiaDados[posicao + 1]) > 0){
                    trocar(posicao , posicao+1, copiaDados);
               } 
            }
        }
        fim = LocalDate.now();
        return copiaDados;
        
    }


    @Override
    public long getComparacoes(){
        return comparacoes;
    }

    @Override
    public double getTempoOrdenacao(){
        return Duration.between(inicio, fim).toMillis();
    }

    @Override
    public long getMovimento(){
        return movimentacoes;
    }

    

    private void trocar(int p1 , int p2 , T[]dados){
        movimentacoes+=3;
        T temp
    }
    
    
}
