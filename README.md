
-----------------------------------------------------------------------------------------------------------------------------------------------------

# Astroflix

Astroflix é uma aplicação Java que permite buscar informações sobre séries de TV utilizando a API do OMDB (Open Movie Database). A aplicação exibe detalhes sobre as séries, temporadas e episódios, além de fornecer estatísticas sobre as avaliações dos episódios. Este projeto foi desenvolvido como parte de um curso da Alura.

--------------------------------------------------------------------------------------------------------------------------------------------------------

## Tecnologias Utilizadas

- <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">: Linguagem de programação principal.
- <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring Boot">: Framework para desenvolvimento de aplicações Java.
- <img src="https://img.shields.io/badge/OMDB_API-000000?style=for-the-badge&logo=omdb&logoColor=white" alt="OMDB API">: API utilizada para obter dados sobre séries de TV.
- <img src="https://img.shields.io/badge/Jackson-000000?style=for-the-badge&logo=json&logoColor=white" alt="Jackson">: Biblioteca para manipulação de JSON (desserialização de dados).
- <img src="https://img.shields.io/badge/HttpClient-000000?style=for-the-badge&logo=java&logoColor=white" alt="HttpClient">: Classe do Java 11+ para realizar requisições HTTP.
- <img src="https://img.shields.io/badge/Streams_API-000000?style=for-the-badge&logo=java&logoColor=white" alt="Streams API">: Utilizada para manipulação e processamento de dados.
- <img src="https://img.shields.io/badge/LocalDate-000000?style=for-the-badge&logo=java&logoColor=white" alt="LocalDate"> e <img src="https://img.shields.io/badge/DateTimeFormatter-000000?style=for-the-badge&logo=java&logoColor=white" alt="DateTimeFormatter">: Para manipulação e formatação de datas.

--------------------------------------------------------------------------------------------------------------------------------------------------------

## Funcionalidades

1. **Busca de Séries**:
    - O usuário pode digitar o nome de uma série, e a aplicação busca os detalhes na API do OMDB.
    - Exibe informações como título, ano de lançamento, número de temporadas e avaliação.

2. **Listagem de Temporadas e Episódios**:
    - A aplicação lista todas as temporadas e episódios da série buscada.
    - Exibe o título, número do episódio e data de lançamento de cada episódio.

3. **Estatísticas de Avaliações**:
    - Calcula e exibe estatísticas sobre as avaliações dos episódios, como:
        - Média das avaliações.
        - Melhor e pior episódio.
        - Quantidade de episódios avaliados.

4. **Filtros e Ordenações**:
    - Permite filtrar episódios por trecho do título ou por ano de lançamento.
    - Ordena episódios por avaliação.

--------------------------------------------------------------------------------------------------------------------------------------------------------

## Estrutura do Projeto

### Classes Principais

1. **AstroflixApplication**:
    - Classe principal que inicia a aplicação Spring Boot.
    - Implementa `CommandLineRunner` para executar o menu principal ao iniciar o projeto.

2. **Principal**:
    - Contém a lógica de interação com o usuário e processamento dos dados.
    - Realiza a busca de séries, temporadas e episódios, e exibe as informações.

3. **ConsumoApi**:
    - Responsável por realizar requisições HTTP para a API do OMDB.
    - Utiliza `HttpClient` para enviar requisições e obter respostas em formato JSON.

4. **ConverteDados**:
    - Converte strings JSON em objetos Java utilizando a biblioteca Jackson.
    - Implementa a interface `IConverteDados` para desserialização de dados.

5. **Episodio**:
    - Modela um episódio de uma série, contendo informações como temporada, título, número do episódio, avaliação e data de lançamento.
    - Trata exceções ao converter avaliações e datas.

6. **DadosSerie, DadosTemporada, DadosEpisodio**:
    - Classes de modelo para representar os dados retornados pela API do OMDB.

-----------------------------------------------------------------------------------------------------------------------------------------------------

