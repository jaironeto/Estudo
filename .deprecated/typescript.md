# [AUTODITADO] Codigo Concepts Photographic Memoryb

- adicionando novos campos a uma interface existente com interface e com type
- alias de tipo para nomear um tipo de função
- alias para um tipo união e depois usar o alias na função
- aliases de tipo para tipos, objeto e função
- anotação Tipos de objeto em funções
- anotações de Tipo de Retorno
- anotações de tipo em variáveis
- as duas formas de declarar matrizes
- asserções de tipo com as do menos especifico para o mais especifico
- asserções de tipo com as e com <>
- assinatura de construção
- assinatura de indice em classes
- assinatura de índice 
- campos de classe prefixados com readonly com e sem modificador public
- classe blocos estaticos
- classe com membro private
- classe com membro protected
- classe com membro public
- classe e membros abstract
- classe função com uma assinatura de construção, no caso, implements em uma interface com uma
- classe membros static 
- classe membros static com modificadores de acesso
- classe membros static herdado
- classes genericas
- combinação de uma função com uma propriedade associada em um tipo, que pode ser usado como parâmetro em uma função normal
- compilar o codigo
- construtor com campos publicos diretamente inserido
- declarar uma classe com campos, construtor e metodos
- declarar uma função que pode ser chamada com ou sem new, no caso, uma função normal e outra construtora em uma interface Implementado por uma classe e um objeto literal
- definindo um tipo de união em uma função
- desestruturar tuplas, const com tipo tupla
- desestruturação de parametros de array em uma função, sendo 3 exemplos de tupla, array string, uniao string e undefined
- desestruturação de parâmetros em uma função
- enums
- especificar o argumento passado para a função génerica
- estendendo e tambme implementando uma interface
- estendendo um tipo por meio de interseções
- estreitamento em tipos de união
- exemplo TypeScript declare o tipo this no corpo da função
- extends em classes
- fornecer parametro padrão para uma função
- função Genérica
- funções Genéricas com restrições
- funções Genéricas com varios parameotros
- get/set em classes
- implements em classes
- inferencia explicita ao chamar uma função génerica
- interface
- interface com um tipo generico
- membros normais e uma assinatura de indice para caso eu precise mais propriedades extra
- metodos em classes com tipagem em todos os tipos diferentes de membros possiveis
- operador de Asserção Não Nulo (Postfix !)
- overloads em construtores de classe
- parametro de funções opcionais com ? e valor padrão
- parametro rest em função
- parâmetros opcionais em retornos de chamada/calback
- primitiva symbol, bigint
- propriedade declarada diretamente no construtor da classe
- propriedade opcional
- propriedades Opcionais em funções
- propriedades marcadas como readonly
- readonly abreviado
- readonlyArray
- reandoly direto no parametro da função
- sobrecarga de função
- sobrescrever um método em uma classe
- this como parametro
- tipo any
- tipo de tupla 
- tipo void, object, unknown, never, Function
- tipos de tupla as const 
- tipos de tupla com elementos opcionais
- tipos de tupla com elementos rest
- tipos de tupla readonly
- tipos de tuplas usados em parâmetros e argumentos rest 
- tipos explícitos parametro de function
- tipos literais
- tipos literais em objeto, mas as duas formas usar const para manter imutavel
- trabalhar com tipos de união em uma função
- type com tipo generico
- type em tipos de objetos

# <Manual>
# [NOT] O básico

