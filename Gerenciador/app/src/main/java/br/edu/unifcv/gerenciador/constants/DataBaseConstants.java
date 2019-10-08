package br.edu.unifcv.gerenciador.constants;

public class DataBaseConstants {

    private DataBaseConstants() {
    }

    public static class CONVIDADO {

        public static final String TABLE_NAME = "convidado";


        public static class COLUMNS {
            public static final String ID = "ID";
            public static final String NAME = "nome";
            public static final String PRESENCE = "presenca";
        }
    }
}
