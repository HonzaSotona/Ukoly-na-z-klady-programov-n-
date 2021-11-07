package Ukol_7;


    class Kostka {

        private int pocetSten;

        public Kostka(int pocetSten) {
            this.pocetSten = pocetSten;
        }

        public int hodKostkou() {
            return (int) Math.floor(Math.random() * this.pocetSten) + 1;
        }

        @Override
        public String toString() {
            return "Pocet sten: " + this.pocetSten;
        }
    }
