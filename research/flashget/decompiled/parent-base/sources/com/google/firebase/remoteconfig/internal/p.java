package com.google.firebase.remoteconfig.internal;

import androidx.annotation.m1;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes6.dex */
public class p {

    /* renamed from: e, reason: collision with root package name */
    @m1(otherwise = 3)
    public static final Charset f60514e = Charset.forName(ProtectedSandApp.s("·\u0001"));

    /* renamed from: f, reason: collision with root package name */
    static final Pattern f60515f = Pattern.compile(ProtectedSandApp.s("Έ\u0001"), 2);

    /* renamed from: g, reason: collision with root package name */
    static final Pattern f60516g = Pattern.compile(ProtectedSandApp.s("Ή\u0001"), 2);

    /* renamed from: a, reason: collision with root package name */
    private final Set<BiConsumer<String, h>> f60517a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Executor f60518b;

    /* renamed from: c, reason: collision with root package name */
    private final g f60519c;

    /* renamed from: d, reason: collision with root package name */
    private final g f60520d;

    public p(Executor executor, g gVar, g gVar2) {
        this.f60518b = executor;
        this.f60519c = gVar;
        this.f60520d = gVar2;
    }

    private void c(final String str, final h hVar) {
        if (hVar == null) {
            return;
        }
        synchronized (this.f60517a) {
            try {
                for (final BiConsumer<String, h> biConsumer : this.f60517a) {
                    this.f60518b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            BiConsumer.this.accept(str, hVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @q0
    private static h g(g gVar) {
        return gVar.g();
    }

    @q0
    private static Double i(g gVar, String str) {
        h g4 = gVar.g();
        if (g4 == null) {
            return null;
        }
        try {
            return Double.valueOf(g4.g().getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Set<String> j(g gVar) {
        HashSet hashSet = new HashSet();
        h g4 = gVar.g();
        if (g4 == null) {
            return hashSet;
        }
        Iterator<String> keys = g4.g().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    private static TreeSet<String> l(String str, h hVar) {
        TreeSet<String> treeSet = new TreeSet<>();
        Iterator<String> keys = hVar.g().keys();
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
        h g4 = gVar.g();
        if (g4 == null) {
            return null;
        }
        try {
            return Long.valueOf(g4.g().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @q0
    private static String p(g gVar, String str) {
        h g4 = gVar.g();
        if (g4 == null) {
            return null;
        }
        try {
            return g4.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void s(String str, String str2) {
        String.format(ProtectedSandApp.s("Ί\u0001"), str2, str);
    }

    public void b(BiConsumer<String, h> biConsumer) {
        synchronized (this.f60517a) {
            this.f60517a.add(biConsumer);
        }
    }

    public Map<String, com.google.firebase.remoteconfig.s> d() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(j(this.f60519c));
        hashSet.addAll(j(this.f60520d));
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            hashMap.put(str, q(str));
        }
        return hashMap;
    }

    public boolean e(String str) {
        String p4 = p(this.f60519c, str);
        if (p4 != null) {
            if (f60515f.matcher(p4).matches()) {
                c(str, this.f60519c.g());
                return true;
            }
            if (f60516g.matcher(p4).matches()) {
                c(str, this.f60519c.g());
                return false;
            }
        }
        String p5 = p(this.f60520d, str);
        if (p5 != null) {
            if (f60515f.matcher(p5).matches()) {
                return true;
            }
            if (f60516g.matcher(p5).matches()) {
                return false;
            }
        }
        s(str, ProtectedSandApp.s("\u038b\u0001"));
        return false;
    }

    public byte[] f(String str) {
        String p4 = p(this.f60519c, str);
        if (p4 != null) {
            c(str, this.f60519c.g());
            return p4.getBytes(f60514e);
        }
        String p5 = p(this.f60520d, str);
        if (p5 != null) {
            return p5.getBytes(f60514e);
        }
        s(str, ProtectedSandApp.s("Ό\u0001"));
        return com.google.firebase.remoteconfig.p.f60681r;
    }

    public double h(String str) {
        Double i4 = i(this.f60519c, str);
        if (i4 != null) {
            c(str, this.f60519c.g());
            return i4.doubleValue();
        }
        Double i5 = i(this.f60520d, str);
        if (i5 != null) {
            return i5.doubleValue();
        }
        s(str, ProtectedSandApp.s("\u038d\u0001"));
        return com.google.firebase.remoteconfig.p.f60679p;
    }

    public Set<String> k(String str) {
        if (str == null) {
            str = "";
        }
        TreeSet treeSet = new TreeSet();
        h g4 = this.f60519c.g();
        if (g4 != null) {
            treeSet.addAll(l(str, g4));
        }
        h g5 = this.f60520d.g();
        if (g5 != null) {
            treeSet.addAll(l(str, g5));
        }
        return treeSet;
    }

    public long m(String str) {
        Long n4 = n(this.f60519c, str);
        if (n4 != null) {
            c(str, this.f60519c.g());
            return n4.longValue();
        }
        Long n5 = n(this.f60520d, str);
        if (n5 != null) {
            return n5.longValue();
        }
        s(str, ProtectedSandApp.s("Ύ\u0001"));
        return 0L;
    }

    public String o(String str) {
        String p4 = p(this.f60519c, str);
        if (p4 != null) {
            c(str, this.f60519c.g());
            return p4;
        }
        String p5 = p(this.f60520d, str);
        if (p5 != null) {
            return p5;
        }
        s(str, ProtectedSandApp.s("Ώ\u0001"));
        return "";
    }

    public com.google.firebase.remoteconfig.s q(String str) {
        String p4 = p(this.f60519c, str);
        if (p4 != null) {
            c(str, this.f60519c.g());
            return new y(p4, 2);
        }
        String p5 = p(this.f60520d, str);
        if (p5 != null) {
            return new y(p5, 1);
        }
        s(str, ProtectedSandApp.s("ΐ\u0001"));
        return new y("", 0);
    }
}
