#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
#include <math.h>


main(){

    int n[4];
    int i;
    int res = 0;

    setlocale(LC_ALL,"portuguese");

    for(i=0;i<=3;i++){
        printf("Digite a %i ° nota: \n", i+1);
        scanf("%i", &n[i]);
        fflush(stdin);
    }

    for(i=0;i<=0;i++){
        res = (n[0] + n[1] + n[2] + n[3])/4;
        printf("A media é: %i \n",res);
    }

}
