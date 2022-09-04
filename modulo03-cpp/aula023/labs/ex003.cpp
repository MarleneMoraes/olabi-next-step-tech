// 3 - Escreva um programa em C++ para exibir o cubo do número até dado um inteiro. 


#include <iostream>
#include <math.h>
using namespace std;

void cubeNumber(int n){
  for (int i = 0; i <= n; i++) {
    cout << pow (i, 3) << endl;
  }
}

int main() {
  int integer;
  cout << "NÚMEROS CÚBICOS" << endl;
  cout << "Digite um número inteiro: ";
  cin >> integer;

  cubeNumber(integer);
  return 0;
}