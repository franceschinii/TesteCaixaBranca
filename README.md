# TesteCaixaBranca
 
 #Erros no código

1. **Carregamento do driver JDBC:**
- O nome da classe do driver do MySQL está incorreto. Deve ser `com.mysql.cj.jdbc.Driver` em vez de `com.mysql.Driver.Manager`.
- `newInstance()` é desnecessário ao carregar o driver.

2. **Manuseio de exceções:**
- Os blocos `catch` estão vazios, o que não é uma boa prática, pois você não terá informações sobre falhas. É importante pelo menos registrar ou imprimir a exceção.

3. **Construção da instrução SQL:**
- Está faltando um espaço antes da cláusula `where` na string SQL, o que causará um erro ao executar a query.
- - A concatenação direta de valores na query pode levar a vulnerabilidades de SQL Injection. Use `PreparedStatement` para evitar isso.

4. **Recuperação do nome do usuário:**
- Quando você chama `rs.getString(nome)`, você deve passar o nome da coluna em vez da variável `nome` que você definiu como uma string vazia. Deveria ser algo como `rs.getString("nome")`.
