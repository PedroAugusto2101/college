<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lotofácil Java - Jogo de Loteria Simples</title>
</head>
<body>

<h1>Lotofácil Java - Jogo de Loteria Simples</h1>

<p>Este é um projeto simples em Java que implementa um jogo de loteria chamado Lotofácil. O sistema permite aos jogadores fazerem apostas em três modalidades diferentes: de 0 a 100, de A à Z e em número par ou ímpar. O programa roda no terminal, lê entradas dos jogadores e exibe os resultados das apostas de acordo com as regras da loteria.</p>

<h2>Requisitos do Projeto</h2>

<ul>
    <li><strong>Menu Interativo:</strong> O sistema possui um menu interativo implementado com estruturas <code>switch</code> e <code>do-while</code>. O usuário pode escolher entre três modalidades de apostas ou sair do programa.</li>

    <li><strong>Aposta de 0 a 100:</strong>
        <ul>
            <li>O jogador pode apostar um número inteiro de 0 a 100.</li>
            <li>Caso a aposta esteja fora desse intervalo, o sistema exibe "Aposta inválida".</li>
            <li>Um número aleatório é sorteado para a comparação.</li>
            <li>Se o jogador acertar a aposta, o sistema exibe "Você ganhou R$ 1.000,00 reais."</li>
            <li>Se o jogador errar, o sistema exibe "Que pena! O número sorteado foi: X."</li>
        </ul>
    </li>

    <li><strong>Aposta de A à Z:</strong>
        <ul>
            <li>O jogador pode apostar uma letra de A a Z, que pode ser digitada em maiúscula ou minúscula.</li>
            <li>Caso a aposta não seja uma letra, o sistema exibe "Aposta inválida."</li>
            <li>A letra premiada é escolhida com base na inicial do seu nome (por exemplo, 'J' neste exemplo).</li>
            <li>Se o jogador acertar a aposta, o sistema exibe "Você ganhou R$ 500,00 reais."</li>
            <li>Se o jogador errar, o sistema exibe "Que pena! A letra sorteada foi: X."</li>
        </ul>
    </li>

    <li><strong>Aposta de Número Par ou Ímpar:</strong>
        <ul>
            <li>O jogador pode apostar um número inteiro.</li>
            <li>O sistema verifica se o número é par ou ímpar usando o operador de módulo (%).</li>
            <li>Se o número for par, o jogador ganha "Você ganhou R$ 100,00 reais."</li>
            <li>Se o número for ímpar, o sistema exibe "Que pena! O número digitado é ímpar e a premiação foi para números pares."</li>
        </ul>
    </li>
</ul>

<h2>Como Rodar o Projeto</h2>

<ol>
    <li>Certifique-se de que você tem o Java instalado em sua máquina.</li>
    <li>Clone este repositório em sua máquina local:</li>
</ol>

<pre><code>git clone https://github.com/seu-usuario/lotofacil-java.git</code></pre>

<p>Substitua <code>seu-usuario</code> pelo seu nome de usuário do GitHub.</p>

<ol start="3">
    <li>Navegue até o diretório do projeto:</li>
</ol>

<pre><code>cd lotofacil-java</code></pre>

<ol start="4">
    <li>Compile o código-fonte Java:</li>
</ol>

<pre><code>javac LotofacilMenu.java</code></pre>

<ol start="5">
    <li>Execute o programa:</li>
</ol>

<pre><code>java LotofacilMenu</code></pre>

<ol start="6">
    <li>Siga as instruções no terminal para fazer suas apostas e verificar os resultados.</li>
</ol>

<p>Aproveite o jogo Lotofácil em Java!</p>

<p><strong>Nota:</strong> Este é um projeto de exemplo simples para fins educacionais. Você pode personalizá-lo e adicionar mais recursos, como armazenar histórico de jogos, melhorar a interface do usuário ou criar um mecanismo de premiação mais complexo.</p>

</body>
</html>
