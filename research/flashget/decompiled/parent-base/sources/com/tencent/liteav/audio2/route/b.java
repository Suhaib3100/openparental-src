package com.tencent.liteav.audio2.route;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.media.AudioManager;
import android.os.Process;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.util.List;

/* loaded from: classes7.dex */
public final class b implements BluetoothProfile.ServiceListener {

    /* renamed from: a, reason: collision with root package name */
    final BluetoothAdapter f71769a;

    /* renamed from: b, reason: collision with root package name */
    BluetoothProfile f71770b = null;

    /* renamed from: c, reason: collision with root package name */
    final Object f71771c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Context f71772d;

    /* renamed from: e, reason: collision with root package name */
    private AudioManager f71773e;

    public b(Context context) {
        this.f71772d = context;
        BluetoothAdapter c5 = c();
        this.f71769a = c5;
        String s4 = ProtectedSandApp.s("刨\u0001");
        if (c5 != null) {
            try {
                c5.getProfileProxy(context, this, 1);
            } catch (Throwable th) {
                Log.w(s4, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("利\u0001"))), new Object[0]);
            }
        } else {
            Log.i(s4, ProtectedSandApp.s("刪\u0001"), new Object[0]);
        }
        this.f71773e = (AudioManager) this.f71772d.getSystemService(ProtectedSandApp.s("别\u0001"));
    }

    private static BluetoothAdapter c() {
        try {
            return BluetoothAdapter.getDefaultAdapter();
        } catch (Throwable th) {
            Log.w(ProtectedSandApp.s("刨\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("刮\u0001"))), new Object[0]);
            return null;
        }
    }

    private List<BluetoothDevice> d() {
        try {
            return this.f71770b.getConnectedDevices();
        } catch (Throwable th) {
            Log.w(ProtectedSandApp.s("刨\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("刯\u0001"))), new Object[0]);
            return null;
        }
    }

    private boolean e() {
        try {
            return this.f71769a.isEnabled();
        } catch (Throwable th) {
            Log.w(ProtectedSandApp.s("刨\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("到\u0001"))), new Object[0]);
            return false;
        }
    }

    private boolean f() {
        try {
            return ((Integer) BluetoothAdapter.class.getMethod(ProtectedSandApp.s("刱\u0001"), null).invoke(this.f71769a, null)).intValue() == 10;
        } catch (Throwable th) {
            Log.w(ProtectedSandApp.s("刨\u0001"), ProtectedSandApp.s("刲\u0001").concat(String.valueOf(th)), new Object[0]);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
    
        if (r2.size() > 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.audio2.route.b.a():boolean");
    }

    final void b() {
        try {
            this.f71769a.closeProfileProxy(1, this.f71770b);
        } catch (Throwable th) {
            Log.w(ProtectedSandApp.s("刨\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("刺\u0001"))), new Object[0]);
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i4, BluetoothProfile bluetoothProfile) {
        BluetoothProfile bluetoothProfile2;
        if (i4 != 1) {
            return;
        }
        synchronized (this.f71771c) {
            try {
                if (this.f71769a != null && (bluetoothProfile2 = this.f71770b) != null) {
                    Log.i(ProtectedSandApp.s("刨\u0001"), ProtectedSandApp.s("刻\u0001"), bluetoothProfile2, bluetoothProfile);
                    b();
                }
                this.f71770b = bluetoothProfile;
                this.f71771c.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i4) {
        if (i4 != 1) {
            return;
        }
        synchronized (this.f71771c) {
            try {
                if (this.f71769a != null && this.f71770b != null) {
                    b();
                    this.f71770b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean a(Context context) {
        if (context == null || LiteavSystemInfo.getSystemOSVersionInt() < 31) {
            return true;
        }
        try {
            return context.checkPermission(ProtectedSandApp.s("刬\u0001"), Process.myPid(), Process.myUid()) == 0;
        } catch (Throwable th) {
            Log.w(ProtectedSandApp.s("刨\u0001"), androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("刭\u0001"))), new Object[0]);
            return true;
        }
    }
}
