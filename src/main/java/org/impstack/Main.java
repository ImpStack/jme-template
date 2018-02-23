package org.impstack;

import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.texture.Texture;
import org.impstack.jme.JmeLauncher;

public class Main extends JmeLauncher {

    public static void main( String... args ) {
        Main main = new Main();
        main.start();
    }

    @Override
    public void init() {
        Box box = new Box(1, 1, 1);
        Geometry geom = new Geometry("box", box);
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Blue);

        Texture texture = assetManager.loadTexture("Textures/Monkey.png");
        mat.setTexture("ColorMap", texture);

        geom.setMaterial(mat);
        rootNode.attachChild(geom);
    }

}
