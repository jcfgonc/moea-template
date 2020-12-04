package jcfgonc.moea.specific;

import org.moeaframework.core.Problem;
import org.moeaframework.core.Solution;

import jcfgonc.moea.generic.ProblemDescription;

public class CustomProblem implements Problem, ProblemDescription {

	@Override
	public String getName() {
		return getClass().getSimpleName();
	}

	@Override
	/**
	 * The number of variables defined by this problem.
	 */
	public int getNumberOfVariables() {
		return MOConfig.NUMBER_OF_VARIABLES;
	}

	@Override
	/**
	 * The number of objectives defined by this problem.
	 */
	public int getNumberOfObjectives() {
		return MOConfig.NUMBER_OF_OBJECTIVES;
	}

	@Override
	/**
	 * The number of constraints defined by this problem.
	 */
	public int getNumberOfConstraints() {
		return MOConfig.NUMBER_OF_CONSTRAINTS;
	}

	@Override
	public void close() {
	}

	public CustomProblem() {
	}

	@Override
	public Solution newSolution() {
		// TODO create a new solution here (used when starting the process)
		CustomChromosome pc = new CustomChromosome();
		pc.randomize();

		// do not touch this
		Solution solution = new Solution(getNumberOfVariables(), getNumberOfObjectives(), getNumberOfConstraints());
		solution.setVariable(0, pc); // unless the solution domain X has more than one dimension
		return solution;
	}

	@Override
	public void evaluate(Solution solution) {
		// TODO: the chromosome's objectives are evaluated here
		@SuppressWarnings("unused")
		CustomChromosome pc = (CustomChromosome) solution.getVariable(0); // unless the solution domain X has more than one dimension

		// all these functions store their results in PatternChromosome pc
//		PatternFinderUtils.calculateRelationHistogram(pc);
//		PatternFinderUtils.countPatternMatchesBI(pc, kb);
//		PatternFinderUtils.countCycles(pc);

		// set solution's objectives here
//		solution.setObjective(0, -pc.matches);
//		solution.setObjective(1, -pc.cycles);
//		solution.setObjective(2, -pc.relations.size());

		// set constraints if required here
//		if (pc.matches >= 3) {
//			solution.setConstraint(0, 0); // set to 0 if not OK
//		} else { // all OK
//			solution.setConstraint(0, 1);
//		}
//		if (pc.relations.size() >= 2) {
//			solution.setConstraint(1, 0); // set to 0 if not OK
//		} else { // all OK
//			solution.setConstraint(1, 1);// set to 1 if OK
//		}
	}

	@Override
	public String getObjectiveDescription(int varid) {
		return MOConfig.OBJECTIVE_DESCRIPTION[varid];
	}

	@Override
	public String getConstraintDescription(int varid) {
		return MOConfig.CONSTRAINT_DESCRIPTION[varid];
	}

	@Override
	/**
	 * NOT IMPLEMENTED: this is supposed to be used somewhere, I don't know where (probably in the GUI's title?)
	 */
	public String getProblemDescription() {
		return MOConfig.PROBLEM_DESCRIPTION;
	}

	@Override
	public String getVariableDescription(int varid) {
		return MOConfig.VARIABLE_DESCRIPTION[varid];
	}

}
