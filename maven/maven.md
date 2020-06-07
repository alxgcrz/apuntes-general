# Maven

## Sintaxis

La sintaxis de Maven: `mvn [options] [<goal(s)>] [<phase(s)>]`

### Crear un proyecto Maven

**NOTA**: Si usamos una terminal PowerShell hay que usar las comillas dobles en los parámetros.

- Crear un proyecto Java(jar): `mvn archetype:generate "-DgroupId=org.yourcompany.project" "-DartifactId=application" "-Dversion=1.0-SNAPSHOT"`
- Crear un proyecto Java(jar) en modo interactivo: `mvn archetype:generate`

#### Maven Archetypes

Maven tiene definidos una serie de [_archetypes_](https://maven.apache.org/archetypes/index.html) para generar proyectos de distinta índole con una estructura de ficheros concreta.

Podemos ejecutar el comando de forma completa indicando toda la información necesaria para que Maven genere el proyecto o de forma interactiva para que Maven solicite la información directamente en la consola:

- Crear un proyecto web(war): `mvn archetype:generate "-DgroupId=org.yourcompany.project" "-DartifactId=application" "-Dversion=1.0-SNAPSHOT" "-DarchetypeGroupId=org.apache.maven.archetypes" "-DarchetypeArtifactId=maven-archetype-webapp" "-DarchetypeVersion=1.4"`
- Crear un proyecto web(war) en modo interactivo: `mvn archetype:generate "-DarchetypeGroupId=org.apache.maven.archetypes" "-DarchetypeArtifactId=maven-archetype-webapp" "-DarchetypeVersion=1.4"`

### Fases del ciclo de vida de construcción de un proyecto en Maven

En Maven podemos ejecutar un _goal_ como por ejemplo `mvn archetype:generate` o una fase del ciclo de vida de construcción de un proyecto como puede ser `mvn package`.

Los [ciclos de vida de construcción](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html) y sus fases en orden son:

- _Clean lifecycle_ - pre-clean, clean, post-clean
- _Default lifecycle_ - validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy
- _Site lifecycle_ - pre-site, site, post-site, site-deploy

Cuando indicamos a Maven que ejecute una fase, como por ejemplo `mvn compile`, Maven ejecutará cada fase previa en orden de forma secuencial incluida la fase usada en el comando. Por tanto, si miramos la lista veremos que al indicarle `mvn compile` Maven ejecutará:

1. validate
2. initialize
3. generate-sources
4. process-sources
5. generate-resources
6. process-resources
7. compile

Maven no ejecutará fases de otros ciclos de vida si no se indica explícitamente. Es decir, si ejecutamos el comando `mvn compile` del ejemplo anterior, Maven no ejecutará ninguna fase del ciclo de vida de _clean_. Por tanto, para que Maven ejecute las fases del grupo _clean_ y las fases del grupo _default_ debemos indicarlo con el comando `mvn clean compile`.

Las fases con nombres con prefijos como _pre-*_, _post-*_ o _process-*_ son fases cuya función no es ser llamada directamente ya que son fases que producen resultados intermedios para la fase siguiente. Pir tanto no son útiles como fase en sí misma y deben evitarse.

Las fases en orden más importantes del [ciclo de vida de construcción](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html#Lifecycle_Reference) de la mayoría de proyectos son:

- _clean_ — eliminar el directorio `target` que contiene las clases compiladas: `mvn clean`
- _validate_ — validar si la definición y la estructura del proyecto es correcta: `mvn validate`
- _compile_ — compilar el código fuente del proyecto: `mvn compile`
- _test_ — ejecutar los tests del correspondiente framework de test unitarios:`mvn test`
- _package_ — empaquetar el código compilado en un formato distribuible como JAR o WAR: `mvn package`
- _verify_ — ejecutar las validaciones para verificar si el empaquetado es válido y cumple los criterios de calidad: `mvn verify`
- _install_ — instalar el empaquetado en el repositorio local (`user_dir\.m2\`) para ser usado como dependencia en otros proyectos locales: `mvn install`
- _deploy_ — copia el empaquetado final en un repositorio remoto para ser usado en otros proyectos: `mvn deploy`

Para evitar que se ejecutan los tests previos al invocar fases posteriores, podemos usar la opción `-DskipTests=true` como por ejemplo `mvn install -DskipTests=true` o `mvn deploy -DskipTests=true`

### Fases adicionales

- Generar un _site_ del proyecto sin el informe de los test (los tests no se ejecutan): `mvn site`
- Generar un _site_ del proyecto con el informe de los tests (se invoca una fase del ciclo de vida de construcción): `mvn test site`
- Generar un _site_ del proyecto con el informe de los tests de integración: `mvn verify site`

### Otros plugins

De forma interna, para Maven los ciclos de vida corresponden a un _plugin_. Por ejemplo la fase _clean_ corresponde al plugin _maven-clean-plugin_. Por tanto, se podría invocar como `mvn clean` o usando el _goal_ `mvn clean:clean`.

Maven incluye una serie de _plugins_ que forman parte de su _'núcleo'_ y que corresponden a las fases vistas anteriormente.

La lista de _plugins_ oficiales y no oficiales soportados por Maven se puede consultar [aquí](https://maven.apache.org/plugins/index.html). Hay más listas de _plugins_ de Maven como por ejemplo [MojoHaus](http://www.mojohaus.org/plugins.html).

#### Calidad del código

- Analizar la calidad del código con _Sonar_: `mvn clean install -DskipTests=true sonar:sonar`
- Visualizar la ayuda y los _goals_ disponibles del plugin: `mvn sonar:help`

[Más información sobre el plugin](http://sonarsource.github.io/sonar-scanner-maven/plugin-info.html)

#### Informes sobre los tests

- Ejecutar los tests unitarios y generar un informe sobre la cobertura del código de los tests: `mvn clean cobertura:cobertura`
- Visualizar la ayuda y los _goals_ disponibles del plugin: `mvn cobertura:help`

[Más información sobre el plugin](http://www.mojohaus.org/cobertura-maven-plugin/)

#### Administrar las versiones de los artefactos del proyecto

- Escanea las dependencias del proyecto y genera un informe con las actualizaciones disponibles: `mvn versions:display-dependency-updates`
- Escanea los _plugins_ del proyecto y genera un informe con las actualizaciones disponibles: `mvn versions:display-plugin-updates`

[Más información sobre el plugin](https://www.mojohaus.org/versions-maven-plugin/)

#### Administrar las dependencias del proyecto

- Visualizar en formato árbol las dependencias del proyecto: `mvn dependency:tree`
- Analizar y validar las dependencias del proyecto: `mvn dependency:analyze`

[Más información sobre el plugin](https://maven.apache.org/plugins/maven-dependency-plugin/)

### Ayuda

- Visualiza los ajustes de Maven en formato XML: `mvn help:effective-settings`
- Visualiza el fichero POM: `mvn help:effective-pom "-Dverbose=true"`
- Visualiza todos los perfiles: `mvn help:active-profiles`

- Visualiza la información relativa de un _plugin_: `mvn help:describe "-Dcmd=install"`
- Visualiza información relativa del _goal_ de un _plugin_: `mvn help:describe "-Dcmd=install:install"`

- Visuliza la ayuda de un _plugin_: `mvn compiler:help` or `mvn dependency:help` or `mvn versions:help` etc...
- Visualiza la ayuda en detalle de un _goal_ de un _plugin: `mvn compiler:help -Dgoal=compile -Ddetail`

## Enlaces de interés

- <https://maven.apache.org/guides/index.html>
- <https://maven.apache.org/guides/MavenQuickReferenceCard.pdf>
- <http://maven.apache.org/ref/3.1.0/maven-embedder/cli.html>
- <https://www.javaguides.net/2018/12/maven-commands-list-pdf.html>
- <https://www.javaguides.net/p/maven.html>
- <https://maven.apache.org/plugins/index.html>
- <https://itnext.io/writing-a-full-featured-maven-pom-f5b874eef312>
