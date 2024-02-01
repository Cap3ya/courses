/* Enter an amount then display it with x% tax added */

#include <stdio.h>

int main(void)
{
    int tax;
    float amount;

    printf("Enter a tax: ");
    scanf("%d", &tax);

    printf("Enter an amount: ");
    scanf("%f", &amount);

    printf("With %d%% tax added: $%.2f\n", tax, amount * ( 1 + tax / 100));
}
