#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>
#include <math.h>

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
    int cadf = 0;

    int senha = 8888;
    int rsenha;

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

            //Adiciona um cadastro no número total de cadastros
            cadf = cadf + 1;

            for (i = 1; i <= loop; i++)
            {
                system("clear");
                fflush(stdin);
                printf("\nDigite seu nome: \t \n");
                scanf("%s", &nome[i]);
                fflush(stdin);

                printf("Digite sua idade: \t \n");
                scanf("%s", &idade[i]);
                fflush(stdin);

                printf("Digite seu número: \t \n");
                scanf("%s", &tel[i]);
                fflush(stdin);

                printf("Digite seu cpf: \t \n");
                scanf("%s", &cpf[i]);
                fflush(stdin);

                printf("Digite seu email: \t \n");
                scanf("%s", &email[i]);
                fflush(stdin);

                printf("Digite seu setor: \t \n");
                scanf("%s", &setor[i]);
                fflush(stdin);

                printf("Digite seu cargo: \t \n");
                scanf("%s", &cargo[i]);
                fflush(stdin);

                printf("Digite seu salário: \t \n");
                scanf("%s", &salario[i]);
                fflush(stdin);

                printf("Digite o dia do pagamento: \t \n");
                scanf("%s", &diaD[i]);
                fflush(stdin);
            }

            break;

        case 2:

            if (cadf <= 0)
            {
                system("clear");
                printf("\n LISTA DE FUNCIONARIO VAZIA...\n");
            }
            else
            {
                system("clear");
                printf("------------------------------------");
                printf("Numero de cadastros: %i", cadf);
                printf("------------------------------------");

                for (i = 1; i <= loop; i++)
                {
                    printf("\n-----------------------------------------\n");
                    printf("\nFuncionario número: %i \t", i);
                    printf("\nNome: %s \t", nome[i]);
                    printf("\nIdade: %s \t", idade[i]);
                    printf("\nCPF: %s \t", cpf[i]);
                    printf("\nemail: %s \t", email[i]);
                    printf("\nSetor: %s \t", setor[i]);
                    printf("\nCargo: %s \t", cargo[i]);
                    printf("\nSalario: %s \t", salario[i]);
                    printf("\nDia do pagamento: %s \t", diaD[i]);
                    printf("\n-----------------------------------------\n");
                }
            }

            break;

        case 3:

            printf("Digite a senha de admin para deletar os usarios: ");
            scanf("%i", &rsenha);
            fflush(stdin);
            if (senha == rsenha)
            {
                // Iguala a zero a contagem 
                if (i = !0)
                {
                    i = 0; 
                    cadf = 0;

                    printf("\nUSÁRIOS DELETADOS!\n");
                }
                else
                {
                    printf("\nNão existe cadastro para ser deletado.");
                }
            }
            else
            {
                printf("\nVocê não tem autorização para isso!");
            }

            break;

        default:
            printf("teste");
            break;
        }

    } while (rep != 1);
}
