package com.cby.shareboard.draw.widget;

import com.cby.shareboard.utils.LogUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import ld.l;

/* compiled from: DrawHelper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class DrawHelper$delayPauseDrawing$2$1 extends n0 implements l<Throwable, k2> {
    final /* synthetic */ DrawHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DrawHelper$delayPauseDrawing$2$1(DrawHelper drawHelper) {
        super(1);
        this.this$0 = drawHelper;
    }

    @Override // ld.l
    public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
        invoke2(th);
        return k2.f75408a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@m Throwable th) {
        LogUtils logger;
        if (th == null || l0.g(th.getMessage(), ProtectedSandApp.s("\u0bfb"))) {
            return;
        }
        logger = this.this$0.getLogger();
        logger.error(ProtectedSandApp.s("\u0bfc") + th.getMessage());
    }
}
