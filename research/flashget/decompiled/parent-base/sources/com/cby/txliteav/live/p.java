package com.cby.txliteav.live;

import android.graphics.Bitmap;
import android.view.View;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: LivePusherManager.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J;\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u0019\u0010\u0019\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0016J3\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010#J;\u0010)\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010\t2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b-\u0010.J+\u00102\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b2\u00103J1\u00109\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u00072\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b9\u0010:J!\u0010=\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b=\u0010>J!\u0010A\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020?2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bA\u0010BJ!\u0010C\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bC\u0010DJ\u0019\u0010E\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bE\u0010\u0016J\u0019\u0010F\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bF\u0010\u0016J\u0019\u0010G\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bG\u0010\u0016J\u000f\u0010H\u001a\u00020\u0007H\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0007H\u0016¢\u0006\u0004\bJ\u0010IJ!\u0010K\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bK\u0010DJ\u000f\u0010L\u001a\u00020%H\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0007H\u0016¢\u0006\u0004\bN\u0010IJ!\u0010P\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bP\u0010DJ)\u0010R\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020Q2\u0006\u0010'\u001a\u00020Q2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010X\u001a\u00020\u000f2\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020QH\u0016¢\u0006\u0004\b[\u0010\\J!\u0010^\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020%2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010b\u001a\u00020\u000f2\u0006\u0010a\u001a\u00020`H\u0016¢\u0006\u0004\bb\u0010cJ!\u0010f\u001a\u00020\u000f2\u0006\u0010e\u001a\u00020d2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bf\u0010gJ!\u0010h\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bh\u0010DJ\u0019\u0010i\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bi\u0010\u0016J\u0019\u0010j\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bj\u0010\u0016J\u0019\u0010'\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b'\u0010\u0016J!\u0010k\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bk\u0010lJ\u0019\u0010m\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bm\u0010\u0016J\u000f\u0010n\u001a\u00020\u0007H\u0016¢\u0006\u0004\bn\u0010IJ\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010o\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010pJ\u0019\u0010s\u001a\u00020\u000f2\b\u0010r\u001a\u0004\u0018\u00010qH\u0016¢\u0006\u0004\bs\u0010tR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010u¨\u0006v"}, d2 = {"Lcom/cby/txliteav/live/p;", "Lb4/b;", "livePusher", "<init>", "(Lb4/b;)V", "Lcom/cby/txliteav/live/d;", "collectionSource", "", "frontCamera", "Landroid/graphics/Bitmap;", "image", "", "url", "Lcom/cby/txliteav/live/listener/a;", "callback", "Lkotlin/k2;", "O", "(Lcom/cby/txliteav/live/d;ZLandroid/graphics/Bitmap;Ljava/lang/String;Lcom/cby/txliteav/live/listener/a;)V", "a0", "()V", "i", "d", "(Lcom/cby/txliteav/live/listener/a;)V", "N", "s", "a", "m", "k", "(Lcom/cby/txliteav/live/d;ZLandroid/graphics/Bitmap;Lcom/cby/txliteav/live/listener/a;)V", "Landroid/view/View;", "view", "b", "(Landroid/view/View;Lcom/cby/txliteav/live/listener/a;)V", "isShow", "showDebugView", "(Z)V", "bitmap", "", "x", "y", "scale", "D", "(Landroid/graphics/Bitmap;FFFLcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/f;", "quality", "K", "(Lcom/cby/txliteav/live/f;Lcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/u;", "resolution", "isLandscape", "z", "(Lcom/cby/txliteav/live/u;Ljava/lang/Boolean;Lcom/cby/txliteav/live/listener/a;)V", "enable", "Lcom/cby/txliteav/live/l;", "pixelFormat", "Lcom/cby/txliteav/live/g;", "bufferType", "P", "(ZLcom/cby/txliteav/live/l;Lcom/cby/txliteav/live/g;Lcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/r;", "rotation", "c", "(Lcom/cby/txliteav/live/r;Lcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/k;", "mirror", "w", "(Lcom/cby/txliteav/live/k;Lcom/cby/txliteav/live/listener/a;)V", "q", "(ZLcom/cby/txliteav/live/listener/a;)V", "e", "M", "B", "Q", "()Z", "isFrontCamera", "n", "getCameraZoomMaxRatio", "()F", "isAutoFocusEnabled", "enabled", "V", "", "l", "(IILcom/cby/txliteav/live/listener/a;)V", "enableCameraTorch", "(Z)Z", "Lcom/cby/txliteav/live/a;", "route", "U", "(Lcom/cby/txliteav/live/a;)V", "volume", "setVoiceCaptureVolume", "(I)V", "value", "Y", "(FLcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/c;", "params", "G", "(Lcom/cby/txliteav/live/c;)V", "Lcom/cby/txliteav/live/w;", "type", "h", "(Lcom/cby/txliteav/live/w;Lcom/cby/txliteav/live/listener/a;)V", "g", "C", "E", "p", "(Landroid/graphics/Bitmap;Lcom/cby/txliteav/live/listener/a;)V", "j", "isPushing", "msg", "(Ljava/lang/String;)V", "Lcom/cby/txliteav/live/listener/c;", "listener", "F", "(Lcom/cby/txliteav/live/listener/c;)V", "Lb4/b;", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements b4.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b4.b livePusher;

    public p(@fg.l b4.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("ฌ"));
        this.livePusher = bVar;
    }

    @Override // b4.b
    public void B(@fg.m com.cby.txliteav.live.listener.a callback) {
        this.livePusher.B(callback);
    }

    @Override // b4.b
    public void C(@fg.m com.cby.txliteav.live.listener.a callback) {
        this.livePusher.C(callback);
    }

    @Override // b4.b
    public void D(@fg.m Bitmap bitmap, float x4, float y4, float scale, @fg.m com.cby.txliteav.live.listener.a callback) {
        this.livePusher.D(bitmap, x4, y4, scale, callback);
    }

    @Override // b4.b
    public void E(@fg.m com.cby.txliteav.live.listener.a callback) {
        this.livePusher.E(callback);
    }

    @Override // b4.b
    public void F(@fg.m com.cby.txliteav.live.listener.c listener) {
        this.livePusher.F(listener);
    }

    @Override // b4.b
    public void G(@fg.l c params) {
        l0.p(params, ProtectedSandApp.s("ญ"));
        this.livePusher.G(params);
    }

    @Override // b4.b
    public void K(@fg.l f quality, @fg.m com.cby.txliteav.live.listener.a callback) {
        l0.p(quality, ProtectedSandApp.s("ฎ"));
        this.livePusher.K(quality, callback);
    }

    @Override // b4.b
    public void M(@fg.m com.cby.txliteav.live.listener.a callback) {
        this.livePusher.M(callback);
    }

    @Override // b4.b
    public void N() {
        this.livePusher.N();
    }

    @Override // b4.b
    public void O(@fg.l d collectionSource, boolean frontCamera, @fg.m Bitmap image, @fg.l String url, @fg.m com.cby.txliteav.live.listener.a callback) {
        l0.p(collectionSource, ProtectedSandApp.s("ฏ"));
        l0.p(url, ProtectedSandApp.s("ฐ"));
        this.livePusher.O(collectionSource, frontCamera, image, url, callback);
    }

    @Override // b4.b
    public void P(boolean enable, @fg.l l pixelFormat, @fg.l g bufferType, @fg.m com.cby.txliteav.live.listener.a callback) {
        l0.p(pixelFormat, ProtectedSandApp.s("ฑ"));
        l0.p(bufferType, ProtectedSandApp.s("ฒ"));
        this.livePusher.P(enable, pixelFormat, bufferType, callback);
    }

    @Override // b4.b
    public boolean Q() {
        return this.livePusher.Q();
    }

    @Override // b4.b
    public void U(@fg.l a route) {
        l0.p(route, ProtectedSandApp.s("ณ"));
        this.livePusher.U(route);
    }

    @Override // b4.b
    public void V(boolean enabled, @fg.m com.cby.txliteav.live.listener.a callback) {
        this.livePusher.V(enabled, callback);
    }

    @Override // b4.b
    public void Y(float value, @fg.m com.cby.txliteav.live.listener.a callback) {
        this.livePusher.Y(value, callback);
    }

    @Override // b4.b
    public void a(@fg.m com.cby.txliteav.live.listener.a callback) {
        this.livePusher.a(callback);
    }

    @Override // b4.b
    public void a0() {
        this.livePusher.a0();
    }

    @Override // b4.b
    public void b(@fg.l View view, @fg.m com.cby.txliteav.live.listener.a callback) {
        l0.p(view, ProtectedSandApp.s("ด"));
        this.livePusher.b(view, callback);
    }

    @Override // b4.b
    public void c(@fg.l r rotation, @fg.m com.cby.txliteav.live.listener.a callback) {
        l0.p(rotation, ProtectedSandApp.s("ต"));
        this.livePusher.c(rotation, callback);
    }

    @Override // b4.b
    public void d(@fg.m com.cby.txliteav.live.listener.a callback) {
        this.livePusher.d(callback);
    }

    @Override // b4.b
    public void e(@fg.m com.cby.txliteav.live.listener.a callback) {
        this.livePusher.e(callback);
    }

    @Override // b4.b
    public boolean enableCameraTorch(boolean enable) {
        return this.livePusher.enableCameraTorch(enable);
    }

    @Override // b4.b
    public void g(boolean frontCamera, @fg.m com.cby.txliteav.live.listener.a callback) {
        this.livePusher.g(frontCamera, callback);
    }

    @Override // b4.b
    public float getCameraZoomMaxRatio() {
        return this.livePusher.getCameraZoomMaxRatio();
    }

    @Override // b4.b
    public void h(@fg.l w type, @fg.m com.cby.txliteav.live.listener.a callback) {
        l0.p(type, ProtectedSandApp.s("ถ"));
        this.livePusher.h(type, callback);
    }

    @Override // b4.b
    public void i() {
        this.livePusher.i();
    }

    @Override // b4.b
    public boolean isAutoFocusEnabled() {
        return this.livePusher.isAutoFocusEnabled();
    }

    @Override // b4.b
    public boolean isFrontCamera() {
        return this.livePusher.isFrontCamera();
    }

    @Override // b4.b
    public boolean isPushing() {
        return this.livePusher.isPushing();
    }

    @Override // b4.b
    public void j(@fg.m com.cby.txliteav.live.listener.a callback) {
        this.livePusher.j(callback);
    }

    @Override // b4.b
    public void k(@fg.l d collectionSource, boolean frontCamera, @fg.m Bitmap image, @fg.m com.cby.txliteav.live.listener.a callback) {
        l0.p(collectionSource, ProtectedSandApp.s("ฏ"));
        this.livePusher.k(collectionSource, frontCamera, image, callback);
    }

    @Override // b4.b
    public void l(int x4, int y4, @fg.m com.cby.txliteav.live.listener.a callback) {
        this.livePusher.l(x4, y4, callback);
    }

    @Override // b4.b
    public void m(@fg.m com.cby.txliteav.live.listener.a callback) {
        this.livePusher.m(callback);
    }

    @Override // b4.b
    public void n(boolean frontCamera, @fg.m com.cby.txliteav.live.listener.a callback) {
        this.livePusher.n(frontCamera, callback);
    }

    @Override // b4.b
    public void p(@fg.l Bitmap image, @fg.m com.cby.txliteav.live.listener.a callback) {
        l0.p(image, ProtectedSandApp.s("ท"));
        this.livePusher.p(image, callback);
    }

    @Override // b4.b
    public void q(boolean mirror, @fg.m com.cby.txliteav.live.listener.a callback) {
        this.livePusher.q(mirror, callback);
    }

    @Override // b4.b
    public void s() {
        this.livePusher.s();
    }

    @Override // b4.b
    public void setVoiceCaptureVolume(int volume) {
        this.livePusher.setVoiceCaptureVolume(volume);
    }

    @Override // b4.b
    public void showDebugView(boolean isShow) {
        this.livePusher.showDebugView(isShow);
    }

    @Override // b4.b
    public void w(@fg.l k mirror, @fg.m com.cby.txliteav.live.listener.a callback) {
        l0.p(mirror, ProtectedSandApp.s("ธ"));
        this.livePusher.w(mirror, callback);
    }

    @Override // b4.b
    public void x(@fg.l String msg) {
        l0.p(msg, ProtectedSandApp.s("น"));
        this.livePusher.x(msg);
    }

    @Override // b4.b
    public void y(@fg.m com.cby.txliteav.live.listener.a callback) {
        this.livePusher.y(callback);
    }

    @Override // b4.b
    public void z(@fg.l u resolution, @fg.m Boolean isLandscape, @fg.m com.cby.txliteav.live.listener.a callback) {
        l0.p(resolution, ProtectedSandApp.s("บ"));
        this.livePusher.z(resolution, isLandscape, callback);
    }
}
