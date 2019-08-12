package com.metrope.www.task;

import com.metrope.www.userinterfaces.Registrar;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Comprar implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(Registrar.BTN_NINOSYBEBES));
		actor.attemptsTo(Click.on(Registrar.BTN_AGREGAR));
	}
	
	public static Comprar articulo() {
		return Tasks.instrumented(Comprar.class);
	}
}