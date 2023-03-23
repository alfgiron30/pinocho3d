
import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import javax.media.j3d.*;
import javax.vecmath.*;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;
/**
 *
 * @author Alfredo Giron
 */
public class Pinocho extends JFrame {

    public Pinocho() {
        this.setSize(800, 800);
        this.setTitle("JAVA3D EGAM");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.setProperty("sun.awt.noerasebackground", "true");

        GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
        Canvas3D canvas = new Canvas3D(config);
        SimpleUniverse universo = new SimpleUniverse(canvas);
        BranchGroup group = new BranchGroup();
        universo.getViewingPlatform().setNominalViewingTransform();

        TransformGroup mouseGrupo = new TransformGroup();
        mouseGrupo.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        mouseGrupo.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        group.addChild(mouseGrupo);

        Appearance ap = new Appearance();
        Color3f color = new Color3f(0.0f, 0.0f, 1.0f);
        ColoringAttributes ca = new ColoringAttributes();
        ca.setColor(color);
        ap.setColoringAttributes(ca);
        Box cube = new Box(0.183f, 0.2f, 0.2f, ap);
        Transform3D cubeTransform = new Transform3D();
        cubeTransform.setTranslation(new Vector3f(0.0f, -0.05f, 0.1f));
        TransformGroup cubeTG = new TransformGroup(cubeTransform);
        cubeTG.addChild(cube);
        mouseGrupo.addChild(cubeTG);
       
        ap = new Appearance();
        color = new Color3f(1.0f, 1.0f, 0.0f);
        ca = new ColoringAttributes();
        ca.setColor(color);
        ap.setColoringAttributes(ca);
        Sphere sphere = new Sphere(0.20f, ap);
        Transform3D sphereTransform = new Transform3D();
        sphereTransform.setTranslation(new Vector3f(0.0f, .35f, 0.1f));
        TransformGroup sphereTG = new TransformGroup(sphereTransform);
        sphereTG.addChild(sphere);
        mouseGrupo.addChild(sphereTG);
        
        ap = new Appearance();
        color = new Color3f(.6f, 0.25f, 0.3f);
        ca = new ColoringAttributes();
        ca.setColor(color);
        ap.setColoringAttributes(ca);
        Cylinder cilindro = new Cylinder(0.05f, 0.4f, ap);
        Transform3D ciliTransform = new Transform3D();
        ciliTransform.setTranslation(new Vector3f(.25f, -.05f, 0.1f));
        TransformGroup ciliTG = new TransformGroup(ciliTransform);
        ciliTG.addChild(cilindro);
        mouseGrupo.addChild(ciliTG);
        
        ap = new Appearance();
        color = new Color3f(1.0f, .2f, 0.8f); 
        ca = new ColoringAttributes();
        ca.setColor(color);
        ap.setColoringAttributes(ca);
        Cylinder cilindroi = new Cylinder(0.05f, 0.4f, ap);
        Transform3D ciliTransformi = new Transform3D();
        ciliTransformi.rotX(Math.toRadians(45));
        ciliTransformi.setTranslation(new Vector3f(-0.25f, -.05f, 0.0f));
        TransformGroup ciliTGi = new TransformGroup(ciliTransformi);
        ciliTGi.addChild(cilindroi);
        mouseGrupo.addChild(ciliTGi);
        
        ap = new Appearance();
        color = new Color3f(1.0f, 0.5f, 0.0f); 
        ca = new ColoringAttributes();
        ca.setColor(color);
        ap.setColoringAttributes(ca);
        Box prisma = new Box(0.05f, 0.4f, 0.05f, ap);
        Transform3D prismaTransformi = new Transform3D();
        prismaTransformi.setTranslation(new Vector3f(-0.10f, -.5f, 0.1f));
        TransformGroup prismaTGi = new TransformGroup(prismaTransformi);
        prismaTGi.addChild(prisma);
        mouseGrupo.addChild(prismaTGi);
        
        ap = new Appearance();
        color = new Color3f(0.0f, 0.5f, 0.0f); 
        ca = new ColoringAttributes();
        ca.setColor(color);
        ap.setColoringAttributes(ca);
        Box pierna2 = new Box(0.05f, 0.4f, 0.05f, ap);
        Transform3D prismaTransformi2 = new Transform3D();
        prismaTransformi2.setTranslation(new Vector3f(0.10f, -.5f, 0.1f));
        TransformGroup prismaTGi2 = new TransformGroup(prismaTransformi2);
        prismaTGi2.addChild(pierna2);
        mouseGrupo.addChild(prismaTGi2);
        
        ap = new Appearance();
        color = new Color3f(0.894f, 0.0f, 0.471f); 
        ca = new ColoringAttributes();
        ca.setColor(color);
        ap.setColoringAttributes(ca);
        Sphere ojo1 = new Sphere(0.02f, ap);
        Transform3D ojo1Transform = new Transform3D();
        ojo1Transform.setTranslation(new Vector3f(0.05f, .40f, 0.28f));
        TransformGroup ojo1TG = new TransformGroup(ojo1Transform);
        ojo1TG.addChild(ojo1);
        mouseGrupo.addChild(ojo1TG);
        
        ap = new Appearance();
        color = new Color3f(0.0f, 0.0f, 0.0f); 
        ca = new ColoringAttributes();
        ca.setColor(color);
        ap.setColoringAttributes(ca);
        Sphere ojo2 = new Sphere(0.02f, ap);
        Transform3D ojo2Transform = new Transform3D();
        ojo2Transform.setTranslation(new Vector3f(-0.05f, .40f, 0.28f));
        TransformGroup ojo2TG = new TransformGroup(ojo2Transform);
        ojo2TG.addChild(ojo2);
        mouseGrupo.addChild(ojo2TG);
        
        ap = new Appearance();
        color = new Color3f(1.0f, 1.0f, 1.0f); 
        ca = new ColoringAttributes();
        ca.setColor(color);
        ap.setColoringAttributes(ca);
        Cone cono = new Cone(0.2f, 0.5f, ap);
        Transform3D conoTransform = new Transform3D();
        conoTransform.setTranslation(new Vector3f(0.0f, 0.4f, 0.1f));
        TransformGroup conoTG = new TransformGroup(conoTransform);
        conoTG.addChild(cono);
        mouseGrupo.addChild(conoTG);
        
        ap = new Appearance();
        color = new Color3f(.780f, 1.0f, .60f); 
        ca = new ColoringAttributes();
        ca.setColor(color);
        ap.setColoringAttributes(ca);
        Cone sombrero2 = new Cone(0.18f, 0.3f, ap);
        Transform3D sombrero2Transform = new Transform3D();
        sombrero2Transform.setTranslation(new Vector3f(0.0f, 0.65f, 0.1f));
        TransformGroup sombrero2TG = new TransformGroup(sombrero2Transform);
        sombrero2TG.addChild(sombrero2);
        mouseGrupo.addChild(sombrero2TG);
        
        ap = new Appearance();
        color = new Color3f(1.0f, 0.5f, 1.0f);
        ca = new ColoringAttributes();
        ca.setColor(color);
        ap.setColoringAttributes(ca);
        Box sombrero = new Box(0.2f, .03f, 0.2f, ap);
        Transform3D sombreroTransformi2 = new Transform3D();
        sombreroTransformi2.setTranslation(new Vector3f(0.0f, .50f, 0.1f));
        TransformGroup sombreroTGi2 = new TransformGroup(sombreroTransformi2);
        sombreroTGi2.addChild(sombrero);
        mouseGrupo.addChild(sombreroTGi2);
        
        ap = new Appearance();
        color = new Color3f(82/255.0f, 45/255.0f, 19/255.0f); 
        ca = new ColoringAttributes();
        ca.setColor(color);
        ap.setColoringAttributes(ca);
        Box boca = new Box(0.08f, .02f, 0.1f, ap);
        Transform3D bocaTransformi2 = new Transform3D();
        bocaTransformi2.setTranslation(new Vector3f(0.0f, .30f, 0.2f));
        TransformGroup bocaTGi2 = new TransformGroup(bocaTransformi2);
        bocaTGi2.addChild(boca);
        mouseGrupo.addChild(bocaTGi2);
        
        ap = new Appearance();
        color = new Color3f(0.5f, 1.0f, 0.0f); 
        ca = new ColoringAttributes();
        ca.setColor(color);
        ap.setColoringAttributes(ca);
        Cone nose = new Cone(0.025f, 1.5f, ap);
        Transform3D noseTransform = new Transform3D();
        noseTransform.rotX(Math.toRadians(90));
        noseTransform.setTranslation(new Vector3f(0.0f, 0.36f, 0.8f));
        //noseTransform.rotY(Math.PI/4.0);
        TransformGroup noseTG = new TransformGroup(noseTransform);
        noseTG.addChild(nose);
        mouseGrupo.addChild(noseTG);
        
        ap = new Appearance();
        color = new Color3f(1.0f, 1.0f, 0.0f);
        ca = new ColoringAttributes();
        ca.setColor(color);
        ap.setColoringAttributes(ca);
        Sphere mano = new Sphere(0.07f, ap);
        Transform3D manoTransform = new Transform3D();
        manoTransform.setTranslation(new Vector3f(-0.25f, -.20f, -0.16f));
        TransformGroup manoTG = new TransformGroup(manoTransform);
        manoTG.addChild(mano);
        mouseGrupo.addChild(manoTG);
        
        ap = new Appearance();
        color = new Color3f(1.0f, 1.0f, 0.0f);
        ca = new ColoringAttributes();
        ca.setColor(color);
        ap.setColoringAttributes(ca);
        Sphere mano2 = new Sphere(0.07f, ap);
        Transform3D mano2Transform = new Transform3D();
        mano2Transform.setTranslation(new Vector3f(0.25f, -.3f, 0.1f));
        TransformGroup mano2TG = new TransformGroup(mano2Transform);
        mano2TG.addChild(mano2);
        mouseGrupo.addChild(mano2TG);
        
        ap = new Appearance();
        color = new Color3f(83/67.0f, 45/175.0f, 19/241.0f);
        ca = new ColoringAttributes();
        ca.setColor(color);
        ap.setColoringAttributes(ca);
        Box pie = new Box(0.08f, .02f, 0.1f, ap);
        Transform3D pieTransformi2 = new Transform3D();
        pieTransformi2.setTranslation(new Vector3f(0.10f, -.9f, 0.1f));
        TransformGroup pieTGi2 = new TransformGroup(pieTransformi2);
        pieTGi2.addChild(pie);
        mouseGrupo.addChild(pieTGi2);
        
        ap = new Appearance();
        color = new Color3f(0.2f, 0.5f, 0.0f); // vegde
        ca = new ColoringAttributes();
        ca.setColor(color);
        ap.setColoringAttributes(ca);
        Box pie2 = new Box(0.08f, .02f, 0.1f, ap);
        Transform3D pie2Transformi2 = new Transform3D();
        pie2Transformi2.setTranslation(new Vector3f(-0.10f, -.9f, 0.1f));
        TransformGroup pie2TGi2 = new TransformGroup(pie2Transformi2);
        pie2TGi2.addChild(pie2);
        mouseGrupo.addChild(pie2TGi2);
     
        MouseRotate mr = new MouseRotate();
        mr.setTransformGroup(mouseGrupo);
        mr.setSchedulingBounds(new BoundingSphere(new Point3d(), 1000f));
        group.addChild(mr);

        universo.addBranchGraph(group);

        Container contentPane = (Container)this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(canvas, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        Pinocho pinocho = new Pinocho();
        pinocho.setVisible(true);
    }
}
