# Review #1 [3/24] 00hrs
> Java
1. podemos colocar _ nos literais inteiros para os organizar melhor
2. javascript e uma linguagem fortemente tipada

4. campos sem inicialização tem sua propria inicialização
5. variaveis locais nao tem inicialização padrao
6. Um array e um conteiner para um numero variavel de arrays do mesmo tipo, com comprimento fixo em sua criação e apos criado nao pode ter o comprimento alterado

7. Cada item do array e chamado elemento e cada elemento e acessado por um indice numerico
8. O array para ser declarado sao necessario duas coisas, o tipo do array e o nome do array
9. O tamanho do array nao faz parte do seu tipo e por isso se usa [] vazios

11. Declarar um array e como criar uma classe, nao aciona o tipo, apenas cria
12. Voce pode colocar os colchetes do array no nome em vez do tipo, mas isso e desencorajado

13. Para criar um array voce usa a palavra-chave new
14. Quando voce usa a sintaxe atalha na inicialização do array, o comprimento do array seja embasado no numero de elementos que essa inicialização contem
15. operador de resto

16. operador + para concatenar duas string
17. Os operadores && e || apresentam um comportamento de curto-circuito
18. O instanceof verifica se um objeto e de um tipo especifico

19. Quando voce usa o operador =, o valor retornado e o valor da expressao que estar sendo usada na inicialização
20. um bloco de instrução e um conglomerado de expressoes que entao pode ser usada em qualquer lugar que uma expresso seria usado
# Review #2 [4/24] 23hrs
> Java
1. As declarações de campo sao definidos com um modificador, o tipo do campo e o nome do campo
2. A primeira letra de uma classe deve ser maiuscula
3. Os elementos necessarios em um metodo sao seu tipo de retorno, seu nome, seus parametros e seu corpo

4. Somente o nome do metodo e seus parametros sinalizam a assinatura de um metodo
5. A linguagem java suporta sobrecarga de metodo, isso e, metodos com o mesmo nome mas com a lista de parametros diferentes
6. O compilador nao usa o tipo de retorno para diferenciar sobrecarga

7. Uma classe declara construtores que entao serao usado para instanciação de uma classe apartir do blueprint da classe
8. Declarações de construtores parecem com declaração de metodos, exceto que nao tem tipo de retorno e o nome e o mesmo da classe
9. Nao e extremamente necessario, embora desencorajado, ter um construtor. Caso sua classe nao tenha um construtor, o compilador ira fornecer um construtor padrao sem argumentos, que entao chama o construtor da classe pai sem argumentos, e caso esse construtor pai nao tenha um construtor sem argumentos ai tem problema

10. Se uma outra classe nao puder chamar o construtor da classe, entao ela nao pode instanciar essa classe
11. Voce pode usar ... em um tipo de parametros e entao depois o nome do parametro para permitir que um metodo aceite um numero variavel de argumentos, incluindo nenhum argumento
12. Os argumentos dos metodos sao passados por valor por padrao

13. Apenas declarar um objeto nao significa nada, e voce recebera um erro do compilador se tentar acessar, voce so pode entao acessar um objeto apos instanciar ele com o new operador
14. Alem de alocar memoria necessaria para o objeto, o operador new chama implicitamente o construtor da classe
15. Um objeto pode ter multiplas referencias a ele

16. Voce pode usar o valor null para implicar na destruição explicita de um objeto
17. Voce pode usar static palavra chave para uma variavel comum entre todos os objetos da classe que pode tambem ser manipulado sem um objeto, no caso, so pela classe em si
18. tambem e possivel acessar campos static com uma referencia de objeto, embora nao seja encorajado porque nao dar para saber bem se e um campo de instancia ou static

19. Metodos de classe nao podem usar a this palavra chave
20. O modificador static pode ser juntada com o modificar final, para criar constantes
21. Existem dois niveis de acesso: nivel superior, public ou pacote-privado (sem uso de modificador). Nivel de membro, public, private, protected ou pacote-privado

# Now #3
> Java
1. O tipo do array e escrito como type[]

> C#
2. Uma propriedade e um membro que oferece um mecanismo flexivel de ler, gravar ou calcular o valor de um campo
3. As propriedades podem ser usados como membros de dados publicos, mas na real sao membros com sintaxe de acessadores
4. Os membros aptos de expressao consistem no simbolo => seguido na expressao a qual atribuir ou recuperar da propriedade

5. Membros aptos de expressao tambem podem ser usados para membros somente leitura, nesse caso nao se usa o acessador get nem a palavra chave return
6. Get e set tambem podem ser implementados com membros aptos de expressao
7. Voce define uma propriedade somente leitura com o acessador get/set entre {} e sem nenhuma especificação

8. As propriedades implementadas automaticamente pode definir diferentes acessibilidade para os acessadores
9. As propriedades combinam aspectos de metodos e campos, sendo para o usuario um campo e para o implementador um metodo com acessadores especiais
10. As propriedades sao declaradas no bloco de classe especificando o nivel de acesso, o tipo da propriedade, o nome e o corpo, nao se usa ()

11. As partes get/set de uma propriedade sao chamados acessadores, e normalmente tem acessibilidade igual a propriedade, no entanto, as vezes e util restringir essa acessibilidade
12. E possivel inicializar propriedade auto-implementadas da mesma forma que se inicializa um campo normal
13. Um metodo e um bloco de instruções contidas que entao so serao soltas/executadas quando o metodo e invocado

> Java
14. Usamos a palavra chave extends para que uma classe herde de outra
#