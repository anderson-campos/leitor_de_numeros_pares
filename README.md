<h1>Projeto: Filtragem de Números Pares em Java</h1>

<p>Este projeto em Java foi desenvolvido para coletar 10 números inteiros fornecidos pelo usuário e, em seguida, exibir apenas os números pares entre eles. O programa utiliza a classe <code>Scanner</code> para ler as entradas do usuário e implementa a lógica necessária para verificar a paridade dos números. Essa aplicação serve como uma introdução à manipulação de arrays, entrada de dados e condicionais em Java.</p>

<h2>Estrutura do Projeto</h2>

<ul>
    <li><strong>Linguagem:</strong> Java</li>
    <li><strong>Classe Principal:</strong> <code>Main</code></li>
</ul>

<p>A classe <code>Main</code> contém o método <code>main</code>, onde toda a lógica do programa é implementada. O fluxo de trabalho abrange desde a coleta dos números até a filtragem e exibição dos números pares.</p>

<h2>Objetivos do Projeto</h2>

<ol>
    <li><strong>Entrada de Dados:</strong> Coletar 10 números inteiros digitados pelo usuário.</li>
    <li><strong>Armazenamento em Array:</strong> Armazenar os números fornecidos em um array.</li>
    <li><strong>Verificação de Paridade:</strong> Identificar quais números são pares através de operações matemáticas.</li>
    <li><strong>Exibição dos Resultados:</strong> Apresentar ao usuário os números que são pares.</li>
</ol>

<h2>Explicação dos Conceitos</h2>

<h3>1. Entrada de Dados</h3>
<p>O programa utiliza a classe <code>Scanner</code> para ler os números digitados pelo usuário. O método <code>nextInt()</code> é usado para capturar os valores inteiros inseridos, que são armazenados em um array de inteiros.</p>

<h3>2. Armazenamento em Array</h3>
<p>Os números fornecidos pelo usuário são armazenados em um array unidimensional (<code>int[] num</code>), que possui um tamanho fixo de 10 posições. Isso permite que os números sejam acessados e manipulados posteriormente.</p>

<h3>3. Verificação de Paridade</h3>
<p>Após a entrada de dados, o programa percorre o array e utiliza a operação de módulo (<code>%</code>) para verificar se cada número é par. Um número é considerado par se o resultado da divisão por 2 for igual a zero.</p>

<h3>4. Exibição dos Resultados</h3>
<p>Os números que atendem à condição de serem pares são exibidos no console. O programa apresenta os números filtrados em uma única linha, separados por espaços.</p>

<h2>Funcionalidades</h2>

<ul>
    <li><strong>Coleta de Números:</strong> Permite que o usuário digite 10 números inteiros.</li>
    <li><strong>Filtragem de Números Pares:</strong> Identifica e exibe apenas os números pares fornecidos pelo usuário.</li>
    <li><strong>Interação Simples:</strong> Apresenta uma interface amigável para entrada de dados e exibição de resultados.</li>
</ul>
