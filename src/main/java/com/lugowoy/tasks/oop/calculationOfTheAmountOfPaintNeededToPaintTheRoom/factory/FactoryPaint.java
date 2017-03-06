package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.factory;

import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Paint;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.TypeOfPaint;
import com.lugowoy.util.reading.Reading;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.awt.*;
import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 06.03.2017. */

public class FactoryPaint extends FactoryModel<Double> {

    public FactoryPaint(Reading<Double> reading) {
        super(reading);
    }

    public Paint createPaint() {
        Paint paint = new Paint();

        System.out.println("Fill in the information about the paint you need.");
        paint.setPricePerLiter(this.inputOfThePricePerLiterOfPaint());

        paint.setColorPaint(this.chooseColorOfPaint());

        paint.setTypeOfPaint(this.chooseTypeOfPaint());

        return paint;
    }

    private BigDecimal inputOfThePricePerLiterOfPaint() {
        System.out.println("Enter the price per liter of paint : ");
        return new BigDecimal(super.getReadingData().reading());
    }

    private Color chooseColorOfPaint() {
        Color colorPaint = null;
        System.out.println("Choose a paint color.");
        System.out.println("Black : 1; \n" + "Blue : 2; \n" + "Cyan : 3; \n" + "Gray : 4; \n" + "Green : 5; \n"
                         + "Magenta : 6; \n" + "Orange : 7; \n" + "Pink : 8; \n" + "Red : 9; \n" + "White : 10;");
        Reading<Integer> reading = new ReadingUserInputData()::readInt;
        int choose = reading.reading();
        if ((choose >= 1) && (choose <= 10)) {
            switch (choose) {
                case 1: colorPaint = Color.BLACK; break;
                case 2: colorPaint = Color.BLUE; break;
                case 3: colorPaint = Color.CYAN; break;
                case 4: colorPaint = Color.GRAY; break;
                case 5: colorPaint = Color.GREEN; break;
                case 6: colorPaint = Color.MAGENTA; break;
                case 7: colorPaint = Color.ORANGE; break;
                case 8: colorPaint = Color.PINK; break;
                case 9: colorPaint = Color.RED; break;
                case 10: colorPaint = Color.WHITE; break;
            }
        } else {
            System.out.println("Incorrect choice. Repeat.");
            this.chooseColorOfPaint();
        }
        return colorPaint;
    }

    private TypeOfPaint chooseTypeOfPaint() {
        TypeOfPaint resultTypeOfPaint = null;
        System.out.println("Choose type of paint.");
        System.out.println("Waterbased : 1; \n" + "Enamel : 2; \n" + "Oil : 3; \n" + "Silicone : 4; \n"
                         + "Plastic : 5; \n" + "Acrylic : 6; \n" + "Latex : 7; \n" + "Alkyd : 8;");
        Reading<Integer> reading = new ReadingUserInputData()::readInt;
        int choose = reading.reading();
        if ((choose >= 1) && (choose <= 8)) {
            switch (choose) {
                case 1: resultTypeOfPaint = TypeOfPaint.TYPE_WATERBASED; break;
                case 2: resultTypeOfPaint = TypeOfPaint.TYPE_ENAMEL; break;
                case 3: resultTypeOfPaint = TypeOfPaint.TYPE_OIL; break;
                case 4: resultTypeOfPaint = TypeOfPaint.TYPE_SILICONE; break;
                case 5: resultTypeOfPaint = TypeOfPaint.TYPE_PLASTIC; break;
                case 6: resultTypeOfPaint = TypeOfPaint.TYPE_ACRYLIC; break;
                case 7: resultTypeOfPaint = TypeOfPaint.TYPE_LATEX; break;
                case 8: resultTypeOfPaint = TypeOfPaint.TYPE_ALKYD; break;
            }
        } else {
            System.out.println("Incorrect choice. Repeat.");
            this.chooseTypeOfPaint();
        }
        return resultTypeOfPaint;
    }
}
