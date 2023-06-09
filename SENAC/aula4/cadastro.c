#include<stdio.h>
#include<stdlib.h>
#include<locale.h>


main(){

    setlocale(LC_ALL, "portugese");

    char nome[10];
    char local[10];
    char email[10];
    int day[20];
    char tel[20];
    int esc;

    do{

            printf("-------------------------------\n");
            printf("---------CADASTRO EM C---------\n");
            printf("-------------------------------\n");
            printf("[1] - Cadastrar funcionario \n");
            printf("[2] - Lista de funcionario \n");
            printf("[3] - sair \n");
            scanf("%i", &esc);
            fflush(stdin);

            switch(esc){

            case 1:
                    system("clear");
                    printf("DIGITE O NOME DO FUNCIONARIO \n");
                    gets(nome);
                    fflush(stdin);
                    printf("DIGITE A DATA DE NASCIMENTO DO FUNCIONARIO \n");
                    scanf("%s", &day);
                    fflush(stdin);
                    printf("DIGITE O ENDEREÇO DO FUNCIONARIO \n");
                    scanf("%s", &local);
                    fflush(stdin);
                    printf("DIGITE O TELEFONE DO FUNCIONARIO \n");
                    scanf("%s", &tel);
                    fflush(stdin);
                    printf("DIGITE O EMAIL DO FUNCIONARIO \n");
                    scanf("%s", &email);
                    fflush(stdin);

                break;

            case 2:
                    system("cls");
                    printf("LISTA VAZIA... \n");
                    fflush(stdin);
                break;

            case 3:
                    system("cls");
                    printf("SAINDO....");
                    fflush(stdin);
                break;


            default:
                    system("cls");
                    printf("Opção inválida. \n");
                    fflush(stdin);
                    system("pause");

            }
            system("cls");
            if(esc = 1){
                printf("------------------------------------\n");
                printf("--------DADOS DO FUNCIONARIO--------\n");
                printf("------------------------------------\n");
                printf("Nome: %s \n", nome);
                printf("data: %s \n", day);
                printf("Endereço: %s \n", local);
                printf("telefone: %s \n", tel);
                printf("email: %s \n", email);
        }
    }while(esc != 3);

}
