package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}
/*
    MAVEN:
        -Es una herramienta de software para la GESTIÓN Y COSNTRUCCIÓN DE PROYECTOS java
         que se caracteriza por tener un modelo de configuración muy simple, basado en el FORMATO XML.
        -Utiliza el conocido ARCHIVO POM.xml (PROJECT OBJECT MODEL) para dentro de él especificar
         las diferentes dependencias o librerías que seran necesarias incluir en el proyecto
         que se este desarrollando.
        -Algunos IDEs que ya lo incluyen como: INTELLIJ IDEA, NEATBEANS
        -GESTOR DE DEPENDENCIAS O LIBRERIAS, evita todo el proceso de descargar librerias.

        +Artifact id: Igual toma el nombre del proyecto que se le de o se le agrega un id que se unico
         ya que el group id puede ser el mismo para diferentes proyectos.
        +Group id:  Es el nombre que se le pone a los paquetes del proyecto (si es una aplicacion web,
         se pone la dirección url de la web), ejemplo: (com.mycompany)
        +Se puede cambiar la version del proyecto en el pom.xml


        +Se crea por defecto el archivo POM.xml, donde se agregan todas las librerias (dependencias)
         a utilizar en el proyecto.
        +Se utilizan etiquetas  <Dependencies> para agregar la libreria.

            <dependencies>
                <dependency>
                    <groupId></groupId>
                    <artifactId>

                    </artifactId>
                </dependency>
            </dependencies>

        +Despues de agregar la dependencia, se recarga maven.


         Existen otros gestores de proyectos para java

    GRADLE:
        -Es una herramienta muuy similar a Maven.
        -Se basa en conceptos similares a Maven, pero con la particularidad de que fue diseñado para
         REALIZAR TRABAJOS MULTIPROYECTOS O que requieren de GRAN GRADO DE PERSONALIZACION.
        -En lugar de utilizar XML, utiliza DSL (LENGUAJE ESPECIFICO DE DOMINIO).


*/