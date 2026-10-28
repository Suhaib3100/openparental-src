package org.webrtc;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;

@TargetApi(21)
/* loaded from: classes9.dex */
public class Camera2Capturer extends CameraCapturer {

    @androidx.annotation.q0
    private final CameraManager cameraManager;
    private final Context context;
    private int type;

    public Camera2Capturer(Context context, String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        super(str, cameraEventsHandler, new Camera2Enumerator(context));
        this.type = androidx.core.app.k0.f25787v;
        this.context = context;
        this.cameraManager = (CameraManager) context.getSystemService("camera");
    }

    @Override // org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ boolean IsSupportSwithcAllCamera() {
        return super.IsSupportSwithcAllCamera();
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void changeCaptureFormat(int i4, int i5, int i6) {
        super.changeCaptureFormat(i4, i5, i6);
    }

    @Override // org.webrtc.CameraCapturer
    protected void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i4, int i5, int i6, boolean z4) {
        if (this.type == -1000) {
            Camera2Session.create(createSessionCallback, events, context, this.cameraManager, surfaceTextureHelper, str, i4, i5, i6);
        } else {
            Camera2Session.create(createSessionCallback, events, context, this.cameraManager, surfaceTextureHelper, str, i4, i5, i6, 4);
        }
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void dispose() {
        super.dispose();
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void initialize(@androidx.annotation.q0 SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        super.initialize(surfaceTextureHelper, context, capturerObserver);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isScreencast() {
        return super.isScreencast();
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void openCameraFlashLight(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, boolean z4) {
        super.openCameraFlashLight(cameraSwitchHandler, z4);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public void pauseCapture(boolean z4) {
    }

    @Override // org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void printStackTrace() {
        super.printStackTrace();
    }

    @Override // org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ boolean setCameraName(String str) {
        return super.setCameraName(str);
    }

    @Override // org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void setSwitchAllCamera(boolean z4) {
        super.setSwitchAllCamera(z4);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ boolean startCapture(int i4, int i5, int i6) {
        return super.startCapture(i4, i5, i6);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void stopCapture() {
        super.stopCapture();
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        super.switchCamera(cameraSwitchHandler);
    }

    public Camera2Capturer(Context context, String str, int i4, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        super(str, cameraEventsHandler, new Camera2Enumerator(context));
        this.type = i4;
        this.context = context;
        this.cameraManager = (CameraManager) context.getSystemService("camera");
    }
}
