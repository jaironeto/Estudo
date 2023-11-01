# [AUTODITADO] Pergunta ChatGPT #9 Bard #12

- Os campos podem ser virtuais
- Como acessar tipos tupla
- Tipos tuplas sao mutaveis?
- c# diferença de estruturas de registro posicionais quanto estruturas de registro sem parâmetros posicionais:
- qual a diferença de um record só, e de um record class ou record struct?
- diferença de with e record simples, record class e record struct
- o que quer dizer com um record init-only por padrão?
- A especificação dos parâmetros de tipo genérico ao criar uma instância de uma classe genérica  e obrigatorio?
- membros apto para expressão podem ter {}
- c# tem hoisting? qual o escopo padrão
- c# tem closure?
- em c# os metodos sobrecarregados precisam ter o mesmo numero de parametros?

- A interface com implementação padrao nao pode ser acessado diretamente quando herdada?
- Uma interface com implementação padrão pode ser substituida por uma classe que herda essa interface? mesmo que a implementação da interface nao seja virtual
- metodos ou qualquer outro campo em uma interface pode ser virtual?
- quando se usa new palavra chave para tornar o metodo selead novamente virtual, precisa de virtual na declaração?
# [AUTODITADO] Observações

- Abstract e selead sao "variações" de estruturas de dados baseados em class, com mecanismo diferentes de uso. Portanto, há diferença conceitual entre interfaces; que tem como base outra estrutura de dados coms sua regras proprias, iguais ou nao a estruturas precedidas com class palavra-chave. Essa afirmação pressupe no não intercambel de herança entre interface e class (abstract, selead), e vice versa. O mesmo vale para struct, registro; sao todas estruturas distintas com suas proprias regras, iguals ou não a class, incapazes de intercambio de herança. Necessario o donwcast de class interface.

# <Microsoft-Conceitos-Basicos>
# [completed] Estrutura do Programa 
<!--https://hypothes.is/groups/99gVerPe/estudo?q=tag%3AC%23+tag%3A%22Estrutura+do+Programa%22#-->
# [completed] Sistema de Tipos
<!--https://hypothes.is/groups/99gVerPe/estudo?q=tag%3AC%23+tag%3ASistema-de-Tipos#-->
# [completed] Programação Orientada a Objeto
<!--https://hypothes.is/groups/99gVerPe/estudo?q=tag%3AC%23+tag%3APrograma%C3%A7%C3%A3o-Orientada-a-Objeto#-->
# (NOW] Técnicas Funcionais
# [completed] Exceções e erros
<!--https://hypothes.is/groups/99gVerPe/estudo?q=tag%3AC%23+tag%3AErro#-->
# [completed] Estilos de codificação
<!--https://hypothes.is/groups/99gVerPe/estudo?q=tag%3AC%23+tag%3AEstilos-de-codifica%C3%A7%C3%A3o#-->
# (NOT] Tutorials

# <Microsoft-Coceitos-de-C#>
# (NOT] Tipos de referência anuláveis
# (NOT] Migrações de referência anuláveis
# (NOT] Resolver avisos anuláveis
# [completed] Métodos
<!--https://hypothes.is/groups/99gVerPe/estudo?q=tag%3AC%23+tag%3AMetodos#-->
# [completed] Propriedades
<!--https://hypothes.is/groups/99gVerPe/estudo?q=tag%3AC%23+tag%3APropriedades#-->
# [completed] Indexadores
<!--https://hypothes.is/groups/99gVerPe/estudo?q=tag%3AC%23+tag%3AIndexadores#-->
# [completed] Iterators
<!--https://hypothes.is/groups/99gVerPe/estudo?q=tag%3AC%23+tag%3AIterators#-->
# [completed] Delegados e eventos
<!--https://hypothes.is/groups/99gVerPe/estudo?q=tag%3AC%23+tag%3ADelegados-e-eventos#-->
# (NOT] LINQ (Consulta Integrada à Linguagem)
# (NOT] Escrever código eficiente e seguro
# (NOT] Árvores de expressão
# (NOT] Interoperabilidade nativa
# (NOT] Controle de versão

