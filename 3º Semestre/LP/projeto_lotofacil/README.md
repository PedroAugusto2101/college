<h1>Lotofácil - Java</h1>

<p>Projeto simples em Java de um jogo simulando uma Lotofácil. Permite aos usuários fazerem 3 apostas diferentes: de 0 a 100, de A à Z e em número par ou ímpar.</p>

<h2>Informações do Projeto</h2>

<p><strong>Versão do JDK:</strong> Utilizei o JDK 17 para desenvolver este projeto.</p>

<p><strong>Bibliotecas Utilizadas:</strong></p>
<ul>
    <li><code>java.util.Scanner</code>: Utilizada para ler entradas do teclado.</li>
    <li><code>java.util.Random</code>: Utilizada para sortear valores.</li>
    <li><code>java.io.IOException</code>: Utilizada para lidar com erros de entrada e saída.</li>

<h2>Requisitos do Projeto</h2>

<ul>
    <li><strong>Menu Interativo:</strong> Implementado com estruturas <code>switch</code> e <code>do-while</code>. Usuário pode escolher entre três modalidades de apostas ou sair do programa.</li>
    <li><strong>Aposta de 0 a 100:</strong>
        <ul>
            <li>Pode apostar um número inteiro de 0 a 100.</li>
            <li>Caso a aposta esteja fora desse intervalo, o sistema exibe "Aposta inválida!".</li>
            <li>Número aleatório é sorteado para a comparação.</li>
            <li>Se o jogador acertar a aposta, o sistema exibe "Você ganhou R$ 1.000,00."</li>
            <li>Se o jogador errar, o sistema exibe "Você errou! Número sorteado: X."</li>
        </ul>
    </li>
    <li><strong>Aposta de A à Z:</strong>
        <ul>
            <li>O jogador pode apostar uma letra de A a Z, que pode ser digitada em maiúscula ou minúscula.</li>
            <li>Caso a aposta não seja uma letra, o sistema exibe "Aposta inválida!"</li>
            <li>A letra premiada é escolhida com base na inicial do seu nome (por exemplo, 'P' neste exemplo).</li>
            <li>Se o jogador acertar a aposta, o sistema exibe "Você ganhou R$ 500,00."</li>
            <li>Se o jogador errar, o sistema exibe "Você errou! Letra sorteada: X."</li>
        </ul>
    </li>
    <li><strong>Aposta de Número Par ou Ímpar:</strong>
        <ul>
            <li>O jogador pode apostar um número inteiro.</li>
            <li>O sistema verifica se o número é par ou ímpar usando o operador de módulo (%).</li>
            <li>Se o número for par, o jogador ganha "Você ganhou R$ 100,00 reais."</li>
            <li>Se o número for ímpar, o sistema exibe "Você errou! A premiação foi para números pares."</li>
        </ul>
    </li>
</ul>

<h2>Como Rodar o Projeto</h2>

<ol>
    <li>Java instalado em sua máquina.</li>
</ol>

<pre><code>git clone https://github.com/PedroAugusto2101/Newton_ADS/tree/main/3%C2%BA%20Semestre/LP/projeto_lotofacil</code></pre>

<ol start="3">
    <li>Abra o link</li>
</ol>

<ol start="4">
    <li>Compile o código-fonte Java</li>
</ol>

<ol start="5">
    <li>Execute o programa em sua IDE</li>
</ol>

<ol start="6">
    <li>Siga as instruções no terminal.</li>
</ol>
    <li><code>java.util.Random</code>: Utilizada para gerar números aleatórios.</li>
</ul>

<p>Este projeto foi desenvolvido com base nas bibliotecas padrão do Java SE 8.</p>


