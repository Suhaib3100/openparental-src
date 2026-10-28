package com.cby.shareboard.draw.widget;

import com.cby.shareboard.action.Action;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import ld.l;

/* compiled from: DrawBoardView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/cby/shareboard/action/Action;", "it", "Lkotlin/k2;", "invoke", "(Lcom/cby/shareboard/action/Action;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class DrawBoardView$handleImage$1 extends n0 implements l<Action, k2> {
    public static final DrawBoardView$handleImage$1 INSTANCE = new DrawBoardView$handleImage$1();

    DrawBoardView$handleImage$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@fg.l Action action) {
        l0.p(action, ProtectedSandApp.s("உ"));
    }

    @Override // ld.l
    public /* bridge */ /* synthetic */ k2 invoke(Action action) {
        invoke2(action);
        return k2.f75408a;
    }
}
