# <Material-Complementar> <!-- -->
# [AUTODITADO] Pergunta ChatGPT Bard 
- se um then() for encadeado por um catch(), e assim sucessivamente, o catch apos um dos then sera executado? 
# [AUTODITADO] Codigo Concepts Photographic Memory 
-  literal de objeto definindo a __proto__, shorthand handler: handler, super chamada
- finally retornando o valor unico do bloco try...catch
- definir uma função com uma expressão de funçõa condicionalmente
- **10/23** 
- lançar uma exeção com um bloco de instrução
- criar uma função com function construtor

# <Blibioteca-e-apis> <!-- -->
# [BUILT-IN]

O estudo das funções se embasa não na exelencia da rápida obtenção, mas em uma noção previa para fins de revisão em tempo real paralelo ao codigo; e impossivel decorar tudo, experiencia própria

## <Propriedades-de-valor>
## [NOT] globalThis
## [NOT] Infinity
## [NOT] NaN
## [NOT] undefined

## <Propriedades-da-função>
## [NOT] eval()
## [NOT] isFinite()
## [NOT] isNaN()
## [NOT] parseFloat()
## [NOT] parseInt()
## [NOT] decodeURI()
## [NOT] decodeURIComponent()
## [NOT] encodeURI()
## [NOT] encodeURIComponent()

## <Objetos-fundamentais>
## [NOT] Object
## [NOT] Function
## [NOT] Boolean
## [NOT] Symbol

## <Objetos-de-erro>
## [NOT] Error
## [NOT] AggregateError
## [NOT] EvalError
## [NOT] RangeError
## [NOT] ReferenceError
## [NOT] SyntaxError
## [NOT] TypeError
## [NOT] URIError

## <Números-e-datas>
## [NOT] Number
## [NOT] BigInt
## [NOT] Math
## [NOT] Date

## <Processamento-de-texto>
## [NOT] String
## [NOT] RegExp


# <MDN-Primeiros-passos-do-JavaScript> <!-- -->
# [2023] O que é JavaScript? 
# [2023] Uma primeira introdução ao JavaScript 
- Eventos são
- Um for...of loop oferece uma maneira 
# [2023] Armazenando as informações que você precisa – Variáveis 
- Uma variável é um 
- Uma coisa especial sobre variáveis ​​é que elas podem conter 
- As variáveis ​​não são 
- Depois de declarar uma variável, você pode 
- Isso funciona por causa do içamento 
- Em segundo lugar, quando você usa var, você pode declarar 
- JavaScript é uma "linguagem de tipo dinâmico"
- Além de variáveis, você pode declarar constantes. São como variáveis, exceto
- Observe que embora uma constante em JavaScript deva sempre nomear o mesmo valor, você pode alterar
# [2023] Matemática básica em JavaScript – números e operadores 

- o JavaScript possui apenas um tipo
- Portanto, você só pode incrementar uma variável existente
- Tente digitar alguns dos exemplos acima em seu console para ter uma ideia de como eles funcionam
# [2023] Manipulando texto – strings em JavaScript 

- Essas linhas não funcionam porque qualquer texto sem aspas é considerado
- Os literais de modelo respeitam 
- Para obter a saída equivalente usando uma string normal, você teria 
- O que acontece quando tentamos concatenar uma string e um número?
# [2023] Matrizes 

- As matrizes consistem 

# <MDN-Blocos-de-construção-JavaScript> <!-- -->
# [2023] Tomando decisões em seu código – condicionais 

- Um erro comum ao usar o operador lógico OR em instruções condicionais 
# [2023] Código em loop 

- Mas também existem outras coleções em JavaScript
- A ferramenta básica para percorrer uma coleção 
# [2023] Funções — blocos de código reutilizáveis 

- A linguagem JavaScript possui muitas funções integradas que permitem
- Funções que fazem parte de objetos são chamadas
- Se você estiver escrevendo uma função e quiser oferecer suporte a parâmetros opcionais
- Isso é chamado de função anônima 
- arrow function
- Se a função usar apenas um parâmetro
- Finalmente, se sua função contiver apenas uma linha
- Quando você cria uma função, as variáveis ​​e outras coisas definidas dentro da função ficam
- O nível superior fora de todas as suas funções é chamado
# [2023] Crie sua própria função 

- Começamos com a palavra-chave function, o que significa que estamos definindo uma função. Isso é seguido 
- Os parênteses neste contexto são às vezes chamados de "operador de invocação de função". Você só os usa quando 
# [2023] Valores de retorno da função 

- Algumas funções não retornam nenhum valor. (Nesses casos, nossas páginas de referência listam o valor de retorno como)
- Para retornar um valor de uma função personalizada, você precisa 
# [2023] Introdução aos eventos 

- Eventos são coisas 
- Para reagir a um evento
- Ao fazer mais de uma chamada para addEventListener(), fornecendo manipuladores diferentes, você pode ter 
- Às vezes, dentro de uma função de manipulador de eventos, você verá um parâmetro especificado com um nome como event, evtou e. Isso é chamado


# <MDN-Apresentando-objetos-JavaScript> <!-- -->
# [10/23] Noções básicas de objetos JavaScript 

- Um objeto é uma coleção 
- Geralmente consistem em diversas 
- Tal como acontece com muitas coisas em JavaScript, a criação de um objeto geralmente começa 
- Bem, um objeto é composto de vários membros, cada um dos quais possui 
- O valor de um membro de objeto pode ser 
- Quando os membros do objeto são funções a sintaxe é mais simples
- O nome do objeto (pessoa) atua como namespace
- A notação de colchetes fornece uma maneira alternativa
- Não é de admirar que os objetos às vezes sejam chamados de arrays associativos 
- Até agora, analisamos apenas a recuperação (ou obtenção ) de membros de objetos — você também pode
- Você provavelmente está se perguntando o que é “isso”. A this palavra-chave refere-se 
- Um construtor é apenas uma 
- Quando você chama um construtor, ele irá
- Os construtores, por convenção
# [10/23] Protótipos de objetos 

- Protótipos são o mecanismo pelo qual os objetos JavaScript 
- Cada objeto em JavaScript possui uma propriedade integrada
- O protótipo é em si 
- então o protótipo terá 
- A cadeia termina quando 
- Quando você tenta acessar uma propriedade de um objeto: se a propriedade não puder ser encontrada no próprio objeto
- Isso é chamado de "sombreamento" da propriedade
- Existem várias maneiras de definir o protótipo de um objeto em JavaScript, e aqui descreveremos duas
- Em JavaScript, todas as funções possuem 
- Quando você chama uma função como construtor
- É comum ver esse padrão, em que os métodos são definidos
# [10/23] Programação orientada a objetos 

- Por si só, uma classe não faz nada
- O processo de criação de uma instância é executado
- Passamos valores ao construtor para qualquer 
- construtores em JavaScript nos fornecem algo como uma definição de classe, permitindo-nos definir
- a cadeia de protótipos parece uma forma natural de implementar herança
- Em JavaScript, podemos criar objetos, e muitas vezes o fazemos, sem qualquer definição
- Isso pode tornar o trabalho com objetos muito mais leve do que na OOP clássica
- Com a prototipagem, cada nível da hierarquia é representado 
- comportamento da cadeia de protótipos é menos parecido com herança e mais com delegação
# [10/23] Classes em JavaScript 

- Você pode declarar uma classe usando 
- A name;declaração é opcional: você pode omiti-la e a linha this.name = name; no construtor criará 
- O construtor é definido usando 
- Se não precisar fazer nenhuma inicialização especial, você pode omitir 
- construtor padrão será gerado 
- Usamos a extendspalavra-chave 
- A primeira coisa que esse construtor faz é chamar 
- Se uma subclasse tiver alguma inicialização própria para fazer, ela deve primeiro 
# [NOT] Trabalhando com JSON 

- JavaScript Object Notation (JSON) é um formato
- É comumente usado para transmitir dados em aplicações web 
- JSON é um formato de dados baseado em texto que segue a sintaxe 
- Embora se assemelhe muito à sintaxe literal do objeto JavaScript, ele pode ser usado
- JSON existe como 
- útil quando você deseja transmitir
- Ele precisa ser convertido em um objeto JavaScript nativo quando você quiser
- desserialização 
- serialização 
- Uma string JSON pode ser armazenada em seu próprio arquivo, que é basicamente apenas um arquivo 
- Você pode incluir os mesmos tipos de dados básicos dentro do JSON que em um objeto JavaScript padrão 
- Também podemos converter arrays de/para JSON
- JSON é puramente uma string com um formato de dados especificado – contém apenas 
- JSON requer o uso de aspas duplas em torno 
- Na verdade, o JSON pode assumir a forma 
- Ao contrário do código JavaScript em que as propriedades do objeto podem não estar entre aspas, no JSON apenas 

# <MDN-JavaScript-assíncrono> <!-- -->
# [10/23] Apresentando JavaScript assíncrono 
- programação assíncrona é uma técnica que permite que seu programa 
- Devemos observar aqui que o navegador percorre efetivamente o programa, uma linha por vez, na ordem em que o escrevemos. A cada ponto, o navegador
- Isso torna este um programa síncrono. Ainda seria síncrono mesmo se chamássemos 
- E se a função síncrona demorar muito?
- Os manipuladores de eventos são na verdade uma forma de programação assíncrona: você fornece uma função (o manipulador de eventos) que será chamada
- Se "o evento" for "a operação assíncrona foi concluída", esse evento poderá ser usado para 
- Um manipulador de eventos é um tipo específico 
- Um retorno de chamada é apenas uma função
- Em vez disso, a base da programação assíncrona em JavaScript 
# [10/23] Como usar promessas 

- As promessas são a base 
- Uma promessa é um 
- que representa
- No momento em que a promessa é retornada ao chamador
- mas o objeto da promessa fornece métodos para lidar 
- Com uma API baseada em promessa, a função assíncrona 
- Mas a característica elegante das promessas é que then() elas mesmas 
- encadeamento de promessas
- Para suportar o tratamento de erros, Promiseos objetos fornecem 
- No entanto, enquanto o manipulador passado para then() é chamado quando a operação assíncrona é bem-sucedida , o manipulador passado para catch()
- Se você adicionar catch() ao final de uma cadeia de promessas
- Primeiro, uma promessa pode estar em um dos três estados
- Uma promessa é resolvida se for 
- Às vezes, você precisa que todas as promessas sejam cumpridas, mas elas não dependem umas das outras
- Às vezes, você pode precisar que qualquer uma de um conjunto de promessas seja cumprida, e não se importa com qual delas
- A async palavra-chave oferece uma maneira 
- Adicionar async no início 
- Dentro de uma função assíncrona, você pode usar 
- Isso faz com que o código espere até que 
- Isso permite escrever código que usa funções assíncronas, mas que 
- Podemos até usar um try...catchbloco para tratamento de erros, exatamente como 
- Observe, porém, que as funções assíncronas sempre retornam
- Além disso, observe que você só pode usar await
- Tenha em mente que, assim como uma cadeia de promessas, await força a conclusão 
# [10/23] Como implementar uma API baseada em promessas 

- O Promise() construtor usa uma única 
- Ao criar uma nova promessa você fornece 
- Esta função executora em si leva 
- que também são
- Na implementação do seu executor, você chama 
- Se a função assíncrona for bem-sucedida, você chama 
- Você pode passar um único parâmetro de qualquer 
# [NOT] Apresentando trabalhadores 

- Fundamentalmente, a razão para isso é que o programa é de thread único
- Um thread é uma 
- Como o programa consiste em um único thread, ele só pode fazer
- Os trabalhadores oferecem a capacidade de executar 
- Uma preocupação de tudo isso é que, se vários threads puderem ter acesso 
- Para evitar esses problemas na web, seu código principal e seu código de trabalho nunca 
- Os trabalhadores e o código principal são executados 
- Em particular, isso significa que os trabalhadores não podem 
- Existem três tipos diferentes de trabalhadores
- Primeiro, estamos criando o trabalhador usando 
- A generatePrimes()função é igual à versão síncrona, exceto que em vez de retornar um valor, enviamos uma mensagem para o script principal quando terminamos. Usamos 
- O trabalhador que acabamos de criar era chamado de trabalhador dedicado . Isso significa que ele é usado 
- Existem outros tipos de trabalhadores

