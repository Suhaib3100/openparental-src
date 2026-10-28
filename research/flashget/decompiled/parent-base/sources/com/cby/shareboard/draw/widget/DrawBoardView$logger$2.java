package com.cby.shareboard.draw.widget;

import com.cby.shareboard.utils.LogUtils;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;

/* compiled from: DrawBoardView.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/cby/shareboard/utils/LogUtils;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DrawBoardView$logger$2 extends n0 implements ld.a<LogUtils> {
    final /* synthetic */ DrawBoardView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DrawBoardView$logger$2(DrawBoardView drawBoardView) {
        super(0);
        this.this$0 = drawBoardView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ld.a
    @l
    public final LogUtils invoke() {
        return new LogUtils(this.this$0.getClass());
    }
}