- Todo e qualquer valor em JavaScript tem
- Para alguns valores, como os primitivos stringe number, podemos identificar seu tipo em tempo de execução usando o typeofoperador. Mas para outras coisas como funções, não há
- A única maneira em JavaScript puro de dizer o que fnfaz com um determinado valor é
- O JavaScript só fornece realmente digitação dinâmica - executando o
- A alternativa é usar um sistema de tipo estático para fazer
- Por exemplo, a especificação diz que tentar chamar algo que não pode ser chamado deve gerar um erro. Talvez isso soe como “comportamento óbvio”, mas você pode imaginar que acessar uma propriedade que não existe em um objeto deve gerar um erro também. Em vez disso, o JavaScript nos dá
- O verificador de tipo tem informações para verificar coisas como se estamos acessando
- Isso significa que o TypeScript também pode ser aproveitado para edição de código, e o verificador de tipo principal pode fornecer mensagens de erro e conclusão de código conforme você digita no editor. Isso é parte do que as pessoas geralmente se referem
- O compilador tenta emitir um código legível limpo que se pareça com algo que uma pessoa escreveria. Embora isso nem sempre seja tão fácil, o TypeScript recua
- Uma coisa que você pode não ter notado no último exemplo foi que nosso hello.jsarquivo mudou novamente. Se abrirmos esse arquivo, veremos que o conteúdo ainda se parece basicamente com o nosso arquivo de entrada. Isso pode ser um pouco surpreendente dado o fato de que tscreportamos um erro sobre nosso código, mas isso é baseado em um dos valores centrais do TypeScript: na maior parte do tempo
- Para que serve noEmitOnError !
- O que são anotações de tipo, para que serve? com ele o TypeScript pode nos informar sobre outros casos em que
- Lembre-se de que nem sempre precisamos escrever anotações de tipo explícitas. Em muitos casos, o TypeScript pode apenas
- As anotações de tipo não fazem parte
- --target es2015alterações
- afinal, voltar anyé apenas a experiência simples do
- Ativar o noImplicitAnysinalizador emitirá um erro em qualquer variável cujo
- O strictNullCheckssinalizador torna
# [NOT] Tipos do dia a dia

- JavaScript tem três primitivos muito comumente usados
- Os nomes de tipo String, Numbere Boolean(começando com letras maiúsculas) são legais, mas referem-se
- Sempre use
- Para especificar o tipo de um array como [1, 2, 3], você pode usar
- Você também pode ver isso escrito como
- Observe que isso [number]
- O TypeScript também tem um tipo especial, any, que você pode usar sempre que
- Quando um valor é do tipo any, você pode
- O anytipo é útil quando você não deseja escrever
- Quando você não especifica um tipo e o TypeScript não pode inferi-lo a partir do contexto
- Você geralmente deseja evitar isso
- Use o sinalizador do compilador noImplicitAnypara sinalizar qualquer
- Ao declarar uma variável usando const, var, ou let, você pode opcionalmente
- Na maioria dos casos, porém, isso não é necessário
- Funções são o principal meio de
- Ao declarar uma função, você pode adicionar
- TypeScript permite que você especifique os tipos de valores
- As anotações de tipo de parâmetro vêm
- Quando um parâmetro possui uma anotação de tipo
- As anotações do tipo de retorno aparecem após
- Mesmo que você não tenha anotações de tipo em seus parâmetros, o TypeScript
- Assim como as anotações de tipo de variável, você geralmente não precisa de uma anotação de tipo de retorno porque
- Você também pode adicionar anotações de tipo
- Esse processo é chamado de digitação contextual porque
- Anotações de tipo de objeto se refere a qualquer valor JavaScript
- Para definir um tipo de objeto, simplesmente listamos
- Os tipos de objeto também podem especificar que algumas ou todas as suas propriedades são opcionais . Para fazer isso, adicione
- Você pode usar ou para separar as propriedades
- A parte do tipo de cada propriedade também é opcional. Se você não especificar um tipo
- Em JavaScript, se você acessar uma propriedade que não existe, obterá o valor undefinedem vez de um erro de tempo de execução. Por causa disso, ao ler uma propriedade opcional, você terá
- O sistema de tipos do TypeScript permite que você crie
- A primeira maneira de combinar tipos que você pode ver é um tipo de união . Um tipo de união é um tipo formado por
- É fácil fornecer um valor correspondente a um tipo de união - basta fornecer um tipo
- O TypeScript só permitirá uma operação se for válida para todos os membros do sindicato
- O estreitamento ocorre quando o TypeScript pode
- A solução é restringir a união com o código
- Às vezes você terá uma união onde todos os membros têm algo em comum. Por exemplo, arrays e strings possuem um slicemétodo. Se todos os membros de uma união tiverem uma propriedade em comum, você poderá
- Temos usado tipos de objetos e tipos de união, escrevendo-os diretamente em anotações de tipo. Isso é conveniente
- Na verdade, você pode usar um alias de tipo para dar um nome a
- Um alias de tipo é exatamente isso: um nome para qualquer tipo
- Observe que aliases são apenas aliases - você não pode usar aliases de tipo para
- Quando você usa o alias, é exatamente como se
- Uma declaração de interface é outra maneira de
- Aliases de tipo e interfaces são muito semelhantes e, em muitos casos, você pode escolher entre eles livremente. Quase todos os recursos de um interfaceestão disponíveis em type, a principal distinção é que um tipo não pode
- O TypeScript se preocupa apenas com a estrutura do valor para o qual passamos printCoord
- chamamos TypeScript de sistema de tipos estruturalmente tipados
- Por exemplo, se você estiver usando document.getElementById, o TypeScript sabe apenas que isso retornará algum tipo de HTMLElement, mas você pode saber que sua página sempre terá um HTMLCanvasElementcom um determinado ID.
Nessa situação, você pode usar uma declaração de tipo para especificar um tipo mais específico:
- Como uma anotação de tipo, as asserções de tipo são removidas pelo compilador e não afetarão
- Lembrete: como as asserções de tipo são removidas em tempo de compilação, não há verificação de tempo de execução associada a uma asserção de tipo. Não haverá uma exceção ou nullgerada se
- O TypeScript permite apenas declarações de tipo que convertem em uma versão
- Às vezes, essa regra pode ser muito conservadora e não permitirá coerções mais complexas que possam ser válidas. Se isso acontecer, você pode
- Além dos tipos gerais stringe number, podemos nos referir a strings e números específicos em
- Quando você inicializa uma variável com um objeto, o TypeScript assume que as propriedades desse objeto podem
- O as constsufixo age como constmas para o sistema de tipos, garantindo que todas as propriedades sejam
- Existem duas maneiras de contornar isso
- O TypeScript também possui uma sintaxe especial para remover nulle undefinedde um tipo sem fazer nenhuma verificação
# [NOT] Mais sobre funções

