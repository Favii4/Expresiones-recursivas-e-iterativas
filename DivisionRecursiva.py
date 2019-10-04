def div_Recursiva(a,b):
    if a<b:
        return 0
    else:
        return 1+div_Recursiva(a-b,b)

print(div_Recursiva(20,4))
