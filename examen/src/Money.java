public class Money {
    TipoMoneda moneda;
    private float money;

    public Money(TipoMoneda moneda, float money) {
        this.moneda = moneda;
        validaMoney(money);
    }

    public float validaMoney(float cantidad){
        if (cantidad > 0){
            return cantidad;
        } else {
            cantidad = -1;
            return cantidad;
        }
    }

    float change(TipoMoneda origen, TipoMoneda destino, float money){
        if (origen.equals(TipoMoneda.EUR)){
            if (destino.equals(TipoMoneda.USD)){
                TipoMoneda.conversorEURaUSD(money);
            } else if (destino.equals(TipoMoneda.GBP)){
                TipoMoneda.conversorEURaGBP(money);
            } else {
                return -1;
            }
        } else if (origen.equals(TipoMoneda.USD)){
            if (destino.equals(TipoMoneda.EUR)){
                TipoMoneda.conversorUSDaEUR(money);
            } else {
                return -1;
            }
        } else if (origen.equals(TipoMoneda.GBP)){
            if (destino.equals(TipoMoneda.EUR)){
                TipoMoneda.conversorGBPaEUR(money);
            } else {
                return -1;
            }
        } else {
            return -1;
        }
        return money;
    }
}
