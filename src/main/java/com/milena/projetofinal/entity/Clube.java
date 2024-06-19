package com.milena.projetofinal.entity;

import jakarta.persistence.*;




@Entity
public class Clube {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sigladoEstado;

    @Column(nullable = false)
    private String datadaCriacao;

    @Column(nullable = false)
    private boolean ativa;


    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public String getDatadaCriacao() {
        return datadaCriacao;
    }

    public void setDatadaCriacao(String datadaCriacao) {
        this.datadaCriacao = datadaCriacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigladoEstado() {
        return sigladoEstado;
    }

    public void setSigladoEstado(String sigladoEstado) {
        this.sigladoEstado = sigladoEstado;
    }
}


   @Entity
   public class partida{/        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @ManyToOne
        private Clube clubedaCasa;

        @ManyToOne
        private Clube clubeVisitante;
        private int golsclubedaCasa;
        private int golsVisitante;
        @ManyToOne
        private estadio estadio;
        private DataHora;

        public partida(){
        }
        public partida(long id, clubedaCasa, clubeVisitante, int golsclubedaCasa, int golsVisitante, estadio estadio,
                        dataHora{
            this.id= id;
            this.cludedaCasa = clubedaCasa;
            this.clubeVisitante= clubeVisitante;
            this.golsclubedaCasa= golsclubedaCasa;
            this.golsVisitante= golsVisitante;
            this.estadio estadio= estadio estadio;
            this.dataHora= dataHora;
        }

        public long getId(){
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getclubedaCasa(){
            return clubedaCasa;
        }

        public void setClubedaCasa(clube clubedaCasa) {
            this.clubedaCasa = clubedaCasa;
        }

        public long getClubeVisitante() {
           return clubeVisitante;
        }

        public void setClubeVisitante(clube clubeVisitante) {
            this.clubeVisitante = clubeVisitante;
        }

        public long getgolsclubedaCasa(){
            return golsclubedaCasa;
        }

       public void setGolsclubedaCasa(int golsclubedaCasa) {
            this.golsclubedaCasa = golsclubedaCasa;
        }

        public long setGolsVisitante(){
             return golsVisitante;
            return dataHora;
      }

        public void getdataHora(){
           this dataHora;
       }


   }

@Entity
public class Estadio {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public Estadio(){

    }

   public Estadio( long id,String nome){
        this.id= id;
        this.nome- nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getnome{
        return nome;
    }

   public void setGetnome(long getnome) {
       this.getnome = getnome; }
}



