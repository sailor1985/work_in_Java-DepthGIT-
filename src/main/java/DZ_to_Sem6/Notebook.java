package DZ_to_Sem6;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private final int warrantyPeriod; //срок гарантии
    private final double screenDiagonal;//диагональ экрана
    private final String firma;// фирма-производитель
    private final String operatingSystem;//операционная система
    private final String model;// модель
    private final String processor; //процессор

    private final List<HardDisc> hardDiscsList;

    @Override
    public String toString() {
        return String.format("firma: %s, model: %s, operatingSystem: %s, screenDiagonal: %.1f, warrantyPeriod: %d, hardDiscsList: %s", firma, model, operatingSystem, screenDiagonal, warrantyPeriod, hardDiscsList);
    }

    public Notebook(String firma, String model, String processor, String operatingSystem, double screenDiagonal, int warrantyPeriod, List<HardDisc> hardDiscsList) {
        this.firma = firma;
        this.model = model;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.screenDiagonal = screenDiagonal;
        this.warrantyPeriod = warrantyPeriod;
        this.hardDiscsList = hardDiscsList;
    }

    public void getSizeHardDisc() {
        int size = 0;
        for (HardDisc hardDisc : hardDiscsList) {
            size += hardDisc.getSize();
        }
        System.out.println(size);
    }

    //Получаем поле - диагональ экрана
    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    //Получаем поле - фирма-производитель
    public String getFirma() {
        return firma;
    }

    //Получаем поле - модель
    public String getModel() {
        return model;
    }

    //Получаем поле - операционная система
    public String getOperatingSystem() {
        return operatingSystem;
    }

    //Получаем поле - процессор
    public String getProcessor() {
        return processor;
    }

    //Получаем поле - срок гарантии
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void printInfo() {
        System.out.printf("У ноутбука фирма-производитель: %s, модель: %s, операционная система: %s, диагональ экрана: %.1f, процессор: %s, срок гарантии: %d, жесткие диски: %s\n", firma, model, operatingSystem, screenDiagonal, processor, warrantyPeriod, hardDiscsList);
    }

}
