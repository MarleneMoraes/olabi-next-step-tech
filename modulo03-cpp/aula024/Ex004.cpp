/* 
    4 - Escreva um programa em C++ para encontrar os três maiores
    elementos em uma matriz.
*/

#include <iostream>
#include <cstdlib>
#include <time.h>

using namespace std;

int threeBiggerNumbers(){
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
            if (matrix[i][j] > bigger[i] && matrix[i][j] != bigger[i] ){
                bigger[i] = matrix[i][j];
            }
        }   
    }

}

int main() {
    

   return 0; 
}


