
import java.util.Scanner;


public class Loops {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        /*
        //CONTE ATÉ 10
        
        int i;
        i = 0;
        
        while(i<=100){
            System.out.println("O valor é: " + i);
            //i = i + 1;
            i+=10;
        }
        System.out.println("FIM de 0 a 10! \n");
        
        // CONTAR DE 100 A 0
        
        int j;
        j = 100;
        
        while(j >= 0){
            System.out.println("O valor é: " + j);
            j -= 10;
        }
        System.out.println("FIM de 10 a 0!");
        
        
        int usuario;
        int contador;
        
        System.out.print("Digite um numero de 1 a 100: ");
        usuario = scanner.nextInt();
        contador = 0;
        
        while(contador <= usuario){
            System.out.println("Estamos contando de 2 em 2!: \n" + contador);
            contador += 2;    
        }
        System.out.println("FIM dessa contagem até " + usuario);
        
        
        
        int usuario2;
        int contador2;
        int intervalo;
        
        System.out.print("Digite um numero de 1 a 100: ");
        usuario2 = scanner.nextInt();
        System.out.println("Qual intervalo quer contar?");
        intervalo = scanner.nextInt();
        
        contador2 = 0;
        
        while(contador2 <= usuario2){
            System.out.println("Estamos contando de " + intervalo +  " em " + intervalo + "!: \n" + contador2);
            contador2 += intervalo;    
        }
        System.out.println("FIM dessa contagem até " + usuario2);
        
        
        //SOMADOR NUMERICO
        
        int usuario3;
        int soma;
        int contador3;
        int valor;
        int maior;
        int menor;
        
        
        System.out.println("Quantos numeros vamos somar?: ");
        usuario3 = scanner.nextInt();
        soma = 0;
        contador3 = 0;
        maior = 0;
        menor = Integer.MAX_VALUE;
        
        while(contador3 < usuario3){
            System.out.println("Digite um valor: ");
            valor = scanner.nextInt();
            if(valor > maior){
                maior = valor;
            }
            if(valor < menor){
                menor = valor;
            }
            
            soma += valor;
            contador3 ++;
        }
        
        System.out.println("A soma de todos os numeros e: " + soma);
        System.out.println("E o maior numero digitado foi: " + maior);
        System.out.println("E o menor numero digitado foi: " + menor);
        
        
        //CONVERSOR DE MOEDA
        
        double realBR;
        double dolarCAD;
        int contadorMoeda;
        int quant;
        
        contadorMoeda = 1;
        
        System.out.println("Quantos valores vc quer converter?");
        quant = scanner.nextInt();
        
        
        while(contadorMoeda <= ){
            System.out.print("Qual o valor em R$?: ");
            realBR = scanner.nextDouble();
            dolarCAD = realBR/3.8;
            System.out.print("O valor convertido para dolar CAD é: " + 
                    String.format("%-7.2f", dolarCAD) + "\n");
            contadorMoeda++;    
        }
        */
        
        //CONTADOR
        
        /*int inicio;
        int fim;
        
        System.out.print("Inicio: ");
        inicio = scanner.nextInt();
        System.out.print("Fim: ");
        fim = scanner.nextInt();
        
        if(inicio > fim){
            
            System.out.println(inicio);
            inicio --;
            System.out.println(inicio);
            
        } else {
            inicio ++;
            System.out.println(inicio);
            inicio ++;
            System.out.println(inicio);
        }
        
        System.out.println("Fim da contagem");
        */
        
        //MELHOR ALUNO
        
