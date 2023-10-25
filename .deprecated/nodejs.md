

# EXPRESS

## <Material-Complementar>
## Tecnologias complementares

- Middleware de Terceiros: https://expressjs.com/pt-br/resources/middleware.html

## <Introdução>
## [NOT] Instalação

- npm init
- O req (solicitação) e res (resposta) são os mesmos
- Execute o aplicativo com o seguinte comando
## [NOT] Hello world

- npm init
- O req (solicitação) e res (resposta) são os mesmos
- Execute o aplicativo com o seguinte comando
## [NOT] Roteamento Básico

- O Roteamento refere-se à determinação de como um aplicativo
- Cada rota pode ter uma ou mais
- A definição de rotas aceita a seguinte estrutura
- app
- METHOD
- PATH
- HANDLER
## [NOT] Arquivos Estáticos

- Para entregar arquivos estáticos como imagens, arquivos CSS, e arquivos JavaScript
- Passe o nome do diretório que contém os ativos estáticos para a função de middleware
- O Express consulta os arquivos em relação ao diretório estático, para que o nome do diretório estático não faça parte da URL
- Para usar vários diretórios de ativos estáticos, chame a função de middleware
- O Express consulta os arquivos na ordem
- Para criar um prefixo de caminho virtual (onde o caminho não existe realmente no sistema de arquivos) para arquivos que são entregues pela função express.static
- Entretanto, o caminho fornecido para a função express.static é relativa ao diretório
- Se você executar o aplicativo express a partir de outro diretório
## (NOT] Perguntas mais frequentes

## <Guia>
## [NOT] Roteamento

- O Roteamento refere-se à definição de
- e como eles respondem
- Um método de roteamento é derivado a partir
- O Express suporta os seguintes métodos de roteamento que correspondem aos métodos HTTP
- Para métodos de rota que são traduzidos para nomes de variáveis inválidas no Javascript, use
- Este método é usado para carregar funções de middleware em um caminho para todos os métodos de solicitação
- Caminhos de rota, em combinação com os métodos de solicitação, definem
- Caminhos de rota podem ser
- O Express usa o path-to-regexp para verificar a correspondência
- O Express Route Tester
- Sequências de consulta não
- Os caracteres ?, +, *, e () são
- O hífen (-) e o ponto (.) são interpretados
- É possível fornecer várias funções de retorno de chamada que se comportam como middleware
- A única exceção é que estes retornos de chamada podem
- É possível usar este mecanismo para impor pré-condições em uma rota, e em seguida
- Manipuladores de rota podem estar na forma
- Uma única função de retorno de chamada pode
- Uma matriz de funções de retorno de chamada podem
- Uma combinação de funções independentes e matrizes de funções
- Os métodos do objeto de resposta (res) na seguinte tabela podem enviar uma resposta ao cliente, e finalizar o ciclo solicitação-resposta
- Se nenhum destes métodos forem chamados a partir de um manipulador de rota
- É possível criar manipuladores de rota encadeáveis para um caminho de rota usando o app.route()
- Como o caminho é especificado em uma localização única, criar rotas modulares é útil, já que reduz
- Aqui está um exemplo de manipuladores de rotas encadeáveis que são
- Use a classe express.Router para criar
- Uma instância de Router é um middleware e sistema de roteamento completo
- O seguinte exemplo cria um roteador como um módulo
## [NOT] Escrevendo o middleware

- Funções de Middleware são funções que tem acesso
- A próxima função middleware é comumente denotada
- Funções de middleware podem executar as seguintes tarefas
- Se a atual função de middleware não terminar o ciclo de solicitação-resposta, ela precisa
- Caso contrário, a solicitação ficará suspensa
- A função next() não faz parte do Node.js ou da API Express, mas é o terceiro argumento
- A função next() poderia ter qualquer
- Para carregar a função de middleware, chame
- especificando a função
- A ordem de carregamento do middleware é importante: funções de middleware que são carregadas
- A função de middleware myLogger simplesmente imprime uma mensagem, e em seguida passa a solicitação
- Além disso, a função de retorno de chamada do caminho raiz usa a propriedade que a função de middleware inclui no req (o objeto da solicitação)
- Como você tem acesso ao objeto da solicitação, ao objeto de resposta, à próxima função de middleware na pilha, e à API completa do Node.js, as possibilidades com as funções de middleware são ilimitadas
## [NOT] Usando o middleware

