Teste automatizado - Exercio 1 - Soma com numeros aleatorios - Elias Nogueira 

Neste desafio, tente criar um script que some os dois valores e os inclua na caixa de texto. O resultado tem que ser o texto 'Correto'.

Dicas!!!

    Tente pegar o valor dos dois n�meros
    Tente som�-los com o Selenium
    Insira o valor somado na caixa de texto

Voc� vai precisar utilizar, no Selenium IDE, alguns comandos (nao exatamente os que ser�o listados para nao perder a gra�a, mas proximo deles):

    assertText
    store

Teste automatizado - Exercio 2 - Edi��o inline - Elias Nogueira 

Edi��o inline

Neste desafio tente editar os campos, onde a edi��o � ativada clicando sobre o valor.
Informa��es de Contato
Fulano de Tal
Email: fulano.detal@gmail.com
Telefone: 11 4453-8753
Passos

    Clique no nome 'Fulano de Tal' para edit�-lo
    Insire qualquer valor e clique em Salvar
    Repita os itens acima para os campos Email e Telefone
    Ap�s ter inserido todos os dados, valide que eles est�o sendo apresentados


Dicas!!!

    Sem dicas desta vez, este � facil!!!


Teste automatizado - Exercio 4 - Auto preenchimento de campos - Elias Nogueira 


Auto preenchimento de campos

Neste desafio, tente informar um CEP v�lido e aguardar alguns segundos at� que o endere�o seja preenchido. Depois disso garanta que os campos de endere�o est�o realmente preenchidos
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
    Os dados de Logradouro, Bairro, Cidadee Estado ser�o preenchidos automaticamente
    Preencha o campo N�mero com o valor: 1578
    Preencha o campo Complemento com o valor: MASP
    Para cada campo em tela, valide o seu conteudo com um assertValue ou assert* no caso do WebDriver
    Reexecute o script

Passos 2
Conseguiu fazer o script funcionar? Agora incremente com mais estes dois passos:

    Clique no bot�o Limpar
    Garanta que todos os campos na tela est�o sem preenchimento

Refer�ncia
Este exemplo foi retirado do link: http://www.republicavirtual.com.br/cep/exemplos.php 

Teste automatizado - Exercio 5 - IDs Din�micos - Elias Nogueira


IDs Din�micos

Neste desafio, tente criar um �nico script para sempre excutar sem que o erro de elementNotFound n�o seja apresentado por causa dos IDs din�micos dos elementos.
Username
Username (repetir)
Password
Password (repetir)


Intuito do desafio

No momento da execu��o do script, ap�s a grava��o dele pelo Passo 1 ele ir� falhar. O principal intuito deste desafio � usar como identificador do elemento os seus respectivos id's... Mas o que isso quer dizer?

O campo Username tem um padr�o de nome de id: user-NN, onde NN s�o dois n�meros. Ex: user-53 O campo Pasword tem um padr�o de nome de id: pwdLLLNN, onde LLL s�o tres letras e NN s�o dois n�meros. Ex: pwdwnh62
Agora que j� dei as dicas � com voces! Voces devem automatizar os passos e somente utilizar o ID como forma de localiza��o! Boa sorte!!!

Passo 1

    Informe os dois campos de Username
    Informe os dois campos de Password
    Clique no bot�o Enviar
    Reexecute o script
    Tente alterar o script para que ele execute sem falhas


Passos 2
Conseguiu executar o script com sucesso? Agora incremente com mais estes passos:

    Informe um Username que n�o sejam iguais
    Clique no bot�o Enviar
    Garanta que os campos de Username n�o est�o iguais validando a mensagem "Os campos n�o tem o mesmo valor!"


Teste automatizado - Exercio 6 - Valida��o de textos e comportamento on the fly - Elias Nogueira

Valida��o de textos e comportamento on the fly

Neste desafio, tente validar cada requisito da senha que � apresentado no momento da digita��o no campo senha
Comportamento

Se, para cada valor informado no campo senha, estiver dentro dos requisitos apresentados quando clicamos sobre o campo, o texto ficar� na cor verde, caso contr�rio em vermelho.

Exemplo: quando voc� digitar uma letra no campo senha, o texto Pelo menos uma letra passara da cor vermelha para verde, e � a valida��o dele passar para a cor verde que voc� deve fazer.

Verifica��o de senha

    Usu�rio:
    Senha:

Passos

Garanta que cada requisito abaixo, na ordem que est� listado

    Pelo menos uma letra
    Pelo menos uma letra mi�scula
    Pelo menos um n�mero
    Pelo menos 8 caracteres



