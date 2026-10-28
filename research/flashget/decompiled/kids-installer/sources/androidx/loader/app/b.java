package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.view.a0;
import android.view.c1;
import android.view.f1;
import android.view.h1;
import android.view.j0;
import android.view.k0;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.j;
import androidx.core.util.d;
import androidx.loader.app.a;
import androidx.loader.content.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Objects;

/* compiled from: LoaderManagerImpl.java */
/* loaded from: classes3.dex */
class b extends androidx.loader.app.a {

    /* renamed from: c, reason: collision with root package name */
    static final String f8704c = "LoaderManager";

    /* renamed from: d, reason: collision with root package name */
    static boolean f8705d;

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final a0 f8706a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final c f8707b;

    /* compiled from: LoaderManagerImpl.java */
    public static class a<D> extends j0<D> implements c.InterfaceC0103c<D> {

        /* renamed from: m, reason: collision with root package name */
        private final int f8708m;

        /* renamed from: n, reason: collision with root package name */
        @q0
        private final Bundle f8709n;

        /* renamed from: o, reason: collision with root package name */
        @o0
        private final androidx.loader.content.c<D> f8710o;

        /* renamed from: p, reason: collision with root package name */
        private a0 f8711p;

        /* renamed from: q, reason: collision with root package name */
        private C0101b<D> f8712q;

        /* renamed from: r, reason: collision with root package name */
        private androidx.loader.content.c<D> f8713r;

        a(int i5, @q0 Bundle bundle, @o0 androidx.loader.content.c<D> cVar, @q0 androidx.loader.content.c<D> cVar2) {
            this.f8708m = i5;
            this.f8709n = bundle;
            this.f8710o = cVar;
            this.f8713r = cVar2;
            cVar.u(i5, this);
        }

        @Override // androidx.loader.content.c.InterfaceC0103c
        public void a(@o0 androidx.loader.content.c<D> cVar, @q0 D d6) {
            if (b.f8705d) {
                toString();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                q(d6);
            } else {
                boolean z5 = b.f8705d;
                n(d6);
            }
        }

        @Override // android.view.LiveData
        protected void l() {
            if (b.f8705d) {
                toString();
            }
            this.f8710o.y();
        }

