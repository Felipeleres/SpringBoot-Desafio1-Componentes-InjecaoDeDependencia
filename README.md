# Desafio: Cálculo de Pedido – Componentes e Injeção de Dependência

Desafio desenvolvido durante o curso **Java Spring Professional**, com foco em entender e aplicar os conceitos fundamentais de **componentes**, **injeção de dependência** e **separação de responsabilidades** no Spring Boot.

## 🧩 Objetivo do desafio

Implementar um sistema para calcular o valor total de um pedido considerando:
- Porcentagem de desconto
- Regras de frete baseadas no valor básico do pedido

O cálculo final segue a lógica:
**Valor Total = (Valor básico – Desconto) + Frete**

## 🧠 Conceitos aprendidos

- Criação e uso de **componentes Spring**
- **Injeção de dependência** entre serviços
- Separação de responsabilidades entre:
  - `OrderService` → lógica do pedido
  - `ShippingService` → regras de frete
- Design limpo e orientado a serviços
- Execução e saída via **log da aplicação**


