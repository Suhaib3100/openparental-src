package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
public class FirebaseMessagingService extends EnhancedIntentService {

    /* renamed from: n, reason: collision with root package name */
    private static final int f59917n = 10;

    /* renamed from: i, reason: collision with root package name */
    private Rpc f59919i;

    /* renamed from: j, reason: collision with root package name */
    static final String f59913j = ProtectedSandApp.s("ŗ\u0001");

    /* renamed from: k, reason: collision with root package name */
    public static final String f59914k = ProtectedSandApp.s("Ř\u0001");

    /* renamed from: l, reason: collision with root package name */
    static final String f59915l = ProtectedSandApp.s("ř\u0001");

    /* renamed from: m, reason: collision with root package name */
    static final String f59916m = ProtectedSandApp.s("Ś\u0001");

    /* renamed from: o, reason: collision with root package name */
    private static final Queue<String> f59918o = new ArrayDeque(10);

    private boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = f59918o;
        if (queue.contains(str)) {
            Log.isLoggable(ProtectedSandApp.s("ś\u0001"), 3);
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove(ProtectedSandApp.s("Ŝ\u0001"));
        if (q0.v(extras)) {
            q0 q0Var = new q0(extras);
            ExecutorService f4 = o.f();
            try {
                if (new g(this, q0Var, f4).a()) {
                    return;
                }
                f4.shutdown();
                if (n0.E(intent)) {
                    n0.w(intent);
                }
            } finally {
                f4.shutdown();
            }
        }
        r(new RemoteMessage(extras));
    }

    private String n(Intent intent) {
        String stringExtra = intent.getStringExtra(ProtectedSandApp.s("ŝ\u0001"));
        return stringExtra == null ? intent.getStringExtra(ProtectedSandApp.s("Ş\u0001")) : stringExtra;
    }

    private Rpc o(Context context) {
        if (this.f59919i == null) {
            this.f59919i = new Rpc(context.getApplicationContext());
        }
        return this.f59919i;
    }

    private void p(Intent intent) {
        if (!l(intent.getStringExtra(ProtectedSandApp.s("ŝ\u0001")))) {
            v(intent);
        }
        o(this).messageHandled(new CloudMessage(intent));
    }

    private void v(Intent intent) {
        String s4 = ProtectedSandApp.s("ş\u0001");
        String stringExtra = intent.getStringExtra(ProtectedSandApp.s("Š\u0001"));
        if (stringExtra == null) {
            stringExtra = s4;
        }
        char c5 = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals(ProtectedSandApp.s("ţ\u0001"))) {
                    c5 = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals(s4)) {
                    c5 = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals(ProtectedSandApp.s("Ţ\u0001"))) {
                    c5 = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals(ProtectedSandApp.s("š\u0001"))) {
                    c5 = 3;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                q();
                break;
            case 1:
                n0.y(intent);
                m(intent);
                break;
            case 2:
                u(n(intent), new SendException(intent.getStringExtra(ProtectedSandApp.s("Ť\u0001"))));
                break;
            case 3:
                s(intent.getStringExtra(ProtectedSandApp.s("ŝ\u0001")));
                break;
        }
    }

    @androidx.annotation.m1
    static void w() {
        f59918o.clear();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    protected Intent e(Intent intent) {
        return c1.b().c();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void f(Intent intent) {
        String action = intent.getAction();
        if (ProtectedSandApp.s("ŗ\u0001").equals(action) || ProtectedSandApp.s("Ř\u0001").equals(action)) {
            p(intent);
        } else if (ProtectedSandApp.s("ř\u0001").equals(action)) {
            t(intent.getStringExtra(ProtectedSandApp.s("Ś\u0001")));
        } else {
            intent.getAction();
        }
    }

    @androidx.annotation.n1
    public void q() {
    }

    @androidx.annotation.n1
    public void r(@androidx.annotation.o0 RemoteMessage remoteMessage) {
    }

    @androidx.annotation.n1
    @Deprecated
    public void s(@androidx.annotation.o0 String str) {
    }

    @androidx.annotation.n1
    public void t(@androidx.annotation.o0 String str) {
    }

    @androidx.annotation.n1
    @Deprecated
    public void u(@androidx.annotation.o0 String str, @androidx.annotation.o0 Exception exc) {
    }

    @androidx.annotation.m1
    void x(Rpc rpc) {
        this.f59919i = rpc;
    }
}