        @Override // android.view.LiveData
        protected void m() {
            if (b.f8705d) {
                toString();
            }
            this.f8710o.z();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.LiveData
        public void o(@o0 k0<? super D> k0Var) {
            super.o(k0Var);
            this.f8711p = null;
            this.f8712q = null;
        }

        @Override // android.view.j0, android.view.LiveData
        public void q(D d6) {
            super.q(d6);
            androidx.loader.content.c<D> cVar = this.f8713r;
            if (cVar != null) {
                cVar.w();
                this.f8713r = null;
            }
        }

        @l0
        androidx.loader.content.c<D> r(boolean z5) {
            if (b.f8705d) {
                toString();
            }
            this.f8710o.b();
            this.f8710o.a();
            C0101b<D> c0101b = this.f8712q;
            if (c0101b != null) {
                o(c0101b);
                if (z5) {
                    c0101b.d();
                }
            }
            this.f8710o.B(this);
            if ((c0101b == null || c0101b.c()) && !z5) {
                return this.f8710o;
            }
            this.f8710o.w();
            return this.f8713r;
        }

        public void s(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f8708m);
            printWriter.print(" mArgs=");
            printWriter.println(this.f8709n);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f8710o);
            this.f8710o.g(androidx.concurrent.futures.b.a(str, "  "), fileDescriptor, printWriter, strArr);
            if (this.f8712q != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f8712q);
                this.f8712q.b(androidx.concurrent.futures.b.a(str, "  "), printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(t().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        @o0
        androidx.loader.content.c<D> t() {
            return this.f8710o;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f8708m);
            sb.append(" : ");
            d.a(this.f8710o, sb);
            sb.append("}}");
            return sb.toString();
        }

        boolean u() {
            C0101b<D> c0101b;
            return (!h() || (c0101b = this.f8712q) == null || c0101b.c()) ? false : true;
        }

        void v() {
            a0 a0Var = this.f8711p;
            C0101b<D> c0101b = this.f8712q;
            if (a0Var == null || c0101b == null) {
                return;
            }
            super.o(c0101b);
            j(a0Var, c0101b);
        }

        @o0
        @l0
        androidx.loader.content.c<D> w(@o0 a0 a0Var, @o0 a.InterfaceC0100a<D> interfaceC0100a) {
            C0101b<D> c0101b = new C0101b<>(this.f8710o, interfaceC0100a);
            j(a0Var, c0101b);
            C0101b<D> c0101b2 = this.f8712q;
            if (c0101b2 != null) {
                o(c0101b2);
            }
            this.f8711p = a0Var;
            this.f8712q = c0101b;
            return this.f8710o;
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0101b<D> implements k0<D> {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final androidx.loader.content.c<D> f8714a;

        /* renamed from: b, reason: collision with root package name */
        @o0
        private final a.InterfaceC0100a<D> f8715b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8716c = false;

        C0101b(@o0 androidx.loader.content.c<D> cVar, @o0 a.InterfaceC0100a<D> interfaceC0100a) {
            this.f8714a = cVar;
            this.f8715b = interfaceC0100a;
        }

        @Override // android.view.k0
        public void a(@q0 D d6) {
            if (b.f8705d) {
                Objects.toString(this.f8714a);
                this.f8714a.d(d6);
            }
            this.f8715b.a(this.f8714a, d6);
            this.f8716c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f8716c);
        }

        boolean c() {
            return this.f8716c;
        }

        @l0
        void d() {
            if (this.f8716c) {
                if (b.f8705d) {
                    Objects.toString(this.f8714a);
                }
                this.f8715b.c(this.f8714a);
            }
        }

        public String toString() {
            return this.f8715b.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    static class c extends c1 {

        /* renamed from: f, reason: collision with root package name */
        private static final f1.b f8717f = new a();

        /* renamed from: d, reason: collision with root package name */
        private j<a> f8718d = new j<>();

        /* renamed from: e, reason: collision with root package name */
        private boolean f8719e = false;

        /* compiled from: LoaderManagerImpl.java */
        static class a implements f1.b {
            a() {
            }

            @Override // androidx.lifecycle.f1.b
            @o0
            public <T extends c1> T a(@o0 Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        @o0
        static c i(h1 h1Var) {
            return (c) new f1(h1Var, f8717f).a(c.class);
        }

        @Override // android.view.c1
        protected void e() {
            int B = this.f8718d.B();
            for (int i5 = 0; i5 < B; i5++) {
                this.f8718d.C(i5).r(true);
            }
            this.f8718d.b();
        }

        public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f8718d.B() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i5 = 0; i5 < this.f8718d.B(); i5++) {
                    a C = this.f8718d.C(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f8718d.o(i5));
                    printWriter.print(": ");
                    printWriter.println(C.toString());
                    C.s(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void h() {
            this.f8719e = false;
        }

        <D> a<D> j(int i5) {
            return this.f8718d.j(i5);
        }

        boolean k() {
            int B = this.f8718d.B();
            for (int i5 = 0; i5 < B; i5++) {
                if (this.f8718d.C(i5).u()) {
                    return true;
                }
            }
            return false;
        }

        boolean l() {
            return this.f8719e;
        }

        void m() {
            int B = this.f8718d.B();
            for (int i5 = 0; i5 < B; i5++) {
                this.f8718d.C(i5).v();
            }
        }

        void n(int i5, @o0 a aVar) {
            this.f8718d.p(i5, aVar);
        }

        void o(int i5) {
            this.f8718d.u(i5);
        }

        void p() {
            this.f8719e = true;
        }
    }

    b(@o0 a0 a0Var, @o0 h1 h1Var) {
        this.f8706a = a0Var;
        this.f8707b = c.i(h1Var);
    }

    @o0
    @l0
    private <D> androidx.loader.content.c<D> j(int i5, @q0 Bundle bundle, @o0 a.InterfaceC0100a<D> interfaceC0100a, @q0 androidx.loader.content.c<D> cVar) {
        try {
            this.f8707b.p();
            androidx.loader.content.c<D> b6 = interfaceC0100a.b(i5, bundle);
            if (b6 == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (b6.getClass().isMemberClass() && !Modifier.isStatic(b6.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + b6);
            }
            a aVar = new a(i5, bundle, b6, cVar);
            if (f8705d) {
                aVar.toString();
            }
            this.f8707b.n(i5, aVar);
            this.f8707b.h();
            return aVar.w(this.f8706a, interfaceC0100a);
        } catch (Throwable th) {
            this.f8707b.h();
            throw th;
        }
    }

    @Override // androidx.loader.app.a
    @l0
    public void a(int i5) {
        if (this.f8707b.l()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (f8705d) {
            toString();
        }
        a j5 = this.f8707b.j(i5);
        if (j5 != null) {
            j5.r(true);
            this.f8707b.o(i5);
        }
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f8707b.g(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    @q0
    public <D> androidx.loader.content.c<D> e(int i5) {
        if (this.f8707b.l()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        a<D> j5 = this.f8707b.j(i5);
        if (j5 != null) {
            return j5.t();
        }
        return null;
    }

    @Override // androidx.loader.app.a
    public boolean f() {
        return this.f8707b.k();
    }

    @Override // androidx.loader.app.a
    @o0
    @l0
    public <D> androidx.loader.content.c<D> g(int i5, @q0 Bundle bundle, @o0 a.InterfaceC0100a<D> interfaceC0100a) {
        if (this.f8707b.l()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> j5 = this.f8707b.j(i5);
        if (f8705d) {
            toString();
            Objects.toString(bundle);
        }
        if (j5 == null) {
            return j(i5, bundle, interfaceC0100a, null);
        }
        if (f8705d) {
            j5.toString();
        }
        return j5.w(this.f8706a, interfaceC0100a);
    }

    @Override // androidx.loader.app.a
    public void h() {
        this.f8707b.m();
    }

    @Override // androidx.loader.app.a
    @o0
    @l0
    public <D> androidx.loader.content.c<D> i(int i5, @q0 Bundle bundle, @o0 a.InterfaceC0100a<D> interfaceC0100a) {
        if (this.f8707b.l()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if (f8705d) {
            toString();
            Objects.toString(bundle);
        }
        a<D> j5 = this.f8707b.j(i5);
        return j(i5, bundle, interfaceC0100a, j5 != null ? j5.r(false) : null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        d.a(this.f8706a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
