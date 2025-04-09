package org.wqz.FactoryMethod.源码分析;

import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

public abstract class Calendar implements Serializable, Cloneable, Comparable<Calendar> {
    // ...
    public static Calendar getInstance()
    {
        return createCalendar(TimeZone.getDefault(), Locale.getDefault(Locale.Category.FORMAT));
    }

    private static Calendar createCalendar(TimeZone aDefault, Locale aDefault1) {
        return null;
    }
    // ...
}