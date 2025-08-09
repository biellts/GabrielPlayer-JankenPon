package br.edu.ifnmg.poo.gabriel.janken;

import io.github.guisso.jankenpon.AbstractPlayer;
import io.github.guisso.jankenpon.Move;

public class GabrielFranciscoPlayer extends AbstractPlayer {

    @Override
    public String getDeveloperName() {
        return "Gabriel Francisco";
    }

    @Override
    public Move makeMyMove(Move opponentPreviousMove) {
        if (opponentPreviousMove == null || opponentPreviousMove == Move.NONE) {
            return Move.ROCK; // Primeira jogada sempre Pedra
        }
        return switch (opponentPreviousMove) {
            case ROCK -> Move.PAPER;       // Ganha da Pedra
            case PAPER -> Move.SCISSORS;   // Ganha do Papel
            case SCISSORS -> Move.ROCK;    // Ganha da Tesoura
            default -> Move.ROCK;
        };
    }
}
