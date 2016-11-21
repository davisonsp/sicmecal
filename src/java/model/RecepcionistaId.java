package model;
// Generated Nov 21, 2016 7:45:14 AM by Hibernate Tools 4.3.1



/**
 * RecepcionistaId generated by hbm2java
 */
public class RecepcionistaId  implements java.io.Serializable {


     private String username;
     private char estado;

    public RecepcionistaId() {
    }

    public RecepcionistaId(String username, char estado) {
       this.username = username;
       this.estado = estado;
    }
   
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RecepcionistaId) ) return false;
		 RecepcionistaId castOther = ( RecepcionistaId ) other; 
         
		 return ( (this.getUsername()==castOther.getUsername()) || ( this.getUsername()!=null && castOther.getUsername()!=null && this.getUsername().equals(castOther.getUsername()) ) )
 && (this.getEstado()==castOther.getEstado());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUsername() == null ? 0 : this.getUsername().hashCode() );
         result = 37 * result + this.getEstado();
         return result;
   }   


}


