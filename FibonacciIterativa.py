def fibonacciIterativa(num1):
    if num1 > 1:
        return fibonacciIterativa(num1-1) + fibonacciIterativa(num1-2)
    return 1
print(fibonacciIterativa(8))
