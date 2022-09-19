/*
    { Exercicio de Reforco
      Escreva um metodo que calcule o maior fator primo de um determinado numero. 
      Por exemplo: Os fatores primos de 455 sao 5, 7, 13.
*/

#include <iostream>

using namespace std;

int prime(int n){
   int flag = -1;

  for(int i = 2; i * i <= n; i++) {
    if (i == 1) {
      break;
    }  
       
    if (n % i != 0) {
      continue;
    }
    
    flag = i;
     
    while(n % i == 0){
      n /= i;
    }
      
  }
  
    if (n == 1) {
        return flag;
    }

    return n;
}

int main() {
    cout << prime(455) << endl;

    return 0;
}

