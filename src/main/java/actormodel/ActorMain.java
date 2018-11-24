package actormodel;

import java.util.ArrayList;
import java.util.List;

public class ActorMain {
	public static void main(String[] args) {
		List<Command> commands = new ArrayList<>();
		for (int i = 0; i < 5; i++)
			commands.add(new ButtonCommand(commands, i + 1));
		while (commands.isEmpty() == false) {
			Command command = commands.get(0);
			commands.remove(0);
			command.execute();
		}
	}
}
