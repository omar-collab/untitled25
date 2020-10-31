package com.company;

public class Runner extends Thread {
    private Runner runnerDo;
    private Runner runnerPosle;

    public Runner(String name) {
        super(name);
    }

    public void setRunners(Runner runnerDo, Runner runnerPosle) {
        this.runnerDo = runnerDo;
        this.runnerPosle = runnerPosle;
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + "  берет палочку");

            if (getName().equals("runner5")){
                System.out.println(getName() + " бежит к финищу");
            sleep(5000);}
            else {
                System.out.println(getName() + " бежит к " + runnerPosle.getName());
                sleep(5000);
                runnerPosle.start();
                runnerPosle.join();
            }
            if (!getName().equals("runner5")) {
                System.out.println(getName() + " берет палочку");
                if (!getName().equals("runner1"))
                    System.out.println(getName() + " бежит к " + runnerDo.getName());
                sleep(5000);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