- O Express é uma estrutura web de roteamento e middlewares que tem uma funcionalidade mínima por si só
- Um aplicativo Express pode usar os seguintes tipos de middleware
- É possível carregar middlewares de nível de roteador e de nível do aplicativo com um caminho
- É possível também carregar uma série de funções de middleware juntas, o que cria
- Vincule middlewares de nível do aplicativo a uma instância do objeto app usando
- onde METHOD é o método HTTP da solicitação
- A função é executada sempre que o aplicativo receber uma solicitação
- Manipuladores de rota permitem a você definir várias rotas
- A segunda rota não irá causar nenhum problema, mas ela nunca será chamada pois a primeira rota termina o ciclo solicitação-resposta
- Para pular o restante das funções de middleware de uma pilha de middlewares do roteador, chame
- Middlewares de nível de roteador funcionam da mesma forma que os middlewares de nível do aplicativo, mas estão
- Carregue os middlewares de nível de roteador usando as funções
- Middlewares de manipulação de erros sempre levam
- Você deve fornecer quatro argumentos para identificá-lo como uma função
- Mesmo se você não precisar usar o objeto next, você deve especificá-lo
- Caso contrário, o objeto next será interpretado como
- Defina funções de middleware de manipulação de erros da mesma forma que outras funções de middleware, exceto
- A única função de middleware integrada no Express
- Esta função é baseada no serve-static, e é responsável
- O argumento root especifica
- Use middlewares de terceiros para incluir funcionalidades aos aplicativos do Express
- Instale o módulo Node.js para a funcionalidade requerida, em seguida carregue-a no seu aplicativo no nível do aplicativo ou no nível de roteador
## [NOT] Usando o mecanismo de modelo

- Antes do Express poder renderizar arquivos de modelo, as seguintes configurações do aplicativo devem ser configuradas
- Em seguida instale o pacote npm correspondente ao mecanismo de modelo
- Mecanismos de modelo compatíveis com o Express como o Pug exportam
- que é chamada pela função res.render() para
- Alguns mecanismos de modelo não seguem esta convenção. A biblioteca Consolidate.js
- Após o mecanismo de visualização estar configurado, você não precisa
- o Express carrega
- Crie um arquivo de modelo do Pug chamado
- Em seguida crie uma rota para renderizar o arquivo index.pug. Se a propriedade view engine não estiver configurada, é preciso
- Ao fazer uma solicitação à página inicial
## [NOT] Manipulação de erros

- Defina funções de middleware de manipulação de erros da mesma forma
- Você define os middlewares de manipulação de erros por último, após
- Repostas de dentro de uma função de middleware podem estar em qualquer formato que preferir, como uma
- Para propósitos organizacionais (e estrutura de alto nível), é possível definir
- Se passar qualquer coisa para a função next() (exceto a sequência de caracteres 'route'), o Express considera a solicitação atual
- Se desejar manipular este erro de alguma forma, você terá que criar
- Se você tiver um manipulador de rota com as funções de retorno de chamada é possível usar
- Chamadas para next() e next(err) indicam que o manipulador atual
- O Express vem com um manipulador de erros integrado, que cuida de qualquer erro
- Essa função de middleware de manipulação de erros padrão é incluída
- se você passar um erro para o next() e você não manipulá-lo com um manipulador de erros, ele irá
- O rastreio de pilha não será incluído
- Se você chamar o next() com um erro após ter inicializado escrevendo a resposta (por exemplo, se encontrar um erro enquanto passa a resposta ao cliente) o manipulador de erros
- Portanto ao incluir um manipulador de erro customizado, você desejará delegar
## [NOT] Depuração