- A maneira mais simples de descrever uma função é com uma
- Esses tipos são sintaticamente semelhantes às funções de seta
- Assim como nas declarações de função
- Claro, podemos usar
- Observe que o nome do parâmetro é obrigatório . O tipo de funçãoO tipo de função
- Em JavaScript, as funções podem ter
- As funções JavaScript também podem ser
- Alguns objetos, como Date
- No TypeScript, os genéricos são usados
- Ao adicionar um parâmetro de tipo Typea essa função e usá-lo em dois locais
- Às vezes, queremos relacionar dois valores
- O problema é que a função promete
- especificar manualmente
- As funções em JavaScript geralmente
- padrão de parâmetro
- se você chamar uma função com mais argumentos
- No TypeScript, podemos especificar uma função
- assinatura de implementação
- void
- object
- unknown
- never
- Function
- Além de usar
- Um parâmetro rest
- podemos fornecer
- Observe que
- Você pode usar a desestruturação de parâmetros
# [NOT] Tipos de objetos

- Em JavaScript, a maneira fundamental
- Cada propriedade em um tipo de objeto pode especificar algumas coisas:
- Tudo o que a opcionalidade realmente diz é que
- As propriedades também podem ser marcadas como readonly
- O TypeScript não considera
- Às vezes, você não conhece
- Apenas alguns tipos
- É possível oferecer suporte a ambos os tipos de indexadores
- Por fim
- Onde e como um objeto é atribuído a um tipo
- Se um objeto literal
- No entanto, uma abordagem
- Uma maneira final de contornar essas verificações
- A extendspalavra-chave an interfacenos permite
- interfaces também podem se estender de vários tipos. ts
- O TypeScript fornece outra construção chamada tipos de interseção que é usada principalmente
- Em vez disso, podemos criar um tipo genérico
- Como os aliases de tipo, ao contrário das interfaces
- Muito parecido com o Boxtipo acima
- O JavaScript moderno também fornece outras estruturas de dados que são genéricas, como
- O ReadonlyArray
- Um tipo de tupla
- Assim como ReadonlyArray, ele não tem representação em tempo de execução, mas é significativo
- Também podemos desestruturar tuplas
- Além dessas verificações de comprimento
- Outra coisa que você pode estar interessado é que as tuplas
- As tuplas também podem ter elementos rest
- Tipos de tuplas podem ser usados
- Uma observação final sobre os tipos de tupla
# (NOT] Manipulação de tipo
# [NOT] Classes

