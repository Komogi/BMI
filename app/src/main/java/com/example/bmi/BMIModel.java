package com.example.bmi;

public class BMIModel {

    private double weight; // why is there an error here?
    private double height;

    public static void main(String[] args) {
        BMIModel myModel = new BMIModel("100", "1.8");
        System.out.println(myModel.getBMI());

        myModel = new BMIModel("45", "1.35");
        System.out.println(myModel.getBMI());

        myModel = new BMIModel("80", "1.2");
        System.out.println(myModel.getBMI());
    }

    public BMIModel(String w, String h) {
        this.weight = Double.parseDouble(w);
        this.height = Double.parseDouble(h);
    }

    public String getBMI() {
        double index = this.weight / (this.height * this.height);
        String result = String.format("%.1f", index);

        return result;
    }
}
