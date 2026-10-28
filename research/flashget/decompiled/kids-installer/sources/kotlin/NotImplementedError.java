package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: Standard.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/NotImplementedError;", "Ljava/lang/Error;", "Lkotlin/Error;", "message", "", "(Ljava/lang/String;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.g0, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class NotImplementedError extends Error {
    /* JADX WARN: Multi-variable type inference failed */
    public NotImplementedError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotImplementedError(@d5.d String str) {
        super(str);
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("㼤"));
    }

    public /* synthetic */ NotImplementedError(String str, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? ProtectedSandApp.s("㼥") : str);
    }
}
