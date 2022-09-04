/*
   Date 06-23-2022
   Modulo 3: Programacao em C++
   Aula 023 - Estrutura da linguagem
*/

#include <iostream>
#include <string>
#include <array>

using namespace std;
/*
    Variaveis: sao case sensitives e devem ser declaradas
    antes do uso (linguagem fortemente tipada)
*/
int idade;
// int iDade; //diferente da acima
double salario = 1000;

// arrays
array<string, 4> star = {"Danilo", "Diego", "Larissa", "Marlene"};
array<int, 4> star = {1, 2, 3, 4};

for (int i = 0; i < star.size(); i++) {
    std::cout << star[i];
}

foreach (string nome in star) {
    list.items.add(nome);
}

int main() {
    std::cout << "Ola mundo\n";
    return 0; //sempre tem retorno para nao entrar em looping
}
