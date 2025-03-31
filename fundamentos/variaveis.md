## 📂 Fundamentos de Java

# 📝 Variáveis e Tipos de Dados em Java
## 📌 Introdução
Em Java, toda variável precisa ter um tipo definido antes de ser usada.
As variáveis são utilizadas para armazenar dados na memória do computador. Cada variável possui um tipo que define quais valores ela pode armazenar.

## 🔹 Tipos Primitivos
Os principais tipos primitivos em Java são:

| Tipo       | Tamanho | Valor Padrão | Exemplo |
|-----------|---------|--------------|---------|
| `byte`    | 8 bits  | 0            | `byte idade = 25;` |
| `short`   | 16 bits | 0            | `short ano = 2024;` |
| `int`     | 32 bits | 0            | `int numero = 1000;` |
| `long`    | 64 bits | 0L           | `long populacao = 7800000000L;` |
| `float`   | 32 bits | 0.0f         | `float altura = 1.75f;` |
| `double`  | 64 bits | 0.0d         | `double peso = 70.5;` |
| `char`    | 16 bits | '\u0000'    | `char letra = 'A';` |
| `boolean` | 1 bit   | false        | `boolean ativo = true;` |

## 🔹 Variáveis e Escopo
```java
public class ExemploVariaveis {
    public static void main(String[] args) {
        int idade = 25; // Variável local
        System.out.println("Idade: " + idade);
    }
}
```

## 🔹 Conversão de Tipos
```java
int num = 10;
double numDouble = num; // Conversão implícita

// Conversão explícita, também chamada de "casting"
double valor = 9.7;
int valorInteiro = (int) valor;
```

Conteúdo visto em 31/03/2025