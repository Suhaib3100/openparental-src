package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.x;
import androidx.core.view.x1;
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
    public static final s f29204m = new g("translationX");

    /* renamed from: n, reason: collision with root package name */
    public static final s f29205n = new h("translationY");

    /* renamed from: o, reason: collision with root package name */
    public static final s f29206o = new i("translationZ");

    /* renamed from: p, reason: collision with root package name */
    public static final s f29207p = new j("scaleX");

    /* renamed from: q, reason: collision with root package name */
    public static final s f29208q = new k("scaleY");

    /* renamed from: r, reason: collision with root package name */
    public static final s f29209r = new l("rotation");

    /* renamed from: s, reason: collision with root package name */
    public static final s f29210s = new m("rotationX");

    /* renamed from: t, reason: collision with root package name */
    public static final s f29211t = new n("rotationY");

    /* renamed from: u, reason: collision with root package name */
    public static final s f29212u = new o("x");

    /* renamed from: v, reason: collision with root package name */
    public static final s f29213v = new a("y");

    /* renamed from: w, reason: collision with root package name */
    public static final s f29214w = new C0477b("z");

    /* renamed from: x, reason: collision with root package name */
    public static final s f29215x = new c("alpha");

    /* renamed from: y, reason: collision with root package name */
    public static final s f29216y = new d("scrollX");

    /* renamed from: z, reason: collision with root package name */
    public static final s f29217z = new e("scrollY");

    /* renamed from: a, reason: collision with root package name */
    float f29218a;

    /* renamed from: b, reason: collision with root package name */
    float f29219b;

    /* renamed from: c, reason: collision with root package name */
    boolean f29220c;

    /* renamed from: d, reason: collision with root package name */
    final Object f29221d;

    /* renamed from: e, reason: collision with root package name */
    final androidx.dynamicanimation.animation.d f29222e;

    /* renamed from: f, reason: collision with root package name */
    boolean f29223f;

    /* renamed from: g, reason: collision with root package name */
    float f29224g;

    /* renamed from: h, reason: collision with root package name */
    float f29225h;

    /* renamed from: i, reason: collision with root package name */
    private long f29226i;

    /* renamed from: j, reason: collision with root package name */
    private float f29227j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList<q> f29228k;

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList<r> f29229l;

    /* compiled from: DynamicAnimation.java */
    static class a extends s {
        a(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getY();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f4) {
            view.setY(f4);
        }

        public float d(View view) {
            return view.getY();
        }

        public void e(View view, float f4) {
            view.setY(f4);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: androidx.dynamicanimation.animation.b$b, reason: collision with other inner class name */
    static class C0477b extends s {
        C0477b(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return x1.I0(view);
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f4) {
            x1.K2(view, f4);
        }

        public float d(View view) {
            return x1.I0(view);
        }

        public void e(View view, float f4) {
            x1.K2(view, f4);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class c extends s {
        c(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f4) {
            view.setAlpha(f4);
        }

        public float d(View view) {
            return view.getAlpha();
        }

        public void e(View view, float f4) {
            view.setAlpha(f4);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class d extends s {
        d(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f4) {
            view.setScrollX((int) f4);
        }

        public float d(View view) {
            return view.getScrollX();
        }

        public void e(View view, float f4) {
            view.setScrollX((int) f4);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class e extends s {
        e(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f4) {
            view.setScrollY((int) f4);
        }

        public float d(View view) {
            return view.getScrollY();
        }

        public void e(View view, float f4) {
            view.setScrollY((int) f4);
        }
    }

    /* compiled from: DynamicAnimation.java */
    class f extends androidx.dynamicanimation.animation.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.dynamicanimation.animation.e f29230b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, androidx.dynamicanimation.animation.e eVar) {
            super(str);
            this.f29230b = eVar;
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(Object obj) {
            return this.f29230b.a();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(Object obj, float f4) {
            this.f29230b.b(f4);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class g extends s {
        g(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f4) {
            view.setTranslationX(f4);
        }

        public float d(View view) {
            return view.getTranslationX();
        }

        public void e(View view, float f4) {
            view.setTranslationX(f4);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class h extends s {
        h(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f4) {
            view.setTranslationY(f4);
        }

        public float d(View view) {
            return view.getTranslationY();
        }

        public void e(View view, float f4) {
            view.setTranslationY(f4);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class i extends s {
        i(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return x1.D0(view);
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f4) {
            x1.G2(view, f4);
        }

        public float d(View view) {
            return x1.D0(view);
        }

        public void e(View view, float f4) {
            x1.G2(view, f4);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class j extends s {
        j(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f4) {
            view.setScaleX(f4);
        }

        public float d(View view) {
            return view.getScaleX();
        }

        public void e(View view, float f4) {
            view.setScaleX(f4);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class k extends s {
        k(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f4) {
            view.setScaleY(f4);
        }

        public float d(View view) {
            return view.getScaleY();
        }

        public void e(View view, float f4) {
            view.setScaleY(f4);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class l extends s {
        l(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getRotation();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f4) {
            view.setRotation(f4);
        }

        public float d(View view) {
            return view.getRotation();
        }

        public void e(View view, float f4) {
            view.setRotation(f4);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class m extends s {
        m(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f4) {
            view.setRotationX(f4);
        }

        public float d(View view) {
            return view.getRotationX();
        }

        public void e(View view, float f4) {
            view.setRotationX(f4);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class n extends s {
        n(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f4) {
            view.setRotationY(f4);
        }

        public float d(View view) {
            return view.getRotationY();
        }

        public void e(View view, float f4) {
            view.setRotationY(f4);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class o extends s {
        o(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(View view) {
            return view.getX();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(View view, float f4) {
            view.setX(f4);
        }

        public float d(View view) {
            return view.getX();
        }

        public void e(View view, float f4) {
            view.setX(f4);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class p {

        /* renamed from: a, reason: collision with root package name */
        float f29232a;

        /* renamed from: b, reason: collision with root package name */
        float f29233b;

        p() {
        }
    }

    /* compiled from: DynamicAnimation.java */
    public interface q {
        void a(b bVar, boolean z4, float f4, float f5);
    }

    /* compiled from: DynamicAnimation.java */
    public interface r {
        void a(b bVar, float f4, float f5);
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
        this.f29218a = 0.0f;
        this.f29219b = Float.MAX_VALUE;
        this.f29220c = false;
        this.f29223f = false;
        this.f29224g = Float.MAX_VALUE;
        this.f29225h = -Float.MAX_VALUE;
        this.f29226i = 0L;
        this.f29228k = new ArrayList<>();
        this.f29229l = new ArrayList<>();
        this.f29221d = null;
        this.f29222e = new f("FloatValueHolder", eVar);
        this.f29227j = 1.0f;
    }

    private void e(boolean z4) {
        this.f29223f = false;
        androidx.dynamicanimation.animation.a.e().h(this);
        this.f29226i = 0L;
        this.f29220c = false;
        for (int i4 = 0; i4 < this.f29228k.size(); i4++) {
            if (this.f29228k.get(i4) != null) {
                this.f29228k.get(i4).a(this, z4, this.f29219b, this.f29218a);
            }
        }
        n(this.f29228k);
    }

    private float h() {
        return this.f29222e.b(this.f29221d);
    }

    private static <T> void m(ArrayList<T> arrayList, T t4) {
        int indexOf = arrayList.indexOf(t4);
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
        if (this.f29223f) {
            return;
        }
        this.f29223f = true;
        if (!this.f29220c) {
            this.f29219b = h();
        }
        float f4 = this.f29219b;
        if (f4 > this.f29224g || f4 < this.f29225h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        androidx.dynamicanimation.animation.a.e().a(this, 0L);
    }

    @Override // androidx.dynamicanimation.animation.a.b
    @c1({c1.a.LIBRARY})
    public boolean a(long j4) {
        long j5 = this.f29226i;
        if (j5 == 0) {
            this.f29226i = j4;
            s(this.f29219b);
            return false;
        }
        this.f29226i = j4;
        boolean y4 = y(j4 - j5);
        float min = Math.min(this.f29219b, this.f29224g);
        this.f29219b = min;
        float max = Math.max(min, this.f29225h);
        this.f29219b = max;
        s(max);
        if (y4) {
            e(false);
        }
        return y4;
    }

    public T b(q qVar) {
        if (!this.f29228k.contains(qVar)) {
            this.f29228k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (k()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f29229l.contains(rVar)) {
            this.f29229l.add(rVar);
        }
        return this;
    }

    public void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f29223f) {
            e(true);
        }
    }

    abstract float f(float f4, float f5);

    public float g() {
        return this.f29227j;
    }

    float i() {
        return this.f29227j * 0.75f;
    }

    abstract boolean j(float f4, float f5);

    public boolean k() {
        return this.f29223f;
    }

    public void l(q qVar) {
        m(this.f29228k, qVar);
    }

    public void o(r rVar) {
        m(this.f29229l, rVar);
    }

    public T p(float f4) {
        this.f29224g = f4;
        return this;
    }

    public T q(float f4) {
        this.f29225h = f4;
        return this;
    }

    public T r(@x(from = 0.0d, fromInclusive = false) float f4) {
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f29227j = f4;
        v(f4 * 0.75f);
        return this;
    }

    void s(float f4) {
        this.f29222e.c(this.f29221d, f4);
        for (int i4 = 0; i4 < this.f29229l.size(); i4++) {
            if (this.f29229l.get(i4) != null) {
                this.f29229l.get(i4).a(this, this.f29219b, this.f29218a);
            }
        }
        n(this.f29229l);
    }

    public T t(float f4) {
        this.f29219b = f4;
        this.f29220c = true;
        return this;
    }

    public T u(float f4) {
        this.f29218a = f4;
        return this;
    }

    abstract void v(float f4);

    public void w() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f29223f) {
            return;
        }
        x();
    }

    abstract boolean y(long j4);

    <K> b(K k4, androidx.dynamicanimation.animation.d<K> dVar) {
        this.f29218a = 0.0f;
        this.f29219b = Float.MAX_VALUE;
        this.f29220c = false;
        this.f29223f = false;
        this.f29224g = Float.MAX_VALUE;
        this.f29225h = -Float.MAX_VALUE;
        this.f29226i = 0L;
        this.f29228k = new ArrayList<>();
        this.f29229l = new ArrayList<>();
        this.f29221d = k4;
        this.f29222e = dVar;
        if (dVar != f29209r && dVar != f29210s && dVar != f29211t) {
            if (dVar == f29215x) {
                this.f29227j = 0.00390625f;
                return;
            } else if (dVar != f29207p && dVar != f29208q) {
                this.f29227j = 1.0f;
                return;
            } else {
                this.f29227j = 0.00390625f;
                return;
            }
        }
        this.f29227j = 0.1f;
    }
}
