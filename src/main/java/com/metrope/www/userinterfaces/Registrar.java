package com.metrope.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Registrar {

	public static final Target BTN_NINOSYBEBES =Target.the("Boton Niños y Bebes").locatedBy("//div[@class='categsTop__item'][4]");
	public static final Target BTN_AGREGAR  = Target.the("Boton Agregar").locatedBy("//button[@class='product-item__add-to-cart product-add-to-cart btn red add-to-cart'][@data-productid='53327']");
	public static final Target BTN_VER_CARRITO = Target.the("Boton Ver Carrito").locatedBy("//*[@id=\"category-page\"]/div[24]/div/div[2]/div[5]/div[5]/div[1]/div[2]/a");

}
