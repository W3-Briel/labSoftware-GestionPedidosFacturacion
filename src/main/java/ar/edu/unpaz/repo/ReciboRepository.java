package ar.edu.unpaz.repo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReciboRepository implements IRepoRecibo{

    @Override
    public void guardarRecibo(String data) {
        Path url = Path.of("reciboData.txt");
        try {
            Files.writeString(url,data, StandardCharsets.UTF_8);
            System.out.println(url.toAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