- O Roteamento refere-se à definição de
- e como eles respondem
- Um método de roteamento é derivado a partir
- O Express suporta os seguintes métodos de roteamento que correspondem aos métodos HTTP
- Para métodos de rota que são traduzidos para nomes de variáveis inválidas no Javascript, use
- Este método é usado para carregar funções de middleware em um caminho para todos os métodos de solicitação
Caminhos de rota, em combinação com os métodos de solicitação, definem
- Caminhos de rota podem ser
- O Express usa o path-to-regexp para verificar a correspondência
- O Express Route Tester
- Sequências de consulta não
- Os caracteres ?, +, *, e () são
- O hífen (-) e o ponto (.) são interpretados
- É possível fornecer várias funções de retorno de chamada que se comportam como middleware
- A única exceção é que estes retornos de chamada podem
- É possível usar este mecanismo para impor pré-condições em uma rota, e em seguida
- Manipuladores de rota podem estar na forma
- Uma única função de retorno de chamada pode
- Mais de uma função de retorno de chamada pode
- Uma matriz de funções de retorno de chamada podem
- Uma combinação de funções independentes e matrizes de funções
- Os métodos do objeto de resposta (res) na seguinte tabela podem enviar uma resposta ao cliente, e finalizar o ciclo solicitação-resposta
- É possível criar manipuladores de rota encadeáveis para um caminho de rota usando o app.route()
- Como o caminho é especificado em uma localização única, criar rotas modulares é útil, já que reduz
- Aqui está um exemplo de manipuladores de rotas encadeáveis que são
- Use a classe express.Router para criar
- Uma instância de Router é um middleware e sistema de roteamento completo
- O seguinte exemplo cria um roteador como um módulo
## [NOT] Express atrás de proxies

- Ao executar um aplicativo do Express atrás de um proxy, configure
- Apesar de a execução do aplicativo não falhar se a variável do aplicativo trust proxy não estiver configurada, ele irá registrar
- Booleano
- Endereços IP
- Número
- Função
- Configurando um valor não-false para o trust proxy resulta em três mudanças importantes
- A configuração do trust proxy é implementada usando o pacote proxy-addr
## (NOT] Migrando para o Express 4
## (NOT] Migrando para o Express 5
## (NOT] Integração de Banco de dados

# SEQUELIZE
# REACT

## <GET-STARTED-COMEÇO-RAPIDO>
## Tutorial: Tic-Tac-Toe
## Thinking in React

## <GET-STARTED-COMEÇO-INSTALAÇÃO>
## Comece um novo projeto React
## Adicionar React a um projeto existente
## Configuração do editor
## Usando TypeScript
## Ferramentas de desenvolvedor React

## <LEARN-REACT-DESCREVENDO-A-UI>
## [NOT] Descrevendo a IU

- React é uma biblioteca JavaScript
- A interface do usuário é construída
- O React permite combiná-los
- De sites a aplicativos de telefone
- Os aplicativos React são construídos a partir
- Um componente React
- Os componentes podem
- Você pode declarar muitos componentes em um arquivo
- Cada componente do React
- JSX permite
- Às vezes, você desejará adicionar um pouco de lógica JavaScript
- Os componentes do React usam props
- Props podem lembrá-lo de atributos HTML
- seus componentes
- Freqüentemente, você desejará exibir vários componentes
- Para cada item da matriz, você precisará
- Algumas funções JavaScript são puras. Uma função pura
- Ao escrever estritamente apenas seus componentes como funções puras
## [NOT] Seu primeiro componente

