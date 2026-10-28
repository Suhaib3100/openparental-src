package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.c1;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentHostCallback.java */
/* loaded from: classes3.dex */
public abstract class o<E> extends l {

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.q0
    private final Activity f30022b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.o0
    private final Context f30023c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.o0
    private final Handler f30024d;

    /* renamed from: e, reason: collision with root package name */
    private final int f30025e;

    /* renamed from: f, reason: collision with root package name */
    final FragmentManager f30026f;

    o(@androidx.annotation.q0 Activity activity, @androidx.annotation.o0 Context context, @androidx.annotation.o0 Handler handler, int i4) {
        this.f30026f = new z();
        this.f30022b = activity;
        this.f30023c = (Context) androidx.core.util.w.m(context, "context == null");
        this.f30024d = (Handler) androidx.core.util.w.m(handler, "handler == null");
        this.f30025e = i4;
    }

    @Override // androidx.fragment.app.l
    @androidx.annotation.q0
    public View c(int i4) {
        return null;
    }

    @Override // androidx.fragment.app.l
    public boolean d() {
        return true;
    }

    @androidx.annotation.q0
    Activity e() {
        return this.f30022b;
    }

    @androidx.annotation.o0
    Context f() {
        return this.f30023c;
    }

    @c1({c1.a.LIBRARY})
    @androidx.annotation.o0
    public Handler g() {
        return this.f30024d;
    }

    public void h(@androidx.annotation.o0 String str, @androidx.annotation.q0 FileDescriptor fileDescriptor, @androidx.annotation.o0 PrintWriter printWriter, @androidx.annotation.q0 String[] strArr) {
    }

    @androidx.annotation.q0
    public abstract E i();

    @androidx.annotation.o0
    public LayoutInflater j() {
        return LayoutInflater.from(this.f30023c);
    }

    public int k() {
        return this.f30025e;
    }

    public boolean l() {
        return true;
    }

    @Deprecated
    public void m(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 String[] strArr, int i4) {
    }

    public boolean n(@androidx.annotation.o0 Fragment fragment) {
        return true;
    }

    public boolean o(@androidx.annotation.o0 String str) {
        return false;
    }

    public void p(@androidx.annotation.o0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i4) {
        q(fragment, intent, i4, null);
    }

    public void q(@androidx.annotation.o0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i4, @androidx.annotation.q0 Bundle bundle) {
        if (i4 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.d.startActivity(this.f30023c, intent, bundle);
    }

    @Deprecated
    public void r(@androidx.annotation.o0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i4, @androidx.annotation.q0 Intent intent, int i5, int i6, int i7, @androidx.annotation.q0 Bundle bundle) throws IntentSender.SendIntentException {
        if (i4 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.b.t(this.f30022b, intentSender, i4, intent, i5, i6, i7, bundle);
    }

    public void s() {
    }

    public o(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Handler handler, int i4) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i4);
    }

    o(@androidx.annotation.o0 FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }
}
