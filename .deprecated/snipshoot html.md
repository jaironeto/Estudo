{
"lib": {
  "scope": "html, javascript",
  "prefix": ".html",
  "body": [
    "```",
    "> **HTML element reference**",
    "",
    "> **Main root**",
    "",
    "**<html&#62;** Representa a raiz (elemento de nível superior) de um documento HTML, por isso também é chamado de elemento raiz. Todos os outros elementos devem ser descendentes deste elemento.			"
    "",
    
    "> **Document metadata**",
    "",
    "Os metadados contêm informações sobre a página. Isso inclui informações sobre estilos, scripts e dados para ajudar o software ( mecanismos de busca , navegadores , etc.) a usar e renderizar a página. Os metadados para estilos e scripts podem ser definidos na página ou vinculados a outro arquivo que contenha as informações.\n",
    "**<base&#62;**	Especifica o URL base a ser usado para todos os URLs relativos em um documento. Só pode haver um desses elementos em um documento.\n",
    "**<head&#62;**	Contém informações legíveis por máquina (metadados) sobre o documento, como título , scripts e folhas de estilo .\n",
    "**<link&#62;**	Especifica relacionamentos entre o documento atual e um recurso externo. Este elemento é mais comumente usado para vincular ao CSS, mas também é usado para estabelecer ícones de sites (tanto ícones no estilo 'favicon' quanto ícones para a tela inicial e aplicativos em dispositivos móveis), entre outras coisas.\n",
    "**<meta&#62;**	Representa metadados que não podem ser representados por outros elementos relacionados a meta HTML, como <base&#62, , e .<link&#62<script&#62<style&#62<title&#62\n",
    "**<style&#62;**	Contém informações de estilo de um documento ou parte de um documento. Contém CSS, que é aplicado ao conteúdo do documento que contém este elemento.\n",
    "**<title&#62;**	Define o título do documento que é mostrado na barra de título do navegador ou na aba de uma página. Contém apenas texto; tags dentro do elemento são ignoradas.\n",
    "",

    "> **Sectioning root**\n",
    "**<body&#62;** representa o conteúdo de um documento HTML. Só pode haver um desses elementos em um documento."
    "",

    "> **Content sectioning**\n",
    "Os elementos de seccionamento de conteúdo permitem organizar o conteúdo do documento em partes lógicas. Use os elementos de seção para criar um esboço amplo do conteúdo da sua página, incluindo navegação de cabeçalho e rodapé, e elementos de título para identificar seções de conteúdo.\n",

    "**<address&#62;**	Indica que o HTML incluído fornece informações de contato de uma pessoa ou pessoas ou de uma organização.\n",
    "**<article&#62;**	Representa uma composição independente em um documento, página, aplicativo ou site, que se destina a ser distribuível ou reutilizável de forma independente (por exemplo, em distribuição). Os exemplos incluem uma postagem em um fórum, um artigo de revista ou jornal, uma entrada de blog, um cartão de produto, um comentário enviado por um usuário, um widget ou gadget interativo ou qualquer outro item de conteúdo independente.\n",
    "**<aside&#62;**	Representa uma parte de um documento cujo conteúdo está relacionado apenas indiretamente ao conteúdo principal do documento. Os apartes são frequentemente apresentados como barras laterais ou caixas explicativas.\n",
    "**<footer&#62;**	Representa um rodapé para seu conteúdo de seccionamento ancestral mais próximo ou elemento raiz de seccionamento . Normalmente <footer>contém informações sobre o autor da seção, dados de direitos autorais ou links para documentos relacionados.\n",
    "**<header&#62;**	Representa conteúdo introdutório, normalmente um grupo de auxílios introdutórios ou de navegação. Pode conter alguns elementos de título, mas também um logotipo, um formulário de pesquisa, o nome do autor e outros elementos.\n",
    "**<h1&#62;**, **<h2&#62;**, **<h3&#62;**, **<h4&#62;**, **<h5&#62;**, **<h6&#62;**	Representa seis níveis de títulos de seção. <h1>é o nível de seção mais alto e <h6>é o mais baixo.\n",
    "**<hgroup&#62;**	Representa um título agrupado com qualquer conteúdo secundário, como subtítulos, um título alternativo ou um slogan.\n",
    "**<main&#62;**	Representa o conteúdo dominante do corpo de um documento. A área de conteúdo principal consiste em conteúdo diretamente elacionado ou que se expande ao tópico central de um documento ou à funcionalidade central de um aplicativo.\n",
    "**<nav&#62;**	Representa uma seção de uma página cuja finalidade é fornecer links de navegação, seja dentro do documento atual ou para outros documentos. Exemplos comuns de seções de navegação são menus, índices e índices.\n",
    "**<section&#62;**	Representa uma seção genérica autônoma de um documento, que não possui um elemento semântico mais específico para representá-la. As seções devem sempre ter um título, com poucas exceções.\n",
    "**<search&#62;**	Representa uma parte que contém um conjunto de controles de formulário ou outro conteúdo relacionado à execução de uma operação de pesquisa ou filtragem.\n",

    "> **Conteúdo de texto**\n",
    "Use elementos de conteúdo de texto HTML para organizar blocos ou seções de conteúdo colocados entre as tags de abertura <body&#62; e fechamento </body&#62;. Importantes para acessibilidade e SEO , esses elementos identificam a finalidade ou estrutura daquele conteúdo.\n",
    "**<blockquote&#62;** Indica que o texto incluído é uma citação estendida. Normalmente, isso é renderizado visualmente por recuo. Uma URL para a fonte da citação pode ser fornecida usando o citeatributo, enquanto uma representação de texto da fonte pode ser fornecida usando o <cite elemento.    \n",
    "**<dd&#62;** Fornece a descrição, definição ou valor do termo anterior ( <dt) em uma lista de descrições ( <dl).    \n",
    "**<div&#62;** O contêiner genérico para conteúdo de fluxo. Ele não tem efeito no conteúdo ou no layout até que seja estilizado de alguma forma usando CSS (por exemplo, o estilo é aplicado diretamente a ele ou algum tipo de modelo de layout como flexbox é aplicado ao seu elemento pai).    \n",
    "**<dl&#62;** Representa uma lista de descrição. O elemento inclui uma lista de grupos de termos (especificados usando o <dt elemento) e descrições (fornecidas pelos <dd elementos). Os usos comuns deste elemento são implementar um glossário ou exibir metadados (uma lista de pares de valores-chave).    \n",
    "**<dt&#62;** Especifica um termo em uma lista de descrição ou definição e, como tal, deve ser usado dentro de um <dl elemento. Geralmente é seguido por um <dd elemento; entretanto, vários <dt>elementos em uma linha indicam vários termos que são todos definidos pelo próximo <dd elemento imediato.    \n",
    "**<figcaption&#62;** Representa uma legenda ou legenda que descreve o restante do conteúdo de seu <figure elemento pai.    \n",
    "**<figure&#62;** Representa conteúdo independente, potencialmente com uma legenda opcional, que é especificada usando o <figcaption elemento. A figura, sua legenda e seu conteúdo são referenciados como uma única unidade.    \n",
    "**<hr&#62;** Representa uma ruptura temática entre elementos de nível de parágrafo: por exemplo, uma mudança de cenário em uma história ou uma mudança de tópico dentro de uma seção.    \n",
    "**<li&#62;** Representa um item em uma lista. Deve estar contido em um elemento pai: uma lista ordenada ( <ol), uma lista não ordenada ( <ul) ou um menu ( <menu). Em menus e listas não ordenadas, os itens da lista geralmente são exibidos com marcadores. Em listas ordenadas, elas geralmente são exibidas com um contador ascendente à esquerda, como um número ou uma letra.    \n",
    "**<menu&#62;** Uma alternativa semântica para <ul, mas tratada pelos navegadores (e exposta através da árvore de acessibilidade) como não diferente de <ul. Representa uma lista não ordenada de itens (que são representados por <li elementos). \n",
    "**<ol&#62;** Representa uma lista ordenada de itens — normalmente renderizada como uma lista numerada.    \n",
    "**<p&#62;** Representa um parágrafo. Os parágrafos são geralmente representados em mídia visual como blocos de texto separados de blocos adjacentes por linhas em branco e/ou recuo de primeira linha, mas os parágrafos HTML podem ser qualquer agrupamento estrutural de conteúdo relacionado, como imagens ou campos de formulário.    \n",
    "**<pre&#62;** Representa texto pré-formatado que deve ser apresentado exatamente como está escrito no arquivo HTML. O texto normalmente é renderizado usando uma fonte não proporcional ou monoespaçada . O espaço em branco dentro deste elemento é exibido conforme está escrito.    \n",
    "**<ul&#62;** Representa uma lista não ordenada de itens, normalmente renderizada como uma lista com marcadores.    \n",

    "> **Semântica de texto embutido**\n",
    "Use a semântica de texto embutido HTML para definir o significado, a estrutura ou o estilo de uma palavra, linha ou qualquer trecho arbitrário de texto.\n",
    "**<a&#62;** Juntamente com seu hrefatributo, cria um hiperlink para páginas da web, arquivos, endereços de e-mail, locais na página atual ou qualquer outra coisa que uma URL possa endereçar.    \n",
    "**<abbr&#62;** Representa uma abreviatura ou sigla.    \n",
    "**<b&#62;** Usado para chamar a atenção do leitor para o conteúdo do elemento, que de outra forma não teria importância especial. Anteriormente, isso era conhecido como elemento Negrito, e a maioria dos navegadores ainda desenha o texto em negrito. No entanto, você não deve usar <b>para estilizar texto ou atribuir importância. Se desejar criar texto em negrito, você deve usar a font-weightpropriedade CSS. Se desejar indicar que um elemento é de especial importância, você deve usar o elemento forte.    \n",
    "**<bdi&#62;** Diz ao algoritmo bidirecional do navegador para tratar o texto que ele contém isoladamente do texto ao seu redor. É particularmente útil quando um site insere algum texto dinamicamente e não conhece a direcionalidade do texto que está sendo inserido.    \n",
    "**<bdo&#62;** Substitui a direcionalidade atual do texto, para que o texto interno seja renderizado em uma direção diferente.    \n",
    "**<br&#62;** Produz uma quebra de linha no texto (retorno de carro). É útil para escrever um poema ou um discurso, onde a divisão dos versos é significativa.    \n",
    "**<cite&#62;** Usado para marcar o título de um trabalho criativo citado. A referência pode ser abreviada de acordo com convenções apropriadas ao contexto relacionadas aos metadados de citação.    \n",
    "**<code&#62;** Exibe seu conteúdo com um estilo que indica que o texto é um pequeno fragmento de código de computador. Por padrão, o texto do conteúdo é exibido usando a fonte monoespaçada padrão do agente do usuário.    \n",
    "**<data&#62;** Vincula um determinado conteúdo a uma tradução legível por máquina. Se o conteúdo estiver relacionado a hora ou data, o <time elemento deverá ser usado.    \n",
    "**<dfn&#62;** Usado para indicar o termo que está sendo definido no contexto de uma frase ou sentença de definição. O <p elemento ancestral, o par <dt/ <dd, ou o ancestral da seção mais próxima do <dfn elemento, é considerado a definição do termo.    \n",
    "**<em&#62;** Marca o texto com ênfase em ênfase. O <em elemento pode ser aninhado, com cada nível de aninhamento indicando um maior grau de ênfase.    \n",
    "**<i&#62;** Representa uma faixa de texto que se diferencia do texto normal por algum motivo, como texto idiomático, termos técnicos e designações taxonômicas, entre outros. Historicamente, estes têm sido apresentados em itálico, que é a fonte original da <i nomenclatura deste elemento.    \n",
    "**<kbd&#62;** Representa uma extensão de texto embutido que denota entrada textual do usuário a partir de um teclado, entrada de voz ou qualquer outro dispositivo de entrada de texto. Por convenção, o agente do usuário usa como padrão a renderização do conteúdo de um <kbd elemento usando sua fonte monoespaçada padrão, embora isso não seja obrigatório pelo padrão HTML.    \n",
    "**<mark&#62;** Representa o texto marcado ou destacado para fins de referência ou notação devido à relevância da passagem marcada no contexto envolvente.    \n",
    "**<q&#62;** Indica que o texto incluído é uma pequena citação embutida. A maioria dos navegadores modernos implementa isso colocando o texto entre aspas. Este elemento destina-se a citações curtas que não requerem quebras de parágrafo; para citações longas use o <blockquote elemento.    \n",
    "**<rp&#62;** Usado para fornecer parênteses substitutos para navegadores que não suportam a exibição de anotações Ruby usando o <ruby elemento. Um <rp elemento deve incluir cada um dos parênteses de abertura e fechamento que envolvem o <rt>elemento que contém o texto da anotação.    \n",
    "**<rt&#62;** Especifica o componente de texto Ruby de uma anotação Ruby, que é usado para fornecer informações de pronúncia, tradução ou transliteração para tipografia do Leste Asiático. O <rt elemento deve sempre estar contido dentro de um <ruby elemento.    \n",
    "**<ruby&#62;** Representa pequenas anotações renderizadas acima, abaixo ou próximo ao texto base, geralmente usadas para mostrar a pronúncia de caracteres do Leste Asiático. Também pode ser usado para anotar outros tipos de texto, mas esse uso é menos comum.    \n",
    "**<s&#62;** Renderiza o texto com um tachado ou uma linha atravessando-o. Use o <s elemento para representar coisas que não são mais relevantes ou que não são mais precisas. Entretanto, <s não é apropriado ao indicar edições em documentos; para isso, utilize os elementos del e ins, conforme apropriado.    \n",
    "**<samp&#62;** Usado para incluir texto embutido que representa uma amostra (ou citada) de saída de um programa de computador. Seu conteúdo normalmente é renderizado usando a fonte monoespaçada padrão do navegador (como Courier ou Lucida Console).    \n",
    "**<small&#62;** Representa comentários laterais e letras pequenas, como direitos autorais e texto jurídico, independente de seu estilo de apresentação. Por padrão, ele renderiza o texto dentro dele com um tamanho de fonte menor, como de smallaté x-small.    \n",
    "**<span&#62;** Um contêiner embutido genérico para expressar conteúdo, que não representa nada inerentemente. Ele pode ser usado para agrupar elementos para fins de estilo (usando os atributos classou id) ou porque eles compartilham valores de atributos, como lang. Deve ser usado somente quando nenhum outro elemento semântico for apropriado. <span é muito parecido com um elemento div, mas div é um elemento de nível de bloco , enquanto a <span é um elemento de nível embutido .    \n",
    "**<strong&#62;** Indica que seu conteúdo tem forte importância, seriedade ou urgência. Os navegadores normalmente renderizam o conteúdo em negrito.    \n",
    "**<sub&#62;** Especifica o texto embutido que deve ser exibido como subscrito apenas por motivos tipográficos. Os subscritos normalmente são renderizados com uma linha de base reduzida usando texto menor.    \n",
    "**<sup&#62;** Especifica o texto embutido que deve ser exibido como sobrescrito apenas por motivos tipográficos. Os sobrescritos geralmente são renderizados com uma linha de base elevada usando texto menor.    \n",
    "**<time&#62;** Representa um período específico no tempo. Pode incluir o datetimeatributo para traduzir datas em formato legível por máquina, permitindo melhores resultados em mecanismos de pesquisa ou recursos personalizados, como lembretes.    \n",
    "**<u&#62;** Representa uma extensão de texto embutido que deve ser renderizado de uma forma que indique que possui uma anotação não textual. Isso é renderizado por padrão como um sublinhado sólido simples, mas pode ser alterado usando CSS.    \n",
    "**<var&#62;** Representa o nome de uma variável em uma expressão matemática ou em um contexto de programação. Normalmente é apresentado usando uma versão em itálico da fonte atual, embora esse comportamento dependa do navegador.    \n",
    "**<wbr&#62;** Representa uma oportunidade de quebra de palavra – uma posição dentro do texto onde o navegador pode opcionalmente quebrar uma linha, embora suas regras de quebra de linha não criem uma quebra nesse local.    \n",

    "> **Imagem e multimídia**\n"
    "HTML oferece suporte a vários recursos multimídia, como imagens, áudio e vídeo.\n",
    "**<area&#62;** Define uma área dentro de um mapa de imagem que possui áreas clicáveis ​​predefinidas. Um mapa de imagem permite que áreas geométricas de uma imagem sejam associadas a um hiperlink .    \n",
    "**<audio&#62;** Usado para incorporar conteúdo sonoro em documentos. Pode conter uma ou mais fontes de áudio, representadas pelo srcatributo ou pelo elemento fonte: o navegador escolherá a mais adequada. Também pode ser o destino de mídia transmitida, usando um arquivo MediaStream.    \n",
    "**<img&#62;** Incorpora uma imagem no documento.    \n",
    "**<map&#62;** Usado com <area elementos para definir um mapa de imagem (uma área de link clicável).    \n",
    "**<track&#62;** Usado como filho dos elementos de mídia, áudio e vídeo. Ele permite especificar faixas de texto cronometradas (ou dados baseados em tempo), por exemplo, para lidar automaticamente com legendas. As faixas são formatadas no formato WebVTT ( .vttarquivos)—Web Video Text Tracks.    \n",
    "**<video&#62;** Incorpora um reprodutor de mídia que suporta reprodução de vídeo no documento. Você também pode usar <video conteúdo de áudio, mas o elemento de áudio pode fornecer uma experiência de usuário mais apropriada.    \n",

    "> **Conteúdo incorporado**\n"
    "Além do conteúdo multimídia normal, o HTML pode incluir uma variedade de outros conteúdos, mesmo que nem sempre seja fácil interagir com eles.\n"
    "**<embed&#62;** Incorpora conteúdo externo no ponto especificado do documento. Este conteúdo é fornecido por um aplicativo externo ou outra fonte de conteúdo interativo, como um plug-in de navegador.    \n",
    "**<iframe&#62;** Representa um contexto de navegação aninhado, incorporando outra página HTML na página atual.    \n",
    "**<object&#62;** Representa um recurso externo, que pode ser tratado como uma imagem, um contexto de navegação aninhado ou um recurso a ser tratado por um plugin.    \n",
    "**<picture&#62;** Contém zero ou mais <source elementos e um <img elemento para oferecer versões alternativas de uma imagem para diferentes cenários de exibição/dispositivo.    \n",
    "**<portal&#62;** Permite a incorporação de outra página HTML na atual para permitir uma navegação mais suave em novas páginas.    \n",
    "**<source&#62;** Especifica vários recursos de mídia para a imagem, o elemento de áudio ou o elemento de vídeo. É um elemento void, o que significa que não possui conteúdo e não possui tag de fechamento. É comumente usado para oferecer o mesmo conteúdo de mídia em vários formatos de arquivo, a fim de fornecer compatibilidade com uma ampla variedade de navegadores, devido ao seu suporte diferenciado para formatos de arquivo de imagem e formatos de arquivo de mídia .    \n",

    "> **SVG e MathML**\n"
    "Você pode incorporar conteúdo SVG e MathML<svg&#62; diretamente em documentos HTML, usando os elementos e <math&#62;.\n"
    "**<svg&#62;** Contêiner definindo um novo sistema de coordenadas e viewport . É usado como o elemento mais externo de documentos SVG, mas também pode ser usado para incorporar um fragmento SVG dentro de um documento SVG ou HTML.    \n",
    "**<math&#62;** O elemento de nível superior em MathML. Cada instância válida do MathML deve ser encapsulada nele. Além disso, você não deve aninhar um segundo <math elemento em outro, mas pode ter um número arbitrário de outros elementos filhos nele.    \n",

    "> **Scripts**\n"
    "Para criar conteúdo dinâmico e aplicativos da Web, o HTML suporta o uso de linguagens de script, principalmente JavaScript. Certos elementos suportam esta capacidade.\n",
    "**<canvas&#62;** Elemento de contêiner a ser usado com a API de script de tela ou com a API WebGL para desenhar gráficos e animações.    \n",
    "**<noscript&#62;** Define uma seção de HTML a ser inserida se um tipo de script na página não for suportado ou se o script estiver desativado no navegador.    \n",
    "**<script&#62;** Usado para incorporar código ou dados executáveis; normalmente é usado para incorporar ou referir-se ao código JavaScript. O <script elemento também pode ser usado com outras linguagens, como a linguagem de programação de shader GLSL do WebGL e JSON .    \n",

    "> **Demarcando edições**\n"
    "Esses elementos permitem fornecer indicações de que partes específicas do texto foram alteradas.\n"
    "**<del&#62;** Representa um intervalo de texto que foi excluído de um documento. Isso pode ser usado ao renderizar 'controlar alterações' ou informações de comparação de código-fonte, por exemplo. O <ins elemento pode ser utilizado com a finalidade oposta: indicar o texto que foi adicionado ao documento.    \n",
    "**<ins&#62;** Representa um intervalo de texto que foi adicionado a um documento. Você pode usar o <del elemento para representar de forma semelhante um intervalo de texto que foi excluído do documento.    \n",

    "> **Conteúdo da tabela**\n"
    "Os elementos aqui são usados para criar e manipular dados tabulares.\n"
    "**<caption&#62;** Especifica a legenda (ou título) de uma tabela.    \n",
    "**<col&#62;** Define uma coluna dentro de uma tabela e é usada para definir a semântica comum em todas as células comuns. Geralmente é encontrado dentro de um <colgroup elemento.    \n",
    "**<colgroup&#62;** Define um grupo de colunas dentro de uma tabela.    \n",
    "**<table&#62;** Representa dados tabulares — ou seja, informações apresentadas em uma tabela bidimensional composta por linhas e colunas de células contendo dados.    \n",
    "**<tbody&#62;** Encapsula um conjunto de linhas da tabela ( <tr elementos), indicando que elas compõem o corpo da tabela ( <table).    \n",
    "**<td&#62;** Define uma célula de uma tabela que contém dados. Participa do modelo de tabela .    \n",
    "**<tfoot&#62;** Define um conjunto de linhas que resumem as colunas da tabela.    \n",
    "**<th&#62;** Define uma célula como o cabeçalho de um grupo de células da tabela. A natureza exata deste grupo é definida pelos atributos scopee headers.    \n",
    "**<thead&#62;** Define um conjunto de linhas definindo o cabeçalho das colunas da tabela.    \n",
    "**<tr&#62;** Define uma linha de células em uma tabela. As células da linha podem então ser estabelecidas usando uma combinação de elementos <td (célula de dados) e <th (célula de cabeçalho).    \n",

    "> **Formulários**\n",
    "O HTML fornece diversos elmentos que podem ser usados ​​em conjunto para criar formulários que o usuário pode preencher e enviar ao site ou aplicativo. Mais informações sobre isso estão disponíveis no guia de formulários HTML.\n",
    "**<button&#62;** Um elemento interativo ativado por um usuário com mouse, teclado, dedo, comando de voz ou outra tecnologia assistiva. Uma vez ativado, ele executa uma ação, como enviar um formulário ou abrir uma caixa de diálogo.    \n",
    "**<datalist&#62;** Contém um conjunto de <option elementos que representam as opções permitidas ou recomendadas disponíveis para escolha em outros controles.    \n",
    "**<fieldset&#62;** Usado para agrupar vários controles, bem como rótulos ( <label) dentro de um formulário web.    \n",
    "**<form&#62;** Representa uma seção do documento que contém controles interativos para envio de informações.    \n",
    "**<input&#62;** Usado para criar controles interativos para formulários baseados na web para aceitar dados do usuário; uma ampla variedade de tipos de dados de entrada e widgets de controle estão disponíveis, dependendo do dispositivo e do agente do usuário. O <input elemento é um dos mais poderosos e complexos de todo HTML devido ao grande número de combinações de tipos de entrada e atributos.    \n",
    "**<label&#62;** Representa uma legenda para um item em uma interface do usuário.    \n",
    "**<legend&#62;** Representa uma legenda para o conteúdo de seu pai <fieldset.    \n",
    "**<meter&#62;** Representa um valor escalar dentro de um intervalo conhecido ou um valor fracionário.    \n",
    "**<optgroup&#62;** Cria um agrupamento de opções dentro de um <select elemento.    \n",
    "**<option&#62;** Usado para definir um item contido em um select, um <optgroup ou um <datalist elemento. Como tal, <option pode representar itens de menu em pop-ups e outras listas de itens em um documento HTML.    \n",
    "**<output&#62;** Elemento de contêiner no qual um site ou aplicativo pode injetar os resultados de um cálculo ou de uma ação do usuário.    \n",
    "**<progress&#62;** Exibe um indicador que mostra o progresso da conclusão de uma tarefa, normalmente exibido como uma barra de progresso.    \n",
    "**<select&#62;** Representa um controle que fornece um menu de opções.    \n",
    "**<textarea&#62;** Representa um controle de edição de texto simples de várias linhas, útil quando você deseja permitir que os usuários insiram uma quantidade considerável de texto de formato livre, por exemplo, um comentário em um formulário de revisão ou feedback.    \n",

    "> **Elementos interativos**\n"
    "HTML oferece uma seleção de elementos que ajudam a criar objetos de interface de usuário interativos.\n"
    "**<details&#62;** Cria um widget de divulgação no qual as informações ficam visíveis somente quando o widget é alternado para um estado 'aberto'. Um resumo ou rótulo deve ser fornecido usando o <summary elemento.    \n",
    "**<dialog&#62;** Representa uma caixa de diálogo ou outro componente interativo, como um alerta dispensável, um inspetor ou uma subjanela.    \n",
    "**<summary&#62;** Especifica um resumo, legenda ou legenda para a caixa de divulgação de um elemento de detalhes. Clicar no <summary elemento alterna o estado do <details elemento pai aberto e fechado.    \n",

    "> **Componentes da Web**\n"
    "Web Components é uma tecnologia relacionada ao HTML que permite, essencialmente, criar e usar elementos customizados como se fosse HTML normal. Além disso, você pode criar versões personalizadas de elementos HTML padrão.\n"
    "**<slot&#62;** Parte do conjunto de tecnologia Web Components , esse elemento é um espaço reservado dentro de um componente web que você pode preencher com sua própria marcação, o que permite criar árvores DOM separadas e apresentá-las juntas.    \n",
    "**<template&#62;** Um mecanismo para armazenar HTML que não deve ser renderizado imediatamente quando uma página é carregada, mas pode ser instanciado posteriormente durante o tempo de execução usando JavaScript.    \n",
    "```",
        ],
  "description": ""
},
}