/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class Archive {

    String identifier;
    String name;
    
    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getIdentifier() {
        return this.identifier;
    }
    
    @Override
    public boolean equals(Object archive) {
        if (this == archive) {
            return true;
        }
        
        if (!(archive instanceof Archive)) {
            return false;
        }
        
        Archive checkArchive = (Archive) archive;
        
        return this.identifier.equals(checkArchive.identifier);
        
    }
}
