/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import weka.classifiers.rules.OneR;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
/**
 *
 * @author cst140040
 */
public class R1Algorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filepath="C:\\Users\\Yasara\\Documents\\NetBeansProjects\\dataMining\\data set\\test.arff";        
        try{
            //Reading all the instances from arff file
            DataSource source = new DataSource(filepath);
            Instances dataset = source.getDataSet();
            
            //Setting up the class index to last attribute
            //setClassIndex is used to define the attribute that will represent the class (for prediction purposes)
            dataset.setClassIndex(dataset.numAttributes() - 1);
            
            //create the OneR classifier
            OneR or = new OneR();
            or.buildClassifier(dataset);
            
            //Output
            System.out.println("The rule derived is: ");
            System.out.println(or.toString());
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
}
