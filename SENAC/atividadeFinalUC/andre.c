#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>
#include <math.h>

main()
{

    setlocale(LC_ALL, "portuguese");

    //Vetores sobre as informações do produto
    char produto[50][50];
    float valor[50];
    char numerosistema[50][50];
    int quantidade[50];
    char validade[50][50];
    char datacadastro[50][50];
    char categoria[50][50];

    //Variaveis para o funcionamento do sitema
    int i;
    int rep = 0;
    int loop;
    int esc;
    int produtos = 0;
    int cadastrarbanco;

    int senha = 8888;
    int rsenha;

    //vetor para consertar bug
    char nothing[50];

    //criação do arquivo do banco de dados
    FILE *arquivo;

    //loop para o sistema não encerrar
    do
    {
        //Menu e definição de escolha
        printf("-------------------------------------\n");
        printf("--------CADASTRO DE MERCADORIA-------\n");
        printf("-------------------------------------\n");
        printf("[1] - CADASTRO DE MERCADORIA \n");
        printf("[2] - LISTAR PRODUTOS CADASTRADOS \n");
        printf("[3] - EXCLUIR PRODUTOS \n");
        printf("[4] - SAIR \n");
        scanf("%i", &esc);
        fflush(stdin);

        switch (esc)
        {
        //cadastro do produto
        case 1:
            //Definição de quantas produtos iremos cadastrar de vez
            fflush(stdin);
            printf("Digite a quantidade de funcionários a serem registrados: \t");
            scanf("%i", &loop);
            fflush(stdin);

            for (i = 1; i <= loop; i++)
            {
                produtos = produtos + 1; // Numeração de produtos cadastrados

                system("clear");
                fflush(stdin);

                /*  Perguntas para o usuário responder
                    e completar o cadastro
                */
                printf("Digite o nome do produto: \t");
                scanf("%s", &produto[i]);
                fflush(stdin);

                /*printf("\n");
                scanf("%s", &nothing);*/

                printf("\nDigite o preço do produto: \t");
                scanf("%f", &valor[i]);
                fflush(stdin);

                printf("\nDigite o número do produto no sistema: \t");
                scanf("%s", &numerosistema[i]);
                fflush(stdin);

                printf("\nDigite a quantidade disponivel em estoque: \t");
                scanf("%i", &quantidade[i]);
                fflush(stdin);

                printf("Digite a validade do produto: \t");
                scanf("%s", &validade[i]);
                fflush(stdin);

                printf("Digite a data do cadastro: \t");
                scanf("%s", &datacadastro[i]);
                fflush(stdin);

                printf("Digite a categoria do produto: \t");
                scanf("%s", &categoria[i]);
                fflush(stdin);
            }

            //Verificação se o cadastro ocorreu bem
            if (i == 0)
            {
                printf("\nFalha no cadastro.");
            }
            else
            {
                system("clear");
                printf("\nCADASTRO REALIZADO COM SUCESSO!");

                /*  Pergunta se o usário quer guardar
                    as informações no banco de dados
                */
                printf("\nVocê deseja cadastrar essas informações no banco de dados?(1 = SIM || 2 = NÃO)");
                scanf("%i", &cadastrarbanco);
                fflush(stdin);

                // Adiciona os itens no banco de dados
                if (cadastrarbanco == 1)
                {
                    arquivo = fopen("banco.txt", "a");

                    if (arquivo == NULL)
                    {
                        printf("\nERRO AO CRIAR, OU MODIFICAR, O ARQUIVO.");
                    }
                    else
                    {

                        //formatação usada no banco de dados para organizar
                        for (i = 0; i < loop; i++)
                        {
                            fprintf(arquivo, "\n---------------------------------\n");
                            fprintf(arquivo, "\nProduto: \t");
                            fprintf(arquivo, "%s", produto[i]);
                            fprintf(arquivo, "\nValor: \t");
                            fprintf(arquivo, "%.2f", valor[i]);
                            fprintf(arquivo, "\nNumero no sistema: \t");
                            fprintf(arquivo, "%s", numerosistema[i]);
                            fprintf(arquivo, "\nQuantidade disponivel: \t");
                            fprintf(arquivo, "%i", quantidade[i]);
                            fprintf(arquivo, "\nValidade: \t");
                            fprintf(arquivo, "%s", validade[i]);
                            fprintf(arquivo, "\nData do cadastro: \t");
                            fprintf(arquivo, "%s", datacadastro[i]);
                            fprintf(arquivo, "\nCategoria: \t");
                            fprintf(arquivo, "%s", categoria[i]);
                            fprintf(arquivo, "\n---------------------------------\n");
                            fclose(arquivo);
                        }

                        printf("Salvo no banco de dados\n");
                    }
                }
                else
                {
                    printf("\nPRODUTO CADASTRADO NO SISTEMA, MAS NÃO NO BANCO DE DADOS!!");
                }
            }

            break;

        case 2:
            if (i == 0)
            {
                system("clear");
                printf("\n LISTA DE CADASTRO VAZIA...\n");
            }
            else
            {
                system("clear");
                printf("------------------------------------");
                printf("Numero de cadastros: %i", produtos);
                printf("------------------------------------");

                for (i = 1; i <= loop; i++)
                {
                    printf("\n-----------------------------------------\n");
                    printf("\nPoduto número: %i \t", i);
                    printf("\nNome: %s \t", produto[i]);
                    printf("\nValor: %.2f \t", valor[i]);
                    printf("\nNúmero no sistema: %s \t", numerosistema[i]);
                    printf("\nQuantidade disponivel: %i \t", quantidade[i]);
                    printf("\nValidade do produto: %s \t", validade[i]);
                    printf("\nData do cadastro: %s \t", datacadastro[i]);
                    printf("\nCategoria: %s \t", categoria[i]);
                    printf("\n-----------------------------------------\n");
                }
            }

            break;
        case 3:

            if (i == 0)
            {
                system("clear");
                printf("\n LISTA DE CADASTRO VAZIA...\n");
            }
            else
            {

                printf("Digite a senha de admin para deletar os usarios: ");
                scanf("%i", &rsenha);
                fflush(stdin);
                if (senha == rsenha)
                {
                    // Iguala a zero a contagem
                    if (i = !0)
                    {
                        i = 0;
                        produtos = 0;

                        printf("\nUSÁRIOS DELETADOS!\n");
                        remove("banco.txt");
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
            }

            break;

        case 4:

            printf("SAINDO DO PROGRAMA...");
            rep = rep + 1;

            break;

        default:
            printf("ERRO NA ESCOLHA!!");
            break;
        }

    } while (rep == 0);
}
