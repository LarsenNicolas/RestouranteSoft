package ar.edu.unlam.software.restouratente.resto.models;

abstract class BaseObject {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