- Uma declaração de campo cria uma
- Assim como em outros locais, a anotação de tipo é opcional, mas será
- Os campos também podem ter inicializadores ; estes serão
- Assim como com const, let, e var, o inicializador de uma propriedade de classe será usado para
- A strictPropertyInitializationconfiguração controla se os campos de classe precisam
- Observe que o campo precisa ser inicializado no
- O TypeScript não analisa os métodos que você chama do construtor para
- Se você pretende inicializar definitivamente um campo por meios diferentes do construtor (por exemplo, talvez uma biblioteca externa esteja preenchendo parte de sua classe para você), você pode usar
- Os campos podem ser prefixados com o readonlymodificador. Isso evita
- Os construtores de classe são muito semelhantes às funções. Você pode adicionar
- Existem apenas algumas diferenças entre assinaturas de construtor de classe e assinaturas de função:
- Assim como no JavaScript, se você tiver uma classe base, precisará
- Uma propriedade de função em uma classe é chamada de
- Métodos podem usar todas as mesmas
- Observe que dentro de um corpo de método, ainda é obrigatório
- As classes também podem ter
- O TypeScript tem algumas regras de inferência especiais para acessadores:
- As classes podem declarar assinaturas de índice
- Como o tipo de assinatura de índice também precisa capturar os tipos de métodos, não é fácil usar esses tipos de maneira útil. Geralmente é melhor
- Você pode usar uma implementscláusula para
- Um erro será emitido se uma classe  
- É importante entender que uma implementscláusula é apenas 
- As classes podem extendpartir de
- Uma classe derivada também pode substituir
- Você pode usar a super.sintaxe para acessar
- bserve que, como as classes JavaScript são um objeto de pesquisa simples, não há
- O TypeScript impõe que uma classe derivada seja sempre
- É importante que uma classe derivada siga seu contrato de classe base. Lembre-se que é muito comum (e sempre legal!) referir-se a uma instância de classe derivada por meio
- E se Derivednão seguisse Baseo contrato de? ts
- Quando target >= ES2022ou useDefineForClassFieldsé true, os campos de classe são inicializados após
- Isso pode ser um problema quando 
- Para lidar com esses casos
- A ordem que as classes JavaScript inicializam pode ser surpreendente em alguns casos
- No ES2015, os construtores que retornam um objeto substituem
- É necessário que o código do construtor gerado capture qualquer
- Como recomendação, você pode ajustar manualmente o protótipo imediatamente após qualquer super(...)chamada. ts
- No entanto, qualquer subclasse MsgErrortambém terá 
- Você pode usar o TypeScript para controlar se determinados métodos ou propriedades são
- A visibilidade padrão dos membros da classe
- Um publicmembro pode ser
- Como publicjá é o modificador de visibilidade padrão, você nunca precisará
- protectedmembros são visíveis apenas para
- As classes derivadas precisam seguir seus contratos de classe base, mas podem optar por
- Isso inclui fazer
- O TypeScript fica do lado do C# e do C++ aqui, porque o acesso xdeve Derived2ser legal apenas nas Derived2subclasses de e Derived1não é uma delas. Além disso, se o acesso xpor meio de uma Derived1referência for ilegal (o que certamente deveria ser!), acessá-lo por meio de uma referência de classe base nunca deve melhorar a situação.
- privateé como protected, mas não permite
- Como privateos membros não são visíveis para classes derivadas, uma classe derivada não pode
- O TypeScript permite privateacesso entre
- Como outros aspectos do sistema de tipos do TypeScript, privatee protected são aplicados apenas
- Isso significa que construções de tempo de execução JavaScript
- privatetambém permite acesso usando a notação de colchetes durante
- Isso torna privateos campos declarados potencialmente mais fáceis 
- Ao contrário do TypeScripts , os campos privadosprivate do JavaScript ( ) permanecem privados após
- Ao compilar para ES2021 ou menos, o TypeScript usará WeakMaps no lugar de #. ts
- Se você precisar proteger valores em sua classe de agentes mal-intencionados, deverá usar mecanismos que ofereçam privacidade de tempo de execução rígida, como fechamentos, WeakMaps ou campos privados. Observe que essas verificações de privacidade adicionadas durante o tempo de execução podem
- As classes podem ter staticmembros. Esses membros não estão associados
- Eles podem ser acessados ​​através 
- Os membros estáticos também podem usar os mesmos modificadores
- Membros estáticos também são
- Geralmente não é seguro/possível substituir as propriedades do Functionprotótipo. Como as próprias classes são funções que podem ser invocadas com new, certos staticnomes não podem ser usados. Propriedades de função como name, lengthe callnão são válidas para definir como staticmembros
- Por exemplo, não precisamos de uma sintaxe de “classe estática” no TypeScript porque um objeto regular (ou mesmo uma função de nível superior) também fará o trabalho: ts
- Os blocos estáticos permitem que você escreva
- As classes, assim como as interfaces, podem ser genéricas. Quando uma classe genérica é instanciada com new
- As classes podem usar restrições e padrões genéricos da mesma forma
- Lembre-se de que os tipos são sempre totalmente apagados! No tempo de execução, há apenas um Box.defaultValue slot de propriedade. Isso significa
- Os staticmembros de uma classe genérica nunca
- É importante lembrar que o TypeScript não altera o comportamento do tempo de execução do JavaScript e que o JavaScript
- Para encurtar a história, por padrão, o valor de thisdentro de uma função depende
- Se você tiver uma função que frequentemente será chamada de uma forma que perde seu thiscontexto, pode fazer sentido usar
- Isso tem algumas vantagens
- Em uma definição de método ou função, um parâmetro inicial nomeado thistem um significado especial no TypeScript. Esses parâmetros são
- O TypeScript verifica se a chamada de uma função com um thisparâmetro é feita com um contexto correto. Em vez de usar uma função de seta, podemos
- Nas classes, um tipo especial chamado thisrefere-se dinamicamente
- Você também pode usar thisem uma anotação
- Isso é diferente de escrever other: Box— se você tiver uma classe derivada, seu sameAsmétodo agora aceitará apenas outras instâncias dessa mesma classe derivada: ts
- Você pode usar this is Typena posição de retorno para métodos em classes e interfaces. Quando misturado com uma restrição de tipo (por exemplo, ifinstruções), o tipo do objeto de destino seria reduzido ao especificado Type. ts
- Um caso de uso comum para um guarda de tipo baseado nisso é permitir
- Por exemplo, este caso remove an undefineddo valor
- O TypeScript oferece sintaxe especial para transformar um parâmetro de construtor em uma propriedade de classe com o mesmo nome e valor. Eles são chamados
- As expressões de classe são muito semelhantes às declarações de classe. A única diferença real é que
- Classes, métodos e campos no TypeScript podem
- Um método abstrato ou campo abstrato é aquele que
- Esses membros devem existir  
- O papel das classes abstratas é servir como uma classe base para subclasses que
- Quando uma classe não possui membros abstratos, ela é chamada
- Não podemos instanciar Baseporque newé abstrato. Em vez disso, precisamos criar
- Observe que, se esquecermos de implementar os membros abstratos da classe base
- Às vezes, você deseja aceitar alguma função de construtor de classe que produz uma instância de uma classe que deriva de alguma classe abstrata.
- Na maioria dos casos, as classes em TypeScript são comparadas estruturalmente, da mesma forma que outros tipos. Por exemplo, essas duas classes podem ser usadas no lugar uma da outra porque são idênticas
- Da mesma forma, existem relacionamentos de subtipos entre classes mesmo que não haja herança explícita:
- Classes vazias não têm membros. Em um sistema de tipo estrutural, um tipo sem membros geralmente é
- Então, se você escrever uma classe vazia (não!), qualquer coisa
# [NOT] Módulos

