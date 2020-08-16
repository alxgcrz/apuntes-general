# Git

## Comandos

Abrir el navegador con información sobre un comando: `git command --help`

### Configuración

#### Mostrar la cofiguración actual

```sh
git config --list
```

#### Mostrar la configuración local

```sh
git config --local --list
```

#### Mostrar la configuración global

```sh
git config --global --list
```

#### Mostrar la configuración del sistema

```sh
git config --system --list
```

#### Establecer un nombre de usuario identificable de forma global

```sh
git config --global user.name "Your name"
```

#### Establecer una dirección de correo identificable de forma global

```sh
git config --global user.email "your_mail@mail.com"
```

#### Establecer coloreado automático de la línea de comandos de Git para una fácil revisión

```sh
git config --global color.ui auto
```

#### Establecer el editor global para commits

```sh
git config --global core.editor vi
git config --global core.editor "code --wait"
```

### Archivos de Configuración

#### Archivo de configuración específico del repositorio [--local]

```sh
<repo>/.git/config
```

#### Archivo de configuración específico del usuario [--global]

```sh
~/.gitconfig
```

#### Archivo de configuración del sistema [--system]

```sh
/etc/gitconfig
```

### Crear

#### Clonar un repositorio existente

Existen dos maneras:

Vía SSH:

```sh
git clone ssh://usuario@dominio.com/repo.git
```

Vía HTTP:

```sh
git clone http://dominio.com/usuario/repo.git
```

#### Crea un nuevo repositorio local

```sh
git init
```

#### Realizar un _clone_ de forma local desde la carpeta del proyecto a otra carpeta

```sh
git clone . /folder/to/the/project
```

### Cambios Locales

#### Cambios en el directorio de trabajo

```sh
git status
```

#### Cambios en archivos rastreados

```sh
git diff
```

#### Agregar todos los cambios actuales al siguiente commit

```sh
git add .
```

#### Agregar algunos cambios de &lt;archivo&gt; para el siguiente commit

```sh
git add -p <archivo>
```

#### Realizar un commit de todos los cambios locales en los archivos rastreados

```sh
git commit -a
```

#### Realizar un commit de los cambios previamente almacenados en el área de pruebas (stage area)

```sh
git commit
```

#### Realizar un commit con un mensaje

```sh
git commit -m 'Aquí el mensaje'
```

#### Realizar un commit saltándose el área de pruebas y agregando un mensaje

```sh
git commit -am 'aquí el mensaje'
```

#### Realizar un commit a alguna fecha anterior

```sh
git commit --date="`date --date='n day ago'`" -am "Mensaje del commit"
```

#### Cambiar último commit

**NOTA**: ¡No modificar commits ya publicados!

```sh
git commit -a --amend
```

#### Cambiar fecha del último commit

```sh
GIT_COMMITTER_DATE="date" git commit --amend
```

#### Cambiar fecha del autor del último commit

```sh
git commit --amend --date="date"
```

#### Mover cambios no confirmados (uncommitted changes) de la rama actual a otra rama

```sh
git stash
git checkout branch2
git stash pop
```

#### Restaurar cambios del área de pruebas (stage area) a la rama actual

```sh
git stash apply
```

#### Eliminar la última serie de cambios del área de pruebas (stage area)

```sh
git stash drop
```

### Buscar

#### Un texto en todos los archivos del directorio

```sh
git grep "Hola"
```

#### Un texto en cualquier versión

```sh
git grep "Hola" v2.5
```

### Historial de Commits

#### Mostrar todos los commits, empezando por los más recientes (se mostrará el hash, información sobre el autor, fecha y título del commit)

```sh
git log
```

#### Mostrar todos los commits (sólo se mostrará el hash y el mensaje del commit)

```sh
git log --oneline
```

#### Mostrar todos los commits de un usuario específico

```sh
git log --author="usuario"
```

#### Mostrar los cambios a través del tiempo de un archivo específico

```sh
git log -p <archivo>
```

#### Mostrar commmits que están presentes sólamente en remote/branch al lado derecho

```sh
git log --oneline <origin/master>..<remote/master> --left-right
```

#### Quién cambió, qué y cuándo en 'archivo'

```sh
git blame <archivo>
```

#### Mostrar reference log

```sh
git reflog show
```

#### Borrar reference log

```sh
git reflog delete
```

#### Mostrar el SHA1 del último commit de cada ref

```sh
git ls-remote <repo>
```

### Ramas & Etiquetas

#### Listar todas las ramas locales

```sh
git branch
```

#### Listar todas las ramas remotas

```sh
git branch -r
```

#### Listar todas las ramas locales y remotas

```sh
git branch -a
```

#### Listar sólo las ramas remotas y el commit

