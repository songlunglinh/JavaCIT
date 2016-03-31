package com.pvthuan.farm2;

public class House
{
	private Animal animal1;
	private Animal animal2;
	House()
	{
		super();
	}
	House(Animal animal1, Animal animal2)
	{
		super();
		this.animal1 = animal1;
		this.animal2 = animal2;
	}
	public Animal getAnimal1()
	{
		return animal1;
	}
	public void setAnimal1(Animal animal1)
	{
		this.animal1 = animal1;
	}
	public Animal getAnimal2()
	{
		return animal2;
	}
	public void setAnimal2(Animal animal2)
	{
		this.animal2 = animal2;
	}
}
