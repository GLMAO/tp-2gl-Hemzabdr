package com.polytech;

import com.polytech.tp.Cours;
import com.polytech.tp.CoursBuilder;
import com.polytech.tp.Etudiant;
import com.polytech.tp.GestionnaireEmploiDuTemps;
import com.polytech.tp.Responsable;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        GestionnaireEmploiDuTemps a=new GestionnaireEmploiDuTemps();
        Etudiant e1=new Etudiant("Hemza");
        Responsable r1=new Responsable("Mouslem");
        a.attach(r1);
        a.attach(e1);
        Cours cours = new CoursBuilder().setMatiere("G-log").setEnseignant("cpt Harbi").setSalle("inf6").build();
        a.ajouterCours(cours);
        a.modifierCours(cours, "seance changé à 14:00");
        Cours c = new CoursBuilder().setEnseignant("Cmd Mazari").setMatiere("Bdd").build();
        System.out.println(c.getDescription());



    }
}