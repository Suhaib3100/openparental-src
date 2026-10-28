package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.circularreveal.b;

/* compiled from: CircularRevealWidget.java */
/* loaded from: classes6.dex */
public interface c extends b.a {

    /* compiled from: CircularRevealWidget.java */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b, reason: collision with root package name */
        public static final TypeEvaluator<e> f53028b = new b();

        /* renamed from: a, reason: collision with root package name */
        private final e f53029a = new e();

        @Override // android.animation.TypeEvaluator
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f4, @o0 e eVar, @o0 e eVar2) {
            this.f53029a.b(z8.a.f(eVar.f53033a, eVar2.f53033a, f4), z8.a.f(eVar.f53034b, eVar2.f53034b, f4), z8.a.f(eVar.f53035c, eVar2.f53035c, f4));
            return this.f53029a;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: com.google.android.material.circularreveal.c$c, reason: collision with other inner class name */
    public static class C0806c extends Property<c, e> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<c, e> f53030a = new C0806c(ProtectedSandApp.s("\uf18f"));

        private C0806c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        @q0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(@o0 c cVar) {
            return cVar.a();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@o0 c cVar, @q0 e eVar) {
            cVar.k(eVar);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    public static class d extends Property<c, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<c, Integer> f53031a = new d(ProtectedSandApp.s("\uf190"));

        private d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(@o0 c cVar) {
            return Integer.valueOf(cVar.f());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@o0 c cVar, @o0 Integer num) {
            cVar.i(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    public static class e {

        /* renamed from: d, reason: collision with root package name */
        public static final float f53032d = Float.MAX_VALUE;

        /* renamed from: a, reason: collision with root package name */
        public float f53033a;

        /* renamed from: b, reason: collision with root package name */
        public float f53034b;

        /* renamed from: c, reason: collision with root package name */
        public float f53035c;

        public boolean a() {
            return this.f53035c == Float.MAX_VALUE;
        }

        public void b(float f4, float f5, float f6) {
            this.f53033a = f4;
            this.f53034b = f5;
            this.f53035c = f6;
        }

        public void c(@o0 e eVar) {
            b(eVar.f53033a, eVar.f53034b, eVar.f53035c);
        }

        private e() {
        }

        public e(float f4, float f5, float f6) {
            this.f53033a = f4;
            this.f53034b = f5;
            this.f53035c = f6;
        }

        public e(@o0 e eVar) {
            this(eVar.f53033a, eVar.f53034b, eVar.f53035c);
        }
    }

    @q0
    e a();

    void b();

    void c(@q0 Drawable drawable);

    void draw(Canvas canvas);

    @l
    int f();

    void g();

    void i(@l int i4);

    boolean isOpaque();

    @q0
    Drawable j();

    void k(@q0 e eVar);
}
