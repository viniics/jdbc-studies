A empresa CoderZ tem como um de seus princípios a valorização dos funcionários, e concede a todos o direito ao "Day-Off" no dia de aniversário.

Para se planejar para essas situações e conseguir dividar a demanda de forma mais eficiente, o gerente de operações criou um App em Java que acessa o Banco de Dados da empresa e lhe informa todos os funcionários que farão aniversário no mes atual.

Funcionamento do aplicativo: ao iniciar o Main, o usuario será questionado se deseja verificar os aniversariantes do mes atual ou se deseja fazer a consulta de um mes especifico.

Com base na reposta, o sistema executa a query apropriada.

ToDo:
- O sysout do RS.Next() está numa classe indevida, porem fazer um return de "ResultSet" causa uma SqlException, então o primeiro commit vai ser com o print na classe "AniversariantesDoMes"
- Classe para preencher aleatoriamente o DB com nomes aleatorios e obter uma melhor variedade de respostas.
- Formatar melhor a saída final