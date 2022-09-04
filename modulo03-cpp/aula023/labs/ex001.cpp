// 1 - Escreva um programa em C++ para verificar se um número é primo ou não.

#include <iostream>
#include <string>
using namespace std;

string isPrimeNumber(int n){
  bool answer;

  if (n == 0 || n == 1) {
    return "O número não é primo";
  } else {
    for (int i = 2; i < n; i++){
      if (n % i == 0) {
        return "O número não é primo";
      }
    }

    return "O número é primo";
  }
}

int main() {
  int numero;
  
  cout << "NÚMEROS PRIMOS\n";
  cout << "Digite um valor: ";
  cin >> numero;

  cout << isPrimeNumber(numero) << endl;

  return 0;
}