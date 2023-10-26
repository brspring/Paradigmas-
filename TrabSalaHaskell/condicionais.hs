calculaIdade :: Int -> String
calculaIdade idade
    | idade >= 18 = "Pode"
    | otherwise = "Nao pode"

calculaIdadeIf :: Int -> String 
calculaIdadeIf  idade = if idade >= 18
    then "Pode"
    else "Nao pode"

positivo :: Int -> String
positivo num
    | num > 0 = "Positivo"
    | num == 0 = "Nulo"
    | otherwise = "Negativo"

positivoIf :: Int -> String
positivoIf  num = 
    if num > 0 
        then "Positivo"
    else if num < 0 
        then "negativo"
        else "nulo" 

bissexto :: Int -> Bool 
bissexto ano 
    | ((anoMod4 && anoMod100) || anoMod400)  = True
    | otherwise = False
    where 
        anoMod100 = (mod ano 100 /= 0)
        anoMod4 = (mod ano 4 == 0)
        anoMod400 = (mod ano 400 == 0)


bissextoIf :: Int -> Bool 
bissextoIf ano = 
    if ((anoMod4 && anoMod100) || anoMod400)
        then True
        else False
    where 
        anoMod100 = (mod ano 100 /= 0)
        anoMod4 = (mod ano 4 == 0)
        anoMod400 = (mod ano 400 == 0)

fibonacci :: Int -> Int
fibonacci n
    | n == 0 = 0 
    | n == 1 = 1
    | otherwise = fibonacci(n-1) +  fibonacci(n-2)

numeroDigitos :: Int -> Int 
numeroDigitos num
    | num == 0 = 0
    | otherwise = numeroDigitos (div num 10) + 1

somaDigitos :: Int -> Int 
somaDigitos num
    | num == 0 = 0
    | otherwise = somaDigitos (div num 10) + (mod num 10)

