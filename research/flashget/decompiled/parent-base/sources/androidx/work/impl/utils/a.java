package androidx.work.impl.utils;

import androidx.annotation.c1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.work.f0;
import androidx.work.impl.WorkDatabase;
import androidx.work.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* compiled from: CancelWorkRunnable.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.c f36437b = new androidx.work.impl.c();

    /* compiled from: CancelWorkRunnable.java */
    /* renamed from: androidx.work.impl.utils.a$a, reason: collision with other inner class name */
    class C0643a extends a {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.j f36438c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ UUID f36439d;

        C0643a(final androidx.work.impl.j val$workManagerImpl, final UUID val$id) {
            this.f36438c = val$workManagerImpl;
            this.f36439d = val$id;
        }

        @Override // androidx.work.impl.utils.a
        @n1
        void i() {
            WorkDatabase M = this.f36438c.M();
            M.beginTransaction();
            try {
                a(this.f36438c, this.f36439d.toString());
                M.setTransactionSuccessful();
                M.endTransaction();
                h(this.f36438c);
            } catch (Throwable th) {
                M.endTransaction();
                throw th;
            }
        }
    }

    /* compiled from: CancelWorkRunnable.java */
    class b extends a {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.j f36440c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f36441d;

        b(final androidx.work.impl.j val$workManagerImpl, final String val$tag) {
            this.f36440c = val$workManagerImpl;
            this.f36441d = val$tag;
        }

        @Override // androidx.work.impl.utils.a
        @n1
        void i() {
            WorkDatabase M = this.f36440c.M();
            M.beginTransaction();
            try {
                Iterator<String> it = M.k().m(this.f36441d).iterator();
                while (it.hasNext()) {
                    a(this.f36440c, it.next());
                }
                M.setTransactionSuccessful();
                M.endTransaction();
                h(this.f36440c);
            } catch (Throwable th) {
                M.endTransaction();
                throw th;
            }
        }
    }

    /* compiled from: CancelWorkRunnable.java */
    class c extends a {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.j f36442c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f36443d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f36444e;

        c(final androidx.work.impl.j val$workManagerImpl, final String val$name, final boolean val$allowReschedule) {
            this.f36442c = val$workManagerImpl;
            this.f36443d = val$name;
            this.f36444e = val$allowReschedule;
        }

        @Override // androidx.work.impl.utils.a
        @n1
        void i() {
            WorkDatabase M = this.f36442c.M();
            M.beginTransaction();
            try {
                Iterator<String> it = M.k().h(this.f36443d).iterator();
                while (it.hasNext()) {
                    a(this.f36442c, it.next());
                }
                M.setTransactionSuccessful();
                M.endTransaction();
                if (this.f36444e) {
                    h(this.f36442c);
                }
            } catch (Throwable th) {
                M.endTransaction();
                throw th;
            }
        }
    }

    /* compiled from: CancelWorkRunnable.java */
    class d extends a {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.j f36445c;

        d(final androidx.work.impl.j val$workManagerImpl) {
            this.f36445c = val$workManagerImpl;
        }

        @Override // androidx.work.impl.utils.a
        @n1
        void i() {
            WorkDatabase M = this.f36445c.M();
            M.beginTransaction();
            try {
                Iterator<String> it = M.k().z().iterator();
                while (it.hasNext()) {
                    a(this.f36445c, it.next());
                }
                new i(this.f36445c.M()).e(System.currentTimeMillis());
                M.setTransactionSuccessful();
                M.endTransaction();
            } catch (Throwable th) {
                M.endTransaction();
                throw th;
            }
        }
    }

    public static a b(@o0 final androidx.work.impl.j workManagerImpl) {
        return new d(workManagerImpl);
    }

    public static a c(@o0 final UUID id2, @o0 final androidx.work.impl.j workManagerImpl) {
        return new C0643a(workManagerImpl, id2);
    }

    public static a d(@o0 final String name, @o0 final androidx.work.impl.j workManagerImpl, final boolean allowReschedule) {
        return new c(workManagerImpl, name, allowReschedule);
    }

    public static a e(@o0 final String tag, @o0 final androidx.work.impl.j workManagerImpl) {
        return new b(workManagerImpl, tag);
    }

    private void g(WorkDatabase workDatabase, String workSpecId) {
        androidx.work.impl.model.s k4 = workDatabase.k();
        androidx.work.impl.model.b b5 = workDatabase.b();
        LinkedList linkedList = new LinkedList();
        linkedList.add(workSpecId);
        while (!linkedList.isEmpty()) {
            String str = (String) linkedList.remove();
            f0.a j4 = k4.j(str);
            if (j4 != f0.a.SUCCEEDED && j4 != f0.a.FAILED) {
                k4.b(f0.a.CANCELLED, str);
            }
            linkedList.addAll(b5.b(str));
        }
    }

    void a(androidx.work.impl.j workManagerImpl, String workSpecId) {
        g(workManagerImpl.M(), workSpecId);
        workManagerImpl.J().m(workSpecId);
        Iterator<androidx.work.impl.e> it = workManagerImpl.L().iterator();
        while (it.hasNext()) {
            it.next().a(workSpecId);
        }
    }

    public androidx.work.w f() {
        return this.f36437b;
    }

    void h(androidx.work.impl.j workManagerImpl) {
        androidx.work.impl.f.b(workManagerImpl.F(), workManagerImpl.M(), workManagerImpl.L());
    }

    abstract void i();

    @Override // java.lang.Runnable
    public void run() {
        try {
            i();
            this.f36437b.b(androidx.work.w.f36614a);
        } catch (Throwable th) {
            this.f36437b.b(new w.b.a(th));
        }
    }
}
