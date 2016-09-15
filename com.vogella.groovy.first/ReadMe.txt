Guida su come usare Groovy da Eclipse:
http://www.vogella.com/tutorials/Groovy/article.html#firstgroovy

Attenzione: evitare di installare Spring, l´ho fatto ma non ho trovato nulla di groovy

ATTENZIONE: se si installa versioni piú recenti di eclipse, come ad es. neon 4.6, l´url consigliato nella guida e il groovy che si trova nello store di eclipse non sono compatibili. Comunque sefuendo l´url indicato nella guida: https://github.com/groovy/groovy-eclipse/wiki
si trova il link giusto:
http://dist.springsource.org/snapshot/GRECLIPSE/e4.6/

BLOG CON ESEMPI DI USO DI CLASSI GROOVY:
http://www.spamer.me.uk/wiki/doku.php/soapui_reusable_script_library?rev=1350558275

Per compilare una classe grooovy per SoapUI in eclipse occorre usare questa import:
import com.eviware.soapui.support.GroovyUtils

e aggiungere il relativo jar: soapui-5.2.1.jar

Il jar che si ottiene dalla compilazione e esportazione in jar, va messo nella cartella bin\ext di SoapUI.
Dal progetto SoapUisi fa una chiamata di questo tipo:

import com.vogella.groovy.first.DBConnection

def oDBConnection = new DBConnection()

oDBConnection.log= log
oDBConnection.context = context
oDBConnection.testRunner = testRunner

oDBConnection.Connect()