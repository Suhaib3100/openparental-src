package net.time4j.i18n;

import com.android.internal.telephony.SmsConstants;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.time4j.format.k;
import net.time4j.format.n;
import net.time4j.format.o;
import net.time4j.format.p;

/* compiled from: DefaultPluralProviderSPI.java */
/* loaded from: classes7.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, p> f83267a;

    /* renamed from: b, reason: collision with root package name */
    private static final p f83268b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, p> f83269c;

    /* renamed from: d, reason: collision with root package name */
    private static final p f83270d;

    /* compiled from: DefaultPluralProviderSPI.java */
    /* renamed from: net.time4j.i18n.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1301a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83271a;

        static {
            int[] iArr = new int[k.values().length];
            f83271a = iArr;
            try {
                iArr[k.CARDINALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83271a[k.ORDINALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: DefaultPluralProviderSPI.java */
    private static class b extends p {

        /* renamed from: g, reason: collision with root package name */
        private final int f83272g;

        /* synthetic */ b(int i4, C1301a c1301a) {
            this(i4);
        }

        @Override // net.time4j.format.p
        public n e(long j4) {
            switch (this.f83272g) {
                case 0:
                    return j4 == 1 ? n.ONE : n.OTHER;
                case 1:
                    return (j4 == 0 || j4 == 1) ? n.ONE : n.OTHER;
                case 2:
                    return (j4 == 0 || j4 == 1 || (j4 >= 11 && j4 <= 99)) ? n.ONE : n.OTHER;
                case 3:
                    return (j4 % 10 != 1 || j4 % 100 == 11) ? n.OTHER : n.ONE;
                case 4:
                    return (j4 % 10 != 1 || j4 % 100 == 11) ? n.OTHER : n.ONE;
                case 5:
                    if (j4 >= 1 && j4 <= 3) {
                        return n.ONE;
                    }
                    long j5 = j4 % 10;
                    return (j5 == 4 || j5 == 6 || j5 == 9) ? n.OTHER : n.ONE;
                case 6:
                    long j6 = j4 % 10;
                    if (j6 == 0) {
                        return n.ZERO;
                    }
                    long j7 = j4 % 100;
                    return (j7 < 11 || j7 > 19) ? j6 == 1 ? n.ONE : n.OTHER : n.ZERO;
                case 7:
                    return j4 == 0 ? n.ZERO : j4 == 1 ? n.ONE : n.OTHER;
                case 8:
                    return j4 == 1 ? n.ONE : j4 == 2 ? n.TWO : n.OTHER;
                case 9:
                    return (j4 == 0 || j4 == 1) ? n.ONE : (j4 < 2 || j4 > 10) ? n.OTHER : n.FEW;
                case 10:
                    if (j4 == 1) {
                        return n.ONE;
                    }
                    if (j4 == 0) {
                        return n.FEW;
                    }
                    long j10 = j4 % 100;
                    return (j10 < 2 || j10 > 19) ? n.OTHER : n.FEW;
                case 11:
                    long j11 = j4 % 100;
                    long j12 = j4 % 10;
                    return (j12 != 1 || j11 == 11) ? (j12 < 2 || j12 > 4 || j11 == 12 || j11 == 13 || j11 == 14) ? n.OTHER : n.FEW : n.ONE;
                case 12:
                    return (j4 == 1 || j4 == 11) ? n.ONE : (j4 == 2 || j4 == 12) ? n.TWO : ((j4 < 3 || j4 > 10) && (j4 < 13 || j4 > 19)) ? n.OTHER : n.FEW;
                case 13:
                    long j13 = j4 % 100;
                    return j13 == 1 ? n.ONE : j13 == 2 ? n.TWO : (j13 == 3 || j13 == 4) ? n.FEW : n.OTHER;
                case 14:
                    return j4 == 1 ? n.ONE : j4 == 2 ? n.TWO : (j4 < 11 || j4 % 10 != 0) ? n.OTHER : n.MANY;
                case 15:
                    return j4 == 1 ? n.ONE : (j4 < 2 || j4 > 4) ? n.OTHER : n.FEW;
                case 16:
                    if (j4 == 1) {
                        return n.ONE;
                    }
                    long j14 = j4 % 10;
                    long j15 = j4 % 100;
                    return (j14 < 2 || j14 > 4 || j15 == 12 || j15 == 13 || j15 == 14) ? ((j14 < 0 || j14 > 1) && (j14 < 5 || j14 > 9) && (j15 < 12 || j15 > 14)) ? n.OTHER : n.MANY : n.FEW;
                case 17:
                    long j16 = j4 % 10;
                    long j17 = j4 % 100;
                    return (j16 != 1 || j17 == 11) ? (j16 < 2 || j16 > 4 || j17 == 12 || j17 == 13 || j17 == 14) ? (j16 == 0 || (j16 >= 5 && j16 <= 9) || (j17 >= 11 && j17 <= 14)) ? n.MANY : n.OTHER : n.FEW : n.ONE;
                case 18:
                    long j18 = j4 % 10;
                    long j19 = j4 % 100;
                    return (j18 != 1 || (j19 >= 11 && j19 <= 19)) ? (j18 < 2 || j18 > 9 || (j19 >= 11 && j19 <= 19)) ? n.OTHER : n.FEW : n.ONE;
                case 19:
                    if (j4 == 1) {
                        return n.ONE;
                    }
                    long j20 = j4 % 100;
                    return (j4 == 0 || (j20 >= 2 && j20 <= 10)) ? n.FEW : (j20 < 11 || j20 > 19) ? n.OTHER : n.MANY;
                case 20:
                    long j21 = j4 % 10;
                    long j22 = j4 % 100;
                    return (j21 != 1 || j22 == 11 || j22 == 71 || j22 == 91) ? (j21 != 2 || j22 == 12 || j22 == 72 || j22 == 92) ? ((j21 == 3 || j21 == 4 || j21 == 9) && (j22 < 10 || j22 > 19) && ((j22 < 70 || j22 > 79) && (j22 < 90 || j22 > 99))) ? n.FEW : (j4 == 0 || j4 % 1000000 != 0) ? n.OTHER : n.MANY : n.TWO : n.ONE;
                case 21:
                    return j4 == 1 ? n.ONE : j4 == 2 ? n.TWO : (j4 < 3 || j4 > 6) ? (j4 < 7 || j4 > 10) ? n.OTHER : n.MANY : n.FEW;
                case 22:
                    long j23 = j4 % 10;
                    long j24 = j4 % 100;
                    return j23 == 1 ? n.ONE : j23 == 2 ? n.TWO : (j24 == 0 || j24 == 20 || j24 == 40 || j24 == 60 || j24 == 80) ? n.FEW : n.OTHER;
                case 23:
                    if (j4 == 0) {
                        return n.ZERO;
                    }
                    if (j4 == 1) {
                        return n.ONE;
                    }
                    if (j4 == 2) {
                        return n.TWO;
                    }
                    long j25 = j4 % 100;
                    return (j25 < 3 || j25 > 10) ? (j25 < 11 || j25 > 99) ? n.OTHER : n.MANY : n.FEW;
                case 24:
                    return j4 == 0 ? n.ZERO : j4 == 1 ? n.ONE : j4 == 2 ? n.TWO : j4 == 3 ? n.FEW : j4 == 6 ? n.MANY : n.OTHER;
                case 25:
                    long j26 = j4 % 100;
                    return j26 == 1 ? n.ONE : j26 == 2 ? n.TWO : (j26 == 3 || j26 == 4) ? n.FEW : n.OTHER;
                case 26:
                    if (j4 == 0) {
                        return n.ZERO;
                    }
                    if (j4 == 1) {
                        return n.ONE;
                    }
                    long j27 = j4 % 100;
                    return (j27 == 2 || j27 == 22 || j27 == 42 || j27 == 62 || j27 == 82) ? n.TWO : (j27 == 3 || j27 == 23 || j27 == 43 || j27 == 63 || j27 == 83) ? n.FEW : (j27 == 1 || j27 == 21 || j27 == 41 || j27 == 61 || j27 == 81) ? n.MANY : n.OTHER;
                default:
                    return n.OTHER;
            }
        }

        @Override // net.time4j.format.p
        public k f() {
            return k.CARDINALS;
        }

        private b(int i4) {
            this.f83272g = i4;
        }
    }

    /* compiled from: DefaultPluralProviderSPI.java */
    private static class c extends p {

        /* renamed from: g, reason: collision with root package name */
        private final int f83273g;

        /* synthetic */ c(int i4, C1301a c1301a) {
            this(i4);
        }

        @Override // net.time4j.format.p
        public n e(long j4) {
            switch (this.f83273g) {
                case 0:
                    return n.OTHER;
                case 1:
                    long j5 = j4 % 10;
                    long j6 = j4 % 100;
                    return ((j5 != 1 && j5 != 2) || j6 == 11 || j6 == 12) ? n.OTHER : n.ONE;
                case 2:
                    return j4 == 1 ? n.ONE : n.OTHER;
                case 3:
                    return (j4 == 1 || j4 == 5) ? n.ONE : n.OTHER;
                case 4:
                    return (j4 < 1 || j4 > 4) ? n.OTHER : n.ONE;
                case 5:
                    long j7 = j4 % 10;
                    return (j7 == 6 || j7 == 9 || (j7 == 0 && j4 != 0)) ? n.MANY : n.OTHER;
                case 6:
                    return (j4 == 8 || j4 == 11 || j4 == 80 || j4 == 800) ? n.MANY : n.OTHER;
                case 7:
                    long j10 = j4 % 100;
                    return j4 == 1 ? n.ONE : (j4 == 0 || (j10 >= 2 && j10 <= 20) || j10 == 40 || j10 == 60 || j10 == 80) ? n.MANY : n.OTHER;
                case 8:
                    return j4 == 1 ? n.ONE : (j4 % 10 != 4 || j4 % 100 == 14) ? n.OTHER : n.MANY;
                case 9:
                    long j11 = j4 % 10;
                    long j12 = j4 % 100;
                    return (j11 != 1 || j12 == 11) ? (j11 != 2 || j12 == 12) ? (j11 != 3 || j12 == 13) ? n.OTHER : n.FEW : n.TWO : n.ONE;
                case 10:
                    return j4 == 1 ? n.ONE : (j4 == 2 || j4 == 3) ? n.TWO : j4 == 4 ? n.FEW : n.OTHER;
                case 11:
                    return (j4 == 1 || j4 == 3) ? n.ONE : j4 == 2 ? n.TWO : j4 == 4 ? n.FEW : n.OTHER;
                case 12:
                    long j13 = j4 % 10;
                    long j14 = j4 % 100;
                    return (j13 != 1 || j14 == 11) ? (j13 != 2 || j14 == 12) ? ((j13 != 7 && j13 != 8) || j14 == 17 || j14 == 18) ? n.OTHER : n.MANY : n.TWO : n.ONE;
                case 13:
                    long j15 = j4 % 10;
                    long j16 = j4 % 100;
                    long j17 = j4 % 1000;
                    return (j15 == 1 || j15 == 2 || j15 == 5 || j15 == 7 || j15 == 8 || j16 == 20 || j16 == 50 || j16 == 70 || j16 == 80) ? n.ONE : (j15 == 3 || j15 == 4 || j17 == 100 || j17 == 200 || j17 == 300 || j17 == 400 || j17 == 500 || j17 == 600 || j17 == 700 || j17 == 800 || j17 == 900) ? n.FEW : (j4 == 0 || j15 == 6 || j16 == 40 || j16 == 60 || j16 == 90) ? n.MANY : n.OTHER;
                case 14:
                    return j4 == 1 ? n.ONE : (j4 == 2 || j4 == 3) ? n.TWO : j4 == 4 ? n.FEW : j4 == 6 ? n.MANY : n.OTHER;
                case 15:
                    return (j4 == 1 || j4 == 5 || (j4 >= 7 && j4 <= 10)) ? n.ONE : (j4 == 2 || j4 == 3) ? n.TWO : j4 == 4 ? n.FEW : j4 == 6 ? n.MANY : n.OTHER;
                case 16:
                    return (j4 == 0 || (j4 >= 7 && j4 <= 9)) ? n.ZERO : j4 == 1 ? n.ONE : j4 == 2 ? n.TWO : (j4 == 3 || j4 == 4) ? n.FEW : (j4 == 5 || j4 == 6) ? n.MANY : n.OTHER;
                case 17:
                    long j18 = j4 % 10;
                    long j19 = j4 % 100;
                    return ((j18 != 2 && j18 != 3) || j19 == 12 || j19 == 13) ? n.OTHER : n.FEW;
                case 18:
                    return (j4 % 10 != 3 || j4 % 100 == 13) ? n.OTHER : n.FEW;
                case 19:
                    long j20 = j4 % 10;
                    return (j20 == 6 || j20 == 9 || j4 == 10) ? n.FEW : n.OTHER;
                case 20:
                    return (j4 == 1 || j4 == 5 || j4 == 7 || j4 == 8 || j4 == 9) ? n.ONE : (j4 == 2 || j4 == 3) ? n.TWO : j4 == 4 ? n.FEW : j4 == 6 ? n.MANY : n.OTHER;
                case 21:
                    return (j4 == 1 || j4 == 11) ? n.ONE : (j4 == 2 || j4 == 12) ? n.TWO : (j4 == 3 || j4 == 13) ? n.FEW : n.OTHER;
                case 22:
                    long j21 = j4 % 100;
                    return ((j21 < 1 || j21 > 4) && (j21 < 21 || j21 > 24) && ((j21 < 41 || j21 > 44) && ((j21 < 61 || j21 > 64) && (j21 < 81 || j21 > 84)))) ? j21 == 5 ? n.MANY : n.OTHER : n.ONE;
                default:
                    return n.OTHER;
            }
        }

        @Override // net.time4j.format.p
        public k f() {
            return k.ORDINALS;
        }

        private c(int i4) {
            this.f83273g = i4;
        }
    }

    static {
        HashMap hashMap = new HashMap(SmsConstants.MAX_USER_DATA_BYTES);
        f83267a = hashMap;
        int i4 = 0;
        C1301a c1301a = null;
        f83268b = new b(i4, c1301a);
        HashMap hashMap2 = new HashMap();
        b(hashMap2, ProtectedSandApp.s("雖\u0001"), -1);
        b(hashMap2, ProtectedSandApp.s("雗\u0001"), -1);
        b(hashMap2, ProtectedSandApp.s("雘\u0001"), 0);
        b(hashMap2, ProtectedSandApp.s("雙\u0001"), 1);
        b(hashMap2, ProtectedSandApp.s("雚\u0001"), 1);
        b(hashMap2, ProtectedSandApp.s("雛\u0001"), 1);
        b(hashMap2, ProtectedSandApp.s("雜\u0001"), 1);
        b(hashMap2, ProtectedSandApp.s("雝\u0001"), 2);
        b(hashMap2, ProtectedSandApp.s("雞\u0001"), 3);
        String s4 = ProtectedSandApp.s("雟\u0001");
        b(hashMap2, s4, 4);
        b(hashMap2, ProtectedSandApp.s("雠\u0001"), 5);
        b(hashMap2, ProtectedSandApp.s("雡\u0001"), 6);
        b(hashMap2, ProtectedSandApp.s("離\u0001"), 7);
        b(hashMap2, ProtectedSandApp.s("難\u0001"), 8);
        b(hashMap2, ProtectedSandApp.s("雤\u0001"), 9);
        b(hashMap2, ProtectedSandApp.s("雥\u0001"), 10);
        b(hashMap2, ProtectedSandApp.s("雦\u0001"), 11);
        String s5 = ProtectedSandApp.s("雧\u0001");
        b(hashMap2, s5, 12);
        b(hashMap2, ProtectedSandApp.s("雨\u0001"), 13);
        b(hashMap2, ProtectedSandApp.s("雩\u0001"), 14);
        b(hashMap2, ProtectedSandApp.s("雪\u0001"), 15);
        b(hashMap2, ProtectedSandApp.s("雫\u0001"), 16);
        b(hashMap2, ProtectedSandApp.s("雬\u0001"), 17);
        b(hashMap2, ProtectedSandApp.s("雭\u0001"), 18);
        b(hashMap2, ProtectedSandApp.s("雮\u0001"), 19);
        b(hashMap2, ProtectedSandApp.s("雯\u0001"), 17);
        b(hashMap2, ProtectedSandApp.s("雰\u0001"), 20);
        b(hashMap2, ProtectedSandApp.s("雱\u0001"), 21);
        b(hashMap2, ProtectedSandApp.s("雲\u0001"), 22);
        b(hashMap2, ProtectedSandApp.s("雳\u0001"), 23);
        b(hashMap2, ProtectedSandApp.s("雴\u0001"), 24);
        b(hashMap2, ProtectedSandApp.s("雵\u0001"), 25);
        b(hashMap2, ProtectedSandApp.s("零\u0001"), 26);
        hashMap.putAll(hashMap2);
        HashMap hashMap3 = new HashMap(SmsConstants.MAX_USER_DATA_BYTES);
        f83269c = hashMap3;
        f83270d = new c(i4, c1301a);
        HashMap hashMap4 = new HashMap();
        c(hashMap4, ProtectedSandApp.s("雷\u0001"), 1);
        c(hashMap4, ProtectedSandApp.s("雸\u0001"), 2);
        c(hashMap4, ProtectedSandApp.s("雹\u0001"), 3);
        c(hashMap4, ProtectedSandApp.s("雺\u0001"), 4);
        c(hashMap4, ProtectedSandApp.s("電\u0001"), 5);
        c(hashMap4, ProtectedSandApp.s("雼\u0001"), 6);
        c(hashMap4, ProtectedSandApp.s("雽\u0001"), 7);
        c(hashMap4, ProtectedSandApp.s("雾\u0001"), 8);
        c(hashMap4, ProtectedSandApp.s("雿\u0001"), 9);
        c(hashMap4, ProtectedSandApp.s("需\u0001"), 10);
        c(hashMap4, ProtectedSandApp.s("霁\u0001"), 11);
        c(hashMap4, s4, 12);
        c(hashMap4, ProtectedSandApp.s("霂\u0001"), 13);
        c(hashMap4, ProtectedSandApp.s("霃\u0001"), 14);
        c(hashMap4, ProtectedSandApp.s("霄\u0001"), 15);
        c(hashMap4, ProtectedSandApp.s("雴\u0001"), 16);
        c(hashMap4, ProtectedSandApp.s("雬\u0001"), 17);
        c(hashMap4, ProtectedSandApp.s("霅\u0001"), 18);
        c(hashMap4, ProtectedSandApp.s("霆\u0001"), 19);
        c(hashMap4, ProtectedSandApp.s("震\u0001"), 20);
        c(hashMap4, s5, 21);
        c(hashMap4, ProtectedSandApp.s("零\u0001"), 22);
        hashMap3.putAll(hashMap4);
    }

    private static void b(Map<String, p> map, String str, int i4) {
        for (String str2 : str.split(ProtectedSandApp.s("霈\u0001"))) {
            map.put(str2, new b(i4, null));
        }
    }

    private static void c(Map<String, p> map, String str, int i4) {
        for (String str2 : str.split(ProtectedSandApp.s("霈\u0001"))) {
            map.put(str2, new c(i4, null));
        }
    }

    @Override // net.time4j.format.o
    public p a(Locale locale, k kVar) {
        Map<String, p> map;
        p pVar;
        p pVar2;
        int i4 = C1301a.f83271a[kVar.ordinal()];
        if (i4 == 1) {
            map = f83267a;
            pVar = f83268b;
        } else {
            if (i4 != 2) {
                throw new UnsupportedOperationException(kVar.name());
            }
            map = f83269c;
            pVar = f83270d;
        }
        String country = locale.getCountry();
        if (country.isEmpty()) {
            pVar2 = null;
        } else {
            pVar2 = map.get(locale.getLanguage() + '_' + country);
        }
        if (pVar2 == null) {
            pVar2 = map.get(locale.getLanguage());
        }
        return pVar2 == null ? pVar : pVar2;
    }
}
