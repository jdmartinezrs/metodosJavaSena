package metodosJava;
public class PaqueteEncomienda{

    String numeroGuia;
    String ubicaacionActual;
    double tiempoEntrega;
    String estadoEntrega;
    

    public PaqueteEncomienda(String numeroGuia, String ubicaacionActual, double tiempoEntrega, String estadoEntrega){
        this.numeroGuia = numeroGuia;
        this.ubicaacionActual = ubicaacionActual;
        this.tiempoEntrega = tiempoEntrega;
        this.estadoEntrega = estadoEntrega;
        
    }

    public String getNumeroGuia(){
        return numeroGuia;
    }
public void setEstadoEntrega(String estadoEntrega){
    this.estadoEntrega = estadoEntrega;
}

public void setUbicacion(String ubicaacionActual ){
    this.ubicaacionActual = ubicaacionActual;
}

public void setTiempoEntrega (double tiempoEntrega){
    this.tiempoEntrega = tiempoEntrega;
}
}
