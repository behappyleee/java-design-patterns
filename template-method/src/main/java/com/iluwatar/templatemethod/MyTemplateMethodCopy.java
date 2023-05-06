package com.iluwatar.templatemethod;

public class MyTemplateMethodCopy {
    // TODO
    // template Method Pattern DesignPattern --> 직접 구현 하여 보기
    // 이해안가는 부분 Check 필요 및 직접 Code로 구현 필요 !!!
    // Template Method Design Pattern 연습
    public static void main(String[] args) {
        SimpleTemplate st = new SimpleTemplate(new SimplePrint());
        st.setPrint();
    }
}

abstract class TemplatePrinter {

    protected abstract void defaultPrint();

    public final void setPrinter() {
        System.out.println("THIS IS Template Abstract Class setPrint()");
        // Template Printer 를 extends 한 class 들은 모두 protected 로 Capsule 화를 시켜버리고
        // 해당 메서드에서
    }

}

class SimpleTemplate {
    TemplatePrinter templatePrinter;

    SimpleTemplate(TemplatePrinter templatePrinter) {
        this.templatePrinter = templatePrinter;
    }

    void setPrint() {
        System.out.println("This is Set Print MyTemplateMethodCopy !!");
        templatePrinter.setPrinter();
    }

    public void changePrinter(TemplatePrinter templatePrinter) {
        this.templatePrinter = templatePrinter;
    }
}

class SimplePrint extends TemplatePrinter {
    @Override
    protected void defaultPrint() {
        System.out.println("Simple Print Class !!");
    }

}

class DetailPrint extends TemplatePrinter {
    @Override
    protected void defaultPrint() {
        System.out.println("Detail Print Class !!");
    }
}



