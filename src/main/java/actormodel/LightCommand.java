package actormodel;

class LightCommand implements Command {

	private Integer id;

	public LightCommand(Integer id) {
		this.id = id;
	}

	@Override
	public void execute() {
		System.out.println(String.format("Light is switched on for %s", id));
	}

}
