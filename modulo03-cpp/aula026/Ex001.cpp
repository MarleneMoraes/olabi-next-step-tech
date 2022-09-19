/*
    1 - Implemente um programa para implementar uma lista. O programa deve mostrar ao usuário
    duas opções. Se o usuário escolher 1, a lista deve ser impressa; se a lista escolher 2, 
    ele deve entrar com o valor do conteúdo do novo elemento da lista.
*/
#include <iostream>

using namespace std;

class Node {
    public:
    int data;
    Node * next;

    Node(){ }

    Node(int _data){ 
        this -> data = _data;
        this -> next = NULL;
    }
};

class List {
    Node head;
    Node tail;
    
    void printList(Node head){
        Node *c = head;

        while(c != NULL){
            cout << c -> data << endl;
            c = c -> next;
        }
    }

    void addList(Node tail){

    }
};


int main() {

    return 0;
}