# <MDN-Guia-JavaScript> <!-- -->
# [10/23] Gramática e tipos
- JavaScript diferencia 
- Um ponto e vírgula não é necessário após uma instrução se ela estiver 
- O texto fonte do script JavaScript é digitalizado da esquerda para a direita e convertido em uma sequência 
- Os comentários se comportam como 
- Isso é chamado de sintaxe de comentário hashbang e é um comentário especial usado para especificar 
- JavaScript possui três tipos de declarações de variáveis
- Um identificador JavaScript geralmente começa 
- Com a palavra-chave var. Por exemplo, var x = 42. Esta sintaxe pode ser usada para declarar variáveis 
- Você pode declarar variáveis ​​para descompactar valores usando a sintaxe
- JavaScript usado para permitir a atribuição a variáveis ​​não declaradas, o que cria
- Uma variável pode pertencer a um dos seguintes escopos
- Quando você declara uma variável fora de qualquer função, ela é champorque está disponível para qualquer outro código
- Quando você declara uma variável dentro de uma função, ela é chamada
- var-variáveis ​​declaradas são hoisted, o que significa
- Porém, se você acessar uma variável antes de ela ser declarada
- zona morta temporal
- Ao contrário vardas declarações, que apenas elevam a declaração, mas não seu valor, as declarações de função
- Variáveis ​​globais são na verdade
- Nas páginas da web, o objeto global
- Em todos os ambientes, você pode usar
- No entanto, const evita apenas reatribuições , mas não evita mutações
- O padrão ECMAScript mais recente define oito tipos de dados
- JavaScript é uma linguagem de tipagem dinâmica 
- Em expressões que envolvem valores numéricos e de string com o + operador
- Com todos os outros operadores, o JavaScript não converte 
- Caso um valor representando um número esteja na memória como uma string
- Literais representam valores em JavaScript. Esses são valores fixos 
- Um literal de array é uma lista
- Quando você cria uma matriz usando um literal de matriz, ela é inicializada com os valores
- Literais de array criam Array objetos
- Se você colocar duas vírgulas seguidas em uma matriz literal
- Observe que o segundo item está “vazio”, o que não é exatamente igual ao undefined valor real. Ao usar métodos de passagem de array como Array.prototype.map
- Se você incluir uma vírgula no final da lista de elementos
- Um literal de objeto é uma lista de zero ou mais pares 
- Não use um objeto literal no início de uma instrução
- Além disso, você pode usar um literal numérico ou de string para o nome 
- Se o nome da propriedade não for um identificador ou número JavaScript válido, ele deverá 
- Nomes de propriedades que não são identificadores válidos não podem ser acessados ​​
# [10/23] Fluxo de controle e tratamento de erros 

- A instrução mais básica é uma instrução em bloco, usada
- JavaScript oferece suporte a duas instruções condicionais
- Você também pode compor as instruções usando else if
- Em geral, é uma boa prática não ter if...else uma
- Os seguintes valores são avaliados como false `6`
- Todos os outros valores — incluindo todos os objetos — são avaliados 
- Não confunda os valores booleanos primitivos true e false
- Uma switch instrução permite que um programa 
- O programa primeiro procura uma case cláusula
- Se nenhum rótulo correspondente for encontrado
- Se uma default cláusula for encontrada
- Se nenhuma default cláusula for encontrada
- Por convenção, a defaultcláusula é escrita como a última cláusula
- Se break for omitido
- Você pode lançar exceções usando 
- e tratá-las usando 
- Embora seja comum lançar números ou strings como erros, frequentemente é mais eficaz usar
- Use a throw instrução para 
- Uma throw instrução especifica 
- Você pode lançar qualquer expressão, não apenas expressões de um tipo específico
- Se uma exceção for lançada, a try...catch instrução a captura
- A try...catchinstrução consiste 
- Se nenhuma exceção for lançada no try bloco
- O finally bloco é executado 
- Entretanto, se uma exceção for lançada, as instruções no finally bloco serão executadas mesmo que
- Se o finally bloco retornar um valor, esse valor se tornará
# [10/23] Loops e iteração 

- Os loops oferecem uma maneira rápida e fácil
- Existem muitos tipos diferentes de loops, mas todos fazem essencialmente a mesma coisa
- O valor de label pode ser qualquer
# [10/23] Funções 

- function definition
- Os parâmetros são essencialmente passados ​​para funções
- Ao passar um objeto como parâmetro
- Quando você passa um array como parâmetro
- expressão de função 
- função pode ser anônima 
- Fornecer um nome permite que a função se refira a si mesma e também facilita a identificação da função nos rastreamentos de pilha de um depurador
- Expressões de função são convenientes ao passar uma função como argumento para outra função
- Além de definir funções conforme descrito aqui, você também pode usar o Function construtor 
- Um método é uma função 
- Definir uma função não a executa 
- As funções devem estar no escopo quando são chamadas, mas a declaração da função
- Os argumentos de uma função não estão limitados
- Acontece que as próprias funções são objetos
- As variáveis ​​definidas dentro de uma função não podem ser acessadas 
- No entanto, uma função pode acessar todas as variáveis ​​e funções definidas dentro do escopo em que está definida
- Existem três maneiras de uma função se referir a si mesma
- Na verdade, a própria recursão usa uma pilha: a pilha de funções
- Você pode aninhar uma função dentro de outra função. A função aninhada (interna) é privada da função que a contém (externa)
- Como uma função aninhada é um fechamento, isso significa que uma função aninhada pode "herdar" 
- O inverso, porém, não é verdade. Anão pode acessar C
- Quando dois argumentos ou variáveis ​​nos escopos de um encerramento possuem o mesmo nome
- Se uma função fechada definir uma variável com o mesmo nome de uma variável no escopo externo, não haverá como
- Os argumentos de uma função são mantidos
- Dentro de uma função, você pode endereçar os argumentos passados ​​a ela
- Existem dois tipos especiais de sintaxe de parâmetro
- Em JavaScript, os parâmetros das funções são padronizados como
- No entanto, em algumas situações pode ser útil definir um valor padrão diferente 
- Com parâmetros padrão, uma verificação manual no corpo da função não é mais necessária
- A sintaxe do parâmetro restante nos permite representar 
- Dois fatores influenciaram a introdução das funções de seta
# [10/23] Expressões e operadores 

- Existem dois tipos de expressões
- Uma exceção é o deslocamento para a direita não assinado ( >>>) , que não está definido para valores BigInt. Isso ocorre porque um BigInt não possui largura fixa
- BigInts e números não são mutuamente substituíveis 
- Isso ocorre porque BigInt não é um subconjunto nem um superconjunto de números
- Use a conversão explícita para sinalizar se você deseja que a operação seja numérica ou BigInt
- Você pode comparar BigInts com números
- x = f()
- x += f()
- x -= f()	
- x *= f()	
- x /= f()	
- x %= f()	
- x **= f()	
- x <<= f()	
- x >>= f()	
- x >>>= f()	
- x &= f()	
- x ^= f()	
- x |= f()	
- x &&= f()	
- x ||= f()	
- x ??= f()	
- ==
- !=
- ===
- !==
- '>'
- '>='
- <
- <=
- %
- ++
- '--'
- -
- +
- **
- a & b
- a | b
- a ^ b
- ~ a
- a << b
- a >> b
- a >>> b
- typeof operador
- delete operador
- void operador
- in operador
- operador vírgula 
- instanceof operador 
# [10/23] Formatação de texto 

- Cada elemento da String ocupa
- Você pode criar strings simples usando aspas
- Literais de modelo são literais de string que permitem expressões incorporadas
- Literais de modelo são delimitados
# [10/23] Coleções indexadas 

- O que ocorre se atribuirmos 0 a length da matriz
- O que são slot's vazios? como declarar? diferença para undefined? se comporta como undefined quando
- Para criar uma matriz com comprimento diferente de zero, mas sem nenhum item
- Se você deseja inicializar uma matriz com um único elemento e o elemento for um Number
# [2023] Coleções codificadas 

- O que é o map objeto
# [10/23] Trabalhando com objetos 

- > Um objeto é uma coleção 
- uma propriedade é uma associação 
- O valor de uma propriedade pode ser uma função; nesse caso, a propriedade é conhecida como 
- Você pode criar um objeto usando 
- Inicializadores de objetos também são chamados 
- O nome da propriedade também pode ser uma expressão
- Observe que você pode precisar colocar o literal do objeto entre parênteses se o objeto
- Inicializadores de objeto são expressões, e cada inicializador de objeto resulta
- Inicializadores de objetos idênticos criam objetos
- Observe o uso de this para atribuir valores às propriedades do objeto 
- As propriedades dos objetos são basicamente iguais às variáveis, exceto
- Os acessadores de propriedade vêm em duas sintaxes
- O nome de uma propriedade de objeto pode ser qualquer 
- No entanto, tome cuidado ao usar colchetes para acessar propriedades cujos nomes são fornecidos por entrada externa
- Propriedades inexistentes de um objeto têm valor 
- O termo “propriedade própria” refere-se 
- Você pode adicionar uma propriedade a todos os objetos criados por meio 
- Um método é uma função associada a um objeto ou, dito de outra forma, um método 
- this é um "parâmetro oculto" de uma chamada de função que é passada especificando 
- Um getter é uma função associada a uma propriedade que obtém
- Um setter é uma função associada a uma propriedade que define
- Getters e setters podem ser
# [YES] Usando classes 

- JavaScript é uma linguagem baseada em protótipos — os comportamentos de um objeto são especificados 
- Em muitas outras linguagens, classes ou construtores são claramente diferenciados de objetos ou instâncias. Em JavaScript, as classes são principalmente 
- As classes criam objetos por meio 
- A própria classe armazena algumas propriedades (dados ou métodos), que geralmente são usadas para interagir com instâncias
- Construtores de funções típicos podem ser construídos
- No entanto, tentar "chamar" uma classe sem
- Ao contrário das declarações de função, as declarações de classe não são
- Expressões de classe também podem ter nomes. O nome da expressão só é visível 
- A sintaxe do construtor é exatamente a mesma de uma função normal — o que significa que você pode usar 
- O this valor será retornado automaticamente como resultado de new. É aconselhável não
- Um campo privado é um identificador prefixado 
- O hash é parte integrante do nome do campo, o que significa 
- Os campos privados em JavaScript são hard private: se a classe não implementar métodos que exponham 
- Isso significa que você está seguro para refatorar os campos privados da sua classe, desde que
- Um método de classe pode ler os campos privados de outras instâncias, desde que 
- Acessar uma propriedade privada inexistente gera 
- > Existem algumas limitações no uso de propriedades privadas
- Métodos, getters e setters também podem ser privados
- > Os blocos de inicialização estáticos são quase equivalentes à execução 
- Quando você usa extends, os métodos estáticos
# [NOT] Usando promessas 

- A Promise é um objeto representa
- Essencialmente, uma promessa é um objeto retornado ao qual você
- Sempre retorne resultados, caso contrário os retornos de chamada não capturarão 
- Isso pode ser pior se você tiver condições de corrida — se a promessa do último manipulador não for retornada, o próximo thenmanipulador será chamado antecipadamente e qualquer 
- No Node.js , lidar com a rejeição de promessas é um pouco diferente. Você captura rejeições não tratadas adicionando 
- Por outro lado, as promessas são uma forma de inversão de controle — o implementador da API não controla quando o retorno de chamada é chamado. Em vez disso, o trabalho de manter a fila de retorno de chamada 
- Os retornos de chamada adicionados then()nunca serão
- Esses retornos de chamada serão invocados mesmo que tenham sido adicionados após 
- Vários retornos de chamada podem ser adicionados ligando then()várias vezes. Eles serão invocados 
- Para evitar surpresas, as funções passadas then()nunca serão
- Em vez de ser executada imediatamente, a função passada é colocada em uma fila de microtarefas, o que significa que ela é executada 
- Os retornos de chamada de promessa são tratados como uma microtarefa , enquanto setTimeout()os retornos de chamada são
- Se você se deparar com situações em que tem promessas e tarefas (como eventos ou retornos de chamada) que são disparadas em ordens imprevisíveis, é possível 
# [NOT] Iteradores e geradores 

