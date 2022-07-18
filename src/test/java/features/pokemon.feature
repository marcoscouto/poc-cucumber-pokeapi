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

Esquema do Cenário: Busca um pokemon específico
   Dado que escolho o pokemon <nome_pokemon>
   Quando faço a busca na api de pokemons
   Então verifico se seu id é o <id_pokemon>

Exemplos:
  | nome_pokemon | id_pokemon |
  | "pikachu"    | 25         |
  | "ditto"      | 132        |
