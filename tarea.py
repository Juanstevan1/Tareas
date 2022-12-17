peso = float(input("Ingrese su peso"))
altura = float (input("Ingrese su estatura"))

def Imc(peso,altura):
    imc = peso / (altura*altura)
    return imc
print("Su imc es", round(Imc(peso,altura),2))