- Iteradores e Geradores trazem o conceito de iteração diretamente para a linguagem principal e fornecem um mecanismo
- Em JavaScript, um iterador é um objeto que define
- Especificamente, um iterador é qualquer objeto que implemente
- Uma vez criado, um objeto iterador pode ser iterado explicitamente chamando 
- Diz-se que iterar sobre um iterador 
- Depois que um valor final for gerado, chamadas adicionais next()devem 
- O iterador mais comum em JavaScript é o iterador Array , que retorna 
- Embora seja fácil imaginar que todos os iteradores possam ser expressos como matrizes, isso não é verdade. Os arrays devem
- Embora os iteradores personalizados sejam uma ferramenta útil, sua criação requer uma programação cuidadosa devido à necessidade de manter explicitamente seu estado interno. As funções geradoras fornecem 
- As funções geradoras são escritas usando
- Quando chamadas, as funções geradoras inicialmente não executam seu código. Em vez disso
- Quando um valor é consumido chamando o nextmétodo do gerador
- A função pode ser chamada quantas vezes desejar e retorna 
- Cada Gerador só pode 
- Um objeto é iterável se definir 
- Para ser iterável , um objeto deve implementar 
- Pode ser possível iterar sobre um iterável 
- Iteráveis ​​que podem iterar apenas uma vez (como Geradores) normalmente retornam 
- Algumas declarações e expressões esperam iteráveis
- Os geradores calculam seus yieldvalores ed sob demanda , o que lhes permite representar 
- O next()método também aceita um valor, que pode ser utilizado
- Um valor passado para next() será
- Um valor passado para a primeira chamada next()é sempre 
- Se a exceção não for capturada dentro do gerador, ela se propagará através da chamada para throw()e as chamadas subsequentes para next()resultarão 
- Os geradores possuem um return()método que retorna 
# [NOT] Metaprogramação 

- Os objectos Proxye Reflectpermitem-lhe interceptar e definir
- Com a ajuda desses dois objetos você é capaz de programar 
- Proxyobjetos permitem que você intercepte
- o Proxy objeto define 
- Aqui, um objeto com proxy não retornará undefinedao obter propriedades indefinidas, mas retornará o número 42
- Os termos a seguir são usados ​​quando se fala sobre a funcionalidade dos proxies
- manipulador
- armadilhas
- alvo
- invariantes
- O Proxy.revocable()método é usado para 
- Reflecté um objeto integrado que fornece 
- Reflectnão é um 
- Reflectajuda a encaminhar operações
- SerfrenteReflect, você normalmente usa o Function.prototype.apply() método
- Com Reflect.applyisso fica menos detalhado e mais fácil de entender
- com Object.defineProperty, que retorna um objeto
- ecauseReflect.defineProperty()retorna um status de sucesso booleano, você pode
# [NOT] Módulos JavaScript 

- O uso de módulos JavaScript nativos depende das instruções
- No entanto, decidimos continuar usando .js, pelo menos por enquanto. Para que os módulos funcionem corretamente em um navegador, você precisa ter certeza de que seu servidor 
- A primeira coisa que você faz para obter acesso aos recursos do módulo é exportá-los. Isso é feito usando 
- Você pode exportar 
- Eles precisam ser itens de nível superior; você não pode usar export 
- Uma maneira mais conveniente de exportar todos os itens que você deseja exportar é usar 
- Depois de importar os recursos para o seu script, você poderá usá-los exatamente como 
- Os valores importados são visualizações somente
- Os mapas de importação 
- HTMLScriptElement.supports()
- Primeiro de tudo, você precisa incluir type="module"no elemento, para declarar
- Há também um tipo de exportação chamada exportação padrão - projetada para facilitar
- Novamente, observe a falta de chaves. Isso ocorre porque 
- Dentro das chaves da instrução importand , você pode usar a palavra-chave junto com um novo nome de recurso, para alterar
- E funcionaria da mesma forma. O estilo que você usa depende de você, no entanto, faz mais sentido deixar o código do módulo em paz e fazer as alterações nas importações. Isso faz sentido especialmente quando 
- Como sugerimos anteriormente, você também pode exportar e importar classes; esta é outra opção para evitar conflitos em seu código e é especialmente útil se você 
- As exportações referenciadas basicamente são redirecionadas através 
- Uma adição recente à funcionalidade dos módulos JavaScript é o carregamento dinâmico de módulos. Isso permite 
- Observe que, como o cumprimento da promessa retorna um objeto de módulo, a classe se torna então um sub-recurso do objeto, portanto, agora 
- Outra vantagem das importações dinâmicas é que elas estão sempre disponíveis, mesmo em ambientes de script. Portanto
- Os módulos podem importar outros módulos, e esses módulos podem importar outros módulos e assim por diante



# <MDN-Intermediário> <!-- -->
# (NOT] Estruturas JavaScript do lado do cliente
# (NOT] APIs da web do lado do cliente
# (NOT] Visão geral do idioma
# (NOT] Estruturas de dados JavaScript
# (NOT] Comparações de igualdade e mesmice
# (NOT] Enumerabilidade e propriedade de propriedades
# (NOT] Fechamentos

# <MDN-Avançado> <!-- -->
# (NOT] Herança e a cadeia de protótipos
# (NOT] Gerenciamento de memória
# (NOT] Modelo de simultaneidade e loop de eventos

# <MDN-Referencia-Functions> <!-- -->
# [NOT] Overview 

- De modo geral, uma função é um
- Assim como o próprio programa, uma função 
- Os valores podem ser passados ​​para uma função 
- Em JavaScript, as funções são objetos de primeira classe , porque podem
- Os valores de função normalmente 
- Por padrão, se a execução de uma função não terminar em uma returninstrução ou se a returnpalavra-chave não tiver uma expressão depois dela
- A return instrução permite 
- Uma chamada de função pode retornar apenas um valor, mas você pode
- Construtores chamados with newpossuem
- Parâmetros e argumentos têm 
- O valor do argumento pode ser acessado 
- Os argumentos são sempre 
- A thispalavra-chave refere-se ao objeto
- De modo geral, JavaScript possui quatro tipos de funções
- Para cada tipo de função, existem três maneiras de defini-la
- As classes não são conceitualmente funções
- Todas as sintaxes fazem aproximadamente a mesma coisa, mas existem algumas diferenças sutis de comportamento
- As sintaxes Function()de construtor, functionexpressão e functiondeclaração criam
- No entanto, funções e métodos de seta 
- Funções assíncronas, funções geradoras e funções geradoras assíncronas 
- A functiondeclaração cria 
- A função de seta e Function()o construtor sempre 
- Uma maneira de chamar uma função de seta recursivamente 
- A sintaxe da função de seta não 
- O Function()construtor 
- O Function()construtor causa 
- Para functionexpressões, há uma distinção entre o nome da função e a variável à qual a função está atribuída. O nome da função 
- O nome da função pode ser diferente da variável à qual a função está atribuída 
- Por outro lado, a variável à qual a função é atribuída é limitada
- Uma declaração de função também 
- Uma função definida por new Functionterá 
- Esta é a fonte real usada para compilar a função. Porém, embora o Function()construtor crie a função com name anonymous, esse nome
- Uma função definida por uma expressão de função ou por uma declaração de função herda 
- Por outro lado, uma função definida por um Functionconstrutor não
- Funções definidas por expressões de função e declarações de função são analisadas apenas uma vez, enquanto uma função definida pelo Functionconstrutor 
- Embora uma expressão de função sempre crie um fechamento, o corpo da função 
- Portanto, o Functionconstrutor geralmente 
- Uma declaração de função pode ser transformada involuntariamente 
- Uma instrução de expressão não pode 
- Em vez disso, inicie a instrução de expressão com outra coisa, para que a functionpalavra-chave inicie
- Cada parâmetro de função é um 
- Existem três sintaxes de parâmetros especiais
- Existem algumas consequências se uma das sintaxes de parâmetro não simples acima for usada
- Você pode consultar os argumentos de uma função dentro da função usando o argumentsobjeto
- Você pode definir propriedades do acessador em 
- Dentro de literais e classes de objetos , você pode usar 
- Observe que essas sintaxes criam uma propriedade de objeto , não
- No modo estrito , as funções dentro dos blocos têm
- A semântica disso no modo estrito é bem especificada - zerosó existe dentro desse escopo do ifbloco. Se shouldDefineZerofor falso, então zeronunca deverá ser definido, pois o bloco nunca é executado. No entanto, historicamente, isso não foi especificado, então 
- Uma maneira mais segura de definir funções condicionalmente 
- Você pode determinar se uma função existe 
# [NOT] Arrow function expressions 

- Uma expressão de função de seta é uma alternativa compacta a uma expressão de função tradicional , com algumas diferenças semânticas e limitações deliberadas de uso
- As funções de seta não possuem 
- Funções de seta não podem ser usadas como 
- As funções de seta não podem ser usadas yielddentro 
- Parâmetros restantes , parâmetros padrão e desestruturação dentro de params são suportados e sempre 
- As funções de seta podem ser async
- Os parênteses só podem ser omitidos
- As chaves só podem ser omitidas 
- As funções de seta são sempre 
- Se a função de seta precisar chamar a si mesma
- As funções de seta podem ter um 
- ou o corpo de bloco 
- Em um corpo conciso
- Isso ocorre porque o JavaScript só vê a função da seta como tendo um corpo conciso 
- As expressões de função de seta só devem ser usadas para funções que não sejam de método porque 
- Como o corpo de uma classethis tem um contexto, a seta funciona como campos de classe 
- As propriedades da função de seta costumam ser chamadas de "métodos de ligação automática", porque 
- Os campos de classe são definidos na instância , não no protótipo , portanto
- Por razões semelhantes, os métodos call(), apply()e bind()não são úteis quando chamados em funções de seta, porque as funções de seta 
- As funções de seta não possuem seu próprio argumentsobjeto. Assim, neste exemplo, arguments
- As funções de seta não podem ser usadas como construtores e gerarão 
- A yieldpalavra-chave não pode ser usada no corpo de uma função de seta -- exceto 
- Uma função de seta não pode conter 
- Embora a seta em uma função de seta não seja um operador, as funções de seta 
- Como =>tem uma precedência menor que a maioria dos operadores, os parênteses 
- Com funções de seta, como nossa addfunção é essencialmente criada no globalThisescopo (global), ela assumirá
- Talvez o maior benefício de usar funções de seta seja com métodos como setTimeout()e EventTarget.prototype.addEventListener()que geralmente requerem algum tipo de fechamento, call(), apply(), ou bind()para garantir
- Com funções de seta, o thisescopo 
# [NOT] Default parameters 

- Os parâmetros de função padrão permitem 
- Em JavaScript, os parâmetros de função são 
- Os parâmetros ainda são definidos da esquerda para a direita, substituindo 
- O primeiro parâmetro padrão e todos os parâmetros posteriores 
- Os inicializadores de parâmetro padrão residem 
- Isto significa que os parâmetros anteriores 
- Esta função imprimirá o valor do parâmetro a , porque a variável var aé içada apenas para o topo do escopo criado para o corpo da função, e não para o escopo pai criado para a lista de parâmetros, portanto, seu valor não é visível para b
- Na segunda chamada neste exemplo, mesmo que o primeiro argumento seja definido explicitamente como undefined(embora não nullou outros valores falsos ), o valor do numargumento ainda é o padrão
- O argumento padrão é avaliado 
- Os parâmetros definidos anteriormente (à esquerda) estão
- Essa funcionalidade pode ser aproximada assim, o que demonstra quantos casos extremos são tratados
- Você pode usar a atribuição de valor padrão com 
- Isso torna possível 
# [NOT] Get 

