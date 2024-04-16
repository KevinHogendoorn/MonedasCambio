public enum TipoMoneda {
    EUR, USD, GBP, PTS;
    static final double EURaUSD = 1.18798;
    static final double USDaEUR = 0.841815;
    static final double EURaGBP = 0.857839;
    static final double GBPaEUR = 1.165826;

    public static float conversorEURaUSD(float cantidadEUR){
        cantidadEUR *= EURaUSD;
        return cantidadEUR;
    }

    public static float conversorUSDaEUR(float cantidadUSD){
        cantidadUSD*=USDaEUR;
        return cantidadUSD;
    }

    public static float conversorEURaGBP(float cantidadEUR){
        cantidadEUR*=EURaGBP;
        return cantidadEUR;
    }

    public static float conversorGBPaEUR(float cantidadGBP){
        cantidadGBP*=GBPaEUR;
        return cantidadGBP;
    }
}