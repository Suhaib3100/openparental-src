package net.time4j.calendar.astro;

import androidx.appcompat.app.b0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import net.time4j.d0;
import net.time4j.engine.o;

/* compiled from: Zodiac.java */
/* loaded from: classes7.dex */
public enum n {
    ARIES(9800, 26.766d, 11.048d),
    TAURUS(9801, 51.113d, 18.648d),
    GEMINI(9802, 90.218d, 23.439d),
    CANCER(9803, 120.198d, 20.542d),
    LEO(9804, 140.637d, 15.375d),
    VIRGO(9805, 174.4d, 2.423d),
    LIBRA(9806, 215.634d, -14.176d),
    SCORPIUS(9807, 238.861d, -20.359d),
    OPHIUCHUS(9934, 245.915d, -21.594d),
    SAGITTARIUS(9808, 265.968d, -23.388d),
    CAPRICORNUS(9809, 301.869d, -20.214d),
    AQUARIUS(9810, 329.79d, -12.306d),
    PISCES(9811, 352.284d, -3.331d);

    private static final Map<String, String[]> LANG_TO_NAMES;
    private static final double MEAN_SYNODIC_MONTH = 29.530588861d;
    private static final double MEAN_TROPICAL_YEAR = 365.242189d;
    private final transient c entry;
    private final transient char symbol;

    /* compiled from: Zodiac.java */
    public static class a implements o<d0> {

        /* renamed from: b, reason: collision with root package name */
        private final char f82358b;

        /* renamed from: c, reason: collision with root package name */
        private final n f82359c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f82360d;

        private a(char c5, n nVar, boolean z4) {
            if (c5 != 'S' && c5 != 'L') {
                throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a(ProtectedSandApp.s("豃\u0001"), c5));
            }
            if (nVar == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("豅\u0001"));
            }
            if (z4 && nVar == n.OPHIUCHUS) {
                throw new IllegalArgumentException(ProtectedSandApp.s("豄\u0001"));
            }
            this.f82358b = c5;
            this.f82359c = nVar;
            this.f82360d = z4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private d0 c(d0 d0Var, boolean z4, boolean z5) {
            double eclipticAngle;
            double lunarLongitude;
            double d5;
            if (!this.f82360d) {
                n e4 = e(z4);
                eclipticAngle = n.toEclipticAngle(d0Var, e4.entry.b(), e4.entry.a());
            } else {
                if (!z5) {
                    return d0Var;
                }
                eclipticAngle = d(z4);
            }
            double e5 = e.k(d0Var).e();
            if (this.f82358b == 'S') {
                lunarLongitude = eclipticAngle - n.getSolarLongitude(e5);
                if (z5) {
                    lunarLongitude = f(lunarLongitude);
                }
                d5 = n.MEAN_TROPICAL_YEAR;
            } else {
                lunarLongitude = eclipticAngle - n.getLunarLongitude(e5);
                if (z5) {
                    lunarLongitude = f(lunarLongitude);
                }
                d5 = n.MEAN_SYNODIC_MONTH;
            }
            double d6 = ((lunarLongitude * d5) / 360.0d) + e5;
            double max = Math.max(e5, d6 - 5.0d);
            double d7 = d6 + 5.0d;
            while (true) {
                double d10 = (max + d7) / 2.0d;
                if (d7 - max < 1.0E-4d) {
                    return (d0) e.j(d10).s().M(d0.f82685w, TimeUnit.SECONDS);
                }
                if (f((this.f82358b == 'S' ? n.getSolarLongitude(d10) : n.getLunarLongitude(d10)) - eclipticAngle) < 180.0d) {
                    d7 = d10;
                } else {
                    max = d10;
                }
            }
        }

        private int d(boolean z4) {
            n e4 = e(z4);
            return (e4.ordinal() + (e4.compareTo(n.OPHIUCHUS) < 0 ? 0 : -1)) * 30;
        }

        private n e(boolean z4) {
            n nVar = this.f82359c;
            if (z4) {
                nVar = nVar.next();
            }
            return (this.f82360d && nVar == n.OPHIUCHUS) ? n.SAGITTARIUS : nVar;
        }

        private static double f(double d5) {
            return d5 - (Math.floor(d5 / 360.0d) * 360.0d);
        }

        static a g(char c5, n nVar) {
            return new a(c5, nVar, false);
        }

