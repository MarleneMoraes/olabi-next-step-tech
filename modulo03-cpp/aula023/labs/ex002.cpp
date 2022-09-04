// 2 - Escreva um programa em C++ para encontrar o fatorial de um número.

#include <iostream>
using namespace std;

int fatorial(int n){
  if (n == 1){
    return n;
  } else if(n == 0){
    return 1;
  } else {
    return n * fatorial (n - 1);
  }
}

int main() {
  int number;

  cout << "NÚMERO FATORIAL\n";
  cout << "Digite um valor: ";
  cin >> number;
  
  cout << fatorial(number);

  return 0;
}