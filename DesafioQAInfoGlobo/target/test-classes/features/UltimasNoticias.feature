#language: pt
Funcionalidade: Ler últimas notícias

  Esquema do Cenário: Deve ter acesso às últimas notícias conforme seleção
    Dado que estou acessando a funcionalidade
    Quando seleciono na combo "<editoria>"
    E seleciono "<tipo>"
    Então visualizo a página com determinado conteúdo

Exemplos:
    | editoria 						| tipo 								 |
    | Todas as Editorias  | Todos 							 |
    | Todas as Editorias  | Coluna 							 |
    | Todas as Editorias  | Fotogaleria 				 |
    | Todas as Editorias  | Infográfico 				 |
    | Todas as Editorias  | Lista de Fatos 			 |
    | Todas as Editorias  | Matéria 						 |
    | Todas as Editorias  | Matéria em Capítulos |
    | Todas as Editorias  | Plantão              |
    | Todas as Editorias  | Vídeo                |
    | Todas as Editorias  | Votação              |
    | Rio  								| Todos 							 |
    | Brasil 							| Todos 							 |
    | Mundo  							| Todos 							 |
    | Economia  				  | Todos 							 |
    | Sociedade  					| Todos 							 |
    | Tecnologia  				| Todos 							 |
    | Ciência  						| Todos 							 |
    | Cultura  						| Todos 							 |
    | Rio Show  					| Todos 							 |
    | Ela  								| Todos 							 |
    | Gastronomia  				| Todos 							 |
    | Saber Viver  				| Todos 							 |
    | Esportes  					| Todos 							 |
    | Boa Viagem 					| Todos 							 |
    | Rio       					| Coluna 							 |