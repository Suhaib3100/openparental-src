package com.cby.shareboard.draw.widget;

import com.cby.shareboard.model.Transaction;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import ld.l;

/* compiled from: DrawHelper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/cby/shareboard/model/Transaction;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DrawHelper$handleTransaction$1$1 extends n0 implements l<Transaction, Comparable<?>> {
    public static final DrawHelper$handleTransaction$1$1 INSTANCE = new DrawHelper$handleTransaction$1$1();

    DrawHelper$handleTransaction$1$1() {
        super(1);
    }

    @Override // ld.l
    @m
    public final Comparable<?> invoke(@fg.l Transaction transaction) {
        l0.p(transaction, ProtectedSandApp.s("ఀ"));
        return Long.valueOf(transaction.getTimestamp());
    }
}
