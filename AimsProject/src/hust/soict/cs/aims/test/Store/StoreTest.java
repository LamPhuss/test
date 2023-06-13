package hust.soict.cybersec.aims.test.Store;

import hust.soict.cybersec.aims.Media.DigitalVideoDisc;
import hust.soict.cybersec.aims.Store.*;

public class StoreTest {
    public static void main(String[] args) {

        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("X");

        store.addMedia(dvd1);
        store.removeMedia(dvd1);
    }
}
