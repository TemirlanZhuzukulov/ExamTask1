import java.util.Arrays;

public class WineMaker {
        private  String name;
        private Wine [] wines;
        private int experience;
        private String address;

        public WineMaker(String name, Wine[] wines, int experience, String address) {
            this.name = name;
            this.wines = wines;
            this.experience = experience;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Wine[] getWines() {
            return wines;
        }

        public void setWines(Wine[] wines) {
            this.wines = wines;
        }

        public int getExperience() {
            return experience;
        }

        public void setExperience(int experience) {
            this.experience = experience;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Winemaker{" +
                    "name='" + name + '\'' +
                    ", wines=" + Arrays.toString(wines) +
                    ", experience=" + experience +
                    ", address='" + address + '\'' +
                    '}';
        }
    }


