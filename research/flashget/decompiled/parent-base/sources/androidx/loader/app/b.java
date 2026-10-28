package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.c3;
import androidx.compose.runtime.changelist.j;
import androidx.core.util.i;
import androidx.loader.app.a;
import androidx.loader.content.c;
import androidx.view.InterfaceC1423e0;
import androidx.view.h1;
import androidx.view.k1;
import androidx.view.n1;
import androidx.view.p0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Objects;

/* compiled from: LoaderManagerImpl.java */
/* loaded from: classes3.dex */
class b extends androidx.loader.app.a {

    /* renamed from: c, reason: collision with root package name */
    static final String f30497c = "LoaderManager";

    /* renamed from: d, reason: collision with root package name */
    static boolean f30498d;

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final InterfaceC1423e0 f30499a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final c f30500b;

    /* compiled from: LoaderManagerImpl.java */
    public static class a<D> extends androidx.view.o0<D> implements c.InterfaceC0508c<D> {

        /* renamed from: m, reason: collision with root package name */
        private final int f30501m;

        /* renamed from: n, reason: collision with root package name */
        @q0
        private final Bundle f30502n;

        /* renamed from: o, reason: collision with root package name */
        @o0
        private final androidx.loader.content.c<D> f30503o;

        /* renamed from: p, reason: collision with root package name */
        private InterfaceC1423e0 f30504p;

        /* renamed from: q, reason: collision with root package name */
        private C0506b<D> f30505q;

        /* renamed from: r, reason: collision with root package name */
        private androidx.loader.content.c<D> f30506r;

        a(int i4, @q0 Bundle bundle, @o0 androidx.loader.content.c<D> cVar, @q0 androidx.loader.content.c<D> cVar2) {
            this.f30501m = i4;
            this.f30502n = bundle;
            this.f30503o = cVar;
            this.f30506r = cVar2;
            cVar.registerListener(i4, this);
        }

        @Override // androidx.loader.content.c.InterfaceC0508c
        public void a(@o0 androidx.loader.content.c<D> cVar, @q0 D d5) {
            if (b.f30498d) {
                toString();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                r(d5);
            } else {
                boolean z4 = b.f30498d;
                o(d5);
            }
        }

        @Override // androidx.view.LiveData
        protected void m() {
            if (b.f30498d) {
                toString();
            }
            this.f30503o.startLoading();
        }

