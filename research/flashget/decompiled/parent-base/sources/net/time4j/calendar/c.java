package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: ChineseEra.java */
/* loaded from: classes7.dex */
public enum c implements net.time4j.engine.j {
    QING_SHUNZHI_1644_1662,
    QING_KANGXI_1662_1723,
    QING_YONGZHENG_1723_1736,
    QING_QIANLONG_1736_1796,
    QING_JIAQING_1796_1821,
    QING_DAOGUANG_1821_1851,
    QING_XIANFENG_1851_1862,
    QING_TONGZHI_1862_1875,
    QING_GUANGXU_1875_1909,
    QING_XUANTONG_1909_1912,
    YELLOW_EMPEROR;

    /* compiled from: ChineseEra.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82408a;

        static {
            int[] iArr = new int[c.values().length];
            f82408a = iArr;
            try {
                iArr[c.QING_SHUNZHI_1644_1662.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82408a[c.QING_KANGXI_1662_1723.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82408a[c.QING_YONGZHENG_1723_1736.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82408a[c.QING_QIANLONG_1736_1796.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82408a[c.QING_JIAQING_1796_1821.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f82408a[c.QING_DAOGUANG_1821_1851.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f82408a[c.QING_XIANFENG_1851_1862.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f82408a[c.QING_TONGZHI_1862_1875.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f82408a[c.QING_GUANGXU_1875_1909.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f82408a[c.QING_XUANTONG_1909_1912.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f82408a[c.YELLOW_EMPEROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, net.time4j.format.x.WIDE);
    }

    int getMaxYearOfEra() {
        switch (a.f82408a[ordinal()]) {
            case 1:
                return 18;
            case 2:
                return 61;
            case 3:
                return 13;
            case 4:
                return 60;
            case 5:
                return 25;
            case 6:
                return 30;
            case 7:
                return 11;
            case 8:
                return 13;
            case 9:
                return 34;
            case 10:
                return 3;
            case 11:
                return 5697;
            default:
                throw new UnsupportedOperationException(ProtectedSandApp.s("赴\u0001") + name());
        }
    }

    int getMinYearOfEra() {
        return this == YELLOW_EMPEROR ? 4343 : 1;
    }

    int getStartAsGregorianYear() {
        switch (a.f82408a[ordinal()]) {
            case 1:
                return 1644;
            case 2:
                return 1662;
            case 3:
                return 1723;
            case 4:
                return 1736;
            case 5:
                return 1796;
            case 6:
                return 1821;
            case 7:
                return 1851;
            case 8:
                return 1862;
            case 9:
                return 1875;
            case 10:
                return 1909;
            case 11:
                return -2697;
            default:
                throw new UnsupportedOperationException(ProtectedSandApp.s("赴\u0001") + name());
        }
    }

    public boolean isQingDynasty() {
        return ordinal() <= QING_XUANTONG_1909_1912.ordinal();
    }

    public String getDisplayName(Locale locale, net.time4j.format.x xVar) {
        String language = locale.getLanguage();
        int i4 = a.f82408a[ordinal()];
        String s4 = ProtectedSandApp.s("赳\u0001");
        switch (i4) {
            case 1:
                return language.equals(s4) ? ProtectedSandApp.s("趖\u0001") : language.isEmpty() ? ProtectedSandApp.s("趗\u0001") : ProtectedSandApp.s("趘\u0001");
            case 2:
                return language.equals(s4) ? ProtectedSandApp.s("趓\u0001") : language.isEmpty() ? ProtectedSandApp.s("趔\u0001") : ProtectedSandApp.s("趕\u0001");
            case 3:
                return language.equals(s4) ? ProtectedSandApp.s("趐\u0001") : language.isEmpty() ? ProtectedSandApp.s("趑\u0001") : ProtectedSandApp.s("趒\u0001");
            case 4:
                return language.equals(s4) ? ProtectedSandApp.s("趍\u0001") : language.isEmpty() ? ProtectedSandApp.s("趎\u0001") : ProtectedSandApp.s("趏\u0001");
            case 5:
                return language.equals(s4) ? ProtectedSandApp.s("越\u0001") : language.isEmpty() ? ProtectedSandApp.s("趋\u0001") : ProtectedSandApp.s("趌\u0001");
            case 6:
                return language.equals(s4) ? ProtectedSandApp.s("趇\u0001") : language.isEmpty() ? ProtectedSandApp.s("趈\u0001") : ProtectedSandApp.s("趉\u0001");
            case 7:
                return language.equals(s4) ? ProtectedSandApp.s("趄\u0001") : language.isEmpty() ? ProtectedSandApp.s("超\u0001") : ProtectedSandApp.s("趆\u0001");
            case 8:
                return language.equals(s4) ? ProtectedSandApp.s("趁\u0001") : language.isEmpty() ? ProtectedSandApp.s("趂\u0001") : ProtectedSandApp.s("趃\u0001");
            case 9:
                return language.equals(s4) ? ProtectedSandApp.s("赾\u0001") : language.isEmpty() ? ProtectedSandApp.s("赿\u0001") : ProtectedSandApp.s("趀\u0001");
            case 10:
                return language.equals(s4) ? ProtectedSandApp.s("赻\u0001") : language.isEmpty() ? ProtectedSandApp.s("赼\u0001") : ProtectedSandApp.s("赽\u0001");
            case 11:
                return language.equals(s4) ? ProtectedSandApp.s("赵\u0001") : xVar == net.time4j.format.x.WIDE ? language.isEmpty() ? ProtectedSandApp.s("赶\u0001") : ProtectedSandApp.s("起\u0001") : xVar == net.time4j.format.x.NARROW ? ProtectedSandApp.s("赸\u0001") : language.isEmpty() ? ProtectedSandApp.s("赹\u0001") : ProtectedSandApp.s("赺\u0001");
            default:
                throw new UnsupportedOperationException(ProtectedSandApp.s("赴\u0001") + name());
        }
    }
}
