package beans;

import qualifiers.FileName;

import javax.enterprise.inject.Produces;

public class Configuration {

    @Produces @FileName
    private String fileName = "/message.txt";
}
