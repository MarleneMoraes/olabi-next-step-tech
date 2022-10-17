/*
let pessoa = {
    //conjunto de chave e valor 
    nome: 'Larissa',
    idade: 25,
    estado:'Minas Gerais',
    imprimirNome: function(){
        return this.nome;
    }
}

console.log(pessoa.idade);

pessoa.idade = 26; //passar valores

console.log(pessoa.idade);

console.log(pessoa.imprimirNome());
*/

console.log(document.body); //representa um documento ao documento html que o js sera carregado

/* 
    Rack para entender melhor a manipulacao do DOM
    1 - o que quero pegar
    2 - o que quero fazer
*/

// Pegar a div com id container
let container = document.getElementById('container');

//Quero alterar o display para flex
container.style.display = 'flex';
container.style.flexDirection = 'row';
container.style.justifyContent = 'space-arounnd';

