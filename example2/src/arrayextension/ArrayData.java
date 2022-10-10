package arrayextension;

import java.util.ArrayList;

public class ArrayData<E, T> extends ArrayList<E>
{
	public ArrayList<T> map(ArrayExtensionInterface listen) {
		ArrayList<T> newArray = new ArrayList<T>();
		for (E item : this) { 
			newArray.add((T) listen.run(item));
		}
		return newArray;
	}
	public ArrayList<E> filter(ArrayFilterExtension filter) {
		ArrayList<E> newArray = new ArrayList<E>();
		for (E item : this) { 
			if (filter.run(item)) {
				newArray.add((E) item);
			}
		}
		return newArray;
	}
	
}
