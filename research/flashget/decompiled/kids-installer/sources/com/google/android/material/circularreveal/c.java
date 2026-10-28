package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.circularreveal.b;

/* compiled from: CircularRevealWidget.java */
/* loaded from: classes3.dex */
public interface c extends b.a {

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes2.dex */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b, reason: collision with root package name */
        public static final TypeEvaluator<e> f13276b = new b();

        /* renamed from: a, reason: collision with root package name */
        private final e f13277a = new e();

        @Override // android.animation.TypeEvaluator
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f6, @o0 e eVar, @o0 e eVar2) {
            this.f13277a.b(u1.a.f(eVar.f13281a, eVar2.f13281a, f6), u1.a.f(eVar.f13282b, eVar2.f13282b, f6), u1.a.f(eVar.f13283c, eVar2.f13283c, f6));
            return this.f13277a;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: com.google.android.material.circularreveal.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0172c extends Property<c, e> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<c, e> f13278a = new C0172c(ProtectedSandApp.s("ሐ"));

        private C0172c(String str) {
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
            cVar.c(eVar);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes2.dex */
    public static class d extends Property<c, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<c, Integer> f13279a = new d(ProtectedSandApp.s("ሑ"));

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
            cVar.j(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: d, reason: collision with root package name */
        public static final float f13280d = Float.MAX_VALUE;

        /* renamed from: a, reason: collision with root package name */
        public float f13281a;

        /* renamed from: b, reason: collision with root package name */
        public float f13282b;

        /* renamed from: c, reason: collision with root package name */
        public float f13283c;

        public boolean a() {
            return this.f13283c == Float.MAX_VALUE;
        }

        public void b(float f6, float f7, float f8) {
            this.f13281a = f6;
            this.f13282b = f7;
            this.f13283c = f8;
        }

        public void c(@o0 e eVar) {
            b(eVar.f13281a, eVar.f13282b, eVar.f13283c);
        }

        private e() {
        }

        public e(float f6, float f7, float f8) {
            this.f13281a = f6;
            this.f13282b = f7;
            this.f13283c = f8;
        }

        public e(@o0 e eVar) {
            this(eVar.f13281a, eVar.f13282b, eVar.f13283c);
        }
    }

    @q0
    e a();

    @q0
    Drawable b();

    void c(@q0 e eVar);

    void d();

    void draw(Canvas canvas);

    void e(@q0 Drawable drawable);

    @l
    int f();

    void h();

    boolean isOpaque();

    void j(@l int i5);
}
