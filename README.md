<p align="center"><img src=""></p>

<h1 align="center">Asteroide-API</h1>

<h3 align="center">
 API REST de código aberto para dados de pesquisa e referência organizacional de informações ela foi desenvolvida usando como base o sistema de CRUD</h3>

<p align="center">
<a href="https://www.travis-ci.com/github/Mario23junior/Jurassic-API/pull_requests"><img src="https://img.shields.io/github/workflow/status/r-spacex/SpaceX-API/Test?style=flat-square"></a>
<a href="https://en.wikipedia.org/wiki/Representational_state_transfer"><img src="https://img.shields.io/badge/interface-REST-brightgreen.svg?longCache=true&style=flat-square"></a>
</p>

## Etapas para testar ou reproduzir

Primeiro execute o maven 
 
```
 mvn package
```
Em seguida faça
```
java -jar target/Asteroide-API-1.0-SNAPSHOT.jar

```
## Uso

```
http://localhost:8080/api/v1/list/asteroidesDetalhes/
```

## Resultado dos dados da API

```
[
   {
      "id":1,
      "urlImage":"https://super.abril.com.br/wp-content/uploads/2020/08/12-08_Ceres_SITE.jpg",
      "nome":"1 Ceres",
      "massa":"9,5×1020",
      "periodoOrbital":1.682,
      "orbita":"sol",
      "definicaoCientificaDTOs":[
         {
            "id":3,
            "diametroMedio":952,
            "gravidade":0.27,
            "distanciaMediadoSol":2.766,
            "raio":473
         }
      ],
      "detalhesDatasDTOs":[
         {
            "id":2,
            "descobridor":"Giuseppe Piazzi",
            "dataDeDescorbeta":"01/01/1801",
            "classe":"G",
            "descricao":"Ceres é um planeta anão localizado no cinturão de asteroides entre Marte e Júpiter, sendo o maior dos asteroides. Desde sua descoberta em janeiro de 1801 por Giuseppe Piazzi, Ceres recebeu diversas classificações, sendo inicialmente considerado planeta e posteriormente asteroide."
         }
      ]
   }
]
```
