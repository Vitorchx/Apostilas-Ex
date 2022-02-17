/* No	código	do	exercício	anterior,	aumente	a	quantidade	de	números	que	terão	os	fatoriais	impressos:
até	 20,	 30	 e	 40.	 Em	 um	 determinado	 momento,	 além	 desse	 cálculo	 demorar,	 começará	 a	 mostrar
respostas	completamente	erradas.	Por	quê?
Mude	de		int		para		long		a	fim	de	ver	alguma	mudança.
Resposta:
Isso	acontece	porque,	a	partir	de	16!,	o	valor	ultrapassa	o	limite	superior	do	tipo		int	.	O	tipo		long	
consegue	armazenar	o	cálculo	dos	fatoriais	até	21!.	Teste! */


public class Exercicio5 {
    public static void main(String[] args) {
         long	fatorial	=	1;
         
      for	(int	n	=	1;	n	<= 20; n++) {
        fatorial = fatorial * n;
        System.out.println("Fatorial(" + n + ")=  "+ fatorial);
        
      }

      
      for	(int	n	=	1;	n	<= 30; n++) {
        fatorial = fatorial * n;
        System.out.println("Fatorial(" + n + ")=  "+ fatorial);

      }

      for	(int	n	=	1;	n	<= 40; n++) {
        fatorial = fatorial * n;
        System.out.println("Fatorial(" + n + ")=  "+ fatorial);
      }
    }

    }
 
