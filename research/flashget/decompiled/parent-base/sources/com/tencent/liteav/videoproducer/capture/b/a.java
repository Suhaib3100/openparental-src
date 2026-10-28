package com.tencent.liteav.videoproducer.capture.b;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Range;
import android.util.Rational;
import android.view.Surface;
import androidx.collection.s;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.g;
import com.tencent.liteav.base.util.k;
import com.tencent.liteav.base.util.q;
import com.tencent.liteav.videobase.common.f;
import com.tencent.liteav.videoproducer.capture.CameraControllerInterface;
import com.tencent.liteav.videoproducer.capture.CameraEventCallback;
import com.tencent.liteav.videoproducer.capture.FaceRect;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class a extends CameraControllerInterface {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f72525c;
    private CountDownLatch A;
    private CameraEventCallback B;
    private Rect H;

    /* renamed from: g, reason: collision with root package name */
    private final q f72530g;

    /* renamed from: l, reason: collision with root package name */
    private CaptureRequest f72535l;

    /* renamed from: m, reason: collision with root package name */
    private CaptureRequest.Builder f72536m;

    /* renamed from: n, reason: collision with root package name */
    private Size f72537n;

    /* renamed from: s, reason: collision with root package name */
    private SurfaceTexture f72542s;

    /* renamed from: z, reason: collision with root package name */
    private CountDownLatch f72549z;

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap<String, CameraCharacteristics> f72524b = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static String f72526d = "";

    /* renamed from: e, reason: collision with root package name */
    private static String f72527e = "";

    /* renamed from: f, reason: collision with root package name */
    private final Handler f72529f = new Handler(Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f72531h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference<CameraDevice> f72532i = new AtomicReference<>();

    /* renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f72533j = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    private final AtomicReference<CameraCaptureSession> f72534k = new AtomicReference<>();

    /* renamed from: o, reason: collision with root package name */
    private k f72538o = k.f71939a;

    /* renamed from: p, reason: collision with root package name */
    private k f72539p = null;

    /* renamed from: q, reason: collision with root package name */
    private boolean f72540q = false;

    /* renamed from: r, reason: collision with root package name */
    private int f72541r = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f72543t = true;

    /* renamed from: u, reason: collision with root package name */
    private boolean f72544u = true;

    /* renamed from: v, reason: collision with root package name */
    private boolean f72545v = true;

    /* renamed from: w, reason: collision with root package name */
    private int f72546w = -1;

    /* renamed from: x, reason: collision with root package name */
    private EnumC1004a f72547x = EnumC1004a.f72554a;

    /* renamed from: y, reason: collision with root package name */
    private boolean f72548y = false;

    /* renamed from: a, reason: collision with root package name */
    public boolean f72528a = false;
    private float C = 0.0f;
    private float D = 0.0f;
    private float E = 1.0f;
    private boolean F = false;
    private boolean G = false;
    private com.tencent.liteav.videoproducer.capture.b I = new com.tencent.liteav.videoproducer.capture.b();
    private int J = 0;
    private final CameraDevice.StateCallback K = new CameraDevice.StateCallback() { // from class: com.tencent.liteav.videoproducer.capture.b.a.1
        private void a(CameraDevice cameraDevice, int i4) {
            if (a.this.f72531h.get()) {
                a.b(a.this, i4);
            } else {
                a.this.a(false, cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            LiteavLog.i(ProtectedSandApp.s("嚽\u0001"), ProtectedSandApp.s("嚼\u0001") + a(cameraDevice));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            LiteavLog.e(ProtectedSandApp.s("嚽\u0001"), ProtectedSandApp.s("嚾\u0001") + a(cameraDevice));
            a(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i4) {
            LiteavLog.e(ProtectedSandApp.s("嚽\u0001"), ProtectedSandApp.s("嚿\u0001") + a(cameraDevice) + ProtectedSandApp.s("囀\u0001") + i4);
            int i5 = 3;
            if (i4 == 3) {
                i5 = 2;
            } else if (i4 == 1) {
                i5 = 1;
            } else if (i4 != 5) {
                i5 = 4;
                if (i4 != 4) {
                    i5 = 0;
                }
            }
            a(cameraDevice, i5);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            LiteavLog.i(ProtectedSandApp.s("嚽\u0001"), ProtectedSandApp.s("囁\u0001") + a(cameraDevice));
            a.this.a(true, cameraDevice);
        }

        private static String a(CameraDevice cameraDevice) {
            if (cameraDevice == null) {
                return ProtectedSandApp.s("嚹\u0001");
            }
            return ProtectedSandApp.s("嚺\u0001") + cameraDevice.getId() + ProtectedSandApp.s("嚻\u0001");
        }
    };
    private final CameraCaptureSession.StateCallback L = new CameraCaptureSession.StateCallback() { // from class: com.tencent.liteav.videoproducer.capture.b.a.2
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            LiteavLog.e(ProtectedSandApp.s("囂\u0001"), ProtectedSandApp.s("囃\u0001"));
            a.this.a(false, cameraCaptureSession);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            LiteavLog.i(ProtectedSandApp.s("囂\u0001"), ProtectedSandApp.s("囄\u0001"));
            a.this.a(true, cameraCaptureSession);
        }
    };
    private final CameraManager.AvailabilityCallback M = new CameraManager.AvailabilityCallback() { // from class: com.tencent.liteav.videoproducer.capture.b.a.3
        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAccessPrioritiesChanged() {
            super.onCameraAccessPrioritiesChanged();
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            super.onCameraAvailable(str);
            String concat = ProtectedSandApp.s("囅\u0001").concat(String.valueOf(str));
            String s4 = ProtectedSandApp.s("囆\u0001");
            LiteavLog.i(s4, concat);
            if (!a.this.g() && a.b(a.this.f72543t).equals(str) && a.this.f72531h.get()) {
                LiteavLog.w(s4, ProtectedSandApp.s("囇\u0001"));
                a aVar = a.this;
                aVar.a(false, (CameraDevice) aVar.f72532i.get());
                a.b(a.this, 1);
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(String str) {
            super.onCameraUnavailable(str);
            LiteavLog.i(ProtectedSandApp.s("囆\u0001"), ProtectedSandApp.s("囈\u0001").concat(String.valueOf(str)));
        }
    };
    private final CameraCaptureSession.CaptureCallback N = new AnonymousClass4();

    /* renamed from: com.tencent.liteav.videoproducer.capture.b.a$a, reason: collision with other inner class name */
    enum EnumC1004a {
        f72554a,
        f72555b
    }

    public a(q qVar) {
        this.f72530g = qVar;
    }

    static /* synthetic */ boolean j(a aVar) {
        aVar.f72548y = false;
        return false;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableCameraDynamicFps(boolean z4) {
        this.f72540q = z4;
        LiteavLog.i(ProtectedSandApp.s("囏\u0001"), ProtectedSandApp.s("园\u0001").concat(String.valueOf(z4)));
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableFaceDetection(boolean z4) {
        this.F = z4;
        LiteavLog.i(ProtectedSandApp.s("囏\u0001"), ProtectedSandApp.s("囮\u0001").concat(String.valueOf(z4)));
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableTapToFocus(boolean z4) {
        this.f72544u = z4;
        if (this.f72548y) {
            return;
        }
        c(z4);
        d();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final FaceRect getCameraFaceRect() {
        return this.I.a();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final k getCameraSystemRotation() {
        return this.f72538o;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getCameraSystemRotationValue() {
        return this.f72538o.mValue;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getCurrentCameraISO() {
        return this.J;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final float getExposureCompensationStep() {
        CameraCharacteristics a5 = a();
        String s4 = ProtectedSandApp.s("囏\u0001");
        if (a5 == null) {
            LiteavLog.e(s4, ProtectedSandApp.s("囯\u0001") + this.f72547x);
            return 0.0f;
        }
        Rational rational = (Rational) a().get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        if (rational != null) {
            return rational.floatValue();
        }
        LiteavLog.e(s4, ProtectedSandApp.s("困\u0001"));
        return 0.0f;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getMaxZoom() {
        return Math.round(this.E);
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final Size getPreviewSize() {
        return this.f72537n;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCameraAutoFocusFaceModeSupported() {
        return a() != null && ((Integer) a().get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT)).intValue() > 0;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCameraFocusPositionInPreviewSupported() {
        return a() != null && ((Integer) a().get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCurrentPreviewSizeAspectRatioMatch(int i4, int i5, boolean z4) {
        k kVar = this.f72539p;
        if (kVar == null) {
            kVar = this.f72538o;
        }
        Size a5 = com.tencent.liteav.videoproducer.capture.c.a(f(), kVar, i4, i5);
        int i6 = a5.width;
        Size size = this.f72537n;
        boolean z5 = i6 <= size.width && a5.height <= size.height;
        if (a(a5) != a(this.f72537n)) {
            z5 = false;
        }
        boolean z6 = (!z4 || Math.abs(a5.aspectRatio() - this.f72537n.aspectRatio()) <= 0.001d) ? z5 : false;
        LiteavLog.i(ProtectedSandApp.s("囏\u0001"), ProtectedSandApp.s("囱\u0001").concat(String.valueOf(z6)));
        return z6;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isTorchSupported() {
        return a() != null && ((Boolean) a().get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isZoomSupported() {
        return a() != null && this.E > 0.0f;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setCameraRotationCorrectionValue(int i4) {
        this.f72539p = k.b(i4) ? k.a(i4) : null;
        LiteavLog.i(ProtectedSandApp.s("囏\u0001"), ProtectedSandApp.s("囲\u0001") + this.f72539p);
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setExposureCompensation(int i4) {
        CaptureRequest.Builder builder = this.f72536m;
        String s4 = ProtectedSandApp.s("囏\u0001");
        if (builder == null || a() == null) {
            StringBuilder a5 = s.a(ProtectedSandApp.s("団\u0001"), i4, ProtectedSandApp.s("囤\u0001"));
            a5.append(this.f72547x);
            LiteavLog.e(s4, a5.toString());
        } else if (((Integer) ((Range) a().get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)).getUpper()).intValue() <= 0) {
            LiteavLog.i(s4, ProtectedSandApp.s("团\u0001"));
        } else {
            this.f72536m.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(i4));
            d();
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setExposureCompensationNormalization(float f4) {
        this.C = f4;
        b(f4);
        d();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setFaceAEStrategy(int i4) {
        this.f72541r = i4;
        LiteavLog.i(ProtectedSandApp.s("囏\u0001"), ProtectedSandApp.s("図\u0001") + this.f72541r);
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setZoom(float f4) {
        this.D = f4;
        a(f4);
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startAutoFocusAtPosition(int r25, int r26) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.capture.b.a.startAutoFocusAtPosition(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014c  */
    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean startCapture(com.tencent.liteav.videoproducer.capture.CameraCaptureParams r18, android.graphics.SurfaceTexture r19, com.tencent.liteav.videoproducer.capture.CameraEventCallback r20) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.capture.b.a.startCapture(com.tencent.liteav.videoproducer.capture.CameraCaptureParams, android.graphics.SurfaceTexture, com.tencent.liteav.videoproducer.capture.CameraEventCallback):boolean");
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void stopCapture() {
        CountDownLatch countDownLatch = this.f72549z;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        this.f72549z = null;
        CountDownLatch countDownLatch2 = this.A;
        if (countDownLatch2 != null) {
            countDownLatch2.countDown();
        }
        this.A = null;
        boolean z4 = this.G;
        String s4 = ProtectedSandApp.s("囏\u0001");
        if (z4) {
            try {
                this.f72536m.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 0);
                this.G = false;
            } catch (Throwable th) {
                f.a(th, ProtectedSandApp.s("圏\u0001"), s4);
            }
        }
        b();
        c();
        this.f72535l = null;
        this.f72528a = false;
        this.f72531h.set(false);
        this.f72542s = null;
        this.f72546w = -1;
        this.f72547x = EnumC1004a.f72554a;
        this.I.b();
        LiteavLog.i(s4, ProtectedSandApp.s("圐\u0001"));
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void turnOnTorch(boolean z4) {
        boolean g4 = g();
        String s4 = ProtectedSandApp.s("囏\u0001");
        if (g4) {
            LiteavLog.e(s4, ProtectedSandApp.s("圑\u0001") + this.f72547x);
            return;
        }
        boolean z5 = true;
        if (z4 && this.f72546w != 2) {
            this.f72546w = 2;
        } else if (z4) {
            z5 = false;
        } else {
            this.f72546w = 0;
        }
        LiteavLog.i(s4, ProtectedSandApp.s("園\u0001") + z4 + ProtectedSandApp.s("圓\u0001") + this.f72546w + ProtectedSandApp.s("圔\u0001") + z5);
        if (z5) {
            this.f72536m.set(CaptureRequest.FLASH_MODE, Integer.valueOf(this.f72546w));
            d();
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.capture.b.a$4, reason: invalid class name */
    final class AnonymousClass4 extends CameraCaptureSession.CaptureCallback {
        AnonymousClass4() {
        }

        private static boolean a(CaptureRequest captureRequest) {
            return (captureRequest.getTag() instanceof a) && !((a) captureRequest.getTag()).f72528a;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            a.this.f72530g.a(c.a(this, totalCaptureResult, captureRequest));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            LiteavLog.e(ProtectedSandApp.s("囊\u0001"), ProtectedSandApp.s("囌\u0001") + captureFailure.getReason());
            a.this.f72530g.a(d.a(this, captureRequest));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }

        private void a(CaptureRequest captureRequest, boolean z4) {
            if (a.this.g()) {
                return;
            }
            a.j(a.this);
            try {
                a.this.f72536m.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                a.this.f72536m.set(CaptureRequest.CONTROL_AE_MODE, 1);
                a.this.f72536m.set(CaptureRequest.CONTROL_AF_MODE, 3);
                a.this.d();
                if (captureRequest.getTag() instanceof a) {
                    a.a((a) captureRequest.getTag(), z4);
                }
            } catch (Throwable th) {
                f.a(th, ProtectedSandApp.s("囉\u0001"), ProtectedSandApp.s("囊\u0001"));
            }
        }

        static /* synthetic */ void a(AnonymousClass4 anonymousClass4, CaptureRequest captureRequest) {
            if (!a(captureRequest)) {
                a.j(a.this);
            } else {
                anonymousClass4.a(captureRequest, false);
            }
        }

        static /* synthetic */ void a(AnonymousClass4 anonymousClass4, TotalCaptureResult totalCaptureResult, CaptureRequest captureRequest) {
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.SENSOR_SENSITIVITY);
            a.this.J = num != null ? num.intValue() : 0;
            if (a.this.F && a.this.G) {
                Face[] faceArr = (Face[]) totalCaptureResult.get(CaptureResult.STATISTICS_FACES);
                ArrayList arrayList = new ArrayList();
                for (Face face : faceArr) {
                    arrayList.add(face.getBounds());
                }
                com.tencent.liteav.videoproducer.capture.b bVar = a.this.I;
                Rect rect = a.this.H;
                a aVar = a.this;
                bVar.a(arrayList, rect, aVar.c(aVar.D));
            }
            if (!a(captureRequest)) {
                a.j(a.this);
                return;
            }
            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num2 == null) {
                LiteavLog.e(ProtectedSandApp.s("囊\u0001"), ProtectedSandApp.s("囋\u0001"));
                anonymousClass4.a(captureRequest, false);
            } else if (4 == num2.intValue() || 5 == num2.intValue()) {
                anonymousClass4.a(captureRequest, true);
            }
        }
    }

    private void b(float f4) {
        float f5;
        int i4;
        CaptureRequest.Builder builder = this.f72536m;
        String s4 = ProtectedSandApp.s("囏\u0001");
        if (builder == null || a() == null) {
            LiteavLog.e(s4, ProtectedSandApp.s("団\u0001") + f4 + ProtectedSandApp.s("囤\u0001") + this.f72547x);
            return;
        }
        Range range = (Range) a().get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        int intValue = ((Integer) range.getLower()).intValue();
        int intValue2 = ((Integer) range.getUpper()).intValue();
        if (intValue == 0 && intValue2 == 0) {
            LiteavLog.i(s4, ProtectedSandApp.s("团\u0001"));
            return;
        }
        float a5 = g.a(f4, -1.0f);
        if (a5 == 0.0f) {
            i4 = 0;
        } else {
            if (a5 > 0.0f) {
                f5 = intValue2;
            } else {
                a5 = Math.abs(a5);
                f5 = intValue;
            }
            i4 = (int) (a5 * f5);
        }
        this.f72536m.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(g.a(i4, intValue, intValue2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        CaptureRequest.Builder builder;
        CameraCaptureSession cameraCaptureSession = this.f72534k.get();
        if (cameraCaptureSession == null || (builder = this.f72536m) == null) {
            return;
        }
        try {
            cameraCaptureSession.setRepeatingRequest(builder.build(), this.N, null);
        } catch (Throwable th) {
            f.a(th, ProtectedSandApp.s("囧\u0001"), ProtectedSandApp.s("囏\u0001"));
        }
    }

    private void e() {
        CameraCharacteristics a5;
        int i4 = this.f72541r;
        if (i4 == 0) {
            return;
        }
        if (i4 == 2 && !this.f72543t) {
            return;
        }
        if ((i4 == 3 && this.f72543t) || this.f72536m == null || (a5 = a()) == null) {
            return;
        }
        int[] iArr = (int[]) a5.get(CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES);
        int length = iArr.length;
        int i5 = 0;
        while (true) {
            String s4 = ProtectedSandApp.s("囏\u0001");
            if (i5 >= length) {
                LiteavLog.e(s4, ProtectedSandApp.s("囩\u0001"));
                return;
            } else {
                if (iArr[i5] == 1) {
                    this.f72536m.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 1);
                    this.f72536m.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
                    LiteavLog.i(s4, ProtectedSandApp.s("囨\u0001"));
                    return;
                }
                i5++;
            }
        }
    }

    private List<Size> f() {
        CameraCharacteristics a5 = a();
        String s4 = ProtectedSandApp.s("囏\u0001");
        if (a5 == null) {
            LiteavLog.e(s4, ProtectedSandApp.s("囪\u0001"));
            return null;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a().get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            LiteavLog.e(s4, ProtectedSandApp.s("囫\u0001"));
            return null;
        }
        android.util.Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (outputSizes == null) {
            LiteavLog.e(s4, ProtectedSandApp.s("囬\u0001"));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (android.util.Size size : outputSizes) {
            arrayList.add(new Size(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return a() == null || this.f72536m == null || this.f72547x != EnumC1004a.f72555b;
    }

    private void c() {
        CameraDevice andSet = this.f72532i.getAndSet(null);
        if (andSet != null) {
            try {
                andSet.close();
            } catch (Throwable th) {
                f.a(th, ProtectedSandApp.s("囥\u0001"), ProtectedSandApp.s("囏\u0001"));
            }
        }
        ((CameraManager) ContextUtils.getApplicationContext().getSystemService(ProtectedSandApp.s("囝\u0001"))).unregisterAvailabilityCallback(this.M);
    }

    private void a(float f4) {
        CaptureRequest.Builder builder = this.f72536m;
        String s4 = ProtectedSandApp.s("囏\u0001");
        if (builder != null && a() != null) {
            Rect c5 = c(f4);
            if (c5 == null) {
                LiteavLog.e(s4, ProtectedSandApp.s("囐\u0001").concat(String.valueOf(c5)));
                return;
            } else {
                this.f72536m.set(CaptureRequest.SCALER_CROP_REGION, c5);
                return;
            }
        }
        LiteavLog.e(s4, ProtectedSandApp.s("囑\u0001") + f4 + ProtectedSandApp.s("囒\u0001"));
    }

    private static int a(Size size) {
        int i4 = size.width;
        int i5 = size.height;
        if (i4 == i5) {
            return 0;
        }
        return i4 > i5 ? 1 : 2;
    }

    static /* synthetic */ void a(a aVar, int i4) {
        if (aVar.g()) {
            LiteavLog.e(ProtectedSandApp.s("囏\u0001"), ProtectedSandApp.s("囓\u0001"));
            return;
        }
        CameraEventCallback cameraEventCallback = aVar.B;
        if (cameraEventCallback != null) {
            cameraEventCallback.onCameraError(aVar, i4);
        }
    }

    private void c(boolean z4) {
        CaptureRequest.Builder builder = this.f72536m;
        if (builder == null) {
            return;
        }
        int i4 = z4 ? 1 : 3;
        builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(i4));
        LiteavLog.i(ProtectedSandApp.s("囏\u0001"), ProtectedSandApp.s("囦\u0001").concat(String.valueOf(i4)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(boolean z4) {
        return z4 ? !TextUtils.isEmpty(f72527e) ? f72527e : f72526d : !TextUtils.isEmpty(f72526d) ? f72526d : f72527e;
    }

    private void b() {
        CameraCaptureSession andSet = this.f72534k.getAndSet(null);
        if (andSet != null) {
            try {
                andSet.close();
            } catch (Throwable th) {
                f.a(th, ProtectedSandApp.s("囡\u0001"), ProtectedSandApp.s("囏\u0001"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect c(float f4) {
        Rect rect = (Rect) a().get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect == null || rect.height() <= 0 || rect.width() <= 0) {
            return null;
        }
        float a5 = androidx.appcompat.graphics.drawable.d.a(this.E, 1.0f, g.a(f4, 0.0f), 1.0f);
        int width = (int) (rect.width() / this.E);
        int height = (int) (rect.height() / this.E);
        int width2 = rect.width() - width;
        int height2 = rect.height() - height;
        float f5 = a5 - 1.0f;
        float f6 = width2 * f5;
        float f7 = this.E;
        int i4 = (int) ((f6 / (f7 - 1.0f)) / 2.0f);
        int i5 = (int) (((height2 * f5) / (f7 - 1.0f)) / 2.0f);
        return new Rect(i4, i5, rect.width() - i4, rect.height() - i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z4, CameraDevice cameraDevice) {
        CountDownLatch countDownLatch = this.f72549z;
        this.f72531h.set(z4);
        this.f72532i.set(cameraDevice);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z4, CameraCaptureSession cameraCaptureSession) {
        CountDownLatch countDownLatch = this.A;
        this.f72533j.set(z4);
        this.f72534k.set(cameraCaptureSession);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    static /* synthetic */ void b(a aVar, int i4) {
        aVar.f72530g.a(b.a(aVar, i4));
    }

    private CameraCharacteristics a() {
        String b5 = b(this.f72543t);
        if (TextUtils.isEmpty(b5)) {
            return null;
        }
        return f72524b.get(b5);
    }

    private boolean a(int i4, int i5) {
        String b5 = b(this.f72543t);
        CameraCharacteristics a5 = a();
        String s4 = ProtectedSandApp.s("囏\u0001");
        if (a5 == null) {
            LiteavLog.e(s4, ProtectedSandApp.s("囕\u0001"));
            return false;
        }
        k a6 = k.a(((Integer) a().get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue());
        this.f72538o = a6;
        k kVar = this.f72539p;
        if (kVar != null) {
            a6 = kVar;
        }
        this.f72537n = com.tencent.liteav.videoproducer.capture.c.a(f(), a6, i4, i5);
        StringBuilder a7 = androidx.appcompat.view.g.a(ProtectedSandApp.s("囖\u0001"), b5, ProtectedSandApp.s("囗\u0001"));
        a7.append(this.f72543t ? ProtectedSandApp.s("囘\u0001") : ProtectedSandApp.s("囙\u0001"));
        a7.append(ProtectedSandApp.s("囚\u0001"));
        a7.append(this.f72537n);
        a7.append(ProtectedSandApp.s("四\u0001"));
        a7.append(a6);
        a7.append(ProtectedSandApp.s("囜\u0001"));
        a7.append(this.f72545v);
        LiteavLog.i(s4, a7.toString());
        try {
            this.f72549z = new CountDownLatch(1);
            ((CameraManager) ContextUtils.getApplicationContext().getSystemService(ProtectedSandApp.s("囝\u0001"))).openCamera(b5, this.K, this.f72529f);
            this.f72549z.await();
        } catch (Throwable th) {
            f.a(th, ProtectedSandApp.s("回\u0001"), s4);
            a(false, (CameraDevice) null);
        }
        return this.f72531h.get();
    }

    private boolean a(SurfaceTexture surfaceTexture) {
        CameraDevice cameraDevice;
        try {
            cameraDevice = this.f72532i.get();
        } catch (Throwable th) {
            LiteavLog.e(ProtectedSandApp.s("囏\u0001"), ProtectedSandApp.s("因\u0001"), th);
            a(false, (CameraCaptureSession) null);
        }
        if (cameraDevice != null && surfaceTexture != null) {
            b();
            SurfaceTexture surfaceTexture2 = this.f72542s;
            Size size = this.f72537n;
            surfaceTexture2.setDefaultBufferSize(size.width, size.height);
            Surface surface = new Surface(this.f72542s);
            CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(3);
            this.f72536m = createCaptureRequest;
            createCaptureRequest.addTarget(surface);
            List<Surface> singletonList = Collections.singletonList(surface);
            this.A = new CountDownLatch(1);
            cameraDevice.createCaptureSession(singletonList, this.L, this.f72529f);
            this.A.await();
            return this.f72533j.get();
        }
        throw new IOException(ProtectedSandApp.s("囟\u0001"));
    }

    private static com.tencent.liteav.videoproducer.a.a[] a(Range<Integer>[] rangeArr) {
        if (rangeArr != null && rangeArr.length > 0) {
            com.tencent.liteav.videoproducer.a.a[] aVarArr = new com.tencent.liteav.videoproducer.a.a[rangeArr.length];
            for (int i4 = 0; i4 < rangeArr.length; i4++) {
                aVarArr[i4] = new com.tencent.liteav.videoproducer.a.a(rangeArr[i4].getLower().intValue(), rangeArr[i4].getUpper().intValue());
            }
            return aVarArr;
        }
        return new com.tencent.liteav.videoproducer.a.a[0];
    }

    static /* synthetic */ void a(a aVar, boolean z4) {
        LiteavLog.i(ProtectedSandApp.s("囏\u0001"), ProtectedSandApp.s("囔\u0001").concat(String.valueOf(z4)));
        aVar.f72528a = true;
        boolean z5 = aVar.f72544u;
        if (z5) {
            return;
        }
        aVar.c(z5);
        aVar.d();
    }
}
