/*
    Variaveis: var, let, const

    ! Apos o ES6, o var cai pelo vazamento de escopo. let é utilizada em variavel de escopo local

*/


let idade = 10;
const minhaIdade = 10; //nao podera ser alterada

let nome = "Julio"; //variaveis tipo String possuem metodos especificos 
nome.concat(" Cesar");

console.log(nome);

/* 
    Tipos de dados: number, String, boolean, null, symbol, object

    ! null: variável vazia
*/

// object
let person = {
    name: 'Julio',
    age: 25,
    state: 'Rio de Janeiro',
    printName: function() {
        return this.name;
    }
};

// array
const nomes = ['Julio', 'Danilo', 'Diego', 'Larissa'];

for (let i = 0; i < nomes.length; i++) {
    console.log(nomes[i]);
}

nomes.forEach(function(nomes, i) {
    console.log(nomes, i);
});

//function

function soma() { }
