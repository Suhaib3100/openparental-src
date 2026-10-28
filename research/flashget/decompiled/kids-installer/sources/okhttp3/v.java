package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Headers.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u0000 \t2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002)\u000bB\u0017\b\u0002\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\"¢\u0006\u0004\b'\u0010(J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0014J\u001b\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0016H\u0096\u0002J\u0006\u0010\u0019\u001a\u00020\u0018J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b&\u0010\f¨\u0006*"}, d2 = {"Lokhttp3/v;", "", "Lkotlin/q0;", "", "name", "g", "Ljava/util/Date;", "h", "Ljava/time/Instant;", "p", "", "b", "()I", "index", "q", "x", "", "r", "", "y", "", "f", "", "iterator", "Lokhttp3/v$a;", "s", "", "other", "", "equals", "hashCode", "toString", "", "v", "", "o", "[Ljava/lang/String;", "namesAndValues", "size", "<init>", "([Ljava/lang/String;)V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class v implements Iterable<Pair<? extends String, ? extends String>>, r3.a {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final String[] namesAndValues;

    /* compiled from: Headers.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000eJ\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0010H\u0007J\u0019\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000eH\u0086\u0002J\u0019\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0010H\u0087\u0002J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002J\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u0019\u001a\u00020\u000bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lokhttp3/v$a;", "", "", "line", "f", "(Ljava/lang/String;)Lokhttp3/v$a;", "a", "name", "value", "b", "h", "Lokhttp3/v;", "headers", "e", "Ljava/util/Date;", "d", "Ljava/time/Instant;", "c", "o", "n", "g", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/v$a;", "l", "m", "j", "i", "", "Ljava/util/List;", "k", "()Ljava/util/List;", "namesAndValues", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final List<String> namesAndValues = new ArrayList(20);

        @d5.d
        public final a a(@d5.d String line) {
            int o32;
            CharSequence C5;
            kotlin.jvm.internal.l0.p(line, ProtectedSandApp.s("曹"));
            o32 = kotlin.text.h0.o3(line, ':', 0, false, 6, null);
            if (!(o32 != -1)) {
                throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("曽"), line).toString());
            }
            String substring = line.substring(0, o32);
            kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("曺"));
            if (substring == null) {
                throw new NullPointerException(ProtectedSandApp.s("曼"));
            }
            C5 = kotlin.text.h0.C5(substring);
            String obj = C5.toString();
            String substring2 = line.substring(o32 + 1);
            kotlin.jvm.internal.l0.o(substring2, ProtectedSandApp.s("曻"));
            b(obj, substring2);
            return this;
        }

        @d5.d
        public final a b(@d5.d String name, @d5.d String value) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("曾"));
            kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("替"));
            Companion companion = v.INSTANCE;
            companion.f(name);
            companion.g(value, name);
            g(name, value);
            return this;
        }

        @d5.d
        @IgnoreJRERequirement
        public final a c(@d5.d String name, @d5.d Instant value) {
            long epochMilli;
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("最"));
            kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("朁"));
            epochMilli = value.toEpochMilli();
            d(name, new Date(epochMilli));
            return this;
        }

        @d5.d
        public final a d(@d5.d String name, @d5.d Date value) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("朂"));
            kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("會"));
            b(name, okhttp3.internal.http.c.b(value));
            return this;
        }

        @d5.d
        public final a e(@d5.d v headers) {
            kotlin.jvm.internal.l0.p(headers, ProtectedSandApp.s("朄"));
            int size = headers.size();
            for (int i5 = 0; i5 < size; i5++) {
                g(headers.q(i5), headers.x(i5));
            }
            return this;
        }

        @d5.d
        public final a f(@d5.d String line) {
            int o32;
            kotlin.jvm.internal.l0.p(line, ProtectedSandApp.s("朅"));
            o32 = kotlin.text.h0.o3(line, ':', 1, false, 4, null);
            String s5 = ProtectedSandApp.s("朆");
            if (o32 != -1) {
                String substring = line.substring(0, o32);
                kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("朇"));
                String substring2 = line.substring(o32 + 1);
                kotlin.jvm.internal.l0.o(substring2, s5);
                g(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                kotlin.jvm.internal.l0.o(substring3, s5);
                g("", substring3);
            } else {
                g("", line);
            }
            return this;
        }

        @d5.d
        public final a g(@d5.d String name, @d5.d String value) {
            CharSequence C5;
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("月"));
            kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("有"));
            this.namesAndValues.add(name);
            List<String> list = this.namesAndValues;
            C5 = kotlin.text.h0.C5(value);
            list.add(C5.toString());
            return this;
        }

        @d5.d
        public final a h(@d5.d String name, @d5.d String value) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("朊"));
            kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("朋"));
            v.INSTANCE.f(name);
            g(name, value);
            return this;
        }

        @d5.d
        public final v i() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            if (array != null) {
                return new v((String[]) array, null);
            }
            throw new NullPointerException(ProtectedSandApp.s("朌"));
        }

        /* JADX WARN: Incorrect condition in loop: B:8:0x003a */
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String j(@d5.d java.lang.String r6) {
            /*
                r5 = this;
                java.lang.String r0 = "服"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r6, r0)
                java.util.List<java.lang.String> r0 = r5.namesAndValues
                int r0 = r0.size()
                r1 = 2
                int r0 = r0 - r1
                r2 = 0
                kotlin.ranges.j r0 = kotlin.ranges.s.k0(r0, r2)
                kotlin.ranges.j r0 = kotlin.ranges.s.B1(r0, r1)
                int r1 = r0.getF23724o()
                int r2 = r0.getF23725p()
                int r0 = r0.getF23726q()
                if (r0 < 0) goto L2b
                if (r1 > r2) goto L4a
                goto L2d
            L2b:
                if (r1 < r2) goto L4a
            L2d:
                java.util.List<java.lang.String> r3 = r5.namesAndValues
                java.lang.Object r3 = r3.get(r1)
                java.lang.String r3 = (java.lang.String) r3
                r4 = 1
                boolean r3 = kotlin.text.v.K1(r6, r3, r4)
                if (r3 == 0) goto L46
                java.util.List<java.lang.String> r6 = r5.namesAndValues
                int r1 = r1 + r4
                java.lang.Object r6 = r6.get(r1)
                java.lang.String r6 = (java.lang.String) r6
                return r6
            L46:
                if (r1 == r2) goto L4a
                int r1 = r1 + r0
                goto L2d
            L4a:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.v.a.j(java.lang.String):java.lang.String");
        }

        @d5.d
        public final List<String> k() {
            return this.namesAndValues;
        }

        @d5.d
        public final a l(@d5.d String name) {
            boolean K1;
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("朎"));
            int i5 = 0;
            while (i5 < this.namesAndValues.size()) {
                K1 = kotlin.text.e0.K1(name, this.namesAndValues.get(i5), true);
                if (K1) {
                    this.namesAndValues.remove(i5);
                    this.namesAndValues.remove(i5);
                    i5 -= 2;
                }
                i5 += 2;
            }
            return this;
        }

        @d5.d
        public final a m(@d5.d String name, @d5.d String value) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("朏"));
            kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("朐"));
            Companion companion = v.INSTANCE;
            companion.f(name);
            companion.g(value, name);
            l(name);
            g(name, value);
            return this;
        }

        @d5.d
        @IgnoreJRERequirement
        public final a n(@d5.d String name, @d5.d Instant value) {
            long epochMilli;
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("朑"));
            kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("朒"));
            epochMilli = value.toEpochMilli();
            return o(name, new Date(epochMilli));
        }

        @d5.d
        public final a o(@d5.d String name, @d5.d Date value) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("朓"));
            kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("朔"));
            m(name, okhttp3.internal.http.c.b(value));
            return this;
        }
    }

    /* compiled from: Headers.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J#\u0010\r\u001a\u00020\f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lokhttp3/v$b;", "", "", "", "namesAndValues", "name", "h", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/m2;", "f", "value", "g", "Lokhttp3/v;", "j", "([Ljava/lang/String;)Lokhttp3/v;", "b", "", "i", "(Ljava/util/Map;)Lokhttp3/v;", "headers", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.v$b, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("朖").toString());
            }
            int length = str.length();
            for (int i5 = 0; i5 < length; i5++) {
                char charAt = str.charAt(i5);
                if (!('!' <= charAt && '~' >= charAt)) {
                    throw new IllegalArgumentException(okhttp3.internal.d.v(ProtectedSandApp.s("朕"), Integer.valueOf(charAt), Integer.valueOf(i5), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(String str, String str2) {
            int length = str.length();
            for (int i5 = 0; i5 < length; i5++) {
                char charAt = str.charAt(i5);
                if (!(charAt == '\t' || (' ' <= charAt && '~' >= charAt))) {
                    throw new IllegalArgumentException(okhttp3.internal.d.v(ProtectedSandApp.s("朗"), Integer.valueOf(charAt), Integer.valueOf(i5), str2, str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Incorrect condition in loop: B:8:0x0026 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String h(java.lang.String[] r6, java.lang.String r7) {
            /*
                r5 = this;
                int r0 = r6.length
                r1 = 2
                int r0 = r0 - r1
                r2 = 0
                kotlin.ranges.j r0 = kotlin.ranges.s.k0(r0, r2)
                kotlin.ranges.j r0 = kotlin.ranges.s.B1(r0, r1)
                int r1 = r0.getF23724o()
                int r2 = r0.getF23725p()
                int r0 = r0.getF23726q()
                if (r0 < 0) goto L1d
                if (r1 > r2) goto L30
                goto L1f
            L1d:
                if (r1 < r2) goto L30
            L1f:
                r3 = r6[r1]
                r4 = 1
                boolean r3 = kotlin.text.v.K1(r7, r3, r4)
                if (r3 == 0) goto L2c
                int r1 = r1 + r4
                r6 = r6[r1]
                return r6
            L2c:
                if (r1 == r2) goto L30
                int r1 = r1 + r0
                goto L1f
            L30:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.v.Companion.h(java.lang.String[], java.lang.String):java.lang.String");
        }

        @p3.i(name = "-deprecated_of")
        @Deprecated(level = DeprecationLevel.ERROR, message = "function moved to extension", replaceWith = @ReplaceWith(expression = "headers.toHeaders()", imports = {}))
        @d5.d
        public final v a(@d5.d Map<String, String> headers) {
            kotlin.jvm.internal.l0.p(headers, ProtectedSandApp.s("朘"));
            return i(headers);
        }

        @p3.i(name = "-deprecated_of")
        @Deprecated(level = DeprecationLevel.ERROR, message = "function name changed", replaceWith = @ReplaceWith(expression = "headersOf(*namesAndValues)", imports = {}))
        @d5.d
        public final v b(@d5.d String... namesAndValues) {
            kotlin.jvm.internal.l0.p(namesAndValues, ProtectedSandApp.s("朙"));
            return j((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        @p3.i(name = "of")
        @d5.d
        @p3.n
        public final v i(@d5.d Map<String, String> map) {
            CharSequence C5;
            CharSequence C52;
            kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("朚"));
            String[] strArr = new String[map.size() * 2];
            int i5 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String s5 = ProtectedSandApp.s("望");
                if (key == null) {
                    throw new NullPointerException(s5);
                }
                C5 = kotlin.text.h0.C5(key);
                String obj = C5.toString();
                if (value == null) {
                    throw new NullPointerException(s5);
                }
                C52 = kotlin.text.h0.C5(value);
                String obj2 = C52.toString();
                f(obj);
                g(obj2, obj);
                strArr[i5] = obj;
                strArr[i5 + 1] = obj2;
                i5 += 2;
            }
            return new v(strArr, null);
        }

        @p3.i(name = "of")
        @d5.d
        @p3.n
        public final v j(@d5.d String... namesAndValues) {
            IntRange W1;
            IntProgression B1;
            CharSequence C5;
            kotlin.jvm.internal.l0.p(namesAndValues, ProtectedSandApp.s("朜"));
            if (!(namesAndValues.length % 2 == 0)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("朠").toString());
            }
            Object clone = namesAndValues.clone();
            if (clone == null) {
                throw new NullPointerException(ProtectedSandApp.s("期"));
            }
            String[] strArr = (String[]) clone;
            int length = strArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                String str = strArr[i5];
                if (!(str != null)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("朞").toString());
                }
                if (str == null) {
                    throw new NullPointerException(ProtectedSandApp.s("朝"));
                }
                C5 = kotlin.text.h0.C5(str);
                strArr[i5] = C5.toString();
            }
            W1 = kotlin.ranges.u.W1(0, strArr.length);
            B1 = kotlin.ranges.u.B1(W1, 2);
            int f23724o = B1.getF23724o();
            int f23725p = B1.getF23725p();
            int f23726q = B1.getF23726q();
            if (f23726q < 0 ? f23724o >= f23725p : f23724o <= f23725p) {
                while (true) {
                    String str2 = strArr[f23724o];
                    String str3 = strArr[f23724o + 1];
                    f(str2);
                    g(str3, str2);
                    if (f23724o == f23725p) {
                        break;
                    }
                    f23724o += f23726q;
                }
            }
            return new v(strArr, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    private v(String[] strArr) {
        this.namesAndValues = strArr;
    }

    @p3.i(name = "of")
    @d5.d
    @p3.n
    public static final v t(@d5.d Map<String, String> map) {
        return INSTANCE.i(map);
    }

    @p3.i(name = "of")
    @d5.d
    @p3.n
    public static final v u(@d5.d String... strArr) {
        return INSTANCE.j(strArr);
    }

    @p3.i(name = "-deprecated_size")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    public final int b() {
        return this.namesAndValues.length / 2;
    }

    public boolean equals(@d5.e Object other) {
        return (other instanceof v) && Arrays.equals(this.namesAndValues, ((v) other).namesAndValues);
    }

    public final long f() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i5 = 0; i5 < strArr.length; i5++) {
            length += this.namesAndValues[i5].length();
        }
        return length;
    }

    @d5.e
    public final String g(@d5.d String name) {
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("鉾"));
        return INSTANCE.h(this.namesAndValues, name);
    }

    @d5.e
    public final Date h(@d5.d String name) {
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("鉿"));
        String g5 = g(name);
        if (g5 != null) {
            return okhttp3.internal.http.c.a(g5);
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    @d5.d
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int length = this.namesAndValues.length / 2;
        Pair[] pairArr = new Pair[length];
        for (int i5 = 0; i5 < length; i5++) {
            pairArr[i5] = new Pair(q(i5), x(i5));
        }
        return kotlin.jvm.internal.i.a(pairArr);
    }

    @d5.e
    @IgnoreJRERequirement
    public final Instant p(@d5.d String name) {
        Instant instant;
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("銀"));
        Date h5 = h(name);
        if (h5 == null) {
            return null;
        }
        instant = h5.toInstant();
        return instant;
    }

    @d5.d
    public final String q(int index) {
        return this.namesAndValues[index * 2];
    }

    @d5.d
    public final Set<String> r() {
        Comparator Q1;
        Q1 = kotlin.text.e0.Q1(StringCompanionObject.f23622a);
        TreeSet treeSet = new TreeSet(Q1);
        int length = this.namesAndValues.length / 2;
        for (int i5 = 0; i5 < length; i5++) {
            treeSet.add(q(i5));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        kotlin.jvm.internal.l0.o(unmodifiableSet, ProtectedSandApp.s("銁"));
        return unmodifiableSet;
    }

    @d5.d
    public final a s() {
        a aVar = new a();
        kotlin.collections.f0.s0(aVar.k(), this.namesAndValues);
        return aVar;
    }

    @p3.i(name = "size")
    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @d5.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.namesAndValues.length / 2;
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(q(i5));
            sb.append(ProtectedSandApp.s("銂"));
            sb.append(x(i5));
            sb.append(ProtectedSandApp.s("銃"));
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("銄"));
        return sb2;
    }

    @d5.d
    public final Map<String, List<String>> v() {
        Comparator Q1;
        Q1 = kotlin.text.e0.Q1(StringCompanionObject.f23622a);
        TreeMap treeMap = new TreeMap(Q1);
        int length = this.namesAndValues.length / 2;
        for (int i5 = 0; i5 < length; i5++) {
            String q5 = q(i5);
            Locale locale = Locale.US;
            kotlin.jvm.internal.l0.o(locale, ProtectedSandApp.s("銅"));
            if (q5 == null) {
                throw new NullPointerException(ProtectedSandApp.s("銇"));
            }
            String lowerCase = q5.toLowerCase(locale);
            kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("銆"));
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(x(i5));
        }
        return treeMap;
    }

    @d5.d
    public final String x(int index) {
        return this.namesAndValues[(index * 2) + 1];
    }

    @d5.d
    public final List<String> y(@d5.d String name) {
        boolean K1;
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("銈"));
        int length = this.namesAndValues.length / 2;
        ArrayList arrayList = null;
        for (int i5 = 0; i5 < length; i5++) {
            K1 = kotlin.text.e0.K1(name, q(i5), true);
            if (K1) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(x(i5));
            }
        }
        if (arrayList == null) {
            return EmptyList.f23167o;
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.l0.o(unmodifiableList, ProtectedSandApp.s("銉"));
        return unmodifiableList;
    }

    public /* synthetic */ v(String[] strArr, kotlin.jvm.internal.w wVar) {
        this(strArr);
    }
}
