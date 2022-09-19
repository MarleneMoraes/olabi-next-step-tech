/* 
    5 - Escreva um programa em C++ para encontrar o elemento
    que mais ocorre em uma matriz de inteiros.
*/

#include <iostream>
#include <string>

using namespace std;

void constructorMatrix(int a, int b){
   int a, b;

    cin >> a;
    cin >> b;
    
    int matrix[a][b];

      for (int i = 0; i < a; i++){
        for (int j = 0; j < b; j++){
            matrix[i][j] = rand() % 100;
        }   
    }

    int bigger[3];

    for (int i = 0; i < a; i++){
        for (int j = 0; j < b; j++){
            if (matrix[i][j]  ){
                bigger[i] = matrix[i][j];
            }
        }   
    }
}

int main() {
  return 0;
}

