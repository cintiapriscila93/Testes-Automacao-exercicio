Teste automatizado - Exercio 1 - Soma com numeros aleatorios - Elias Nogueira 

Neste desafio, tente criar um script que some os dois valores e os inclua na caixa de texto. O resultado tem que ser o texto 'Correto'.

Dicas!!!

    Tente pegar o valor dos dois números
    Tente somá-los com o Selenium
    Insira o valor somado na caixa de texto

Você vai precisar utilizar, no Selenium IDE, alguns comandos (nao exatamente os que serão listados para nao perder a graça, mas proximo deles):

    assertText
    store

Teste automatizado - Exercio 2 - Edição inline - Elias Nogueira 

Edição inline

Neste desafio tente editar os campos, onde a edição é ativada clicando sobre o valor.
Informações de Contato
Fulano de Tal
Email: fulano.detal@gmail.com
Telefone: 11 4453-8753
Passos

    Clique no nome 'Fulano de Tal' para editá-lo
    Insire qualquer valor e clique em Salvar
    Repita os itens acima para os campos Email e Telefone
    Após ter inserido todos os dados, valide que eles estão sendo apresentados


Dicas!!!

    Sem dicas desta vez, este é facil!!!


Teste automatizado - Exercio 4 - Auto preenchimento de campos - Elias Nogueira 


Auto preenchimento de campos

Neste desafio, tente informar um CEP válido e aguardar alguns segundos até que o endereço seja preenchido. Depois disso garanta que os campos de endereço estão realmente preenchidos
CEP:
sem o "-"
Logadouro:
Numero:
Complemento:
Bairro:
Cidade:
Estado
Passos 1

    Informe o seguinte CEP no campo CEP: 01310200
    Os dados de Logradouro, Bairro, Cidadee Estado serão preenchidos automaticamente
    Preencha o campo Número com o valor: 1578
    Preencha o campo Complemento com o valor: MASP
    Para cada campo em tela, valide o seu conteudo com um assertValue ou assert* no caso do WebDriver
    Reexecute o script

Passos 2
Conseguiu fazer o script funcionar? Agora incremente com mais estes dois passos:

    Clique no botão Limpar
    Garanta que todos os campos na tela estão sem preenchimento

Referência
Este exemplo foi retirado do link: http://www.republicavirtual.com.br/cep/exemplos.php 

Teste automatizado - Exercio 5 - IDs Dinâmicos - Elias Nogueira


IDs Dinâmicos

Neste desafio, tente criar um único script para sempre excutar sem que o erro de elementNotFound não seja apresentado por causa dos IDs dinâmicos dos elementos.
Username
Username (repetir)
Password
Password (repetir)


Intuito do desafio

No momento da execução do script, após a gravação dele pelo Passo 1 ele irá falhar. O principal intuito deste desafio é usar como identificador do elemento os seus respectivos id's... Mas o que isso quer dizer?

O campo Username tem um padrão de nome de id: user-NN, onde NN são dois números. Ex: user-53 O campo Pasword tem um padrão de nome de id: pwdLLLNN, onde LLL são tres letras e NN são dois números. Ex: pwdwnh62
Agora que já dei as dicas é com voces! Voces devem automatizar os passos e somente utilizar o ID como forma de localização! Boa sorte!!!

Passo 1

    Informe os dois campos de Username
    Informe os dois campos de Password
    Clique no botão Enviar
    Reexecute o script
    Tente alterar o script para que ele execute sem falhas


Passos 2
Conseguiu executar o script com sucesso? Agora incremente com mais estes passos:

    Informe um Username que não sejam iguais
    Clique no botão Enviar
    Garanta que os campos de Username não estão iguais validando a mensagem "Os campos não tem o mesmo valor!"


Teste automatizado - Exercio 6 - Validação de textos e comportamento on the fly - Elias Nogueira

Validação de textos e comportamento on the fly

Neste desafio, tente validar cada requisito da senha que é apresentado no momento da digitação no campo senha
Comportamento

Se, para cada valor informado no campo senha, estiver dentro dos requisitos apresentados quando clicamos sobre o campo, o texto ficará na cor verde, caso contrário em vermelho.

Exemplo: quando você digitar uma letra no campo senha, o texto Pelo menos uma letra passara da cor vermelha para verde, e é a validação dele passar para a cor verde que você deve fazer.

Verificação de senha

    Usuário:
    Senha:

Passos

Garanta que cada requisito abaixo, na ordem que está listado

    Pelo menos uma letra
    Pelo menos uma letra miúscula
    Pelo menos um número
    Pelo menos 8 caracteres



