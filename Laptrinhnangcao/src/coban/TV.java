package coban;

public class TV {
    int channel;
    int volumeLevel;
    boolean on;

    TV() {
        this.channel = 1;
        this.volumeLevel = 1;
        this.on = false;
    }

    TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    void turnOn() {
        on = true;
        System.out.println("Bat TV.");
    }

    void turnOff() {
        on = false;
        System.out.println("Tat TV.");
    }

    void setChannel(int newChannel) {
        if(on) {
            if(newChannel >= 1 && newChannel <= 120) {
                this.channel = newChannel;
                System.out.println("Kenh hien tai: " + channel);
            } else {
                System.out.println("Kenh khong hop le, vui long chon kenh tu 1 - 120");
            }
        } else {
            System.out.println("TV da tat, khong the thay doi kenh.");
        }
    }

    void setVolume(int newVolumeLevel) {
        if(on) {
            if(newVolumeLevel >= 1 && newVolumeLevel <= 7) {
                this.volumeLevel = newVolumeLevel;
                System.out.println("Am luong hien tai: " + volumeLevel);
            } else {
                System.out.println("Am luong khong hop le, vui long chon am luong tu 1 - 7");
            }
        } else {
            System.out.println("TV da tat, khong the thay doi am luong.");
        }
    }

    void channelUp() {
        if(on) {
            if(channel < 120) {
                channel++;
            } else {
                channel = 1;
            }
            System.out.println("Chuyen den kenh: " + channel);
        } else {
            System.out.println("TV da tat, khong the thay doi kenh.");
        }
    }

    void channelDown() {
        if(on) {
            if(channel > 1) {
                channel--;
            } else {
                channel = 120;
            }
            System.out.println("Chuyen den kenh: " + channel);
        } else {
            System.out.println("TV da tat, khong the thay doi kenh.");
        }
    }

    void volumeUp() {
        if(on) {
            if(volumeLevel < 7) {
                volumeLevel++;
                System.out.println("Tang am luong, am luong hien tai la: " + volumeLevel);
            } else {
                System.out.println("Max");
            }
        } else {
            System.out.println("TV da tat, khong the thay doi am luong.");
        }
    }

    void volumeDown() {
        if(on) {
            if(volumeLevel > 1) {
                volumeLevel--;
                System.out.println("Giam am luong, am luong hien tai la: " + volumeLevel);
            } else if(volumeLevel == 1) {
                volumeLevel = 0;
                System.out.println("Mute");
            } else {
                System.out.println("Am luong da o muc toi thieu");
            }
        } else {
            System.out.println("TV da tat, khong the thay doi am luong.");
        }
    }
}
