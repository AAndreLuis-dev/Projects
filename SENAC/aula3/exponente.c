#include<stdio.h>
#include<locale.h>
#include<math.h>

int main(){

    int base, expoente, res;
    setlocale(LC_ALL, "portugese");

        printf("\n Digite a base \n");
        scanf("%i", &base);
        printf("\n Digite o expoente\n");
        scanf("%i", &expoente);
        res = pow(base , expoente);
        printf(" \n O resultado é: %i \n\n ",res );


}
