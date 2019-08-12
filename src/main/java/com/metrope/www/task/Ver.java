package com.metrope.www.task;

import com.metrope.www.userinterfaces.Registrar;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Ver implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(Registrar.BTN_VER_CARRITO));
		
	}

	public static Ver carrito() {
		return Tasks.instrumented(Ver.class);
	}
}
