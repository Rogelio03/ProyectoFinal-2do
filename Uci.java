import java.util.ArrayList;

public class Uci {

    private Lista<Mobiliario> mediosMobiliarios= new Lista<Mobiliario>();
    private Lista<Electronico>mediosElectronicos = new Lista<Electronico>();
    
    public Uci (){
        Electronico electronico = new Electronico(" ", " ", " ", 0 , 0," ", " ", 0 );
        mediosElectronicos.addElemento(electronico);
        
        Mobiliario  mobiliario= new Mobiliario("","","",0,0,0," ");
        mediosMobiliarios.addElemento(mobiliario);

    }





   // public void addMediosElectronicos(){
     //   Electronico electronicos = new Electronico(" ", " ", " ", 0 , 0," ", " ", 0 );
       // mediosUCI.add(electronicos);
        
    //}

    ///public void addMediosMobiliarios(){
       // Mobiliario mobiliarios = new Mobiliario("","","",0,0,0," ");
        //mediosUCI.add(mobiliarios);
        
    //}
    //public void separaElectronicos(){
        //Electronico electronico = new Electronico(" ", " ", " ", 0 , 0," ", " ", 0 );
        //for (int i = 0; i < mediosUCI.size(); i++) {
            //if(mediosUCI.get(i) == electronico){
              //  mediosElectronicos.add(electronico);   
            //}
            
        //}
    //}








    public void cantidadEquipos(String tipo){
       ArrayList<Electronico> tipoElectronicos = new ArrayList<Electronico>();
       int lg = 0, sony = 0, panda = 0, sanyo = 0;
       

       for (int i = 1; i < mediosUCI.size(); i++) {
          
        if(mediosUCI.get(i).tipo==tipo){
            tipoElectronicos.add((Electronico) mediosUCI.get(i));
          }
        }

        for (int i = 1; i < tipoElectronicos.size(); i++) {
        Electronico t =  new Electronico(" ", " ", " ", 0 , 0," ", " ", 0 );   
        t = tipoElectronicos.get(i);
        
        switch(t.getMarca()){
            case "LG":
            lg++;
            break;
            case "Sanyo":
            sanyo++;
            break;
            case "Sony":
            sony++;
            break;
            case "Atec Panda":
            panda++;
            break;
        }
            
        }
       }
    
	public void MediosMalEstado(String estado ){
		ArrayList<Medios> mediosMalEstado = new ArrayList<Medios>();
        int equipo = 0, mueble = 0;
       

        for (int i = 1; i < mediosUCI.size() ; i++) {
            if(mediosUCI.get(i).estado=="Mal"){
                mediosMalEstado.add(mediosUCI.get(i));
            }
        }

        for (int i = 1; i < mediosMalEstado.size(); i++) {
           if (mediosMalEstado.get(i) instanceof Electronico){
            equipo++;
           }
           if(mediosMalEstado.get(i) instanceof Mobiliario){
            mueble++;
           }
        }
       
	}

    public void Garantia () {
        Electronico x =  new Electronico(" ", " ", " ", 0 , 0," ", " ", 0 );
        int garantiaMayor = 0;
         for (int i = 1; i < mediosElectronicos.size(); i++){
             if(mediosElectronic > garantiaMayor){
                   
                   
                   

                }
                
             
         
        
    }

 }

    public void Proveedor(){
        
    }






}