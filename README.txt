_______
en_US

Discontinued, but there are some usefull stuff you can find on the source:
On the applet code:
- File "Drag and drop" support on linux and windows
- Context menu option installer for windows file explorer and Ubuntu nautilus
- File post code without using any libraries, making the applet smaller
- File download implementation, also without libraries
- Sha1 for files

Site made using wicket
uses JGit to create a new repository and commit files
Maven generates a war with an applet inside
__

A subtitles site with the following aims:
- Anyone can edit any subtitle file
- Anyone can download any subtitle by the easiest way possible
- Anyone can make a copy of all subtitles and run their own version of libresubs

The more technical aims

- Subtitles are refered by it's corresponding video file sha1, so there's no way to download a wrong file
- All edits to a file are logged with git, this way, all git commands are available from the web interface
- A rich javascript based srt editor
- Drag and drop video on browser to download subtitle

Feel free to use libreSubs. If you want to contribute see this issue list https://github.com/beothorn/libreSubs/issues
______________________
pt_BR

Descontinuado, mas com várias coisas úteis implementadas no código como:
Applet:
- Drag and drop de arquivos que funciona em linux e windows
- Instalador de comando no menu de contexto do windows explorer/Nautilus
- Post de arquivo sem depender do apache utils! Applet que faz upload fica bem menor.
- Implementação de get pra arquivo sem dependências.
- Calcula sha1
Wicket:
- Implementação
JGit:
- Cria, adiciona, commita
Maven:
- Gera war com applet
Outros:
Engine organiza arquivos em pastas dependendo do sha1
__

Um site de legendas com os seguintes objetivos:
- Qualquer pessoa pode editar qualquer legenda
- Qualquer pessoa pode fazer download de qualquer legenda da maneira mais fácil e rápida possível
- Qualquer pessoa pode fazer uma cópia de todas as legendas e criar sua própria versão do libresubs

Objetivos mais técnicos:

- Legendas são associadas ao sha1 do seu arquivo de vídeo correspondente, assim não há como pegar o arquivo errado
- Todas as edições de legendas são logadas usando git, assim todos os comandos do git estão disponíveis no site
- Um editor de arquivos srt escrito em javascript para rodar no browser
- Carregar arquivos de video no browser para pegar as legendas

Sinta-se à vontade para usar o libresubs. Se você estiver interessado em contribuir, aqui tem uma lista de coisas que o libresubs precisa https://github.com/beothorn/libreSubs/issues
