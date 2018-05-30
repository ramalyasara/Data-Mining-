/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author cst140048
 */
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import weka.classifiers.Classifier;
import weka.core.converters.ConverterUtils.DataSource;
import weka.core.Instances;
import weka.classifiers.Evaluation;
import weka.classifiers.rules.OneR;
import weka.classifiers.trees.J48;
import weka.gui.treevisualizer.PlaceNode2;
import weka.gui.treevisualizer.TreeVisualizer;

public class DTImplementation {

    public static void main(String[] args) throws Exception {

        String filepath = "C:\\Users\\Yasara\\Documents\\NetBeansProjects\\dataMining\\data set\\test.arff";
        DataSource sourse = new DataSource(filepath);
        Instances data = sourse.getDataSet();        
        data.setClassIndex(data.numAttributes() - 1);
        //Make tree
        J48 tree = new J48();
        String[] options = new String[1];
        options[0] = "-U";
        tree.setOptions(options);
        tree.buildClassifier(data);
        //Print tree
        System.out.println(tree);
        // display classifier
        
  final javax.swing.JFrame jf = 
       new javax.swing.JFrame("Weka Classifier Tree Visualizer: J48");
     jf.setSize(2048,800);
     jf.getContentPane().setLayout(new BorderLayout());
     TreeVisualizer tv = new TreeVisualizer(null,
         tree.graph(),
         new PlaceNode2());
     jf.getContentPane().add(tv, BorderLayout.CENTER);
     jf.addWindowListener(new java.awt.event.WindowAdapter() {
       public void windowClosing(java.awt.event.WindowEvent e) {
         jf.dispose();
       }
     });
 
     jf.setVisible(true);
     tv.fitToScreen();
    }
}
