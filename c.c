#include<stdio.h>
#include<stdlib.h>
int main()
{
int i, j;
//char route[100];
FILE *file1;
file1=fopen("prueba.txt","a+");
printf ("Hello word\n\a");
printf ("Introduce i, we will see the memmory direccion of this variable\n\a");
scanf("%d", &i);
printf("Introduce j:\n");
scanf("%d", &j);
printf("The mmemory direccion is %u, and j to %u\n", &i, &j);
fprintf(file1,"i=%d\n", i);
fprintf(file1,"i points to %u, and j to %u\n", i, j);
fclose(file1);
//printf("Introduce a rout of a program\n");
//scanf("%s", &route);
//system(route);
return 0;

}

