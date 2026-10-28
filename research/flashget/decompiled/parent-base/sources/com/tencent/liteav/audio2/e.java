package com.tencent.liteav.audio2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Process;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.audio2.c;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class e extends PhoneStateListener implements c.a {

    /* renamed from: c, reason: collision with root package name */
    static c f71750c;

    /* renamed from: d, reason: collision with root package name */
    Class<?> f71753d;

    /* renamed from: e, reason: collision with root package name */
    Object f71754e;

    /* renamed from: h, reason: collision with root package name */
    private b f71757h;

    /* renamed from: g, reason: collision with root package name */
    int f71756g = 0;

    /* renamed from: i, reason: collision with root package name */
    private boolean f71758i = false;

    /* renamed from: a, reason: collision with root package name */
    TelephonyManager f71751a = (TelephonyManager) ContextUtils.getApplicationContext().getSystemService(ProtectedSandApp.s("冻\u0001"));

    /* renamed from: b, reason: collision with root package name */
    AudioManager f71752b = (AudioManager) ContextUtils.getApplicationContext().getSystemService(ProtectedSandApp.s("冼\u0001"));

    /* renamed from: f, reason: collision with root package name */
    com.tencent.liteav.base.util.l f71755f = new com.tencent.liteav.base.util.l(ProtectedSandApp.s("冽\u0001"));

    static class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<e> f71759a;

        a(e eVar) {
            this.f71759a = new WeakReference<>(eVar);
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            b bVar;
            try {
                if (ProtectedSandApp.s("冸\u0001").equals(method.getName())) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    e eVar = this.f71759a.get();
                    if (eVar != null && (bVar = eVar.f71757h) != null) {
                        if (intValue == 2) {
                            eVar.f71758i = true;
                            bVar.onInterruptedByPhoneCall();
                        } else if (eVar.f71758i) {
                            eVar.f71758i = false;
                            bVar.onResumedByPhoneCall();
                        }
                    }
                }
            } catch (Throwable th) {
                Log.e(ProtectedSandApp.s("冺\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("冹\u0001"))), new Object[0]);
            }
            return obj;
        }
    }

    public interface b {
        void onInterruptedByPhoneCall();

        void onResumedByPhoneCall();
    }

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            f71750c = new c();
        }
    }

    public e(b bVar) {
        this.f71757h = bVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i4, String str) {
        b bVar = this.f71757h;
        if (bVar == null || this.f71756g == i4) {
            return;
        }
        this.f71756g = i4;
        if (i4 == 2) {
            bVar.onInterruptedByPhoneCall();
        } else if (i4 == 0) {
            bVar.onResumedByPhoneCall();
        }
    }

    static boolean b() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return false;
        }
        try {
            return applicationContext.checkPermission(ProtectedSandApp.s("冾\u0001"), Process.myPid(), Process.myUid()) == 0;
        } catch (Throwable th) {
            Log.e(ProtectedSandApp.s("冽\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("冿\u0001"))), new Object[0]);
            return true;
        }
    }

    static void c() {
        if (Build.VERSION.SDK_INT >= 26 && f71750c != null) {
            Log.i(ProtectedSandApp.s("冽\u0001"), ProtectedSandApp.s("净\u0001"), new Object[0]);
            f71750c.f71748a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        b bVar = this.f71757h;
        if (bVar == null) {
            return;
        }
        try {
            if (this.f71752b.getMode() == 2) {
                this.f71758i = true;
                bVar.onInterruptedByPhoneCall();
            } else if (this.f71758i) {
                this.f71758i = false;
                bVar.onResumedByPhoneCall();
            }
        } catch (Throwable th) {
            Log.e(ProtectedSandApp.s("冽\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("凁\u0001"))), new Object[0]);
        }
    }

    @Override // com.tencent.liteav.audio2.c.a
    public final void a() {
        this.f71755f.a(g.a(this), 500L);
    }
}
