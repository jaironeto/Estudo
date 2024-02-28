# <Material-designer>
`Fonte`https://fonts.google.com/
`Gradiant`https://cssgradient.io/
`Gradient`https://app.haikei.app/
`Icon`https://css.gg/
`Font`https://www.fontsquirrel.com/
`Font`https://www.dafont.com/pt/
`Font`https://everythingfonts.com/
`Font`https://fonts.google.com/
# <Inspiração>
https://hype4.academy/
https://freebiesbug.com/
figma.com/community
# <Artigos>
https://cssgradient.io/blog/
http://www.linhadecodigo.com.br/css.aspx
https://css-tricks.com/archives/
# <Geradores-de-codigo>
https://animista.net/play/basic/shadow-drop-2
`Grid`https://cssgrid-generator.netlify.app/
`Botao`https://www.bestcssbuttongenerator.com/#/0
`Flex`https://angrytools.com/css-flex/
`Clip`https://bennettfeely.com/clippy/
`Misc`https://10015.io/css-tools
# <Projetos-completos-codigo>
https://www.loopnerd.com.br/codigos-css-prontos/
https://startbootstrap.com/
https://styleshout.com/
https://html5up.net/
https://freehtml5.co/
https://www.tooplate.com/
https://themewagon.com/themes/


# <Primeiros-passos-CSS>
# [NOT] O que é CSS?

- CSS é uma linguagem baseada em regras
- As propriedades CSS têm diferentes valores permitidos
- Muitos desenvolvedores experientes
# [NOT] Introdução ao CSS

- Para vincular styles.cssa index.html
- usando o relatributo
- Você pode direcionar vários seletores ao mesmo tempo
# [NOT] Como o CSS é estruturado

- A linguagem CSS possui regras para controlar qual seletor é mais forte em caso de conflito. Essas regras são chamadas de cascata e especificidade
- Os estilos posteriores substituem os estilos conflitantes que aparecem
- Uma classe é classificada como mais específica, por ter mais especificidade que o seletor de elemento, cancelando a outra declaração de estilo conflitante
- No seu nível mais básico, CSS consiste em dois componentes
- Quando uma propriedade é associada a um valor
- As declarações CSS são encontradas nos Blocos de Declaração CSS
- Propriedades e valores CSS não diferenciam
- A propriedade e o valor em um par propriedade-valor são separados
- Se uma propriedade for desconhecida ou se um valor não for válido para uma determinada propriedade
- Embora a maioria dos valores sejam palavras-chave relativamente simples ou valores numéricos, existem alguns valores que assumem a forma de uma função
- Uma função consiste
- CSS @rules (pronuncia-se "at-rules") fornece instruções sobre o que o CSS
- Algumas propriedades como font, background, padding, bordere marginsão chamadas de propriedades abreviadas
- um aspecto menos óbvio do uso da abreviação CSS é como os valores omitidos são redefinidos. Um valor não especificado na abreviação CSS
- embora os espaços em branco separem os valores nas declarações CSS, os nomes
# [NOT] Como funciona o CSS

- Um DOM possui uma estrutura semelhante a uma árvore. Cada elemento, atributo e pedaço de texto na linguagem de marcação torna-se
- Os nós são definidos
- Alguns elementos são
# [NOT] Estilizando uma página de biografia

# <Blocos-de-construção-CSS>
# [NOT] Seletores CSS

- Há uma grande variedade de seletores CSS disponíveis, permitindo
- Um seletor CSS é a primeira parte
- É um padrão de elementos e outros termos que informam ao navegador
- O elemento ou elementos selecionados pelo seletor são
- Se você tiver mais de uma coisa que usa o mesmo CSS, os seletores individuais podem ser
- Ao agrupar seletores dessa forma, se algum seletor for sintaticamente inválido
- Este grupo de seletores inclui pseudoclasses, que estilizam 
- A :hover pseudo-classe, por exemplo, seleciona um elemento somente quando
- Também inclui pseudo-elementos, que selecionam uma certa parte de um elemento em vez do próprio elemento. Por exemplo, ::first-line sempre seleciona
- O grupo final de seletores combina outros seletores
# [NOT] Seletores de tipo, classe e ID

