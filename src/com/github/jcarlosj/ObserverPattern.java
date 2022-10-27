package com.github.jcarlosj;


import java.util.ArrayList;

interface Messenger {
    void toListen( String message );

    String getName();
}

// Receptor:
class Receiver implements Messenger {

    private String name;

    public Receiver( String name ) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void toListen( String message ) {
        System.out.println( message );
    }
}

// Emisor:
class Transmitter {
    private ArrayList<Messenger> listeners = new ArrayList<Messenger>();    // Oyentes o receptores

    public void subscribe( Messenger receiver ) {
        listeners.add( receiver );
    }

    public void toGreet() {
        for( Messenger receptor : listeners ) {
            String message = this.label( receptor.getName() ) + "Hello " + receptor.getName() + "!";

            receptor.toListen( message );
        }
    }

    public void toSay( String message ) {
        for( Messenger receptor : listeners ) {
            receptor.toListen( this.label( receptor.getName() ) + message );
        }
    }

    private String label( String name ) {
        return "(Emisor -> " + name + "):\t";
    }
}

/** Patron Observer como "sistema de eventos"
 *  Se usa principalmente para emular eventos en aplicaciones sin entornos GUI */
public class ObserverPattern {
    public static void main(String[] args) {
        System.out.println( "Patron Observer como \"sistema de eventos\"" );

        Transmitter transmitter = new Transmitter();

        transmitter.subscribe( new Receiver( "Juan" ) );
        transmitter.subscribe( new Receiver( "Sofia" ) );
        transmitter.subscribe( new Receiver( "Luisa" ) );

        transmitter.toGreet();
        transmitter.toSay( "Welcome everyone!" );

    }
}
