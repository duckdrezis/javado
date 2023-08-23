public class cinco {
    public static void main (String[]args){
        try{
            int n1 = 2;
            int n2 = 0; 
            
            System.out.println("Soma dos termos: "+ (n1+n2));
            System.out.println("Subtração dos termos: "+ (n1-n2));
            System.out.println("Divisão dos termos: "+ n1/n2);
            System.out.println("Multiplicação dos termos: " + n1*n2);
    
        }catch(ArithmeticException e){
            System.out.println("Erro: ArithmeticException ações com o '0'-zero são inválidas.");
        }
               
    }
    }