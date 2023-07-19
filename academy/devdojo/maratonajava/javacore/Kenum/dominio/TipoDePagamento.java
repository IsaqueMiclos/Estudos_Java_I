package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoDePagamento {
    DEBITO {
        @Override
        public double calculadorDeDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calculadorDeDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calculadorDeDesconto(double valor);
}
