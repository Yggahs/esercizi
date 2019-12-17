class Persona{
  String nome;

  Persona(String x){
    nome = x;
  }

  public boolean equals(Object altro){

    if(altro instanceof Persona){
      Persona compara = (Persona)altro;
      if(compara.nome == this.nome)
        return true;
      else
        return false;
      }
    else
      return false;
  }
}
