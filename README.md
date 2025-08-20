#BloonsMonkeys-api

###Descrição
É um projeto simples que eu estou desenvolvendo pra aprender a usar o Spring Framework, atualmente ele basicamente mostra um json com os macacos, cria macacos novos, deleta e só por enquanto.

##Configurações
Antes de rodar, é importante ter o `JDK 21` instalado no seu computador e uma IDE que seja compatível com Java `(IntelliJ/VSCode)`

##Instalação 
Para instalar esse projeto na sua máquina é só utilizar o comando 
```
git clone https://github.com/marceloalckmin/BloonsMonkeys-api.git
```

e o repositório será clonado na sua máquina.

##Execução
Para executar é muito simples, é só rodar o projeto com o maven:
```
./mvnw spring-boot:run
```

##Endpoints da API

###Lista de macacos registrados
`/monkeys`
Essa endpoint retorna um json com as informações de todos os macacos registrados
