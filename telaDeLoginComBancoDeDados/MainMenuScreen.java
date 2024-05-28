import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class MainMenuScreen extends JFrame {

  public MainMenuScreen() {

    setTitle("Menu Principal");

    setSize(400, 300);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setLocationRelativeTo(null); // Centralize a tela

    JMenuBar menuBar = new JMenuBar();

    JMenu menuOpcoes = new JMenu("Opções");

    JMenuItem opcao1 = new JMenuItem("Opção 1");

    JMenuItem opcao2 = new JMenuItem("Opção 2");

    JMenuItem opcao3 = new JMenuItem("Opção 3");

    JMenuItem opcao4 = new JMenuItem("Opção 4");

    JMenuItem opcao5 = new JMenuItem("Opção 5");

    menuOpcoes.add(opcao1);

    menuOpcoes.add(opcao2);

    menuOpcoes.add(opcao3);

    menuOpcoes.add(opcao4);

    menuOpcoes.add(opcao5);

    menuBar.add(menuOpcoes);

    JButton botaoSair = new JButton("Sair do Sistema");

    botaoSair.addActionListener(new ActionListener() {

      @Override

      public void actionPerformed(ActionEvent e) {

        System.exit(0);

      }

    });

    JPanel panel = new JPanel();

    panel.add(botaoSair);

    setJMenuBar(menuBar);

    add(panel);

  }

}

public class LoginScreen extends JFrame implements ActionListener {

  private JTextField usernameField;

  private JPasswordField passwordField;

  private JButton loginButton;

  private JButton resetPasswordButton;

  public LoginScreen() {

    // Seu código existente...

    if (login(username, password)) {

      JOptionPane.showMessageDialog(this, "Login bem-sucedido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

      // Abrir a próxima janela do aplicativo após o login

      dispose(); // Fechar a tela de login

      new MainMenuScreen().setVisible(true); // Abrir a próxima tela do menu principal

    } else {

      // Seu código existente...

    }

  }

}
