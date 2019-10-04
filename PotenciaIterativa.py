def potenciaIterativa(base,exp):
    if exp>0:
        return base * potenciaIterativa(base,exp-1)
    else:
        return 1
print(potenciaIterativa(4,5))
