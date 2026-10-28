package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import androidx.annotation.l0;
import androidx.annotation.q0;
import com.android.volley.VolleyError;
import com.android.volley.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: ImageLoader.java */
/* loaded from: classes3.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final com.android.volley.o f41050a;

    /* renamed from: c, reason: collision with root package name */
    private final f f41052c;

    /* renamed from: g, reason: collision with root package name */
    private Runnable f41056g;

    /* renamed from: b, reason: collision with root package name */
    private int f41051b = 100;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, e> f41053d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, e> f41054e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final Handler f41055f = new Handler(Looper.getMainLooper());

    /* compiled from: ImageLoader.java */
    class a implements h {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f41057b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f41058c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f41059d;

        a(int i4, ImageView imageView, int i5) {
            this.f41057b = i4;
            this.f41058c = imageView;
            this.f41059d = i5;
        }

        @Override // com.android.volley.toolbox.q.h
        public void a(g gVar, boolean z4) {
            if (gVar.d() != null) {
                this.f41058c.setImageBitmap(gVar.d());
                return;
            }
            int i4 = this.f41059d;
            if (i4 != 0) {
                this.f41058c.setImageResource(i4);
            }
        }

        @Override // com.android.volley.q.a
        public void onErrorResponse(VolleyError volleyError) {
            int i4 = this.f41057b;
            if (i4 != 0) {
                this.f41058c.setImageResource(i4);
            }
        }
    }

    /* compiled from: ImageLoader.java */
    class b implements q.b<Bitmap> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41060b;

        b(String str) {
            this.f41060b = str;
        }

        @Override // com.android.volley.q.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Bitmap bitmap) {
            q.this.n(this.f41060b, bitmap);
        }
    }

    /* compiled from: ImageLoader.java */
    class c implements q.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41062b;

        c(String str) {
            this.f41062b = str;
        }

        @Override // com.android.volley.q.a
        public void onErrorResponse(VolleyError volleyError) {
            q.this.m(this.f41062b, volleyError);
        }
    }

    /* compiled from: ImageLoader.java */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (e eVar : q.this.f41054e.values()) {
                for (g gVar : eVar.f41068d) {
                    if (gVar.f41070b != null) {
                        if (eVar.e() == null) {
                            gVar.f41069a = eVar.f41066b;
                            gVar.f41070b.a(gVar, false);
                        } else {
                            gVar.f41070b.onErrorResponse(eVar.e());
                        }
                    }
                }
            }
            q.this.f41054e.clear();
            q.this.f41056g = null;
        }
    }

    /* compiled from: ImageLoader.java */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final com.android.volley.n<?> f41065a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f41066b;

        /* renamed from: c, reason: collision with root package name */
        private VolleyError f41067c;

        /* renamed from: d, reason: collision with root package name */
        private final List<g> f41068d;

        public e(com.android.volley.n<?> nVar, g gVar) {
            ArrayList arrayList = new ArrayList();
            this.f41068d = arrayList;
            this.f41065a = nVar;
            arrayList.add(gVar);
        }

        public void d(g gVar) {
            this.f41068d.add(gVar);
        }

        public VolleyError e() {
            return this.f41067c;
        }

        public boolean f(g gVar) {
            this.f41068d.remove(gVar);
            if (this.f41068d.size() != 0) {
                return false;
            }
            this.f41065a.cancel();
            return true;
        }

        public void g(VolleyError volleyError) {
            this.f41067c = volleyError;
        }
    }

    /* compiled from: ImageLoader.java */
    public interface f {
        void a(String str, Bitmap bitmap);

        @q0
        Bitmap b(String str);
    }

    /* compiled from: ImageLoader.java */
    public class g {

        /* renamed from: a, reason: collision with root package name */
        private Bitmap f41069a;

        /* renamed from: b, reason: collision with root package name */
        private final h f41070b;

        /* renamed from: c, reason: collision with root package name */
        private final String f41071c;

        /* renamed from: d, reason: collision with root package name */
        private final String f41072d;

        public g(Bitmap bitmap, String str, String str2, h hVar) {
            this.f41069a = bitmap;
            this.f41072d = str;
            this.f41071c = str2;
            this.f41070b = hVar;
        }

        @l0
        public void c() {
            b0.a();
            if (this.f41070b == null) {
                return;
            }
            e eVar = (e) q.this.f41053d.get(this.f41071c);
            if (eVar != null) {
                if (eVar.f(this)) {
                    q.this.f41053d.remove(this.f41071c);
                    return;
                }
                return;
            }
            e eVar2 = (e) q.this.f41054e.get(this.f41071c);
            if (eVar2 != null) {
                eVar2.f(this);
                if (eVar2.f41068d.size() == 0) {
                    q.this.f41054e.remove(this.f41071c);
                }
            }
        }

        public Bitmap d() {
            return this.f41069a;
        }

        public String e() {
            return this.f41072d;
        }
    }

    /* compiled from: ImageLoader.java */
    public interface h extends q.a {
        void a(g gVar, boolean z4);
    }

    public q(com.android.volley.o oVar, f fVar) {
        this.f41050a = oVar;
        this.f41052c = fVar;
    }

    private void d(String str, e eVar) {
        this.f41054e.put(str, eVar);
        if (this.f41056g == null) {
            d dVar = new d();
            this.f41056g = dVar;
            this.f41055f.postDelayed(dVar, this.f41051b);
        }
    }

    private static String h(String str, int i4, int i5, ImageView.ScaleType scaleType) {
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append(ProtectedSandApp.s("۰"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("۱"));
        sb.append(i5);
        sb.append(ProtectedSandApp.s("۲"));
        sb.append(scaleType.ordinal());
        sb.append(str);
        return sb.toString();
    }

    public static h i(ImageView imageView, int i4, int i5) {
        return new a(i5, imageView, i4);
    }

    public g e(String str, h hVar) {
        return f(str, hVar, 0, 0);
    }

    public g f(String str, h hVar, int i4, int i5) {
        return g(str, hVar, i4, i5, ImageView.ScaleType.CENTER_INSIDE);
    }

    @l0
    public g g(String str, h hVar, int i4, int i5, ImageView.ScaleType scaleType) {
        b0.a();
        String h4 = h(str, i4, i5, scaleType);
        Bitmap b5 = this.f41052c.b(h4);
        if (b5 != null) {
            g gVar = new g(b5, str, null, null);
            hVar.a(gVar, true);
            return gVar;
        }
        g gVar2 = new g(null, str, h4, hVar);
        hVar.a(gVar2, true);
        e eVar = this.f41053d.get(h4);
        if (eVar == null) {
            eVar = this.f41054e.get(h4);
        }
        if (eVar != null) {
            eVar.d(gVar2);
            return gVar2;
        }
        com.android.volley.n<Bitmap> l4 = l(str, i4, i5, scaleType, h4);
        this.f41050a.a(l4);
        this.f41053d.put(h4, new e(l4, gVar2));
        return gVar2;
    }

    public boolean j(String str, int i4, int i5) {
        return k(str, i4, i5, ImageView.ScaleType.CENTER_INSIDE);
    }

    @l0
    public boolean k(String str, int i4, int i5, ImageView.ScaleType scaleType) {
        b0.a();
        return this.f41052c.b(h(str, i4, i5, scaleType)) != null;
    }

    protected com.android.volley.n<Bitmap> l(String str, int i4, int i5, ImageView.ScaleType scaleType, String str2) {
        return new r(str, new b(str2), i4, i5, scaleType, Bitmap.Config.RGB_565, new c(str2));
    }

    protected void m(String str, VolleyError volleyError) {
        e remove = this.f41053d.remove(str);
        if (remove != null) {
            remove.g(volleyError);
            d(str, remove);
        }
    }

    protected void n(String str, Bitmap bitmap) {
        this.f41052c.a(str, bitmap);
        e remove = this.f41053d.remove(str);
        if (remove != null) {
            remove.f41066b = bitmap;
            d(str, remove);
        }
    }

    public void o(int i4) {
        this.f41051b = i4;
    }
}
