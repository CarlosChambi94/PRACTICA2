package AGREGACION.EJERCICIO10;

public class Main {
    public static void main(String[] args) {

                Evento evento = new Evento("Congreso Universitario 2025", 20);

                Speaker s1 = new Speaker("Laura", "Mendez", 35, 1001, "Inteligencia Artificial");
                Speaker s2 = new Speaker("Carlos", "Rojas", 40, 1002, "Robótica");

                Participante p1 = new Participante("Ana", "Lopez", 20, 2001, 1);
                Participante p2 = new Participante("Juan", "Perez", 22, 2002, 2);
                Participante p3 = new Participante("Marta", "Suarez", 25, 2003, 3);
                Participante p4 = new Participante("Luis", "Garcia", 23, 2004, 4);
                Participante p5 = new Participante("Pedro", "Vega", 21, 2005, 5);


                Charla c1 = new Charla("Auditorio 1", "Introducción a la IA", s1, 10);
                c1.agregarParticipante(p1);
                c1.agregarParticipante(p2);
                c1.agregarParticipante(p3);

                Charla c2 = new Charla("Auditorio 2", "Robótica Avanzada", s2, 10);
                c2.agregarParticipante(p4);
                c2.agregarParticipante(p5);

                evento.agregarCharla(c1);
                evento.agregarCharla(c2);

                evento.mostrar();


                System.out.println("Edad promedio de los participantes: " + evento.edadPromedio());

                System.out.println("Esta ana lopez? " + evento.buscarpersona("ana", "Lopez"));
                System.out.println("¿Está Laura ? " + evento.buscarpersona("Laura", "Mendez"));

                evento.elimianarci(1002);
                System.out.println("\nCharlas luego de eliminar las del speaker 1002:");
                evento.mostrar();

                evento.ordenarCharlasPorParticipantes();
                System.out.println("\nCharlas ordenadas por número de participantes:");
                evento.mostrar();
            }
        }


