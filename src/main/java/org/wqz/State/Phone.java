package org.wqz.State;

// 手机类
class Phone {
    private PhoneState state;

    public Phone() {
        this.state = new PowerOffState();
    }

    public void setState(PhoneState state) {
        this.state = state;
    }

    public void powerOn() {
        state.powerOn();
        if (state instanceof PowerOffState) {
            setState(new PowerOnState());
        }
    }

    public void powerOff() {
        state.powerOff();
        if (state instanceof PowerOnState || state instanceof FlightModeState) {
            setState(new PowerOffState());
        }
    }

    public void setFlightMode() {
        state.setFlightMode();
        if (state instanceof PowerOnState) {
            setState(new FlightModeState());
        }
    }
}