package threadmodel;

import java.util.Random;

class ButtonTask implements Runnable {

	private Integer id;

	public ButtonTask(Integer id) {
		this.id = id;
	}

	@Override
	public void run() {
		try {
			while (!isPressed()) {
				Thread.sleep(1);
			}

			Thread lightTask = new Thread(new LightTask(id));
			lightTask.start();
			lightTask.join();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private boolean isPressed() {
		boolean buttonPressed = new Random().nextBoolean();
		System.out.println(String.format("Button is%s pressed for %s", buttonPressed ? "" : " not", id.toString()));
		return buttonPressed;
	}
}