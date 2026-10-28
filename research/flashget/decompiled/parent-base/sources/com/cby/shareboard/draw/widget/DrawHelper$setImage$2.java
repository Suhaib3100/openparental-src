package com.cby.shareboard.draw.widget;

import com.cby.shareboard.TransactionManager;
import com.cby.shareboard.action.Action;
import com.cby.shareboard.action.ActionType;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import ld.l;

/* compiled from: DrawHelper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/cby/shareboard/action/Action;", "action", "Lkotlin/k2;", "invoke", "(Lcom/cby/shareboard/action/Action;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class DrawHelper$setImage$2 extends n0 implements l<Action, k2> {
    final /* synthetic */ int $bitmapHeight;
    final /* synthetic */ int $bitmapWidth;
    final /* synthetic */ k1.e $dx;
    final /* synthetic */ k1.e $dy;
    final /* synthetic */ String $imageBase64;
    final /* synthetic */ float $scale;
    final /* synthetic */ DrawHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DrawHelper$setImage$2(DrawHelper drawHelper, k1.e eVar, k1.e eVar2, int i4, int i5, float f4, String str) {
        super(1);
        this.this$0 = drawHelper;
        this.$dx = eVar;
        this.$dy = eVar2;
        this.$bitmapWidth = i4;
        this.$bitmapHeight = i5;
        this.$scale = f4;
        this.$imageBase64 = str;
    }

    @Override // ld.l
    public /* bridge */ /* synthetic */ k2 invoke(Action action) {
        invoke2(action);
        return k2.f75408a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@fg.l Action action) {
        TransactionManager transactionManager;
        TransactionManager transactionManager2;
        l0.p(action, ProtectedSandApp.s("ఊ"));
        transactionManager = this.this$0.mTransactionManager;
        if (transactionManager != null) {
            transactionManager.setActionType(ActionType.Image);
        }
        transactionManager2 = this.this$0.mTransactionManager;
        if (transactionManager2 != null) {
            transactionManager2.sendImageTransaction(action.getId(), this.$dx.f75326b, this.$dy.f75326b, this.$bitmapWidth, this.$bitmapHeight, this.$scale, this.$imageBase64);
        }
    }
}
