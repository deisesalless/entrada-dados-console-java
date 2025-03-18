# Análise de Classes de Entrada em Java

## InputStream
- **Descrição**: Classe abstrata para leitura de bytes de fontes como arquivos, rede ou console (`System.in`).
- **Uso**: Base para classes como `FileInputStream` (arquivos) e `ByteArrayInputStream` (arrays de bytes).
- **Métodos Principais**:
  - `read()`: Lê um byte.
  - `read(byte[] b)`: Lê bytes em um array.
  - `close()`: Fecha o fluxo.
- **Vantagens**:
  - Baixo nível, ideal para manipulação de dados binários.
  - Flexível para diferentes fontes de entrada.
- **Desvantagens**:
  - Leitura manual de bytes pode ser trabalhosa para textos.
  - Não oferece métodos para leitura de tipos primitivos ou strings diretamente.

## BufferedReader
- **Descrição**: Classe para leitura eficiente de texto, utilizando buffer.
- **Uso**: Combinado com `InputStreamReader` (console) ou `FileReader` (arquivos de texto).
- **Métodos Principais**:
  - `readLine()`: Lê uma linha completa.
- **Vantagens**:
  - Eficiente para grandes volumes de texto, reduzindo operações de I/O.
  - Facilita a leitura de linhas inteiras.
- **Desvantagens**:
  - Limitado a leitura de texto, não adequado para dados binários.
  - Requer combinação com outras classes para leitura de bytes.

## Scanner
- **Descrição**: Classe para leitura e análise de entradas primitivas e strings.
- **Uso**: Fontes como `System.in`, arquivos ou strings.
- **Métodos Principais**:
  - `nextLine()`: Lê uma linha.
  - `nextInt()`, `nextDouble()`, etc.: Lê tipos específicos.
  - `hasNext()`: Verifica se há mais entradas.
- **Vantagens**:
  - Facilita leitura de dados formatados (tipos primitivos e strings).
  - Permite uso de delimitadores personalizados.
  - Ideal para entrada interativa no console.
- **Desvantagens**:
  - Menos eficiente para grandes volumes de dados comparado ao `BufferedReader`.
  - Mais complexo para leitura de bytes ou dados binários.

## Comparação
- **InputStream**: Baixo nível, bytes, ideal para dados binários. Vantagem: flexibilidade. Desvantagem: complexidade para textos.
- **BufferedReader**: Médio nível, texto, eficiente para grandes volumes. Vantagem: eficiência. Desvantagem: limitado a texto.
- **Scanner**: Alto nível, entrada formatada, ideal para interação e análise de tokens. Vantagem: facilidade de uso. Desvantagem: menos eficiente para grandes volumes.

**Nota**: Para entrada no console, `Scanner` é preferido por facilidade, enquanto `BufferedReader` é mais eficiente para grandes volumes de texto.