        /*
        String aluno1;
        String aluno2;
        String aluno3;
        String aluno4;
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double maiorNota;
        String melhorAluno;
        
        System.out.print("Aluno 1 \n"
                + "Nome do aluno: ");
        aluno1 = scanner.next();
        System.out.print("Nota de " + aluno1 + ": ");
        nota1 = scanner.nextDouble();
        System.out.println("---------------------");
        
        System.out.print("Aluno 2 \n"
                + "Nome do aluno: ");
        aluno2 = scanner.next();
        System.out.print("Nota de " + aluno2 + ": ");
        nota2 = scanner.nextDouble();
        System.out.println("---------------------");
        
        System.out.print("Aluno 3 \n"
                + "Nome do aluno: ");
        aluno3 = scanner.next();
        System.out.print("Nota de " + aluno3 + ": ");
        nota3 = scanner.nextDouble();
        System.out.println("---------------------");
        
        System.out.print("Aluno 4 \n"
                + "Nome do aluno: ");
        aluno4 = scanner.next();
        System.out.print("Nota de " + aluno4 + ": ");
        nota4 = scanner.nextDouble();
        System.out.println("---------------------");
        
        
        if(nota1 > nota2 && 
                   nota1 > nota3 &&
                   nota1 > nota4){
            
            maiorNota = nota1;
            melhorAluno = aluno1;
            
        } else if(nota2 > nota1 && 
                  nota2 > nota3 &&
                  nota2 > nota4){
            
                maiorNota = nota2;
                melhorAluno = aluno2;
                
        } else if(nota3 > nota1 && 
                  nota3 > nota2 &&
                  nota3 > nota4){
            
                maiorNota = nota3;
                melhorAluno = aluno3;
        
        
        } else{
        
            maiorNota = nota4;
            melhorAluno = aluno4;
        }
        
        System.out.println("O melhor aproveitamento foi de " + melhorAluno + 
                " com a nota " + maiorNota);
        
        */
        
        /*
        String resp;
        int soma;
        int entradaUsuario;
        
        soma = 0;
        
        do{
            System.out.print("Digite o valor ==> ");
            entradaUsuario = scanner.nextInt();
            soma = soma + entradaUsuario;
            System.out.print("Vc quer continuar? [s] ou [n] ?");
            resp = scanner.next();
        } while ("s".equals(resp));
        
        System.out.println("A soma dos valores digitados: " + soma);
        */

        //REPITA do-while
        
        /*
        int i;
        int n;
        int tabuada;
        
        
        System.out.println("Qual tabuada vc quer calcular? ");
        n = scanner.nextInt();
        
        i = 1;
        
        do{
            tabuada = i * n;
            System.out.println("\n"+ n + " x " + i + " = " + tabuada);
            i = i +1;
            
        } while( i <= 10);
        */
        
        //CONTA NEGATIVOS
        /*
        int i;
        int numero;
        int negativo;
        
        negativo = 0;
        i = 1;
        
        do{
            System.out.println("Digite um numero: ");
            numero = scanner.nextInt();
            if(numero < 0){
            negativo++;
            }
            i++;
        } while (i <= 5);
        
        System.out.println("Foram digitados " + negativo + " numeros negativos.");
        */
        
        //FATORIAL
        /*
        int i;
        int numero;
        int fatorial;
        String resposta;
        
        
        do{
            System.out.print("Digite um numero: ");
            numero = scanner.nextInt();
            i = numero;
            fatorial = 1;
        
            do{ 
                fatorial = fatorial * i;
                i--;
            }while(i >= 1);
      
            System.out.println("O valor fatorial de  " + numero + " e igual a "+ fatorial + 
                    "\n------------------");
            System.out.println("Quer continuar? [s] ou [n]");
            resposta = scanner.next();
            
        } while ("s".equals(resposta));
        */
        
        /*
        //NUMERO PRIMO
        
        int i;
        int numero;
        int contDivisao;
        
        i = 1;
        contDivisao = 0;
        
        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();
        
        do{
            if(numero % i == 0){
                contDivisao++;
            }
            i++;
            
        } while(i <= numero);
        
        if(contDivisao > 2){
            System.out.println("O valor " + numero + " não é primo. ");
        } else {
            System.out.println("O valor " + numero + " é primo.");
        }
        
        */
        
        //SUPER CONTADOR
        
        /*
        System.out.println("====================");
        System.out.println("|        MENU      |");
        System.out.println("====================");
        
        int usuario;
        int i;
        
        
        System.out.println("| [1] De 1 um a 10 |");
        System.out.println("| [2] De 10 um a 1 |");
        System.out.println("| [3] Sair         |");
        System.out.println("====================");
        usuario = scanner.nextInt();
        
        if(usuario == 1){
            i = 1;
            do{
                System.out.print(i + "...");
                i++;
            }while(i <= 10);
        }else if (usuario == 2){
            i = 10;
            do{
                System.out.print(i + "...");
                i--;
            }while(i >= 1);
        }else{
            System.out.println("FIM");
        }
        */
        
        //SELETOR DE PESSOAS
        
