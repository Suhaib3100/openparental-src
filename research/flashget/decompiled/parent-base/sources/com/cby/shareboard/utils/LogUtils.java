package com.cby.shareboard.utils;

import com.cby.shareboard.draw.log.ILog;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: LogUtils.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0015\b\u0016\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0005J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0005J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0005J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0013\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/cby/shareboard/utils/LogUtils;", "Lcom/cby/shareboard/draw/log/ILog;", "", "tag", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)V", "", "isPrintLog", "Lkotlin/k2;", "setPrintLog", "(Z)V", "msg", "debug", "warn", "error", "info", "verbose", "", "tr", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Ljava/lang/String;", "Z", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LogUtils implements ILog {
    private boolean isPrintLog;

    @l
    private final String tag;

    public LogUtils(@l String str) {
        l0.p(str, ProtectedSandApp.s("ಷ"));
        this.tag = str;
        this.isPrintLog = true;
    }

    @Override // com.cby.shareboard.draw.log.ILog
    public void debug(@l String msg) {
        l0.p(msg, ProtectedSandApp.s("ಸ"));
    }

    @Override // com.cby.shareboard.draw.log.ILog
    public void error(@l String msg) {
        l0.p(msg, ProtectedSandApp.s("ಸ"));
    }

    @Override // com.cby.shareboard.draw.log.ILog
    public void info(@l String msg) {
        l0.p(msg, ProtectedSandApp.s("ಸ"));
    }

    public final void setPrintLog(boolean isPrintLog) {
        this.isPrintLog = isPrintLog;
    }

    @Override // com.cby.shareboard.draw.log.ILog
    public void verbose(@l String msg) {
        l0.p(msg, ProtectedSandApp.s("ಸ"));
    }

    @Override // com.cby.shareboard.draw.log.ILog
    public void warn(@l String msg) {
        l0.p(msg, ProtectedSandApp.s("ಸ"));
    }

    @Override // com.cby.shareboard.draw.log.ILog
    public void verbose(@l String msg, @l Throwable tr) {
        l0.p(msg, ProtectedSandApp.s("ಸ"));
        l0.p(tr, ProtectedSandApp.s("ಹ"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LogUtils(@fg.l java.lang.Class<?> r2) {
        /*
            r1 = this;
            java.lang.String r0 = "ವ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r0 = "ಶ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cby.shareboard.utils.LogUtils.<init>(java.lang.Class):void");
    }
}
