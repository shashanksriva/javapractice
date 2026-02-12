package com.shashank.designpatterns.proxy;

// 3. Proxy
class ProxyImage implements Image {
    private final String fileName;
    private RealImage realImage; // Reference to the real object

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // Lazy initialization: create the real object only when needed
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        // Delegate the request to the real object
        realImage.display();
    }
}
