package Arrays;

public class Countries {
    public static void main(String[] args) {

        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia", "Colombia",
                "Honduras", "Indonesia", "United States"};

        String chsOfCountry = "";
        String endsWithA = "";
        String certain = "";

        for (String country: countries) {
            chsOfCountry += "" + country.charAt(0) + country.charAt(country.length() - 1) + " ";

            if (country.endsWith("a")){
                endsWithA += country + " ";
            }
            if (country.contains(" ")){
                certain += country + " ";
            }
        }
        System.out.println(chsOfCountry + "\n" + endsWithA + "\n" + certain);
    }
}
