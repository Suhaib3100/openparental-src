package androidx.loader.app;

import android.os.Bundle;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.loader.content.c;
import androidx.view.InterfaceC1423e0;
import androidx.view.o1;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager.java */
/* loaded from: classes3.dex */
public abstract class a {

    /* compiled from: LoaderManager.java */
    /* renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC0505a<D> {
        @o0
        @l0
        c<D> onCreateLoader(int i4, @q0 Bundle bundle);

        @l0
        void onLoadFinished(@o0 c<D> cVar, D d5);

        @l0
        void onLoaderReset(@o0 c<D> cVar);
    }

    public static void c(boolean z4) {
        b.f30498d = z4;
    }

    @o0
    public static <T extends InterfaceC1423e0 & o1> a d(@o0 T t4) {
        return new b(t4, t4.getViewModelStore());
    }

    @l0
    public abstract void a(int i4);

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @q0
    public abstract <D> c<D> e(int i4);

    public boolean f() {
        return false;
    }

    @o0
    @l0
    public abstract <D> c<D> g(int i4, @q0 Bundle bundle, @o0 InterfaceC0505a<D> interfaceC0505a);

    public abstract void h();

    @o0
    @l0
    public abstract <D> c<D> i(int i4, @q0 Bundle bundle, @o0 InterfaceC0505a<D> interfaceC0505a);
}
