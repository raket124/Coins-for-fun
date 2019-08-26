package Factories.Static;

import java.util.List;
import java.util.ArrayList;

public class Country extends Factory<Records.Objects.Country> implements Factories.ICountry {

    public Country() {
        this.data = new ArrayList<Records.Objects.Country>() {
            {
                add(new Records.Objects.Country("01", "BE", "Belgium"));
                add(new Records.Objects.Country("02", "EL", "Greece"));
                add(new Records.Objects.Country("03", "LT", "Lithuania"));
                add(new Records.Objects.Country("04", "PT", "Portugal"));
                add(new Records.Objects.Country("05", "BG", "Bulgaria"));
                add(new Records.Objects.Country("06", "ES", "Spain"));
                add(new Records.Objects.Country("07", "LU", "Luxembourg"));
                add(new Records.Objects.Country("08", "RO", "Romania"));
                add(new Records.Objects.Country("09", "CZ", "Czechia"));
                add(new Records.Objects.Country("10", "FR", "France"));
                add(new Records.Objects.Country("11", "HU", "Hungary"));
                add(new Records.Objects.Country("12", "SI", "Slovenia"));
                add(new Records.Objects.Country("13", "DK", "Denmark"));
                add(new Records.Objects.Country("14", "HR", "Croatia"));
                add(new Records.Objects.Country("15", "MT", "Malta"));
                add(new Records.Objects.Country("16", "SK", "Slovakia"));
                add(new Records.Objects.Country("17", "DE", "Germany"));
                add(new Records.Objects.Country("18", "IT", "Italy"));
                add(new Records.Objects.Country("19", "NL", "Netherlands"));
                add(new Records.Objects.Country("20", "FI", "Finland"));
                add(new Records.Objects.Country("21", "EE", "Estonia"));
                add(new Records.Objects.Country("22", "CY", "Cyprus"));
                add(new Records.Objects.Country("23", "AT", "Austria"));
                add(new Records.Objects.Country("24", "SE", "Sweden"));
                add(new Records.Objects.Country("25", "IE", "Ireland"));
                add(new Records.Objects.Country("26", "LV", "Latvia"));
                add(new Records.Objects.Country("27", "PL", "Poland"));
                add(new Records.Objects.Country("28", "UK", "United Kingdom"));
            }
        };
    }
}
