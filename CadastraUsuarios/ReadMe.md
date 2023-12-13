Sistema que cadastra novos usuários em um Banco de Dados.

Para entrar no sistema de cadastro é necessário primeiro fazer uma autenticação com um login e senha que já estejam no BD.

Feita essa autenticação, uma janela é aberta de acordo com o poder do usuário logado:
Se ele for adminstrador do sistema, ele terá a possibilidade de cadastrar tanto novos usuários como novos adminstradores.
Caso ele seja um usuário comum, ele só terá a possibilidade de cadastrar outros usuários.

Os adminstradores tambem possuem permissão para visualizar todos os usuários cadastrados numa tabela exibida dentro do App.

Algumas funções do aplicativo:
- Impede o cadastro de usuários/administradores nome já registrado.
- Impede o cadastro quando algum dos campos necessários se encontra vazio / nulo.
- Possibilita ao adminstrador visualizar a tabela de usuários atraves de diferentes ordenações.
- Na página inicial, caso as entradas sejam inválidas, informa ao usuário que não há nenhum cadastro que satisfaça as informações preenchidas.


Vídeo de demonstração: [![Watch the video](https://img.youtube.com/vi/W39lVCodKzg/maxresdefault.jpg)](https://www.youtube.com/watch?v=W39lVCodKzg)
