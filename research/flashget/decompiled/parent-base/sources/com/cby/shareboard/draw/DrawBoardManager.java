package com.cby.shareboard.draw;

import com.cby.shareboard.draw.log.ILog;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: DrawBoardManager.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/cby/shareboard/draw/DrawBoardManager;", "", "<init>", "()V", "Lcom/cby/shareboard/draw/log/ILog;", "log", "Lkotlin/k2;", "setLog", "(Lcom/cby/shareboard/draw/log/ILog;)V", "getLog", "()Lcom/cby/shareboard/draw/log/ILog;", "Lcom/cby/shareboard/draw/log/ILog;", "Companion", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrawBoardManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion(null);

    @l
    private static final b0<DrawBoardManager> instance$delegate = c0.c(DrawBoardManager$Companion$instance$2.INSTANCE);

    @m
    private ILog log;

    /* compiled from: DrawBoardManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/cby/shareboard/draw/DrawBoardManager$Companion;", "", "<init>", "()V", "Lcom/cby/shareboard/draw/DrawBoardManager;", "instance$delegate", "Lkotlin/b0;", "getInstance", "()Lcom/cby/shareboard/draw/DrawBoardManager;", "instance", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final DrawBoardManager getInstance() {
            return (DrawBoardManager) DrawBoardManager.instance$delegate.getValue();
        }

        private Companion() {
        }
    }

    @m
    public final ILog getLog() {
        return this.log;
    }

    public final void setLog(@l ILog log) {
        l0.p(log, ProtectedSandApp.s("\u0b4f"));
        this.log = log;
    }
}