- egetsintaxe liga
- Também pode ser usado
- Existem algumas restrições de sintaxe adicionais
- Às vezes é desejável permitir o acesso a uma propriedade que retorna um valor calculado dinamicamente, ou você pode querer refletir o status de uma variável interna sem exigir o uso de chamadas de método explícitas. Em JavaScript, isso pode 
- Não é possível ter simultaneamente um getter vinculado a uma propriedade e fazer com que essa propriedade realmente contenha um valor, embora
- Observe que tentar atribuir um valor a latest
- Você pode usar exatamente a mesma sintaxe para definir getters de instâncias públicas que estão disponíveis em instâncias de classe. Nas aulas
- As propriedades getter são definidas 
- Ao contrário das propriedades getter em literais de objetos, as propriedades getter em classes 
- Se você quiser remover o getter
- Para anexar um getter a um objeto existente posteriormente
- Getters fornecem uma maneira de definir 
- Um getter adia o custo  
- Uma técnica de otimização adicional para tornar mais lento ou atrasar o cálculo de um valor de propriedade 
- valor é calculado na primeira vez que o getter é chamado e, em seguida
- Isso significa que você não deve escrever um getter lento para uma propriedade cujo valor você espera alterar
- Observe que os getters não são "preguiçosos" ou "memorizados" por natureza
- No exemplo a seguir, o objeto possui um getter como propriedade própria. Ao obter a propriedade
- Embora use a getpalavra-chave e Object.defineProperty()tenha resultados semelhantes
- Ao usar geta propriedade será definida 
# [NOT] Definições de método 

- A definição de método é uma sintaxe
- A sintaxe abreviada é semelhante 
- Agora você pode encurtar isso para
- function*,async function, easync function*propriedades
- No entanto, observe que a sintaxe do método não é equivalente a uma propriedade normal com uma função como valor — existem diferenças semânticas. Isso torna 
- Métodos não podem ser construtores! Eles
- Somente funções definidas como métodos 
- Você pode usar exatamente a mesma sintaxe para definir métodos de instância pública que estão disponíveis em instâncias de classe. Nas aulas, você não 
- Os métodos de instância pública são definidos 
- Dentro dos métodos de instância thise super
- Geralmente, this
- Nas subclasses,super elets
- Métodos estáticos e métodos privados usam 
- A sintaxe do método também 
- Observe que o asterisco ( *) na sintaxe do método gerador deve
# [NOT] Parâmetros de descanso 

- A sintaxe do parâmetro rest permite 
- O último parâmetro de uma definição de função pode 
- Uma definição de função pode ter apenas 
- O parâmetro rest não é contabilizado 
- Existem três diferenças principais entre os parâmetros restantes e o argumentsobjeto
- Abaixo, o terceiro argumento não é fornecido, mas
- Se o único parâmetro da função for um parâmetro rest
- Arraymétodos podem ser usados ​​em parâmetros restantes,
- Antes dos parâmetros restantes, argumentsprecisam 
# [NOT] set 

- A setsintaxe vincula uma propriedade de objeto 
- Existem algumas restrições de sintaxe adicionais
- Em JavaScript, um setter pode ser usado 
- Setters são mais frequentemente usados 
- Não é possível ter simultaneamente 
- Você pode usar exatamente a mesma sintaxe para definir configuradores de instâncias públicas que estão disponíveis em instâncias de classe. Nas aulas, você não precisa
- As propriedades do setter são definidas 
- Ao contrário das propriedades setter em literais de objetos, as propriedades setter em classes 
- Se você quiser remover o setter
- Para anexar um setter a um objeto existente
# [NOT] O objeto de argumentos 

- argumentsé um objeto semelhante 
- O argumentsobjeto é
- Você pode consultar os argumentos de uma função 
- O argumentsobjeto é útil para funções chamadas 
- Você pode usar arguments.lengthpara contar 
- Cada índice de argumento também pode 
- Funções não estritas que possuem apenas parâmetros simples (ou seja, sem parâmetros restantes, padrão ou desestruturados) sincronizarão 
- Funções não estritas que recebem 
- Este é o mesmo comportamento exibido por todas as funções de modo estrito , independentemente 
- Você não pode escrever uma "use strict";diretiva
- argumentsé um objeto semelhante a um array, o que significa 
- Para casos de uso comuns, usá-lo como um objeto semelhante a um array é suficiente, pois 
- O typeofoperador retorna 'object'quando 
- O tipo de argumentos individuais pode ser determinado 

# <MDN-Referencia-Classes> <!-- -->
# [NOT] Overview 

- As classes são um modelo 
- Eles encapsulam data 
- uma classe pode ser definida de duas maneiras
- Assim como as expressões de função, as expressões de classe
- No entanto, diferentemente das declarações de função, as declarações de classe 
- O corpo de uma classe é a parte 
- O corpo de uma classe é executado em
- O elemento ss pode ser caracterizado por três aspectos
- Os recursos privados têm a restrição de que 
- Todas as outras propriedades públicas não têm essa restrição 
- Além disso, existem duas sintaxes especiais de elementos de classe
- O constructormétodo é um método especial
- Só pode haver um método especial
- Um construtor pode usar
- Você pode criar propriedades
- Alternativamente, se os valores das propriedades da sua instância não dependerem dos argumentos do construtor
- Vários blocos estáticos 
- todos os itens estáticos são 
- Os métodos são definidos
- Os métodos podem ser
- A staticpalavra-chave 
- As propriedades estáticas (campos e métodos)
- Os campos de classe são semelhantes 
- Em JavaScript, recursos privados usam
- Como visto acima, os campos podem ser declarados com ou sem valor padrão. Campos sem valores padrão
- Ao declarar os campos antecipadamente, as definições de classe tornam-se
- É um erro referenciar campos privados de fora da classe; eles só podem
- Ao definir coisas que não são visíveis fora da classe, você garante
- Os campos privados só podem ser declarados
- Eles não podem ser criados posteriormente por meio
- A extendspalavra-chave é usada
- Se houver um construtor presente na subclasse, ele precisará
- A superpalavra-chave também pode ser usada
- Quando uma classdeclaração ou classexpressão é avaliada, seus vários componentes são avaliados na seguinte ordem
- Os métodos estáticos costumam ser usados
- Os blocos de inicialização estáticos permitem
- Quando um método estático ou de instância é chamado sem um valor para this, como ao atribuir o método a uma variável e depois chamá-la, o thisvalor
- Se reescrevermos o acima usando a sintaxe baseada em função tradicional no modo não estrito
# (NOT] Constructor
# [NOT] Extends 

- A extendspalavra-chave é usada em 
- A extendspalavra-chave pode ser usada para 
- Qualquer construtor que possa ser chamado newe possua a prototypepropriedade 
- As duas condições devem ser válidas - por exemplo, funções vinculadas e Proxypodem ser construídas, mas não possuem uma prototypepropriedade, portanto
- A prototypepropriedade do ParentClassdeve 
- extendsdefine o protótipo para ambos ChildClasse ChildClass.prototype
- O lado direito de extendsnão precisa ser um identificador. Você pode usar 
- O thisvalor na extendsexpressão está
- Embora a classe base possa retornar qualquer coisa de seu construtor, a classe derivada 
- Se o construtor da classe pai retornar um objeto, esse objeto será usado como 
- Aqui estão algumas coisas que você pode esperar ao estender uma aula
- No entanto, as expectativas acima exigem esforços não triviais para serem implementadas adequadamente
- Esses problemas não são exclusivos das classes integradas. Para suas próprias aulas, você provavelmente terá que tomar as mesmas decisões. No entanto, para classes integradas
- Novos métodos integrados sempre constroem a classe base e chamam 
- Se você deseja subclassificar os integrados enquanto atinge as expectativas acima, você precisa
- Qualquer adição de novos métodos na classe base também pode 
- Portanto, a melhor maneira de estender os recursos 
- extends nullfoi projetado para permitir
- No entanto, devido a decisões incertas sobre se super()deve ser chamada dentro do construtor, não é possível 
- Em vez disso, você precisa retornar 
- As classes não podem estender objetos regulares (não construtíveis). Se você deseja herdar de um objeto regular
- Todos os objetos JavaScript herdam
- A única diferença de não escrever extendsnada é que o próprio construtor
- O Object()construtor faz casos especiais do cenário de subclasse. Se for chamado implicitamente via super(), ele sempre
- Qualquer valor passado
- Você pode querer retornar Arrayobjetos em sua classe de array derivada MyArray. O padrão
- Por exemplo, ao usar métodos como Array.prototype.map()o que retorna o construtor padrão, você deseja que esses métodos retornem um Arrayobjeto pai, em vez do MyArrayobjeto. O Symbol.speciessímbolo permite
- Subclasses abstratas ou mix-ins são modelos para classes. Uma classe só pode ter
- Uma função com uma superclasse como entrada e uma subclasse estendendo essa superclasse como saída pode
- Uma função com uma superclasse como entrada e uma subclasse estendendo essa superclasse como saída pode
- A herança é um relacionamento de acoplamento muito forte na programação orientada a objetos. Isso significa 
- Podemos contornar isso usando um sinalizador privado para indicar se a instância está sendo construída. No entanto, um problema mais significativo com este design é que ele quebra
- A herança muitas vezes leva ao problema do círculo-elipse , porque nenhum tipo
- Composição significa que uma classe 
- Nesse caso, a ReadOnlyMapclasse não é uma subclasse de Map, mas ainda implementa a maioria dos mesmos métodos. Isso significa mais duplicação de código, mas também significa que a ReadOnlyMapclasse não está fortemente acoplada à Mapclasse e não é facilmente interrompida
- Por exemplo, se a Mapclasse adicionar um emplace()método que não chama set(), isso fará com que a ReadOnlyMapclasse não seja mais somente leitura, a menos 
# (NOT] Private class features 

- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
# [NOT] Public class fields 

- Os campos públicos são 
- Existem algumas restrições de sintaxe adicionais
- Os campos de instância pública existem
- Ao declarar um campo público, você pode garantir
- Os campos de instância pública são adicionados
- Campos sem inicializadores
- Assim como as propriedades, os nomes dos campos
- Os nomes dos campos calculados são
- O thisvalor na expressão computada está
- No inicializador de campo, thisrefere-se
- superrefere-se
- A expressão do inicializador de campo é avaliad
- Como o thisvalor é diferente para cada instância
- A expressão é avaliada de forma síncrona. Você não pode usar awaitou yield
- Pense na expressão inicializadora como sendo
- Como os campos de instância de uma classe são adicionados antes da execução do respectivo construtor
- Os campos são adicionados um por um. Inicializadores de campo podem 
- Todas as instâncias e métodos estáticos são adicionados
- isso é mais importante com campos privados , porque acessar um campo privado não inicializado
- Como os campos de classe são adicionados usando
- as declarações de campo em classes derivadas não invocam
- Antes que a especificação dos campos de classe fosse finalizada com a [[DefineOwnProperty]]semântica, a maioria dos transpiladores
- Campos de classe não podem depender
- No entanto, até mesmo declarar um campo de classe vazio é benéfico, porque indica
- O código acima parece repetitivo, mas considere o caso em que thisé modificado dinamicamente
- Como os inicializadores são avaliados
# [NOT] Static 

- A staticpalavra-chave define
- Propriedades estáticas não podem
- Os métodos estáticos geralmente
- enquanto as propriedades estáticas
- Existem algumas restrições de sintaxe adicionais
- Os recursos estáticos públicos
- Eles são adicionados ao construtor de classe
- Os métodos estáticos geralmente são funções utilitárias
- Os campos estáticos públicos são úteis quando você deseja
- Nomes de campos estáticos
- awaite yieldtrabalhe
- Os campos estáticos
- Campos estáticos sem inicializadores
- Campos estáticos públicos não são
- No inicializador de campo, thisrefere-se
- superrefere-se
- A expressão é avaliada de forma síncrona. Você não pode usar awaitou yield
- Pense na expressão inicializadora como sendo
- Os inicializadores de campos estáticos e os blocos de inicialização estáticos
- Inicializadores de campo podem se referir
- Todos os métodos estáticos são adicionados
- Para chamar um método ou propriedade estático dentro de outro método estático da mesma classe
- Os membros estáticos não são diretamente
- Você precisa chamá-los usando o nome da classe
# [NOT] Static initialization blocks 

