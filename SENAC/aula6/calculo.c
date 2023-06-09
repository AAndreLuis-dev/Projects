#include<stdio.h>
#include<stdlib.h>
#include<locale.h> //Biblioteca de regionalização
#include <math.h> //Biblioteca de funções matemáticas


main(){
int n[2]; //vetor do tipo inteiro
int i; //contador
int res = 0;
setlocale(LC_ALL,"portuguese");
for(i=0;i<=1;i++){
printf("Digite o %i° num: \n",i+1);
scanf("%i",&n[i]);
}
for(i=0;i<=1;i++){
res = res + n[i];
printf("A soma é: %i\n",res);
}
}
