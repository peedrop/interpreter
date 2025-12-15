package org;

public class Cliente {
    public double getProduto1() {
        return produto1;
    }

    public void setProduto1(double produto1) {
        this.produto1 = produto1;
    }

    public double getProduto2() {
        return produto2;
    }

    public void setProduto2(double produto2) {
        this.produto2 = produto2;
    }

    public double getProduto3() {
        return produto3;
    }

    public void setProduto3(double produto3) {
        this.produto3 = produto3;
    }

    private double produto1;
    private double produto2;

    private double produto3;



    public double calcularTotalCompra() {
        return CarrinhoCompra.calcularTotalCompra(this.produto1, this.produto2, this.produto3);
    }
}
