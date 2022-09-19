/* 
    3 - Escreva um programa em C++ para colocar em maiúscula a primeira 
    letra de cada palavra de uma determinada string. As palavras devem 
    ser separadas por apenas um espaço.
*/

#include <iostream>
#include <string>

using namespace std;

string capitalizeFirst(string s){
    if('a' < s[0] && s[0] < 'z') {
        s[0] = s[0] - 32;
    }
    
    for(int i = 0; i < s.size(); i++){
        if('a' < s[i] && s[i] < 'z' && s[i-1] == ' ') {
            s[i] = s[i] - 32;
        } 
    }

    return s;
}

int main() {
    string string = "O codificador limpo";

    cout << capitalizeFirst(string) << endl;

    return 0;
}

