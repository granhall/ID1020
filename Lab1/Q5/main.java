class main {
	public static void main(String[] args) {
	GenericDLLS<Character> list = new GenericDLLS<>();
	list.queue('a');
	list.printTheThing();

	list.deQueue();
	list.printTheThing();

	list.queue('b');
	list.printTheThing();
	list.deQueue();

	list.queue('p');
	list.printTheThing();

	list.queue('h');
	list.printTheThing();

	list.queue('i');
	list.printTheThing();

	list.queue('l');
	list.printTheThing();

	list.queue('i');
	list.printTheThing();

	list.queue('p');
	list.printTheThing();

	list.queue('e');
	list.printTheThing();

	list.removeK(2);
	list.printTheThing();
	}
}