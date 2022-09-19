// 1 - Escreva um programa em C++ para reverter uma determinada string.

#include <iostream>
#include <string>

using namespace std;

string reverse(string s){
    string reverseString;

    for(int i = s.size(); i == 0; i--){
        cout << s[i];
    }

    return reverseString;
}

int main() {
    string string = "Marlene";

    cout << reverse(string);

    return 0;
}

