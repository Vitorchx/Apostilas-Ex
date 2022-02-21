/*  (Opcional)	 Imprima	 os	 primeiros	 números	 da	 série	 de	 Fibonacci	 até	 passar	 de	 100.	 A	 série	 de
Fibonacci	é	a	seguinte:	0,	1,	1,	2,	3,	5,	8,	13,	21,	etc.	Para	calculá-la,	o	primeiro	elemento	vale	0,	o
segundo	vale	1,	e	daí	por	diante.	O	n-ésimo	elemento	vale	o	(n-1)-ésimo	elemento	somado	ao	(n-2)-
ésimo	elemento	(ex:	8	=	5	+	3). formula que define a sequencia Fn = Fn - 1 + Fn - 2
 */


 public class Exercicio6 {
    public static void main(String[] args) {
        int fibonacci1 = 0;
        int fibonacci2 = 1;
        
    while(fibonacci2 <100 ){
        System.out.println(fibonacci2);
        int fibonacci3 = fibonacci1 + fibonacci2;
        fibonacci1= fibonacci2;
        fibonacci2= fibonacci3;
        
    }System.out.println(fibonacci2);  
        
        
        
    }
    
}
