module FuncoesDiversas where

--Calcula reajuste do salario
calcularReajuste :: Double -> Double
calcularReajuste salario = salario * 1.25

--Calcula media ponderada
calcularMediaPonderada :: Double -> Double -> Double -> Double -> Double -> Double -> Double
calcularMediaPonderada nota1 peso1 nota2 peso2 nota3 peso3 =
  ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3)

--Converte temperatura 
converterTemperatura :: Double -> Double
converterTemperatura  temperatura = temperatura*(9.0/5.0)+32.0

--Calcula idade
calculaIdade :: Int -> Int
calculaIdade idade = 2032 - idade 

--Calcula minutos
calcularMinutos :: Int -> Int -> Int
calcularMinutos hora minutos = hora * 60 + minutos

-- Quadrados
calcularSomaQuadrados :: Double -> Double -> Double -> (Double, Double, Double)
calcularSomaQuadrados x y z =
    -- sem usar funções prontas
    let semFuncoesProntas = x^2 + y^2 + z^2

        -- usando a função ** do Prelude
        comDoubleAsterisco = x ** 2 + y ** 2 + z ** 2

        -- usando a função ^ do Prelude
        comCircunflexo = x ^ 2 + y ^ 2 + z ^ 2
    in (semFuncoesProntas, comDoubleAsterisco, comCircunflexo)

-- Função para verificar se um número é ímpar usando a função even
verificarImparEven :: Int -> Bool
verificarImparEven num = not (even num)

-- Função para verificar se um número é ímpar usando a função mod
verificarImparMod :: Int -> Bool
verificarImparMod num = mod num 2 /= 0

-- Função para verificar a divisibilidade de dois números
verificarDivisibilidade :: Int -> Int -> Bool
verificarDivisibilidade x y = mod x y == 0

-- Função para calcular o salário
calcularSalario :: Double -> Double
calcularSalario salarioBase =
  let gratificacao = 0.05 * salarioBase
      imposto = 0.07 * salarioBase
  in salarioBase + gratificacao - imposto