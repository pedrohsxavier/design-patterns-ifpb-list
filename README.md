# Padrões de Projeto

## CST em Sistemas para Internet - [Instituto Federal da Paraíba - João Pessoa](https://www.ifpb.edu.br/joaopessoa)

#### Professora: Dra. Alana Morais (alanamm.prof@gmail.com)

***

## Avaliação: Padrões Estruturais


###### Adapter
1. A classe **java.util.Map** da API de coleções de Java permite que seja armazenados pares de objetos (chave e valor) em uma de suas implementações (as mais conhecidas são **HashMap** e **TreeMap**). No entanto, estas classes não possuem um construtor que receba com parâmetro uma matriz de duas linhas e que monte o mapa usando a primeira linha como chave e a segunda como coluna. Crie um **adaptador** (_dica: use **Adapter** de classe_) que tenha este contrutor.

