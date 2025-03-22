# Navegador com Botões de Avançar e Voltar

## 📌 Descrição
Este projeto implementa a funcionalidade dos botões **Avançar** e **Voltar** de um navegador web, utilizando a estrutura de **pilhas (Stack)** em Java. O objetivo é simular o comportamento real de um histórico de navegação.

## 🚀 Tecnologias Utilizadas
- **Java** (JDK 11+)
- **Estruturas de Dados - Pilha (Stack)**

## 🛠️ Funcionalidades
- **Visitar uma nova página**: Armazena a página atual na pilha de voltar.
- **Voltar**: Move a página atual para a pilha de avançar e retorna à página anterior.
- **Avançar**: Retorna para uma página movida anteriormente para a pilha de avançar.
- **Gerenciamento de pilhas vazias**: Pilhas vazias são eliminadas automaticamente.

## 🖥️ Como Executar

1. Clone este repositório:
   ```sh
   git clone https://github.com/AliSouz7/mozzila.git

✅ Exemplos de Uso
> Visitar "A"
> Visitar "B"
> Visitar "C"
> Voltar (B)
> Voltar (A)
> Avançar (B)

📂 Estrutura do Projeto

📁 mozilla
📁 src
┣ 📜 Historico.java
┣ 📜 Main.java
┣ 📜 Navegador.java
┗ 📜 README.md

📄 Licença
Este projeto é de código aberto e está sob a licença MIT.

🔗 https://github.com/AliSouz7/mozzila

