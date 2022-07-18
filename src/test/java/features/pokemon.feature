#language: pt

# Descrição da funcionalidade
Funcionalidade: Buscar por pokemons

# Cenário Simples
Cenário: Busca um pokemon específico
  Dado que escolho o pokemon "ditto"
  Quando faço a busca na api de pokemons
  Então verifico que seu id é 132

# Cenário Simples
Cenário: Busca um pokemon específico
  Dado que escolho o pokemon "pikachu"
  Quando faço a busca na api de pokemons
  Então verifico que seu id é 25

# Exemplos
Esquema do Cenário: Busca um pokemon específico
   Dado que escolho o pokemon <nome_pokemon>
   Quando faço a busca na api de pokemons
   Então verifico que seu id é <id_pokemon>

Exemplos:
  | nome_pokemon | id_pokemon |
  | "pikachu"    | 25         |
  | "ditto"      | 132        |

# Data Table
Cenário: Busca um pokemon específico
  Dado que escolho o pokemon "pikachu"
  Quando faço a busca na api de pokemons
  Então verifico que seu id não é
    | ids |
    | 0      |
    | 9      |
    | 24     |
    | 26     |
    | 100    |
    | 999    |