- Blocos de inicialização estáticos são declarados
- Ele contém instruções a serem avaliadas
- Isso permite uma lógica de inicialização 
- A inicialização é realizada no contexto
- Sem blocos de inicialização estática, a inicialização estática complexa pode ser
- No entanto, essa abordagem expõe um detalhe de implementação (o init()método) ao usuário da classe. Por outro lado, qualquer lógica de inicialização declarada fora da classe não tem acesso a campos estáticos privados. Os blocos de inicialização estáticos
- A class pode ter
- Eles são avaliados , juntamente com quaisquer
- Qualquer inicialização estática de uma superclasse
- O escopo das variáveis ​​declaradas dentro do bloco estático
- Isso inclui declarações
- O thisinterior de um bloco estático refere-se
- super.propertypode ser usado para 
- Observe, no entanto, que é um erro de sintaxe chamar
- As instruções são avaliadas de forma síncrona. Você não pode usar awaitou yield
- Pense nas instruções de inicialização como sendo
- O escopo do bloco estático está aninhado
- Os inicializadores de campos estáticos e os blocos de inicialização estáticos
- O bloco de inicialização pode se referir
- Todos os métodos estáticos
- isso é mais importante com campos estáticos privados , porque acessar um campo privado
- Um bloco de inicialização estático
- O thisinterior de um bloco estático refere-se
- A super.propertysintaxe pode ser usada

# <MDN-Refenrece-Error> <!-- -->
# (NOT] Erros
- Overview
- Error: Permission denied to access property "x"
- InternalError: too much recursion
- RangeError: argument is not a valid code point
- RangeError: BigInt division by zero
- RangeError: BigInt negative exponent
- RangeError: invalid array length
- RangeError: invalid date
- RangeError: precision is out of range
- RangeError: radix must be an integer
- RangeError: repeat count must be less than infinity
- RangeError: repeat count must be non-negative
- RangeError: x can't be converted to BigInt because it isn't an integer
- ReferenceError: "x" is not defined
- ReferenceError: assignment to undeclared variable "x"
- ReferenceError: can't access lexical declaration 'X' before initialization
- ReferenceError: deprecated caller or arguments usage
- ReferenceError: reference to undefined property "x"
- SyntaxError: "0"-prefixed octal literals and octal escape seq. are deprecated
- SyntaxError: "use strict" not allowed in function with non-simple parameters
- SyntaxError: "x" is a reserved identifier
- SyntaxError: a declaration in the head of a for-of loop can't have an initializer
- SyntaxError: applying the 'delete' operator to an unqualified name is deprecated
- SyntaxError: await is only valid in async functions, async generators and modules
- SyntaxError: cannot use `??` unparenthesized within `||` and `&&` expressions
- SyntaxError: continue must be inside loop
- SyntaxError: for-in loop head declarations may not have initializers
- SyntaxError: function statement requires a name
- SyntaxError: getter and setter for private name #x should either be both static or non-static
- SyntaxError: identifier starts immediately after numeric literal
- SyntaxError: illegal character
- SyntaxError: invalid assignment left-hand side
- SyntaxError: invalid BigInt syntax
- SyntaxError: invalid regular expression flag "x"
- SyntaxError: JSON.parse: bad parsing
- SyntaxError: label not found
- SyntaxError: missing ; before statement
- SyntaxError: missing : after property id
- SyntaxError: missing ) after argument list
- SyntaxError: missing ) after condition
- SyntaxError: missing ] after element list
- SyntaxError: missing } after function body
- SyntaxError: missing } after property list
- SyntaxError: missing = in const declaration
- SyntaxError: missing formal parameter
- SyntaxError: missing name after . operator
- SyntaxError: missing variable name
- SyntaxError: redeclaration of formal parameter "x"
- SyntaxError: return not in function
- SyntaxError: test for equality (==) mistyped as assignment (=)?
- SyntaxError: Unexpected '#' used outside of class body
- SyntaxError: Unexpected token
- SyntaxError: unlabeled break must be inside loop or switch
- SyntaxError: unparenthesized unary expression can't appear on the left-hand side of '**'
- SyntaxError: unterminated string literal
- SyntaxError: Using //@ to indicate sourceURL pragmas is deprecated. Use //# instead
- TypeError: 'x' is not iterable
- TypeError: "x" has no properties
- TypeError: "x" is (not) "y"
- TypeError: "x" is not a constructor
- TypeError: "x" is not a function
- TypeError: "x" is not a non-null object
- TypeError: "x" is read-only
- TypeError: can't assign to property "x" on "y": not an object
- TypeError: can't convert BigInt to number
- TypeError: can't convert x to BigInt
- TypeError: can't define property "x": "obj" is not extensible
- TypeError: can't delete non-configurable array element
- TypeError: can't redefine non-configurable property "x"
- TypeError: cannot use 'in' operator to search for 'x' in 'y'
- TypeError: cyclic object value
- TypeError: invalid 'instanceof' operand 'x'
- TypeError: invalid Array.prototype.sort argument
- TypeError: invalid assignment to const "x"
- TypeError: More arguments needed
- TypeError: property "x" is non-configurable and can't be deleted
- TypeError: Reduce of empty array with no initial value
- TypeError: setting getter-only property "x"
- TypeError: X.prototype.y called on incompatible type
URIError: malformed URI sequence
Warning: -file- is being assigned a //# sourceMappingURL, but already has one
- Warning: unreachable code after return statement

# <MDN-Referencia-Misc> <!-- -->
# [NOT] Gramática lexical 

- O texto fonte JavaScript é apenas
- A etapa inicial da análise é chamada de análise lexical , na qual o texto 
- Alguns elementos de entrada são insignificantes para o intérprete e serão 
- Terminadores de linhae comentários de múltiplas linhas também são sintaticamente insignificantes, mas orientam
- Os caracteres de controle de formato não têm representação visual, mas são usados 
- No texto fonte JavaScript
- Ferramentas de minificação são frequentemente usadas para
- No entanto, em alguns casos, os terminadores de linha podem influenciar
- Os terminadores de linha também afetam 
- Há uma sintaxe especial de terceiro comentário, o hashbang
- O interpretador JavaScript irá tratá-lo como um comentário normal — ele só terá significado semântico para o shell se o script for executado diretamente em um shell
- Um identificador é usado para
- Além disso, o JavaScript permite o uso 
- Mais notavelmente, propriedades privadas e propriedades de objetos permitem 
- Palavras-chave são tokens que parecem identificadores, mas têm significados 
- Nem todas as palavras-chave são reservadas 
- Algumas palavras-chave são reservadas apenas contextualmente 
- Essas palavras-chave não podem ser usadas como identificadores para variáveis, funções, classes, etc. em qualquer lugar da fonte JavaScript
- Os itens a seguir são reservados apenas quando encontrados no código de modo estrito
- Os itens a seguir são reservados apenas quando encontrados no código do módulo ou em corpos de funções assíncronas
- As seguintes palavras-chave são reservadas como palavras-chave futuras pela especificação ECMAScript. Eles não têm nenhuma funcionalidade especial no momento, mas poderão em algum momento futuro, portanto não podem ser usados ​​como identificadores
- Os itens a seguir são reservados apenas quando encontrados no código de modo estrito
- As seguintes são reservadas como palavras-chave futuras por especificações ECMAScript mais antigas 
- Alguns identificadores têm um significado especial em alguns contextos sem serem palavras reservadas de qualquer tipo. Eles incluem
- As definições de sintaxe de algumas instruções JavaScript requerem ponto e vírgula ( ;) no final. Eles incluem
- Existem três casos em que o ponto-e-vírgula é inserido automaticamente
# [NOT] Iteration protocols 

- Os protocolos de iteração 
- O protocolo iterável permite 
- Alguns tipos integrados 
- Para ser iterável 
- [Symbol.iterator]
- Sempre que um objeto precisa ser iterado
- Observe que quando esta função com argumento zero é chamada
- Portanto, dentro da função
- Esta função pode ser uma função 
- Dentro desta função geradora
- O protocolo iterador define uma maneira 
- Um objeto é um iterador quando
- next()
- Espera-se que todos os métodos de protocolo iterador ( next(), return()e throw()) retornem 
- Deve ter as seguintes propriedades
- Na prática, nenhuma das propriedades é estritamente exigida
- Se um iterador retornar um resultado comdone: true
- ºenextmétodo pode recebe
- Nenhum recurso de linguagem 
- O valor passado para onextmétodo de geradores
- Opcionalmente, o iterador também pode implementar
- return(value)
- throw(exception) 
- Não é possível saber reflexivamente (ou seja, sem realmente chamar next()e validar o resultado retornado)
- É muito fácil tornar um iterador também iterável
- Esse objeto é chamado de iterador iterável . Fazer isso permite
- Todos os iteradores integrados herdam 
- Há outro par de protocolos 
- Eles têm interfaces muito semelhantes  
- Um objeto implementa o protocolo iterável assíncrono quando implementa os seguintes métodos
- Um objeto implementa o protocolo iterador assíncrono quando implementa os seguintes métodos
- são todos iteráveis ​​integrados, porque  
- Além disso, o argumentsobjeto e alguns tipos de coleção DOM
- As funções geradoras retornam
- As funções geradoras assíncronas
- Os iteradores retornados de iteráveis ​​integrados
- Você pode inspecionar a cadeia de protótipos de um iterador registrando-a em um console gráfico
- OExistem muitas APIs que aceitam iteráveis. Alguns exemplos incluem
- Algumas instruções e expressões esperam iteráveis
- Quando as sintaxes integradas estão iterando um iterador e o último resultado doneé false
- Isso pode acontecer, por exemplo
- ºefor await...oflaço eyield*emfunção gerador assíncronons 
- Se o método de um iterável @@iteratornão retornar um objeto iterador
- Usar um provavelmente 
- Você pode fazer 
- Os iteradores são imponentes por natureza. Se você não definire
- O encapsulamento de estado
- StringO iterador padrão retorna os pontos 
- Você pode redefinir o comportamento 
- Observe como a redefinição@@iteratorafeta
# [NOT] Modo estrito 

