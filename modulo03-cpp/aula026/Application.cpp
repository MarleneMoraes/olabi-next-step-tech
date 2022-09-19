#include <stack>
#include <queue>
#include <list>
#include <iostream>

using namespace std;

int main(){  
    stacks(); //pilha
    
    queues(); //fila

    lists(); //lista

}

void stacks(){
    stack<int> stackInt;

    for(int i = 0; i < 10; i++){
        stackInt.push(i); //add
    }
    cout << stackInt.top() << endl;
    stackInt.pop(); //rem

    cout << stackInt.top() << endl; //topo
    
    for(int i = 0; i < 9; i++){
        stackInt.pop();

        if(stackInt.empty()){
            cout << "Ficou vazio na iteração: " << i + 1 << endl;
        }
    }
}

void queues(){
    queue<int> queueInt;
	
    for(int i = 0; i < 10; i++){
		queueInt.push(i);
	}

	cout << queueInt.front() << endl;

	queueInt.pop();
	
    cout << queueInt.front() << endl;

	for(int i = 0;i < 9; i++){
		queueInt.pop();

		if(queueInt.empty()){
			cout << "Vazio na iteração " << i+1 << endl;
		}
	}
}

void lists(){
    list<int> listInt;
	list<int>::iterator it;
	
    for(int i = 0;i < 5; i++){
		listInt.push_back(i);
	}

	for(int i=5;i<10;i++){
		listInt.push_front(i);
	}
    // 9 8 7 6 5 0 1 2 3 4


    cout << listInt.front() << endl; //9

    cout << listInt.back() << endl; //4
    
    cout << listInt.size() << endl; //10

	for(it = listInt.begin(); it != listInt.end(); it++){
		if(*it %2 == 0){
			cout << *it << endl;
		}
	}

    it--;
    
    listInt.insert(it,2,11);//insere

    listInt.erase(it);//3 
    
    cout << listInt.back() << endl; 

	listInt.clear();// limpa a lista inteira 

	cout << listInt.size() << endl;//0
}