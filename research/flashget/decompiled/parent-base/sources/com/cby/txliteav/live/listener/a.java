package com.cby.txliteav.live.listener;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;

/* compiled from: LiveCallback.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/cby/txliteav/live/listener/a;", "", "Lkotlin/k2;", "a", "()V", "", "code", "", "msg", "b", "(Ljava/lang/Integer;Ljava/lang/String;)V", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = Companion.f46670a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f46669b = -100;

    /* compiled from: LiveCallback.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/cby/txliteav/live/listener/a$a;", "", "<init>", "()V", "", "b", "I", "CUS_ERROR", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.cby.txliteav.live.listener.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f46670a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int CUS_ERROR = -100;

        private Companion() {
        }
    }

    /* compiled from: LiveCallback.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public static /* synthetic */ void a(a aVar, Integer num, String str, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("෭"));
            }
            if ((i4 & 2) != 0) {
                str = null;
            }
            aVar.b(num, str);
        }
    }

    void a();

    void b(@m Integer code, @m String msg);
}
