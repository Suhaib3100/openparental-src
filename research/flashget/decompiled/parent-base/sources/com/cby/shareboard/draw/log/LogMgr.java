package com.cby.shareboard.draw.log;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: LogMgr.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u000f\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/cby/shareboard/draw/log/LogMgr;", "Lcom/cby/shareboard/draw/log/ILog;", "log", "<init>", "(Lcom/cby/shareboard/draw/log/ILog;)V", "", "tag", "Lkotlin/k2;", "setTag", "(Ljava/lang/String;)V", "msg", "debug", "warn", "error", "info", "verbose", "", "tr", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/cby/shareboard/draw/log/ILog;", "getLog", "()Lcom/cby/shareboard/draw/log/ILog;", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LogMgr implements ILog {

    @l
    private final ILog log;

    public LogMgr(@l ILog iLog) {
        l0.p(iLog, ProtectedSandApp.s("\u0b5b"));
        this.log = iLog;
    }

    @Override // com.cby.shareboard.draw.log.ILog
    public void debug(@l String msg) {
        l0.p(msg, ProtectedSandApp.s("ଡ଼"));
        this.log.debug(msg);
    }

    @Override // com.cby.shareboard.draw.log.ILog
    public void error(@l String msg) {
        l0.p(msg, ProtectedSandApp.s("ଡ଼"));
        this.log.error(msg);
    }

    @l
    public final ILog getLog() {
        return this.log;
    }

    @Override // com.cby.shareboard.draw.log.ILog
    public void info(@l String msg) {
        l0.p(msg, ProtectedSandApp.s("ଡ଼"));
        this.log.info(msg);
    }

    public final void setTag(@l String tag) {
        l0.p(tag, ProtectedSandApp.s("ଢ଼"));
    }

    @Override // com.cby.shareboard.draw.log.ILog
    public void verbose(@l String msg) {
        l0.p(msg, ProtectedSandApp.s("ଡ଼"));
        this.log.verbose(msg);
    }

    @Override // com.cby.shareboard.draw.log.ILog
    public void warn(@l String msg) {
        l0.p(msg, ProtectedSandApp.s("ଡ଼"));
        this.log.warn(msg);
    }

    @Override // com.cby.shareboard.draw.log.ILog
    public void verbose(@l String msg, @l Throwable tr) {
        l0.p(msg, ProtectedSandApp.s("ଡ଼"));
        l0.p(tr, ProtectedSandApp.s("\u0b5e"));
        this.log.verbose(msg, tr);
    }
}
