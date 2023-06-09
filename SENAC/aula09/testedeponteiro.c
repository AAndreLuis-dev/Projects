#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

main()
{

    setlocale(LC_ALL, "portuguese");

    FILE *arquivo;
    // o TIPO file É UM TIPO DE VARIÁVEL

    arquivo = fopen("test.txt", "w");
    /*  A função fopen é utilizado para criar o arquivo.
        Deve-se definir o local e o nome do arquivo e os atributos
        de acesso: R - Ler, W - escrever, A - Alterar
    */

    fprintf("Esse é um teste de gravação em C");
    // A função fprintf escreve no arquivo
    fclose(arquivo); // fecha o arquivo

}
