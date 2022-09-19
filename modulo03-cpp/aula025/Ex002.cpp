
/*
    { Exercicio coletivo II
      Construa um programa que exiba todos os numeros primo de 1 a N utilizando o
      tempo de complexidade O(N^2) para a construcao do algoritmo.
*/

#include <iostream>

using namespace std;

void primes(int n){
    int flag;

    for (int i = 1; i <= n; i++) {
        if (i == 1 || i == 0) {
            continue;
        }

        flag = 1;

        for (int j = 2; j <= i / 2; ++j) {
            if (i % j == 0) {
                flag = 0;
                break;
            }
        }

        if (flag == 1) {
            cout << i + " ";
        }
    }
}

int main() {
   primes(11);
   
   return 0;
}
