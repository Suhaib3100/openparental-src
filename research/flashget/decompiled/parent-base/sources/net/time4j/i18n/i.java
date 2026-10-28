package net.time4j.i18n;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.format.a0;
import net.time4j.g1;

/* compiled from: WeekdataProviderSPI.java */
/* loaded from: classes7.dex */
public class i implements a0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f83293a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<String> f83294b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, g1> f83295c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, g1> f83296d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, g1> f83297e;

    public i() {
        String substring;
        g1 g1Var;
        HashMap hashMap;
        String s4 = ProtectedSandApp.s("靚\u0001");
        net.time4j.base.d c5 = net.time4j.base.d.c();
        String s5 = ProtectedSandApp.s("靛\u0001");
        String s6 = ProtectedSandApp.s("靜\u0001");
        URI f4 = c5.f(s5, i.class, s6);
        InputStream e4 = net.time4j.base.d.c().e(f4, true);
        if (e4 == null) {
            try {
                e4 = net.time4j.base.d.c().d(i.class, s6, true);
            } catch (IOException unused) {
            }
        }
        if (e4 == null) {
            this.f83293a = ProtectedSandApp.s("靬\u0001");
            this.f83294b = Collections.emptySet();
            this.f83295c = Collections.emptyMap();
            this.f83296d = Collections.emptyMap();
            this.f83297e = Collections.emptyMap();
            System.err.println(ProtectedSandApp.s("靭\u0001"));
            return;
        }
        this.f83293a = ProtectedSandApp.s("靝\u0001") + f4;
        HashSet hashSet = new HashSet();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(e4, ProtectedSandApp.s("非\u0001")));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        this.f83294b = Collections.unmodifiableSet(hashSet);
                        this.f83295c = Collections.unmodifiableMap(hashMap2);
                        this.f83296d = Collections.unmodifiableMap(hashMap3);
                        this.f83297e = Collections.unmodifiableMap(hashMap4);
                        try {
                            e4.close();
                            return;
                        } catch (IOException e5) {
                            e5.printStackTrace(System.err);
                            return;
                        }
                    }
                    if (!readLine.startsWith(ProtectedSandApp.s("靟\u0001"))) {
                        int indexOf = readLine.indexOf(61);
                        int i4 = 0;
                        String trim = readLine.substring(0, indexOf).trim();
                        String[] split = readLine.substring(indexOf + 1).split(ProtectedSandApp.s("靠\u0001"));
                        if (trim.equals(ProtectedSandApp.s("靡\u0001"))) {
                            int length = split.length;
                            while (i4 < length) {
                                String upperCase = split[i4].trim().toUpperCase(Locale.US);
                                if (!upperCase.isEmpty()) {
                                    hashSet.add(upperCase);
                                }
                                i4++;
                            }
                        } else {
                            if (trim.startsWith(ProtectedSandApp.s("面\u0001"))) {
                                substring = trim.substring(6);
                                g1Var = g1.SATURDAY;
                                hashMap = hashMap3;
                            } else if (trim.startsWith(ProtectedSandApp.s("靣\u0001"))) {
                                substring = trim.substring(4);
                                g1Var = g1.SUNDAY;
                                hashMap = hashMap4;
                            } else {
                                if (!trim.startsWith(ProtectedSandApp.s("靤\u0001"))) {
                                    throw new IllegalStateException(s4 + this.f83293a);
                                }
                                substring = trim.substring(6);
                                g1Var = g1.MONDAY;
                                hashMap = hashMap2;
                            }
                            if (substring.equals(ProtectedSandApp.s("靥\u0001"))) {
                                g1Var = g1.SUNDAY;
                            } else if (substring.equals(ProtectedSandApp.s("靦\u0001"))) {
                                g1Var = g1.SATURDAY;
                            } else if (substring.equals(ProtectedSandApp.s("靧\u0001"))) {
                                g1Var = g1.FRIDAY;
                            } else if (substring.equals(ProtectedSandApp.s("靨\u0001"))) {
                                g1Var = g1.THURSDAY;
                            } else if (substring.equals(ProtectedSandApp.s("革\u0001"))) {
                                g1Var = g1.WEDNESDAY;
                            } else if (substring.equals(ProtectedSandApp.s("靪\u0001"))) {
                                g1Var = g1.TUESDAY;
                            } else if (substring.equals(ProtectedSandApp.s("靫\u0001"))) {
                                g1Var = g1.MONDAY;
                            }
                            int length2 = split.length;
                            while (i4 < length2) {
                                String upperCase2 = split[i4].trim().toUpperCase(Locale.US);
                                if (!upperCase2.isEmpty()) {
                                    hashMap.put(upperCase2, g1Var);
                                }
                                i4++;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    e4.close();
                } catch (IOException e6) {
                    e6.printStackTrace(System.err);
                }
                throw th;
            }
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        } catch (Exception e10) {
            throw new IllegalStateException(s4 + this.f83293a, e10);
        }
    }

    @Override // net.time4j.format.a0
    public int a(Locale locale) {
        String country = locale.getCountry();
        g1 g1Var = g1.SUNDAY;
        if (this.f83297e.containsKey(country)) {
            g1Var = this.f83297e.get(country);
        }
        return g1Var.getValue();
    }

    @Override // net.time4j.format.a0
    public int b(Locale locale) {
        if (this.f83294b.isEmpty()) {
            return new GregorianCalendar(locale).getMinimalDaysInFirstWeek();
        }
        String country = locale.getCountry();
        return ((country.isEmpty() && locale.getLanguage().isEmpty()) || this.f83294b.contains(country)) ? 4 : 1;
    }

    @Override // net.time4j.format.a0
    public int c(Locale locale) {
        String country = locale.getCountry();
        g1 g1Var = g1.SATURDAY;
        if (this.f83296d.containsKey(country)) {
            g1Var = this.f83296d.get(country);
        }
        return g1Var.getValue();
    }

    @Override // net.time4j.format.a0
    public int d(Locale locale) {
        if (this.f83295c.isEmpty()) {
            int firstDayOfWeek = new GregorianCalendar(locale).getFirstDayOfWeek();
            if (firstDayOfWeek == 1) {
                return 7;
            }
            return firstDayOfWeek - 1;
        }
        String country = locale.getCountry();
        g1 g1Var = g1.MONDAY;
        if (this.f83295c.containsKey(country)) {
            g1Var = this.f83295c.get(country);
        }
        return g1Var.getValue();
    }

    public String toString() {
        return getClass().getName() + this.f83293a;
    }
}
