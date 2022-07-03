public class Cliente extends Pessoa{

 public static final int CONTA_CORRENTE = 1;
 public static final int CONTA_POUPANCA = 2;

 private int numeroDeRegistro;
 private int TipoDeConta;

    public int getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public int getTipoDeConta() {
        return TipoDeConta;
    }

    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public void setTipoDeConta(int tipoDeConta) {
        TipoDeConta = tipoDeConta;
    }
}
