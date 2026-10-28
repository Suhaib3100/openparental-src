package com.cby.shareboard.draw.widget;

import com.cby.shareboard.TransactionManager;
import com.cby.shareboard.action.Action;
import com.cby.shareboard.action.ActionType;
import com.cby.shareboard.utils.FileUtil;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import ld.l;

/* compiled from: DrawBoardView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/cby/shareboard/action/Action;", "action", "Lkotlin/k2;", "invoke", "(Lcom/cby/shareboard/action/Action;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class DrawBoardView$setImage$2 extends n0 implements l<Action, k2> {
    final /* synthetic */ int $bitmapHeight;
    final /* synthetic */ int $bitmapWidth;
    final /* synthetic */ k1.e $dx;
    final /* synthetic */ k1.e $dy;
    final /* synthetic */ String $filePath;
    final /* synthetic */ float $scale;
    final /* synthetic */ DrawBoardView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DrawBoardView$setImage$2(DrawBoardView drawBoardView, k1.e eVar, k1.e eVar2, int i4, int i5, float f4, String str) {
        super(1);
        this.this$0 = drawBoardView;
        this.$dx = eVar;
        this.$dy = eVar2;
        this.$bitmapWidth = i4;
        this.$bitmapHeight = i5;
        this.$scale = f4;
        this.$filePath = str;
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
        float standardX;
        float standardY;
        l0.p(action, ProtectedSandApp.s("\u0b91"));
        transactionManager = this.this$0.mTransactionManager;
        if (transactionManager != null) {
            transactionManager.setActionType(ActionType.Image);
        }
        transactionManager2 = this.this$0.mTransactionManager;
        if (transactionManager2 != null) {
            long id2 = action.getId();
            standardX = this.this$0.toStandardX(this.$dx.f75326b);
            standardY = this.this$0.toStandardY(this.$dy.f75326b);
            int i4 = this.$bitmapWidth;
            int i5 = this.$bitmapHeight;
            float f4 = this.$scale;
            String fileToBase64 = FileUtil.INSTANCE.fileToBase64(this.$filePath);
            if (fileToBase64 == null) {
                fileToBase64 = "";
            }
            transactionManager2.sendImageTransaction(id2, standardX, standardY, i4, i5, f4, fileToBase64);
        }
    }
}
