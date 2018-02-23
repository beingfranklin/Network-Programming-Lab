
#include<stdio.h>
#include<unistd.h>

void main()
{
	pid_t pid;
	pid=fork();
	if(pid == -1)
	{
		printf("Child creation failed\n");
	}
	else if(pid == 0)
	{
		printf("This is the parent\n");
	}
	else
	{
		printf("This is the child with process id = %d\n",pid);
	}
}


