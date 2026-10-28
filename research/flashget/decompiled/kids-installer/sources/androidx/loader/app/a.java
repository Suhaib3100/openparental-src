package androidx.loader.app;

import android.os.Bundle;
import android.view.a0;
import android.view.i1;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.loader.content.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager.java */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: LoaderManager.java */
    /* renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC0100a<D> {
        @l0
        void a(@o0 c<D> cVar, D d6);

        @o0
        @l0
        c<D> b(int i5, @q0 Bundle bundle);

        @l0
        void c(@o0 c<D> cVar);
    }

    public static void c(boolean z5) {
        b.f8705d = z5;
    }

    @o0
    public static <T extends a0 & i1> a d(@o0 T t5) {
        return new b(t5, t5.getViewModelStore());
    }

    @l0
    public abstract void a(int i5);

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @q0
    public abstract <D> c<D> e(int i5);

    public boolean f() {
        return false;
    }

    @o0
    @l0
    public abstract <D> c<D> g(int i5, @q0 Bundle bundle, @o0 InterfaceC0100a<D> interfaceC0100a);

    public abstract void h();

    @o0
    @l0
    public abstract <D> c<D> i(int i5, @q0 Bundle bundle, @o0 InterfaceC0100a<D> interfaceC0100a);
}