- Componentes são um dos conceitos centrais do React. Eles são a base sobre a qual
- React permite combinar marcação, CSS e JavaScript em
- O código do índice que você viu acima pode ser transformado em um TableOfContents />componente
- Você pode até iniciar seu projeto
- Tradicionalmente, ao criar páginas da Web, os desenvolvedores da Web marcavam seu conteúdo e, em seguida, adicionavam interação adicionando um pouco de JavaScript. Isso funcionou muito bem quando a interação era algo bom de se ter na web. Agora é esperado para muitos sites e todos os aplicativos. O React coloca a interatividade em primeiro lugar enquanto ainda usa a mesma tecnologia: um componente React é uma função JavaScript que você pode polvilhar com marcação . Aqui está o que parece (você pode editar o exemplo abaixo): App.js
- Os componentes do React são funções regulares do JavaScript, mas
- O componente retorna uma img />tag com atributos srce alt. img />é escrito como HTML
- Mas se sua marcação
- Observe a diferença na caixa
- section> é minúsculo, então o React
- Profile /> começa com uma maiúscula P, então o React
- Os componentes são funções regulares do JavaScript, portanto, você pode
- Isso é conveniente quando
- Se esse arquivo ficar lotado
- Como os Profilecomponentes são renderizados internamente Gallery— até várias vezes!
- Os componentes podem renderizar
- O trecho acima é muito lento e causa bugs. Em vez disso
- Quando um componente filho precisa de alguns dados de um pai
- Em um aplicativo React
- As declarações de retorno
## [NOT] Importando e Exportando Componentes

- A mágica dos componentes reside em sua capacidade de reutilização: você pode
- Mas à medida que você aninha mais e mais componentes, geralmente faz sentido
- Isso permite que você mantenha
- Isso os tornará mais modulares e reutilizáveis ​​em outros arquivos. Você pode mover um componente em três etapas
- Você pode encontrar arquivos que não possuem a .jsextensão do arquivo
- Um arquivo pode ter apenas uma exportação padrão, mas pode ter
- Para reduzir a confusão potencial entre exportações padrão e nomeadas, algumas equipes optam por manter apenas um estilo (padrão ou nomeado) ou evitar misturá-los em um único arquivo
## [NOT] Escrevendo marcação com JSX

- JSX é uma extensão de sintaxe para JavaScript que permite escrever marcações
- Embora existam outras maneiras de escrever componentes, a maioria dos desenvolvedores React prefere
- Mas à medida que a Web se tornava mais interativa, a lógica determinava cada vez mais o conteúdo. O JavaScript ficou a cargo do HTML! É por isso que no React
- Manter a lógica de renderização e a marcação de um botão juntas garante que eles permaneçam sincronizados entre si em todas as edições. Por outro lado, os detalhes não relacionados, como a marcação do botão e a marcação da barra lateral, são isolados uns dos outros, tornando mais seguro alterar qualquer um deles por conta própria
- JSX e React são duas coisas separadas. Eles costumam ser usados ​​juntos, mas você pode
- JSX é uma extensão de sintaxe, enquanto React
- Isso ocorre porque o JSX é mais rígido e possui algumas regras a mais que o HTML! Se você ler as mensagens de erro acima, elas o guiarão para corrigir a marcação ou você poderá seguir o guia abaixo
- Para retornar vários elementos de um componente, envolva-os
- Se você não deseja adicionar um extra div> à sua marcação, pode escrever
- Essa tag vazia é chamada de Fragmento. Os fragmentos permitem
- O JSX exige que as tags sejam
- tags de fechamento automático como img> devem
- e tags de empacotamento como li> orangesdevem
- JSX se transforma em JavaScript e atributos escritos em JSX se tornam
- É por isso que, no React, muitos atributos HTML e SVG são escritos em camelCase. Por exemplo, em vez de stroke-widthvocê usar strokeWidth. Como classé uma palavra reservada, em React você escreve className, nomeada após a propriedade DOM correspondente
- Os componentes do React agrupam
- JSX é semelhante ao HTML, com algumas
- As mensagens de erro geralmente indicam
## [NOT] JavaScript em JSX com chaves

