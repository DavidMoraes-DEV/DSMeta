
# **DS Meta**

[![npm](https://img.shields.io/npm/l/react)](https://github.com/DavidMoraes-DEV/DSMeta/blob/main/LICENSE)

## Descrição

DS Sales é uma aplicação full stack e mobile desenvolvido no **_Evento gratuíto semana Spring React_** da
<a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a> 
com algumas personalizações pessoais.
<br><br>
O projeto consiste na construção de um relatório de vendas, disponibilizando ao usuário a filtragem por data,
e com um serviço de envio de SMS (com o Twilio) sobre as vendas selecionadas. Projeto original até commit: Toast.
<br><br>
Além de personalizar alguns detalhes no layout do projeto original, adicionei um componente de paginação no final da listagem das vendas
para navegar e disponibilizar todas as vendas no período selecionado.
<br><br>

## Layout

<img align="center" alt="Layouts DS Catalog" width="100%" src="https://raw.githubusercontent.com/DavidMoraes-DEV/assetsReadme/main/dsmeta/tela-ds-meta.png" />

<br>

##  Design Original Completo:

<a href="https://www.figma.com/file/EN1zFtk4eY3Jgmpgi9YaMG/DSMeta1?node-id=0%3A1"><img align="center" height="45" alt="DSSales" src="https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white"></a>

<br>

## Stack utilizada
  
### **_Front-end:_** 
<div>
<img align="center" alt="David-HTML5" height="30" src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white" />
<img align="center" alt="David-CSS" height="30" src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white" />
<img align="center" alt="David-TS" height="30" src="https://img.shields.io/badge/TypeScript-007ACC?style=for-the-badge&logo=typescript&logoColor=white" />
<img align="center" alt="David-React" height="30" src="https://img.shields.io/badge/React_Native-20232A?style=for-the-badge&logo=react&logoColor=61DAFB" />
<img align="center" alt="David-React-Components" height="30" src="https://img.shields.io/badge/Datepicker_/_Paginate_/_Toastify-20232A?style=for-the-badge&logo=react&logoColor=61DAFB" /><img align="center" alt="David-Axios" height="30" src="https://img.shields.io/badge/Axios-00000F?style=for-the-badge" />
<img align="center" alt="David-Netlify" height="30" src="https://img.shields.io/badge/Netlify-00C7B7?style=for-the-badge&logo=netlify&logoColor=white" />
</div>

### **_Back-end:_**
<div>
<img align="center" alt="David-JAVA" height="30" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
<img align="center" alt="David-SpringBoot" height="30" src="https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot" />
<img align="center" alt="David-Spring-Data-JPA" height="30" src="https://img.shields.io/badge/Spring_Data_JPA-59666C?style=for-the-badge&logo=Hibernate&logoColor=white" />
<img align="center" alt="David-Spring-Security" height="30" src="https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=Spring-Security&logoColor=white" />
<img align="center" alt="David-Maven" height="30" src="https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" />
<img align="center" alt="David-MYSQL" height="30" src="https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white" />
<img align="center" alt="David-H2-Database" height="30" src="https://img.shields.io/badge/H2 Database-27338e?style=for-the-badge&logo=Databricks&logoColor=white" />
<img align="center" alt="David-Twilio" height="30" src="https://img.shields.io/badge/Twilio-F22F46?style=for-the-badge&logo=Twilio&logoColor=white" />
<img align="center" alt="David-Heroku" height="30" src="https://img.shields.io/badge/Heroku-430098?style=for-the-badge&logo=heroku&logoColor=white" />
</div>

<br>
  
## Projeto Online

<a href="https://dm-developer-ds-meta.netlify.app/"><img align="center" height="45" alt="DSMeta" src="https://img.shields.io/badge/Abrir_Projeto-27338e?style=for-the-badge&logo=SoundCloud&logoColor=white"></a>

<br>

## Rodando Localmente

Clone o projeto:

```bash
git clone git@github.com:DavidMoraes-DEV/DSMeta.git
```

Entre no diretório do projeto:

```bash
cd DSMeta
```

### _Rodar a API:_
Importe o projeto no Spring Tools Suite:

```bash
File / import / Maven / Existing Maven Projects / Next / Browse...
/ Localizar e abrir a pasta DSMeta 
/ Abrir a pasta backend / Click em Selecionar pasta
/ No Spring Selecionar: /pom.xml / Finish
```

Rodar o projeto no Spring Tools Suite:
```
Pasta raiz / Botão direito / Run As... / Spring Boot App
```

### _Rodar o frontend:_

No diretório do projeto navegue até a pasta do frontend:
```bash
cd frontend/
```

Opcional: Abrir o projeto no VS Code pelo terminal:
```bash
code .
```

Instalar as dependências e rodar o projeto: 
```bash
yarn
yarn dev
```
<br>

## Teste as requisições da API no Postman:

<a href="https://app.getpostman.com/run-collection/13224574-10de906d-15f6-4861-9e47-fde5655fec75?action=collection%2Ffork&collection-url=entityId%3D13224574-10de906d-15f6-4861-9e47-fde5655fec75%26entityType%3Dcollection%26workspaceId%3Db5e2132f-dd30-4fcf-891f-62d01bc88086#?env%5Bds-meta-local%5D=W3sia2V5IjoiaG9zdCIsInZhbHVlIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwIiwiZW5hYmxlZCI6dHJ1ZSwidHlwZSI6ImRlZmF1bHQifV0="><img align="center" height="45" alt="DSMeta" src="https://run.pstmn.io/button.svg"></a>
