package main;

import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CustomCellRenderer extends DefaultTableCellRenderer {
    private static final long serialVersionUID = -756446113683862516L;
	private Set<Point> highlightedCells = new HashSet<>();

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus,
                                                   int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (highlightedCells.contains(new Point(row, column))) {
            c.setBackground(Color.RED);
        } else {
            if (isSelected) {
                c.setBackground(table.getSelectionBackground());
            } else {
                c.setBackground(table.getBackground());
            }
        }
        return c;
    }

    public void addHighlightedCell(int row, int column) {
        highlightedCells.add(new Point(row, column));
    }

    public void clearHighlightedCells() {
        highlightedCells.clear();
    }
}