- O JSX permite que você escreva marcações semelhantes a HTML dentro de um arquivo JavaScript, mantendo
- Às vezes, você desejará adicionar um pouco de lógica JavaScript ou fazer referência a uma propriedade dinâmica dentro dessa marcação. Nesta situação, você pode
- Quando você deseja passar um atributo de string para o JSX, coloque-o
- Mas e se você quiser especificar dinamicamente o texto srcou alt? Você pode
- JSX é uma maneira especial de escrever JavaScript. Isso significa que é possível usar JavaScript dentro
- Qualquer expressão JavaScript funcionará entre chaves, incluindo
- Você só pode usar chaves de duas maneiras dentro do JSX
- Além de strings, números e outras expressões JavaScript, você pode até mesmo passar objetos em JSX. Os objetos também são indicados
- Portanto, para passar um objeto JS em JSX
- Você pode ver isso com estilos CSS embutidos no JSX. O React não exige que você use estilos embutidos (classes CSS funcionam muito bem na maioria dos casos). Mas quando você precisa de um estilo embutido, você passa
- Os atributos JSX entre aspas são passados ​​como
- As chaves permitem
- {{e }}não é uma sintaxe especial: é um
## [NOT] Passando acessórios para um componente

- Os componentes do React usam props para
- Props podem lembrá-lo de atributos HTML, mas você pode passar
- Cada componente pai pode
- Props são as informações que você
- Os props que você pode passar para uma img> tag são
- Mas você pode passar
- Se as chaves duplas depois person=confundirem você, lembre-se de que elas são apenas
- Você pode ler esses props listando seus
- Isso permite usá-los dentro
- Adicione alguma lógica para Avatarusar os props persone sizepara renderização e pronto
- Os adereços permitem que você pense nos componentes pai e filho de forma independente. Por exemplo, você pode alterar o personou os sizeadereços internos Profilesem ter que pensar em como Avatarusá-los. Da mesma forma, você pode alterar como o Avatarusa esses adereços, sem olhar para o arquivo Profile
- Você pode pensar em adereços como “botões” que você pode ajustar. Eles têm o mesmo papel que os argumentos servem para as funções — na verdade, props são o único
- Normalmente você não precisa de todo o propsobjeto em si, então você
- Não perca o par de {e }cachos dentro
- Esta sintaxe é chamada de “desestruturação” e equivale
- Se você quiser dar a um prop um valor padrão para retornar quando nenhum valor for especificado, você pode fazer isso com
- O valor padrão é usado apenas se o sizeprop estiver ausente ou se você passar
- Mas se você passar
- Não há nada de errado com código repetitivo - ele pode ser mais legível. Mas às vezes você pode valorizar a concisão. Alguns componentes encaminham todos os seus adereços para seus filhos, como isso Profileacontece com Avatar. Como eles não usam nenhum de seus props diretamente, pode fazer sentido usar uma sintaxe de “spread” mais concisa
- Quando você aninha o conteúdo dentro de uma tag JSX, o componente pai receberá
- Este exemplo ilustra que um componente pode receber props
- Os adereços nem sempre são estáticos! Aqui, o timeadereço muda a cada segundo, e o coloradereço muda quando você seleciona outra cor. Os adereços refletem os dados
- No entanto, props são imutáveis ​​— um termo da ciência da computação que significa “inalterável”. Quando um componente precisa mudar seus props (por exemplo, em resposta a uma interação do usuário ou novos dados), ele terá que
- Para passar props, adicione-os
- Para ler props, use
- Você pode encaminhar todos os props com
- JSX aninhado como Card>Avatar />/Card>aparecerá como prop Carddo componente children
- Props são instantâneos somente
- Você não pode mudar adereços. Quando você precisar de interatividade, precisará
## [NOT] Renderização Condicional

