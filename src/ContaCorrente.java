import java.util.ArrayList;

public class ContaCorrente {
        double saldo;
        Cliente cliente;
        public void deposita(double valorDeposita){
                saldo = saldo + valorDeposita;
        }
        public double getSaldo(){
                return saldo;
        }

}
