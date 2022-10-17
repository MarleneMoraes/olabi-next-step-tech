let containerResult = document.querySelector('.reposta-api');

const url = 'https://api.github.com/users/MarleneMoraes/repos';

// promisses : then, async, await

async function getReposMarlene(){
    //API Fetch: api nativa para requisicoes http

    //response: respostas das requisicoes http
    let response = await fetch(url);

    //conversao a variavel response para json
    let data = await response.json();

    showReposMarlene(data);
}

//aparecer no HTML


function showReposMarlene(data) {
    let repositorio = data;
    let list = repositorio.map(function(repo){
        return `
        
            <p>${repo.name}</p>
        `
    }); 

    containerResult.innerHTML = list.join('');
}


getReposMarlene();
