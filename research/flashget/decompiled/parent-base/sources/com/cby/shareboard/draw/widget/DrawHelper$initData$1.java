package com.cby.shareboard.draw.widget;

import android.graphics.Bitmap;
import com.cby.shareboard.model.Transaction;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.k2;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.r0;
import ld.p;

/* compiled from: DrawHelper.kt */
@f(c = "com.cby.shareboard.draw.widget.DrawHelper$initData$1", f = "DrawHelper.kt", i = {}, l = {453}, m = "invokeSuspend", n = {}, s = {})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class DrawHelper$initData$1 extends o implements p<r0, d<? super k2>, Object> {
    final /* synthetic */ List<Transaction> $list;
    int label;
    final /* synthetic */ DrawHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DrawHelper$initData$1(DrawHelper drawHelper, List<Transaction> list, d<? super DrawHelper$initData$1> dVar) {
        super(2, dVar);
        this.this$0 = drawHelper;
        this.$list = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<k2> create(@m Object obj, @l d<?> dVar) {
        return new DrawHelper$initData$1(this.this$0, this.$list, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        kotlinx.coroutines.k2 k2Var;
        Map map;
        Bitmap bitmap;
        Bitmap bitmap2;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        int i4 = this.label;
        if (i4 == 0) {
            a1.n(obj);
            this.this$0.onPause();
            k2Var = this.this$0.mDelayPauseDrawing;
            if (k2Var != null) {
                k2.a.b(k2Var, null, 1, null);
            }
            this.this$0.mDelayPauseDrawing = null;
            this.this$0.mLastNo = -1;
            this.this$0.mLastID = -1L;
            this.this$0.mLastPageId = -1L;
            map = this.this$0.mChannelMap;
            map.clear();
            bitmap = this.this$0.mCurBgBitmap;
            if (bitmap != null) {
                bitmap.eraseColor(0);
            }
            bitmap2 = this.this$0.mDrawingBitmap;
            if (bitmap2 != null) {
                bitmap2.eraseColor(0);
            }
            this.this$0.notifyBoardListener();
            this.label = 1;
            if (c1.b(100L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException(ProtectedSandApp.s("ం"));
            }
            a1.n(obj);
        }
        this.this$0.handleTransaction(this.$list);
        this.this$0.notifyChanged();
        return kotlin.k2.f75408a;
    }

    @Override // ld.p
    @m
    public final Object invoke(@l r0 r0Var, @m d<? super kotlin.k2> dVar) {
        return ((DrawHelper$initData$1) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
    }
}
