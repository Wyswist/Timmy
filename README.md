Timmy
=====

Aplicativo android para auxiliar deficientes visuais.

Veja detalhes no documento:
http://goo.gl/HFxZ6e

Instrucoes para desenvolvedores
=====

0) Clone o repositorio:

<pre>
git clone https://github.com/ademirao/Timmy.git
</pre>

1) Instale o eclipse
https://www.eclipse.org/downloads/

2) Baixe android sdk
http://developer.android.com/sdk/index.html

http://developer.android.com/sdk/installing/installing-adt.html

4) Na opcao <b>File -> Import</b>, selecionar <b>Android</> entao <b>Existing Android Project Into Workspace</b>.
  * Importe os 3 projetos: Timmy, appcompat\_v7 e OpenCv.

5) Com o emulador android rodando, instalar o OpenCV manager:
<pre>
	$> cd Timmy/
	$> adb install OpenCV-2.4.9-android-sdk/apk/OpenCV_2.4.9_Manager_2.18_armeabi.apk
</pre>

