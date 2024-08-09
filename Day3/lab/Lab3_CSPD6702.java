public class Lab3_CSPD6702 {

    public static class JujutsuKaisenChar {
        String name;
        double cursedEnergy;
        boolean alive;
        String innateTechnique;
        String signatureQuote;
        boolean hasDomainExpansion;

        public JujutsuKaisenChar(
                String name,
                double cursedEnergy,
                boolean alive,
                String innateTechnique,
                String signatureQuote,
                boolean hasDomainExpansion) {

            this.name = name;
            this.cursedEnergy = cursedEnergy;
            this.alive = alive;
            this.innateTechnique = innateTechnique;
            this.signatureQuote = signatureQuote;
            this.hasDomainExpansion = hasDomainExpansion;
        }

        public JujutsuKaisenChar(
                String name,
                boolean alive) {
            this.name = name;
            this.alive = alive;
        }

        public JujutsuKaisenChar() {
            name = "Nah";
            cursedEnergy = 502.3;
            alive = true;
            innateTechnique = "Moon Walk";
            signatureQuote = "Aw";
            hasDomainExpansion = true;
        }

        public void run(int speed) {
            System.out.println(name + " is running at speed: " + speed);
        }

        public String getSignatureQuote() {
            return signatureQuote;
        }

        public boolean isDead() {
            return !alive;
        }

        public void domainExpansion() {
            if (hasDomainExpansion == true) {
                System.out.println(signatureQuote);
            } else {
                System.out.println("This character doesn't have domain expansion");
            }
        }

        public void useCursedTechnique() {
            System.out.println(innateTechnique);
        }
    }

    public static void main(String[] args) {
        JujutsuKaisenChar nah = new JujutsuKaisenChar();
        JujutsuKaisenChar mairu = new JujutsuKaisenChar("MairuMairu", true);
        JujutsuKaisenChar somchai = new JujutsuKaisenChar("Somchai", 541243, false, "Somchai has 10 apples",
                "How many apples left", true);

        mairu.run(1);
        nah.domainExpansion();
        somchai.useCursedTechnique();
        System.out.println(nah.isDead());
        System.out.println(somchai.getSignatureQuote());
    }
}
