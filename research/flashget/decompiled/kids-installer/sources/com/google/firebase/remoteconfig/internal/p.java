package com.google.firebase.remoteconfig.internal;

import androidx.annotation.m1;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* compiled from: ConfigGetParameterHandler.java */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: e, reason: collision with root package name */
    @m1(otherwise = 3)
    public static final Charset f17981e = Charset.forName(ProtectedSandApp.s("ᥱ"));

    /* renamed from: f, reason: collision with root package name */
    static final Pattern f17982f = Pattern.compile(ProtectedSandApp.s("ᥲ"), 2);

    /* renamed from: g, reason: collision with root package name */
    static final Pattern f17983g = Pattern.compile(ProtectedSandApp.s("ᥳ"), 2);

    /* renamed from: a, reason: collision with root package name */
    private final Set<BiConsumer<String, h>> f17984a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Executor f17985b;

    /* renamed from: c, reason: collision with root package name */
    private final g f17986c;

    /* renamed from: d, reason: collision with root package name */
    private final g f17987d;

    public p(Executor executor, g gVar, g gVar2) {
        this.f17985b = executor;
        this.f17986c = gVar;
        this.f17987d = gVar2;
    }

    private void c(final String str, final h hVar) {
        if (hVar == null) {
            return;
        }
        synchronized (this.f17984a) {
            for (final BiConsumer<String, h> biConsumer : this.f17984a) {
                this.f17985b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        BiConsumer.this.accept(str, hVar);
                    }
                });
            }
        }
    }

    @q0
    private static h g(g gVar) {
        return gVar.g();
    }

    @q0
    private static Double i(g gVar, String str) {
        h g5 = gVar.g();
        if (g5 == null) {
            return null;
        }
        try {
            return Double.valueOf(g5.f().getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Set<String> j(g gVar) {
        HashSet hashSet = new HashSet();
        h g5 = gVar.g();
        if (g5 == null) {
            return hashSet;
        }
        Iterator<String> keys = g5.f().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    private static TreeSet<String> l(String str, h hVar) {
        TreeSet<String> treeSet = new TreeSet<>();
        Iterator<String> keys = hVar.f().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.startsWith(str)) {
                treeSet.add(next);
            }
        }
        return treeSet;
    }

    @q0
    private static Long n(g gVar, String str) {
        h g5 = gVar.g();
        if (g5 == null) {
            return null;
        }
        try {
            return Long.valueOf(g5.f().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @q0
    private static String p(g gVar, String str) {
        h g5 = gVar.g();
        if (g5 == null) {
            return null;
        }
        try {
            return g5.f().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void s(String str, String str2) {
        String.format(ProtectedSandApp.s("ᥴ"), str2, str);
    }

    public void b(BiConsumer<String, h> biConsumer) {
        synchronized (this.f17984a) {
            this.f17984a.add(biConsumer);
        }
    }

    public Map<String, com.google.firebase.remoteconfig.s> d() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(j(this.f17986c));
        hashSet.addAll(j(this.f17987d));
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            hashMap.put(str, q(str));
        }
        return hashMap;
    }

    public boolean e(String str) {
        String p5 = p(this.f17986c, str);
        if (p5 != null) {
            if (f17982f.matcher(p5).matches()) {
                c(str, this.f17986c.g());
                return true;
            }
            if (f17983g.matcher(p5).matches()) {
                c(str, this.f17986c.g());
                return false;
            }
        }
        String p6 = p(this.f17987d, str);
        if (p6 != null) {
            if (f17982f.matcher(p6).matches()) {
                return true;
            }
            if (f17983g.matcher(p6).matches()) {
                return false;
            }
        }
        s(str, ProtectedSandApp.s("\u1975"));
        return false;
    }

    public byte[] f(String str) {
        String p5 = p(this.f17986c, str);
        if (p5 != null) {
            c(str, this.f17986c.g());
            return p5.getBytes(f17981e);
        }
        String p6 = p(this.f17987d, str);
        if (p6 != null) {
            return p6.getBytes(f17981e);
        }
        s(str, ProtectedSandApp.s("\u1976"));
        return com.google.firebase.remoteconfig.p.f18291q;
    }

    public double h(String str) {
        Double i5 = i(this.f17986c, str);
        if (i5 != null) {
            c(str, this.f17986c.g());
            return i5.doubleValue();
        }
        Double i6 = i(this.f17987d, str);
        if (i6 != null) {
            return i6.doubleValue();
        }
        s(str, ProtectedSandApp.s("\u1977"));
        return com.google.firebase.remoteconfig.p.f18289o;
    }

    public Set<String> k(String str) {
        if (str == null) {
            str = "";
        }
        TreeSet treeSet = new TreeSet();
        h g5 = this.f17986c.g();
        if (g5 != null) {
            treeSet.addAll(l(str, g5));
        }
        h g6 = this.f17987d.g();
        if (g6 != null) {
            treeSet.addAll(l(str, g6));
        }
        return treeSet;
    }

    public long m(String str) {
        Long n5 = n(this.f17986c, str);
        if (n5 != null) {
            c(str, this.f17986c.g());
            return n5.longValue();
        }
        Long n6 = n(this.f17987d, str);
        if (n6 != null) {
            return n6.longValue();
        }
        s(str, ProtectedSandApp.s("\u1978"));
        return 0L;
    }

    public String o(String str) {
        String p5 = p(this.f17986c, str);
        if (p5 != null) {
            c(str, this.f17986c.g());
            return p5;
        }
        String p6 = p(this.f17987d, str);
        if (p6 != null) {
            return p6;
        }
        s(str, ProtectedSandApp.s("\u1979"));
        return "";
    }

    public com.google.firebase.remoteconfig.s q(String str) {
        String p5 = p(this.f17986c, str);
        if (p5 != null) {
            c(str, this.f17986c.g());
            return new y(p5, 2);
        }
        String p6 = p(this.f17987d, str);
        if (p6 != null) {
            return new y(p6, 1);
        }
        s(str, ProtectedSandApp.s("\u197a"));
        return new y("", 0);
    }
}
