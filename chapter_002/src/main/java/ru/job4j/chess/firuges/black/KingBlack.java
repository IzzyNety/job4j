package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.ImpossibleMoveException;

public class KingBlack implements Figure {
    private final Cell position;

    public KingBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        if (imposibleMove(source, dest)) {
            throw new ImpossibleMoveException("The King only walks in once cell!");
        }
        return new Cell[]{dest};
    }

    private boolean imposibleMove(Cell source, Cell dest) {
        boolean result = false;
        if (!(Math.abs(dest.x - source.x) == 1 || Math.abs(dest.y - source.y) == 1)) {
            result = true;
        }
        return result;
    }

    @Override
    public Figure copy(Cell dest) {
        return new KingBlack(dest);
    }
}
