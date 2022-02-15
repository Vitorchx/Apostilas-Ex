package ExercicioVariaveisEtiposPrimitivos;
/* Na	 empresa	 em	 que	trabalhamos,	 há	tabelas	 com	 o	 gasto	 de	 cada	 mês.	 Para	 fechar	 o	 balanço	 do
primeiro	trimestre,	 precisamos	 somar	 o	 gasto	total.	Sabendo	 que,	em	janeiro,	 foram	 gastos	 15	mil
reais,	em	fevereiro,	23	mil	reais	e,	em	março,	17	mil	reais,	faça	um	programa	que	calcule	e	imprima
a	despesa	total	no	trimestre	e	a	média	mensal	de	gastos.*/

public class variaveisEtiposPrimitivos {
    public static void main(String[] args) {
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;

        int totalTrimstre = janeiro + fevereiro + marco;

        int mediaTrimestre = totalTrimstre / 3;
        System.out.println("Valor total das despesas: R$ " + totalTrimstre);
        System.out.println("Média do trimestre: R$ " + mediaTrimestre);
    }
    
}
