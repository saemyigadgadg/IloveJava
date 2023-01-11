package ch07.home.ex05.case10;

public class Main {
	public static void main(String[] args) {
		Pencil pencil = new Pencil();
		Eraser eraser = new Eraser();
		Bag<Stationery> bag = new Bag<>();
		
		bag.add(pencil);
		bag.add(eraser);
		
		for(Stationery stationery : bag) {
			if(stationery instanceof Pencil myPencil) myPencil.write();
			if(stationery instanceof Eraser myEraser) myEraser.erase();
		}
	}
}