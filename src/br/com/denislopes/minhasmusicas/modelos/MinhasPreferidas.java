package br.com.denislopes.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + "é sucesso mundial");
        } else {
            System.out.println(audio.getTitulo() + "mais um sucesso fenomenal");
        }
    }

}
