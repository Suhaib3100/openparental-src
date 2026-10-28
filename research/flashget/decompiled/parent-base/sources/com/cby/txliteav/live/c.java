package com.cby.txliteav.live;

import androidx.compose.foundation.w1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: LiveDef.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001c\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u001f¨\u0006\""}, d2 = {"Lcom/cby/txliteav/live/c;", "", "Lcom/cby/txliteav/live/b;", "mode", "", "width", "height", "<init>", "(Lcom/cby/txliteav/live/b;II)V", "a", "()Lcom/cby/txliteav/live/b;", "b", "()I", "c", "d", "(Lcom/cby/txliteav/live/b;II)Lcom/cby/txliteav/live/c;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/cby/txliteav/live/b;", "g", "j", "(Lcom/cby/txliteav/live/b;)V", "I", "h", "k", "(I)V", "f", "i", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private b mode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int width;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int height;

    public c() {
        this(null, 0, 0, 7, null);
    }

    public static c e(c cVar, b bVar, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            bVar = cVar.mode;
        }
        if ((i6 & 2) != 0) {
            i4 = cVar.width;
        }
        if ((i6 & 4) != 0) {
            i5 = cVar.height;
        }
        cVar.getClass();
        return new c(bVar, i4, i5);
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final b getMode() {
        return this.mode;
    }

    /* renamed from: b, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: c, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @fg.l
    public final c d(@fg.m b mode, int width, int height) {
        return new c(mode, width, height);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return this.mode == cVar.mode && this.width == cVar.width && this.height == cVar.height;
    }

    public final int f() {
        return this.height;
    }

    @fg.m
    public final b g() {
        return this.mode;
    }

    public final int h() {
        return this.width;
    }

    public int hashCode() {
        b bVar = this.mode;
        return Integer.hashCode(this.height) + w1.a(this.width, (bVar == null ? 0 : bVar.hashCode()) * 31, 31);
    }

    public final void i(int i4) {
        this.height = i4;
    }

    public final void j(@fg.m b bVar) {
        this.mode = bVar;
    }

    public final void k(int i4) {
        this.width = i4;
    }

    @fg.l
    public String toString() {
        b bVar = this.mode;
        int i4 = this.width;
        int i5 = this.height;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ഽ"));
        sb.append(bVar);
        sb.append(ProtectedSandApp.s("ാ"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("ി"));
        return android.support.v4.media.b.a(sb, i5, ProtectedSandApp.s("ീ"));
    }

    public c(@fg.m b bVar, int i4, int i5) {
        this.mode = bVar;
        this.width = i4;
        this.height = i5;
    }

    public /* synthetic */ c(b bVar, int i4, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this((i6 & 1) != 0 ? null : bVar, (i6 & 2) != 0 ? 0 : i4, (i6 & 4) != 0 ? 0 : i5);
    }
}