- Às vezes, um seletor de tipo é chamado de seletor de nome de marca ou seletor de elemento porque
- O seletor universal é indicado por
- Ele seleciona tudo no documento (ou dentro do elemento pai se estiver
- O seletor de classe começa
- Ele selecionará tudo no documento com aquela
- Um seletor de ID começa com
- No entanto, um ID pode ser usado
- Usar o mesmo ID várias vezes em um documento pode parecer funcionar para fins de estilo, mas não faça isso. Isso resulta
# [NOT] Seletores de atributos

- Se você deseja corresponder valores de atributo sem distinção entre maiúsculas e minúsculas, pode usar
- Sem o sinalizador, os valores serão correspondidos de acordo com
- Há também um valor mais recente s, que forçará a correspondência com 
# [NOT] Pseudoclasses e pseudoelementos

- Uma pseudoclasse é um seletor que seleciona elementos que
- Eles tendem a agir como se você tivesse aplicado
- Pseudoclasses são palavras-chave que começam com
- Todas as pseudoclasses se comportam da mesma maneira. Eles têm como alvo
- É válido escrever pseudo-classes e elementos sem nenhum
- Algumas pseudoclasses só se aplicam quando
- Essas pseudoclasses de ação do usuário , às vezes chamadas de pseudoclasses dinâmicas , agem como
- Pseudo-elementos se comportam de maneira semelhante. No entanto, eles agem como
- Pseudo-elementos começam com
- alguns pseudoelementos anteriores usavam a sintaxe de dois pontos simples, portanto, às vezes, você pode
- Existem alguns pseudo-elementos especiais, que são usados ​​junto com ocontent propriedade para
- Você pode usá-los para inserir uma string de texto, como no exemplo ao vivo abaixo. Tente alterar o valor de texto da
- Um uso mais válido desses pseudo-elementos é
- pseudo-elementos também são frequentemente usados ​​para
- O uso dos pseudoelementos ::beforee juntamente com a propriedade é chamado de
# [NOT] Combinadores

- Os seletores finais que veremos são chamados de combinadores, porque
- O combinador descendente — normalmente representado por
- combina dois seletores de modo que os elementos correspondidos
- O combinador filho ( >) é colocado entre
- Ele corresponde apenas aos elementos correspondidos
- O combinador filho seleciona apenas
- O seletor irmão adjacente ( +) é colocado entre
- Ele corresponde apenas aos elementos correspondidos
- Se você deseja selecionar irmãos de um elemento, mesmo que não sejam diretamente adjacentes, pode usar
- Você pode combinar qualquer um dos seletores que descobrimos nas lições anteriores com combinadores para
- Tome cuidado, no entanto, ao criar grandes listas de seletores que selecionam partes muito específicas do seu documento. Será difícil
- Muitas vezes é melhor criar uma classe simples e aplicá-la ao elemento em questão. Dito isso, seu conhecimento sobre combinadores
# [NOT] Cascata, especificidade e herança

- CSS significa Cascading Style Sheets , e a primeira palavra cascading é incrivelmente importante de se entender — a forma como a cascata se comporta é
- Cascata e o conceito intimamente relacionado de especificidade são mecanismos que
- Também significativo aqui é o conceito de herança , o que significa que algumas propriedades CSS, por padrão, herdam
- Cascata de folhas de estilo - em um nível muito simples, isso significa que
- Quando duas regras da mesma camada em cascata se aplicam e ambas têm igual especificidade, aquela que for
- Especificidade é o algoritmo que o navegador usa
- Se vários blocos de estilo tiverem seletores diferentes que configuram a mesma propriedade com valores diferentes e visam o mesmo elemento, a especificidade decide
- A especificidade é basicamente uma medida de quão específica será a seleção de um seletor
- A herança também precisa ser entendida neste contexto — alguns valores de propriedade CSS definidos em elementos pais são
- Algumas propriedades não herdam — por exemplo, se você definir um valor widthde 50% em um elemento, todos
- Esses três conceitos (cascata, especificidade e herança) juntos controlam
- A colorpropriedade é uma propriedade herdada. Assim, o colorvalor da propriedade é aplicado
- Propriedades como width(como mencionado anteriormente), margin, paddinge border
- Se uma borda fosse herdada pelos filhos neste exemplo de lista, cada lista e cada item da lista
- CSS fornece cinco valores de propriedades universais especiais para controlar a herança. Cada propriedade CSS aceita esses valores.
- inherit
- initial
- revert
- revert-layer
- unset
- A propriedade abreviada CSS allpode ser usada para
- Seu valor pode ser qualquer
- É uma maneira conveniente de desfazer alterações
- Há três fatores a serem considerados, listados aqui em ordem crescente de importância. Os posteriores anulam os anteriores:
- Muitas vezes, você se deparará com uma situação em que sabe que uma regra vem depois na folha de estilo, mas uma regra conflitante anterior é aplicada. Isso acontece porque
- Como vimos anteriormente nesta lição, um seletor de classe tem
- Algo a observar aqui é que, embora estejamos pensando em seletores e nas regras que são aplicadas ao texto ou componente que eles selecionam, não é toda a regra que
- Esse comportamento ajuda
- Uma prática comum é definir estilos genéricos para os elementos básicos e, a seguir, criar
- Vamos agora dar uma olhada em como o navegador calculará a especificidade. Já sabemos que
- Essencialmente, um valor em pontos é concedido a diferentes tipos de seletores, e a soma deles fornece 
- A quantidade de especificidade que um seletor tem é medida usando três valores diferentes (ou componentes), que podem ser pensados ​​como colunas ID, CLASS e ELEMENT nas centenas, dezenas e unidades:
- Identificadores : marque
- Classes : marque um
- Elementos : marque um nesta coluna para
- O seletor universal ( *), os combinadores ( +, >, ~, ' ') e o seletor de ajuste de especificidade ( :where()) junto com seus parâmetros não
- Cada tipo de seletor tem seu próprio nível de especificidade que não pode
- Por exemplo, um milhão de seletores de classe combinados não seriam capazes
- A melhor forma de avaliar a especificidade é pontuar
- Somente quando há empate
- Os estilos embutidos, ou seja, a declaração de estilo dentro de um styleatributo, têm
- Tais declarações não
- Há uma parte especial do CSS que você pode usar para anular todos os cálculos acima, até mesmo
- No entanto, você deve ter muito cuidado ao usá-lo. Este sinalizador é usado para tornar
- É útil saber que o !importantsinalizador existe para que você saiba o que é quando o encontrar no código de outras pessoas. No entanto, recomendamos fortemente que você nunca o use, a menos que seja absolutamente necessário. O !importantsinalizador altera
- A única maneira de substituir uma declaração importante é
- Uma situação em que você pode ter que usar o !importantsinalizador é quando
- Por fim, é importante observar que a precedência de uma declaração CSS depende
- É possível que os usuários definam folhas de estilo personalizadas para substituir os estilos do desenvolvedor. Por exemplo, um usuário com deficiência visual pode querer
- Também é possível declarar estilos de desenvolvedor em camadas em cascata: você pode fazer com que estilos sem camadas substituam estilos declarados em camadas ou você pode fazer com que
- Por exemplo, como desenvolvedor, você pode não conseguir
- Quando você declara CSS em camadas em cascata, a ordem de precedência é determinada pela
- Os estilos CSS declarados fora de qualquer camada são combinados, na ordem em que
- Com estilos concorrentes normais (não importantes), as camadas posteriores têm precedência sobre
- Para estilos sinalizados com !important, entretanto
- Os estilos embutidos têm precedência sobre
- Quando você tem vários blocos de estilo em diferentes camadas fornecendo valores concorrentes para
- A especificidade entre as camadas não importa, mas a especificidade dentro
# [NOT] Camadas em cascata

- As camadas em cascata são contêineres de especificidade explícita que fornecem
- O C em CSS significa "Cascading". É o método pelo qual
- O agente do usuário passa por várias etapas claramente definidas para
- Vamos listar brevemente essas etapas aqui e, em seguida, nos aprofundar na etapa 4, camadas em cascata, que é o que você veio aprender aqui
- Existem três tipos de origens em cascata
- Existem oito níveis de precedência:
- A ordem de precedência vai dos
- Para cada propriedade, a declaração que "ganha" é
- Se a origem vencedora tiver mais de uma declaração de propriedade para um elemento, a especificidade dos seletores para
- A especificidade nunca é
- A precedência de origem sempre
- Se uma propriedade de elemento for estilizada com uma declaração de estilo normal em várias origens, a folha de estilo
- Se o estilo for importante, a folha de estilo do agente do usuário sempre
- A precedência de origem em cascata garante que nunca
- Uma última observação antes de prosseguir:
- Semelhante a como temos seis níveis de prioridade com base na origem e na importância, as camadas em cascata nos permitem
- Dentro de cada um dos seis depósitos de origem, pode haver várias camadas em cascata. A ordem de criação da camada é muito importante. É a ordem de criação que
- Em depósitos de origem normal, as camadas são classificadas
- A ordem de precedência é da
- Esta ordem é invertida
- Todos os estilos importantes sem camadas são
- Os estilos importantes sem camadas têm
- Os estilos importantes nas camadas declaradas anteriormente têm
- Grandes bases de código podem ter estilos provenientes de várias equipes, bibliotecas de componentes, estruturas e terceiros. Não importa
- Ter estilos de várias fontes em cascata juntos, especialmente de equipes que não estão trabalhando juntas, pode
- Equipes diferentes podem ter metodologias diferentes; um pode
- Conflitos de especificidade podem escalar rapidamente. Um desenvolvedor da Web pode
- Da mesma forma que as origens em cascata fornecem um equilíbrio de poder entre usuário, agentes de usuário e estilos de autor, as camadas em cascata fornecem uma maneira estruturada de
- As regras dentro de uma camada são colocadas em cascata, sem
- A precedência da camada sempre supera
- Estilos em camadas com precedência "ganham" sobre
- A especificidade de um seletor em uma camada perdedora é irrelevante. A especificidade ainda
- Camadas em cascata permitem a
- Cada camada em cascata pode conter
- Uma camada em cascata regular adicionará a biblioteca de componentes à origem do autor, removendo qualquer
- Dentro da componentscamada, um desenvolvedor pode optar por
- A ordem dessas camadas de tema aninhadas pode ser
- Essas camadas aninhadas fornecem uma maneira
- A capacidade de aninhar camadas é muito útil para
- A capacidade de criar camadas aninhadas também
- As camadas podem ser criadas usando qualquer um dos seguintes métodos
- A ordem das camadas é definida pela ordem em que
- Declarar camadas usando @layerseguido pelos nomes de uma ou mais camadas sem atribuir nenhum estilo é
- A @layerregra CSS at é usada para
- Freqüentemente, você desejará que sua primeira linha de CSS seja esta @layerdeclaração (com nomes de camadas que façam sentido para o seu site, é claro) para ter
- As camadas podem ser criadas usando a @layerregra do bloco. Se uma @layerregra é seguida por
- Se ainda não existir uma camada com o nome especificado
- Se já existir uma camada com o nome especificado, os estilos serão
- Se nenhum nome for especificado ao criar um bloco de estilos usando @layer
- No exemplo abaixo, usamos quatro @layerregras em bloco e uma em linha. Este CSS faz o seguinte na ordem listada:
- Se uma camada nomeada ainda não existir, a especificação do nome em uma @layerregra, com ou sem atribuição de estilos à camada,
- Se a camada nomeada já existir, todos os estilos dentro do bloco nomeado serão anexados
- Camadas anônimas são criadas atribuindo
- Os estilos podem ser adicionados
- uso subsequente de @layersem nome de camada
- A @layerregra cria uma camada, nomeada ou não, ou anexa
- Todos os estilos declarados fora de uma camada
- As declarações normais sem camadas têm precedência
- Isso explica por que mesmo que o CSS sem camadas tenha sido declarado
- Se você definir uma camada usando consultas de mídia ou feição e a mídia não corresponder ou o recurso não for suportado
- A @importregra permite que os usuários importem
- Ao importar folhas de estilo, a @importinstrução deve ser definida
- A @importinstrução deve vir primeiro, antes de qualquer estilo, mas pode ser precedida
- Você pode importar uma folha de estilo para uma camada nomeada
- A camada a seguir importa as folhas de estilo para uma componentscamada
- Você pode importar mais de um arquivo CSS
- Você pode importar estilos e criar camadas com base em condições específicas usando
- O seguinte importa uma folha de estilo para uma internationalcamada somente se o navegador
- Não existe equivalente ao link> método de vincular folhas de estilo. Use @import para importar
- Camadas aninhadas são camadas
- Cada camada em cascata, mesmo anônima, pode conter
- As camadas importadas para outra camada tornam-se
- A capacidade de aninhar camadas permite
- Da mesma forma, o aninhamento permite importar folhas de estilo de terceiros para
- Como as camadas podem ser aninhadas, você não precisa
- Camadas aninhadas podem ser criadas usando
- Por exemplo, eles podem ser criados usando @layerat-rule seguido
- Vários pontos e nomes de camadas significam
- Se você aninhar um bloco @layerat-rule dentro de outro bloco @layerat-rule, com ou sem nome, o bloco aninhado
- Da mesma forma, quando uma folha de estilo é importada com uma @importdeclaração contendo a layerpalavra-chave ou layer()função
- Se esse arquivo contiver camadas, nomeadas ou não, essas camadas se tornarão
- A ordem das camadas determina
- Da mesma forma que a cascata classifica por origem e importância, a cascata classifica
- Os estilos normais declarados dentro das camadas recebem
- Os estilos embutidos são declarados usando o styleatributo . Os estilos normais declarados desta forma terão
- Os estilos de animação têm precedência mais alta que todos os estilos normais, incluindo
- Estilos importantes, ou seja, valores de propriedade que incluem o !importantsinalizador, têm precedência sobre
- Quaisquer estilos importantes declarados fora de uma camada têm
- Estilos importantes encontrados nas camadas também são classificados
- Os estilos importantes embutidos novamente têm precedência mais alta do que os estilos
- Os estilos de transição têm a maior precedência. Quando um valor de propriedade normal está sendo transicionado, ele tem precedência
- A ordem das camadas é definida pela ordem em que as camadas aparecem no seu CSS
- A ordem de precedência em cascata para camadas aninhadas é semelhante à das camadas normais, mas contida na camada. A ordem de precedência é baseada
- Os estilos não aninhados em uma camada têm precedência sobre os estilos normais aninhados
- Como os estilos normais sem camadas têm precedência sobre os estilos normais em camadas e, dentro de uma camada, os estilos não aninhados têm precedência
- Com estilos importantes, os estilos em camadas têm precedência sobre os estilos sem camadas, e os estilos importantes nas camadas declaradas anteriormente têm precedência
# [NOT] O modelo da caixa

- O tipo refere-se a como a caixa se comporta em termos
- As caixas têm um tipo
- Em geral, você pode definir vários valores para o tipo de exibição usando
- Se uma caixa tiver um tipo de exibição externa block, então
- Se uma caixa tiver um tipo de exibição externa inline, então
- As caixas também possuem um tipo de exibição interna , que determina
- Por padrão e sem qualquer outra instrução, os elementos dentro de uma caixa também são dispostos
- Você pode alterar o tipo de exibição interna, por exemplo, configurando
- O elemento ainda usará o tipo de exibição externo, blockmas isso altera o tipo de exibição interno para flex
- Quaisquer filhos diretos desta caixa se tornarão itens flexíveis e se comportarão de acordo
- O modelo de caixa CSS como um todo se aplica a caixas de bloco e define como as diferentes partes de uma caixa
- No modelo de caixa padrão, se você atribuir atributos an inline-sizee a block-size(ou widthe a height) a uma caixa, isso definirá o tamanho
- Qualquer preenchimento e borda são então adicionados a essas
- A margem não é contabilizada no tamanho real da caixa
- No modelo de caixa alternativo, qualquer largura é
- A largura da área de conteúdo é aquela largura menos a largura
- Não há necessidade de somar
- Para ativar o modelo alternativo para um elemento
- Para usar o modelo de caixa alternativo para todos os seus elementos (que é uma escolha comum entre os desenvolvedores), defina
- Você já viu as propriedades margin, paddinge borderem funcionamento no exemplo acima. As propriedades usadas nesse exemplo são abreviações e nos permitem definir todos os quatro lados da caixa de uma só vez. Essas taquigrafias também possuem
- Definir uma margem negativa em um lado da caixa pode fazer com que ela
- Quer você esteja usando o modelo de caixa padrão ou alternativo
- Dependendo se dois elementos cujas margens se tocam têm margens positivas ou negativas, os resultados serão diferentes
- A borda é desenhada entre
- Se você estiver usando o modelo de caixa padrão, o tamanho da borda será
- Se você estiver usando o modelo de caixa alternativo, o tamanho da borda
- Para estilizar bordas, há um grande número de propriedades
- O preenchimento fica entre
- Ao contrário das margens, você não pode
- Qualquer plano de fundo aplicado ao seu elemento será
- Você pode alterar o preenchimento de qualquer elemento para criar espaço entre
- As margens superior e inferior, o preenchimento e a borda são respeitados, mas não alteram
- O preenchimento e a borda se sobrepõem
- display: inline-blocké um valor especial de display, que fornece um meio-termo entre
- Use-o se não quiser que um item seja quebrado em uma nova linha, mas queira
- No entanto, ele não quebra em uma nova linha e só se tornará maior que seu conteúdo se você adicionar
# [NOT] Planos de fundo e bordas

- Você também pode misturar valores de palavras-chave com comprimentos ou porcentagens; nesse caso
- Também é possível ter múltiplas imagens de fundo
- Outra opção que temos disponível para planos de fundo é especificar como eles rolam quando o conteúdo rola. Isso é controlado usando
- Existem algumas regras que precisam ser seguidas ao escrever valores abreviados de imagens de fundo
# [NOT] Lidando com diferentes direções de texto

- Os três valores possíveis para a writing-modepropriedade são
- Portanto a dimensão do bloco é sempre a direção
- Esta figura mostra as duas dimensões em modo de escrita vertical
- Se você alterar o modo de escrita das caixas ativando a writing-modepropriedade .boxpara vertical-rl, verá como as propriedades físicas
- Você pode substituir leftpor inline-start
# [NOT] Transbordando conteúdo

- Sempre que possível, o CSS não oculta
- A overflowpropriedade ajuda a gerenciar
- O valor padrão do overflow>
- Para cortar o conteúdo quando ele transborda
- Em vez disso, talvez você queira adicionar barras de rolagem quando o conteúdo transbordar?
- Ao usar os overflow> valores scrolle auto, você cria
- Isso significa que o conteúdo de uma caixa de elemento com esses overflowvalores adquire
- O conteúdo fora dessa caixa de elemento não pode aparecer
- Isso permite o comportamento de rolagem, pois todo o conteúdo
- Métodos de layout modernos (descritos em Layout CSS ) gerenciam
- Em grande parte, eles funcionam sem suposições ou dependências
- A alteração de valores de overflow para ocultar conteúdo ou adicionar barras de rolagem
# [NOT] Valores e unidades CSS

- Cada propriedade usada em CSS tem um
- que descreve que tipo de valores
- Quando você vê o tipo de valor color> como válido para uma determinada propriedade, isso significa
- Um tipo de valor em CSS é uma maneira de definir uma
- Isso significa que se você considerar válido, color> não precisa
- Existem dois tipos de comprimentos usados ​​em CSS
- As seguintes são todas as unidades de comprimento absoluto
- As unidades de comprimento relativo são relativas a outra coisa, talvez o tamanho da
- O benefício de usar unidades relativas é que, com um planejamento cuidadoso, você pode fazer com que
- Algumas das unidades mais úteis para desenvolvimento web estão listadas na tabela abaixo
- em
- ex	
- ch	
- rem	
- lh	
- rlh	
- vw	
- vh	
- vmin	
- vmax	
- vb	
- vi	
- svw, svh
- lvw, lvh
- dvw, dvh
- Para recapitular, a unidade rem significa
- Em muitos casos, uma porcentagem é tratada da mesma forma que um comprimento. O que acontece com as porcentagens é que elas sempre são definidas
- Por exemplo, se você definir um elemento font-sizecomo uma porcentagem, será uma porcentagem do
- Alguns tipos de valor aceitam números, sem nenhuma unidade adicionada a eles. Um exemplo de propriedade que aceita um número sem unidade é
- O sistema de cores padrão disponível em computadores modernos suporta cores de 24 bits, o que permite
- O próximo tipo de valor de cor que você provavelmente encontrará são os códigos hexadecimais. Cada valor hexadecimal consiste em
- O terceiro esquema sobre o qual falaremos aqui é o RGB. Um valor RGB é uma função — rgb()— que recebe três parâmetros que representam os valores dos canais vermelho, verde e azul das cores, da mesma forma que os valores hexadecimais. A diferença com o RGB é que
- Você pode passar um quarto parâmetro para rgb(), que representa o canal alfa da cor, que controla a opacidade. Se você definir esse valor
- definir um canal alfa em uma cor tem uma diferença fundamental em relação ao uso da opacitypropriedade que examinamos anteriormente. Ao usar a opacidade, você torna
- Uma forma alternativa de especificar cores é o modelo de cores HSL. Em vez dos valores de vermelho, verde e azul, a hsl()função aceita
- Em cores HSL, o que e Matiz? Saturação e lumunosidade
- A image> tipo e usado quando? pode ser o que
- O position> tipo de valor representa
- Na position tipo pode usar palavras-chave como
- As funções existem em css como
# [NOT] Dimensionando itens em CSS

- Um arquivo de imagem contém informações de dimensionamento, descritas como seu
- Esse tamanho é determinado pela
- Se você colocar uma imagem em uma página e não alterar sua altura ou largura, seja por meio de atributos na img> tag ou então por CSS, ela será
- Um vazio div>, por outro lado, não tem
- Se você adicionar um div> ao seu HTML sem conteúdo, dê uma borda como fizemos com a imagem, você verá
- Esta é a borda recolhida do elemento — não há
- No nosso exemplo abaixo, essa borda se estende até a largura do contêiner, porque
- Não tem altura (ou tamanho na dimensão do bloco) porque
- Novamente, este é o tamanho intrínseco do elemento — seu tamanho é definido
- Podemos, é claro, dar aos elementos do nosso design um tamanho específico. Quando um tamanho é dado a um elemento
- Devido a esse problema de overflow, fixar a altura dos elementos com comprimentos ou porcentagens é algo que
- De muitas maneiras, as porcentagens atuam como
- Ao usar uma porcentagem, você precisa estar ciente
- No caso de uma caixa dentro de outro contêiner, se você atribuir
- Se lhe dermos uma largura percentual, esta se tornará
- Se você definir marginse paddingcomo uma porcentagem
- Quando você usa margem e preenchimento definidos em porcentagens, o valor é calculado a partir
- Se você alterar os valores vhe vwisso alterará o tamanho da caixa ou da fonte
# [NOT] Imagens, mídia e elementos de formulário

- Isso significa que o CSS não pode afetar o layout interno desses elementos – apenas a sua
- Certos elementos substituídos, como imagens e vídeos, também são descritos
- Se você colocar uma imagem dentro de uma caixa que seja menor ou maior que as dimensões intrínsecas do arquivo de imagem em qualquer direção, ela parecerá
- Por exemplo, em um layout flexível ou de grade, os elementos são esticados por padrão para
- As imagens não serão esticadas e, em vez disso, serão
- Basta ter em mente que os elementos substituídos, quando passam a fazer parte de um grid ou layout flexível, possuem
- No entanto, isso ampliaria a imagem, então provavelmente não é o que você gostaria de fazer
- Os elementos do formulário podem ser
- O módulo Web Forms contém guias detalhados para os aspectos mais complicados de estilizá-los, que não
- Muitos controles de formulário são adicionados à sua página por meio do input> elemento — isso define
- Existem alguns elementos adicionais, como textarea> para entrada
- HTML também contém atributos que permitem aos desenvolvedores web indicar quais
- Se o usuário inserir algo inesperado ou deixar um campo obrigatório em branco
- você deve tomar cuidado ao alterar o estilo dos elementos do formulário para garantir que ainda
- Em alguns navegadores, os elementos do formulário não herdam
- Em todos os navegadores, os elementos do formulário usam diferentes regras
- Para manter a consistência, é uma boa ideia definir
- Além das regras mencionadas acima, você também deve definir overflow: autos textarea> para impedir
- As folhas de estilo de normalização são usadas por muitos desenvolvedores para criar
- Normalmente, eles fazem coisas semelhantes às descritas acima, garantindo
- Eles não são tão importantes como eram antes, pois os navegadores
# (NOT] Depurando CSS
# [NOT] Organizando seu CSS

- Adicionar comentários ao seu CSS ajudará
- mas também o ajudará quando
- Uma boa dica é adicionar também um bloco de comentários entre
- Você não precisa comentar tudo em seu CSS, pois grande parte
- O que você deve comentar são as coisas
- É uma boa ideia ter todos os estilos comuns primeiro
- Isso significa todos os estilos que geralmente serão aplicados, a menos que você
- Nos casos em que você tem estilos muito diferentes para partes distintas do site, você pode querer ter uma folha de estilo que inclua todas as regras globais, bem como algumas folhas de estilo menores que incluam as regras específicas necessárias para essas seções. Você pode vincular várias folhas de estilo a partir de uma página, e as regras normais da cascata se aplicam, com as regras
- Existem diversas ferramentas, que chamamos de pré-processadores e pós-processadores
- O pré-processador mais popular é o Sass
- CSS agora possui propriedades personalizadas nativas , tornando esse recurso cada vez menos importante. No entanto, uma das razões pelas quais você pode usar Sass é poder definir
- Isso significa que se você perceber que usou o tom de azul errado
- Se criássemos uma variável chamada $base-color, como na primeira linha abaixo, poderíamos usá-la através da folha de estilo em qualquer lugar que exigisse aquela cor
- Mencionei acima que uma maneira de organizar CSS é dividir as folhas de estilo em folhas de estilo menores. Ao usar o Sass você pode levar isso para outro nível e ter muitas folhas de estilo muito pequenas — chegando até a ter uma folha de estilo separada para cada componente. Ao usar a funcionalidade incluída no Sass (parciais), todos eles podem ser compilados
- Então, por exemplo, com parcials , você poderia ter vários arquivos de estilo dentro de um diretório, digamos foundation/_code.scss, foundation/_lists.scss, foundation/_footer.scss, foundation/_links.scss, etc. Você poderia então usar a @useregra Sass para carregá-los em outras folhas de estilo
- Se todos os parciais forem carregados em um arquivo de índice, como sugerido acima, você poderá carregar esse diretório inteiro em outra folha de estilo de uma só vez

# <Estilizando-texto>
# [NOT] Texto fundamental e estilo de fonte

- As propriedades CSS usadas para estilizar texto geralmente se enquadram em duas categorias
- fontes seguras da web
- Existe uma maneira de baixar uma fonte personalizada junto com uma página da web, para permitir que você personalize o uso da fonte da maneira que desejar
- CSS define cinco nomes genéricos para fontes
- É uma boa ideia fornecer um nome de fonte genérico adequado no final da pilha para que
- px
- em
- rem
- CSS fornece quatro propriedades comuns para alterar o peso/ênfase visual do texto
- Você pode aplicar sombras ao seu texto usando
# [NOT] Fontes da web

- Primeiro de tudo, você tem um @font-faceconjunto de regras no início do CSS, que especifica

# <Layout>
# (NOT] Layout
# (NOT] Introdução ao layout
# (NOT] Fluxo normal
# (NOT] Caixa flexível
# (NOT] Grades
# (NOT] Flutuadores
# (NOT] Posicionamento
# (NOT] Layout de múltiplas colunas
# (NOT] Design responsivo
# (NOT] Guia para iniciantes em consultas de mídia
# (NOT] Métodos de layout legados
# (NOT] Suporte a navegadores mais antigos
# (NOT] Compreensão fundamental do layout

# <Guides>
# (NOT] Animations
# (NOT] Backgrounds and Borders
# (NOT] Box alignment
# (NOT] Box model
# (NOT] Columns
# (NOT] Conditional rules
# (NOT] CSSOM view
# (NOT] Flexbox
# (NOT] Flow layout
# (NOT] Fonts
# (NOT] Grid
# (NOT] Images
# (NOT] Lists and counters
# (NOT] Logical properties
# (NOT] Media queries
# (NOT] Nesting style rules
# (NOT] Positioning
# (NOT] Scroll snap
# (NOT] Shapes
# (NOT] Text
# (NOT] Transforms
# (NOT] Transitions