# Java Stock Profit Calculator

A beginner-friendly Java console project that calculates stock investment performance for one or more holdings. Built as a practice project connecting AP Computer Science A concepts with an interest in finance.

## Features

- Enter a stock name, number of shares, purchase price per share, and current price per share.
- Calculate the initial investment and current value of each holding.
- Calculate each holding's profit or loss and percentage return.
- Add multiple stocks to a portfolio.
- Display total invested, current portfolio value, total profit or loss, and overall portfolio return.

## Java concepts used

- Variables and data types (`String`, `int`, and `double`)
- `Scanner` for user input
- Arithmetic expressions
- `while` loops
- `if` statements
- Formatted output with `System.out.printf`

## How to run

You need a Java Development Kit (JDK) installed.

1. Download or clone this repository.
2. Open a terminal in the project folder.
3. Compile the program:

   ```bash
   javac Main.java
   ```

4. Run it:

   ```bash
   java Main
   ```

You can also paste `Main.java` into a free online Java compiler such as [OnlineGDB](https://www.onlinegdb.com/online_java_compiler).

## Example calculation

Suppose you enter 10 shares, a purchase price of `$100.00`, and a current price of `$120.00`.

- Initial investment: `$1,000.00`
- Current value: `$1,200.00`
- Profit: `$200.00`
- Return: `20.00%`

## Financial formulas

- **Initial investment** = shares × purchase price per share
- **Current value** = shares × current price per share
- **Profit/loss** = current value − initial investment
- **Return (%)** = (profit/loss ÷ initial investment) × 100
- **Portfolio return (%)** = (total profit/loss ÷ total invested) × 100

If the initial investment is zero, the program displays a return of `0.00%` to avoid division by zero.

## Limitations

- Prices are entered manually; the program does not connect to a live stock-price API.
- It does not include transaction fees, dividends, taxes, or currency conversions.
- It is an educational calculator, not investment advice.
- Enter hypothetical or clearly sourced prices when demonstrating the program.

## Possible future improvements

- Save portfolio data to a CSV file.
- Add input validation for non-numeric entries.
- Create charts using spreadsheet software.
- Import historical prices from a reliable data source.

## Author

Created as a personal learning project to explore the connection between Java programming and financial analysis.
