package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t1;
import kotlin.q0;
import kotlin.x0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Headers.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\u0018\u0000 \u001f2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u00024\u0012B\u0017\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0016J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\"\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020!H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0011H\u0016¢\u0006\u0004\b,\u0010\u0013J\u000f\u0010-\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b0/¢\u0006\u0004\b0\u00101R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00102R\u0011\u00103\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b3\u0010\u0013¨\u00065"}, d2 = {"Lokhttp3/u;", "", "Lkotlin/q0;", "", "", "namesAndValues", "<init>", "([Ljava/lang/String;)V", "name", "f", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Date;", "h", "(Ljava/lang/String;)Ljava/util/Date;", "Ljava/time/Instant;", "i", "(Ljava/lang/String;)Ljava/time/Instant;", "", "b", "()I", "index", "j", "(I)Ljava/lang/String;", "s", "", "l", "()Ljava/util/Set;", "", "v", "(Ljava/lang/String;)Ljava/util/List;", "", "c", "()J", "", "iterator", "()Ljava/util/Iterator;", "Lokhttp3/u$a;", "m", "()Lokhttp3/u$a;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "", "r", "()Ljava/util/Map;", "[Ljava/lang/String;", "size", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class u implements Iterable<q0<? extends String, ? extends String>>, md.a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String[] namesAndValues;

    /* compiled from: Headers.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0018\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0014J \u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0015H\u0087\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\fJ\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0007J \u0010\u001c\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\fJ\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 R \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lokhttp3/u$a;", "", "<init>", "()V", "", "line", "f", "(Ljava/lang/String;)Lokhttp3/u$a;", "a", "name", "value", "b", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/u$a;", "h", "Lokhttp3/u;", "headers", "e", "(Lokhttp3/u;)Lokhttp3/u$a;", "Ljava/util/Date;", "d", "(Ljava/lang/String;Ljava/util/Date;)Lokhttp3/u$a;", "Ljava/time/Instant;", "c", "(Ljava/lang/String;Ljava/time/Instant;)Lokhttp3/u$a;", "o", "n", "g", "l", "m", "j", "(Ljava/lang/String;)Ljava/lang/String;", "i", "()Lokhttp3/u;", "", "Ljava/util/List;", "k", "()Ljava/util/List;", "namesAndValues", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<String> namesAndValues = new ArrayList(20);

        @fg.l
        public final a a(@fg.l String line) {
            l0.p(line, ProtectedSandApp.s("ꈡ\u0001"));
            int o32 = kotlin.text.v.o3(line, ':', 0, false, 6, null);
            if (!(o32 != -1)) {
                throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ꈥ\u0001"), line).toString());
            }
            String substring = line.substring(0, o32);
            l0.o(substring, ProtectedSandApp.s("ꈢ\u0001"));
            if (substring == null) {
                throw new NullPointerException(ProtectedSandApp.s("ꈤ\u0001"));
            }
            String obj = kotlin.text.v.C5(substring).toString();
            String substring2 = line.substring(o32 + 1);
            l0.o(substring2, ProtectedSandApp.s("ꈣ\u0001"));
            b(obj, substring2);
            return this;
        }

        @fg.l
        public final a b(@fg.l String name, @fg.l String value) {
            l0.p(name, ProtectedSandApp.s("ꈦ\u0001"));
            l0.p(value, ProtectedSandApp.s("ꈧ\u0001"));
            Companion companion = u.INSTANCE;
            companion.f(name);
            companion.g(value, name);
            g(name, value);
            return this;
        }

        @fg.l
        @IgnoreJRERequirement
        public final a c(@fg.l String name, @fg.l Instant value) {
            long epochMilli;
            l0.p(name, ProtectedSandApp.s("ꈦ\u0001"));
            l0.p(value, ProtectedSandApp.s("ꈧ\u0001"));
            epochMilli = value.toEpochMilli();
            d(name, new Date(epochMilli));
            return this;
        }

        @fg.l
        public final a d(@fg.l String name, @fg.l Date value) {
            l0.p(name, ProtectedSandApp.s("ꈦ\u0001"));
            l0.p(value, ProtectedSandApp.s("ꈧ\u0001"));
            b(name, okhttp3.internal.http.c.b(value));
            return this;
        }

        @fg.l
        public final a e(@fg.l u headers) {
            l0.p(headers, ProtectedSandApp.s("ꈨ\u0001"));
            int size = headers.size();
            for (int i4 = 0; i4 < size; i4++) {
                g(headers.j(i4), headers.s(i4));
            }
            return this;
        }

        @fg.l
        public final a f(@fg.l String line) {
            l0.p(line, ProtectedSandApp.s("ꈡ\u0001"));
            int o32 = kotlin.text.v.o3(line, ':', 1, false, 4, null);
            String s4 = ProtectedSandApp.s("ꈣ\u0001");
            if (o32 != -1) {
                String substring = line.substring(0, o32);
                l0.o(substring, ProtectedSandApp.s("ꈢ\u0001"));
                String substring2 = line.substring(o32 + 1);
                l0.o(substring2, s4);
                g(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                l0.o(substring3, s4);
                g("", substring3);
            } else {
                g("", line);
            }
            return this;
        }

        @fg.l
        public final a g(@fg.l String name, @fg.l String value) {
            l0.p(name, ProtectedSandApp.s("ꈦ\u0001"));
            l0.p(value, ProtectedSandApp.s("ꈧ\u0001"));
            this.namesAndValues.add(name);
            this.namesAndValues.add(kotlin.text.v.C5(value).toString());
            return this;
        }

        @fg.l
        public final a h(@fg.l String name, @fg.l String value) {
            l0.p(name, ProtectedSandApp.s("ꈦ\u0001"));
            l0.p(value, ProtectedSandApp.s("ꈧ\u0001"));
            u.INSTANCE.f(name);
            g(name, value);
            return this;
        }

        @fg.l
        public final u i() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            if (array != null) {
                return new u((String[]) array, null);
            }
            throw new NullPointerException(ProtectedSandApp.s("ꈩ\u0001"));
        }

        @fg.m
        public final String j(@fg.l String name) {
            l0.p(name, ProtectedSandApp.s("ꈦ\u0001"));
            kotlin.ranges.j B1 = kotlin.ranges.s.B1(kotlin.ranges.s.k0(this.namesAndValues.size() - 2, 0), 2);
            int first = B1.getFirst();
            int last = B1.getLast();
            int step = B1.getStep();
            if (step >= 0) {
                if (first > last) {
                    return null;
                }
            } else if (first < last) {
                return null;
            }
            while (!kotlin.text.v.K1(name, this.namesAndValues.get(first), true)) {
                if (first == last) {
                    return null;
                }
                first += step;
            }
            return this.namesAndValues.get(first + 1);
        }

        @fg.l
        public final List<String> k() {
            return this.namesAndValues;
        }

        @fg.l
        public final a l(@fg.l String name) {
            l0.p(name, ProtectedSandApp.s("ꈦ\u0001"));
            int i4 = 0;
            while (i4 < this.namesAndValues.size()) {
                if (kotlin.text.v.K1(name, this.namesAndValues.get(i4), true)) {
                    this.namesAndValues.remove(i4);
                    this.namesAndValues.remove(i4);
                    i4 -= 2;
                }
                i4 += 2;
            }
            return this;
        }

        @fg.l
        public final a m(@fg.l String name, @fg.l String value) {
            l0.p(name, ProtectedSandApp.s("ꈦ\u0001"));
            l0.p(value, ProtectedSandApp.s("ꈧ\u0001"));
            Companion companion = u.INSTANCE;
            companion.f(name);
            companion.g(value, name);
            l(name);
            g(name, value);
            return this;
        }

        @fg.l
        @IgnoreJRERequirement
        public final a n(@fg.l String name, @fg.l Instant value) {
            long epochMilli;
            l0.p(name, ProtectedSandApp.s("ꈦ\u0001"));
            l0.p(value, ProtectedSandApp.s("ꈧ\u0001"));
            epochMilli = value.toEpochMilli();
            return o(name, new Date(epochMilli));
        }

        @fg.l
        public final a o(@fg.l String name, @fg.l Date value) {
            l0.p(name, ProtectedSandApp.s("ꈦ\u0001"));
            l0.p(value, ProtectedSandApp.s("ꈧ\u0001"));
            m(name, okhttp3.internal.http.c.b(value));
            return this;
        }
    }

    /* compiled from: Headers.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u00020\u00102\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lokhttp3/u$b;", "", "<init>", "()V", "", "", "namesAndValues", "name", "h", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/k2;", "f", "(Ljava/lang/String;)V", "value", "g", "(Ljava/lang/String;Ljava/lang/String;)V", "Lokhttp3/u;", "j", "([Ljava/lang/String;)Lokhttp3/u;", "b", "", "i", "(Ljava/util/Map;)Lokhttp3/u;", "headers", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.u$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(String name) {
            if (!(name.length() > 0)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ꈫ\u0001"));
            }
            int length = name.length();
            for (int i4 = 0; i4 < length; i4++) {
                char charAt = name.charAt(i4);
                if (!('!' <= charAt && '~' >= charAt)) {
                    throw new IllegalArgumentException(okhttp3.internal.d.v(ProtectedSandApp.s("ꈪ\u0001"), Integer.valueOf(charAt), Integer.valueOf(i4), name).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(String value, String name) {
            int length = value.length();
            for (int i4 = 0; i4 < length; i4++) {
                char charAt = value.charAt(i4);
                if (!(charAt == '\t' || (' ' <= charAt && '~' >= charAt))) {
                    throw new IllegalArgumentException(okhttp3.internal.d.v(ProtectedSandApp.s("ꈬ\u0001"), Integer.valueOf(charAt), Integer.valueOf(i4), name, value).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String h(String[] namesAndValues, String name) {
            kotlin.ranges.j B1 = kotlin.ranges.s.B1(kotlin.ranges.s.k0(namesAndValues.length - 2, 0), 2);
            int first = B1.getFirst();
            int last = B1.getLast();
            int step = B1.getStep();
            if (step >= 0) {
                if (first > last) {
                    return null;
                }
            } else if (first < last) {
                return null;
            }
            while (!kotlin.text.v.K1(name, namesAndValues[first], true)) {
                if (first == last) {
                    return null;
                }
                first += step;
            }
            return namesAndValues[first + 1];
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "function moved to extension", replaceWith = @x0(expression = "headers.toHeaders()", imports = {}))
        @kd.i(name = "-deprecated_of")
        public final u a(@fg.l Map<String, String> headers) {
            l0.p(headers, ProtectedSandApp.s("ꈭ\u0001"));
            return i(headers);
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "function name changed", replaceWith = @x0(expression = "headersOf(*namesAndValues)", imports = {}))
        @kd.i(name = "-deprecated_of")
        public final u b(@fg.l String... namesAndValues) {
            l0.p(namesAndValues, ProtectedSandApp.s("ꈮ\u0001"));
            return j((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        @fg.l
        @kd.n
        @kd.i(name = "of")
        public final u i(@fg.l Map<String, String> map) {
            l0.p(map, ProtectedSandApp.s("ꈯ\u0001"));
            String[] strArr = new String[map.size() * 2];
            int i4 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String s4 = ProtectedSandApp.s("ꈰ\u0001");
                if (key == null) {
                    throw new NullPointerException(s4);
                }
                String obj = kotlin.text.v.C5(key).toString();
                if (value == null) {
                    throw new NullPointerException(s4);
                }
                String obj2 = kotlin.text.v.C5(value).toString();
                f(obj);
                g(obj2, obj);
                strArr[i4] = obj;
                strArr[i4 + 1] = obj2;
                i4 += 2;
            }
            return new u(strArr, null);
        }

        @fg.l
        @kd.n
        @kd.i(name = "of")
        public final u j(@fg.l String... namesAndValues) {
            l0.p(namesAndValues, ProtectedSandApp.s("ꈮ\u0001"));
            if (!(namesAndValues.length % 2 == 0)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ꈳ\u0001"));
            }
            Object clone = namesAndValues.clone();
            if (clone == null) {
                throw new NullPointerException(ProtectedSandApp.s("ꈲ\u0001"));
            }
            String[] strArr = (String[]) clone;
            int length = strArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                String str = strArr[i4];
                if (!(str != null)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("ꈱ\u0001"));
                }
                if (str == null) {
                    throw new NullPointerException(ProtectedSandApp.s("ꈰ\u0001"));
                }
                strArr[i4] = kotlin.text.v.C5(str).toString();
            }
            kotlin.ranges.j B1 = kotlin.ranges.s.B1(kotlin.ranges.s.W1(0, strArr.length), 2);
            int first = B1.getFirst();
            int last = B1.getLast();
            int step = B1.getStep();
            if (step < 0 ? first >= last : first <= last) {
                while (true) {
                    String str2 = strArr[first];
                    String str3 = strArr[first + 1];
                    f(str2);
                    g(str3, str2);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
            return new u(strArr, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    private u(String[] strArr) {
        this.namesAndValues = strArr;
    }

    @fg.l
    @kd.n
    @kd.i(name = "of")
    public static final u p(@fg.l Map<String, String> map) {
        return INSTANCE.i(map);
    }

    @fg.l
    @kd.n
    @kd.i(name = "of")
    public static final u q(@fg.l String... strArr) {
        return INSTANCE.j(strArr);
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "size", imports = {}))
    @kd.i(name = "-deprecated_size")
    public final int b() {
        return size();
    }

    public final long c() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i4 = 0; i4 < strArr.length; i4++) {
            length += this.namesAndValues[i4].length();
        }
        return length;
    }

    public boolean equals(@fg.m Object other) {
        return (other instanceof u) && Arrays.equals(this.namesAndValues, ((u) other).namesAndValues);
    }

    @fg.m
    public final String f(@fg.l String name) {
        l0.p(name, ProtectedSandApp.s("ꈴ\u0001"));
        return INSTANCE.h(this.namesAndValues, name);
    }

    @fg.m
    public final Date h(@fg.l String name) {
        l0.p(name, ProtectedSandApp.s("ꈴ\u0001"));
        String f4 = f(name);
        if (f4 != null) {
            return okhttp3.internal.http.c.a(f4);
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @fg.m
    @IgnoreJRERequirement
    public final Instant i(@fg.l String name) {
        Instant instant;
        l0.p(name, ProtectedSandApp.s("ꈴ\u0001"));
        Date h4 = h(name);
        if (h4 == null) {
            return null;
        }
        instant = h4.toInstant();
        return instant;
    }

    @Override // java.lang.Iterable
    @fg.l
    public Iterator<q0<? extends String, ? extends String>> iterator() {
        int size = size();
        q0[] q0VarArr = new q0[size];
        for (int i4 = 0; i4 < size; i4++) {
            q0VarArr[i4] = new q0(j(i4), s(i4));
        }
        return kotlin.jvm.internal.i.a(q0VarArr);
    }

    @fg.l
    public final String j(int index) {
        return this.namesAndValues[index * 2];
    }

    @fg.l
    public final Set<String> l() {
        TreeSet treeSet = new TreeSet(kotlin.text.v.Q1(t1.f75371a));
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            treeSet.add(j(i4));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        l0.o(unmodifiableSet, ProtectedSandApp.s("ꈵ\u0001"));
        return unmodifiableSet;
    }

    @fg.l
    public final a m() {
        a aVar = new a();
        kotlin.collections.w.s0(aVar.k(), this.namesAndValues);
        return aVar;
    }

    @fg.l
    public final Map<String, List<String>> r() {
        TreeMap treeMap = new TreeMap(kotlin.text.v.Q1(t1.f75371a));
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            String j4 = j(i4);
            Locale locale = Locale.US;
            l0.o(locale, ProtectedSandApp.s("ꈶ\u0001"));
            if (j4 == null) {
                throw new NullPointerException(ProtectedSandApp.s("ꈸ\u0001"));
            }
            String lowerCase = j4.toLowerCase(locale);
            l0.o(lowerCase, ProtectedSandApp.s("ꈷ\u0001"));
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(s(i4));
        }
        return treeMap;
    }

    @fg.l
    public final String s(int index) {
        return this.namesAndValues[(index * 2) + 1];
    }

    @kd.i(name = "size")
    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            sb.append(j(i4));
            sb.append(ProtectedSandApp.s("ꈹ\u0001"));
            sb.append(s(i4));
            sb.append(ProtectedSandApp.s("ꈺ\u0001"));
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("ꈻ\u0001"));
        return sb2;
    }

    @fg.l
    public final List<String> v(@fg.l String name) {
        l0.p(name, ProtectedSandApp.s("ꈴ\u0001"));
        int size = size();
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            if (kotlin.text.v.K1(name, j(i4), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(s(i4));
            }
        }
        if (arrayList == null) {
            return kotlin.collections.j0.f74919b;
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        l0.o(unmodifiableList, ProtectedSandApp.s("ꈼ\u0001"));
        return unmodifiableList;
    }

    public /* synthetic */ u(String[] strArr, kotlin.jvm.internal.w wVar) {
        this(strArr);
    }
}
