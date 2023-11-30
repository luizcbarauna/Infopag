/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author luizf
 */
public class Descontos {
    public static double CalcularIRRF(double salario)
{
    double[] faixas = { 1903.98, 2826.65, 3751.05, 4664.68 };
    double[] aliquotas = { 0.0, 0.075, 0.15, 0.225, 0.275 };
    double irrf = 0.0;

    double salarioBase = salario - CalcularINSS(salario);

    for (int i = 0; i < faixas.length; i++)
    {
        if (salarioBase <= faixas[i])
        {
            irrf = salarioBase * aliquotas[i];
            break;
        }
        else
        {
            irrf = faixas[i] * aliquotas[i];
            salarioBase -= faixas[i];
        }
    }

    return irrf;
}
public static double CalcularINSS(double salario)
{
    double[] faixas = { 1100.00, 2203.48, 3305.22, 6433.57 };
    double[] aliquotas = { 0.075, 0.09, 0.12, 0.14 };
    double tetoINSS = 6433.57;

    double inss = 0.0;

    for (int i = 0; i < faixas.length; i++)
    {
        if (salario <= faixas[i])
        {
            inss = salario * aliquotas[i];
            break;
        }
        else
        {
            inss = faixas[i] * aliquotas[i];
            salario = salario - faixas[i];
        }
    }

    return inss <= tetoINSS ? inss : tetoINSS;
}
public static double CalcularFGTS(double salario)
{
    double fgtsPercentual = 0.08; // 8% do salário bruto
    double fgts = salario * fgtsPercentual;
    return fgts;
}
public static double DescontoTotal(double salario)
{
    double irrf = CalcularIRRF(salario);
    double inss = CalcularINSS(salario);
    double fgts = CalcularFGTS(salario);

    double totalImpostos = irrf + inss + fgts;
    return totalImpostos;
}
}


