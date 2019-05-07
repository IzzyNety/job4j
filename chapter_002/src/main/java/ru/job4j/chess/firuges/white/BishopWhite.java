package ru.job4j.chess.firuges.white;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.ImpossibleMoveException;

public class BishopWhite implements Figure {
    private final Cell position;

    public BishopWhite(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        if (isDiagonal(source, dest)) {
            throw new ImpossibleMoveException("The Bishop moves is diagonally!");
        }
        int size = Math.abs(source.y - dest.y);
        Cell[] steps = new Cell[size];
        int deltaX = (source.x - dest.x) < 0 ? 1 : -1;
        int deltaY = (source.y - dest.y) < 0 ? 1 : -1;
        int stepX = source.x + deltaX;
        int stepY = source.y + deltaY;
        for (int index = 0; index < size; index++) {
            steps[index] = Cell.getStep(stepX, stepY);
            stepX += deltaX;
            stepY += deltaY;
        }
        return steps;
    }

    private boolean isDiagonal(Cell source, Cell dest) {
        boolean result = false;
        if (Math.abs(source.x - dest.x) != Math.abs(source.y - dest.y)) {
            result = true;
        }
        return result;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopWhite(dest);
    }
}
