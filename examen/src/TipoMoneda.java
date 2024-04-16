public enum TipoMoneda {
    EUR, USD, GBP, PTS;

    public static float conversorEURaUSD(float cantidadEUR){
        double USD = 1.18798;
        cantidadEUR *= USD;
        return cantidadEUR;
    }

    public static float conversorUSDaEUR(float cantidadUSD){
        double EUR = 0.841815;
        cantidadUSD*=EUR;
        return cantidadUSD;
    }

    public static float conversorEURaGBP(float cantidadEUR){
        double GBP = 0.857839;
        cantidadEUR*=GBP;
        return cantidadEUR;
    }

    public static float conversorGBPaEUR(float cantidadGBP){
        double EUR = 1.165826;
        cantidadGBP*=EUR;
        return cantidadGBP;
    }
}