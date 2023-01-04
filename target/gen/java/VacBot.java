/**
 * GENERATED CODE - DO NOT CHANGE
 */

import astra.core.*;
import astra.execution.*;
import astra.event.*;
import astra.messaging.*;
import astra.formula.*;
import astra.lang.*;
import astra.statement.*;
import astra.term.*;
import astra.type.*;
import astra.tr.*;
import astra.reasoner.util.*;


public class VacBot extends ASTRAClass {
	public VacBot() {
		setParents(new Class[] {astra.lang.Agent.class});
		addInference(new Inference(
			new Predicate("free", new Term[] {
				new Variable(Type.STRING, "Sq",false)
			}),
			new ModuleFormula("ei",
				new Predicate("square", new Term[] {
					new Variable(Type.STRING, "Sq"),
					Primitive.newPrimitive("dust")
				}),
				new ModuleFormulaAdaptor() {
					public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
						return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
					}
				}
			)
		));
		addInference(new Inference(
			new Predicate("free", new Term[] {
				new Variable(Type.STRING, "Sq",false)
			}),
			new ModuleFormula("ei",
				new Predicate("square", new Term[] {
					new Variable(Type.STRING, "Sq"),
					Primitive.newPrimitive("empty")
				}),
				new ModuleFormulaAdaptor() {
					public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
						return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
					}
				}
			)
		));
		addInference(new Inference(
			new Predicate("route", new Term[] {
				new Variable(Type.LIST, "L",false)
			}),
			new Predicate("routelist", new Term[] {
				new Variable(Type.LIST, "L")
			})
		));
		addRule(new Rule(
			"VacBot", new int[] {33,10,33,55},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("task", new Term[] {
						Primitive.newPrimitive("none")
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("VacBot","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			new Predicate("counter", new Term[] {
				new Variable(Type.INTEGER, "count",false)
			}),
			new Block(
				"VacBot", new int[] {33,54,43,6},
				new Statement[] {
					new Subgoal(
						"VacBot", new int[] {34,10,43,6},
						new Goal(
							new Predicate("update", new Term[] {})
						)
					),
					new BeliefUpdate('-',
						"VacBot", new int[] {35,10,43,6},
						new Predicate("counter", new Term[] {
							new Variable(Type.INTEGER, "count")
						})
					),
					new BeliefUpdate('+',
						"VacBot", new int[] {36,10,43,6},
						new Predicate("counter", new Term[] {
							Operator.newOperator('+',
								new Variable(Type.INTEGER, "count"),
								Primitive.newPrimitive(1)
							)
						})
					),
					new If(
						"VacBot", new int[] {37,10,43,6},
						new Comparison("==",
							new Variable(Type.INTEGER, "count"),
							Primitive.newPrimitive(20)
						),
						new Block(
							"VacBot", new int[] {37,26,39,11},
							new Statement[] {
								new Subgoal(
									"VacBot", new int[] {38,15,39,11},
									new Goal(
										new Predicate("route", new Term[] {
											new Variable(Type.STRING, "action",false)
										})
									)
								)
							}
						),
						new Block(
							"VacBot", new int[] {40,14,43,6},
							new Statement[] {
								new Subgoal(
									"VacBot", new int[] {41,15,42,11},
									new Goal(
										new Predicate("task", new Term[] {
											new Variable(Type.STRING, "action",false)
										})
									)
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {47,10,47,67},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("location", new Term[] {
						new Variable(Type.LONG, "X",false),
						new Variable(Type.LONG, "Y",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("VacBot","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			new Predicate("counter", new Term[] {
				new Variable(Type.INTEGER, "count",false)
			}),
			new Block(
				"VacBot", new int[] {47,66,57,6},
				new Statement[] {
					new Subgoal(
						"VacBot", new int[] {48,10,57,6},
						new Goal(
							new Predicate("update", new Term[] {})
						)
					),
					new BeliefUpdate('-',
						"VacBot", new int[] {49,10,57,6},
						new Predicate("counter", new Term[] {
							new Variable(Type.INTEGER, "count")
						})
					),
					new BeliefUpdate('+',
						"VacBot", new int[] {50,10,57,6},
						new Predicate("counter", new Term[] {
							Operator.newOperator('+',
								new Variable(Type.INTEGER, "count"),
								Primitive.newPrimitive(1)
							)
						})
					),
					new If(
						"VacBot", new int[] {51,10,57,6},
						new Comparison("==",
							new Variable(Type.INTEGER, "count"),
							Primitive.newPrimitive(20)
						),
						new Block(
							"VacBot", new int[] {51,26,53,11},
							new Statement[] {
								new Subgoal(
									"VacBot", new int[] {52,15,53,11},
									new Goal(
										new Predicate("route", new Term[] {
											new Variable(Type.STRING, "action",false)
										})
									)
								)
							}
						),
						new Block(
							"VacBot", new int[] {54,14,57,6},
							new Statement[] {
								new Subgoal(
									"VacBot", new int[] {55,15,56,11},
									new Goal(
										new Predicate("task", new Term[] {
											new Variable(Type.STRING, "action",false)
										})
									)
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {60,10,60,55},
			new GoalEvent('+',
				new Goal(
					new Predicate("go", new Term[] {
						new Funct("move", new Term[] {
							new Variable(Type.STRING, "direction",false)
						}),
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"VacBot", new int[] {60,54,68,6},
				new Statement[] {
					new ModuleCall("C",
						"VacBot", new int[] {61,10,61,48},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("direction 2: "),
								new Variable(Type.STRING, "direction")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("VacBot","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("ei",
						"VacBot", new int[] {63,10,63,28},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "direction")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {64,10,68,6},
						new Variable(Type.STRING, "direction")
					),
					new Subgoal(
						"VacBot", new int[] {66,10,68,6},
						new Goal(
							new Predicate("update", new Term[] {})
						)
					),
					new Subgoal(
						"VacBot", new int[] {67,10,68,6},
						new Goal(
							new Predicate("task", new Term[] {
								new Variable(Type.STRING, "action")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {72,10,72,55},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new Predicate("route", new Term[] {
				new ListTerm(new Term[] {
					new Variable(Type.FUNCTION, "move",false)
				})
			}),
			new Block(
				"VacBot", new int[] {72,54,78,6},
				new Statement[] {
					new ModuleCall("C",
						"VacBot", new int[] {73,10,73,43},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("direction 1: "),
								new Variable(Type.FUNCTION, "move")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("VacBot","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"VacBot", new int[] {75,10,78,6},
						new Predicate("route", new Term[] {
							new ListTerm(new Term[] {
								new Variable(Type.FUNCTION, "move")
							})
						})
					),
					new Subgoal(
						"VacBot", new int[] {76,10,78,6},
						new Goal(
							new Predicate("go", new Term[] {
								new Variable(Type.FUNCTION, "move"),
								new Variable(Type.STRING, "action")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {79,10,79,63},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new Predicate("route", new Term[] {
				new ListSplitter(
					new Variable(Type.FUNCTION, "move",false),
					new Variable(Type.LIST, "L",false)
				)
			}),
			new Block(
				"VacBot", new int[] {79,62,84,6},
				new Statement[] {
					new ModuleCall("C",
						"VacBot", new int[] {80,10,80,44},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("direction 1a: "),
								new Variable(Type.FUNCTION, "move")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("VacBot","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("C",
						"VacBot", new int[] {81,10,81,35},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("action: "),
								new Variable(Type.LIST, "L")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("VacBot","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new SpecialBeliefUpdate(
						"VacBot", new int[] {82,10,84,6},
						new Predicate("route", new Term[] {
							new Variable(Type.LIST, "L")
						})
					),
					new Subgoal(
						"VacBot", new int[] {83,10,84,6},
						new Goal(
							new Predicate("go", new Term[] {
								new Variable(Type.FUNCTION, "move"),
								new Variable(Type.STRING, "action")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {86,10,86,61},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new ModuleFormula("ei",
				new Predicate("square", new Term[] {
					Primitive.newPrimitive("here"),
					Primitive.newPrimitive("dust")
				}),
				new ModuleFormulaAdaptor() {
					public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
						return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
					}
				}
			),
			new Block(
				"VacBot", new int[] {86,60,92,6},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {87,10,87,20},
						new Predicate("clean", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Subgoal(
						"VacBot", new int[] {90,10,92,6},
						new Goal(
							new Predicate("task", new Term[] {
								new Variable(Type.STRING, "action")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {94,10,94,82},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new AND(
				new ModuleFormula("ei",
					new Predicate("square", new Term[] {
						Primitive.newPrimitive("forward"),
						Primitive.newPrimitive("dust")
					}),
					new ModuleFormulaAdaptor() {
						public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
							return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				),
				new Predicate("free", new Term[] {
					Primitive.newPrimitive("forward")
				})
			),
			new Block(
				"VacBot", new int[] {94,81,97,6},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {95,10,95,28},
						new Predicate("move", new Term[] {
							Primitive.newPrimitive("forward")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {96,10,97,6},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {98,10,98,75},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new AND(
				new ModuleFormula("ei",
					new Predicate("square", new Term[] {
						Primitive.newPrimitive("left"),
						Primitive.newPrimitive("dust")
					}),
					new ModuleFormulaAdaptor() {
						public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
							return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				),
				new Predicate("free", new Term[] {
					Primitive.newPrimitive("left")
				})
			),
			new Block(
				"VacBot", new int[] {98,74,101,6},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {99,10,99,25},
						new Predicate("move", new Term[] {
							Primitive.newPrimitive("left")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {100,10,101,6},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {102,10,102,77},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new AND(
				new ModuleFormula("ei",
					new Predicate("square", new Term[] {
						Primitive.newPrimitive("right"),
						Primitive.newPrimitive("dust")
					}),
					new ModuleFormulaAdaptor() {
						public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
							return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				),
				new Predicate("free", new Term[] {
					Primitive.newPrimitive("right")
				})
			),
			new Block(
				"VacBot", new int[] {102,76,105,6},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {103,10,103,26},
						new Predicate("move", new Term[] {
							Primitive.newPrimitive("right")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {104,10,105,6},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {106,10,106,83},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new AND(
				new ModuleFormula("ei",
					new Predicate("square", new Term[] {
						Primitive.newPrimitive("forwardLeft"),
						Primitive.newPrimitive("dust")
					}),
					new ModuleFormulaAdaptor() {
						public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
							return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				),
				new Predicate("free", new Term[] {
					Primitive.newPrimitive("forward")
				})
			),
			new Block(
				"VacBot", new int[] {106,82,109,6},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {107,10,107,28},
						new Predicate("move", new Term[] {
							Primitive.newPrimitive("forward")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {108,10,109,6},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {110,10,110,84},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new AND(
				new ModuleFormula("ei",
					new Predicate("square", new Term[] {
						Primitive.newPrimitive("forwardRight"),
						Primitive.newPrimitive("dust")
					}),
					new ModuleFormulaAdaptor() {
						public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
							return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				),
				new Predicate("free", new Term[] {
					Primitive.newPrimitive("forward")
				})
			),
			new Block(
				"VacBot", new int[] {110,83,113,6},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {111,10,111,28},
						new Predicate("move", new Term[] {
							Primitive.newPrimitive("forward")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {112,10,113,6},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {114,10,114,62},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new AND(
				new Predicate("free", new Term[] {
					Primitive.newPrimitive("left")
				}),
				new Predicate("free", new Term[] {
					Primitive.newPrimitive("right")
				})
			),
			new Block(
				"VacBot", new int[] {114,61,125,6},
				new Statement[] {
					new Declaration(
						new Variable(Type.INTEGER, "ran"),
						"VacBot", new int[] {116,10,125,6},
						Operator.newOperator('+',
							Primitive.newPrimitive(0),
							new Brackets(
								Operator.newOperator('%',
									new ModuleTerm("math", Type.INTEGER,
										new Predicate("randomInt", new Term[] {}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.Math) intention.getModule("VacBot","math")).randomInt(
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.Math) visitor.agent().getModule("VacBot","math")).randomInt(
												);
											}
										}
									),
									Primitive.newPrimitive(2)
								)
							)
						)
					),
					new If(
						"VacBot", new int[] {117,10,125,6},
						new Comparison("==",
							new Variable(Type.INTEGER, "ran"),
							Primitive.newPrimitive(0)
						),
						new Block(
							"VacBot", new int[] {117,22,119,11},
							new Statement[] {
								new ModuleCall("ei",
									"VacBot", new int[] {118,15,118,30},
									new Predicate("move", new Term[] {
										Primitive.newPrimitive("left")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
										}
									}
								)
							}
						),
						new Block(
							"VacBot", new int[] {120,14,125,6},
							new Statement[] {
								new ModuleCall("ei",
									"VacBot", new int[] {121,15,121,31},
									new Predicate("move", new Term[] {
										Primitive.newPrimitive("right")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
										}
									}
								)
							}
						)
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {124,10,125,6},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {126,10,126,49},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive("forward")
			}),
			new Block(
				"VacBot", new int[] {126,48,129,6},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {127,10,127,28},
						new Predicate("move", new Term[] {
							Primitive.newPrimitive("forward")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {128,10,129,6},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {130,10,130,46},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive("left")
			}),
			new Block(
				"VacBot", new int[] {130,45,133,6},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {131,10,131,25},
						new Predicate("move", new Term[] {
							Primitive.newPrimitive("left")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {132,10,133,6},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {134,10,134,47},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive("right")
			}),
			new Block(
				"VacBot", new int[] {134,46,137,6},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {135,10,135,26},
						new Predicate("move", new Term[] {
							Primitive.newPrimitive("right")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {136,10,137,6},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {139,10,139,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"VacBot", new int[] {139,31,142,6},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {140,10,140,27},
						new Predicate("move", new Term[] {
							Primitive.newPrimitive("left"),
							Primitive.newPrimitive(0)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {141,10,142,6},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {144,10,144,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("route", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"VacBot", new int[] {144,32,162,6},
				new Statement[] {
					new Declaration(
						new Variable(Type.BOOLEAN, "check"),
						"VacBot", new int[] {146,10,162,6},
						Primitive.newPrimitive(false)
					),
					new While(
						"VacBot", new int[] {147,10,162,6},
						new Comparison("==",
							new Variable(Type.BOOLEAN, "check"),
							Primitive.newPrimitive(false)
						),
						new Block(
							"VacBot", new int[] {147,32,161,11},
							new Statement[] {
								new Query(
									"VacBot", new int[] {148,15,148,51},
									new ModuleFormula("ei",
										new Predicate("location", new Term[] {
											new Variable(Type.LONG, "sx",false),
											new Variable(Type.LONG, "sy",false)
										}),
										new ModuleFormulaAdaptor() {
											public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
											}
										}
									)
								),
								new If(
									"VacBot", new int[] {149,15,161,11},
									new AND(
										new Comparison(">",
											new Variable(Type.LONG, "sx"),
											Primitive.newPrimitive(-5)
										),
										new Comparison(">",
											new Variable(Type.LONG, "sy"),
											Primitive.newPrimitive(-5)
										)
									),
									new Block(
										"VacBot", new int[] {149,35,159,16},
										new Statement[] {
											new Declaration(
												new Variable(Type.LONG, "tx"),
												"VacBot", new int[] {150,20,159,16},
												Primitive.newPrimitive(1l)
											),
											new Declaration(
												new Variable(Type.LONG, "ty"),
												"VacBot", new int[] {151,20,159,16},
												Primitive.newPrimitive(1l)
											),
											new Declaration(
												new Variable(Type.LIST, "L"),
												"VacBot", new int[] {152,20,159,16},
												new ModuleTerm("R", Type.LIST,
													new Predicate("routeTo", new Term[] {
														new Variable(Type.LONG, "sx"),
														new Variable(Type.LONG, "sy"),
														new Variable(Type.LONG, "tx"),
														new Variable(Type.LONG, "ty")
													}),
													new ModuleTermAdaptor() {
														public Object invoke(Intention intention, Predicate predicate) {
															return ((Routing) intention.getModule("VacBot","R")).routeTo(
																(long) intention.evaluate(predicate.getTerm(0)),
																(long) intention.evaluate(predicate.getTerm(1)),
																(long) intention.evaluate(predicate.getTerm(2)),
																(long) intention.evaluate(predicate.getTerm(3))
															);
														}
														public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
															return ((Routing) visitor.agent().getModule("VacBot","R")).routeTo(
																(long) visitor.evaluate(predicate.getTerm(0)),
																(long) visitor.evaluate(predicate.getTerm(1)),
																(long) visitor.evaluate(predicate.getTerm(2)),
																(long) visitor.evaluate(predicate.getTerm(3))
															);
														}
													}
												)
											),
											new BeliefUpdate('+',
												"VacBot", new int[] {156,20,159,16},
												new Predicate("routelist", new Term[] {
													new Variable(Type.LIST, "L")
												})
											),
											new Subgoal(
												"VacBot", new int[] {157,20,159,16},
												new Goal(
													new Predicate("task", new Term[] {
														new Variable(Type.STRING, "action")
													})
												)
											),
											new Assignment(
												new Variable(Type.BOOLEAN, "check"),
												"VacBot", new int[] {158,20,159,16},
												Primitive.newPrimitive(true)
											)
										}
									),
									new Block(
										"VacBot", new int[] {160,19,161,11},
										new Statement[] {
										}
									)
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {167,10,167,21},
			new GoalEvent('+',
				new Goal(
					new Predicate("update", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"VacBot", new int[] {167,20,194,6},
				new Statement[] {
					new Query(
						"VacBot", new int[] {173,10,173,44},
						new ModuleFormula("ei",
							new Predicate("location", new Term[] {
								new Variable(Type.LONG, "X",false),
								new Variable(Type.LONG, "Y",false)
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					),
					new Query(
						"VacBot", new int[] {174,10,174,39},
						new ModuleFormula("ei",
							new Predicate("direction", new Term[] {
								new Variable(Type.STRING, "D",false)
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					),
					new ForEach(
						"VacBot", new int[] {179,10,194,6},
						new AND(
							new ModuleFormula("ei",
								new Predicate("square", new Term[] {
									new Variable(Type.STRING, "location",false),
									Primitive.newPrimitive("obstacle")
								}),
								new ModuleFormulaAdaptor() {
									public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
									}
								}
							),
							new NOT(
								new ModuleFormula("R",
									new Predicate("obstacle", new Term[] {
										new Variable(Type.LONG, "X"),
										new Variable(Type.LONG, "Y"),
										new Variable(Type.STRING, "D"),
										new Variable(Type.STRING, "location")
									}),
								new ModuleFormulaAdaptor() {
										public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
											return ((Routing) visitor.agent().getModule("VacBot","R")).obstacle(
												(long) visitor.evaluate(predicate.getTerm(0)),
												(long) visitor.evaluate(predicate.getTerm(1)),
												(java.lang.String) visitor.evaluate(predicate.getTerm(2)),
												(java.lang.String) visitor.evaluate(predicate.getTerm(3))
											);
									}
								}
									)
							)
						),
						new Block(
							"VacBot", new int[] {179,91,181,11},
							new Statement[] {
								new ModuleCall("R",
									"VacBot", new int[] {180,15,180,50},
									new Predicate("recordObstacle", new Term[] {
										new Variable(Type.LONG, "X"),
										new Variable(Type.LONG, "Y"),
										new Variable(Type.STRING, "D"),
										new Variable(Type.STRING, "location")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((Routing) intention.getModule("VacBot","R")).recordObstacle(
												(java.lang.Long) intention.evaluate(predicate.getTerm(0)),
												(java.lang.Long) intention.evaluate(predicate.getTerm(1)),
												(java.lang.String) intention.evaluate(predicate.getTerm(2)),
												(java.lang.String) intention.evaluate(predicate.getTerm(3))
											);
										}
									}
								)
							}
						)
					),
					new Declaration(
						new Variable(Type.LONG, "gX"),
						"VacBot", new int[] {183,10,194,6},
						Operator.newOperator('+',
							new Variable(Type.LONG, "X"),
							Primitive.newPrimitive(1)
						)
					),
					new Declaration(
						new Variable(Type.LONG, "gY"),
						"VacBot", new int[] {184,10,194,6},
						Operator.newOperator('+',
							new Variable(Type.LONG, "Y"),
							Primitive.newPrimitive(1)
						)
					),
					new Declaration(
						new Variable(Type.LONG, "cX"),
						"VacBot", new int[] {185,10,194,6},
						new ModuleTerm("R", Type.LONG,
							new Predicate("maxX", new Term[] {}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((Routing) intention.getModule("VacBot","R")).maxX(
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((Routing) visitor.agent().getModule("VacBot","R")).maxX(
									);
								}
							}
						)
					),
					new Declaration(
						new Variable(Type.LONG, "cY"),
						"VacBot", new int[] {186,10,194,6},
						new ModuleTerm("R", Type.LONG,
							new Predicate("maxY", new Term[] {}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((Routing) intention.getModule("VacBot","R")).maxY(
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((Routing) visitor.agent().getModule("VacBot","R")).maxY(
									);
								}
							}
						)
					),
					new If(
						"VacBot", new int[] {187,10,194,6},
						new Comparison(">",
							new Variable(Type.LONG, "gX"),
							new Variable(Type.LONG, "cX")
						),
						new Block(
							"VacBot", new int[] {187,22,189,16},
							new Statement[] {
								new Assignment(
									new Variable(Type.LONG, "cX"),
									"VacBot", new int[] {188,15,189,16},
									new Variable(Type.LONG, "gX")
								)
							}
						)
					),
					new If(
						"VacBot", new int[] {190,10,194,6},
						new Comparison(">",
							new Variable(Type.LONG, "gY"),
							new Variable(Type.LONG, "cY")
						),
						new Block(
							"VacBot", new int[] {190,22,192,11},
							new Statement[] {
								new Assignment(
									new Variable(Type.LONG, "cY"),
									"VacBot", new int[] {191,15,192,11},
									new Variable(Type.LONG, "gY")
								)
							}
						)
					),
					new ModuleCall("R",
						"VacBot", new int[] {193,10,193,34},
						new Predicate("updateBoundary", new Term[] {
							new Variable(Type.LONG, "cX"),
							new Variable(Type.LONG, "cY")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((Routing) intention.getModule("VacBot","R")).updateBoundary(
									(java.lang.Long) intention.evaluate(predicate.getTerm(0)),
									(java.lang.Long) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {201,10,201,35},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new ListTerm(new Term[] {
							new Variable(Type.STRING, "vacbot",false)
						})
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"VacBot", new int[] {201,34,206,6},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {202,10,202,23},
						new Predicate("join", new Term[] {
							Primitive.newPrimitive("hw")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).join(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("ei",
						"VacBot", new int[] {203,10,203,25},
						new Predicate("link", new Term[] {
							new Variable(Type.STRING, "vacbot")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).link(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("C",
						"VacBot", new int[] {204,10,204,39},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("VacBot activated")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("VacBot","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.addSensorAdaptor(new SensorAdaptor() {
			public void sense(astra.core.Agent agent) {
				((astra.lang.EIS) agent.getModule("VacBot","ei")).sense();
			}
		});

		agent.initialize(
			new Predicate("counter", new Term[] {
				Primitive.newPrimitive(0)
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("ei",astra.lang.EIS.class,agent);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("R",Routing.class,agent);
		fragment.addModule("math",astra.lang.Math.class,agent);
		return fragment;
	}

	public static void main(String[] args) {
		Scheduler.setStrategy(new TestSchedulerStrategy());
		ListTerm argList = new ListTerm();
		for (String arg: args) {
			argList.add(Primitive.newPrimitive(arg));
		}

		String name = java.lang.System.getProperty("astra.name", "main");
		try {
			astra.core.Agent agent = new VacBot().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
