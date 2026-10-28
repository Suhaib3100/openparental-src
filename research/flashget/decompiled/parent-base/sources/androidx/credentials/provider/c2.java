package androidx.credentials.provider;

import kotlin.Metadata;

/* compiled from: ProviderClearCredentialStateRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/provider/c2;", "", "Landroidx/credentials/provider/a0;", "callingAppInfo", "<init>", "(Landroidx/credentials/provider/a0;)V", "a", "Landroidx/credentials/provider/a0;", "()Landroidx/credentials/provider/a0;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a0 callingAppInfo;

    public c2(@fg.l a0 callingAppInfo) {
        kotlin.jvm.internal.l0.p(callingAppInfo, "callingAppInfo");
        this.callingAppInfo = callingAppInfo;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final a0 getCallingAppInfo() {
        return this.callingAppInfo;
    }
}
