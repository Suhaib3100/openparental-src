package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.o0;
import com.bumptech.glide.manager.c;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: DefaultConnectivityMonitor.java */
/* loaded from: classes3.dex */
final class e implements c {

    /* renamed from: t, reason: collision with root package name */
    private static final String f11900t = ProtectedSandApp.s("ᶍ");

    /* renamed from: o, reason: collision with root package name */
    private final Context f11901o;

    /* renamed from: p, reason: collision with root package name */
    final c.a f11902p;

    /* renamed from: q, reason: collision with root package name */
    boolean f11903q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f11904r;

    /* renamed from: s, reason: collision with root package name */
    private final BroadcastReceiver f11905s = new a();

    /* compiled from: DefaultConnectivityMonitor.java */
    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@o0 Context context, Intent intent) {
            e eVar = e.this;
            boolean z5 = eVar.f11903q;
            eVar.f11903q = eVar.c(context);
            if (z5 != e.this.f11903q) {
                if (Log.isLoggable(ProtectedSandApp.s("ǫ"), 3)) {
                    boolean z6 = e.this.f11903q;
                }
                e eVar2 = e.this;
                eVar2.f11902p.a(eVar2.f11903q);
            }
        }
    }

    e(@o0 Context context, @o0 c.a aVar) {
        this.f11901o = context.getApplicationContext();
        this.f11902p = aVar;
    }

    private void d() {
        if (this.f11904r) {
            return;
        }
        this.f11903q = c(this.f11901o);
        try {
            this.f11901o.registerReceiver(this.f11905s, new IntentFilter(ProtectedSandApp.s("ᶉ")));
            this.f11904r = true;
        } catch (SecurityException unused) {
            Log.isLoggable(ProtectedSandApp.s("ᶊ"), 5);
        }
    }

    private void e() {
        if (this.f11904r) {
            this.f11901o.unregisterReceiver(this.f11905s);
            this.f11904r = false;
        }
    }

    @SuppressLint({"MissingPermission"})
    boolean c(@o0 Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) com.bumptech.glide.util.l.d((ConnectivityManager) context.getSystemService(ProtectedSandApp.s("ᶋ")))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException unused) {
            Log.isLoggable(ProtectedSandApp.s("ᶌ"), 5);
            return true;
        }
    }

    @Override // com.bumptech.glide.manager.m
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.m
    public void onStart() {
        d();
    }

    @Override // com.bumptech.glide.manager.m
    public void onStop() {
        e();
    }
}
