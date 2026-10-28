package com.tencent.beacon.base.net.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.b1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NetworkStateReceiver.java */
/* loaded from: classes6.dex */
public final class e extends BroadcastReceiver implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final List<a> f71312a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f71313b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f71314c = true;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f71315d = false;

    /* compiled from: NetworkStateReceiver.java */
    public interface a {
        void a();

        void b();
    }

    public static void a(Context context, a aVar) {
        if (context == null) {
            com.tencent.beacon.base.util.c.b(ProtectedSandApp.s("ㅜ\u0001"), new Object[0]);
            return;
        }
        List<a> list = f71312a;
        synchronized (list) {
            try {
                if (!list.contains(aVar)) {
                    list.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f71313b) {
            return;
        }
        context.registerReceiver(new e(), new IntentFilter(ProtectedSandApp.s("ㅝ\u0001")));
        f71313b = true;
    }

    private void b() {
        List<a> list = f71312a;
        synchronized (list) {
            try {
                Iterator<a> it = list.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f71314c) {
            this.f71314c = false;
        } else {
            if (this.f71315d) {
                return;
            }
            com.tencent.beacon.a.b.b.a().a(this);
        }
    }

    @Override // java.lang.Runnable
    @b1("android.permission.ACCESS_NETWORK_STATE")
    public void run() {
        this.f71315d = true;
        if (d.d()) {
            com.tencent.beacon.base.util.c.d(ProtectedSandApp.s("ㅞ\u0001"), new Object[0]);
            a();
        } else {
            com.tencent.beacon.base.util.c.d(ProtectedSandApp.s("ㅟ\u0001"), new Object[0]);
            b();
        }
        this.f71315d = false;
    }

    private void a() {
        List<a> list = f71312a;
        synchronized (list) {
            try {
                Iterator<a> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
