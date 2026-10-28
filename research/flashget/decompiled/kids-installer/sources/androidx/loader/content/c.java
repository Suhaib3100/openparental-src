package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.solver.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: Loader.java */
/* loaded from: classes.dex */
public class c<D> {

    /* renamed from: a, reason: collision with root package name */
    int f8736a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC0103c<D> f8737b;

    /* renamed from: c, reason: collision with root package name */
    b<D> f8738c;

    /* renamed from: d, reason: collision with root package name */
    Context f8739d;

    /* renamed from: e, reason: collision with root package name */
    boolean f8740e = false;

    /* renamed from: f, reason: collision with root package name */
    boolean f8741f = false;

    /* renamed from: g, reason: collision with root package name */
    boolean f8742g = true;

    /* renamed from: h, reason: collision with root package name */
    boolean f8743h = false;

    /* renamed from: i, reason: collision with root package name */
    boolean f8744i = false;

    /* compiled from: Loader.java */
    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z5) {
            c.this.p();
        }
    }

    /* compiled from: Loader.java */
    public interface b<D> {
        void a(@o0 c<D> cVar);
    }

    /* compiled from: Loader.java */
    /* renamed from: androidx.loader.content.c$c, reason: collision with other inner class name */
    public interface InterfaceC0103c<D> {
        void a(@o0 c<D> cVar, @q0 D d6);
    }

    public c(@o0 Context context) {
        this.f8739d = context.getApplicationContext();
    }

    public boolean A() {
        boolean z5 = this.f8743h;
        this.f8743h = false;
        this.f8744i |= z5;
        return z5;
    }

    @l0
    public void B(@o0 InterfaceC0103c<D> interfaceC0103c) {
        InterfaceC0103c<D> interfaceC0103c2 = this.f8737b;
        if (interfaceC0103c2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0103c2 != interfaceC0103c) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f8737b = null;
    }

    @l0
    public void C(@o0 b<D> bVar) {
        b<D> bVar2 = this.f8738c;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f8738c = null;
    }

    @l0
    public void a() {
        this.f8741f = true;
        n();
    }

    @l0
    public boolean b() {
        return o();
    }

    public void c() {
        this.f8744i = false;
    }

    @o0
    public String d(@q0 D d6) {
        StringBuilder sb = new StringBuilder(64);
        androidx.core.util.d.a(d6, sb);
        sb.append("}");
        return sb.toString();
    }

    @l0
    public void e() {
        b<D> bVar = this.f8738c;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @l0
    public void f(@q0 D d6) {
        InterfaceC0103c<D> interfaceC0103c = this.f8737b;
        if (interfaceC0103c != null) {
            interfaceC0103c.a(this, d6);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f8736a);
        printWriter.print(" mListener=");
        printWriter.println(this.f8737b);
        if (this.f8740e || this.f8743h || this.f8744i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f8740e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f8743h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f8744i);
        }
        if (this.f8741f || this.f8742g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f8741f);
            printWriter.print(" mReset=");
            printWriter.println(this.f8742g);
        }
    }

    @l0
    public void h() {
        q();
    }

    @o0
    public Context i() {
        return this.f8739d;
    }

    public int j() {
        return this.f8736a;
    }

    public boolean k() {
        return this.f8741f;
    }

    public boolean l() {
        return this.f8742g;
    }

    public boolean m() {
        return this.f8740e;
    }

    @l0
    protected void n() {
    }

    @l0
    protected boolean o() {
        return false;
    }

    @l0
    public void p() {
        if (this.f8740e) {
            h();
        } else {
            this.f8743h = true;
        }
    }

    @l0
    protected void q() {
    }

    @l0
    protected void r() {
    }

    @l0
    protected void s() {
    }

    @l0
    protected void t() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        androidx.core.util.d.a(this, sb);
        sb.append(" id=");
        return e.a(sb, this.f8736a, "}");
    }

    @l0
    public void u(int i5, @o0 InterfaceC0103c<D> interfaceC0103c) {
        if (this.f8737b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f8737b = interfaceC0103c;
        this.f8736a = i5;
    }

    @l0
    public void v(@o0 b<D> bVar) {
        if (this.f8738c != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f8738c = bVar;
    }

    @l0
    public void w() {
        r();
        this.f8742g = true;
        this.f8740e = false;
        this.f8741f = false;
        this.f8743h = false;
        this.f8744i = false;
    }

    public void x() {
        if (this.f8744i) {
            p();
        }
    }

    @l0
    public final void y() {
        this.f8740e = true;
        this.f8742g = false;
        this.f8741f = false;
        s();
    }

    @l0
    public void z() {
        this.f8740e = false;
        t();
    }
}
