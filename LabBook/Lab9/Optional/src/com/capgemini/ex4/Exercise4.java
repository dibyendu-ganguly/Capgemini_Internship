/**
 * 
 */
package com.capgemini.ex4;

/**
 * @author DIBYENDU
 *
 */
public class Exercise4 {
	
	private int id;
	private String name;
	public Exercise4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exercise4(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exercise4 other = (Exercise4) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Exercise4 [id=" + id + ", name=" + name + "]";
	}
	
	public void generateString() {
		System.out.println(toString());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example 1");
		Exercise4 e1 = new Exercise4();
		
		ExampleInterface ei1 = e1 :: generateString;
		ei1.getString();
		
		System.out.println("Example 2");
		Exercise4 e2 = new Exercise4(1,"Dibyendu");
		
		ExampleInterface ei2 = e2 :: generateString;
		ei2.getString();
	}

}
