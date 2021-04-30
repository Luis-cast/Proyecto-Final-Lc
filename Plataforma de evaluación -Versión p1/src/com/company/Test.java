package com.company;
import javax.swing.*;
import java.util.Scanner;
import java.util.Arrays;

import java.util.Scanner;

public class Test {

    public String[] getEvaluacion()
    {
        String p[] = {"Cuando son muy complicados los exámenes en la universidad estudio más ","Suelo dudar de la carrera que escogí en la universidad ", "Creo que opinar durante clases muestras mis capacidades ", "He deseado desde niño estudiar una carrera universitaria ", " Investigué mucho para elegir mi carrera universitaria","Generalmente soy capaz de analizar lo importante de los temas","Considero que puedo realizar actividades extracurriculares","Si me ausentara un día de clases buscaría la forma de saber que se hizo","Me siento calmado cuando doy mis opiniones en clases ","Me considero una persona capaz en los estudios ","Me siento motivado en mi futuro como profesional ","Antes de graduarme de secundaria, ya sabía qué carrera universitaria estudiar ","Me gustaría que las clases en la universidad fueran más dinámicas ","Me gusta estar con mis amigos en clases ","Puedo ser capaz de solucionar cualquier problema ", "Siento que me es complicado sacar calificaciones altas en mis estudios universitarios",
        "Hablar sobre un tema durante clases me hace sentir incomodo","Sé que realizar trabajos grupales me causa ansiedad","Suelo planear lo que tengo que hacer en la universidad","Si doy mi opinión en clase generalmente me siento bien ","Cuando no comprendo un tema investigo por mi propia cuenta","Creo que tendré un gran futuro profesional","Me esfuerzo por mejorar mis hábitos de estudio ","Pienso que es fácil trabajar en grupos ","Mis opiniones en los grupos de trabajo generalmente no son escuchadas ","Sé que puedo alcanzar las metas que me propongo","Cuando algo en la universidad es muy complicado trato de esforzarme más ","Yo tome la decisión de estudiar la carrera universitaria en la que estoy","Pienso que para realizar un trabajo en la universidad es complicado tomar en cuenta la opinión de todos","Considero que siempre supe qué carrera universitaria escogería "};

        return(p);

    }

    public int Sumatoria(int[] resp)
    {
        int acum=0;

        for (int i = 0; i < 30; i++){
            acum = acum+resp[i];
        }

        return(acum);
    }

    public int CalcularPorcentaje(int sum)
    {

        int por;

        por=(sum*100)/150;

         return(por);
    }

    public int CalcularRadio(int sum)
    {
        int radio;

        radio = (sum*360)/150;

        return(radio);
    }

}
