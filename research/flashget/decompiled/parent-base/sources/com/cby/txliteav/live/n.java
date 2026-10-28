package com.cby.txliteav.live;

import androidx.collection.n1;
import androidx.compose.foundation.w1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: LiveDef.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0016J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0016J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0016J°\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0016J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u00100\u001a\u0004\b1\u0010\u0016\"\u0004\b0\u00102R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00100\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u00102R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u00100\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u00102R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00100\u001a\u0004\b7\u0010\u0016\"\u0004\b8\u00102R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u00100\u001a\u0004\b9\u0010\u0016\"\u0004\b:\u00102R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u00100\u001a\u0004\b;\u0010\u0016\"\u0004\b<\u00102R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u00100\u001a\u0004\b=\u0010\u0016\"\u0004\b>\u00102R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u00100\u001a\u0004\b?\u0010\u0016\"\u0004\b@\u00102R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00100\u001a\u0004\bA\u0010\u0016\"\u0004\bB\u00102R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00100\u001a\u0004\bC\u0010\u0016\"\u0004\bD\u00102R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00100\u001a\u0004\bE\u0010\u0016\"\u0004\bF\u00102R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00100\u001a\u0004\bG\u0010\u0016\"\u0004\bH\u00102R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00100\u001a\u0004\bI\u0010\u0016\"\u0004\bJ\u00102R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u00100\u001a\u0004\bK\u0010\u0016\"\u0004\bL\u00102R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00100\u001a\u0004\bM\u0010\u0016\"\u0004\bN\u00102R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00100\u001a\u0004\bO\u0010\u0016\"\u0004\bP\u00102¨\u0006Q"}, d2 = {"Lcom/cby/txliteav/live/n;", "", "", "appCpu", "systemCpu", "width", "height", "fps", "videoBitrate", "audioBitrate", "audioPacketLoss", "videoPacketLoss", "jitterBufferDelay", "audioTotalBlockTime", "audioBlockRate", "videoTotalBlockTime", "videoBlockRate", "rtt", "netSpeed", "<init>", "(IIIIIIIIIIIIIIII)V", "a", "()I", "i", "j", "k", "l", "m", "n", "o", "p", "b", "c", "d", "e", "f", "g", "h", "q", "(IIIIIIIIIIIIIIII)Lcom/cby/txliteav/live/n;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "s", "(I)V", "C", "S", "H", "X", "y", "O", "x", "N", "D", "T", "t", "J", "v", "L", "F", "V", "z", "P", "w", "M", "u", "K", "G", "W", "E", "U", "B", "R", "A", "Q", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int appCpu;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int systemCpu;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int width;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int height;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int fps;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int videoBitrate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int audioBitrate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int audioPacketLoss;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int videoPacketLoss;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int jitterBufferDelay;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int audioTotalBlockTime;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int audioBlockRate;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int videoTotalBlockTime;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int videoBlockRate;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int rtt;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int netSpeed;

    public n() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65535, null);
    }

    public static n r(n nVar, int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, Object obj) {
        int i23 = (i22 & 1) != 0 ? nVar.appCpu : i4;
        int i24 = (i22 & 2) != 0 ? nVar.systemCpu : i5;
        int i25 = (i22 & 4) != 0 ? nVar.width : i6;
        int i26 = (i22 & 8) != 0 ? nVar.height : i7;
        int i27 = (i22 & 16) != 0 ? nVar.fps : i10;
        int i28 = (i22 & 32) != 0 ? nVar.videoBitrate : i11;
        int i29 = (i22 & 64) != 0 ? nVar.audioBitrate : i12;
        int i30 = (i22 & 128) != 0 ? nVar.audioPacketLoss : i13;
        int i31 = (i22 & 256) != 0 ? nVar.videoPacketLoss : i14;
        int i32 = (i22 & 512) != 0 ? nVar.jitterBufferDelay : i15;
        int i33 = (i22 & 1024) != 0 ? nVar.audioTotalBlockTime : i16;
        int i34 = (i22 & 2048) != 0 ? nVar.audioBlockRate : i17;
        int i35 = (i22 & 4096) != 0 ? nVar.videoTotalBlockTime : i18;
        int i36 = (i22 & 8192) != 0 ? nVar.videoBlockRate : i19;
        int i37 = (i22 & 16384) != 0 ? nVar.rtt : i20;
        int i38 = (i22 & 32768) != 0 ? nVar.netSpeed : i21;
        nVar.getClass();
        return new n(i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38);
    }

    /* renamed from: A, reason: from getter */
    public final int getNetSpeed() {
        return this.netSpeed;
    }

    /* renamed from: B, reason: from getter */
    public final int getRtt() {
        return this.rtt;
    }

    /* renamed from: C, reason: from getter */
    public final int getSystemCpu() {
        return this.systemCpu;
    }

    /* renamed from: D, reason: from getter */
    public final int getVideoBitrate() {
        return this.videoBitrate;
    }

    /* renamed from: E, reason: from getter */
    public final int getVideoBlockRate() {
        return this.videoBlockRate;
    }

    /* renamed from: F, reason: from getter */
    public final int getVideoPacketLoss() {
        return this.videoPacketLoss;
    }

    /* renamed from: G, reason: from getter */
    public final int getVideoTotalBlockTime() {
        return this.videoTotalBlockTime;
    }

    /* renamed from: H, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public final void I(int i4) {
        this.appCpu = i4;
    }

    public final void J(int i4) {
        this.audioBitrate = i4;
    }

    public final void K(int i4) {
        this.audioBlockRate = i4;
    }

    public final void L(int i4) {
        this.audioPacketLoss = i4;
    }

    public final void M(int i4) {
        this.audioTotalBlockTime = i4;
    }

    public final void N(int i4) {
        this.fps = i4;
    }

    public final void O(int i4) {
        this.height = i4;
    }

    public final void P(int i4) {
        this.jitterBufferDelay = i4;
    }

    public final void Q(int i4) {
        this.netSpeed = i4;
    }

    public final void R(int i4) {
        this.rtt = i4;
    }

    public final void S(int i4) {
        this.systemCpu = i4;
    }

    public final void T(int i4) {
        this.videoBitrate = i4;
    }

    public final void U(int i4) {
        this.videoBlockRate = i4;
    }

    public final void V(int i4) {
        this.videoPacketLoss = i4;
    }

    public final void W(int i4) {
        this.videoTotalBlockTime = i4;
    }

    public final void X(int i4) {
        this.width = i4;
    }

    /* renamed from: a, reason: from getter */
    public final int getAppCpu() {
        return this.appCpu;
    }

    /* renamed from: b, reason: from getter */
    public final int getJitterBufferDelay() {
        return this.jitterBufferDelay;
    }

    /* renamed from: c, reason: from getter */
    public final int getAudioTotalBlockTime() {
        return this.audioTotalBlockTime;
    }

    /* renamed from: d, reason: from getter */
    public final int getAudioBlockRate() {
        return this.audioBlockRate;
    }

    public final int e() {
        return this.videoTotalBlockTime;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof n)) {
            return false;
        }
        n nVar = (n) other;
        return this.appCpu == nVar.appCpu && this.systemCpu == nVar.systemCpu && this.width == nVar.width && this.height == nVar.height && this.fps == nVar.fps && this.videoBitrate == nVar.videoBitrate && this.audioBitrate == nVar.audioBitrate && this.audioPacketLoss == nVar.audioPacketLoss && this.videoPacketLoss == nVar.videoPacketLoss && this.jitterBufferDelay == nVar.jitterBufferDelay && this.audioTotalBlockTime == nVar.audioTotalBlockTime && this.audioBlockRate == nVar.audioBlockRate && this.videoTotalBlockTime == nVar.videoTotalBlockTime && this.videoBlockRate == nVar.videoBlockRate && this.rtt == nVar.rtt && this.netSpeed == nVar.netSpeed;
    }

    public final int f() {
        return this.videoBlockRate;
    }

    public final int g() {
        return this.rtt;
    }

    public final int h() {
        return this.netSpeed;
    }

    public int hashCode() {
        return Integer.hashCode(this.netSpeed) + w1.a(this.rtt, w1.a(this.videoBlockRate, w1.a(this.videoTotalBlockTime, w1.a(this.audioBlockRate, w1.a(this.audioTotalBlockTime, w1.a(this.jitterBufferDelay, w1.a(this.videoPacketLoss, w1.a(this.audioPacketLoss, w1.a(this.audioBitrate, w1.a(this.videoBitrate, w1.a(this.fps, w1.a(this.height, w1.a(this.width, w1.a(this.systemCpu, Integer.hashCode(this.appCpu) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final int i() {
        return this.systemCpu;
    }

    public final int j() {
        return this.width;
    }

    /* renamed from: k, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: l, reason: from getter */
    public final int getFps() {
        return this.fps;
    }

    public final int m() {
        return this.videoBitrate;
    }

    /* renamed from: n, reason: from getter */
    public final int getAudioBitrate() {
        return this.audioBitrate;
    }

    /* renamed from: o, reason: from getter */
    public final int getAudioPacketLoss() {
        return this.audioPacketLoss;
    }

    public final int p() {
        return this.videoPacketLoss;
    }

    @fg.l
    public final n q(int appCpu, int systemCpu, int width, int height, int fps, int videoBitrate, int audioBitrate, int audioPacketLoss, int videoPacketLoss, int jitterBufferDelay, int audioTotalBlockTime, int audioBlockRate, int videoTotalBlockTime, int videoBlockRate, int rtt, int netSpeed) {
        return new n(appCpu, systemCpu, width, height, fps, videoBitrate, audioBitrate, audioPacketLoss, videoPacketLoss, jitterBufferDelay, audioTotalBlockTime, audioBlockRate, videoTotalBlockTime, videoBlockRate, rtt, netSpeed);
    }

    public final int s() {
        return this.appCpu;
    }

    public final int t() {
        return this.audioBitrate;
    }

    @fg.l
    public String toString() {
        int i4 = this.appCpu;
        int i5 = this.systemCpu;
        int i6 = this.width;
        int i7 = this.height;
        int i10 = this.fps;
        int i11 = this.videoBitrate;
        int i12 = this.audioBitrate;
        int i13 = this.audioPacketLoss;
        int i14 = this.videoPacketLoss;
        int i15 = this.jitterBufferDelay;
        int i16 = this.audioTotalBlockTime;
        int i17 = this.audioBlockRate;
        int i18 = this.videoTotalBlockTime;
        int i19 = this.videoBlockRate;
        int i20 = this.rtt;
        int i21 = this.netSpeed;
        StringBuilder a5 = n1.a(ProtectedSandApp.s("\u0df7"), i4, ProtectedSandApp.s("\u0df8"), i5, ProtectedSandApp.s("\u0df9"));
        androidx.paging.l.a(a5, i6, ProtectedSandApp.s("\u0dfa"), i7, ProtectedSandApp.s("\u0dfb"));
        androidx.paging.l.a(a5, i10, ProtectedSandApp.s("\u0dfc"), i11, ProtectedSandApp.s("\u0dfd"));
        androidx.paging.l.a(a5, i12, ProtectedSandApp.s("\u0dfe"), i13, ProtectedSandApp.s("\u0dff"));
        androidx.paging.l.a(a5, i14, ProtectedSandApp.s("\u0e00"), i15, ProtectedSandApp.s("ก"));
        androidx.paging.l.a(a5, i16, ProtectedSandApp.s("ข"), i17, ProtectedSandApp.s("ฃ"));
        androidx.paging.l.a(a5, i18, ProtectedSandApp.s("ค"), i19, ProtectedSandApp.s("ฅ"));
        a5.append(i20);
        a5.append(ProtectedSandApp.s("ฆ"));
        a5.append(i21);
        a5.append(ProtectedSandApp.s("ง"));
        return a5.toString();
    }

    public final int u() {
        return this.audioBlockRate;
    }

    public final int v() {
        return this.audioPacketLoss;
    }

    public final int w() {
        return this.audioTotalBlockTime;
    }

    public final int x() {
        return this.fps;
    }

    public final int y() {
        return this.height;
    }

    public final int z() {
        return this.jitterBufferDelay;
    }

    public n(int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
        this.appCpu = i4;
        this.systemCpu = i5;
        this.width = i6;
        this.height = i7;
        this.fps = i10;
        this.videoBitrate = i11;
        this.audioBitrate = i12;
        this.audioPacketLoss = i13;
        this.videoPacketLoss = i14;
        this.jitterBufferDelay = i15;
        this.audioTotalBlockTime = i16;
        this.audioBlockRate = i17;
        this.videoTotalBlockTime = i18;
        this.videoBlockRate = i19;
        this.rtt = i20;
        this.netSpeed = i21;
    }

    public /* synthetic */ n(int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, kotlin.jvm.internal.w wVar) {
        this((i22 & 1) != 0 ? 0 : i4, (i22 & 2) != 0 ? 0 : i5, (i22 & 4) != 0 ? 0 : i6, (i22 & 8) != 0 ? 0 : i7, (i22 & 16) != 0 ? 0 : i10, (i22 & 32) != 0 ? 0 : i11, (i22 & 64) != 0 ? 0 : i12, (i22 & 128) != 0 ? 0 : i13, (i22 & 256) != 0 ? 0 : i14, (i22 & 512) != 0 ? 0 : i15, (i22 & 1024) != 0 ? 0 : i16, (i22 & 2048) != 0 ? 0 : i17, (i22 & 4096) != 0 ? 0 : i18, (i22 & 8192) != 0 ? 0 : i19, (i22 & 16384) != 0 ? 0 : i20, (i22 & 32768) != 0 ? 0 : i21);
    }
}
