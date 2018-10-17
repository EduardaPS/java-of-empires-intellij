package personagens;

import javax.swing.*;
import java.awt.*;

public class Personagem {

    private JPanel pai;  // referência ao JPanel onde será desenhado o Aldeao
    private Image icone; // imagem do Aldeao
    private String imagemNome; // nome da imagem do Aldeao
    private int largura; // largura da imagem
    private int altura;  // altura da imagem
    private int posX;    // posição X no JPanel onde a imagem será desenhada
    private int posY;    // posição Y no JPanel onde a imagem será desenhada
    private boolean atacando; // indica se está atacando ou não

    public Personagem(JPanel p, String img, int x, int y) {

        this.imagemNome = img;
        this.icone = this.carregarImagem(this.imagemNome);
        this.largura = this.icone.getWidth(null);
        this.altura = this.icone.getHeight(null);

        this.pai = p;
        this.posX = x;
        this.posY = y;
        this.atacando = false;
    }
}