```sh
git branch -rv
```

#### Cambiar rama HEAD

```sh
git checkout <rama>
```

#### Crear nueva rama y cambiar a esta

```sh
git checkout -b <rama>
```

#### Crear nueva rama basada en la rama HEAD actual

```sh
git branch <nueva-rama>
```

#### Crear nueva rama de seguimiento basada en una rama remota

```sh
git branch --track <nueva-rama> <repositorio>/<rama-remota>
```

#### Eliminar una rama local

```sh
git branch -d <rama>
```

#### Forzar eliminación de una rama local

**NOTA**: ¡Se perderán los cambios sin fusionar!

```sh
git branch -D <branch>
```

#### Borrar rama remota

```sh
git push [remote] :[branch]
```

#### Marcar el commit actual con una etiqueta

```sh
git tag <tag-name>
```

#### Marcar el commit actual con una etiqueta que incluye un mensaje

```sh
git tag -a <etiqueta>
```

#### Borrar la etiqueta local '12345'

```sh
git tag -d 12345
```

#### Borrar la etiqueta remota '12345' (eg, GitHub version too)

```sh
git push origin :refs/tags/12345
```

Otra forma:

```sh
git push --delete origin tagName
```

### Actualizar & Publicar

#### Listar todos los repositorios remotos configurados actuales

```sh
git remote -v
```

#### Mostrar información sobre un remoto

```sh
git remote show <remoto>
```

#### Agregar un nuevo repositorio, nombrado 'remoto'

```sh
git remote add <remoto> <url>
```

#### Descargar todos los cambios de &lt;remoto&gt;, pero no integrarlos al HEAD

```sh
git fetch <remoto>
```

#### Descargar cambios y fusionarlos/integrarlos directamente al HEAD

```sh
git remote pull <remote> <url>
```

#### Obtener todos los cambios del HEAD al repositorio local

```sh
git pull origin master
```

#### Obtener todos los cambios del HEAD al repositorio local sin fusionar

```sh
git pull --rebase <remote> <branch>
```

#### Publicar cambios locales en un remoto

```sh
git push remote <remoto> <rama>
```

#### Eliminar una rama en el remoto

```sh
git push <remoto> :<rama> (desde Git v1.5.0)  
git push <remoto> --delete <rama> (desde Git v1.7.0)
```

#### Publicar tus etiquetas

```sh
git push --tags
```

### Fusionar y _Rebase_

#### Fusionar "rama" en tu HEAD actual

```sh
git merge <rama>
```

#### Hacer un _rebase_ de tu actual HEAD sobre "rama"

**NOTA**: ¡No hacer _rebase_ de commits ya publicados!

```sh
git rebase <rama>
```

#### Aborta un _rebase_

```sh
git rebase --abort
```

#### Continuar un _rebase_ después de resolver conflictos

```sh
git rebase --continue
```

#### Usar tu herramienta de fusión configurada para resolver conflictos

```sh
git mergetool
```

#### Usar tu editor para manualmente resolver conflictos y (después de resueltos) marcar el archivo como resuelto

```sh
git add <archivo-resuelto>
```

```sh
git rm <archivo-resuelto>
```

#### Aplastando commits (squashing)

```sh
git rebase -i <commit-just-before-first>
```

Ahora reemplazando esto,

```sh
pick <commit_id>
pick <commit_id2>
pick <commit_id3>
```

con esto,

```sh
pick <commit_id>
squash <commit_id2>
squash <commit_id3>
```

### Deshacer

#### Descartar todos los cambios locales en tu directorio de trabajo

```sh
git reset --hard HEAD
```

#### Sacar todos los archivos del área de pruebas (es decir, deshacer el último `git add`)

```sh
git reset HEAD
```

#### Descartar cambios locales de un archivo específico

```sh
git checkout HEAD <archivo>
```

### Desechar todos los cambios de los archivos

```sh
git checkout .
```

#### Revertir un commit (produciendo un nuevo commit con los cambios contrarios)

```sh
git revert <commit>
```

#### Reestablecer tu puntero HEAD a un commit anterior y descartar todos los cambios desde entonces

```sh
git reset --hard <commit>
```

#### Volver al índice de un commit (HEAD@{index})

```sh
git reset HEAD@{index}
```

#### Reestablecer tu puntero HEAD al estado actual de una rama remota

```sh
git reset --hard <remote/branch> es decir, upstream/master, origin/my-feature
```

#### Reestablecer tu puntero HEAD a un commit anterior y preservar todos los cambios en el área de pruebas (stage area)

```sh
git reset <commit>
```

#### Reestablecer tu puntero HEAD a un commit anterior y preservar los cambios locales sin confirmar (uncommitted changes)

```sh
git reset --keep <commit>
```

