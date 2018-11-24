package actormodel;

import java.util.List;
import java.util.Random;

class ButtonCommand implements Command {

	private List<Command> commands;
	private Integer id;

	ButtonCommand(List<Command> commands, Integer id) {
		this.commands = commands;
		this.id = id;
	}

	public void execute() {
		if (isPressed()) {
			commands.add(new LightCommand(id));
		} else {
			commands.add(this);
		}
	}

	private boolean isPressed() {
		boolean buttonPressed = new Random().nextBoolean();
		System.out.println(String.format("Button is%s pressed for %s", buttonPressed ? "" : " not", id.toString()));
		return buttonPressed;
	}

}
