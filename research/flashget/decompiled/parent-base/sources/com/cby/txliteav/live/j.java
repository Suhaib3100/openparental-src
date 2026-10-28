package com.cby.txliteav.live;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: LiveDef.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/cby/txliteav/live/j;", "", "", "filePath", "Lcom/cby/txliteav/live/q;", "recordMode", "", "interval", "<init>", "(Ljava/lang/String;Lcom/cby/txliteav/live/q;I)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "b", "Lcom/cby/txliteav/live/q;", "c", "()Lcom/cby/txliteav/live/q;", "f", "(Lcom/cby/txliteav/live/q;)V", "I", "()I", "e", "(I)V", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private String filePath;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private q recordMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int interval;

    public j(@fg.m String str, @fg.l q qVar, int i4) {
        l0.p(qVar, ProtectedSandApp.s("\u0de5"));
        this.filePath = str;
        this.recordMode = qVar;
        this.interval = i4;
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* renamed from: b, reason: from getter */
    public final int getInterval() {
        return this.interval;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final q getRecordMode() {
        return this.recordMode;
    }

    public final void d(@fg.m String str) {
        this.filePath = str;
    }

    public final void e(int i4) {
        this.interval = i4;
    }

    public final void f(@fg.l q qVar) {
        l0.p(qVar, ProtectedSandApp.s("෦"));
        this.recordMode = qVar;
    }

    public /* synthetic */ j(String str, q qVar, int i4, int i5, kotlin.jvm.internal.w wVar) {
        this(str, (i5 & 2) != 0 ? q.BOTH : qVar, (i5 & 4) != 0 ? -1 : i4);
    }
}
