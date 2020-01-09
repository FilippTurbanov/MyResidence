package computer;

import computer.api.IComputer;
import computer.parts.CPU;
import computer.parts.HDD;
import computer.parts.RAM;
import computer.standarts.CPU_Standart_A;
import computer.standarts.HDD_Standart_A;
import computer.standarts.RAM_Standart_A;

import java.util.Random;

import static computer.SuitableStandarts.suitableStandarts;
import static computer.standarts.CPU_Standart_A.cpuStandartA;
import static computer.standarts.HDD_Standart_A.hddStandartA;
import static computer.standarts.RAM_Standart_A.ramStandartA;

public class Computer implements IComputer {
    private CPU_Standart_A cpu;
    private HDD_Standart_A hdd;
    private RAM_Standart_A ram;
    public Computer(CPU_Standart_A cpu, HDD_Standart_A hdd, RAM_Standart_A ram) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    public String getCPU() {
        return String.valueOf(cpu);
    }

    public String getHDD() {
        return String.valueOf(hdd);
    }

    public String getRAM() {
        return String.valueOf(ram);
    }

    @Override
    public void start() {
        String[] suitableStandarts = suitableStandarts();
        String[] cpuStandartA = cpuStandartA();
        String[] hddStandartA = hddStandartA();
        String[] ramStandartA = ramStandartA();
        CPU cpu = new CPU();
        HDD hdd = new HDD();
        RAM ram = new RAM();
        Random shitHappenes = new Random();
        boolean cpuSuccess = false;
        boolean hddSuccess = false;
        boolean ramSuccess = false;
        String cpuStandart = "";
        String hddStandart = "";
        String ramStandart = "";

        // пример поэтапной проверки всех деталей сразу
        /*for (String checkCPU : suitableStandarts) {
            if (getCPU().equals(checkCPU)) {
                for (String checkHDD : suitableStandarts) {
                    if (getHDD().equals(checkHDD)) {
                        for (String checkRAM : suitableStandarts) {
                            if (getRAM().equals(checkRAM)) {
                                computerCompatibility = true; (переменная для первой проверки)
                                break;
                            }
                        }
                    }
                }
            }
        }*/

        // проверка каждой детали на совместимость с компьютером, затем на брак,
        // затем на совместимость с другими деталями
        for (String checkCPU : suitableStandarts) {
            if (cpu.checkCPU(getCPU(), checkCPU)) {
                if (shitHappenes.nextInt(100) != 13) {
                    for (String finalCheck : cpuStandartA) {
                        if (cpu.checkCPU(getCPU(), finalCheck)) {
                            cpuStandart = cpu.getStandart();
                            cpuSuccess = true;
                        }
                    }
                }
            }
        }
        for (String checkHDD : suitableStandarts) {
            if (hdd.checkHDD(getHDD(), checkHDD)) {
                if (shitHappenes.nextInt(100) != 13) {
                    for (String finalCheck : hddStandartA) {
                        if (hdd.checkHDD(getHDD(), finalCheck)) {
                            hddStandart = hdd.getStandart();
                            hddSuccess = true;
                        }
                    }
                }
            }
        }
        for (String checkRAM : suitableStandarts) {
            if (ram.checkRAM(getRAM(), checkRAM)) {
                if (shitHappenes.nextInt(100) != 13) {
                    for (String finalCheck : ramStandartA) {
                        if (ram.checkRAM(getRAM(), finalCheck)) {
                            ramStandart = ram.getStandart();
                            ramSuccess = true;
                        }
                    }
                }
            }
        }
        // проверка совместимости деталей друг с другом
        if ((ramStandart.equals(hddStandart)) && (hddStandart.equals(cpuStandart))) {
            if ((cpuSuccess) && (hddSuccess) && (ramSuccess)) {
                System.out.println("Проверка аппаратного обеспечения успешна. Запуск компьютера...");
            }
        }
        else
            System.out.println("К сожалению, запуск невозможен, т.к. аппаратное обеспечение компьютера несовместимо.");
        if (!cpuSuccess)
            System.out.println("Данный процессор не подходит.");
        if (!hddSuccess)
            System.out.println("Данный жесткий диск не подходит");
        if (!ramSuccess)
            System.out.println("Данная оперативная память не подходит.");
    }
}
