package br.pro.hashi.ensino.desagil.desafio;

import br.pro.hashi.ensino.desagil.desafio.model.Model;
import br.pro.hashi.ensino.desagil.desafio.model.CpuPlayer;
import br.pro.hashi.ensino.desagil.desafio.model.HumanPlayer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener, ActionListener {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void keyTyped(KeyEvent event) {
    }

    @Override
    public void keyPressed(KeyEvent event) {
        HumanPlayer humanPlayer = model.getHumanPlayer();

        switch (event.getKeyCode()) {
            case KeyEvent.VK_UP:
                humanPlayer.moveUp();
                break;
            case KeyEvent.VK_RIGHT:
                humanPlayer.moveRight();
                break;
            case KeyEvent.VK_DOWN:
                humanPlayer.moveDown();
                break;
            case KeyEvent.VK_LEFT:
                humanPlayer.moveLeft();
                break;
        }
        view.repaint();
    }

    @Override
    public void keyReleased(KeyEvent event) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CpuPlayer cpuPlayer = model.getCpuPlayer();

        cpuPlayer.move();

        view.repaint();
    }
}
