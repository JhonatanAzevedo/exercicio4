
package quest4;


public class Quest4 {


    public static void main(String[] args) {
        Especie homem = new Especie("chordata", "mammalia", "primata", "hominidae", "homo", "homosapien");
        Especie cao = new Especie("chordata", "mamalia", "carnivoro", "canide", "canis", "canis familiaris");
        Especie moscas = new Especie("Arthropoda", "insecta", "diptera", "muscide", "musca", "musca domestica");
        
        System.out.println(homem.obterDescriçao()+"\n");
        System.out.println(cao.obterDescriçao()+"\n");
        System.out.println(moscas.obterDescriçao()+"\n");
        
        
        
        
    }
    
}
