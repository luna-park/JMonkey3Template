package org.lunapark.dev.jmonkey3template;

import com.jme3.app.SimpleApplication;
import com.jme3.asset.TextureKey;
import com.jme3.material.Material;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.texture.Texture;


/**
 * Basic game class
 * Created by znak on 07.04.2017.
 */

public class Game extends SimpleApplication {

    public static void main(String[] args) {
        Game app = new Game();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        Box b = new Box(1, 1, 1);
        Geometry geom = new Geometry("Box", b);

        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        TextureKey key = new TextureKey("Textures/Simple_normal.png");
        Texture tex = assetManager.loadTexture(key);
        mat.setTexture("ColorMap", tex);
        geom.setMaterial(mat);

        rootNode.attachChild(geom);
    }
}
