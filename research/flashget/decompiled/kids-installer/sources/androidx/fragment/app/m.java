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
import androidx.annotation.q0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentHostCallback.java */
/* loaded from: classes3.dex */
public abstract class m<E> extends j {

    /* renamed from: o, reason: collision with root package name */
    @q0
    private final Activity f8320o;

    /* renamed from: p, reason: collision with root package name */
    @androidx.annotation.o0
    private final Context f8321p;

    /* renamed from: q, reason: collision with root package name */
    @androidx.annotation.o0
    private final Handler f8322q;

    /* renamed from: r, reason: collision with root package name */
    private final int f8323r;

    /* renamed from: s, reason: collision with root package name */
    final FragmentManager f8324s;

    public m(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Handler handler, int i5) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i5);
    }

    public void B(@androidx.annotation.o0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i5, @q0 Bundle bundle) {
        if (i5 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.d.t(this.f8321p, intent, bundle);
    }

    @Deprecated
    public void G(@androidx.annotation.o0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i5, @q0 Intent intent, int i6, int i7, int i8, @q0 Bundle bundle) throws IntentSender.SendIntentException {
        if (i5 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.b.O(this.f8320o, intentSender, i5, intent, i6, i7, i8, bundle);
    }

    public void H() {
    }

    @Override // androidx.fragment.app.j
    @q0
    public View d(int i5) {
        return null;
    }

    @Override // androidx.fragment.app.j
    public boolean f() {
        return true;
    }

    @q0
    Activity i() {
        return this.f8320o;
    }

    @androidx.annotation.o0
    Context j() {
        return this.f8321p;
    }

    @c1({c1.a.LIBRARY})
    @androidx.annotation.o0
    public Handler k() {
        return this.f8322q;
    }

    public void l(@androidx.annotation.o0 String str, @q0 FileDescriptor fileDescriptor, @androidx.annotation.o0 PrintWriter printWriter, @q0 String[] strArr) {
    }

    @q0
    public abstract E o();

    @androidx.annotation.o0
    public LayoutInflater p() {
        return LayoutInflater.from(this.f8321p);
    }

    public int t() {
        return this.f8323r;
    }

    public boolean u() {
        return true;
    }

    @Deprecated
    public void v(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 String[] strArr, int i5) {
    }

    public boolean x(@androidx.annotation.o0 Fragment fragment) {
        return true;
    }

    public boolean y(@androidx.annotation.o0 String str) {
        return false;
    }

    public void z(@androidx.annotation.o0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i5) {
        B(fragment, intent, i5, null);
    }

    m(@androidx.annotation.o0 FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    m(@q0 Activity activity, @androidx.annotation.o0 Context context, @androidx.annotation.o0 Handler handler, int i5) {
        this.f8324s = new u();
        this.f8320o = activity;
        this.f8321p = (Context) androidx.core.util.q.m(context, "context == null");
        this.f8322q = (Handler) androidx.core.util.q.m(handler, "handler == null");
        this.f8323r = i5;
    }
}
