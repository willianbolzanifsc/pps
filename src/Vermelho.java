public class Vermelho implements Estado {
    @Override
    public void mudar(Sinaleira sinaleira) {

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        sinaleira.setEstado(new Verde());
    }

    @Override
    public String getEstado() {
        return "Vermelho";
    }


}
