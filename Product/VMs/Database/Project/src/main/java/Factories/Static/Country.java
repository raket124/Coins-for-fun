package Factories.Static;

import java.util.List;
import java.util.ArrayList;

public class Country extends Factory<Objects.Country> implements Factories.ICountry {

    public Country() {
        this.data = new ArrayList<Objects.Country>() {
            {
                add(new Objects.Country("01", "BE", "Belgium"));
                add(new Objects.Country("02", "EL", "Greece"));
                add(new Objects.Country("03", "LT", "Lithuania"));
                add(new Objects.Country("04", "PT", "Portugal"));
                add(new Objects.Country("05", "BG", "Bulgaria"));
                add(new Objects.Country("06", "ES", "Spain"));
                add(new Objects.Country("07", "LU", "Luxembourg"));
                add(new Objects.Country("08", "RO", "Romania"));
                add(new Objects.Country("09", "CZ", "Czechia"));
                add(new Objects.Country("10", "FR", "France"));
                add(new Objects.Country("11", "HU", "Hungary"));
                add(new Objects.Country("12", "SI", "Slovenia"));
                add(new Objects.Country("13", "DK", "Denmark"));
                add(new Objects.Country("14", "HR", "Croatia"));
                add(new Objects.Country("15", "MT", "Malta"));
                add(new Objects.Country("16", "SK", "Slovakia"));
                add(new Objects.Country("17", "DE", "Germany"));
                add(new Objects.Country("18", "IT", "Italy"));
                add(new Objects.Country("19", "NL", "Netherlands"));
                add(new Objects.Country("20", "FI", "Finland"));
                add(new Objects.Country("21", "EE", "Estonia"));
                add(new Objects.Country("22", "CY", "Cyprus"));
                add(new Objects.Country("23", "AT", "Austria"));
                add(new Objects.Country("24", "SE", "Sweden"));
                add(new Objects.Country("25", "IE", "Ireland"));
                add(new Objects.Country("26", "LV", "Latvia"));
                add(new Objects.Country("27", "PL", "Poland"));
                add(new Objects.Country("28", "UK", "United Kingdom"));
            }
        };
    }
}
