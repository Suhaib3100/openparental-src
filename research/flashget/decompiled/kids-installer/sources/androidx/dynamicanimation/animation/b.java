package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.x;
import androidx.core.view.y1;
import androidx.dynamicanimation.animation.a;
import androidx.dynamicanimation.animation.b;
import java.util.ArrayList;

/* compiled from: DynamicAnimation.java */
/* loaded from: classes3.dex */
public abstract class b<T extends b<T>> implements a.b {
    public static final float A = 1.0f;
    public static final float B = 0.1f;
    public static final float C = 0.00390625f;
    public static final float D = 0.002f;
    private static final float E = Float.MAX_VALUE;
    private static final float F = 0.75f;

    /* renamed from: m, reason: collision with root package name */
    public static final s f7752m = new g("translationX");

    /* renamed from: n, reason: collision with root package name */
    public static final s f7753n = new h("translationY");

    /* renamed from: o, reason: collision with root package name */
    public static final s f7754o = new i("translationZ");

    /* renamed from: p, reason: collision with root package name */
    public static final s f7755p = new j("scaleX");

    /* renamed from: q, reason: collision with root package name */
    public static final s f7756q = new k("scaleY");

    /* renamed from: r, reason: collision with root package name */
    public static final s f7757r = new l("rotation");

    /* renamed from: s, reason: collision with root package name */
    public static final s f7758s = new m("rotationX");

    /* renamed from: t, reason: collision with root package name */
    public static final s f7759t = new n("rotationY");

    /* renamed from: u, reason: collision with root package name */
    public static final s f7760u = new o("x");

    /* renamed from: v, reason: collision with root package name */
    public static final s f7761v = new a("y");

    /* renamed from: w, reason: collision with root package name */
    public static final s f7762w = new C0088b("z");

    /* renamed from: x, reason: collision with root package name */
    public static final s f7763x = new c("alpha");

    /* renamed from: y, reason: collision with root package name */
    public static final s f7764y = new d("scrollX");

    /* renamed from: z, reason: collision with root package name */
    public static final s f7765z = new e("scrollY");

    /* renamed from: a, reason: collision with root package name */
    float f7766a;

    /* renamed from: b, reason: collision with root package name */
    float f7767b;

    /* renamed from: c, reason: collision with root package name */
    boolean f7768c;

    /* renamed from: d, reason: collision with root package name */
    final Object f7769d;

    /* renamed from: e, reason: collision with root package name */
    final androidx.dynamicanimation.animation.d f7770e;

    /* renamed from: f, reason: collision with root package name */
    boolean f7771f;

    /* renamed from: g, reason: collision with root package name */
    float f7772g;

    /* renamed from: h, reason: collision with root package name */
    float f7773h;

    /* renamed from: i, reason: collision with root package name */
    private long f7774i;

    /* renamed from: j, reason: collision with root package name */
    private float f7775j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList<q> f7776k;

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList<r> f7777l;

    /* compiled from: DynamicAnimation.java */
    static class a extends s {
        a(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getY();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f6) {
            view.setY(f6);
        }

        public float d(View view) {
            return view.getY();
        }

