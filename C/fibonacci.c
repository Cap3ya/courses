#include <stdio.h>

int fibonacci(int n)
{
    if (n == 0)
    {
        return 0;
    }
    else if (n == 1)
    {
        return 1;
    }
    else
    {
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}

int main(void)
{
    int n;

    printf("nth fibonacci: ");
    scanf("%d", &n);

    printf("%d\n", fibonacci(n));

    return 0 ;
}