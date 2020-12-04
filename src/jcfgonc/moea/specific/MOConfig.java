package jcfgonc.moea.specific;

public class MOConfig {
	public static final int POPULATION_SIZE = 4096;
	public static final double MUTATION_RATE = 1.0;
	/**
	 * This is used by the GUI, change this description according to the solution domain (vector X)
	 */
	public static final String[] VARIABLE_DESCRIPTION = { "Blend Space" };
	public static final String[] OBJECTIVE_DESCRIPTION = { "OBJ0", "OBJ1", "OBJ2" };
	public static final String[] CONSTRAINT_DESCRIPTION = {};
	public static final String PROBLEM_DESCRIPTION = "Conceptual Blender: Multi-Objective version";
	public static final int NUMBER_OF_VARIABLES = VARIABLE_DESCRIPTION.length;
	public static final int NUMBER_OF_OBJECTIVES = VARIABLE_DESCRIPTION.length;
	public static final int NUMBER_OF_CONSTRAINTS = VARIABLE_DESCRIPTION.length;
	/**
	 * The mutation requires one parent in its evolve() function.
	 */
	public static final int NUMBER_OF_PARENTS_MUTATION_OPERATOR = 1;

}
