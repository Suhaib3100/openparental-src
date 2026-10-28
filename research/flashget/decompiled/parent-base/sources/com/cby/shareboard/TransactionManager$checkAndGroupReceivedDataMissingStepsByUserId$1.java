package com.cby.shareboard;

import com.cby.shareboard.utils.LogUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.k2;
import kotlinx.coroutines.r0;
import ld.p;

/* compiled from: TransactionManager.kt */
@f(c = "com.cby.shareboard.TransactionManager$checkAndGroupReceivedDataMissingStepsByUserId$1", f = "TransactionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class TransactionManager$checkAndGroupReceivedDataMissingStepsByUserId$1 extends o implements p<r0, d<? super k2>, Object> {
    int label;
    final /* synthetic */ TransactionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionManager$checkAndGroupReceivedDataMissingStepsByUserId$1(TransactionManager transactionManager, d<? super TransactionManager$checkAndGroupReceivedDataMissingStepsByUserId$1> dVar) {
        super(2, dVar);
        this.this$0 = transactionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<k2> create(@m Object obj, @l d<?> dVar) {
        return new TransactionManager$checkAndGroupReceivedDataMissingStepsByUserId$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        LogUtils logger;
        String str;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException(ProtectedSandApp.s("૩"));
        }
        a1.n(obj);
        Map<String, ? extends List<Integer>> missingStepsByUserId$default = TransactionManager.getMissingStepsByUserId$default(this.this$0, null, 1, null);
        if (!missingStepsByUserId$default.isEmpty()) {
            logger = this.this$0.getLogger();
            logger.debug(ProtectedSandApp.s("૨") + missingStepsByUserId$default);
            TransactionCenter companion = TransactionCenter.INSTANCE.getInstance();
            str = this.this$0.channelId;
            companion.requestMissingData(str, missingStepsByUserId$default);
        }
        this.this$0.releaseCheckMissingStepsJob();
        return k2.f75408a;
    }

    @Override // ld.p
    @m
    public final Object invoke(@l r0 r0Var, @m d<? super k2> dVar) {
        return ((TransactionManager$checkAndGroupReceivedDataMissingStepsByUserId$1) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
    }
}
