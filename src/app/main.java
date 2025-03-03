package app;

import model.Usuario;
import model.Administração.Administracao;
import model.Local.Avaliacao;
import model.Local.Cidade;
import model.Local.Endereco;
import model.Local.Estado;
import model.Local.Local;
import model.Local.LocalNome;
import model.Local.Pais;
import model.Local.Zona;

public class main {

    public static void aplicacao() {
        Administracao admin = new Administracao("Victor", "111111", "2006-23-05");

        Usuario usuario01 = new Usuario("Matheus", "03999999", "2006-23-05", "99999-8888", "matheus@gmail.com", admin);
        Usuario usuario02 = new Usuario("Marcos", "03999999", "2006-23-05", "99999-8888", "marcos@gmail.com", admin);

        // admin.addUsuario(usuario01);
        // admin.addUsuario(usuario02);

        Pais brasil = new Pais("Brasil");
        Estado saoPaulo = new Estado("São Paulo", brasil);
        Cidade spCapital = new Cidade("São Paulo", saoPaulo);

        Zona zonaSul = new Zona("Zona Sul", spCapital);
        Zona zonaNorte = new Zona("Zona norte", spCapital);
        Zona zonaOeste = new Zona("Zona Oeste", spCapital);
        Zona zonaLeste = new Zona("Zona Leste", spCapital);
        
        LocalNome localNome = new LocalNome("Parque Ibirapuera");
        Endereco localEndereco = new Endereco(brasil, saoPaulo,spCapital, zonaSul);
        Avaliacao localAvaliacao = new Avaliacao("2024-10-28", "Um lugar ótimo para descansar", 4);

        LocalNome localNome02 = new LocalNome("Avenida Paulista");
        Endereco localEndereco02 = new Endereco(brasil, saoPaulo,spCapital, zonaNorte);
        Avaliacao localAvaliacao02 = new Avaliacao("2024-10-30", "Um lugar ótimo para descansar", 5);

        LocalNome localNome03 = new LocalNome("Parque Villa-Lobos");
        Endereco localEndereco03 = new Endereco(brasil, saoPaulo,spCapital, zonaOeste);
        Avaliacao localAvaliacao03 = new Avaliacao("2024-10-30", "Um lugar ótimo para descansar", 5);

        LocalNome localNome04 = new LocalNome("Ponta Negra");
        Endereco localEndereco04 = new Endereco(brasil, saoPaulo,spCapital, zonaLeste);
        Avaliacao localAvaliacao04 = new Avaliacao("2024-10-30", "Um lugar ótimo para descansar", 5);

        Local local = new Local(localNome, localEndereco, localAvaliacao);
        Local local2 = new Local(localNome02, localEndereco02, localAvaliacao02);
        Local local3 = new Local(localNome03, localEndereco03, localAvaliacao03);
        Local local4 = new Local(localNome04, localEndereco04, localAvaliacao04);

        admin.listar();

        usuario01.addLocal(local);
        usuario01.addLocal(local2);

        usuario02.addLocal(local3);
        usuario02.addLocal(local4);

        usuario01.listar();
        usuario02.listar();

        brasil.listar();
        System.out.println("\n\n*********** Listagem Estado ***********\n");
        saoPaulo.listar();
        System.out.println("\n**************************************\n");
        System.out.println("\n\n*********** Listagem Cidade ***********\n");
        spCapital.listar();
        System.out.println("\n**************************************\n");
        System.out.println("\n\n*********** Listagem ZonaSul ***********\n");
        zonaSul.listar();
        System.out.println("\n**************************************\n");
        System.out.println("\n\n*********** Listagem ZonaNorte ***********\n");
        zonaNorte.listar();
        System.out.println("\n**************************************\n");
        System.out.println("\n\n*********** Listagem ZonaOeste ***********\n");
        zonaOeste.listar();
        System.out.println("\n**************************************\n");
        System.out.println("\n\n*********** Listagem ZonaLeste ***********\n");
        zonaLeste.listar();
        System.out.println("\n**************************************\n");
        
    }

    public static void main(String args[]) {
        aplicacao();

    }
}
