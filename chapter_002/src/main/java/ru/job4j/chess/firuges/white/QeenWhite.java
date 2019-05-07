package ru.job4j.chess.firuges.white;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.ImpossibleMoveException;

public class QeenWhite implements Figure {
    private final Cell position;

    public QeenWhite(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        if (isVerticalOrHorizontal(source, dest) && isDiagonal(source, dest)) {
            throw new ImpossibleMoveException("The Queen moves only horizontally, vertically or diagonally!");
        }
        int size = 0;
        int deltaX = 0;
        int deltaY = 0;
        if (!isVerticalOrHorizontal(source, dest)) {
            if (dest.x == source.x) {
                deltaY = (dest.y - source.y) > 0 ? 1 : -1;
                size = Math.abs(dest.y - source.y);
            } else if (dest.y == source.y) {
                deltaX = (dest.x - source.x) > 0 ? 1 : -1;
                size = Math.abs(dest.x - source.x);
            }
        } else if (!isDiagonal(source, dest)) {
            deltaX = (dest.x - source.x) < 0 ? -1 : 1;
            deltaY = (dest.y - source.y) < 0 ? -1 : 1;
            size = Math.abs(source.y - dest.y);
        }
        Cell[] steps = new Cell[size];
        int stepX = source.x + deltaX;
        int stepY = source.y + deltaY;
        for (int index = 0; index < size; index++) {
            steps[index] = Cell.getStep(stepX, stepY);
            stepX += deltaX;
            stepY += deltaY;
        }
        return steps;
    }

    private boolean isVerticalOrHorizontal(Cell source, Cell dest) {
        boolean result = false;
        if (!(source.y == dest.y || source.x == dest.x)) {
            result = true;
        }
        return result;
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
        return new QeenWhite(dest);
    }
}
