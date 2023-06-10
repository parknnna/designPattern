package creational.factoryMethodPattern;

import org.junit.jupiter.api.Test;

class FactoryMethodPatternTest {

	@Test
	void factoryMethodPatternTest() {
		FigureFactory figureFactory = new FigureFactory();

		Figure fig1 = figureFactory.getFigure("CIRCLE");

		// Circle의 draw 메소드 호출
		fig1.draw();

		Figure fig2= figureFactory.getFigure("RECTANGLE");

		// Rectangle의 draw 메소드 호출
		fig2.draw();

		Figure fig3 = figureFactory.getFigure("SQUARE");

		// Square의 draw 메소드 호출
		fig3.draw();
	}

}