- O modo estrito do JavaScript é uma forma 
- O modo estrito não é apenas um subconjunto
- Os navegadores que não suportam o modo estrito 
- O código de modo estrito e o código de modo não estrito podem coexistir
- O modo estrito faz diversas alterações na semântica normal do JavaScript
- Elimina
- Corrige erros que dificultam
- Proíbe algumas sintaxes
- O modo estrito se aplica 
-  evalcódigo, Functioncódigo, atributos do manipulador de eventos , strings passadas para setTimeout()e funções relacionadas
- Para invocar o modo estrito para um script inteiro
- Da mesma forma, para invocar o modo estrito para uma função
- A diretiva só pode ser aplicada 
- Todo o conteúdo dos módulos JavaScript 
- Todas as partes do corpo de uma classe 
- O modo estrito altera 
- As alterações geralmente se enquadram nestas categorias
- O modo estrito transforma alguns erros 
- JavaScript foi projetado para ser fácil 
- Às vezes
- O modo estrito trata esses erros 
- O modo estrito torna impossível 
- No modo desleixado, digitar incorretamente uma variável em uma atribuição
- Atribuições que criariam acidentalmente variáveis ​​globais
- O modo estrito faz atribuições que, de outra forma, falhariam silenciosamente em lançar uma exceção. Existem três maneiras de falhar em uma atribuição de propriedade
- Por exemplo, NaNé uma variável global não gravável. No modo desleixado
- No modo estrito
- As tentativas de excluir uma propriedade 
- O modo estrito também proíbe a exclusão 
- Se o nome for uma propriedade global configurável
- O modo estrito exige que os nomes dos parâmetros de função 
- No modo desleixado
- Esses argumentos anteriores permanecem
- Ainda assim
- O modo estrito proíbe 
- No modo desleixado, um número começando com 0
- Os desenvolvedores novatos às vezes acreditam 
- Mais formalmente
- O modo estrito proíbe a configuração 
- Acessar uma propriedade
- Nomes de propriedades duplicados
- Com a introdução
- Isso faz com que a linguagem 
- O modo estrito simplifica 
- Muitas otimizações de compilador
- Às vezes, o JavaScript torna
- O modo estrito remove 
- O modo estrito proíbe with. O problema é que
- A alternativa simples de atribuir o objeto 
- No modo estrito, eval
- No modo desleixado
- Isso significa que
- No modo estrito, evalcria
- A especificação da linguagem JavaScript
- No entanto, era tão intuitivo
- Infelizmente, a semântica das implementações 
- Portanto, as declarações de função com escopo de bloco
- O modo estrito torna 
- Ambos envolvem uma quantidade
- Impedindo vinculação ou atribuição de avaliação e argumentos
- O código de modo estrito não sincroniza 
- Em uma função de modo desleixado cujo primeiro argumento é arg
- arguments objetos para funções de modo estrito 
- arguments[i]não rastreia
- O modo estrito facilita a gravação de JavaScript "seguro". Alguns sites agora oferecem 
- O JavaScript nos navegadores pode acessar 
- A flexibilidade do JavaScript torna efetivamente impossível 
- Certas funções de linguagem 
- Alguns ajustes no modo estrito, além de exigir que o JavaScript enviado pelo usuário seja um código de modo estrito e
- O valor passado para uma função no modo estrito 
- O boxe automático não é apenas um custo de desempenho
- Assim, para uma função de modo estrito
- Para uma função de modo desleixado, this
- No modo estrito não é mais possível 
- Muitas implementações usadas para implementar alguns recursos de extensão 
- Quando uma função está sendo chamada
- Ambas as extensões são problemáticas para JavaScript "seguro" porque permitem
- Se estiver no modo estrito
- Da mesma forma, arguments.calleenão é mais compatível. No modo desleixado
- Este caso de uso é fraco
- arguments.calleepara funções de modo estrito 
- Palavras reservadas são identificadores 
- O modo estrito reserva
- O modo estrito foi projetado 
- É possível alterar cada arquivo individualmente 
- Você pode migrar uma base de código para o modo estrito
- Ao adicionar , os seguintes casos gerarão um antes da execução do script
- Esses erros são bons 
- JavaScript costumava falhar silenciosamente em contextos onde o que foi feito deveria ser um erro. O modo estrito 
- Essas diferenças são diferenças muito sutis. É possível que um conjunto de testes não detecte esse tipo de diferença sutil. Provavelmente
- Felizmente, essa revisão cuidadosa pode ser feita gradualmente na granularidade da função
# [NOT] Template literals 

