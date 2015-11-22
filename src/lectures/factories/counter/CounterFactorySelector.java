package lectures.factories.counter;

public class CounterFactorySelector {
	static CounterFactory counterFactory = new ALoggedCounterFactory();
	public static void setCounterFactory(CounterFactory newVal) {
		counterFactory = newVal;	
	}
	public static CounterFactory getCounterFactory() {
		return counterFactory;
	}
}
