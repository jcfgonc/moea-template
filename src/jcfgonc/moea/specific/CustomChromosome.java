package jcfgonc.moea.specific;

import org.apache.commons.math3.random.RandomGenerator;
import org.moeaframework.core.Variable;

/**
 * This class represents the problem domain X, as a single dimension.
 * 
 * @author jcfgonc@gmail.com
 *
 */
public class CustomChromosome implements Variable {

	private static final long serialVersionUID = 1449562469642194508L;
	public static RandomGenerator random = null; // don't forget to set this externally and prior to the usage of this class

	/**
	 * used to reset internal fields, ie, setup a barebones chromosome
	 */
	public void resetInternals() {
		// reset/clear the internal fields here
	}

	public CustomChromosome() { // you may require an argument here
		super();
		resetInternals();
		// TODO: do the copy constructor here
	}

	public CustomChromosome(CustomChromosome other) {
		super();
		// TODO: copy fields here
	}

	@Override
	public CustomChromosome copy() {
		return new CustomChromosome(this);
	}

	@Override
	/**
	 * reuses internal data (minimizes data copying) and randomizes internal fields
	 */
	public void randomize() {
		// TODO: randomize the chromosome here
	}

	@Override
	public String toString() {
		// TODO: toString()
		return "toString() undefined";
	}

	public void mutate() {
		// TODO: mutation operator
		// do the mutation IN-PLACE
		// use the static random if required
	}

}
