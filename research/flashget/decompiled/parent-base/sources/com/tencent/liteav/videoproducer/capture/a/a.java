package com.tencent.liteav.videoproducer.capture.a;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import androidx.core.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.g;
import com.tencent.liteav.base.util.k;
import com.tencent.liteav.videobase.common.f;
import com.tencent.liteav.videoproducer.capture.CameraControllerInterface;
import com.tencent.liteav.videoproducer.capture.CameraEventCallback;
import com.tencent.liteav.videoproducer.capture.FaceRect;
import com.tencent.liteav.videoproducer.capture.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class a extends CameraControllerInterface implements Camera.ErrorCallback, Camera.FaceDetectionListener {

    /* renamed from: b, reason: collision with root package name */
    private Camera f72499b;

    /* renamed from: f, reason: collision with root package name */
    private SurfaceTexture f72503f;

    /* renamed from: g, reason: collision with root package name */
    private Size f72504g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f72505h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f72506i;

    /* renamed from: l, reason: collision with root package name */
    private CameraEventCallback f72509l;

    /* renamed from: n, reason: collision with root package name */
    private float f72511n;

    /* renamed from: a, reason: collision with root package name */
    private boolean f72498a = true;

    /* renamed from: c, reason: collision with root package name */
    private k f72500c = k.f71939a;

    /* renamed from: d, reason: collision with root package name */
    private k f72501d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f72502e = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f72507j = true;

    /* renamed from: k, reason: collision with root package name */
    private int f72508k = 0;

    /* renamed from: m, reason: collision with root package name */
    private boolean f72510m = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f72512o = false;

    /* renamed from: p, reason: collision with root package name */
    private float f72513p = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    private boolean f72514q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f72515r = false;

    /* renamed from: s, reason: collision with root package name */
    private com.tencent.liteav.videoproducer.capture.b f72516s = new com.tencent.liteav.videoproducer.capture.b();

    /* renamed from: t, reason: collision with root package name */
    private float f72517t = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    private final Camera.AutoFocusCallback f72518u = b.a();

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableCameraDynamicFps(boolean z4) {
        this.f72502e = z4;
        LiteavLog.i(ProtectedSandApp.s("嚏\u0001"), ProtectedSandApp.s("嚛\u0001").concat(String.valueOf(z4)));
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableFaceDetection(boolean z4) {
        this.f72514q = z4;
        LiteavLog.i(ProtectedSandApp.s("嚏\u0001"), ProtectedSandApp.s("嚜\u0001").concat(String.valueOf(z4)));
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void enableTapToFocus(boolean z4) {
        Camera.Parameters a5;
        this.f72507j = z4;
        if (this.f72499b == null || (a5 = a()) == null) {
            return;
        }
        try {
            a(a5, z4);
            this.f72499b.setParameters(a5);
        } catch (Throwable th) {
            LiteavLog.e(ProtectedSandApp.s("嚏\u0001"), ProtectedSandApp.s("嚝\u0001"), th);
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final FaceRect getCameraFaceRect() {
        return this.f72516s.a();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final k getCameraSystemRotation() {
        return this.f72500c;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getCameraSystemRotationValue() {
        return this.f72500c.mValue;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getCurrentCameraISO() {
        return 0;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final float getExposureCompensationStep() {
        if (a() == null) {
            return 0.0f;
        }
        return a().getExposureCompensationStep();
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final int getMaxZoom() {
        int i4 = this.f72508k;
        if (i4 != 0) {
            return i4;
        }
        if (this.f72499b != null) {
            Camera.Parameters a5 = a();
            if (a5 == null) {
                return this.f72508k;
            }
            if (a5.getMaxZoom() > 0 && a5.isZoomSupported()) {
                this.f72508k = a5.getMaxZoom();
            }
        }
        return this.f72508k;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final Size getPreviewSize() {
        return this.f72504g;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCameraAutoFocusFaceModeSupported() {
        Camera.Parameters a5;
        return (this.f72499b == null || (a5 = a()) == null || a5.getMaxNumDetectedFaces() <= 0) ? false : true;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCameraFocusPositionInPreviewSupported() {
        return this.f72505h;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isCurrentPreviewSizeAspectRatioMatch(int i4, int i5, boolean z4) {
        if (this.f72499b != null) {
            Camera.Parameters a5 = a();
            if (a5 == null) {
                return true;
            }
            k kVar = this.f72501d;
            if (kVar == null) {
                kVar = this.f72500c;
            }
            Size a6 = a(a5, kVar, i4, i5);
            if (a6 != null) {
                int i6 = a6.width;
                Size size = this.f72504g;
                r1 = i6 <= size.width && a6.height <= size.height;
                if (a(a6) != a(this.f72504g)) {
                    r1 = false;
                }
                if (z4 && Math.abs(a6.aspectRatio() - this.f72504g.aspectRatio()) > 0.001d) {
                    r1 = false;
                }
            }
        }
        LiteavLog.i(ProtectedSandApp.s("嚏\u0001"), ProtectedSandApp.s("嚞\u0001").concat(String.valueOf(r1)));
        return r1;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isTorchSupported() {
        Camera.Parameters a5;
        List<String> supportedFlashModes;
        return (this.f72499b == null || (a5 = a()) == null || (supportedFlashModes = a5.getSupportedFlashModes()) == null || !supportedFlashModes.contains(ProtectedSandApp.s("嚟\u0001"))) ? false : true;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final boolean isZoomSupported() {
        Camera.Parameters a5;
        return this.f72499b != null && (a5 = a()) != null && a5.getMaxZoom() > 0 && a5.isZoomSupported();
    }

    @Override // android.hardware.Camera.ErrorCallback
    public final void onError(int i4, Camera camera) {
        LiteavLog.e(ProtectedSandApp.s("嚏\u0001"), ProtectedSandApp.s("嚠\u0001").concat(String.valueOf(i4)));
        if (i4 == 1 || i4 == 2 || i4 == 100) {
            int i5 = i4 != 2 ? i4 == 100 ? 3 : 0 : 1;
            CameraEventCallback cameraEventCallback = this.f72509l;
            if (cameraEventCallback != null) {
                cameraEventCallback.onCameraError(this, i5);
            }
        }
    }

    @Override // android.hardware.Camera.FaceDetectionListener
    public final void onFaceDetection(Camera.Face[] faceArr, Camera camera) {
        if (this.f72514q && faceArr != null && faceArr.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (Camera.Face face : faceArr) {
                arrayList.add(face.rect);
            }
            this.f72516s.a(arrayList, this.f72517t);
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setCameraRotationCorrectionValue(int i4) {
        this.f72501d = k.b(i4) ? k.a(i4) : null;
        LiteavLog.i(ProtectedSandApp.s("嚏\u0001"), ProtectedSandApp.s("嚡\u0001") + this.f72501d);
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setExposureCompensation(int i4) {
        Camera.Parameters a5;
        if (this.f72499b == null || (a5 = a()) == null) {
            return;
        }
        int maxExposureCompensation = a5.getMaxExposureCompensation();
        String s4 = ProtectedSandApp.s("嚏\u0001");
        if (maxExposureCompensation <= 0) {
            LiteavLog.i(s4, ProtectedSandApp.s("嚒\u0001"));
            return;
        }
        a5.setExposureCompensation(i4);
        try {
            this.f72499b.setParameters(a5);
        } catch (Throwable th) {
            LiteavLog.e(s4, ProtectedSandApp.s("嚢\u0001"), th);
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setExposureCompensationNormalization(float f4) {
        this.f72511n = f4;
        this.f72510m = true;
        if (this.f72499b == null) {
            return;
        }
        this.f72510m = false;
        Camera.Parameters a5 = a();
        if (a5 == null) {
            return;
        }
        a5.setExposureCompensation(a(a5, f4));
        try {
            this.f72499b.setParameters(a5);
        } catch (Throwable th) {
            LiteavLog.e(ProtectedSandApp.s("嚏\u0001"), ProtectedSandApp.s("嚢\u0001"), th);
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setFaceAEStrategy(int i4) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void setZoom(float f4) {
        this.f72513p = f4;
        this.f72512o = true;
        if (this.f72499b == null) {
            return;
        }
        this.f72512o = false;
        Camera.Parameters a5 = a();
        if (a5 == null) {
            return;
        }
        int maxZoom = a5.getMaxZoom();
        String s4 = ProtectedSandApp.s("嚏\u0001");
        if (maxZoom <= 0 || !a5.isZoomSupported()) {
            LiteavLog.i(s4, ProtectedSandApp.s("嚤\u0001"));
            return;
        }
        int maxZoom2 = a5.getMaxZoom();
        try {
            a5.setZoom(g.a(Math.round(f4 * maxZoom2), 0, maxZoom2));
            this.f72517t = a5.getZoomRatios().get(r6).intValue() / 100.0f;
            this.f72499b.setParameters(a5);
        } catch (Throwable th) {
            LiteavLog.e(s4, ProtectedSandApp.s("嚣\u0001"), th);
        }
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void startAutoFocusAtPosition(int i4, int i5) {
        if (!this.f72507j || this.f72499b == null) {
            return;
        }
        String s4 = ProtectedSandApp.s("嚏\u0001");
        if (i4 >= 0) {
            Size size = this.f72504g;
            if (i4 < size.width && i5 >= 0 && i5 < size.height) {
                LiteavLog.i(s4, ProtectedSandApp.s("嚥\u0001"), Integer.valueOf(i4), Integer.valueOf(i5));
                try {
                    this.f72499b.cancelAutoFocus();
                    Camera.Parameters a5 = a();
                    if (a5 == null) {
                        return;
                    }
                    if (this.f72505h) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new Camera.Area(a(i4, i5, 2.0f), 1000));
                        a5.setFocusAreas(arrayList);
                    }
                    if (this.f72506i) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new Camera.Area(a(i4, i5, 3.0f), 1000));
                        a5.setMeteringAreas(arrayList2);
                    }
                    try {
                        this.f72499b.setParameters(a5);
                        this.f72499b.autoFocus(this.f72518u);
                        return;
                    } catch (Throwable th) {
                        LiteavLog.e(s4, ProtectedSandApp.s("嚦\u0001"), th);
                        return;
                    }
                } catch (Throwable th2) {
                    LiteavLog.e(s4, ProtectedSandApp.s("嚧\u0001"), th2);
                    return;
                }
            }
        }
        LiteavLog.w(s4, ProtectedSandApp.s("嚨\u0001"), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x014e A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:5:0x0013, B:7:0x0017, B:10:0x0025, B:13:0x0051, B:16:0x007a, B:19:0x0085, B:21:0x0090, B:23:0x009a, B:25:0x00a0, B:26:0x00b3, B:28:0x00b7, B:29:0x00c2, B:31:0x00e3, B:32:0x0137, B:33:0x0140, B:35:0x014e, B:36:0x0152, B:38:0x0188, B:41:0x018d, B:43:0x0191, B:45:0x0197, B:47:0x019d, B:52:0x01be, B:54:0x01cb, B:57:0x00f7, B:59:0x011c, B:61:0x012f, B:64:0x01d8, B:65:0x01e3, B:49:0x01a7), top: B:2:0x000f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019d A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:5:0x0013, B:7:0x0017, B:10:0x0025, B:13:0x0051, B:16:0x007a, B:19:0x0085, B:21:0x0090, B:23:0x009a, B:25:0x00a0, B:26:0x00b3, B:28:0x00b7, B:29:0x00c2, B:31:0x00e3, B:32:0x0137, B:33:0x0140, B:35:0x014e, B:36:0x0152, B:38:0x0188, B:41:0x018d, B:43:0x0191, B:45:0x0197, B:47:0x019d, B:52:0x01be, B:54:0x01cb, B:57:0x00f7, B:59:0x011c, B:61:0x012f, B:64:0x01d8, B:65:0x01e3, B:49:0x01a7), top: B:2:0x000f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean startCapture(com.tencent.liteav.videoproducer.capture.CameraCaptureParams r8, android.graphics.SurfaceTexture r9, com.tencent.liteav.videoproducer.capture.CameraEventCallback r10) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.capture.a.a.startCapture(com.tencent.liteav.videoproducer.capture.CameraCaptureParams, android.graphics.SurfaceTexture, com.tencent.liteav.videoproducer.capture.CameraEventCallback):boolean");
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void stopCapture() {
        String s4 = ProtectedSandApp.s("嚴\u0001");
        String s5 = ProtectedSandApp.s("嚏\u0001");
        LiteavLog.i(s5, s4);
        this.f72516s.b();
        try {
            Camera camera = this.f72499b;
            if (camera != null) {
                if (this.f72515r) {
                    try {
                        camera.stopFaceDetection();
                        this.f72499b.setFaceDetectionListener(null);
                        this.f72515r = false;
                    } catch (Throwable th) {
                        LiteavLog.e(s5, ProtectedSandApp.s("嚵\u0001"), th);
                        this.f72515r = false;
                    }
                }
                this.f72499b.setErrorCallback(null);
                this.f72499b.stopPreview();
                this.f72499b.release();
                this.f72499b = null;
            }
        } catch (Throwable th2) {
            f.a(th2, ProtectedSandApp.s("嚶\u0001"), s5);
        }
        this.f72503f = null;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraControllerInterface
    public final void turnOnTorch(boolean z4) {
        List<String> supportedFlashModes;
        if (this.f72499b == null) {
            return;
        }
        String s4 = z4 ? ProtectedSandApp.s("嚟\u0001") : ProtectedSandApp.s("嚷\u0001");
        Camera.Parameters a5 = a();
        if (a5 == null || (supportedFlashModes = a5.getSupportedFlashModes()) == null || !supportedFlashModes.contains(s4)) {
            return;
        }
        try {
            a5.setFlashMode(s4);
            this.f72499b.setParameters(a5);
        } catch (Throwable th) {
            LiteavLog.e(ProtectedSandApp.s("嚏\u0001"), ProtectedSandApp.s("嚸\u0001"), th);
        }
    }

    private static int a(Size size) {
        int i4 = size.width;
        int i5 = size.height;
        if (i4 == i5) {
            return 0;
        }
        return i4 > i5 ? 1 : 2;
    }

    private Rect a(float f4, float f5, float f6) {
        int i4 = (int) (f6 * 200.0f);
        Size size = this.f72504g;
        int i5 = (int) (((f4 / size.width) * 2000.0f) - 1000.0f);
        int i6 = (int) (((f5 / size.height) * 2000.0f) - 1000.0f);
        int i7 = i4 / 2;
        int a5 = g.a(i5 - i7, k0.f25787v, 1000);
        int a6 = g.a(a5 + i4, k0.f25787v, 1000);
        int a7 = g.a(i6 - i7, k0.f25787v, 1000);
        return new Rect(a5, a7, a6, g.a(i4 + a7, k0.f25787v, 1000));
    }

    private static int a(Camera.Parameters parameters, float f4) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        if (minExposureCompensation == 0 && maxExposureCompensation == 0) {
            LiteavLog.i(ProtectedSandApp.s("嚏\u0001"), ProtectedSandApp.s("嚒\u0001"));
            return minExposureCompensation;
        }
        com.tencent.liteav.base.a.a.a();
        return g.a((int) (g.a(f4, -1.0f) * maxExposureCompensation), minExposureCompensation, maxExposureCompensation);
    }

    private static int a(boolean z4, Camera.CameraInfo cameraInfo) {
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < Camera.getNumberOfCameras(); i6++) {
            Camera.getCameraInfo(i6, cameraInfo);
            LiteavLog.i(ProtectedSandApp.s("嚏\u0001"), ProtectedSandApp.s("嚓\u0001") + i6 + ProtectedSandApp.s("嚔\u0001") + cameraInfo.facing);
            if (i4 == -1 && cameraInfo.facing == 1) {
                i4 = i6;
            } else if (i5 == -1 && cameraInfo.facing == 0) {
                i5 = i6;
            }
        }
        if (!z4 ? i5 != -1 : i4 == -1) {
            i4 = i5;
        }
        Camera.getCameraInfo(i4, cameraInfo);
        return i4;
    }

    private static Size a(Camera.Parameters parameters, k kVar, int i4, int i5) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes != null) {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new Size(size.width, size.height));
            }
        }
        return c.a(arrayList, kVar, i4, i5);
    }

    private static void a(Camera.Parameters parameters, boolean z4) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes == null) {
            return;
        }
        String s4 = ProtectedSandApp.s("嚏\u0001");
        if (z4) {
            String s5 = ProtectedSandApp.s("嚖\u0001");
            if (supportedFocusModes.contains(s5)) {
                parameters.setFocusMode(s5);
                LiteavLog.i(s4, ProtectedSandApp.s("嚗\u0001"));
                return;
            }
        }
        String s6 = ProtectedSandApp.s("嚘\u0001");
        if (supportedFocusModes.contains(s6)) {
            parameters.setFocusMode(s6);
            LiteavLog.i(s4, ProtectedSandApp.s("嚙\u0001"));
        }
    }

    private int a(int i4) {
        Camera.Parameters a5 = a();
        if (a5 == null) {
            return 1;
        }
        List<Integer> supportedPreviewFrameRates = a5.getSupportedPreviewFrameRates();
        String s4 = ProtectedSandApp.s("嚏\u0001");
        if (supportedPreviewFrameRates != null && !supportedPreviewFrameRates.isEmpty()) {
            int intValue = supportedPreviewFrameRates.get(0).intValue();
            Iterator<Integer> it = supportedPreviewFrameRates.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (Math.abs(i4 - intValue2) < Math.abs(i4 - intValue)) {
                    intValue = intValue2;
                }
            }
            LiteavLog.i(s4, ProtectedSandApp.s("嚐\u0001"), Integer.valueOf(intValue));
            return intValue;
        }
        LiteavLog.e(s4, ProtectedSandApp.s("嚑\u0001"));
        return 1;
    }

    private Camera.Parameters a() {
        try {
            Camera camera = this.f72499b;
            if (camera != null) {
                return camera.getParameters();
            }
            return null;
        } catch (Throwable th) {
            LiteavLog.e(ProtectedSandApp.s("嚏\u0001"), ProtectedSandApp.s("嚕\u0001"), th);
            return null;
        }
    }

    private static com.tencent.liteav.videoproducer.a.a[] a(List<int[]> list) {
        if (list != null && list.size() > 0) {
            com.tencent.liteav.videoproducer.a.a[] aVarArr = new com.tencent.liteav.videoproducer.a.a[list.size()];
            for (int i4 = 0; i4 < list.size(); i4++) {
                int[] iArr = list.get(i4);
                if (iArr != null && iArr.length >= 2) {
                    aVarArr[i4] = new com.tencent.liteav.videoproducer.a.a(iArr[0], iArr[1]);
                }
            }
            return aVarArr;
        }
        return new com.tencent.liteav.videoproducer.a.a[0];
    }
}
