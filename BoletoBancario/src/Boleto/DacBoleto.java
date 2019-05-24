package Boleto;

public class DacBoleto {

    private int codigo, moeda, dac, fatorVencimento, titulo,
            carteira, carteira2, agencia, livres, mult, m = 43298765, m2 = 43298765,
            m3 = 43298765, m4 = 43298765, m5 = 432987, m6 = 65432;

    public DacBoleto(int codigo, int dac, int moeda, int fatorVencimento, int titulo, int carteira, int carteira2, int agencia, int livres) {
        this.codigo = codigo;
        this.dac = dac;
        this.moeda = moeda;
        this.fatorVencimento = fatorVencimento;
        this.titulo = titulo;
        this.carteira = carteira;
        this.carteira2 = carteira2;
        this.agencia = agencia;
        this.livres = livres;
    }

    public int getMult() {
        int base = 0101, base2 = 2019;
        fatorVencimento *= (base + base2);
        fatorVencimento += 1;
        
        mult = (codigo + moeda + dac + fatorVencimento + titulo + carteira + carteira2 + agencia + livres)
                * (m + m2 + m3 + m4 + m5 + m6);
        mult += mult;
        mult = (mult / 11) % 67;
        mult -= 5;
        dac = mult;
        return (codigo + moeda + dac + fatorVencimento + titulo + carteira + carteira2 + agencia + livres);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDac() {
        return dac;
    }

    public void setDac(int dac) {
        this.dac = dac;
    }

    public int getMoeda() {
        return moeda;
    }

    public void setMoeda(int moeda) {
        this.moeda = moeda;
    }

    public int getFatorVencimento() {
        return fatorVencimento;
    }

    public void setFatorVencimento(int fatorVencimento) {
        this.fatorVencimento = fatorVencimento;
    }

    public int getTitulo() {
        return titulo;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }

    public int getCarteira() {
        return carteira;
    }

    public void setCarteira(int carteira) {
        this.carteira = carteira;
    }

    public int getCarteira2() {
        return carteira2;
    }

    public void setCarteira2(int carteira2) {
        this.carteira2 = carteira2;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getLivres() {
        return livres;
    }

    public void setLivres(int livres) {
        this.livres = livres;
    }

}