- Literais de modelo são literais delimitados com `caracteres de crase(), permitindo
- No entanto, um literal de modelo marcado 
- Literais de modelo são colocados 
- Além de ter strings normais, os literais de modelo também podem conter 
- As strings e espaços reservados
- A função padrão 
- Para fornecer sua própria 
- Nesse caso
- Quaisquer caracteres de nova linha 
- Literais de modelo forçam
# [NOT] Vírgulas finais 

- Vírgulas à direita (às vezes chamadas de "vírgulas finais")

- Se você deseja adicionar uma nova propriedade
- Isso torna
- O JavaScript permitiu
- JSON , no entanto,
- JavaScript permite vírgulas sempre 
- Isso inclui
- Em todos esses casos
- É particularmente útil 
- JavaScript ignora vírgulas finais em 
- Se mais de uma vírgula final for usada
- Uma matriz com lacunas
- Ao iterar matrizes
- Matrizes esparsas
- Vírgulas finais também são permitidas 
- As vírgulas finais 
- A vírgula final também funciona 
- Definições de parâmetros de função 
- Além disso
- Uma vírgula final 
- Novamente, ao usar um elemento rest
- Como JSON é baseado em um subconjunto 
- As vírgulas finais são válidas em 
- A vírgula final em um quantificador , na verdade, altera 

# <Expressions-&-operators> <!-- -->
# [NOT] +

- O operador de adição
- O +operador é sobrecarregado para duas operações distintas
- Ao avaliar
- Em seguida
- Se um lado for uma string
- Se ambos forem BigInts
- Se um lado for um BigInt
- Caso contrário
- Muitas vezes, acredita-se
- A adição coage
- Se a expressão tiver
- Isso é importante para objetos
- Você é aconselhado a não usar
# [NOT] +=

- O operador de atribuição de adição
# [NOT] =

- A operação de atribuição
- A própria expressão de atribuição
- O objeto global
- Ao tentar resolver
- Isso significa
- Como o objeto global tem uma Stringpropriedade
- Portanto, o objeto global
- Você não precisa digitar
- Para tornar esse recurso mais consistente conceitualmente
- No modo estrito , a atribuição a um identificador não qualificado no modo estrito
- Observe que a implicação do que foi dito acima é que, ao contrário da desinformação popular
- Ele apenas combina
# [NOT] async function

- As async functionpalavras-chave
- Você também pode definir
- uma instrução de expressão
- Uma async functionexpressão
- A principal diferença
- Uma async function
# [NOT] async function*

- As async function*palavras-chave 
- Você também pode definir
- uma instrução de expressão não pode
- Uma async function*expressão
- A principal diferença
- Uma async function*expressão pode ser usada
# [NOT] await

- O awaitoperador é usado
- O valor de cumprimento
- awaitgeralmente é usado
- Usar awaitpausa
- Quando a execução é retomada
- Se a promessa for rejeitada
- O expressioné resolvido
- Nativo Promise
- Objeto Thenable
- Mesmo quando a promessa usada já foi cumprida
- Enquanto isso
- Como awaitsó é válido dentro de funções e módulos assíncronos
- Se a Promisefor passado para uma awaitexpressão
- Os objetos utilizáveis ​​são resolvidos
- Se o valor não for um Promise
- Você pode lidar com promessas rejeitadas sem um try
- Isso é construído com base na suposição
- Esse é o caso
- No entanto, se promisedFunction()lançar um erro de forma síncrona
- Você pode usar a awaitpalavra-chave sozinha
- Quaisquer módulos
- Quando um awaité encontrado no código
- O thread principal
- Para melhorar o rastreamento de pilha
# [NOT] &

- O operador AND( &) bit a bit 
- O &operador é sobrecarregado
- O operador opera
- Ele primeiro força
- Números com mais de 32 bits
- Para BigInts
- A operação AND bit a bit de qualquer número
# [NOT] &=

- O operador de atribuição AND bit a bit
# [NOT] ~

- O operador NOT( ~) 
- O ~operador é sobrecarregado
- O operador opera
- Números com mais de 32 bits
- Para BigInts, não há truncamento
- qualquer número bit a bit
- A NOTação bit a bit
# [NOT] |

- O operador OR ( |) bit a bit
- O |operador é sobrecarregado
- O operador opera nas representações de bits
- Cada bit no primeiro operando
- Números com mais de 32 bits
- Para BigInts
- bit a bit qualquer
# [NOT] ||=

- O operador de atribuição OR bit a bit
# [NOT] ^

- O operador XOR
- O ^operador é sobrecarregado
- O operador opera
- Números com mais de 32 bits
- Para BigInts
- XOR bit a bit
# [NOT] ^=

- O operador de atribuição XOR bit a bit
# [NOT] class

- A class palavra-chave
- uma instrução de expressão não pode
- Uma class expressão
- A principal diferença
- Se quiser fazer referência à classe atual
# [NOT] ,

- O operador vírgula
- Isso é comumente usado
- Você pode usar o operador vírgula
- Como todas as expressões
- Expressões comuns que têm efeitos colaterais são atribuições
- O operador vírgula tem a precedência
- O operador vírgula é completamente diferente das vírgulas
- Na verdade, embora alguns desses lugares aceitem
- Como as vírgulas têm a precedência mais baixa
- Outro exemplo que se pode fazer com o operador vírgula
- Isso é especialmente útil para funções de seta de uma linha
- O operador vírgula sempre retorna
- Você pode inserir avaliação indireta
# [NOT] (condition ? ifTrue : ifFalse)
 
- O operador condicional (ternário)
- O operador ternário é associativo à direita
# [NOT] Decrement (--)

- O operador decremento
- O -- operador é sobrecarregado
- Se usado postfix
- Se usado prefixo
- O operador de decremento só pode ser aplicado
# [NOT] delete

- O delete operador
- a sintaxe permite
- truepara todos os casos, exceto
- O deleteoperador tem a mesma precedência
- Como as classes estão automaticamente no modo estrito
- Embora outras expressões sejam aceitas
- O deleteoperador remove
- É importante considerar os seguintes cenários
- Quando você exclui um elemento de array
- Quando uma propriedade é marcada como não configurável
- varcria propriedades
- Se uma propriedade global for configurável
# (NOT] Destructuring assignment
# [NOT] /

- O operador de divisão
- O /operador é sobrecarregado
- Para a divisão BigInt
# [NOT] /=

- O operador de atribuição de divisão
# [NOT) ==

- 
- 
- 
- 
- 
- 
# [NOT] **

- O operador de exponenciação
- O **operador é sobrecarregado
- Para números e BigInts
- NaN ** 0
- Para a exponenciação BigInt
- Na maioria das linguagens
# [NOT] **=

- O operador de atribuição de exponenciação
# (NOT] function
# (NOT] function*
# [NOT] >

- O operador maior que
- Os operandos são comparados
# [NOT] >=

- O operador maior ou igual
- Os operandos são comparados
# [NOT] ( )

- O operador de agrupamento
- O operador de agrupamento consiste
- Observe nesses exemplos que a ordem
- Uma instrução de expressão
- O operador de agrupamento pode ser usado para eliminar essa ambiguidade, pois quando o analisador
- Em um corpo conciso de função de seta
- Se uma propriedade for acessada em um número literal
- O operador de agrupamento
- Esse código retornará
# (NOT] import.meta
# (NOT] import()
# (NOT] in
# [NOT] Increment (++)

- O operador increment
- O ++operador é sobrecarregado para dois tipos de operandos
- Se usado postfix
- Se usado prefixo
- O operador de incremento só pode ser aplicado
# [NOT] !=

- O operador de desigualdade
- O operador de desigualdade verifica
- Para evitar isso e exigir
# (NOT] instanceof
# [NOT] <<

- O operador shift à esquerda
- O << operador é sobrecarregado
- Os bits em excesso
- Se o operando da esquerda
- O operando direito será convertido
- Para BigInts
# [NOT] <<=

- O operador de atribuição de deslocamento à esquerda
# [NOT] <

- O operador menor que
- Os operandos são comparados com várias rodadas de coerção, que podem ser resumidas da seguinte forma
- Outros operadores
- Uma diferença observável
- As comparações sempre coagem
- isso pode ser uma fonte de confusão
# [NOT] <=

- O operador menor ou igual
- Os operandos são comparados usando
- Além disso, x <= ycoage
# [NOT] &&

- O operador lógico AND
- Mais geralmente, o operador retorna
- O AND lógico ( &&) avalia operandos
- Se um valor
- O operador AND preserva
- Mesmo que o && operador
- Para converter explicitamente
- A expressão lógica AND
- O operador AND
- Como as expressões lógicas
# [NOT] &&=

- O operador lógico de atribuição AND
- Curtos-circuitos lógicos de atribuição AND
- Nenhuma atribuição é executada
# [NOT] !

- O operador lógico NOT
- Retorna false
- Se um valor puder ser convertido
- Mesmo que o !operador possa ser usado
- Para converter explicitamente seu valor de retorno
- É possível usar alguns operadores NOT
# [NOT] ||

- O operador lógico OR
- No entanto, o || operador
- As seguintes expressões
- Mesmo que o || operador
- Para converter explicitamente seu valor de retorno
- A expressão lógica OR
- Curto-circuito significa
- Se você usar este operador
- Como as expressões lógicas
# [NOT] ||=

- O operador lógico de atribuição OR
- Curto-circuitos de atribuição OR lógica
- Nenhuma atribuição é realizada
- Aqui o curto-circuito é especialmente benéfico
- Se uma string vazia for retornada
# [NOT] *

- O operador de multiplicação
- O *operador está sobrecarregado
# [NOT] *=

- O operador de atribuição de multiplicação
# [NOT] new

- O newoperador permite
- Quando uma função é chamada com a newpalavra-chave, a função será usada como construtor. newfará o seguinte
- Propriedades/objetos adicionados
- As classes só podem
- O newoperador permite
- Embora a função construtora possa ser invocada
- Uma função pode saber se é invocada
- new.target é somente
- Depois do ES6, a linguagem é mais rígida
# (NOT] new.target 
# [NOT] null

- O null valor representa
- O valor null é escrito
- Ao verificar null ou undefined
# [NOT] ??=

- O operador de atribuição coalescente nula
- Curto-circuitos de atribuição coalescente nula
- Nenhuma atribuição é realizada
- Você pode usar o operador de atribuição coalescente nulo para aplicar
- Comparado ao uso de desestruturação e valores padrão
# [NOT] ??

- O operador coalescente nulo
- O operador coalescente nulo pode ser visto
- Este último retorna o operando
- Em outras palavras, se você || fornecer algum valor padrão
- O operador coalescente nulo
- Não é possível combinar
- No entanto, por || ser um operador lógico booleano
- O operador de coalescência nulo evita
- Assim como os operadores lógicos OR e AND
- O operador de coalescência nulo trata
- O mesmo acontece
- Combinando-os, você pode acessar
# [NOT] Object initializer

- Um inicializador de objeto
- Os objetos também podem ser inicializados
- Um inicializador de objeto é uma expressão
- Os objetos consistem em propriedades
- Os valores das propriedades
- A sintaxe literal do objeto não é a mesma que a notação de objeto Java S cript ( JSON ) . Embora pareçam semelhantes, existem diferenças entre eles
- JSON é um subconjunto estrito
- A única exceção é que a sintaxe literal do objeto
- Este último trata __proto__
- O único momento em que o valor do objeto que eles representam
- No entanto, a vantagem da notação literal ou de inicializador
- Depois de criar um objeto
- Já aprendemos como anotar propriedades
- Muitas vezes, existem variáveis ​​no seu código
- Ao usar o mesmo nome para suas propriedades
- Após ES2015, nomes de propriedades duplicados
- Você também pode ter nomes
- A única exceção
- Uma propriedade de um objeto também pode se referir
- Também existe uma maneira de definir de forma concisa
- A sintaxe do inicializador de objeto também oferece suporte
- Isso permite
- Isso é uma reminiscência
- Literais de objeto suportam
- Ele copia propriedades enumeráveis ​​próprias
- Agora é possível clonar superficialmente
- Observe que isso Object.assign()
- Uma definição de propriedade do formulário __proto__: valueou "__proto__": value
- Observe que a chave é uma sintaxe padronizada
- Apenas um único configurador de protótipo
- As definições de propriedades que não usam a notação "dois pontos"
# [NOT] Operator precedence

- A precedência do operador determina
- Dentro dos operadores de mesma precedência
- Como awaittem precedência maior que yield
- Observe que a precedência e a associatividade dos operadores afetam apenas
- Ao avaliar um operador em curto-circuito
- O comportamento de curto-circuito é elaborado
# [NOT] ?.

- O operador opcional de encadeamento
- Se o objeto acessado ou a função chamada
- O ?. operador é como o .operador de encadeamento
- Quando usado com chamadas de função
- Isso resulta em expressões mais curtas e simples
- Também pode ser útil ao explorar
- Ao usar o ?.operador em vez
- Você pode usar o encadeamento opcional
- Usar o encadeamento opcional com chamadas de função
- Você também pode usar o operador de encadeamento opcional
- Isto é particularmente útil para arrays
- É inválido tentar atribuir
- Ao usar encadeamento opcional com expressões
- No entanto, este comportamento de curto-circuito só acontece
- Se você usar retornos de chamada ou métodos
- Com estruturas aninhadas, é possível
- O operador coalescente nulo pode ser usado
# [NOT] Property accessors

- Os acessadores de propriedade
- Pode-se pensar em um objeto
- Existem duas maneiras de acessar propriedades
- Se você usar um método para um literal numérico
- Na object[expression]sintaxe
- No entanto, tome cuidado ao usar colchetes para acessar propriedades cujos nomes
- Cada nome de propriedade
- É típico, quando se fala das propriedades de um objeto
- Um método não está
- Especificamente, this não é
- Iniciantes em JavaScript geralmente
# [NOT] % 

- O operador resto
- O %operador está sobrecarregado para dois tipos de operandos
- Para a operação n % d
- Quando ambos os operandos são diferentes de zero e finitos
- Para obter um módulo em JavaScript
# [NOT] %=

- O operador de atribuição de resto
# [NOT] >>

- O operador shift para a direita
- Os bits em excesso deslocados para a direita
- O >>operador está sobrecarregado para dois tipos de operandos:
- Como o novo bit mais à esquerda tem o mesmo valor que o bit anterior à esquerda
- Em ambos os casos
- Se o operando esquerdo for um número com mais de 32 bits
- O operando direito será convertido
- O operando direito será convertido
- Para BigInts, não há truncamento
# [NOT] >>=

- O operador de atribuição de deslocamento para a direita
# [NOT] Spread syntax (...)

- A sintaxe spread
- Em um objeto literal, a sintaxe de propagação
- A sintaxe de propagação se parece
- De certa forma, a sintaxe spread
- A sintaxe de propagação pode ser usada
- Embora a sintaxe pareça a mesma
- Por outro lado, espalhar em objetos literais enumera
- Para matrizes típicas
- Ao usar a sintaxe spread para chamadas de função
- É comum usar Function.prototype.apply()
- Qualquer argumento na lista de argumentos pode usar sintaxe de difusão
- Ao chamar um construtor com new
- Assim como spread para listas de argumentos
- A sintaxe de propagação atinge
- Array.prototype.concat()é frequentemente usado
- Sem sintaxe de propagação
- Array.prototype.unshift()é frequentemente usado
- Além disso, Object.assign() aciona
- a sintaxe spread não funciona
- Você não pode reimplementar ingenuamente
# [NOT] ===

- O operador de igualdade estrita
- Os operadores de igualdade estritos
- A diferença mais notável entre este operador e o operador de igualdade
# [NOT] !== 

- O operador de desigualdade estrita
- O operador de desigualdade estrita verifica
- Assim como o operador de igualdade estrita
# [NOT] -

- O operador de subtração
- O - operador está sobrecarregado para dois tipos de operandos:
# [NOT] -=

- O operador de atribuição de subtração
# (NOT] super
# (NOT] this
# (NOT] typeof
# [NOT] -

- O operador de negação unária
- O -o perador está sobrecarregado para dois tipos de operandos
- O operador de negação unário pode converter
- BigInts pode ser negado
# [NOT] + (Plus)

- O operador unário mais
- Embora a negação unária ( -) também possa converter não números
- O Unary plus executa exatamente as mesmas etapas da coerção numérica
- Ele pode converter
# [NOT] >>>

- O operador unsigned right shift
- O excesso de bits deslocados para a direita
- Ao contrário de outros operadores aritméticos e bit a bit
- O operador opera na representação de bits
- A representação binária
- Em ambos os casos, o sinal do número binário
- Observe como dois bits mais à direita
- Para o número positivo
- Se o operando esquerdo
- O operando direito será convertido
# [NOT] >>>=

- O operador de atribuição de deslocamento à direita não assinado
# [NOT] void

- O voidoperador avalia
- Este operador permite avaliar
- O voidoperador é frequentemente usado
- Ressalta-se que a precedência do void
- Ao usar uma expressão de função invocada imediatamente
- Para que a função seja analisada como uma expressão
- A invocação de função tem maior precedência que os operadores unários
- De todos os operadores unários,void oferece
- Quando um navegador segue um javascript:URI
- javascript: o pseudoprotocolo
- As funções de seta introduzem
# [NOT] yield

- O yieldoperador
- Retorna o valor opcional
- A yieldpalavra-chave pausa
- Pode ser considerada
- yieldsó pode ser usado diretamente
- Chamar uma função geradora
- Cada vez que o next()método do gerador é chamado
- Uma vez pausada em uma yieldexpressão
- Se um valor opcional for passado para o next()método do gerador
- A primeira next()chamada
- return()Se o método or do gerador throw()for chamado
- Uma vez definida uma função geradora
# (NOT] yield*

# <Statements-&-declarations> <!-- -->
# [NOT] async function 

- A async function declaração
- A await palavra-chave
- Não pode haver terminador de linha
- Uma async function
- Cada vez que uma função assíncrona é chamada
- As funções assíncronas podem conter
- As expressões Await
- O valor resolvido da promessa
- Uso de async e await
- a await palavra-chave só é válida
- Se você usá-lo fora
- o objetivo de async/await
- comportamento de async/ await
- Se o valor de retorno de uma função assíncrona
- Mesmo que o valor de retorno de uma função assíncrona
- Uma função assíncrona retornará
- O corpo de uma função assíncrona
- O código de nível superior
- Dessa forma, uma função assíncrona
- No entanto, se houver uma expressão
- O código após cada expressão de espera
- Desta forma
- O valor de retorno
- Observe como a cadeia de promessas não é construída de uma só vez. Em vez disso, a cadeia de promessas
- Como resultado
- Por exemplo, no código a seguir, um erro de rejeição
- async functionas declarações se comportam
- Os cronômetros são executados simultaneamente, o que significa
- No entanto, as awaitchamadas
- Nesse caso
- Se você deseja executar outras tarefas com segurança depois que duas ou mais tarefas forem executadas simultaneamente e concluídas
- As funções sequentialWaite concurrent1 não são funcionalmente equivalentes
- Nas duas versões reescritas
- O valor de retorno
# [NOT] async function* 

- A async function* declaração
- Você também pode definir
- as funções do gerador assíncrono não
- function e * são tokens separados, portanto, podem ser separados
- Porém, não pode haver
- Uma async function*declaração cria
- Cada vez que uma função geradora assíncrona é chamada
- Cada chamada para next()
- Uma função geradora assíncrona combina
- Você pode usar as palavras-chave
- Isso permite
- Quando uma promessa é gerada de um gerador assíncrono
- 1será registrado, porque
- A valuepropriedade do resultado resolvido
- async function*as declarações se comportam
- As funções do gerador assíncrono sempre
# [NOT] Block statement 

- Uma instrução de bloco
- O bloco é delimitado
- Ele permite
- Combinar instruções em blocos
- Além disso, combinados com declarações com escopo de bloco como let, conste class
- Variáveis ​​declaradas com varou criadas por declarações de função em modo não estrito
- As variáveis
- Em código não estrito, as declarações de função dentro dos blocos
- Por outro lado
- No modo estrito , as declarações de função dentro dos blocos
- Um for loop aceita
# [NOT] break 

- Ele também pode ser usado
- Identificador associado
- Se a breakinstrução não estiver aninhada
- Quando break; é encontrado
- Quando break label; é encontrado
- A break instrução precisa
- A instrução rotulada pode ser
- Uma break instrução, com ou sem um rótulo a seguir
- mesmo quando
- mas gera um erro de sintaxe porque sua break
- Erros de sintaxe também são gerados nos exemplos de código a seguir, que usam breakinstruções dentro
# [NOT] class 

- A class declaração cria
- Você também pode
- classas declarações têm
- classas declarações só podem
- classas declarações não criam
- class declarações não podem
- Fora do corpo da classe
- Dentro do corpo da classe
# [NOT] const 

- A constdeclaração declara
- O valor de uma constante
- mas se uma constante
- A constdeclaração é muito semelhante a let:
- const as declarações só podem ser acessadas
- constas declarações não criam
- constdeclarações não podem
- A constdeclaração cria
- É necessário
- constcomeça
- Isso não significa
- As constantes podem ser declaradas com letras maiúsculas ou minúsculas, mas uma convenção
- Você precisaria usarObject.freeze()
# [NOT] continue 

- A continueinstrução
- Em contraste com a breakinstrução, continuenão encerra totalmente a execução do loop, mas:
- A continueinstrução pode incluir
- Nesse caso, a continueinstrução precisa
- Uma continueinstrução, com ou sem um rótulo a seguir, não pode
- continuenão pode ser usado dentro
# [NOT] debugger 

- A debugger instrução
- Se nenhuma
- para invocar um depurador
- Quando o depurador é invocado
# [NOT] do...while 

- A do...whileinstrução cria
- A condição é avaliada
- Em alguns casos
# [NOT] Empty statement 

- Uma instrução vazia é usada
- A instrução vazia é
- O comportamento oposto
- É uma boa ideia comentar
# [NOT] export 

- A exportdeclaração é usada
- Os valores exportados podem
- O valor de um binding importado
- Para usar a exportdeclaração
- Em HTML, isso é feito adicionando
- Se você usar um alias com as
- Cada módulo pode ter
- Você pode ter várias exportações
- Cada tipo corresponde
- Após a exportpalavra-chave
- Você também pode usar
- Observe que export {}não exporta
- As declarações de exportação
- Você pode declarar
- Os nomes das declarações de exportação
- er exportações com nomes duplicados
- A export defaultsintaxe permite
- Como um caso especial, funções e classes
- Isso significa
- As exportações nomeadas são úteis
- Ao importar este módulo
- Você também pode renomear exportações
- Você pode renomear um nome
- Um módulo também pode "retransmitir"
- Isso geralmente é útil
- Que é comparável a uma combinação de importação e exportação
- A maioria das sintaxes "importar de"
- Há também export * from "mod", embora não haja import * from "mod". Isso reexporta
- Se houver duas instruções de exportação curinga
- A tentativa de importar o nome duplicado
- O seguinte é sintaticamente inválido
- A maneira correta de fazer isso
- A sintaxe "exportar de" permite
- Em um módulo my-module.js, poderíamos
- Em seguida, no módulo de nível superior
- Você precisa incluir este script em seu HTML
- Você não pode executar módulos JS
- Se quisermos exportar um único valor ou ter um valor
- Então, em outro script, é simples
# [NOT] Expression statement 

- A expressão é avaliada
- A sintaxe da instrução de expressão requer
- Como a expressão é avaliada
- Portanto
- Para que uma expressão seja usada como uma instrução
- Para evitar esses problemas
- Uma instrução de expressão
# [NOT] for 

- A forinstrução
- O bloco de inicialização aceita expressões e declarações de variáveis. No entanto, as expressões não podem
- Todas as três expressões
- Declarar uma variável dentro do bloco de inicialização tem diferenças importantes de declará-la no escopo superior , especialmente ao criar um encerramento dentro do corpo do loop
- A razão é que cada um setTimeout
- Isso também acontece se você usar uma varinstrução como inicialização
- Mais precisamente, letas declarações são casos especiais por forloops
- Isso ocorre porque getInão é reavaliado a cada iteração
- Observe que o ponto-e-vírgula após a forinstrução é obrigatório
- Você pode criar dois contadores
# [NOT] for await...of 

- A for await...ofinstrução
- Esta declaração só pode
- Quando um for await...ofloop itera sobre um iterável
- Se o @asyncIteratormétodo não existir
- O iterador de sincronização retornado
- O loop chama repetidamente
- Se o for await...ofloop for encerrado antecipadamente
- A promessa retornada
- for await...ofgeralmente funciona
- for await...offunciona
- for await...ofsó pode ser usado
- Se iterablefor um iterável
- Para for await...of
- Você também pode iterar sobre
- Como os valores de retorno
- for await...ofloop também consome
- Nesse caso
- Esteja ciente de produzir
- Nesse caso, for await...oflança
- Para fazer finally blocos
# [NOT] for...in 

- A for...ininstrução
- O loop irá iterar sobre
- que o objeto
- Um for...inloop apenas itera
- Objetos criados a partir
- Dentro de cada componente da cadeia de protótipo
- Uma sintaxe herdada permite
- Isso gera
- Qualquer propriedade adicionada
- Se vários objetos na cadeia de protótipos tiverem uma propriedade com o mesmo nome
- Se não for enumerável
- Em geral, é melhor
- exceto
- A especificação permite explicitamente que a implementação não siga o algoritmo acima em um dos seguintes casos
- Nesses casos, as implementações
- Os índices de matriz
- O for...inloop percorrerá
- No entanto, o for...inloop
- Ao contrário de for...of
- É melhor usar um forloop
- porque
# [NOT] for...of 

- A for...ofinstrução
- Objetos iteráveis ​​incluem
- Um for...ofloop opera
- Cada operação do loop
- Cada iteração executa
- Quando um for...ofloop
- Um for...ofloop termina
- Se o for...ofloop for encerrado antecipadamente
- A variable parte de for...of
- Cada iteração
- Reatribuir
- No entanto, uma regra especial
- Isso é para evitar ambiguidade
- Os geradores implementam
- A for...ininstrução itera
- enquanto a for...of
# [NOT] function 

- A functiondeclaração
- Uma functiondeclaração
- Cada vez que uma função
- functiondeclarações se comportam como uma mistura de vare let
- Como let
- Como let, declarações de função
- Como var, declarações
- As declarações de função no nível superior
- Como ambos, as declarações de função
- Ao contrário de ambos
- No modo não restrito , as declarações de função
- As funções podem ser declaradas condicionalmente
- No entanto, no modo não restrito
- No modo estrito , as declarações de função em nível de bloco
- As declarações de função em JavaScript
- Você pode
- Observe que as expressões de função
- Se functionas declarações podem ser redeclaradas
- No nível superior de um script
- mas não
- Quando functionas declarações são redeclaradas
- Isso ocorre porque
- No nível superior do corpo de uma função
- No nível superior de um módulo ou bloco em modo estrito
- Uma functiondeclaração dentro de um catch bloco
# [NOT] function* 

- A function*declaração cria
- Uma função geradora
- Você também pode definir
- As funções do gerador
- function e *são
- Uma function*declaração
- Cada vez que uma função geradora é chamada
- Quando o método do iterador next() é chamado
- O next()método retorna
- Chamar o next()método
- No entanto, uma solução
- Uma returninstrução em um gerador
- Se um valor for retornado
- Muito parecido com uma returninstrução
- Quando um gerador é concluído
- function*as declarações se comportam
# [NOT] if...else 

- A if...elseinstrução
- Várias if...elseinstruções
- Observe
- Para executar várias instruções dentro de uma cláusula
- Não usar blocos
- Em geral, é uma boa prática
- Não confunda os valores booleanos primitivos truee falsecom veracidade ou falsidade do Booleanobjeto. Qualquer valor
- No entanto, no caso raro de você querer fazer algo assim
# [NOT] import 

- A declaração estática é usada
- As ligações importadas
- Para usar a importdeclaração
- Em HTML, isso é feito adicionando
- Os módulos
- Há também uma função
- defaultExport
- module-name
- Isso geralmente é usado
- name
- exportN
- aliasN
- importas declarações só podem
- Se uma importdeclaração
- Para carregar módulos
- Todas as vinculações importadas
- importas declarações são projetadas
- permite que os módulos
- Essa é a chave
- Existem quatro formas de importdeclarações
- Dado um valor nomeado myExport
- Você pode importar vários
- Você pode renomear
- Um módulo também pode exportar
- import { x, y } from "mod" não é equivalente
- As exportações padrão precisam
- A versão mais simples
- Como a exportação padrão
- Também é possível especificar uma importação padrão
- Nesses casos
- Importar um nome chamado default
- É necessário
- Aqui, myModulerepresenta um objeto
- Por exemplo
- o JavaScript não possui
- Importe um módulo inteiro
- Isso executa
- As declarações de importação
- Nesse caso, isso significa
- O identificador que está sendo importado é um live binding
- No entanto
- Ainda assim, qualquer módulo
- Você também pode observar o novo
# [NOT] Labeled statement 

- Uma instrução rotulada
- Você pode usar um rótulo
- Pense labelcomo
- continue;sem um rótulo
- enquanto continue label
- Os rótulos só podem ser aplicados
- Existe uma gramática herdada
- No código de modo estrito
- Funções não simples
- A sintaxe de declaração de função rotulada
# [NOT] let 

- A let declaração
- let as declarações têm
- let as declarações só podem ser acessadas
- let as declarações não
- let declarações não podem
- você não pode usar uma let
- Observe que let é permitido
- Uma variável declarada com let, const, ou classestá
- Enquanto estiver dentro da TDZ
- Se nenhum valor inicial foi especificado
- Isso difere das var variáveis
- O termo "temporal" é usado porque
- let declarações não podem estar no mesmo escopo que qualquer outra declaração, incluindo
- Uma let declaração dentro do corpo de uma função
- Uma let declaração dentro
- Você pode encontrar erros nas switch
- No entanto, esta combinação de declarações var e let
# [NOT] return 

- A return instrução
- A expressão cujo valor
- A returninstrução só pode ser usada
- Quando uma returninstrução é usada
- A return instrução tem efeitos diferentes quando colocada em diferentes funções
- Em uma função simples
- Em uma função assíncrona
- Em uma função geradora
- Em uma função geradora assíncrona
- Se uma returninstrução for executada dentro de um trybloco
- A sintaxe proíbe
- Para evitar esse problema
# [NOT] switch 

- A switchinstrução
- A defaultcláusula de uma switch
- Uma switchinstrução primeiro
- Em seguida
- usando
- Os valores de cláusula são avaliados
- Se nenhuma casecláusula correspondente for encontrada
- Por convenção, a defaultcláusula
- Uma switchdeclaração pode ter apenas
- As cláusulas casee defaultsão como rótulos
- No entanto
- Para corrigir isso
- Se nenhuma correspondência for encontrada
# [NOT] throw 

- A throwinstrução
- A execução da função atual
- Se não catchexistir
- A throwdeclaração é válida
- Sua execução gera
- A throwpalavra-chave pode ser seguida
- Na prática, a exceção lançada sempre deve ser um Errorobjeto ou uma instância de uma Errorsubclasse, como RangeError. Isso ocorre porque
- A sintaxe proíbe
- Para evitar esse problema
# [NOT] try...catch 

- A try...catchinstrução
- O código no trybloco
- O código no finally
- Isso nos dá três formas para a trydeclaração:
- Ao contrário de outras construções
- Se qualquer instrução dentro do trybloco
- Se nenhuma exceção
- Se uma tryinstrução interna não tiver um catchbloco
- Não precisa ser um único identificador
- Se você não precisar do valor da exceção
- O finallybloco
- Um catchbloco contém
- Então, um catchbloco
# [NOT] var 

- A varinstrução declara
- A sintaxe de desestruturação
- O escopo de uma variável declarada com var
- Ou se nenhuma das opções acima se aplicar
- É importante ressaltar
- Em um script, uma variável declarada usando var
- Isso significa
- O JavaScript tem gerenciamento automático de memória
- Tanto nos módulos NodeJS CommonJS quanto nos módulos ECMAScript nativos
- A lista que segue a varpalavra-chave é chamada
- Inicializadores de variáveis
- var as declarações, onde quer que ocorram em um script
- Declarar uma variável em qualquer lugar do código
- Esse comportamento é chamado hoisting
- var as declarações são levantadas
- Se você tiver dois script> elementos dentro de um HTML
- Por esse motivo, é recomendável sempre declarar as variáveis ​​no topo
- Somente a declaração de uma variável é levantada, não sua inicialização. A inicialização ocorre
- var as declarações também podem
- Nesse caso
- Isso ocorre porque as declarações
- varas declarações não podem
- Como var as declarações não têm escopo para blocos
- Não se aplica ao seguinte caso
- Uma vardeclaração dentro do corpo de uma função
- Uma vardeclaração dentro de um catchbloco
- Esta é uma
- Variáveis ​​que parecem ser globais
# [NOT] while 

- A whileinstrução
- Mas há uma maneira de prática recomendada para evitar esse aviso
- Mas a melhor prática real é dar um passo adiante e tornar o código ainda mais claro