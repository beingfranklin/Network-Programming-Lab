#include<stdio.h>
#include<pthread.h>

void *d1()
{
	printf("\nThread 1");
}

void *d2()
{
	printf("\nThread 2");
}

void *d3()
{
	printf("\nThread 3");
}


void main()
{
    pthread_t tid1,tid2,tid3;
    printf("\nBefore Thread Creation");
    pthread_create(&tid1, NULL,d1, NULL);
    pthread_create(&tid2, NULL,d2, NULL);
    pthread_create(&tid3, NULL,d3, NULL);
    pthread_join(tid1, NULL);
    pthread_join(tid2, NULL);
    pthread_join(tid3, NULL);
    printf("\nAfter Thread Creation\n");
}
