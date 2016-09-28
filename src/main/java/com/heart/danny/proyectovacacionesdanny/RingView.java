/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heart.danny.proyectovacacionesdanny;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "ringView")
public class RingView implements Serializable {

    private List<Recuerdo> lstRecuerdos;
    private Recuerdo selectedRecuerdo;
    private long dias = (Calendar.getInstance().getTime().getTime() - new Date(2016, 02, 21).getTime()) / (1000 * 60 * 60 * 24);

    public long getDias() {
        return dias;
    }

    @PostConstruct
    public void init() {
        Date fechaActual = Calendar.getInstance().getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 02, 21);
        Date fechaInicial = calendar.getTime();
        long diferenciaEnms = fechaActual.getTime() - fechaInicial.getTime();
        dias = diferenciaEnms / (1000 * 60 * 60 * 24);
        lstRecuerdos = new ArrayList<Recuerdo>();

        lstRecuerdos.add(new Recuerdo("1er Cine", "26-02-2016", "Supercines-Foch", "El inicio talvez, porque no ir?, mientras Jefferson pensaba que iba"
                + " a cargar el arpa, y tu lo hiciste sentir importante, la primera vez que caminaron de la mano..."));
        lstRecuerdos.add(new Recuerdo("Abrazo", "15-03-2016", "Aula 508", "Molestando con la pansita de Jefferson, que por cierto no ha crecido jeje"
                + " a él le nació abrazarte, y lo aceptaste..., en la noche aclaraste que no eran ideas de cada uno..."));
        lstRecuerdos.add(new Recuerdo("¿Quién te gusta?", "16-03-2016", "Rock and Beef", "Tipo 8pm , las preguntas comienzan"
                + " a tomar fuerza, y le preguntan a Jefferson, ¿Del grupo de amigos con quién quisieras tener una relación?, la respuesta "
                + "contundente, con Danny..."));
        lstRecuerdos.add(new Recuerdo("Ascensor", "18-03-2016", "Ascensor Sistemas", "Jefferson se dirigió al ascensor,"
                + " lo abordaste, le quedaste viendo, el posible plan que tenias, se desvaneció..., y fue el mejor viaje en ascensor de su vida..."));
        lstRecuerdos.add(new Recuerdo("El Inicio", "21-03-2016", "Parque la Carolina", "Una tarde que empieza con helado siempre sera excelente,"
                + " parque..., el tiempo voló..., mientras caminabas con él al bus, te frenó y te dijo Danny quieres ser mi novia?, no lo dudaste "
                + " y esta historia comenzó..."));
        lstRecuerdos.add(new Recuerdo("1er Mes", "21-04-2016", "Av. 12 de Octubre", "Un mes..., él se sentía igual de nervioso"
                + " que el primer día, la lluvia caía esa tarde, el esperaba cubriendo la flor pintada con los colores del arcoiris,"
                + " y te vio llegar, el corazón se le puso a correr, parecía que queria salir, comieron pizza, llaveros... cariño... "));
        lstRecuerdos.add(new Recuerdo("Lagrimas", "05-2016", "Terminal Quitumbe", "El alcohol? la confianza? pues no se a logrado"
                + " determinar, una conversación bastante profunda, talvez la primera vez que decian sin pelos en la lengua"
                + " todo lo que sentian uno al otro, y lagrimas fluyeron en tus ojos, el motivo? pues solo tu lo sabes..."));
        lstRecuerdos.add(new Recuerdo("Locura!", "16-06-2016", "La Merced", "El partido de la selección terminó, "
                + "él te acompaño a dejarte 12am llegaron a tu casa, no querías que se regresará a esas horas, "
                + "kevin lanzo la llave, no funciono estaba con aldaba, kevin bajo abrió la puerta usted subió, "
                + "regreso comenzaron a subir y en el primer piso, kevin salió y estuvo a nada de verlo, "
                + "te fuiste le escribiste a decir que suba, lo hizo el yeraly no ladro, entro a tu casa..."));
        lstRecuerdos.add(new Recuerdo("Una Noche", "11-07-2016", "El Condado", "Casa sola!! jeje, el plan se llevó a cabo, juntos una noche"
                + " sentimientos fluyendo, nerviosismo, llevando el pan..., recuerdo que lo tenemos grabado en la mente y no hace falta "
                + " detallarlo..."));
        lstRecuerdos.add(new Recuerdo("Semifinal", "07-2016", "Canchas EPN", "Partido importante en la vida de él, se comenzó ganando"
                + " algo que nadie se lo imagino, el partido avanzó, el empate llegó..., el equipo lucho de igual a igual no se encerro,"
                + " él fallo..., se adelantaron, él sentía que el mundo se le iba con cada minuto que avanzaba, el partido se acabó"
                + " el sueño se había acabado, se derrumbó, la gente se acerco, no quería escuchar nada, hasta que llego tu voz, "
                + " y supo que tenía que levantarse, que tenía alguien que lo amaba, y le diste un abrazo revitalizante..."));
        lstRecuerdos.add(new Recuerdo("Matrimonio", "27-08-2016", "Iglesia Hermano Miguel-Merced", "Fecha especial, él lo conocería toda tu familia,"
                + " era cuestión de verlo, mientras iba en el bus, se levanto y sento unas 4 veces, los nervios lo comían jeje, llego a la iglesia"
                + " y todo empezo la misa transcrurrio, la fiesta de la misma manera, se sentía bien, kevin lo abordo, le aclaró que lo esta vigilando"
                + " y le advirtio que debe cuidarte y no hacerte daño, luego la noche se puso mas densa, fueron a tu casa..., comenzó a tomar con tu padre"
                + " no quería fallar, escucho historias, anecdotas y fue a dormir..."));

    }

    public List<Recuerdo> getRecuerdos() {
        return lstRecuerdos;
    }

    public void setRecuerdos(List<Recuerdo> cars) {
        this.lstRecuerdos = cars;
    }

    public Recuerdo getSelectedRecuerdo() {
        return selectedRecuerdo;
    }

    public void setSelectedRecuerdo(Recuerdo selectedRecuerdo) {
        this.selectedRecuerdo = selectedRecuerdo;
    }
}