        static a h(char c5, n nVar) {
            return new a(c5, nVar, true);
        }

        public d0 a(d0 d0Var) {
            return c(c(d0Var, false, true), false, false);
        }

        public d0 b(d0 d0Var) {
            return c(c(d0Var, true, true), true, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.o
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean test(d0 d0Var) {
            double d5;
            double d6;
            d0 d0Var2 = (d0) d0Var.M(d0.f82685w, TimeUnit.MINUTES);
            double e4 = e.k(d0Var2).e();
            double solarLongitude = this.f82358b == 'S' ? n.getSolarLongitude(e4) : n.getLunarLongitude(e4);
            if (this.f82360d) {
                d5 = d(false);
                d6 = d(true);
            } else {
                n nVar = this.f82359c;
                n next = nVar.next();
                double eclipticAngle = n.toEclipticAngle(d0Var2, nVar.entry.b(), nVar.entry.a());
                double eclipticAngle2 = n.toEclipticAngle(d0Var2, next.entry.b(), next.entry.a());
                d5 = eclipticAngle;
                d6 = eclipticAngle2;
            }
            if (d6 < d5) {
                d6 += 360.0d;
                if (solarLongitude < 180.0d) {
                    solarLongitude += 360.0d;
                }
            }
            return solarLongitude >= d5 && solarLongitude < d6;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("", new String[]{ProtectedSandApp.s("豕\u0001"), ProtectedSandApp.s("豖\u0001"), ProtectedSandApp.s("豗\u0001"), ProtectedSandApp.s("豘\u0001"), ProtectedSandApp.s("豙\u0001"), ProtectedSandApp.s("豚\u0001"), ProtectedSandApp.s("豛\u0001"), ProtectedSandApp.s("豜\u0001"), ProtectedSandApp.s("豝\u0001"), ProtectedSandApp.s("豞\u0001"), ProtectedSandApp.s("豟\u0001"), ProtectedSandApp.s("豓\u0001"), ProtectedSandApp.s("豔\u0001")});
        hashMap.put(ProtectedSandApp.s("豭\u0001"), new String[]{ProtectedSandApp.s("豢\u0001"), ProtectedSandApp.s("豣\u0001"), ProtectedSandApp.s("豤\u0001"), ProtectedSandApp.s("豥\u0001"), ProtectedSandApp.s("豦\u0001"), ProtectedSandApp.s("豧\u0001"), ProtectedSandApp.s("豨\u0001"), ProtectedSandApp.s("豩\u0001"), ProtectedSandApp.s("豪\u0001"), ProtectedSandApp.s("豫\u0001"), ProtectedSandApp.s("豬\u0001"), ProtectedSandApp.s("豠\u0001"), ProtectedSandApp.s("象\u0001")});
        hashMap.put(ProtectedSandApp.s("豻\u0001"), new String[]{ProtectedSandApp.s("豰\u0001"), ProtectedSandApp.s("豱\u0001"), ProtectedSandApp.s("豲\u0001"), ProtectedSandApp.s("豳\u0001"), ProtectedSandApp.s("豴\u0001"), ProtectedSandApp.s("豵\u0001"), ProtectedSandApp.s("豶\u0001"), ProtectedSandApp.s("豷\u0001"), ProtectedSandApp.s("豸\u0001"), ProtectedSandApp.s("豹\u0001"), ProtectedSandApp.s("豺\u0001"), ProtectedSandApp.s("豮\u0001"), ProtectedSandApp.s("豯\u0001")});
        hashMap.put(ProtectedSandApp.s("貉\u0001"), new String[]{ProtectedSandApp.s("豾\u0001"), ProtectedSandApp.s("豿\u0001"), ProtectedSandApp.s("貀\u0001"), ProtectedSandApp.s("貁\u0001"), ProtectedSandApp.s("貂\u0001"), ProtectedSandApp.s("貃\u0001"), ProtectedSandApp.s("貄\u0001"), ProtectedSandApp.s("貅\u0001"), ProtectedSandApp.s("貆\u0001"), ProtectedSandApp.s("貇\u0001"), ProtectedSandApp.s("貈\u0001"), ProtectedSandApp.s("豼\u0001"), ProtectedSandApp.s("豽\u0001")});
        hashMap.put(ProtectedSandApp.s("貓\u0001"), new String[]{ProtectedSandApp.s("豕\u0001"), ProtectedSandApp.s("貌\u0001"), ProtectedSandApp.s("貍\u0001"), ProtectedSandApp.s("貎\u0001"), ProtectedSandApp.s("豙\u0001"), ProtectedSandApp.s("豚\u0001"), ProtectedSandApp.s("豛\u0001"), ProtectedSandApp.s("貏\u0001"), ProtectedSandApp.s("貐\u0001"), ProtectedSandApp.s("貑\u0001"), ProtectedSandApp.s("貒\u0001"), ProtectedSandApp.s("貊\u0001"), ProtectedSandApp.s("貋\u0001")});
        hashMap.put(ProtectedSandApp.s("貞\u0001"), new String[]{ProtectedSandApp.s("貖\u0001"), ProtectedSandApp.s("貗\u0001"), ProtectedSandApp.s("貘\u0001"), ProtectedSandApp.s("豘\u0001"), ProtectedSandApp.s("貂\u0001"), ProtectedSandApp.s("貙\u0001"), ProtectedSandApp.s("貚\u0001"), ProtectedSandApp.s("貅\u0001"), ProtectedSandApp.s("貛\u0001"), ProtectedSandApp.s("貜\u0001"), ProtectedSandApp.s("貝\u0001"), ProtectedSandApp.s("貔\u0001"), ProtectedSandApp.s("貕\u0001")});
        hashMap.put(ProtectedSandApp.s("貫\u0001"), new String[]{ProtectedSandApp.s("財\u0001"), ProtectedSandApp.s("貢\u0001"), ProtectedSandApp.s("貣\u0001"), ProtectedSandApp.s("貤\u0001"), ProtectedSandApp.s("貥\u0001"), ProtectedSandApp.s("貦\u0001"), ProtectedSandApp.s("貧\u0001"), ProtectedSandApp.s("貨\u0001"), ProtectedSandApp.s("貐\u0001"), ProtectedSandApp.s("販\u0001"), ProtectedSandApp.s("貪\u0001"), ProtectedSandApp.s("貟\u0001"), ProtectedSandApp.s("負\u0001")});
        hashMap.put(ProtectedSandApp.s("買\u0001"), new String[]{ProtectedSandApp.s("豾\u0001"), ProtectedSandApp.s("豱\u0001"), ProtectedSandApp.s("貮\u0001"), ProtectedSandApp.s("貯\u0001"), ProtectedSandApp.s("貰\u0001"), ProtectedSandApp.s("貱\u0001"), ProtectedSandApp.s("貲\u0001"), ProtectedSandApp.s("貳\u0001"), ProtectedSandApp.s("貴\u0001"), ProtectedSandApp.s("貵\u0001"), ProtectedSandApp.s("貶\u0001"), ProtectedSandApp.s("責\u0001"), ProtectedSandApp.s("貭\u0001")});
        hashMap.put(ProtectedSandApp.s("賅\u0001"), new String[]{ProtectedSandApp.s("貺\u0001"), ProtectedSandApp.s("費\u0001"), ProtectedSandApp.s("貼\u0001"), ProtectedSandApp.s("貽\u0001"), ProtectedSandApp.s("貾\u0001"), ProtectedSandApp.s("貿\u0001"), ProtectedSandApp.s("賀\u0001"), ProtectedSandApp.s("賁\u0001"), ProtectedSandApp.s("賂\u0001"), ProtectedSandApp.s("賃\u0001"), ProtectedSandApp.s("賄\u0001"), ProtectedSandApp.s("貸\u0001"), ProtectedSandApp.s("貹\u0001")});
        hashMap.put(ProtectedSandApp.s("賒\u0001"), new String[]{ProtectedSandApp.s("賈\u0001"), ProtectedSandApp.s("賉\u0001"), ProtectedSandApp.s("賊\u0001"), ProtectedSandApp.s("賋\u0001"), ProtectedSandApp.s("賌\u0001"), ProtectedSandApp.s("賍\u0001"), ProtectedSandApp.s("賎\u0001"), ProtectedSandApp.s("賏\u0001"), ProtectedSandApp.s("豝\u0001"), ProtectedSandApp.s("賐\u0001"), ProtectedSandApp.s("賑\u0001"), ProtectedSandApp.s("賆\u0001"), ProtectedSandApp.s("資\u0001")});
        LANG_TO_NAMES = Collections.unmodifiableMap(hashMap);
    }

    n(char c5, double d5, double d6) {
        this.symbol = c5;
        this.entry = new i(d5, d6);
    }

    public static n constellationPassedByMoon(d0 d0Var) {
        return of('L', d0Var, false);
    }

    public static n constellationPassedBySun(d0 d0Var) {
        return of('S', d0Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double getLunarLongitude(double d5) {
        return h.t(d5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double getSolarLongitude(double d5) {
        return k.TIME4J.getFeature(d5, ProtectedSandApp.s("賓\u0001"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static n of(char c5, d0 d0Var, boolean z4) {
        double eclipticAngle;
        double eclipticAngle2;
        d0 d0Var2 = (d0) d0Var.M(d0.f82685w, TimeUnit.MINUTES);
        double e4 = e.k(d0Var2).e();
        double solarLongitude = c5 == 'S' ? getSolarLongitude(e4) : getLunarLongitude(e4);
        for (n nVar : values()) {
            n next = nVar.next();
            if (z4) {
                n nVar2 = OPHIUCHUS;
                if (nVar != nVar2) {
                    if (next == nVar2) {
                        next = SAGITTARIUS;
                    }
                    int i4 = nVar.compareTo(nVar2) < 0 ? 0 : -1;
                    int i5 = next.compareTo(nVar2) < 0 ? 0 : -1;
                    eclipticAngle = (nVar.ordinal() + i4) * 30;
                    eclipticAngle2 = (next.ordinal() + i5) * 30;
                } else {
                    continue;
                }
            } else {
                eclipticAngle = toEclipticAngle(d0Var2, nVar.entry.b(), nVar.entry.a());
                eclipticAngle2 = toEclipticAngle(d0Var2, next.entry.b(), next.entry.a());
            }
            if (eclipticAngle2 < eclipticAngle) {
                eclipticAngle2 += 360.0d;
                if (solarLongitude < 180.0d) {
                    solarLongitude += 360.0d;
                }
            }
            if (solarLongitude >= eclipticAngle && solarLongitude < eclipticAngle2) {
                return nVar;
            }
        }
        throw new NoSuchElementException(ProtectedSandApp.s("賔\u0001"));
    }

    public static n signPassedByMoon(d0 d0Var) {
        return of('L', d0Var, true);
    }

    public static n signPassedBySun(d0 d0Var) {
        return of('S', d0Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double toEclipticAngle(d0 d0Var, double d5, double d6) {
        double b5 = e.p(d0Var).b();
        double radians = Math.toRadians(k.meanObliquity(b5));
        double d7 = (((((0.018203d * b5) + 1.09468d) * b5) + 2306.2181d) * b5) / 3600.0d;
        double d10 = ((2004.3109d - (((0.041833d * b5) + 0.42665d) * b5)) * b5) / 3600.0d;
        double radians2 = Math.toRadians(d5 + ((((((0.017998d * b5) + 0.30188d) * b5) + 2306.2181d) * b5) / 3600.0d));
        double cos = Math.cos(radians2);
        double cos2 = Math.cos(Math.toRadians(d10));
        double sin = Math.sin(Math.toRadians(d10));
        double cos3 = Math.cos(Math.toRadians(d6));
        double sin2 = Math.sin(Math.toRadians(d6));
        double radians3 = Math.toRadians(Math.toDegrees(Math.atan2(Math.sin(radians2) * cos3, ((cos2 * cos3) * cos) - (sin * sin2))) + d7);
        double degrees = Math.toDegrees(Math.atan2(b0.a(radians, Math.tan(Math.asin((cos2 * sin2) + (sin * cos3 * cos))), Math.cos(radians) * Math.sin(radians3)), Math.cos(radians3)));
        return degrees < p.f60679p ? degrees + 360.0d : degrees;
    }

    public String getDisplayName(Locale locale) {
        Map<String, String[]> map = LANG_TO_NAMES;
        String[] strArr = map.get(locale.getLanguage());
        if (strArr == null) {
            strArr = map.get("");
        }
        return strArr[ordinal()];
    }

    public char getSymbol() {
        return this.symbol;
    }

    public n next() {
        return values()[(ordinal() + 1) % 13];
    }

    public n previous() {
        return values()[(ordinal() + 12) % 13];
    }
}