# <Microsoft-Guia-de-programação>
# [completed] Instruções expressoes e igualdade
<!--https://hypothes.is/groups/99gVerPe/estudo?q=tag%3AC%23+tag%3AInstru%C3%A7%C3%B5es-expressoes-e-igualdade#-->
# (NOT] Tipos
# (NOT] Classes, Estruturas e Registos <polimorfismo,membros,propriedades>

> Polimorfismo
- A linguagem C# foi projetada para que 
- Isso também significa que uma classe deve declarar explicitamente se um método 
- Se o método na classe derivada não for precedido pelas palavras-chave new ou override
- Para aplicar a palavra-chave override ao método na classe derivada, o método da classe base deve 
- As palavras-chave override, virtual e new também podem ser aplicadas   
- Por padrão, os métodos C# 
- Os métodos de substituição não são considerados como  
- Segundo, você pode instruir o compilador C# para chamar o método virtual fazendo-o pesquisar a lista do método de classe base

- O modificador override
- modificador new
- Cada classe ou struct no C# herda
- Ao criar uma classe ou struct personalizada, é necessário 

> Membros
- Classes e structs têm membros que representam 
- Os membros de uma classe incluem  

- A palavra-chave abstract permite 
- A palavra-chave sealed permite 
- As classes podem ser declaradas como abstratas, colocando 
- Uma classe abstrata não pode
- A finalidade de uma classe abstrata é 
- As classes abstratas também podem definir métodos abstratos. Isso é realizado através 
- Os métodos abstratos não têm 
- As classes derivadas da classe abstrata devem 
- Quando uma classe abstrata herda um método virtual de uma classe base, a classe abstrata pode 
- As classes podem ser declaradas como sealed, colocando 
- Uma classe sealed não pode ser usada como 
- As classes sealed impedem 
- Um método, um indexador, uma propriedade ou um evento em uma classe derivada que está substituindo um membro virtual da classe base, pode 

- Uma classe static é basicamente o mesmo que 
- Criar uma classe estática é, portanto, basicamente o mesmo que
- Um construtor particular impede 
- A vantagem de usar uma classe estática 
- Classes estáticas são 
- Eles não podem herdar de nenhuma 
- Classes estáticas não podem conter 
- No entanto, eles podem conter 
- Existe apenas uma cópia 
- a menos que ele seja passado explicitamente 
- Métodos estáticos podem ser
- um campo const é essencialmente 
- Ele pertence
- Portanto, campos const podem ser acessados usando
- O C# não dá suporte a variáveis 
- Para acessar um membro de classe estática

- Todos os tipos e membros de tipo têm 
- O nível de acessibilidade controla 
- Um assembly é um
- As classes, os registros e os structs declarados em um namespace (em outras palavras, que não estão aninhadas em outras classes ou structs) podem ser
- Os membros de struct, incluindo classes e structs aninhados, podem ser 
- Os membros de classe, incluindo classes e structs aninhados, podem ser 
- Os membros de classe e struct, incluindo classes e structs aninhados, têm acesso 
- Tipos aninhados privados não são acessíveis 
- Os finalizadores não podem ter 
- Para definir o nível de acesso para um membro de class, record ou struct, adicione 
- o padrão das interfaces é o acesso 
- Membros de interface são
- Membros de enumeração sempre são 
- e nenhum modificador 
- Delegados se comportam como 
- Por padrão, eles têm acesso internal quando 
- e acesso private quando

- Um campo é  
- Uma classe ou um struct podem ter campos
- um campo estático pertence
- Você só pode acessar o campo estático 
- Em geral, você deve declarar a acessibilidade
- Os dados que o tipo expõe para o código de cliente devem ser fornecidos 
- Os campos são declarados no 
- Para acessar um campo em uma instância
- Os campos são inicializados 
- Se o construtor atribuir o valor de um campo
- Um inicializador de campo não pode
- Os campos estáticos estão disponíveis para chamadores 
- Um campo static readonly é semelhante a uma constante, exceto que o compilador C# 
- Um campo pode ser declarado required. Um campo obrigatório precisa 
- O modificador required não pode ser combinado 
- No entanto, a propriedade pode ser 

