# [NOT] Pro Git 1.1 Sobre Controle de Versão
- 
- 
- 
- 
- 
- 
- 
# [NOT] Pro Git 1.3 O Básico do Git

- Em vez disso, o Git pensa em seus dados mais como uma série de
- Com o Git, toda vez que você confirma ou salva o estado do seu projeto, o Git basicamente
- Para ser eficiente, se os arquivos não foram alterados, o Git não
- O Git pensa em seus dados mais como um fluxo de snapshots
- Figura 5. Armazenando dados como instantâneos do projeto ao longo do tempo
- A maioria das operações no Git precisa apenas
- Isso também significa que há muito pouco que você não pode fazer se estiver offline ou fora da VPN
- Tudo no Git é verificado antes de ser
- Isso significa que é impossível alterar
- Essa funcionalidade está incorporada ao Git nos níveis
- Você não pode perder informações em trânsito ou corromper arquivos sem que o Git
- O mecanismo que o Git usa para essa soma de verificação é chamado
- Esta é uma string
- Na verdade, o Git armazena tudo em seu banco de dados
- Quando você executa ações no Git, quase todas elas apenas
- É difícil fazer com que o sistema faça algo que não seja
- Como acontece com qualquer VCS, você pode perder ou bagunçar alterações que ainda não tenha confirmado, mas depois
- O Git tem três estados principais nos quais seus arquivos podem residir
- Modificado significa
- Preparado significa
- Confirmado significa
- Figura 6. Árvore de trabalho, área de teste e diretório Git
- A árvore de trabalho é um
- Esses arquivos são retirados do banco de dados compactado no diretório Git e colocados
- A área de teste é um arquivo, geralmente contido
- Seu nome técnico na linguagem Git é
- O diretório Git é onde o Git armazena
- Esta é a parte mais importante do Git e é o que é copiado quando você
- O fluxo de trabalho básico do Git é mais ou menos assim
- Se uma versão específica de um arquivo estiver no diretório Git, ela será considerada
- Se tiver sido modificado e adicionado à área de teste, ele será
- E se tiver sido alterado desde o check-out, mas não tiver sido preparado, ele será
# [NOT] Pro Git 1.4 A Linha de Comando

- Por um lado, a linha de comando é o único lugar onde você pode executar
# [NOT] Pro Git 1.6 Configuração Inicial do Git

- Você deve fazer essas coisas apenas uma vez em qualquer computador
- Você também pode alterá-los a qualquer momento executando
- O Git vem com uma ferramenta chamada git configque permite
- Essas variáveis ​​podem ser armazenadas em três locais diferentes
- Você pode ver todas as suas configurações e de onde elas vêm usando
- A primeira coisa que você deve fazer ao instalar o Git é definir
- Isso é importante porque cada commit do Git usa
- e elas são inseridas de forma
- Novamente, você precisará fazer isso apenas uma vez se passar
- Se quiser substituir isso por um nome ou endereço de e-mail diferente para projetos específicos, você pode
- Agora que sua identidade está configurada, você pode configurar
- Se não estiver configurado, o Git usará
- Se quiser usar um editor de texto diferente, como o Emacs
- Por padrão, o Git criará um branch chamado master quando você criar
- Se quiser verificar suas definições de configuração, você pode usar
- Você pode ver as chaves mais de uma vez, porque o Git lê
# [NOT] Pro Git 1.7 Pedindo Ajuda

- Se você precisar de ajuda ao usar o Git, existem três maneiras equivalentes de obter ajuda abrangente da página de manual (manpage) para qualquer um dos comandos do Git
- Esses comandos são legais porque você pode acessá-los em qualquer lugar, até mesmo
- Se as páginas de manual e este livro não forem suficientes e você precisar de ajuda pessoal, você pode tentar os canais
- Além disso, se você não precisa da ajuda completa da página de manual, mas apenas precisa de uma rápida atualização sobre as opções disponíveis para um comando Git, você pode solicitar

