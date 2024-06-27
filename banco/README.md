## Abstração 

Iremos abstrair uma solução orientada a objetos em java.

"Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição)."

Nessa etapa criei as classes Banco, Cliente, ContaCorrente, ContaPoupanca. Defini que as contas devem ter uma agencia, numero, saldo e os metodos de sacar, depositar e transferir. Enquanto o banco e cliente devem possuir um nome.

## Encapsulamento

Encapsular significa *esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entende*. O encapsulamento favorece principalmente dois aspectos de um sistema: a manuntenção e a evolução.

Nessa etapa mudei os atributos para privado das classes.
No banco e Cliente foi criado os getters e setters, já nas contas criei apenas os setters para os atributos, já que devem ser itens imutáveis por pessoas de fora.

## Herança

*Permite  que você defina uma classe filha que reutiliza(herda), estende ou modifica o comportamento de uma classe pai.* A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

Nessa etapa criei as classes Conta e IConta. Para não ficar repetindo código na contaCorrente e poupança, criei a classe conta como a classe pai, ela terá os atributos e os getters, também as implementaçoes da interface. Em seguida, os dois tipos de contas receberão e extensão da classe pai.
 A Iconta, é a interface da conta, nela estára os metodos depositar sacar e saldo. É ela que foi implementada na classe pai.


## Polimorfismo 

*Capacidade de um objeto poder ser referenciado de várias formas,* ou seja, é a capacidade de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica. 
Cuidado, polimorfismo não quer dizer que o objeto fica se tranformando, pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.

Nessa etapa criei o construtor Conta() para determinar a agencia e o numero. Eles recebem a constante static determinando o valor inicial.

 Analogia para Private, Protected e Public: *Private é aquilo que só o pai sabe, Protected é aquilo que o Pai contous só para os 'membros de casa', e public é aquilo que o Pai contou e qualquer vizinho pode espalhar.

## Desenvolvendo saque, depósito, transferência e extrato

Em conta Poupança e corrente criei os metodos de imprimir extrato, na classe pai criei o metódo de imprimir informações comuns, sendo elas: Titular, Agência, número e saldo. Ainda na classe pai, determinei no construtor determinei que toda conta deverá ter um cliente, sendo assim as classes filhas carregam o cliente. 



