package com.cby.txliteav.live.impl;

import com.cby.txliteav.live.listener.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.internal.n0;

/* compiled from: BaseLive.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/cby/txliteav/live/impl/a;", "", "<init>", "()V", "", "code", "Lcom/cby/txliteav/live/listener/a;", "callback", "Lkotlin/k2;", "b0", "(Ljava/lang/Integer;Lcom/cby/txliteav/live/listener/a;)V", "Lc4/a;", "a", "Lkotlin/b0;", "d0", "()Lc4/a;", "logger", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final b0 logger = c0.c(new C0763a());

    /* compiled from: BaseLive.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc4/a;", "a", "()Lc4/a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.cby.txliteav.live.impl.a$a, reason: collision with other inner class name */
    static final class C0763a extends n0 implements ld.a<c4.a> {
        C0763a() {
            super(0);
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c4.a invoke() {
            return new c4.a(a.this.getClass());
        }
    }

    public static /* synthetic */ void c0(a aVar, Integer num, com.cby.txliteav.live.listener.a aVar2, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ഓ"));
        }
        if ((i4 & 2) != 0) {
            aVar2 = null;
        }
        aVar.b0(num, aVar2);
    }

    private final c4.a d0() {
        return (c4.a) this.logger.getValue();
    }

    public final void b0(@m Integer code, @m com.cby.txliteav.live.listener.a callback) {
        d0().c(ProtectedSandApp.s("ഔ") + code);
        if (code != null && code.intValue() == 0) {
            if (callback != null) {
                callback.a();
            }
        } else if (callback != null) {
            a.b.a(callback, code, null, 2, null);
        }
    }
}
