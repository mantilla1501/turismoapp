package com.example.turismoapp.validaciones;

import org.springframework.stereotype.Component;

@Component
public class EmpresaValidacion
{


  public  Boolean validarNombre (String nombre) throws  Exception
  {
     if(nombre.length()< 30)
     {
        throw  new Exception("longitu de cararcteres invalida") ;
     }
     else
     {
         return true;
     }
  }




}
