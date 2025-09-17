package week1;

public class Coffee {
    private String size;
    private String type;
    private boolean hasMilk;
    private int sugarCubes;
    private String syrup;

    private Coffee(Builder builder) {
        this.size = builder.size;
        this.type = builder.type;
        this.hasMilk = builder.milk;
        this.sugarCubes = builder.sugar;
        this.syrup = builder.syrup;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasMilk() {
        return hasMilk;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    public int getSugarCubes() {
        return sugarCubes;
    }

    public void setSugarCubes(int sugarCubes) {
        this.sugarCubes = sugarCubes;
    }

    public String getSyrup() {
        return syrup;
    }

    public void setSyrup(String syrup) {
        this.syrup = syrup;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", hasMilk=" + hasMilk +
                ", sugarCubes=" + sugarCubes +
                ", syrup='" + syrup + '\'' +
                '}';
    }

    public static class Builder {
        private final String size;
        private final String type;

        private boolean milk = false;
        private int sugar = 0;
        private String syrup = null;

        public Builder(String size, String type) {
            this.size = size;
            this.type = type;
        }

        public Builder milk(boolean milk) {
            this.milk = milk;
            return this;
        }

        public Builder sugar(int sugar) {
            this.sugar = sugar;
            return this;
        }

        public Builder syrup(String syrup) {
            this.syrup = syrup;
            return this;
        }

        public Coffee build() {
            return new Coffee(this);
        }
    }
}
