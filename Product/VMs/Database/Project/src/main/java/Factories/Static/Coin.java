package Factories.Static;

import java.util.List;
import java.util.ArrayList;

public class Coin extends Factory<Records.Objects.Coin> implements Factories.ICoin {

    public Coin() {
        this.data = new ArrayList<Records.Objects.Coin>() {
            {
                add(new Records.Objects.Coin("01", "17", "01", "Cathedral of Cologne", 2000));
                add(new Records.Objects.Coin("02", "17", "01", "Cathedral of Cologne", 2001));
                add(new Records.Objects.Coin("03", "17", "01", "Cathedral of Cologne", 2002));
                add(new Records.Objects.Coin("04", "17", "01", "Cathedral of Cologne", 2003));
                add(new Records.Objects.Coin("05", "17", "01", "Cathedral of Cologne", 2004));
                add(new Records.Objects.Coin("06", "17", "01", "Cathedral of Cologne", 2005));
                add(new Records.Objects.Coin("07", "17", "01", "Cathedral of Cologne", 2006));
                add(new Records.Objects.Coin("08", "17", "01", "Cathedral of Cologne", 2007));
                add(new Records.Objects.Coin("09", "17", "01", "Cathedral of Cologne", 2008));
                add(new Records.Objects.Coin("10", "17", "01", "Cathedral of Cologne", 2009));
                add(new Records.Objects.Coin("11", "17", "01", "Church of Our Lady in Dresden", 2001));
                add(new Records.Objects.Coin("12", "17", "01", "Church of Our Lady in Dresden", 2002));
                add(new Records.Objects.Coin("13", "17", "01", "Church of Our Lady in Dresden", 2003));
                add(new Records.Objects.Coin("14", "17", "01", "Wieskirche", 2004));
                add(new Records.Objects.Coin("15", "17", "01", "Wieskirche", 2005));
                add(new Records.Objects.Coin("16", "17", "01", "Wieskirche", 2006));
                add(new Records.Objects.Coin("17", "17", "01", "Kaiser-Wilhelm Memorial Church in Berlin", 2007));
                add(new Records.Objects.Coin("18", "17", "01", "Kaiser-Wilhelm Memorial Church in Berlin", 2008));
                add(new Records.Objects.Coin("19", "17", "01", "Kaiser-Wilhelm Memorial Church in Berlin", 2009));
                add(new Records.Objects.Coin("20", "17", "01", "Church of Our Lady in Munich", 2010));
                add(new Records.Objects.Coin("21", "17", "01", "Ulm Minster", 2011));
                add(new Records.Objects.Coin("22", "17", "01", "Cathedral of Mainz", 2012));

                add(new Records.Objects.Coin("50", "06", "02", "Marriage: Man & Woman", 2015));
                add(new Records.Objects.Coin("51", "06", "02", "Marriage: Man & Woman", 2016));
                add(new Records.Objects.Coin("52", "06", "02", "Marriage: Man & Woman", 2017));
                add(new Records.Objects.Coin("53", "06", "02", "Marriage: Man & Man", 2015));
                add(new Records.Objects.Coin("54", "06", "02", "Marriage: Man & Man", 2016));
                add(new Records.Objects.Coin("55", "06", "02", "Marriage: Man & Man", 2017));
                add(new Records.Objects.Coin("56", "06", "02", "Marriage: Woman & Woman", 2015));
                add(new Records.Objects.Coin("57", "06", "02", "Marriage: Woman & Woman", 2016));
                add(new Records.Objects.Coin("58", "06", "02", "Marriage: Woman & Woman", 2017));

                add(new Records.Objects.Coin("80", "01", "03", "Annual Set", 2001));
                add(new Records.Objects.Coin("81", "01", "03", "Annual Set", 2002));
                add(new Records.Objects.Coin("82", "01", "03", "Annual Set", 2003));
                add(new Records.Objects.Coin("83", "01", "03", "Annual Set", 2004));
                add(new Records.Objects.Coin("84", "01", "03", "Annual Set", 2005));
                add(new Records.Objects.Coin("85", "02", "03", "Annual Set", 2001));
                add(new Records.Objects.Coin("86", "02", "03", "Annual Set", 2002));
                add(new Records.Objects.Coin("87", "02", "03", "Annual Set", 2003));
                add(new Records.Objects.Coin("88", "02", "03", "Annual Set", 2004));
                add(new Records.Objects.Coin("89", "02", "03", "Annual Set", 2005));
                add(new Records.Objects.Coin("90", "03", "03", "Annual Set", 2001));
                add(new Records.Objects.Coin("91", "03", "03", "Annual Set", 2002));
                add(new Records.Objects.Coin("92", "03", "03", "Annual Set", 2003));
                add(new Records.Objects.Coin("93", "03", "03", "Annual Set", 2004));
                add(new Records.Objects.Coin("94", "03", "03", "Annual Set", 2005));
                add(new Records.Objects.Coin("95", "05", "03", "Annual Set", 2001));
                add(new Records.Objects.Coin("96", "05", "03", "Annual Set", 2002));
                add(new Records.Objects.Coin("97", "05", "03", "Annual Set", 2003));
                add(new Records.Objects.Coin("98", "05", "03", "Annual Set", 2004));
                add(new Records.Objects.Coin("99", "05", "03", "Annual Set", 2005));
            }
        };
    }
}