- As constantes são valores 
- Apenas os tipos internos do C# (excluindo System.Object) podem ser 
- O tipo de enumeração permite que você defina constantes
- Na verdade, quando o compilador encontra um identificador constante no código-fonte C# 
- Como não há nenhum endereço variável associado a uma constante em tempo de execução, os campos const 
- As constantes podem ser marcadas como 
- As constantes são acessadas como se fossem 

- Uma declaração de propriedade abstract não fornece 

- As constantes são campos cujos valores são definidos 
- No C#, a diretiva de pré-processador #define não pode ser utilizada 
- Para definir valores de constantes de tipos integrais 
- Para definir constantes não integrais, uma abordagem 
- Isso exigirá que todas as referências às constantes sejam precedidas 

> Propriedades
- Uma propriedade é um 
- As propriedades podem ser usadas como se fossem
- As propriedades permitem que uma classe exponha 
- Um acessador de propriedade get é usado para 
- um acessador de propriedade set é usado para 
- As definições de corpo da expressão consistem 
- Propriedades somente leitura podem implementar o acessador get como um membro apto para expressão. Nesse caso, nem a palavra-chave 
- Os acessadores get e set podem ser implementados como membros aptos para expressão. Nesse caso
- Usando propriedades autoimplementadas, você pode 
- Você define uma propriedade autoimplementada 
- As propriedades implementadas automaticamente podem declarar diferentes 
- Do C# 11 em diante, você pode adicionar o membro required para 

- As propriedades combinam
- Para o usuário de um objeto, uma propriedade 
- Para o implementador de uma classe, uma propriedade 
- O bloco de código para o acessador get é executado quando 
- O bloco de código para o acessador set é executado quando 
- Diferentemente dos campos, as propriedades 
- As propriedades são declaradas no bloco de classe, especificando 
- O local real dos dados de uma propriedade é frequentemente chamado
- O corpo do acessador get assemelha-se 
- A execução do acessador get é equivalente 
- O acessador get deve terminar 
- O código para criar um acessador init é o mesmo que o código para criar um acessador set, exceto 

- As propriedades da interface normalmente não 
- Ao contrário de classes e structs, declarar os acessadores sem 
- Uma interface pode definir 
- Definir uma implementação padrão para uma propriedade em uma interface é raro porque as interfaces 

- As partes get e set de uma propriedade ou de um indexador são chamadas 
- Por padrão, esses acessadores têm a mesma
- No entanto, às vezes é útil restringir 
- Quando você usa um acessador para implementar uma interface, o acessador 
- No entanto, se você implementar a interface usando um acessador

- As propriedades oferecem a conveniência 
- Propriedades declaram acessadores: métodos especiais 
- Depois de serem declaradas, as propriedades podem ser usadas como

- As propriedades autoimplementadas tornam 
- Você não pode declarar propriedades implementadas automaticamente
- É possível inicializar as propriedades autoimplementadas da mesma
# [completed] Interfaces
<!--https://hypothes.is/groups/99gVerPe/estudo?q=tag%3AC%23+tag%3Ainterfaces#-->
# [NOT] Delegados
<!--https://hypothes.is/groups/99gVerPe/estudo?q=tag%3AC%23+tag%3ADelegados#-->
# (NOT] Matrizes
# [completed] Cadeias de caracteres
<!--https://hypothes.is/groups/99gVerPe/estudo?q=tag%3AC%23+tag%3ACadeia-de-caracteres#-->
# [NOT] Indexadores
<!--https://hypothes.is/groups/99gVerPe/estudo?q=tag%3AC%23+tag%3AIndexadores#-->
# [NOT] Eventos
<!--https://hypothes.is/groups/99gVerPe/estudo?q=tag%3AC%23+tag%3AEventos#-->
# [NOT] Genericos
<!--https://hypothes.is/groups/99gVerPe/estudo?q=tag%3AC%23+tag%3AGenericos#-->
# (NOT] Sistema de arquivos e o Registro
# (NOT] Interoperabilidade

# Metadado
[last-update-content-extern-NOW]
[agora] revisar o que tem
[depois] curso learn microsoft