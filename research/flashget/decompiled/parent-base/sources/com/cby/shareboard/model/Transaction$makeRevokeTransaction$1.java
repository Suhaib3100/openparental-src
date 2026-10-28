package com.cby.shareboard.model;

import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import ld.l;

/* compiled from: Transaction.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class Transaction$makeRevokeTransaction$1 extends n0 implements l<Long, CharSequence> {
    public static final Transaction$makeRevokeTransaction$1 INSTANCE = new Transaction$makeRevokeTransaction$1();

    Transaction$makeRevokeTransaction$1() {
        super(1);
    }

    @fg.l
    public final CharSequence invoke(long j4) {
        return String.valueOf(j4);
    }

    @Override // ld.l
    public /* bridge */ /* synthetic */ CharSequence invoke(Long l4) {
        return invoke(l4.longValue());
    }
}
