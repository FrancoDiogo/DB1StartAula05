package br.com.db1;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //int zero = 0;
        Integer zeroObjeto = 0;
        zeroObjeto.doubleValue();
        zeroObjeto.toString();//transformar em string
        
        char vogal = 'a';
        String vogalString = "a";
        vogalString.trim();
        
        double umPontoDois = 1.2;
        Double valor = 1.2;
        Double valor2 = 2.0;
        
        Float valor3 = 3f;
        
        BigDecimal dinheiro = BigDecimal.ZERO;
        
        //-----------------FOR MAIS USADO, 1 SO LINHA TODAS AS INFORMACOES
        for (Integer x = 0; x < 100; x++){}
        //-----------------
        
        Integer x = 0;
        while (x<100){
        	x++;
        }
        
        //-----------------DO WHILE EH O PIOR!
        do{
        	
        } while (x<100);
        
        
        x % 2 == 0 : "eh par" ? "eh impar";
        
        
        int[] matriz = {1,2,3,4};
        int matriz22 = 1;
        
        Integer[] matrizInteger = {1,2,3,4};
        
        List<Integer> valores = new ArrayList<Integer>();
        List<Integer> valoresLinkado = new LinkedList<Integer>();
        
        Set<Integer> valoresNaoRepetidos = new HashSet<Integer>();
        
        List<String> nomes;
        List<Dinheiro> meuSalario;
 
    }
}