# <Noções-básicas-de-Git>
# [NOT] 2.1 Obtendo um repositório Git

- Normalmente você obtém um repositório Git de duas maneiras
- git init
- Isso cria um novo subdiretório chamado .gitque contém
- Neste ponto, nada em seu projeto foi rastreado ainda
- Se você deseja começar a controlar a versão dos arquivos existentes (em vez de um diretório vazio), você provavelmente deve começar a rastrear esses arquivos e fazer um commit inicial
- Se você deseja obter uma cópia de um repositório Git existente — por exemplo, um projeto com o qual gostaria de contribuir — o comando necessário
- em vez de obter apenas uma cópia de trabalho, o Git recebe uma cópia
- Cada versão de cada arquivo do histórico do projeto é baixada por padrão quando
- Na verdade, se o disco do servidor for corrompido
- git clone https://github.com/libgit2/libgit2
- git clone https://github.com/libgit2/libgit2 mylibgit
- O Git tem vários protocolos de transferência diferentes que você pode usar
# [NOT] 2.2 Gravando alterações no repositório

- Lembre-se de que cada arquivo em seu diretório de trabalho pode estar em um dos dois estados
- Arquivos rastreados são arquivos
- eles podem ser
- Resumindo, arquivos rastreados são arquivos que o Git
- Arquivos não rastreados são todo o resto
- Quando você clona um repositório pela primeira vez, todos os seus arquivos
- À medida que você edita arquivos, o Git os vê
- À medida que você trabalha, você prepara seletivamente esses arquivos modificados e, em seguida
- Figura 8. O ciclo de vida do status dos seus arquivos
- A principal ferramenta que você usa para determinar quais arquivos estão em qual estado
- Se você executar este comando diretamente após um clone
- $ git status
- hum arquivo não rastreado, ou eles seriam listados aqui. Por fim, o comando informa em qual ramificação você está e informa que ela não divergiu da mesma ramificação no servidor
- Não rastreado basicamente significa
- O Git não começará a incluí-lo em seus instantâneos de commit até que você diga
- Isso é feito para que você não comece acidentalmente a incluir
- Para começar a rastrear um novo arquivo, você usa o comando
- git add README
- Changes not staged for commit
- As regras para os padrões que você pode colocar no .gitignorearquivo são as seguintes
- git diff
- git diff --staged
- git diff --cached
- Lembre-se de que qualquer coisa que ainda não esteja preparada
- $ git commit
- Você pode ver que a mensagem de commit padrão contém a última saída do git statuscomando comentada e uma linha vazia no topo. Você pode remover esses comentários
- Cada vez que você executa um commit, você está
- Para remover um arquivo do Git
- git rm
- Outra coisa útil que você pode querer fazer é manter o arquivo na sua árvore de trabalho, mas removê-lo da sua área de teste. Em outras palavras
- Ao contrário de muitos outros VCSs, o Git não rastreia explicitamente a movimentação de arquivos. Se você renomear um arquivo no Git
- git mv
- O Git descobre que é uma renomeação implicitamente, então não importa se você renomeia um arquivo dessa forma ou com o mvcomando
# [NOT] 2.3 Visualizando o histórico de commits

- git log
- git clone
# [NOT] 2.4 Desfazendo coisas

- Se você quiser refazer esse commit, faça as alterações adicionais que você esqueceu, prepare-as e faça o commit novamente usando
- Este comando pega sua área de teste e a utiliza para o commit. Se você não fez nenhuma alteração desde seu último commit (por exemplo, você executou este comando imediatamente após seu commit anterior), então seu snapshot
- O mesmo editor de mensagem de commit é iniciado, mas já contém
- Você pode editar a mensagem como sempre, mas ela substituirá
- Você acaba com um único commit — o segundo commit
- Por exemplo, digamos que você alterou dois arquivos e deseja confirmá-los como duas alterações separadas, mas acidentalmente digitou git add *e preparou ambos. Como você pode desestabilizar um dos dois?
- git reset HEAD file>
- É verdade que git resetpode ser um comando perigoso, especialmente
- Lembre-se de que tudo o que é confirmado no Git quase sempre pode ser recuperado. Mesmo commits que estavam
- No entanto, tudo o que você perde e que nunca foi cometido provavelmente
- A partir da versão 2.23.0 do Git, o Git usará git restore
- É importante entender que esse git restore <file>é um comando perigoso. Todas as alterações locais feitas
# [NOT] 2.5 Trabalhando com controles remotos

