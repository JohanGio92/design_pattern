package store;

public interface LineState {

	void add(int code, int amount);

	boolean exist(int code, int amount);

	void remove(int code, int amount);

	int[][] list();

	void close();

	LineState nextState();

}
