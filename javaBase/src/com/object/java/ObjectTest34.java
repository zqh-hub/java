package com.object.java;

import sun.nio.ch.Net;

public class ObjectTest34 {
    public static void main(String[] args) {
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.brower();
    }
}
interface Network{
    void brower();
}

class Server implements Network{

    @Override
    public void brower() {
        System.out.println("真实的访问网络");
    }
}

class ProxyServer implements Network{
    private Network work;

    public ProxyServer(Network work){
        this.work = work;
    }

    public void check(){
        System.out.println("联网之前");
    }
    @Override
    public void brower() {
        check();
        work.brower();
    }
}