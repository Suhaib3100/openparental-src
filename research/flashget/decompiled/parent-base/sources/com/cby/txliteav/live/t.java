package com.cby.txliteav.live;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: LiveDef.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010!\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0014\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010'\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b\u0005\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00101\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010*\u001a\u0004\b\u001c\u0010,\"\u0004\b0\u0010.R\"\u00103\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010*\u001a\u0004\b)\u0010,\"\u0004\b2\u0010.¨\u00064"}, d2 = {"Lcom/cby/txliteav/live/t;", "", "<init>", "()V", "Lcom/cby/txliteav/live/l;", "a", "Lcom/cby/txliteav/live/l;", "e", "()Lcom/cby/txliteav/live/l;", "m", "(Lcom/cby/txliteav/live/l;)V", "pixelFormat", "Lcom/cby/txliteav/live/g;", "b", "Lcom/cby/txliteav/live/g;", "()Lcom/cby/txliteav/live/g;", "j", "(Lcom/cby/txliteav/live/g;)V", "bufferType", "Lcom/cby/txliteav/live/s;", "c", "Lcom/cby/txliteav/live/s;", "g", "()Lcom/cby/txliteav/live/s;", "o", "(Lcom/cby/txliteav/live/s;)V", "texture", "", "d", "[B", "()[B", "k", "([B)V", "data", "Ljava/nio/ByteBuffer;", "Ljava/nio/ByteBuffer;", "()Ljava/nio/ByteBuffer;", "i", "(Ljava/nio/ByteBuffer;)V", "buffer", "", "f", "I", "h", "()I", "p", "(I)V", "width", "l", "height", "n", "rotation", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private l pixelFormat = l.LivePixelFormatUnknown;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private g bufferType = g.LiveBufferTypeUnknown;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private s texture;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private byte[] data;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ByteBuffer buffer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int width;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int height;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int rotation;

    @fg.m
    /* renamed from: a, reason: from getter */
    public final ByteBuffer getBuffer() {
        return this.buffer;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final g getBufferType() {
        return this.bufferType;
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* renamed from: d, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final l getPixelFormat() {
        return this.pixelFormat;
    }

    /* renamed from: f, reason: from getter */
    public final int getRotation() {
        return this.rotation;
    }

    @fg.m
    /* renamed from: g, reason: from getter */
    public final s getTexture() {
        return this.texture;
    }

    /* renamed from: h, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public final void i(@fg.m ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
    }

    public final void j(@fg.l g gVar) {
        l0.p(gVar, ProtectedSandApp.s("ย"));
        this.bufferType = gVar;
    }

    public final void k(@fg.m byte[] bArr) {
        this.data = bArr;
    }

    public final void l(int i4) {
        this.height = i4;
    }

    public final void m(@fg.l l lVar) {
        l0.p(lVar, ProtectedSandApp.s("ย"));
        this.pixelFormat = lVar;
    }

    public final void n(int i4) {
        this.rotation = i4;
    }

    public final void o(@fg.m s sVar) {
        this.texture = sVar;
    }

    public final void p(int i4) {
        this.width = i4;
    }
}
