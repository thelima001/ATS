#### Tarefa 1 - Qualidade do Código Fonte da Aplicação UmCarroJá
##### [Status: **Not Done**]

Nesta tarefa os alunos irão utilizar sistemas como o sonarQube, IDEs do Java, etc para analisar a qualidade do código da aplicação desenvolvida pelos alunos de POO. Métricas de software serão também utilizadas para encontrar bad smells. Tarefa Extra: Deﬁnir regras no sonarqube para identiﬁcar red smells (ou qualquer outro smell não suportado pelo sonarQube) numa aplicação Java.

#### Ferramentas:
- SonarQube
- IntelIJ

---

#### Tarefa 2 - Refactoring da Aplicação UmCarroJá
##### [Status: **Not Done**]

Nesta tarefa serão utilizadas ferramentas como o autorefactor, IDEs do Java que suportam
refactoring, ou o jStanley para identificar e eliminar os bad smells e red smells existentes no
software fornecido.
Um estudo detalhado sobre os smells encontrados na(s) aplicação(ões) fornecidas, os refactorings aplicados e o technical debt obtidos deverão ser incluídos no relatório.

#### Ferramentas:
- Autorefactor do IntelIJ ou JStanley

---

#### Tarefa 3 -Teste da Aplicação UmCarroJá
##### [Status: **Not Done**]

Nesta tarefa serão utilizadas técnicas de teste de software, para efectuar o teste unitário e o
teste de regressão da aplicação UmCarroJá. Serão ainda utilizadas sistemas para a geração
automática de casos de teste para gerar testes unitários e ainda inputs para simular a execução
real da aplicação.

Nesta tarefa deverão ser realizadas as seguintes sub-tarefas:
- Desenvolver testes unitários em JUnit para testar a aplicação UmCarroJá.
- Utilizar o sistema EvoSuite para gerar automaticamente testes unitários para a aplicação
UmCarroJá.
- Utilizar o sistema JaCoCo, ou qualquer outro suportado por IDEs do Java, para analisar
a cobertura dos testes.
- Gerar automaticamente ficheiros de logs da aplicação UmCarroJá, utilizando preferencialmente o sistema QuickCheck. Um ficheiro de logs exemplo é disponibilizado com a
aplicação. O gerador a desenvolver deve gerar ficheiros de logs segundo a notação facilmente identificada nesse exemplo. O gerador deve ainda poder ser parameterizado com
alguma noção de dimensão dos logs a gerar, de modo a ser possível exercitar/monitorizar
depois a aplicação UmCarroJá com inputs diferentes.

##### Ferramentas:
- JUnit (testes unitários)
- EvoSuite para gerar testes unitários
- Utilizar JaCoCo ou EvoSuite para analisar a cobertura
- Gerar os logs com QuickCheck (ficheiro desensolvido na entrega 2)


---

#### Tarefa 4 - Análise de Desempenho da Aplicação UmCarroJá
##### [Status: **Not Done**]

Nesta tarefa será feita uma análise detalhada do desempenho da aplicação UmCarroJá, nomeadamente em termos de tempo de execução e consumo de energia. A aplicação será executada
utilizando a framework de geração de inputs reais definidos na Tarefa 3. Duranta a execução
da aplicação o tempo e consumo de energia serão monitorizados.

De modo a analisar a influência dos bad smells e red smells no desempenho do software
as diferentes versões (com e sem smells) do software UmCarroJá serão comparados. Inputs de
tamanhos diferentes deverão ser também considerados na análise.

(mais informação em breve)

Tarefa Extra: Efectuar uma análise detalhada por smell. Isto é, fazer um estudo sobre
como cada smell individualmente influência (melhora ou piora) o desempenho do software.

#### Ferramentas
- Rapl


---