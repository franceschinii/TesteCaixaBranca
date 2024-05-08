# TesteCaixaBranca

Grafo de Fluxo
- Agora, criaremos um grafo de fluxo interligando esses pontos:

- Entrada: Nodo 1 (Entrada no método conectarBD)
- Saída: Nodo 7 (Saída do método conectarBD)
- Entrada: Nodo 10 (Entrada no método verificarUsuario)
- Saída: Nodo 22 (Saída do método verificarUsuario)
- Ligações (Arestas):
- - 1 -> 2 -> 3 -> 4 -> 5
- - 5 -> 6 (em caso de exceção) -> 7
- - 5 -> 7 (sem exceção)
- - 10 -> 11 -> 12 -> 13 -> 14 -> 15 -> 16 -> 17
- - 17 -> 18 -> 19 -> 20 -> 22 (se a condição do if for verdadeira)
- - 17 -> 21 (em caso de exceção) -> 22
- - 17 -> 22 (sem entrar no if e sem exceção)

# Complexidade Ciclomática
-A complexidade ciclomática é calculada como V(G) = E - N + 2P:

- - E é o número de arestas
- - N é o número de nodos
- - P é o número de componentes conexos (usualmente 1 para um código coeso)
- - Neste caso:

- - E = 12 (arestas)
- - N = 22 (nodos)
- - P = 2 (dois métodos distintos)
- - V(G) = 12 - 22 + 2*2 = -8 + 4 = -4 (deve ser revisto, pois um erro foi cometido ao contar as arestas ou nodos, ou ambos. Normalmente, o resultado deve ser maior ou igual a 1).

Sequência de Caminhos
- As sequências de caminhos são os diferentes caminhos que podem ser seguidos durante a execução do programa. Cada caminho representa uma execução do início ao fim, considerando possíveis ramificações (condições if, exceções). É útil para planejar testes de software para cobrir todos os caminhos.