        /*String sexo;
        int idade;
        int cor;
        String continuar;
        int homem;
        int mulher;
        
        homem = 0;
        mulher = 0;
        //faixa: homem > 18 e cabelo castanho
        //faixa: mulher 25 > 30 e cabelos loiros
        
        do{
        System.out.println("==========================");
        System.out.println("   SELETOR DE PESSOAS");
        System.out.println("==========================");
        System.out.print("Qual o sexo? [M]/[F]");
        sexo = scanner.next();
        System.out.print("Qual a idade? ");
        idade = scanner.nextInt();
        System.out.println("Qual a cor do cabelo?");
        System.out.println("---------------------");
        System.out.println("[1] Preto \n"
                + "[2] Castanho \n"
                + "[3] Loiro \n"
                + "[4] Ruivo");
        cor = scanner.nextInt();
        
        System.out.println("Quer continuar? [S] ou [N]");
        continuar = scanner.next();
            if("m".equals(sexo) && idade >= 18 && cor == 2){
                homem++;
            } else if("f".equals(sexo) && idade >=25 && idade <=30 && cor == 3){
                mulher++;
            }else{
            }
        
        } while("s".equals(continuar));
        
        System.out.println("------------------------");
        System.out.println("    RESULTADO FINAL");
        System.out.println("------------------------");
        
        System.out.println("Total de homens com mais de 18 anos e cabelos castanhos: " + homem);
        System.out.println("Total de mulheres entre 25 e 30 anos e cabelos loiros: " + mulher);
        */
        
        
        //CONTA1A10
        /*
        int i;
        
        i = 1;
        
        do{
            System.out.println(i);
            i++;
        } while (i <=10);
        
        
        int i;
        
        for(i=1; i <= 10 ; i++){
            System.out.println(i);
        }

        */
        
        /*
        int cont;
        int v;
        
        System.out.print("Digite um valor: ");
        v = scanner.nextInt();
        if(v % 2 == 1){
            v -=1;
        }
        
        for(cont = v; cont >= 0; cont -= 2){
            System.out.println(cont);
        }
        
        System.out.print("Digite um valor: ");
        v = scanner.nextInt();
        
        for(cont = 0; cont <= v; cont += 2){
            System.out.println(cont);
        }
        */
        
        /*
        int i;
        int v;
        int total;
        int sImp;
        
        total = 0;
        sImp = 0;
        
        for(i = 0; i < 6; i++){
            System.out.println("Digite um valor: ");
            v = scanner.nextInt();
            if(v >= 0 && v <=10){
                total = total +1;}
            if(v % 2 == 1){
                sImp = sImp + v;
            }
            
        }
        
        System.out.println("Ao todo foram " + total + " entre 0 e 10." );
        System.out.println("A soma dos valores ímpares digitados é: " + sImp);
        */
        
        //COMBINAÇÕES
        /*
        int c1;
        int c2;
        
        for (c1 = 1; c1<= 3; c1++){
            for(c2 = 1; c2 <= 3; c2++){
            System.out.println(c1 + " " + c2);
            //System.out.print(c2);
            }
        }

        */
        /*
        //SEQUENCIA DE FIBONACCI
        
        int i;
        int a;
        int b;
        int proximo;
        
        a = 0;
        b = 1;
        
        System.out.print(a + " ");
        System.out.print(b + " ");
        
        for(i = 2; i<15; i++){
           proximo = a + b;
           System.out.print(proximo + " ");
           
           a = b;
           b = proximo;
        }
        */  
        
        // ANALISE DE VALORES
        
        int i;
        int valor;
        int soma;
        int nulos;
        double media;
        int div5;
        int somaPares;
        
        valor = 0;
        soma = 0;
        nulos = 0;
        media = 0;
        div5 = 0;
        somaPares = 0;
        
        for(i=1; i<=5; i++){
            System.out.print("Digite o " + i + "o valor: ");
            valor = scanner.nextInt();
            
            if(valor <= 0){
                nulos++;
            } 
            
            if(valor % 5 == 0){
                div5++;
            }
            
            if(valor % 2 == 0){
                somaPares = somaPares + valor;
            }
            soma = soma + valor;
            media = (double)soma / i;
        }
        
        System.out.println("\nA soma entre os valores é: " + soma);
        System.out.println("A média entre os valores é: " + String.format("%.2f",media));
        System.out.println("Valores diviseis por 5: " + div5);
        System.out.println("Valores nulos: " + nulos);
        System.out.println("A soma dos valores pares é: " + somaPares);
        }
    }
    
    

    
    
    

