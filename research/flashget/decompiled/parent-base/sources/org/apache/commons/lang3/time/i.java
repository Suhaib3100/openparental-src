package org.apache.commons.lang3.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: FastDatePrinter.java */
/* loaded from: classes6.dex */
public class i implements org.apache.commons.lang3.time.d, Serializable {

    /* renamed from: g, reason: collision with root package name */
    private static final long f86317g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f86318h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f86319i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f86320j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f86321k = 3;

    /* renamed from: l, reason: collision with root package name */
    private static final int f86322l = 10;

    /* renamed from: m, reason: collision with root package name */
    private static final ConcurrentMap<C1340i, String> f86323m = new ConcurrentHashMap(7);

    /* renamed from: b, reason: collision with root package name */
    private final String f86324b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeZone f86325c;

    /* renamed from: d, reason: collision with root package name */
    private final Locale f86326d;

    /* renamed from: e, reason: collision with root package name */
    private transient f[] f86327e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f86328f;

    /* compiled from: FastDatePrinter.java */
    private static class a implements f {

        /* renamed from: a, reason: collision with root package name */
        private final char f86329a;

        a(char c5) {
            this.f86329a = c5;
        }

        @Override // org.apache.commons.lang3.time.i.f
        public int a() {
            return 1;
        }

        @Override // org.apache.commons.lang3.time.i.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f86329a);
        }
    }

    /* compiled from: FastDatePrinter.java */
    private static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        private final d f86330a;

        b(d dVar) {
            this.f86330a = dVar;
        }

        @Override // org.apache.commons.lang3.time.i.f
        public int a() {
            return this.f86330a.a();
        }

        @Override // org.apache.commons.lang3.time.i.d
        public void b(Appendable appendable, int i4) throws IOException {
            this.f86330a.b(appendable, i4);
        }

        @Override // org.apache.commons.lang3.time.i.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int i4 = calendar.get(7);
            this.f86330a.b(appendable, i4 != 1 ? i4 - 1 : 7);
        }
    }

    /* compiled from: FastDatePrinter.java */
    private static class c implements f {

        /* renamed from: b, reason: collision with root package name */
        static final c f86331b = new c(3);

        /* renamed from: c, reason: collision with root package name */
        static final c f86332c = new c(5);

        /* renamed from: d, reason: collision with root package name */
        static final c f86333d = new c(6);

        /* renamed from: a, reason: collision with root package name */
        final int f86334a;

        c(int i4) {
            this.f86334a = i4;
        }

        static c d(int i4) {
            if (i4 == 1) {
                return f86331b;
            }
            if (i4 == 2) {
                return f86332c;
            }
            if (i4 == 3) {
                return f86333d;
            }
            throw new IllegalArgumentException("invalid number of X");
        }

        @Override // org.apache.commons.lang3.time.i.f
        public int a() {
            return this.f86334a;
        }

        @Override // org.apache.commons.lang3.time.i.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int i4 = calendar.get(16) + calendar.get(15);
            if (i4 == 0) {
                appendable.append("Z");
                return;
            }
            if (i4 < 0) {
                appendable.append('-');
                i4 = -i4;
            } else {
                appendable.append('+');
            }
            int i5 = i4 / 3600000;
            i.h(appendable, i5);
            int i6 = this.f86334a;
            if (i6 < 5) {
                return;
            }
            if (i6 == 6) {
                appendable.append(':');
            }
            i.h(appendable, (i4 / 60000) - (i5 * 60));
        }
    }

    /* compiled from: FastDatePrinter.java */
    private interface d extends f {
        void b(Appendable appendable, int i4) throws IOException;
    }

    /* compiled from: FastDatePrinter.java */
    private static class e implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f86335a;

        /* renamed from: b, reason: collision with root package name */
        private final int f86336b;

        e(int i4, int i5) {
            if (i5 < 3) {
                throw new IllegalArgumentException();
            }
            this.f86335a = i4;
            this.f86336b = i5;
        }

        @Override // org.apache.commons.lang3.time.i.f
        public int a() {
            return this.f86336b;
        }

        @Override // org.apache.commons.lang3.time.i.d
        public final void b(Appendable appendable, int i4) throws IOException {
            i.i(appendable, i4, this.f86336b);
        }

        @Override // org.apache.commons.lang3.time.i.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(this.f86335a));
        }
    }

    /* compiled from: FastDatePrinter.java */
    private interface f {
        int a();

        void c(Appendable appendable, Calendar calendar) throws IOException;
    }

    /* compiled from: FastDatePrinter.java */
    private static class g implements f {

        /* renamed from: a, reason: collision with root package name */
        private final String f86337a;

        g(String str) {
            this.f86337a = str;
        }

        @Override // org.apache.commons.lang3.time.i.f
        public int a() {
            return this.f86337a.length();
        }

        @Override // org.apache.commons.lang3.time.i.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f86337a);
        }
    }

    /* compiled from: FastDatePrinter.java */
    private static class h implements f {

        /* renamed from: a, reason: collision with root package name */
        private final int f86338a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f86339b;

        h(int i4, String[] strArr) {
            this.f86338a = i4;
            this.f86339b = strArr;
        }

        @Override // org.apache.commons.lang3.time.i.f
        public int a() {
            int length = this.f86339b.length;
            int i4 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i4;
                }
                int length2 = this.f86339b[length].length();
                if (length2 > i4) {
                    i4 = length2;
                }
            }
        }

        @Override // org.apache.commons.lang3.time.i.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f86339b[calendar.get(this.f86338a)]);
        }
    }

    /* compiled from: FastDatePrinter.java */
    /* renamed from: org.apache.commons.lang3.time.i$i, reason: collision with other inner class name */
    private static class C1340i {

        /* renamed from: a, reason: collision with root package name */
        private final TimeZone f86340a;

        /* renamed from: b, reason: collision with root package name */
        private final int f86341b;

        /* renamed from: c, reason: collision with root package name */
        private final Locale f86342c;

        C1340i(TimeZone timeZone, boolean z4, int i4, Locale locale) {
            this.f86340a = timeZone;
            if (z4) {
                this.f86341b = Integer.MIN_VALUE | i4;
            } else {
                this.f86341b = i4;
            }
            this.f86342c = locale;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1340i)) {
                return false;
            }
            C1340i c1340i = (C1340i) obj;
            return this.f86340a.equals(c1340i.f86340a) && this.f86341b == c1340i.f86341b && this.f86342c.equals(c1340i.f86342c);
        }

        public int hashCode() {
            return this.f86340a.hashCode() + ((this.f86342c.hashCode() + (this.f86341b * 31)) * 31);
        }
    }

    /* compiled from: FastDatePrinter.java */
    private static class j implements f {

        /* renamed from: a, reason: collision with root package name */
        private final Locale f86343a;

        /* renamed from: b, reason: collision with root package name */
        private final int f86344b;

        /* renamed from: c, reason: collision with root package name */
        private final String f86345c;

        /* renamed from: d, reason: collision with root package name */
        private final String f86346d;

        j(TimeZone timeZone, Locale locale, int i4) {
            this.f86343a = locale;
            this.f86344b = i4;
            this.f86345c = i.u(timeZone, false, i4, locale);
            this.f86346d = i.u(timeZone, true, i4, locale);
        }

        @Override // org.apache.commons.lang3.time.i.f
        public int a() {
            return Math.max(this.f86345c.length(), this.f86346d.length());
        }

        @Override // org.apache.commons.lang3.time.i.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            TimeZone timeZone = calendar.getTimeZone();
            if (calendar.get(16) == 0) {
                appendable.append(i.u(timeZone, false, this.f86344b, this.f86343a));
            } else {
                appendable.append(i.u(timeZone, true, this.f86344b, this.f86343a));
            }
        }
    }

    /* compiled from: FastDatePrinter.java */
    private static class k implements f {

        /* renamed from: b, reason: collision with root package name */
        static final k f86347b = new k(true);

        /* renamed from: c, reason: collision with root package name */
        static final k f86348c = new k(false);

        /* renamed from: a, reason: collision with root package name */
        final boolean f86349a;

        k(boolean z4) {
            this.f86349a = z4;
        }

        @Override // org.apache.commons.lang3.time.i.f
        public int a() {
            return 5;
        }

        @Override // org.apache.commons.lang3.time.i.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int i4 = calendar.get(16) + calendar.get(15);
            if (i4 < 0) {
                appendable.append('-');
                i4 = -i4;
            } else {
                appendable.append('+');
            }
            int i5 = i4 / 3600000;
            i.h(appendable, i5);
            if (this.f86349a) {
                appendable.append(':');
            }
            i.h(appendable, (i4 / 60000) - (i5 * 60));
        }
    }

    /* compiled from: FastDatePrinter.java */
    private static class l implements d {

        /* renamed from: a, reason: collision with root package name */
        private final d f86350a;

        l(d dVar) {
            this.f86350a = dVar;
        }

        @Override // org.apache.commons.lang3.time.i.f
        public int a() {
            return this.f86350a.a();
        }

        @Override // org.apache.commons.lang3.time.i.d
        public void b(Appendable appendable, int i4) throws IOException {
            this.f86350a.b(appendable, i4);
        }

        @Override // org.apache.commons.lang3.time.i.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int i4 = calendar.get(10);
            if (i4 == 0) {
                i4 = calendar.getLeastMaximum(10) + 1;
            }
            this.f86350a.b(appendable, i4);
        }
    }

    /* compiled from: FastDatePrinter.java */
    private static class m implements d {

        /* renamed from: a, reason: collision with root package name */
        private final d f86351a;

        m(d dVar) {
            this.f86351a = dVar;
        }

        @Override // org.apache.commons.lang3.time.i.f
        public int a() {
            return this.f86351a.a();
        }

        @Override // org.apache.commons.lang3.time.i.d
        public void b(Appendable appendable, int i4) throws IOException {
            this.f86351a.b(appendable, i4);
        }

        @Override // org.apache.commons.lang3.time.i.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int i4 = calendar.get(11);
            if (i4 == 0) {
                i4 = calendar.getMaximum(11) + 1;
            }
            this.f86351a.b(appendable, i4);
        }
    }

    /* compiled from: FastDatePrinter.java */
    private static class n implements d {

        /* renamed from: a, reason: collision with root package name */
        static final n f86352a = new n();

        n() {
        }

        @Override // org.apache.commons.lang3.time.i.f
        public int a() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.i.d
        public final void b(Appendable appendable, int i4) throws IOException {
            i.h(appendable, i4);
        }

        @Override // org.apache.commons.lang3.time.i.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            i.h(appendable, calendar.get(2) + 1);
        }
    }

    /* compiled from: FastDatePrinter.java */
    private static class o implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f86353a;

        o(int i4) {
            this.f86353a = i4;
        }

        @Override // org.apache.commons.lang3.time.i.f
        public int a() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.i.d
        public final void b(Appendable appendable, int i4) throws IOException {
            if (i4 < 100) {
                i.h(appendable, i4);
            } else {
                i.i(appendable, i4, 2);
            }
        }

        @Override // org.apache.commons.lang3.time.i.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(this.f86353a));
        }
    }

    /* compiled from: FastDatePrinter.java */
    private static class p implements d {

        /* renamed from: a, reason: collision with root package name */
        static final p f86354a = new p();

        p() {
        }

        @Override // org.apache.commons.lang3.time.i.f
        public int a() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.i.d
        public final void b(Appendable appendable, int i4) throws IOException {
            i.h(appendable, i4);
        }

        @Override // org.apache.commons.lang3.time.i.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            i.h(appendable, calendar.get(1) % 100);
        }
    }

    /* compiled from: FastDatePrinter.java */
    private static class q implements d {

        /* renamed from: a, reason: collision with root package name */
        static final q f86355a = new q();

        q() {
        }

        @Override // org.apache.commons.lang3.time.i.f
        public int a() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.i.d
        public final void b(Appendable appendable, int i4) throws IOException {
            if (i4 < 10) {
                appendable.append((char) (i4 + 48));
            } else {
                i.h(appendable, i4);
            }
        }

        @Override // org.apache.commons.lang3.time.i.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(2) + 1);
        }
    }

    /* compiled from: FastDatePrinter.java */
    private static class r implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f86356a;

        r(int i4) {
            this.f86356a = i4;
        }

        @Override // org.apache.commons.lang3.time.i.f
        public int a() {
            return 4;
        }

        @Override // org.apache.commons.lang3.time.i.d
        public final void b(Appendable appendable, int i4) throws IOException {
            if (i4 < 10) {
                appendable.append((char) (i4 + 48));
            } else if (i4 < 100) {
                i.h(appendable, i4);
            } else {
                i.i(appendable, i4, 1);
            }
        }

        @Override // org.apache.commons.lang3.time.i.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(this.f86356a));
        }
    }

    /* compiled from: FastDatePrinter.java */
    private static class s implements d {

        /* renamed from: a, reason: collision with root package name */
        private final d f86357a;

        s(d dVar) {
            this.f86357a = dVar;
        }

        @Override // org.apache.commons.lang3.time.i.f
        public int a() {
            return this.f86357a.a();
        }

        @Override // org.apache.commons.lang3.time.i.d
        public void b(Appendable appendable, int i4) throws IOException {
            this.f86357a.b(appendable, i4);
        }

        @Override // org.apache.commons.lang3.time.i.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            this.f86357a.b(appendable, calendar.getWeekYear());
        }
    }

    protected i(String str, TimeZone timeZone, Locale locale) {
        this.f86324b = str;
        this.f86325c = timeZone;
        this.f86326d = locale;
        v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(Appendable appendable, int i4) throws IOException {
        appendable.append((char) ((i4 / 10) + 48));
        appendable.append((char) ((i4 % 10) + 48));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(Appendable appendable, int i4, int i5) throws IOException {
        if (i4 < 10000) {
            int i6 = i4 < 1000 ? i4 < 100 ? i4 < 10 ? 1 : 2 : 3 : 4;
            for (int i7 = i5 - i6; i7 > 0; i7--) {
                appendable.append('0');
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            return;
                        }
                        appendable.append((char) ((i4 / 1000) + 48));
                        i4 %= 1000;
                    }
                    if (i4 >= 100) {
                        appendable.append((char) ((i4 / 100) + 48));
                        i4 %= 100;
                    } else {
                        appendable.append('0');
                    }
                }
                if (i4 >= 10) {
                    appendable.append((char) ((i4 / 10) + 48));
                    i4 %= 10;
                } else {
                    appendable.append('0');
                }
            }
            appendable.append((char) (i4 + 48));
            return;
        }
        char[] cArr = new char[10];
        int i10 = 0;
        while (i4 != 0) {
            cArr[i10] = (char) ((i4 % 10) + 48);
            i4 /= 10;
            i10++;
        }
        while (i10 < i5) {
            appendable.append('0');
            i5--;
        }
        while (true) {
            i10--;
            if (i10 < 0) {
                return;
            } else {
                appendable.append(cArr[i10]);
            }
        }
    }

    private <B extends Appendable> B j(Calendar calendar, B b5) {
        try {
            for (f fVar : this.f86327e) {
                fVar.c(b5, calendar);
            }
        } catch (IOException e4) {
            org.apache.commons.lang3.exception.d.z(e4);
        }
        return b5;
    }

    private String r(Calendar calendar) {
        return ((StringBuilder) j(calendar, new StringBuilder(this.f86328f))).toString();
    }

    static String u(TimeZone timeZone, boolean z4, int i4, Locale locale) {
        C1340i c1340i = new C1340i(timeZone, z4, i4, locale);
        ConcurrentMap<C1340i, String> concurrentMap = f86323m;
        String str = concurrentMap.get(c1340i);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z4, i4, locale);
        String putIfAbsent = concurrentMap.putIfAbsent(c1340i, displayName);
        return putIfAbsent != null ? putIfAbsent : displayName;
    }

    private void v() {
        int i4 = 0;
        f[] fVarArr = (f[]) x().toArray(new f[0]);
        this.f86327e = fVarArr;
        int length = fVarArr.length;
        while (true) {
            length--;
            if (length < 0) {
                this.f86328f = i4;
                return;
            }
            i4 += this.f86327e[length].a();
        }
    }

    private Calendar w() {
        return Calendar.getInstance(this.f86325c, this.f86326d);
    }

    private void z(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        v();
    }

    protected d A(int i4, int i5) {
        return i5 != 1 ? i5 != 2 ? new e(i4, i5) : new o(i4) : new r(i4);
    }

    @Override // org.apache.commons.lang3.time.d
    public String b() {
        return this.f86324b;
    }

    @Override // org.apache.commons.lang3.time.d
    public TimeZone c() {
        return this.f86325c;
    }

    @Override // org.apache.commons.lang3.time.d
    public StringBuffer d(long j4, StringBuffer stringBuffer) {
        Calendar w4 = w();
        w4.setTimeInMillis(j4);
        return (StringBuffer) j(w4, stringBuffer);
    }

    @Override // org.apache.commons.lang3.time.d
    public StringBuffer e(Date date, StringBuffer stringBuffer) {
        Calendar w4 = w();
        w4.setTime(date);
        return (StringBuffer) j(w4, stringBuffer);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f86324b.equals(iVar.f86324b) && this.f86325c.equals(iVar.f86325c) && this.f86326d.equals(iVar.f86326d);
    }

    @Override // org.apache.commons.lang3.time.d
    @Deprecated
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (obj instanceof Date) {
            return e((Date) obj, stringBuffer);
        }
        if (obj instanceof Calendar) {
            return l((Calendar) obj, stringBuffer);
        }
        if (obj instanceof Long) {
            return d(((Long) obj).longValue(), stringBuffer);
        }
        throw new IllegalArgumentException("Unknown class: ".concat(obj == null ? "<null>" : obj.getClass().getName()));
    }

    @Override // org.apache.commons.lang3.time.d
    public <B extends Appendable> B g(Calendar calendar, B b5) {
        if (!calendar.getTimeZone().equals(this.f86325c)) {
            calendar = (Calendar) calendar.clone();
            calendar.setTimeZone(this.f86325c);
        }
        return (B) j(calendar, b5);
    }

    @Override // org.apache.commons.lang3.time.d
    public Locale getLocale() {
        return this.f86326d;
    }

    public int hashCode() {
        return (((this.f86326d.hashCode() * 13) + this.f86325c.hashCode()) * 13) + this.f86324b.hashCode();
    }

    @Override // org.apache.commons.lang3.time.d
    public String k(Date date) {
        Calendar w4 = w();
        w4.setTime(date);
        return r(w4);
    }

    @Override // org.apache.commons.lang3.time.d
    public StringBuffer l(Calendar calendar, StringBuffer stringBuffer) {
        return e(calendar.getTime(), stringBuffer);
    }

    @Override // org.apache.commons.lang3.time.d
    public String m(long j4) {
        Calendar w4 = w();
        w4.setTimeInMillis(j4);
        return r(w4);
    }

    @Deprecated
    protected StringBuffer n(Calendar calendar, StringBuffer stringBuffer) {
        return (StringBuffer) j(calendar, stringBuffer);
    }

    @Override // org.apache.commons.lang3.time.d
    public <B extends Appendable> B o(long j4, B b5) {
        Calendar w4 = w();
        w4.setTimeInMillis(j4);
        return (B) j(w4, b5);
    }

    @Override // org.apache.commons.lang3.time.d
    public <B extends Appendable> B p(Date date, B b5) {
        Calendar w4 = w();
        w4.setTime(date);
        return (B) j(w4, b5);
    }

    @Override // org.apache.commons.lang3.time.d
    public String q(Calendar calendar) {
        return ((StringBuilder) g(calendar, new StringBuilder(this.f86328f))).toString();
    }

    String s(Object obj) {
        if (obj instanceof Date) {
            return k((Date) obj);
        }
        if (obj instanceof Calendar) {
            return q((Calendar) obj);
        }
        if (obj instanceof Long) {
            return m(((Long) obj).longValue());
        }
        throw new IllegalArgumentException("Unknown class: ".concat(obj == null ? "<null>" : obj.getClass().getName()));
    }

    public int t() {
        return this.f86328f;
    }

    public String toString() {
        return "FastDatePrinter[" + this.f86324b + "," + this.f86326d + "," + this.f86325c.getID() + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [org.apache.commons.lang3.time.i$j] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v44, types: [org.apache.commons.lang3.time.i$h] */
    /* JADX WARN: Type inference failed for: r11v5, types: [org.apache.commons.lang3.time.i$d] */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r11v64 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v71 */
    /* JADX WARN: Type inference failed for: r11v72 */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Type inference failed for: r11v74 */
    /* JADX WARN: Type inference failed for: r11v75 */
    /* JADX WARN: Type inference failed for: r11v76 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    protected List<f> x() {
        int i4;
        ?? A;
        Object bVar;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(this.f86326d);
        ArrayList arrayList = new ArrayList();
        String[] eras = dateFormatSymbols.getEras();
        String[] months = dateFormatSymbols.getMonths();
        String[] shortMonths = dateFormatSymbols.getShortMonths();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int length = this.f86324b.length();
        int i5 = 0;
        int i6 = 0;
        while (i6 < length) {
            int[] iArr = {i6};
            String y4 = y(this.f86324b, iArr);
            int i7 = iArr[i5];
            int length2 = y4.length();
            if (length2 == 0) {
                return arrayList;
            }
            char charAt = y4.charAt(i5);
            if (charAt != 'y') {
                if (charAt != 'z') {
                    switch (charAt) {
                        case '\'':
                            String substring = y4.substring(1);
                            A = substring.length() == 1 ? new a(substring.charAt(0)) : new g(substring);
                            i4 = 0;
                            arrayList.add(A);
                            i6 = i7 + 1;
                            i5 = i4;
                        case 'K':
                            A = A(10, length2);
                            i4 = 0;
                            arrayList.add(A);
                            i6 = i7 + 1;
                            i5 = i4;
                        case 'M':
                            A = length2 >= 4 ? new h(2, months) : length2 == 3 ? new h(2, shortMonths) : length2 == 2 ? n.f86352a : q.f86355a;
                            i4 = 0;
                            arrayList.add(A);
                            i6 = i7 + 1;
                            i5 = i4;
                        case 'S':
                            A = A(14, length2);
                            i4 = 0;
                            arrayList.add(A);
                            i6 = i7 + 1;
                            i5 = i4;
                        case 'a':
                            A = new h(9, amPmStrings);
                            i4 = 0;
                            arrayList.add(A);
                            i6 = i7 + 1;
                            i5 = i4;
                        case 'd':
                            A = A(5, length2);
                            i4 = 0;
                            arrayList.add(A);
                            i6 = i7 + 1;
                            i5 = i4;
                        case 'h':
                            A = new l(A(10, length2));
                            i4 = 0;
                            arrayList.add(A);
                            i6 = i7 + 1;
                            i5 = i4;
                        case 'k':
                            A = new m(A(11, length2));
                            i4 = 0;
                            arrayList.add(A);
                            i6 = i7 + 1;
                            i5 = i4;
                        case 'm':
                            A = A(12, length2);
                            i4 = 0;
                            arrayList.add(A);
                            i6 = i7 + 1;
                            i5 = i4;
                        case 's':
                            A = A(13, length2);
                            i4 = 0;
                            arrayList.add(A);
                            i6 = i7 + 1;
                            i5 = i4;
                        case 'u':
                            bVar = new b(A(7, length2));
                            A = bVar;
                            i4 = 0;
                            arrayList.add(A);
                            i6 = i7 + 1;
                            i5 = i4;
                        case 'w':
                            A = A(3, length2);
                            i4 = 0;
                            arrayList.add(A);
                            i6 = i7 + 1;
                            i5 = i4;
                        default:
                            switch (charAt) {
                                case 'D':
                                    A = A(6, length2);
                                    i4 = 0;
                                    arrayList.add(A);
                                    i6 = i7 + 1;
                                    i5 = i4;
                                case 'E':
                                    bVar = new h(7, length2 < 4 ? shortWeekdays : weekdays);
                                    A = bVar;
                                    i4 = 0;
                                    arrayList.add(A);
                                    i6 = i7 + 1;
                                    i5 = i4;
                                case 'F':
                                    A = A(8, length2);
                                    i4 = 0;
                                    arrayList.add(A);
                                    i6 = i7 + 1;
                                    i5 = i4;
                                case 'G':
                                    A = new h(0, eras);
                                    i4 = 0;
                                    arrayList.add(A);
                                    i6 = i7 + 1;
                                    i5 = i4;
                                case 'H':
                                    A = A(11, length2);
                                    i4 = 0;
                                    arrayList.add(A);
                                    i6 = i7 + 1;
                                    i5 = i4;
                                default:
                                    switch (charAt) {
                                        case 'W':
                                            A = A(4, length2);
                                            break;
                                        case 'X':
                                            A = c.d(length2);
                                            break;
                                        case 'Y':
                                            break;
                                        case 'Z':
                                            if (length2 != 1) {
                                                if (length2 != 2) {
                                                    A = k.f86347b;
                                                    break;
                                                } else {
                                                    A = c.f86333d;
                                                    break;
                                                }
                                            } else {
                                                A = k.f86348c;
                                                break;
                                            }
                                        default:
                                            throw new IllegalArgumentException("Illegal pattern component: ".concat(y4));
                                    }
                                    i4 = 0;
                                    arrayList.add(A);
                                    i6 = i7 + 1;
                                    i5 = i4;
                                    break;
                            }
                            break;
                    }
                } else if (length2 >= 4) {
                    A = new j(this.f86325c, this.f86326d, 1);
                    i4 = 0;
                    arrayList.add(A);
                    i6 = i7 + 1;
                    i5 = i4;
                } else {
                    i4 = 0;
                    A = new j(this.f86325c, this.f86326d, 0);
                    arrayList.add(A);
                    i6 = i7 + 1;
                    i5 = i4;
                }
            }
            i4 = 0;
            A = length2 == 2 ? p.f86354a : A(1, Math.max(length2, 4));
            if (charAt == 'Y') {
                A = new s(A);
                continue;
            }
            arrayList.add(A);
            i6 = i7 + 1;
            i5 = i4;
        }
        return arrayList;
    }

    protected String y(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i4 = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i4);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb.append(charAt);
            while (true) {
                int i5 = i4 + 1;
                if (i5 >= length || str.charAt(i5) != charAt) {
                    break;
                }
                sb.append(charAt);
                i4 = i5;
            }
        } else {
            sb.append('\'');
            boolean z4 = false;
            while (i4 < length) {
                char charAt2 = str.charAt(i4);
                if (charAt2 != '\'') {
                    if (!z4 && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                        i4--;
                        break;
                    }
                    sb.append(charAt2);
                } else {
                    int i6 = i4 + 1;
                    if (i6 >= length || str.charAt(i6) != '\'') {
                        z4 = !z4;
                    } else {
                        sb.append(charAt2);
                        i4 = i6;
                    }
                }
                i4++;
            }
        }
        iArr[0] = i4;
        return sb.toString();
    }
}
