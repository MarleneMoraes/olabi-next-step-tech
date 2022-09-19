/*
    { Exercicio coletivo I
      Escreva um programa que pegue as iniciais a partir de seu nome completo e as
      exiba.
*/

#include <iostream>
#include <string>

using namespace std;

int main() {
    string name = "Marlene Vasconcelos Moraes de Oliveira";

    cout << "Iniciais do nome: ";

    for (int i = 0; i < name.size(); i++) {
        if (i == 0) {
            cout << name[i];
        }

        if (name[i] == ' ') {

            if (name[i] != 'd') {
                cout << name[i + 1];
            }
        }
    }

    cout << endl;
    
    return 0;
}
