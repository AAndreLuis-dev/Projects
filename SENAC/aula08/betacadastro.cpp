#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

main()
{

    char nome[50][50];
    char idade[50][50];
    char tel[50][50];
    char cpf[50][50];
    char email[50][50];
    char setor[50][50];
    char cargo[50][50];
    char salario[50][50];
    char diaD[50][50];

    int i;
    int rep = 0;
    int loop;
    int esc;

    do
    {
        //Menu e definição de escolha
        printf("--------------------------------------\n");
        printf("--------REGISTRO DE FUNCIONARIO-------\n");
        printf("--------------------------------------\n");
        printf("[1] - REGISTRO DE FUNCIONARIO \n");
        printf("[2] - LISTA DE FUNCIONARIOS \n");
        printf("[3] - EXCLUIR FUNCIONARIOS \n");
        scanf("%i", &esc);
        fflush(stdin);

        switch (esc)
        {
        case 1:
            // Quantidade de funcionarios a serem registrados/numero de repetições
            fflush(stdin);
            printf("Digite a quantidade de funcionários a serem registrados: \t");
            scanf("%i", &loop);
            fflush(stdin);

            for (i = 1; i <= loop; i++)
            {
                fflush(stdin);
                printf("\nDigite seu nome: \t \n");
                gets(nome[i]);
                fflush(stdin);

                printf("Digite sua idade: \t \n");
                gets(idade[i]);
                fflush(stdin);

                printf("\nDigite seu número: \t \n");
                gets(tel[i]);
                fflush(stdin);

                printf("\nDigite seu cpf: \t");
                gets(cpf[i]);
                fflush(stdin);

                printf("\nDigite seu email: \t");
                gets(email[i]);
                fflush(stdin);

                printf("\nDigite seu setor: \t");
                gets(setor[i]);
                fflush(stdin);

                printf("\nDigite seu cargo: \t");
                gets(cargo[i]);
                fflush(stdin);

                printf("\nDigite seu salário: \t");
                gets(salario[i]);
                fflush(stdin);

                printf("\nDigite o dia do pagamento: \t");
                gets(diaD[i]);
                fflush(stdin);
            }

            break;

        default:
            printf("teste");
            break;
        }

    } while (rep != 1);
}