        @Override // androidx.view.LiveData
        protected void n() {
            if (b.f30498d) {
                toString();
            }
            this.f30503o.stopLoading();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.LiveData
        public void p(@o0 p0<? super D> p0Var) {
            super.p(p0Var);
            this.f30504p = null;
            this.f30505q = null;
        }

        @Override // androidx.view.o0, androidx.view.LiveData
        public void r(D d5) {
            super.r(d5);
            androidx.loader.content.c<D> cVar = this.f30506r;
            if (cVar != null) {
                cVar.reset();
                this.f30506r = null;
            }
        }

        @l0
        androidx.loader.content.c<D> s(boolean z4) {
            if (b.f30498d) {
                toString();
            }
            this.f30503o.cancelLoad();
            this.f30503o.abandon();
            C0506b<D> c0506b = this.f30505q;
            if (c0506b != null) {
                p(c0506b);
                if (z4) {
                    c0506b.c();
                }
            }
            this.f30503o.unregisterListener(this);
            if ((c0506b == null || c0506b.b()) && !z4) {
                return this.f30503o;
            }
            this.f30503o.reset();
            return this.f30506r;
        }

        public void t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f30501m);
            printWriter.print(" mArgs=");
            printWriter.println(this.f30502n);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f30503o);
            this.f30503o.dump(j.a(str, "  "), fileDescriptor, printWriter, strArr);
            if (this.f30505q != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f30505q);
                this.f30505q.a(j.a(str, "  "), printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(u().dataToString(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        public String toString() {
            StringBuilder a5 = androidx.fragment.app.a.a(64, "LoaderInfo{");
            a5.append(Integer.toHexString(System.identityHashCode(this)));
            a5.append(" #");
            a5.append(this.f30501m);
            a5.append(" : ");
            i.a(this.f30503o, a5);
            a5.append("}}");
            return a5.toString();
        }

        @o0
        androidx.loader.content.c<D> u() {
            return this.f30503o;
        }

        boolean v() {
            C0506b<D> c0506b;
            return (!h() || (c0506b = this.f30505q) == null || c0506b.b()) ? false : true;
        }

        void w() {
            InterfaceC1423e0 interfaceC1423e0 = this.f30504p;
            C0506b<D> c0506b = this.f30505q;
            if (interfaceC1423e0 == null || c0506b == null) {
                return;
            }
            super.p(c0506b);
            k(interfaceC1423e0, c0506b);
        }

        @o0
        @l0
        androidx.loader.content.c<D> x(@o0 InterfaceC1423e0 interfaceC1423e0, @o0 a.InterfaceC0505a<D> interfaceC0505a) {
            C0506b<D> c0506b = new C0506b<>(this.f30503o, interfaceC0505a);
            k(interfaceC1423e0, c0506b);
            C0506b<D> c0506b2 = this.f30505q;
            if (c0506b2 != null) {
                p(c0506b2);
            }
            this.f30504p = interfaceC1423e0;
            this.f30505q = c0506b;
            return this.f30503o;
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0506b<D> implements p0<D> {

        /* renamed from: b, reason: collision with root package name */
        @o0
        private final androidx.loader.content.c<D> f30507b;

        /* renamed from: c, reason: collision with root package name */
        @o0
        private final a.InterfaceC0505a<D> f30508c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f30509d = false;

        C0506b(@o0 androidx.loader.content.c<D> cVar, @o0 a.InterfaceC0505a<D> interfaceC0505a) {
            this.f30507b = cVar;
            this.f30508c = interfaceC0505a;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f30509d);
        }

        boolean b() {
            return this.f30509d;
        }

        @l0
        void c() {
            if (this.f30509d) {
                if (b.f30498d) {
                    Objects.toString(this.f30507b);
                }
                this.f30508c.onLoaderReset(this.f30507b);
            }
        }

        @Override // androidx.view.p0
        public void onChanged(@q0 D d5) {
            if (b.f30498d) {
                Objects.toString(this.f30507b);
                this.f30507b.dataToString(d5);
            }
            this.f30508c.onLoadFinished(this.f30507b, d5);
            this.f30509d = true;
        }

        public String toString() {
            return this.f30508c.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    static class c extends h1 {

        /* renamed from: c, reason: collision with root package name */
        private static final k1.b f30510c = new a();

        /* renamed from: a, reason: collision with root package name */
        private c3<a> f30511a = new c3<>();

        /* renamed from: b, reason: collision with root package name */
        private boolean f30512b = false;

        /* compiled from: LoaderManagerImpl.java */
        static class a implements k1.b {
            a() {
            }

            @Override // androidx.lifecycle.k1.b
            @o0
            public <T extends h1> T create(@o0 Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        @o0
        static c d(n1 n1Var) {
            return (c) new k1(n1Var, f30510c).a(c.class);
        }

        public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f30511a.B() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i4 = 0; i4 < this.f30511a.B(); i4++) {
                    a C = this.f30511a.C(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f30511a.p(i4));
                    printWriter.print(": ");
                    printWriter.println(C.toString());
                    C.t(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void c() {
            this.f30512b = false;
        }

        <D> a<D> e(int i4) {
            return this.f30511a.i(i4);
        }

        boolean f() {
            int B = this.f30511a.B();
            for (int i4 = 0; i4 < B; i4++) {
                if (this.f30511a.C(i4).v()) {
                    return true;
                }
            }
            return false;
        }

        boolean g() {
            return this.f30512b;
        }

        void h() {
            int B = this.f30511a.B();
            for (int i4 = 0; i4 < B; i4++) {
                this.f30511a.C(i4).w();
            }
        }

        void i(int i4, @o0 a aVar) {
            this.f30511a.q(i4, aVar);
        }

        void j(int i4) {
            this.f30511a.t(i4);
        }

        void k() {
            this.f30512b = true;
        }

        @Override // androidx.view.h1
        protected void onCleared() {
            super.onCleared();
            int B = this.f30511a.B();
            for (int i4 = 0; i4 < B; i4++) {
                this.f30511a.C(i4).s(true);
            }
            this.f30511a.c();
        }
    }

    b(@o0 InterfaceC1423e0 interfaceC1423e0, @o0 n1 n1Var) {
        this.f30499a = interfaceC1423e0;
        this.f30500b = c.d(n1Var);
    }

    @o0
    @l0
    private <D> androidx.loader.content.c<D> j(int i4, @q0 Bundle bundle, @o0 a.InterfaceC0505a<D> interfaceC0505a, @q0 androidx.loader.content.c<D> cVar) {
        try {
            this.f30500b.k();
            androidx.loader.content.c<D> onCreateLoader = interfaceC0505a.onCreateLoader(i4, bundle);
            if (onCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (onCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
            }
            a aVar = new a(i4, bundle, onCreateLoader, cVar);
            if (f30498d) {
                aVar.toString();
            }
            this.f30500b.i(i4, aVar);
            this.f30500b.c();
            return aVar.x(this.f30499a, interfaceC0505a);
        } catch (Throwable th) {
            this.f30500b.c();
            throw th;
        }
    }

    @Override // androidx.loader.app.a
    @l0
    public void a(int i4) {
        if (this.f30500b.g()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (f30498d) {
            toString();
        }
        a e4 = this.f30500b.e(i4);
        if (e4 != null) {
            e4.s(true);
            this.f30500b.j(i4);
        }
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f30500b.b(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    @q0
    public <D> androidx.loader.content.c<D> e(int i4) {
        if (this.f30500b.g()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        a<D> e4 = this.f30500b.e(i4);
        if (e4 != null) {
            return e4.u();
        }
        return null;
    }

    @Override // androidx.loader.app.a
    public boolean f() {
        return this.f30500b.f();
    }

    @Override // androidx.loader.app.a
    @o0
    @l0
    public <D> androidx.loader.content.c<D> g(int i4, @q0 Bundle bundle, @o0 a.InterfaceC0505a<D> interfaceC0505a) {
        if (this.f30500b.g()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> e4 = this.f30500b.e(i4);
        if (f30498d) {
            toString();
            Objects.toString(bundle);
        }
        if (e4 == null) {
            return j(i4, bundle, interfaceC0505a, null);
        }
        if (f30498d) {
            e4.toString();
        }
        return e4.x(this.f30499a, interfaceC0505a);
    }

    @Override // androidx.loader.app.a
    public void h() {
        this.f30500b.h();
    }

    @Override // androidx.loader.app.a
    @o0
    @l0
    public <D> androidx.loader.content.c<D> i(int i4, @q0 Bundle bundle, @o0 a.InterfaceC0505a<D> interfaceC0505a) {
        if (this.f30500b.g()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if (f30498d) {
            toString();
            Objects.toString(bundle);
        }
        a<D> e4 = this.f30500b.e(i4);
        return j(i4, bundle, interfaceC0505a, e4 != null ? e4.s(false) : null);
    }

    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(128, "LoaderManager{");
        a5.append(Integer.toHexString(System.identityHashCode(this)));
        a5.append(" in ");
        i.a(this.f30499a, a5);
        a5.append("}}");
        return a5.toString();
    }
}
