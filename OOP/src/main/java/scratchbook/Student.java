package scratchbook;

import java.util.Iterator;

public class Student implements Iterator {
    int x;
    int y;

    public Student(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Student)) {
            return false;
        }
        Student o = (Student) obj;
        return this.x == o.x;
    }

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

}
