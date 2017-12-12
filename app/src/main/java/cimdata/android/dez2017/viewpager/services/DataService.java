package cimdata.android.dez2017.viewpager.services;

/**
 * Created by Student on 12.12.2017.
 */
public class DataService {

    private static String[] data;

    static {

        data = new String[] {
                "Data 1",
                "Data 2",
                "Data 3",
        };
    }

    public static String[] fetchData() {
        return data;
    }
}
