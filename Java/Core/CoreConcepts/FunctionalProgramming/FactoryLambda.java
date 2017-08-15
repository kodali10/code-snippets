//Commented part is without using lambda
package com.kodali.FunctionalProgramming;

@FunctionalInterface
interface SaveInterface {

	void save();
}

class FactorySave {
	public static SaveInterface getType(String saveType) {
		switch (saveType) {

		/*
		 * case "xml": return new SaveInterface(){
		 * 
		 * @Override public void save(){ System.out.println("Save to xml"); } };
		 */

		case "xml":
			return () -> System.out.println("Saved to xml");
		case "json":
			return () -> System.out.println("Saved to JSON");

		}
		return null;

	}

}

public class FactoryLambda {

	public static void main(String[] args) {
		String saveType = "xml";
		SaveInterface obj = FactorySave.getType(saveType);
		obj.save();
	}

}