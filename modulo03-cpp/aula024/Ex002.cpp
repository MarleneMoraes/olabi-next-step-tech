/* 
    2 - Escreva um programa em C++ para alterar cada letra em uma determinada 
    string com a letra que a segue no alfabeto (ou seja, a se torna b, p se 
    torna q, z se torna a).
*/

#include <iostream>
#include <string>

using namespace std;

string changeLetters(string s){
    for(int i = 0; i < s.size(); i++){
        if(s[i] == 'z') {
            s[i] = 'a';
        } else {
            s[i++];
        }
    }

    return s;
}

int main() {
    string string = "arroz";

    cout << changeLetters(string) << endl;

    return 0;
}