- Colaborar com outras pessoas envolve gerenciar
- Gerenciar repositórios remotos inclui
- A palavra “remoto” não implica necessariamente que o repositório esteja em algum outro lugar da rede ou da Internet, apenas que
- Para ver quais servidores remotos você configurou, você pode executar
- Se você clonou seu repositório, você deveria pelo menos ver origin
- git remote -v
- git fetch pb
- Se sua ramificação atual estiver configurada para rastrear uma ramificação remota (consulte a próxima seção e Ramificação do Git para obter mais informações), você poderá usar o git pullcomando para
- Este pode ser um fluxo de trabalho mais fácil ou mais confortável para você; e por padrão, o git clonecomando configura
- A execução git pullgeralmente busca dados
- git push remote> branch>
- git remote show origin
- git remote rename pb paul
- git remote remove paul
# [NOT] 2.6 Marcação

- git tag
- git tag -l "v1.8.5*"
- git tag -a v1.4 -m "my version 1.4"
- Para criar uma tag leve, não forneça
- git push origin v1.5
- git push origin --tags
- git tag -d v1.4-lw
- Existem duas variações comuns para excluir uma tag de um servidor remoto
- Se você quiser ver as versões dos arquivos para os quais uma tag está apontando, você pode fazer uma verificação
- git checkout
- embora isso coloque seu repositório no estado “HEAD desanexado”, o que tem alguns efeitos colaterais prejudiciais
- No estado “detached HEAD”, se você fizer alterações e depois criar um commit, a tag permanecerá a mesma, mas seu novo commit
- exceto pelo hash
- Assim, se você precisar fazer alterações — digamos que esteja corrigindo um bug em uma versão mais antiga, por exemplo — você geralmente desejará
# [NOT] 2.7 Aliases do Git

- aliases
- Se não quiser digitar o texto inteiro de cada um dos comandos do Git, você pode configurar facilmente um alias
- git config --global alias.co checkout

# <Git-Branching>
# [NOT] 3.1 Branches in a Nutshell

- Ramificar significa que você diverge
- Ao contrário de muitos outros VCSs, o Git incentiva fluxos de trabalho que se ramificam e se mesclam com frequência, até mesmo várias vezes ao dia
- Figura 9. Um commit e sua árvore
- Figura 10. Commits e seus pais
- Uma ramificação no Git é simplesmente
- O nome do branch padrão no Git
- À medida que você começa a fazer commits
- Cada vez que você confirma, o masterponteiro do branch
- O branch “master” no Git
- A única razão pela qual quase todos os repositórios possuem um é que o git init
- Figura 11. Uma ramificação e seu histórico de commits
- O que acontece quando você cria um novo branch?
- git branch testing
- Figura 12. Duas ramificações apontando para a mesma série de commits
- Como o Git sabe em qual branch você está atualmente?
- Figura 13. HEAD apontando para um galho
- git checkout testing
- Figura 14. HEAD aponta para a ramificação atual
- Figura 15. A ramificação HEAD avança quando um commit é feito
- git checkout master
- Figura 16. HEAD se move quando você finaliza a compra
- É importante observar que quando você troca de ramificação no Git, os arquivos em seu diretório de trabalho serão alterados. Se você mudar para um branch mais antigo
- Ambas as alterações são isoladas em ramificações separadas
- Figura 17. História divergente
# 3.2 Basic Branching and Merging
# 3.3 Branch Management
# 3.4 Branching Workflows
# 3.5 Remote Branches
# 3.6 Rebasing
# 3.7 Summary