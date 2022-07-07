#language: pt

Funcionalidade: Buscar por pokemons

Cenário: Busca um pokemon específico
  Dado que escolho o pokemon "ditto"
  Quando faço a busca na api de pokemons
  Então verifico se seu id é o 132

Cenário: Busca um pokemon específico
  Dado que escolho o pokemon "pikachu"
  Quando faço a busca na api de pokemons
  Então verifico se seu id é o 25
