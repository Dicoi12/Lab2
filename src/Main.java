import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Pagina> p1 =new ArrayList<>();
        Pagina p1c1=new Pagina(1,"descriere carte 1 pagina 1");
        Pagina p2c1=new Pagina(2,"descriere carte 1 pagina 2");
        Pagina p3c1=new Pagina(3,"descriere carte 1 pagina 3");
        Pagina p4c1=new Pagina(4,"descriere carte 1 pagina 4");
        p1.add(p1c1);
        p1.add(p2c1);
        p1.add(p3c1);
        p1.add(p4c1);

        Carte c1 = new Carte(p1,"Darius","Cartea 1");

        List<Pagina> p2 =new ArrayList<>();
        Pagina p1c2=new Pagina(1,"descriere carte 2 pagina 1");
        Pagina p2c2=new Pagina(2,"descriere carte 2 pagina 2");
        Pagina p3c2=new Pagina(3,"descriere carte 2 pagina 3");
        Pagina p4c2=new Pagina(4,"descriere carte 2 pagina 4");
        p1.add(p1c2);
        p1.add(p2c2);
        p1.add(p3c2);
        p1.add(p4c2);

        Carte c2 = new Carte(p2,"Arius Dicoi","Cartea 2");

        List<Carte> Carti =new ArrayList<Carte>();
        Carti.add(c1);
        Carti.add(c2);
        Biblioteca Humanitas = new Biblioteca(Carti);
//        Iterator<Carte> it = Carti.iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next().toString());
//        }

        Collections.sort(Carti, new Comparator<Carte>(){

            public int compare(Carte o1, Carte o2)
            {
                if(o1.autor.equals(o2.autor))
                return o1.titlu.compareTo(o2.titlu);
                else { return o1.autor.compareTo(o2.autor);}
            }
        });
//        for (Carte carti:Carti) {
//            System.out.println(carti.toString());
//        }
        String fraza="2";
        for(Carte c:Carti){
         List<Pagina>p=c.getPagini();
         for (Pagina pag:p){
             if(pag.descriere.contains(fraza)
             ){
                 System.out.println("Pagina: "+ pag.pagina+"Autor:  "+c.autor+"Titlui:  "+c.titlu);
             }
         }
        }

    }
}