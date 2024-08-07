package ejercicio7_cap4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazComparacion {

    private JFrame frame;
    private JTextField txtA;
    private JTextField txtB;
    private JTextArea txtResultado;

    public InterfazComparacion() {
        // Crear la ventana principal
        frame = new JFrame("Comparación de Valores");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        // Crear componentes
        JLabel lblA = new JLabel("Valor de A:");
        JLabel lblB = new JLabel("Valor de B:");

        txtA = new JTextField();
        txtB = new JTextField();

        JButton btnComparar = new JButton("Comparar");
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        // Agregar componentes al panel
        frame.add(lblA);
        frame.add(txtA);
        frame.add(lblB);
        frame.add(txtB);
        frame.add(new JLabel()); // Espacio vacío
        frame.add(btnComparar);
        frame.add(new JLabel()); // Espacio vacío
        frame.add(new JScrollPane(txtResultado));

        // Configurar acción del botón
        btnComparar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compararYMostrar();
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }

    private void compararYMostrar() {
        try {
            // Leer los valores de los campos de texto
            double A = Double.parseDouble(txtA.getText());
            double B = Double.parseDouble(txtB.getText());

            // Comparar los valores
            String resultado;
            if (A > B) {
                resultado = "A es mayor que B";
            } else if (A == B) {
                resultado = "A es igual a B";
            } else {
                resultado = "A es menor que B";
            }

            // Mostrar el resultado
            txtResultado.setText(resultado);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Por favor, ingrese valores numéricos válidos.",
                                          "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InterfazComparacion());
    }
}
