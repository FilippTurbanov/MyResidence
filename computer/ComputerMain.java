package computer;

import static computer.standarts.CPU_Standart_A.*;
import static computer.standarts.HDD_Standart_A.*;
import static computer.standarts.RAM_Standart_A.*;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = new Computer(ZEN, SATA, DDR2);
        computer.start();
    }
}
