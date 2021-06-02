package com20.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Software appStore = new AppStore();
        Software camera = new Camera();

        Phone oppo = new Oppo();
        Phone vivo = new Vivo();

        vivo.setSoftware(appStore);
        vivo.run("vivo");

        oppo.setSoftware(camera);
        oppo.run("oppo");
    }
}
