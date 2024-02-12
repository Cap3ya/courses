#include <iostream>

double square(double x)
{
    return x * x;
}

void print_square(double x)
{
    std::cout << "The square of " << x << " is " << square(x) << "\n";
}

bool accept()
{
    int tries = 1;
    while (tries < 4)
    {
        std::cout << "Do you want to proceed (y or n)?\n";
        char answer = 0;
        std::cin >> answer;

        switch (answer)
        {
        case 'y':
            return true;
            break;
        case 'n':
            return false;
        default:
            std::cout << "Sorry, I don't understand that\n";
            ++tries;
            break;
        }
    }

    std::cout << "I'll take that for a no.\n";
    return false;
}

void print()
{
    int v1[10] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int v2[10];

    for (auto i = 0; i != 10; ++i)
    {
        v2[i] = v1[i];
    }

    for (auto x : v1)
    {
        std::cout << x << "\n";
    }
}

int count_x(char *p, char x)
{
    if (p == nullptr)
        return 0;
    int count = 0;
    for (; *p != 0; ++p)
        if (*p == x)
            ++count;
    return count; 
}

int main()
{
    print_square(1.234);

    accept();

    print();
}