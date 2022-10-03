package com.mycompany.lecturaescriturajson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class LecturaEscrituraJSON {

    private static String JsonString;

    public static void main(String[] args) throws IOException {

        Usuario usuario1 = new Usuario(11111, "Trinidad", "Tessio", true,"correo");
        Usuario usuario2 = new Usuario(22222, "Usuario1","Apellido1", true,"correo");
        Usuario usuario3 = new Usuario(33333, "Usuario2","Apellido2", false,"correo");
        Usuario usuario4 = new Usuario(44444, "Usuario3","Apellido3", true,"correo");
        Usuario usuario5 = new Usuario(55555, "Usuario4","Apellido4", false,"correo");
        Usuario usuario6 = new Usuario(66666, "Usuario5","Apellido5", true,"correo");
        Usuario usuario7 = new Usuario(77777, "Usuario6","Apellido6", true,"correo");
        Usuario usuario8 = new Usuario(88888, "Usuario7","Apellido7", true,"correo");
        Usuario usuario9 = new Usuario(99999, "Usuario8","Apellido8", false,"correo");
        Usuario usuario10 = new Usuario(00000, "Usuario9","Apellido9", false,"correo");

       ArrayList<Usuario> usuarios = new ArrayList();

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        usuarios.add(usuario5);
        usuarios.add(usuario6);
        usuarios.add(usuario7);
        usuarios.add(usuario8);
        usuarios.add(usuario9);
        usuarios.add(usuario10);
 
        Gson gson = new Gson();

        // Convertir un array Json a ArrayList
        // Creamos el tipo que represente el arreglo
        
        java.lang.reflect.Type listType = new TypeToken<ArrayList<Usuario>>() {}.getType();
        String jsonArray = gson.toJson(usuarios);
        ArrayList<Usuario> arrayDeJson = gson.fromJson(jsonArray, listType);

        System.out.println("\n");
        try ( PrintWriter pw = new PrintWriter(new File("json.txt"))) {
            for (Usuario usuario : arrayDeJson) {

                if (!usuario.isAceptaNovedades()) {
                    System.out.print("\n" + usuario);
                    final Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
                    final String representacionBonita = prettyGson.toJson(usuario);

                    pw.write(representacionBonita);
                    pw.flush();
                }

            }
        }
    }
       
}
     

