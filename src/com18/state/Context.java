package com18.state;

public class Context {
    private PersonState mPersonState;

    public void setPersonState(PersonState personState) {
        mPersonState = personState;
    }

    public void fallInLove() {
        System.out.println("恋爱了,陷入热恋状态:");
        setPersonState(new LoverState());
    }

    public void disappointmentInLove() {
        System.out.println("失恋了,变成单身狗状态:");
        setPersonState(new SingleState());
    }

    public void movies() {
        mPersonState.movies();
    }

    public void shopping() {
        mPersonState.shopping();
    }
}