- Seus componentes frequentemente precisarão exibir coisas diferentes, dependendo de diferentes condições. No React, você pode renderizar JSX condicionalmente usando
- Em algumas situações, você não vai querer renderizar nada. Por exemplo, digamos que você não queira mostrar nenhum item embalado. Um componente deve retornar algo. Nesse caso, você pode
- Se isPackedfor verdadeiro, o componente não retornará nada, null. Caso contrário, retornará
- Na prática, retornar nullde um componente não é comum porque pode surpreender um desenvolvedor tentando renderizá-lo. Mais frequentemente, você incluiria ou excluiria condicionalmente o componente no JSX do componente pai
- Mas se a condição for false, toda a expressão se torna false. React considera false como
- Para testar a condição, o JavaScript converte o lado esquerdo em booleano automaticamente. No entanto, se o lado esquerdo for 0, toda a expressão obterá
- No React, você controla a lógica de ramificação com
- Você pode retornar uma expressão JSX
- Você pode salvar condicionalmente algum JSX em uma variável e, em seguida
## [NOT] Renderizando listas

- As funções de seta retornam implicitamente a expressão logo após =>, então você não precisava
- No entanto, você deve escrever returnexplicitamente se => for
- As chaves informam ao React a qual item do array
- Isso se torna importante se os itens do seu array
- Diferentes fontes de dados fornecem diferentes fontes de chaves
- Dados de um banco de dados
- Dados gerados localmente
- As chaves devem ser exclusivas entre irmãos
- As chaves não devem mudar
- Você pode ficar tentado a usar o índice de um item no array como sua chave. Na verdade, é isso que o React usará se você
- Mas a ordem na qual você renderiza os itens mudará com o tempo se um item for inserido, excluído ou se o array for reordenado. O índice como chave geralmente
- Da mesma forma, não gere chaves dinamicamente, por exemplo, com key={Math.random()}. Isso fará com que as chaves
- Isso não é apenas lento, mas também perderá qualquer
## [NOT] Mantendo os Componentes Puros

- Algumas funções JavaScript são puras. Funções puras realizam
- Ao escrever seus componentes estritamente apenas como funções puras, você pode evitar
- Na ciência da computação (e especialmente no mundo da programação funcional), uma função pura é uma função com as seguintes características
- O React foi projetado em torno desse conceito. O React assume que cada componente que você escreve
- Isso significa que os componentes React que você escreve devem sempre retornar
- Os componentes devem retornar apenas seu JSX e não alterar nenhum
- Este componente está lendo e escrevendo uma guestvariável declarada fora dele. Isso significa que chamar esse componente várias vezes produzirá JSX diferentes
- Em geral, você não deve esperar que seus componentes sejam renderizados em uma ordem específica. Não importa se você chama y = 2 x antes ou depois de y = 5 x : ambas as fórmulas serão resolvidas
- A renderização é como um exame escolar: cada componente deve
- No entanto, não há problema em alterar variáveis ​​e objetos que você acabou de criar durante a renderização
- Isso é chamado de “mutação local” – é como se fosse o segredinho do seu componente
- Embora a programação funcional dependa muito da pureza, em algum momento, em algum lugar, algo terá que mudar. Esse é o objetivo da programação! Essas alterações – atualização da tela, início de uma animação, alteração dos dados – são chamadas de efeitos colaterais. São coisas que acontecem “lateralmente” , não durante a renderização
- No React, os efeitos colaterais geralmente pertencem
- Manipuladores de eventos são funções que o React executa quando
- Mesmo que os manipuladores de eventos sejam definidos dentro do seu componente, eles não são executados durante
- Se você esgotou todas as outras opções e não consegue encontrar o manipulador de eventos correto para o seu efeito colateral, ainda pode anexá-lo ao JSX retornado com uma useEffectchamada no seu componente. Isso diz ao React para executá-lo mais tarde, após a renderização, quando


## <Adicionando-Interatividade>
## Respondendo a eventos
## Estado: memória de um componente
## Renderizar e confirmar
## Estado como um instantâneo
## Enfileirando uma série de atualizações de estado
## Atualizando objetos no estado
## Atualizando matrizes no estado
# ELECTRON