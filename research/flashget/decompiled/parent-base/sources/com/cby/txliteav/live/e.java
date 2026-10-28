package com.cby.txliteav.live;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: LiveDef.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\b\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\"\u0010\u001e\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/cby/txliteav/live/e;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "a", "[B", "b", "()[B", "f", "([B)V", "data", "", "I", "c", "()I", "g", "(I)V", "sampleRate", "e", "channel", "", "d", "J", "()J", "h", "(J)V", "timestamp", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private byte[] data;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int sampleRate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int channel;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long timestamp;

    /* renamed from: a, reason: from getter */
    public final int getChannel() {
        return this.channel;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* renamed from: c, reason: from getter */
    public final int getSampleRate() {
        return this.sampleRate;
    }

    /* renamed from: d, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final void e(int i4) {
        this.channel = i4;
    }

    public final void f(@fg.m byte[] bArr) {
        this.data = bArr;
    }

    public final void g(int i4) {
        this.sampleRate = i4;
    }

    public final void h(long j4) {
        this.timestamp = j4;
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("െ") + this.data + ProtectedSandApp.s("േ") + this.sampleRate + ProtectedSandApp.s("ൈ") + this.channel + ProtectedSandApp.s("\u0d49") + this.timestamp + ProtectedSandApp.s("ൊ");
    }
}
