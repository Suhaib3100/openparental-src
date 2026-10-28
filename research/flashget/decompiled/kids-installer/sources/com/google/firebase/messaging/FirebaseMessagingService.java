package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class FirebaseMessagingService extends EnhancedIntentService {

    /* renamed from: z, reason: collision with root package name */
    private static final int f17044z = 10;

    /* renamed from: v, reason: collision with root package name */
    static final String f17040v = ProtectedSandApp.s("⫕");

    /* renamed from: w, reason: collision with root package name */
    public static final String f17041w = ProtectedSandApp.s("⫖");

    /* renamed from: x, reason: collision with root package name */
    static final String f17042x = ProtectedSandApp.s("⫗");

    /* renamed from: y, reason: collision with root package name */
    static final String f17043y = ProtectedSandApp.s("⫘");
    private static final Queue<String> A = new ArrayDeque(10);

    private boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = A;
        if (queue.contains(str)) {
            Log.isLoggable(ProtectedSandApp.s("⫙"), 3);
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
        extras.remove(ProtectedSandApp.s("⫚"));
        if (l0.v(extras)) {
            l0 l0Var = new l0(extras);
            ExecutorService f6 = o.f();
            try {
                if (new f(this, l0Var, f6).a()) {
                    return;
                }
                f6.shutdown();
                if (j0.E(intent)) {
                    j0.w(intent);
                }
            } finally {
                f6.shutdown();
            }
        }
        q(new RemoteMessage(extras));
    }

    private String n(Intent intent) {
        String stringExtra = intent.getStringExtra(ProtectedSandApp.s("⫛"));
        return stringExtra == null ? intent.getStringExtra(ProtectedSandApp.s("⫝̸")) : stringExtra;
    }

    private void o(Intent intent) {
        if (l(intent.getStringExtra(ProtectedSandApp.s("⫝")))) {
            return;
        }
        u(intent);
    }

    private void u(Intent intent) {
        String stringExtra = intent.getStringExtra(ProtectedSandApp.s("⫞"));
        String s5 = ProtectedSandApp.s("⫟");
        if (stringExtra == null) {
            stringExtra = s5;
        }
        char c6 = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals(ProtectedSandApp.s("⫢"))) {
                    c6 = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals(s5)) {
                    c6 = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals(ProtectedSandApp.s("⫡"))) {
                    c6 = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals(ProtectedSandApp.s("⫠"))) {
                    c6 = 3;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                p();
                break;
            case 1:
                j0.y(intent);
                m(intent);
                break;
            case 2:
                t(n(intent), new SendException(intent.getStringExtra(ProtectedSandApp.s("⫤"))));
                break;
            case 3:
                r(intent.getStringExtra(ProtectedSandApp.s("⫣")));
                break;
        }
    }

    @androidx.annotation.m1
    static void v() {
        A.clear();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    protected Intent e(Intent intent) {
        return w0.b().c();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void f(Intent intent) {
        String action = intent.getAction();
        if (ProtectedSandApp.s("⫥").equals(action) || ProtectedSandApp.s("⫦").equals(action)) {
            o(intent);
        } else if (ProtectedSandApp.s("⫧").equals(action)) {
            s(intent.getStringExtra(ProtectedSandApp.s("⫨")));
        } else {
            intent.getAction();
        }
    }

    @n1
    public void p() {
    }

    @n1
    public void q(@androidx.annotation.o0 RemoteMessage remoteMessage) {
    }

    @n1
    public void r(@androidx.annotation.o0 String str) {
    }

    @n1
    public void s(@androidx.annotation.o0 String str) {
    }

    @n1
    public void t(@androidx.annotation.o0 String str, @androidx.annotation.o0 Exception exc) {
    }
}
