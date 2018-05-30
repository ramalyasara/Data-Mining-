


//import required classes
import weka.associations.Apriori;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class AssocRules{
	public static void main(String args[]) throws Exception{
		//load dataset
		String dataset = "C:\\Users\\Yasara\\Documents\\NetBeansProjects\\dataMining\\data set\\test.arff";
		DataSource source = new DataSource(dataset);
		//get instances object 
		Instances data = source.getDataSet();
		//the Apriori algorithm
		Apriori model = new Apriori();
		//build model
		model.buildAssociations(data);
		//print out the extracted rules
		System.out.println(model);
	}
}