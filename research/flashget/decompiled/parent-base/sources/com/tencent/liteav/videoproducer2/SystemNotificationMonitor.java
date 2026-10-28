package com.tencent.liteav.videoproducer2;

import android.os.Looper;
import android.view.OrientationEventListener;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.k;
import com.tencent.liteav.base.util.r;
import com.tencent.liteav.videobase.videobase.SystemDisplayInfo;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class SystemNotificationMonitor extends OrientationEventListener implements r.a {
    private static final int SENSOR_ROTATION_DETECTION_THRESHOLD = 30;
    private k mDisplayRotation;
    private int mLastOrientation;
    private volatile long mListenerPtr;
    private k mSensorRotation;
    private volatile r mTimer;

    /* renamed from: com.tencent.liteav.videoproducer2.SystemNotificationMonitor$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f72650a;

        static {
            int[] iArr = new int[k.values().length];
            f72650a = iArr;
            try {
                iArr[k.f71940b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72650a[k.f71941c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72650a[k.f71942d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72650a[k.f71939a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public SystemNotificationMonitor() {
        super(ContextUtils.getApplicationContext());
        this.mLastOrientation = -1;
        this.mTimer = null;
        this.mListenerPtr = 0L;
        this.mSensorRotation = null;
        this.mDisplayRotation = null;
    }

    private k getSensorRotationByDisplayRotation(k kVar) {
        if (kVar == null) {
            return k.f71939a;
        }
        int i4 = AnonymousClass1.f72650a[kVar.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? k.f71939a : k.f71940b : k.f71941c : k.f71942d;
    }

    private k getSensorRotationCorrection() {
        if (this.mListenerPtr == 0) {
            return null;
        }
        int nativeGetGravitySensorRotationCorrection = nativeGetGravitySensorRotationCorrection(this.mListenerPtr);
        if (k.b(nativeGetGravitySensorRotationCorrection)) {
            return k.a(nativeGetGravitySensorRotationCorrection);
        }
        return null;
    }

    private static native synchronized int nativeGetGravitySensorRotationCorrection(long j4);

    private static native void nativeSensorChanged(long j4, int i4, int i5);

    private synchronized void notifyOrientationChanged() {
        int i4;
        try {
            if (this.mListenerPtr == 0) {
                return;
            }
            if (getSensorRotationCorrection() != null) {
                i4 = getSensorRotationCorrection().mValue;
            } else {
                k kVar = this.mSensorRotation;
                i4 = kVar != null ? kVar.mValue : 0;
            }
            k kVar2 = this.mDisplayRotation;
            nativeSensorChanged(this.mListenerPtr, i4, kVar2 != null ? kVar2.mValue : 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void initialize(long j4) {
        this.mListenerPtr = j4;
        if (this.mTimer != null) {
            return;
        }
        super.enable();
        this.mTimer = new r(Looper.getMainLooper(), this);
        this.mTimer.a(200);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onOrientationChanged(int r3) {
        /*
            r2 = this;
            r0 = -1
            if (r3 != r0) goto L4
            return
        L4:
            int r1 = r2.mLastOrientation
            if (r1 == r0) goto L13
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            r1 = 30
            if (r0 > r1) goto L13
            return
        L13:
            r2.mLastOrientation = r3
            r0 = 45
            if (r3 <= r0) goto L2e
            r0 = 135(0x87, float:1.89E-43)
            if (r3 > r0) goto L20
            com.tencent.liteav.base.util.k r3 = com.tencent.liteav.base.util.k.f71940b
            goto L30
        L20:
            r0 = 225(0xe1, float:3.15E-43)
            if (r3 > r0) goto L27
            com.tencent.liteav.base.util.k r3 = com.tencent.liteav.base.util.k.f71941c
            goto L30
        L27:
            r0 = 315(0x13b, float:4.41E-43)
            if (r3 > r0) goto L2e
            com.tencent.liteav.base.util.k r3 = com.tencent.liteav.base.util.k.f71942d
            goto L30
        L2e:
            com.tencent.liteav.base.util.k r3 = com.tencent.liteav.base.util.k.f71939a
        L30:
            com.tencent.liteav.base.util.k r0 = r2.mSensorRotation
            if (r0 == r3) goto L43
            r2.mSensorRotation = r3
            int r3 = com.tencent.liteav.videobase.videobase.SystemDisplayInfo.getDisplayRotationDegree()
            com.tencent.liteav.base.util.k r3 = com.tencent.liteav.base.util.k.a(r3)
            r2.mDisplayRotation = r3
            r2.notifyOrientationChanged()
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer2.SystemNotificationMonitor.onOrientationChanged(int):void");
    }

    @Override // com.tencent.liteav.base.util.r.a
    public void onTimeout() {
        k a5 = k.a(SystemDisplayInfo.getDisplayRotationDegree());
        if (this.mDisplayRotation == a5) {
            return;
        }
        this.mDisplayRotation = a5;
        if (this.mSensorRotation == null) {
            this.mSensorRotation = getSensorRotationByDisplayRotation(a5);
        }
        notifyOrientationChanged();
    }

    public synchronized void uninitialize() {
        super.disable();
        this.mListenerPtr = 0L;
        if (this.mTimer != null) {
            this.mTimer.a();
            this.mTimer = null;
        }
    }
}
