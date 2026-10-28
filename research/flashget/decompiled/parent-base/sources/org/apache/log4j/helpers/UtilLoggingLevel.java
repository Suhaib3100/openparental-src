package org.apache.log4j.helpers;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Level;

/* loaded from: classes3.dex */
public class UtilLoggingLevel extends Level {
    public static final int UNKNOWN_INT = 10000;
    private static final long serialVersionUID = 909301162611820211L;
    public static final int SEVERE_INT = 22000;
    public static final UtilLoggingLevel SEVERE = new UtilLoggingLevel(SEVERE_INT, "SEVERE", 0);
    public static final int WARNING_INT = 21000;
    public static final UtilLoggingLevel WARNING = new UtilLoggingLevel(WARNING_INT, "WARNING", 4);
    public static final UtilLoggingLevel INFO = new UtilLoggingLevel(20000, "INFO", 5);
    public static final int CONFIG_INT = 14000;
    public static final UtilLoggingLevel CONFIG = new UtilLoggingLevel(CONFIG_INT, "CONFIG", 6);
    public static final int FINE_INT = 13000;
    public static final UtilLoggingLevel FINE = new UtilLoggingLevel(FINE_INT, "FINE", 7);
    public static final int FINER_INT = 12000;
    public static final UtilLoggingLevel FINER = new UtilLoggingLevel(FINER_INT, "FINER", 8);
    public static final int FINEST_INT = 11000;
    public static final UtilLoggingLevel FINEST = new UtilLoggingLevel(FINEST_INT, "FINEST", 9);

    protected UtilLoggingLevel(int i4, String str, int i5) {
        super(i4, str, i5);
    }

    public static List getAllPossibleLevels() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FINE);
        arrayList.add(FINER);
        arrayList.add(FINEST);
        arrayList.add(INFO);
        arrayList.add(CONFIG);
        arrayList.add(WARNING);
        arrayList.add(SEVERE);
        return arrayList;
    }

    public static UtilLoggingLevel toLevel(int i4, UtilLoggingLevel utilLoggingLevel) {
        return i4 != 11000 ? i4 != 12000 ? i4 != 13000 ? i4 != 14000 ? i4 != 20000 ? i4 != 21000 ? i4 != 22000 ? utilLoggingLevel : SEVERE : WARNING : INFO : CONFIG : FINE : FINER : FINEST;
    }

    public static Level toLevel(int i4) {
        return toLevel(i4, FINEST);
    }

    public static Level toLevel(String str) {
        return toLevel(str, Level.DEBUG);
    }

    public static Level toLevel(String str, Level level) {
        if (str == null) {
            return level;
        }
        String upperCase = str.toUpperCase();
        if (upperCase.equals("SEVERE")) {
            return SEVERE;
        }
        if (upperCase.equals("WARNING")) {
            return WARNING;
        }
        if (upperCase.equals("INFO")) {
            return INFO;
        }
        if (upperCase.equals("CONFI")) {
            return CONFIG;
        }
        if (upperCase.equals("FINE")) {
            return FINE;
        }
        if (upperCase.equals("FINER")) {
            return FINER;
        }
        return upperCase.equals("FINEST") ? FINEST : level;
    }
}
