public interface Queue<T> {

	void put(T object);

	T take();

	int size();

}