        public void e(View view, float f6) {
            view.setY(f6);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: androidx.dynamicanimation.animation.b$b, reason: collision with other inner class name */
    static class C0088b extends s {
        C0088b(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return y1.F0(view);
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f6) {
            y1.B2(view, f6);
        }

        public float d(View view) {
            return y1.F0(view);
        }

        public void e(View view, float f6) {
            y1.B2(view, f6);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class c extends s {
        c(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f6) {
            view.setAlpha(f6);
        }

        public float d(View view) {
            return view.getAlpha();
        }

        public void e(View view, float f6) {
            view.setAlpha(f6);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class d extends s {
        d(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f6) {
            view.setScrollX((int) f6);
        }

        public float d(View view) {
            return view.getScrollX();
        }

        public void e(View view, float f6) {
            view.setScrollX((int) f6);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class e extends s {
        e(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f6) {
            view.setScrollY((int) f6);
        }

        public float d(View view) {
            return view.getScrollY();
        }

        public void e(View view, float f6) {
            view.setScrollY((int) f6);
        }
    }

    /* compiled from: DynamicAnimation.java */
    class f extends androidx.dynamicanimation.animation.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.dynamicanimation.animation.e f7778b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, androidx.dynamicanimation.animation.e eVar) {
            super(str);
            this.f7778b = eVar;
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(Object obj) {
            return this.f7778b.a();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(Object obj, float f6) {
            this.f7778b.b(f6);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class g extends s {
        g(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f6) {
            view.setTranslationX(f6);
        }

        public float d(View view) {
            return view.getTranslationX();
        }

        public void e(View view, float f6) {
            view.setTranslationX(f6);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class h extends s {
        h(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f6) {
            view.setTranslationY(f6);
        }

        public float d(View view) {
            return view.getTranslationY();
        }

        public void e(View view, float f6) {
            view.setTranslationY(f6);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class i extends s {
        i(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return y1.A0(view);
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f6) {
            y1.w2(view, f6);
        }

        public float d(View view) {
            return y1.A0(view);
        }

        public void e(View view, float f6) {
            y1.w2(view, f6);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class j extends s {
        j(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f6) {
            view.setScaleX(f6);
        }

        public float d(View view) {
            return view.getScaleX();
        }

        public void e(View view, float f6) {
            view.setScaleX(f6);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class k extends s {
        k(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f6) {
            view.setScaleY(f6);
        }

        public float d(View view) {
            return view.getScaleY();
        }

        public void e(View view, float f6) {
            view.setScaleY(f6);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class l extends s {
        l(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getRotation();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f6) {
            view.setRotation(f6);
        }

        public float d(View view) {
            return view.getRotation();
        }

        public void e(View view, float f6) {
            view.setRotation(f6);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class m extends s {
        m(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f6) {
            view.setRotationX(f6);
        }

        public float d(View view) {
            return view.getRotationX();
        }

        public void e(View view, float f6) {
            view.setRotationX(f6);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class n extends s {
        n(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f6) {
            view.setRotationY(f6);
        }

        public float d(View view) {
            return view.getRotationY();
        }

        public void e(View view, float f6) {
            view.setRotationY(f6);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class o extends s {
        o(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getX();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f6) {
            view.setX(f6);
        }

        public float d(View view) {
            return view.getX();
        }

        public void e(View view, float f6) {
            view.setX(f6);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    static class p {

        /* renamed from: a, reason: collision with root package name */
        float f7780a;

        /* renamed from: b, reason: collision with root package name */
        float f7781b;

        p() {
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public interface q {
        void a(b bVar, boolean z5, float f6, float f7);
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public interface r {
        void a(b bVar, float f6, float f7);
    }

    /* compiled from: DynamicAnimation.java */
    public static abstract class s extends androidx.dynamicanimation.animation.d<View> {
        private s(String str) {
            super(str);
        }

        s(String str, g gVar) {
            super(str);
        }
    }

    b(androidx.dynamicanimation.animation.e eVar) {
        this.f7766a = 0.0f;
        this.f7767b = Float.MAX_VALUE;
        this.f7768c = false;
        this.f7771f = false;
        this.f7772g = Float.MAX_VALUE;
        this.f7773h = -Float.MAX_VALUE;
        this.f7774i = 0L;
        this.f7776k = new ArrayList<>();
        this.f7777l = new ArrayList<>();
        this.f7769d = null;
        this.f7770e = new f("FloatValueHolder", eVar);
        this.f7775j = 1.0f;
    }

    private void e(boolean z5) {
        this.f7771f = false;
        androidx.dynamicanimation.animation.a.e().h(this);
        this.f7774i = 0L;
        this.f7768c = false;
        for (int i5 = 0; i5 < this.f7776k.size(); i5++) {
            if (this.f7776k.get(i5) != null) {
                this.f7776k.get(i5).a(this, z5, this.f7767b, this.f7766a);
            }
        }
        n(this.f7776k);
    }

    private float h() {
        return this.f7770e.b(this.f7769d);
    }

    private static <T> void m(ArrayList<T> arrayList, T t5) {
        int indexOf = arrayList.indexOf(t5);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    private static <T> void n(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void x() {
        if (this.f7771f) {
            return;
        }
        this.f7771f = true;
        if (!this.f7768c) {
            this.f7767b = h();
        }
        float f6 = this.f7767b;
        if (f6 > this.f7772g || f6 < this.f7773h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        androidx.dynamicanimation.animation.a.e().a(this, 0L);
    }

    @Override // androidx.dynamicanimation.animation.a.b
    @c1({c1.a.LIBRARY})
    public boolean a(long j5) {
        long j6 = this.f7774i;
        if (j6 == 0) {
            this.f7774i = j5;
            s(this.f7767b);
            return false;
        }
        this.f7774i = j5;
        boolean y5 = y(j5 - j6);
        float min = Math.min(this.f7767b, this.f7772g);
        this.f7767b = min;
        float max = Math.max(min, this.f7773h);
        this.f7767b = max;
        s(max);
        if (y5) {
            e(false);
        }
        return y5;
    }

    public T b(q qVar) {
        if (!this.f7776k.contains(qVar)) {
            this.f7776k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (k()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f7777l.contains(rVar)) {
            this.f7777l.add(rVar);
        }
        return this;
    }

    public void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f7771f) {
            e(true);
        }
    }

    abstract float f(float f6, float f7);

    public float g() {
        return this.f7775j;
    }

    float i() {
        return this.f7775j * 0.75f;
    }

    abstract boolean j(float f6, float f7);

    public boolean k() {
        return this.f7771f;
    }

    public void l(q qVar) {
        m(this.f7776k, qVar);
    }

    public void o(r rVar) {
        m(this.f7777l, rVar);
    }

    public T p(float f6) {
        this.f7772g = f6;
        return this;
    }

    public T q(float f6) {
        this.f7773h = f6;
        return this;
    }

    public T r(@x(from = 0.0d, fromInclusive = false) float f6) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f7775j = f6;
        v(f6 * 0.75f);
        return this;
    }

    void s(float f6) {
        this.f7770e.c(this.f7769d, f6);
        for (int i5 = 0; i5 < this.f7777l.size(); i5++) {
            if (this.f7777l.get(i5) != null) {
                this.f7777l.get(i5).a(this, this.f7767b, this.f7766a);
            }
        }
        n(this.f7777l);
    }

    public T t(float f6) {
        this.f7767b = f6;
        this.f7768c = true;
        return this;
    }

    public T u(float f6) {
        this.f7766a = f6;
        return this;
    }

    abstract void v(float f6);

    public void w() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f7771f) {
            return;
        }
        x();
    }

    abstract boolean y(long j5);

    <K> b(K k5, androidx.dynamicanimation.animation.d<K> dVar) {
        this.f7766a = 0.0f;
        this.f7767b = Float.MAX_VALUE;
        this.f7768c = false;
        this.f7771f = false;
        this.f7772g = Float.MAX_VALUE;
        this.f7773h = -Float.MAX_VALUE;
        this.f7774i = 0L;
        this.f7776k = new ArrayList<>();
        this.f7777l = new ArrayList<>();
        this.f7769d = k5;
        this.f7770e = dVar;
        if (dVar != f7757r && dVar != f7758s && dVar != f7759t) {
            if (dVar == f7763x) {
                this.f7775j = 0.00390625f;
                return;
            } else if (dVar != f7755p && dVar != f7756q) {
                this.f7775j = 1.0f;
                return;
            } else {
                this.f7775j = 0.00390625f;
                return;
            }
        }
        this.f7775j = 0.1f;
    }
}