#### Remover los archivos que fueron accidentalmente agregados al commit antes de ser añadidos al fichero '.gitignore'

```sh
git rm -r --cached .
git add .
git commit -m "remove xyz file"
```

## Tips

### Nuevo repositorio

* git init
* git add --all
* git commit -m "First Commit"
* git tag -a v1.0.0 -m "Message"
* git remote add origin git@bitbucket.org:usuario/repositorio.git
* git push -u origin master
* git clone ssh://usuario@servidor:/folder/to/project/myProject.git
* git push [remote] --all
* git push [remote] --tags

### Actualizar un 'fork'

Mantener el 'fork' de un proyecto actualizado con los cambios del autor original:

1. Clone your fork: `git clone git@github.com:YOUR-USERNAME/YOUR-FORKED-REPO.git`
1. Add remote from original repository in your forked repository:

```git
cd into/cloned/fork-repo
remote add upstream git://github.com/ORIGINAL-DEV-USERNAME/REPO-YOU-FORKED-FROM.git
git fetch upstream
```

1. Updating your fork from original repo to keep up with their changes: `git pull upstream master`

### Cambiar commits

Cambiar la dirección de correo de todos los commits de un repositorio:

```bash
git filter-branch -f --env-filter '
    if test "$GIT_AUTHOR_EMAIL" != "your_email@mail.com"
    then
        GIT_AUTHOR_EMAIL=your_email@mail.com
    fi
    if test "$GIT_COMMITTER_EMAIL" != "your_email@mail.com"
    then
        GIT_COMMITTER_EMAIL=your_email@mail.com
    fi
' -- --all
```

### Git Large File Storage (LFS)

<https://git-lfs.github.com/>

1. `git lfs install` - You only need to run this once per user account
1. `git lfs track "*.psd"`
1. `git add .gitattributes` - Now make sure _.gitattributes_ is tracked
1. `git add file.psd`
1. `git commit -m "Add design file"`
1. `git push origin master`

### Mensaje de Commit - 'Udacity'

A commit messages consists of three distinct parts separated by a blank line:

```terminal
type: subject with 50 characters or less

body is optional and it has 72 characters per line -->

footer is optional
```

The first line is the subject. This should be a short description of what changed. Nothing like “fixed it” or “did something,” these need to be clear and informative, and try to avoid profanity. The subject should be 50 characters or less, with the first letter capitalized, and end without a period.

The type is contained within the title and can be one of these types:

* *feat*: a new feature
* *fix*: a bug fix
* *docs*: changes to documentation
* *style*: formatting, missing semi colons, etc; no code change
* *refactor*: refactoring production code
* *test*: adding tests, refactoring test; no production code change
* *trivial*: updating build tasks, package manager configs, etc; no production code change

The body is next, this is where you give a more detailed description of why you made the change. The body should typically have around 72 characters per line. This is to ensure that the message fits into a terminal window when using git on the command line. You’ll also need to make sure there is a blank line between the subject line and the body. You can also add bullet points, using asterisks or dashes, when you need to make a list. Use the body to explain the what and why of a commit, not the how.

Some commits don’t require a body in the message. If you fix a typo for example, it’s okay to only have a subject line.

You can also include a footer, typically this will be used to indicate which issues or bugs the commit addresses.

**Example**:

```terminal
feat: Summarize changes in around 50 characters or less

More detailed explanatory text, if necessary. Wrap it to about 72
characters or so. In some contexts, the first line is treated as the
subject of the commit and the rest of the text as the body. The
blank line separating the summary from the body is critical (unless
you omit the body entirely); various tools like `log`, `shortlog`
and `rebase` can get confused if you run the two together.

Explain the problem that this commit is solving. Focus on why you
are making this change as opposed to how (the code explains that).
Are there side effects or other unintuitive consequences of this
change? Here's the place to explain them.

Further paragraphs come after blank lines.

 - Bullet points are okay, too

 - Typically a hyphen or asterisk is used for the bullet, preceded
   by a single space, with blank lines in between, but conventions
   vary here

If you use an issue tracker, put references to them at the bottom,
like this:

Resolves: #123
See also: #456, #789
```

## Referencia

<https://git-scm.com/docs>
<https://git-scm.com/book/en/v2> | <https://git-scm.com/book/es/v2>
<https://services.github.com/on-demand/downloads/github-git-cheat-sheet.pdf>
<http://ndpsoftware.com/git-cheatsheet.html>
<http://ohshitgit.com>
<https://github.com/arslanbilal/git-cheat-sheet/blob/master/other-sheets/git-cheat-sheet-es.md>
<https://github.com/git-tips/tips>
<https://codewords.recurse.com/issues/two/git-from-the-inside-out>
