package com.tencent.rtmp.video.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.rtmp.video.BaseBridge;
import com.tencent.rtmp.video.ScreenCaptureService;
import com.tencent.rtmp.video.TXScreenCapture;
import com.tencent.rtmp.video.VirtualDisplayListener;
import com.tencent.rtmp.video.VirtualDisplayWrapper;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    MediaProjection f72739e;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f72735a = null;

    /* renamed from: d, reason: collision with root package name */
    final Map<Surface, a> f72738d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    boolean f72740f = false;

    /* renamed from: g, reason: collision with root package name */
    final Runnable f72741g = g.a(this);

    /* renamed from: h, reason: collision with root package name */
    final Runnable f72742h = h.a(this);

    /* renamed from: i, reason: collision with root package name */
    final MediaProjection.Callback f72743i = new AnonymousClass1();

    /* renamed from: b, reason: collision with root package name */
    final Handler f72736b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.rtmp.video.a.a f72737c = new com.tencent.rtmp.video.a.a();

    /* renamed from: com.tencent.rtmp.video.a.f$1, reason: invalid class name */
    final class AnonymousClass1 extends MediaProjection.Callback {
        AnonymousClass1() {
        }

        static /* synthetic */ void a(f fVar) {
            HashMap hashMap = new HashMap(fVar.f72738d);
            fVar.f72738d.clear();
            for (a aVar : hashMap.values()) {
                VirtualDisplayListener virtualDisplayListener = aVar.f72748d;
                if (virtualDisplayListener != null) {
                    if (aVar.f72749e != null) {
                        virtualDisplayListener.onCaptureError();
                    } else {
                        virtualDisplayListener.onStartFinish(false, false);
                    }
                }
            }
            fVar.c();
        }

        @Override // android.media.projection.MediaProjection.Callback
        public final void onStop() {
            BaseBridge.printLog(ProtectedSandApp.s("居\u0001"), ProtectedSandApp.s("屆\u0001"));
            f fVar = f.this;
            fVar.f72737c.a(m.a(fVar));
        }
    }

    static class a {

        /* renamed from: a, reason: collision with root package name */
        public Surface f72745a;

        /* renamed from: b, reason: collision with root package name */
        public int f72746b;

        /* renamed from: c, reason: collision with root package name */
        public int f72747c;

        /* renamed from: d, reason: collision with root package name */
        public VirtualDisplayListener f72748d;

        /* renamed from: e, reason: collision with root package name */
        public VirtualDisplayWrapper f72749e;

        private a() {
        }

        /* synthetic */ a(byte b5) {
            this();
        }
    }

    static void a() {
        Context appContext = BaseBridge.getAppContext();
        if (appContext == null) {
            BaseBridge.printLog(ProtectedSandApp.s("屇\u0001"), ProtectedSandApp.s("屈\u0001"));
            return;
        }
        Intent intent = new Intent(appContext, (Class<?>) TXScreenCapture.TXScreenCaptureAssistantActivity.class);
        intent.addFlags(ClientDefaults.MAX_MSG_SIZE);
        appContext.startActivity(intent);
    }

    static void d() {
        String s4 = ProtectedSandApp.s("屌\u0001");
        String s5 = ProtectedSandApp.s("屇\u0001");
        BaseBridge.printLog(s5, s4);
        try {
            Context appContext = BaseBridge.getAppContext();
            if (appContext == null) {
                BaseBridge.printLog(s5, ProtectedSandApp.s("屈\u0001"));
            } else {
                appContext.stopService(new Intent(appContext, (Class<?>) ScreenCaptureService.class));
            }
        } catch (Throwable unused) {
        }
    }

    final void b() {
        String s4 = ProtectedSandApp.s("屇\u0001");
        for (a aVar : this.f72738d.values()) {
            if (aVar.f72749e == null) {
                try {
                    aVar.f72749e = new VirtualDisplayWrapper(this.f72739e.createVirtualDisplay(ProtectedSandApp.s("屎\u0001"), aVar.f72746b, aVar.f72747c, 1, 1, aVar.f72745a, null, null));
                    BaseBridge.printLog(s4, ProtectedSandApp.s("屏\u0001") + aVar.f72749e);
                    VirtualDisplayListener virtualDisplayListener = aVar.f72748d;
                    if (virtualDisplayListener != null) {
                        virtualDisplayListener.onVirtualDisplayCreate(aVar.f72749e);
                        aVar.f72748d.onStartFinish(true, false);
                    }
                } catch (Throwable th) {
                    BaseBridge.printLog(s4, ProtectedSandApp.s("屐\u0001").concat(String.valueOf(th)));
                    VirtualDisplayListener virtualDisplayListener2 = aVar.f72748d;
                    if (virtualDisplayListener2 != null) {
                        virtualDisplayListener2.onStartFinish(false, false);
                    }
                }
            }
        }
    }

    final void c() {
        if (this.f72738d.isEmpty()) {
            String str = ProtectedSandApp.s("屑\u0001") + this.f72739e;
            String s4 = ProtectedSandApp.s("屇\u0001");
            BaseBridge.printLog(s4, str);
            if (this.f72739e != null) {
                b(null);
                try {
                    this.f72739e.unregisterCallback(this.f72743i);
                    this.f72739e.stop();
                } catch (Throwable th) {
                    BaseBridge.printLog(s4, ProtectedSandApp.s("屒\u0001").concat(String.valueOf(th)));
                }
                this.f72739e = null;
            }
            d();
        }
    }

    public final void a(MediaProjection mediaProjection) {
        this.f72737c.a(l.a(this, mediaProjection));
    }

    public final synchronized void a(Activity activity) {
        BaseBridge.printLog(ProtectedSandApp.s("屇\u0001"), ProtectedSandApp.s("屍\u0001").concat(String.valueOf(activity)));
        this.f72735a = new WeakReference<>(activity);
    }

    static void b(MediaProjection mediaProjection) {
        try {
            Class.forName(ProtectedSandApp.s("屉\u0001")).getMethod(ProtectedSandApp.s("届\u0001"), MediaProjection.class).invoke(null, mediaProjection);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
            BaseBridge.printLog(ProtectedSandApp.s("屇\u0001"), ProtectedSandApp.s("屋\u0001") + e4.getMessage());
        }
    }
}