- No TypeScript, assim como no ECMAScript 2015, qualquer arquivo que contenha um nível superior importou export é
- Por outro lado, um arquivo sem nenhuma declaração de importação ou exportação de nível superior é tratado como
- Os módulos são executados dentro de seu próprio escopo, não
- Isso significa que variáveis, funções, classes, etc. declaradas em um módulo não são
- Por outro lado, para consumir uma variável, função, classe, interface, etc. exportada de um módulo diferente, ela deve ser
- Antes de começarmos, é importante entender o que o TypeScript considera um módulo. A especificação JavaScript declara que qualquer
- Dentro de um arquivo de script, variáveis ​​e tipos são declarados no escopo global compartilhado e presume-se que você usará a outFileopção do compilador
- Se você tiver um arquivo que atualmente não possui nenhum imports ou exports, mas deseja ser tratado como um módulo
- Há três coisas principais a serem consideradas ao escrever código baseado em módulo no TypeScript
- Um arquivo pode declarar uma exportação principal via
- Isso é então importado via
- Além da exportação padrão, você pode ter mais de uma exportação de variáveis ​​e funções por meio
- Uma importação pode ser renomeada usando um formato como import {old as new}: ts
- Você pode misturar e combinar a sintaxe acima em uma única import
- Você pode pegar todos os objetos exportados e colocá-los em um único namespace usando * as name: ts
- Você pode importar um arquivo e não incluir nenhuma variável em seu módulo atual via import "./file": ts
- Nesse caso, o importnão faz nada. No entanto, todo o código maths.tsfoi avaliado, o que pode desencadear efeitos colaterais que afetam outros objetos
- Que é uma declaração de importação que só pode importar tipos
- O TypeScript 4.5 também permite que importações individuais sejam prefixadas typepara indicar que a referência importada é um tipo
- Juntos, eles permitem que um transpiler não TypeScript como Babel, swc ou esbuild saiba quais importações podem ser removidas com segurança
- O TypeScript possui a sintaxe do módulo ES que se correlaciona diretamente com um CommonJS e AMD require. As importações usando o Módulo ES são, na maioria dos casos, as mesmas requiredesses ambientes, mas
- CommonJS é o formato no qual a maioria dos módulos no npm são entregues. Mesmo se você estiver escrevendo usando a sintaxe ES Modules acima, ter um breve entendimento de como a sintaxe CommonJS funciona ajudará você a depurar mais facilmente
- Os identificadores são exportados definindo a exportspropriedade em um global chamado module
- Então esses arquivos podem ser importados por meio de uma requiredeclaração
- Ou você pode simplificar um pouco usando o recurso de desestruturação em JavaScript
- Há uma incompatibilidade de recursos entre os módulos CommonJS e ES em relação à distinção entre uma importação padrão e uma importação de objeto de namespace de módulo. O TypeScript tem um sinalizador de compilador para
- A resolução do módulo é o processo de pegar uma string da instrução importor requiree determinar
- O TypeScript inclui duas estratégias de resolução
- Existem duas opções que afetam a saída do JavaScript emitida
- O que targetv ocê usa é determinado
- Toda a comunicação entre os módulos acontece
- O TypeScript tem seu próprio formato de módulo chamado namespacesque é anterior ao padrão ES Modules. Essa sintaxe tem