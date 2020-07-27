package Homework7;

import Homework7.Interface.CoumputerState;

public abstract class coumputer implements CoumputerState, Comparable<coumputer> {

    private String name;
    private int volumeOfMemoryOperational;
    private int sizeOfMonitor;
    private String tipeProcessor;
    private int volumeOfMemoryHardDisc;

    public coumputer(String name, int volumeOfMemoryOperational, int sizeOfMonitor, String tipeProcessor, int volumeOfMemoryHardDisc) {
        this.name = name;
        this.volumeOfMemoryOperational = volumeOfMemoryOperational;
        this.sizeOfMonitor = sizeOfMonitor;
        this.tipeProcessor = tipeProcessor;
        this.volumeOfMemoryHardDisc = volumeOfMemoryHardDisc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolumeOfMemoryOperational() {
        return volumeOfMemoryOperational;
    }

    public void setVolumeOfMemoryOperational(int volumeOfMemoryOperational) {
        this.volumeOfMemoryOperational = volumeOfMemoryOperational;
    }

    public int getSizeOfMonitor() {
        return sizeOfMonitor;
    }

    public void setSizeOfMonitor(int sizeOfMonitor) {
        this.sizeOfMonitor = sizeOfMonitor;
    }

    public String getTipeProcessor() {
        return tipeProcessor;
    }

    public void setTipeProcessor(String tipeProcessor) {
        this.tipeProcessor = tipeProcessor;
    }

    public int getVolumeOfMemoryHardDisc() {
        return volumeOfMemoryHardDisc;
    }

    public void setVolumeOfMemoryHardDisc(int volumeOfMemoryHardDisc) {
        this.volumeOfMemoryHardDisc = volumeOfMemoryHardDisc;
    }

    @Override
    public String toString() {
        return "Coumputer" +
                "name='" + name +
                ", volumeOfMemoryOperational=" + volumeOfMemoryOperational +
                ", sizeOfMonitor=" + sizeOfMonitor +
                ", tipeProcessor='" + tipeProcessor +
                ", volumeOfMemoryHardDisc=" + volumeOfMemoryHardDisc;
    }
}
}
