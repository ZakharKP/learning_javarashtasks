package com.javarush.bigtask.task30.task3008.client;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.javarush.bigtask.task30.task3008.ConsoleHelper;

public class BotClient extends Client {

	public static void main(String[] args) {
		BotClient botClient = new BotClient();
		botClient.run();
	}

	@Override
	protected String getUserName() {

		return "date_bot_" + (int) (Math.random() * 100);
	}

	@Override
	protected boolean shouldSendTextFromConsole() {
		return false;
	}

	@Override
	protected SocketThread getSocketThread() {
		return new BotSocketThread();
	}

	public class BotSocketThread extends SocketThread {
		@Override
		protected void clientMainLoop() throws IOException, ClassNotFoundException {
			sendTextMessage(
					"Hello chat. I'm a bot. I understand commands: date, day, month, year, time, hour, minute, second.");
			super.clientMainLoop();
		}

		@Override
		protected void processIncomingMessage(String message) {
			ConsoleHelper.writeMessage(message);
			if (message != null && message.contains(": ")) {

				String name = message.split(": ")[0];
				String text = message.split(": ")[1];
				String info = "Информация для " + name + ": ";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d.MM.YYYY");
				Calendar calendar = new GregorianCalendar();

				switch (text) {
				case "date":
					sendTextMessage(info + new SimpleDateFormat("d.MM.YYYY").format(new GregorianCalendar().getTime()));
					break;
				case "day":
					sendTextMessage(info + new SimpleDateFormat("d").format(new GregorianCalendar().getTime()));
					break;
				case "month":
					sendTextMessage(info + new SimpleDateFormat("MMMM").format(new GregorianCalendar().getTime()));
					break;
				case "year":
					sendTextMessage(info + new SimpleDateFormat("YYYY").format(new GregorianCalendar().getTime()));
					break;
				case "time":
					sendTextMessage(info + new SimpleDateFormat("H:mm:ss").format(new GregorianCalendar().getTime()));
					break;
				case "hour":
					sendTextMessage(info + new SimpleDateFormat("H").format(new GregorianCalendar().getTime()));
					break;
				case "minute":
					sendTextMessage(info + new SimpleDateFormat("m").format(new GregorianCalendar().getTime()));
					break;
				case "second":
					sendTextMessage(info + new SimpleDateFormat("s").format(new GregorianCalendar().getTime()));
					break;
				}
			}
		}
	}

}
