/*
  4- Escreva um programa em C++ para encontrar o número e a soma de todos os inteiros 
  entre 100 e 200 que são divisíveis por 9. 
*/

#include <iostream>
using namespace std;

int main() {
  int sumMultiple = 0;
  
  cout << "MÚLTIPLOS DE NOVE" << endl;

  for (int i = 100; i <= 200; i++){
     if (i % 9 == 0){
      cout << i << endl;
      sumMultiple += i;
    }
  }

  cout << "Soma de todos os inteiros: ";
  cout << sumMultiple << endl;
  return 0;
}