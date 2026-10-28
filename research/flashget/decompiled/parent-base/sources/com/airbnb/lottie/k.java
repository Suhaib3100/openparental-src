package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import androidx.annotation.c1;
import androidx.annotation.n1;
import androidx.collection.c3;
import androidx.collection.e1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: LottieComposition.java */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<com.airbnb.lottie.model.layer.e>> f38909c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, o0> f38910d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, com.airbnb.lottie.model.c> f38911e;

    /* renamed from: f, reason: collision with root package name */
    private List<com.airbnb.lottie.model.h> f38912f;

    /* renamed from: g, reason: collision with root package name */
    private c3<com.airbnb.lottie.model.d> f38913g;

    /* renamed from: h, reason: collision with root package name */
    private e1<com.airbnb.lottie.model.layer.e> f38914h;

    /* renamed from: i, reason: collision with root package name */
    private List<com.airbnb.lottie.model.layer.e> f38915i;

    /* renamed from: j, reason: collision with root package name */
    private Rect f38916j;

    /* renamed from: k, reason: collision with root package name */
    private float f38917k;

    /* renamed from: l, reason: collision with root package name */
    private float f38918l;

    /* renamed from: m, reason: collision with root package name */
    private float f38919m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f38920n;

    /* renamed from: a, reason: collision with root package name */
    private final x0 f38907a = new x0();

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<String> f38908b = new HashSet<>();

    /* renamed from: o, reason: collision with root package name */
    private int f38921o = 0;

    /* compiled from: LottieComposition.java */
    @Deprecated
    public static class b {

        /* compiled from: LottieComposition.java */
        private static final class a implements p0<k>, com.airbnb.lottie.b {

            /* renamed from: a, reason: collision with root package name */
            private final w0 f38922a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f38923b;

            @Override // com.airbnb.lottie.p0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResult(k kVar) {
                if (this.f38923b) {
                    return;
                }
                this.f38922a.a(kVar);
            }

            @Override // com.airbnb.lottie.b
            public void cancel() {
                this.f38923b = true;
            }

            private a(w0 w0Var) {
                this.f38923b = false;
                this.f38922a = w0Var;
            }
        }

        private b() {
        }

        @Deprecated
        public static com.airbnb.lottie.b a(Context context, String str, w0 w0Var) {
            a aVar = new a(w0Var);
            w.o(context, str).d(aVar);
            return aVar;
        }

        @n1
        @androidx.annotation.q0
        @Deprecated
        public static k b(Context context, String str) {
            return w.q(context, str).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b c(InputStream inputStream, w0 w0Var) {
            a aVar = new a(w0Var);
            w.t(inputStream, null).d(aVar);
            return aVar;
        }

        @n1
        @androidx.annotation.q0
        @Deprecated
        public static k d(InputStream inputStream) {
            return w.u(inputStream, null).b();
        }

        @n1
        @androidx.annotation.q0
        @Deprecated
        public static k e(InputStream inputStream, boolean z4) {
            if (z4) {
                com.airbnb.lottie.utils.f.e(ProtectedSandApp.s("Ē"));
            }
            return w.u(inputStream, null).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b f(com.airbnb.lottie.parser.moshi.c cVar, w0 w0Var) {
            a aVar = new a(w0Var);
            w.w(cVar, null).d(aVar);
            return aVar;
        }

        @Deprecated
        public static com.airbnb.lottie.b g(String str, w0 w0Var) {
            a aVar = new a(w0Var);
            w.z(str, null).d(aVar);
            return aVar;
        }

        @n1
        @androidx.annotation.q0
        @Deprecated
        public static k h(Resources resources, JSONObject jSONObject) {
            return w.B(jSONObject, null).b();
        }

        @n1
        @androidx.annotation.q0
        @Deprecated
        public static k i(com.airbnb.lottie.parser.moshi.c cVar) {
            return w.x(cVar, null).b();
        }

        @n1
        @androidx.annotation.q0
        @Deprecated
        public static k j(String str) {
            return w.A(str, null).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b k(Context context, @androidx.annotation.v0 int i4, w0 w0Var) {
            a aVar = new a(w0Var);
            w.C(context, i4).d(aVar);
            return aVar;
        }
    }

    @c1({c1.a.LIBRARY})
    public void a(String str) {
        com.airbnb.lottie.utils.f.e(str);
        this.f38908b.add(str);
    }

    public Rect b() {
        return this.f38916j;
    }

    public c3<com.airbnb.lottie.model.d> c() {
        return this.f38913g;
    }

    public float d() {
        return (long) ((e() / this.f38919m) * 1000.0f);
    }

    public float e() {
        return this.f38918l - this.f38917k;
    }

    public float f() {
        return this.f38918l;
    }

    public Map<String, com.airbnb.lottie.model.c> g() {
        return this.f38911e;
    }

    public float h(float f4) {
        return com.airbnb.lottie.utils.i.k(this.f38917k, this.f38918l, f4);
    }

    public float i() {
        return this.f38919m;
    }

    public Map<String, o0> j() {
        return this.f38910d;
    }

    public List<com.airbnb.lottie.model.layer.e> k() {
        return this.f38915i;
    }

    @androidx.annotation.q0
    public com.airbnb.lottie.model.h l(String str) {
        int size = this.f38912f.size();
        for (int i4 = 0; i4 < size; i4++) {
            com.airbnb.lottie.model.h hVar = this.f38912f.get(i4);
            if (hVar.d(str)) {
                return hVar;
            }
        }
        return null;
    }

    public List<com.airbnb.lottie.model.h> m() {
        return this.f38912f;
    }

    @c1({c1.a.LIBRARY})
    public int n() {
        return this.f38921o;
    }

    public x0 o() {
        return this.f38907a;
    }

    @androidx.annotation.q0
    @c1({c1.a.LIBRARY})
    public List<com.airbnb.lottie.model.layer.e> p(String str) {
        return this.f38909c.get(str);
    }

    public float q(float f4) {
        float f5 = this.f38917k;
        return (f4 - f5) / (this.f38918l - f5);
    }

    public float r() {
        return this.f38917k;
    }

    public ArrayList<String> s() {
        HashSet<String> hashSet = this.f38908b;
        return new ArrayList<>(Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()])));
    }

    @c1({c1.a.LIBRARY})
    public boolean t() {
        return this.f38920n;
    }

    @androidx.annotation.o0
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ē"));
        Iterator<com.airbnb.lottie.model.layer.e> it = this.f38915i.iterator();
        while (it.hasNext()) {
            sb.append(it.next().y(ProtectedSandApp.s("Ĕ")));
        }
        return sb.toString();
    }

    public boolean u() {
        return !this.f38910d.isEmpty();
    }

    @c1({c1.a.LIBRARY})
    public void v(int i4) {
        this.f38921o += i4;
    }

    @c1({c1.a.LIBRARY})
    public void w(Rect rect, float f4, float f5, float f6, List<com.airbnb.lottie.model.layer.e> list, e1<com.airbnb.lottie.model.layer.e> e1Var, Map<String, List<com.airbnb.lottie.model.layer.e>> map, Map<String, o0> map2, c3<com.airbnb.lottie.model.d> c3Var, Map<String, com.airbnb.lottie.model.c> map3, List<com.airbnb.lottie.model.h> list2) {
        this.f38916j = rect;
        this.f38917k = f4;
        this.f38918l = f5;
        this.f38919m = f6;
        this.f38915i = list;
        this.f38914h = e1Var;
        this.f38909c = map;
        this.f38910d = map2;
        this.f38913g = c3Var;
        this.f38911e = map3;
        this.f38912f = list2;
    }

    @c1({c1.a.LIBRARY})
    public com.airbnb.lottie.model.layer.e x(long j4) {
        return this.f38914h.i(j4);
    }

    @c1({c1.a.LIBRARY})
    public void y(boolean z4) {
        this.f38920n = z4;
    }

    public void z(boolean z4) {
        this.f38907a.g(z4);
    }
}
