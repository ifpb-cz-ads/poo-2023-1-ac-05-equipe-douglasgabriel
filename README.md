## **Respostas da atividade em anexo**
### **Questão 1**
Os quatro elementos básicos de repetição controlada por contador são: inicialização, condição de continuação, operação a ser repetida e atualização do contador. A inicialização é a atribuição do valor inicial ao contador. A condição de continuação é a verificação da condição para a continuação da repetição. A operação a ser repetida é a ação que será executada a cada iteração do loop. A atualização do contador é a instrução que atualiza o valor do contador a cada iteração do loop.

### **Questão 2**
Existem diferenças significativas entre o uso dos comandos de repetição _for_ e _while_, cada um com suas características únicas. Enquanto o _while_ possui apenas a condição de inicialização, o _for_ inclui declaração de variável de controle, incrementação e condição de inicialização.

>_while(...){_
>
>_}_

>_for (...){_
>    
>_}_

É importante considerar que o comando _for_ é mais adequado quando temos conhecimento prévio da quantidade de vezes que a repetição deve ocorrer, enquanto o comando _while_ é mais indicado quando não sabemos quantas vezes um determinado trecho de código precisará ser repetido.

### **Questão 3**

O ***do...while*** é utilizado quando é preciso que as intruções de um laço de repetição perecisam ser executada pelo menos uma vez. Já o ***while*** é utilizado quando se precisa testar primeiro as condições.

### **Questão 4**

A instrução ***break*** interrompe imediatamente a execução de um loop e continua com a instrução que vem logo após o loop. A instrução ***continue*** pula uma iteração do loop e continua com a próxima iteração.

### **Questão 5**

<p style="font-weight: bold; color: red; "> Obs.: Estou considerando que as variáveis de controle já foram declaradas.</p>

*a)* A instrução não funciona porque o comando _for_ foi declarado com "F" maiúsculo. As instruções dentro dos parâmetros do _for_ não estão separadas por ponto e vírgula e o _"System.out.println(i);"_ foi separado do _for_ por uma quebra de linha. Além disso, a condição de parada do _for_ está incorreta, resultando em um loop infinito. <br>Uma possível solução seria:

>_for ( i = 100; i >= 1; i-- ) System.out.println(i);_

*b)* As instruções funcionam corretamente.

*c)* O código funciona e, porem, a condição de parada está incorreta, resultando em um loop infinito.<br> Uma possível solução seria:

>_for( i = 19; i >= 1; i -=2) System.out.println(i);_

*d)* O código funfiona corretamente.

### **Questão 6**

O programa imprime uma matriz em forma retangular preenchida por "@".
