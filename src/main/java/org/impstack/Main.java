package org.impstack;

import com.jme3.app.StatsAppState;
import com.jme3.app.state.AppState;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import org.impstack.jme.JmeLauncher;
import org.impstack.jme.scene.GeometryUtils;

public class Main extends JmeLauncher {

    public static void main( String... args ) {
        Main main = new Main(new StatsAppState());
        main.start();
    }

    public Main(AppState... initialStates) {
        super(initialStates);
    }

    @Override
    public void init() {
        Geometry geometry = new GeometryUtils(this).createGeometry(new Box(1, 1, 1), ColorRGBA.Blue, "Textures/Monkey.png");
        rootNode.attachChild(geometry);
    }

}
