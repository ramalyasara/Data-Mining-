/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author CST140048
 */
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class naive {
    
    public static void main(String[] args) {
        String filepath="C:\\Users\\Yasara\\Documents\\NetBeansProjects\\dataMining\\data set\\test.arff";
        
        try {
        
            //reading all the instances from the arff file
            DataSource source = new DataSource(filepath);
            Instances dataset = source.getDataSet();
            
            //Setting up the class index to last attribute
            //setClassIndex is used to define the attribute that will represent the class(for prediction purposes)
            dataset.setClassIndex(dataset.numAttributes() -1);
            
            NaiveBayes nb = new NaiveBayes();
            nb.buildClassifier(dataset);
      
            
            //print the output
            System.out.println("The rule derived is : ");
            
            System.out.println(nb.toString());
            
            
        }
        catch(Exception e){
        
            e.printStackTrace();
        }
    }
}