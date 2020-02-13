

public class Sinaleira {

    private Estado estado;

    public Sinaleira(){
        this.estado = new Vermelho();
    }

    public void ligar(){
        for(int i = 0; i < 10; i++){
            System.out.println(this.getEstado());
            mudar();
        }
    }

    private void mudar() {
        estado.mudar(this);
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getEstado(){
        return estado.getEstado();
    }
}
