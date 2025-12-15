package org;

public class CarrinhoCompra {

    public static String formula = "produto1 * 2 + produto2 * 1 + produto3 * 1";

    public static double calcularTotalCompra(double produto1, double produto2, double produto3) {
        String expressao;
        expressao = formula.replace("produto1", Double.toString(produto1));
        expressao = expressao.replace("produto2", Double.toString(produto2));
        expressao = expressao.replace("produto3", Double.toString(produto3));

        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}