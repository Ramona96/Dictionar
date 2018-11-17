package com.company;

public class Cuvant {

    private String cuvant;
    private String traducere;
    private String antonim;

    public Cuvant(String cuvant,String traducere, String antonim)
    {
        this.cuvant = cuvant;
        this.traducere = traducere;
        this.antonim = antonim;
    }

    public String getCuvant() {
        return cuvant;
    }

    public String getTraducere() {
        return traducere;
    }

    public String getAntonim() {
        return antonim;
    }

    public void setCuvant(String cuvant) {
        this.cuvant = cuvant;
    }

    public void setTraducere(String traducere) {
        this.traducere = traducere;
    }

    public void setAntonim(String antonim) {
        this.antonim = antonim;
    }

    @Override

    public String toString()
    {
        return String.format("****************************** %n" +
                             "Cuvantul: " + this.cuvant + "%n" +
                              "Traducerea cuvantului: " + this.traducere + "%n" +
                               "Antonimul: " + this.antonim + "%n" +
                               "****************************** %n");

    }

}
