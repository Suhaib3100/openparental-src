package androidx.credentials.provider;

import kotlin.Metadata;

/* compiled from: ProviderCreateCredentialRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/credentials/provider/d2;", "", "Landroidx/credentials/b;", "callingRequest", "Landroidx/credentials/provider/a0;", "callingAppInfo", "<init>", "(Landroidx/credentials/b;Landroidx/credentials/provider/a0;)V", "a", "Landroidx/credentials/b;", "b", "()Landroidx/credentials/b;", "Landroidx/credentials/provider/a0;", "()Landroidx/credentials/provider/a0;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.credentials.b callingRequest;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a0 callingAppInfo;

    public d2(@fg.l androidx.credentials.b callingRequest, @fg.l a0 callingAppInfo) {
        kotlin.jvm.internal.l0.p(callingRequest, "callingRequest");
        kotlin.jvm.internal.l0.p(callingAppInfo, "callingAppInfo");
        this.callingRequest = callingRequest;
        this.callingAppInfo = callingAppInfo;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final a0 getCallingAppInfo() {
        return this.callingAppInfo;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final androidx.credentials.b getCallingRequest() {
        return this.callingRequest;
    }
}
