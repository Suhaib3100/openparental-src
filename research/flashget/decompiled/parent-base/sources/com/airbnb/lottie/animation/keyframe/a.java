package com.airbnb.lottie.animation.keyframe;

import android.view.animation.Interpolator;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseKeyframeAnimation.java */
/* loaded from: classes3.dex */
public abstract class a<K, A> {

    /* renamed from: c, reason: collision with root package name */
    private final d<K> f38803c;

    /* renamed from: e, reason: collision with root package name */
    @q0
    protected com.airbnb.lottie.value.j<A> f38805e;

    /* renamed from: a, reason: collision with root package name */
    final List<b> f38801a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    private boolean f38802b = false;

    /* renamed from: d, reason: collision with root package name */
    protected float f38804d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private A f38806f = null;

    /* renamed from: g, reason: collision with root package name */
    private float f38807g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f38808h = -1.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    public interface b {
        void a();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    private static final class c<T> implements d<T> {
        private c() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean a(float f4) {
            throw new IllegalStateException(ProtectedSandApp.s("ÿ"));
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public com.airbnb.lottie.value.a<T> b() {
            throw new IllegalStateException(ProtectedSandApp.s("ÿ"));
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float f4) {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float d() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return true;
        }

        c(C0663a c0663a) {
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    private interface d<T> {
        boolean a(float f4);

        com.airbnb.lottie.value.a<T> b();

        boolean c(float f4);

        @x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
        float d();

        @x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
        float e();

        boolean isEmpty();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    private static final class e<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        private final List<? extends com.airbnb.lottie.value.a<T>> f38809a;

        /* renamed from: c, reason: collision with root package name */
        private com.airbnb.lottie.value.a<T> f38811c = null;

        /* renamed from: d, reason: collision with root package name */
        private float f38812d = -1.0f;

        /* renamed from: b, reason: collision with root package name */
        @o0
        private com.airbnb.lottie.value.a<T> f38810b = f(0.0f);

        e(List<? extends com.airbnb.lottie.value.a<T>> list) {
            this.f38809a = list;
        }

        private com.airbnb.lottie.value.a<T> f(float f4) {
            com.airbnb.lottie.value.a<T> aVar = (com.airbnb.lottie.value.a) androidx.appcompat.view.menu.d.a(this.f38809a, 1);
            if (f4 >= aVar.e()) {
                return aVar;
            }
            for (int size = this.f38809a.size() - 2; size >= 1; size--) {
                com.airbnb.lottie.value.a<T> aVar2 = this.f38809a.get(size);
                if (this.f38810b != aVar2 && aVar2.a(f4)) {
                    return aVar2;
                }
            }
            return this.f38809a.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean a(float f4) {
            com.airbnb.lottie.value.a<T> aVar = this.f38811c;
            com.airbnb.lottie.value.a<T> aVar2 = this.f38810b;
            if (aVar == aVar2 && this.f38812d == f4) {
                return true;
            }
            this.f38811c = aVar2;
            this.f38812d = f4;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        @o0
        public com.airbnb.lottie.value.a<T> b() {
            return this.f38810b;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float f4) {
            if (this.f38810b.a(f4)) {
                return !this.f38810b.h();
            }
            this.f38810b = f(f4);
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float d() {
            return this.f38809a.get(0).e();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            return ((com.airbnb.lottie.value.a) androidx.appcompat.view.menu.d.a(this.f38809a, 1)).b();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    private static final class f<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final com.airbnb.lottie.value.a<T> f38813a;

        /* renamed from: b, reason: collision with root package name */
        private float f38814b = -1.0f;

        f(List<? extends com.airbnb.lottie.value.a<T>> list) {
            this.f38813a = list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean a(float f4) {
            if (this.f38814b == f4) {
                return true;
            }
            this.f38814b = f4;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public com.airbnb.lottie.value.a<T> b() {
            return this.f38813a;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float f4) {
            return !this.f38813a.h();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float d() {
            return this.f38813a.e();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            return this.f38813a.b();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    a(List<? extends com.airbnb.lottie.value.a<K>> list) {
        this.f38803c = o(list);
    }

    @x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
    private float g() {
        if (this.f38807g == -1.0f) {
            this.f38807g = this.f38803c.d();
        }
        return this.f38807g;
    }

    private static <T> d<T> o(List<? extends com.airbnb.lottie.value.a<T>> list) {
        return list.isEmpty() ? new c() : list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f38801a.add(bVar);
    }

    protected com.airbnb.lottie.value.a<K> b() {
        String s4 = ProtectedSandApp.s("Ā");
        com.airbnb.lottie.e.a(s4);
        com.airbnb.lottie.value.a<K> b5 = this.f38803c.b();
        com.airbnb.lottie.e.b(s4);
        return b5;
    }

    @x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
    float c() {
        if (this.f38808h == -1.0f) {
            this.f38808h = this.f38803c.e();
        }
        return this.f38808h;
    }

    protected float d() {
        com.airbnb.lottie.value.a<K> b5 = b();
        if (b5.h()) {
            return 0.0f;
        }
        return b5.f39407d.getInterpolation(e());
    }

    float e() {
        if (this.f38802b) {
            return 0.0f;
        }
        com.airbnb.lottie.value.a<K> b5 = b();
        if (b5.h()) {
            return 0.0f;
        }
        return (this.f38804d - b5.e()) / (b5.b() - b5.e());
    }

    public float f() {
        return this.f38804d;
    }

    public A h() {
        float e4 = e();
        if (this.f38805e == null && this.f38803c.a(e4)) {
            return this.f38806f;
        }
        com.airbnb.lottie.value.a<K> b5 = b();
        Interpolator interpolator = b5.f39408e;
        A i4 = (interpolator == null || b5.f39409f == null) ? i(b5, d()) : j(b5, e4, interpolator.getInterpolation(e4), b5.f39409f.getInterpolation(e4));
        this.f38806f = i4;
        return i4;
    }

    abstract A i(com.airbnb.lottie.value.a<K> aVar, float f4);

    protected A j(com.airbnb.lottie.value.a<K> aVar, float f4, float f5, float f6) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ā"));
    }

    public void k() {
        for (int i4 = 0; i4 < this.f38801a.size(); i4++) {
            this.f38801a.get(i4).a();
        }
    }

    public void l() {
        this.f38802b = true;
    }

    public void m(@x(from = 0.0d, to = 1.0d) float f4) {
        if (this.f38803c.isEmpty()) {
            return;
        }
        if (f4 < g()) {
            f4 = g();
        } else if (f4 > c()) {
            f4 = c();
        }
        if (f4 == this.f38804d) {
            return;
        }
        this.f38804d = f4;
        if (this.f38803c.c(f4)) {
            k();
        }
    }

    public void n(@q0 com.airbnb.lottie.value.j<A> jVar) {
        com.airbnb.lottie.value.j<A> jVar2 = this.f38805e;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f38805e = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }
}
