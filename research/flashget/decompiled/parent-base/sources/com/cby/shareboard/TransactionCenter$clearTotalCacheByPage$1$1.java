package com.cby.shareboard;

import com.cby.shareboard.model.Transaction;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import ld.l;

/* compiled from: TransactionCenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/cby/shareboard/model/Transaction;", "invoke", "(Lcom/cby/shareboard/model/Transaction;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TransactionCenter$clearTotalCacheByPage$1$1 extends n0 implements l<Transaction, Boolean> {
    final /* synthetic */ long $pageId;
    final /* synthetic */ String $userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionCenter$clearTotalCacheByPage$1$1(long j4, String str) {
        super(1);
        this.$pageId = j4;
        this.$userId = str;
    }

    @Override // ld.l
    @fg.l
    public final Boolean invoke(@fg.l Transaction transaction) {
        l0.p(transaction, ProtectedSandApp.s("ુ"));
        return Boolean.valueOf(transaction.getPageId() == this.$pageId && l0.g(transaction.getUserId(), this.$userId));
    }
}
