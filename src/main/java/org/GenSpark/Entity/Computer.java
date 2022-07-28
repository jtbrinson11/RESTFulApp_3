package org.GenSpark.Entity;

import javax.persistence.*;

//@Entity
//@Table(name = "tbl_computer")
public class Computer {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int computerID;
    private String motherBoard;
    private String OS;
    private String CPU;
    private String GPU;
    private String RAM;
    private String HDD;
    private String OD;

    public int getComputerID() {
        return computerID;
    }

    public void setComputerID(int computerID) {
        this.computerID = computerID;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getOD() {
        return OD;
    }

    public void setOD(String OD) {
        this.OD = OD;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerID=" + computerID +
                ", motherBoard='" + motherBoard + '\'' +
                ", OS='" + OS + '\'' +
                ", CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                ", OD='" + OD + '\'' +
                '}';
    }

    public Computer() {
    }

    public Computer(int computerID, String motherBoard, String OS, String CPU, String GPU, String RAM, String HDD, String OD) {
        this.computerID = computerID;
        this.motherBoard = motherBoard;
        this.OS = OS;
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
        this.HDD = HDD;
        this.OD = OD;
    }
}
