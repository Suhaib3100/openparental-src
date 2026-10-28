package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: GetCustomCredentialOption.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001BM\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010BC\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0011BM\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/credentials/j1;", "Landroidx/credentials/o;", "Landroid/os/Bundle;", "requestData", "", "type", "candidateQueryData", "", "isSystemProviderRequired", "isAutoSelectAllowed", "", "Landroid/content/ComponentName;", "allowedProviders", "", "typePriorityHint", "<init>", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/util/Set;I)V", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;)V", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;I)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nGetCustomCredentialOption.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetCustomCredentialOption.kt\nandroidx/credentials/GetCustomCredentialOption\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n1#2:204\n*E\n"})
/* loaded from: classes3.dex */
public class j1 extends o {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public j1(@fg.l String type, @fg.l Bundle requestData, @fg.l Bundle candidateQueryData, boolean z4) {
        this(type, requestData, candidateQueryData, z4, false, null, 48, null);
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(requestData, "requestData");
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public j1(@fg.l String type, @fg.l Bundle requestData, @fg.l Bundle candidateQueryData, boolean z4, boolean z5) {
        this(type, requestData, candidateQueryData, z4, z5, null, 32, null);
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(requestData, "requestData");
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
    }

    public j1(Bundle bundle, String str, Bundle bundle2, boolean z4, boolean z5, Set set, int i4, int i5, kotlin.jvm.internal.w wVar) {
        this(bundle, str, bundle2, z4, (i5 & 16) != 0 ? false : z5, (Set<ComponentName>) ((i5 & 32) != 0 ? kotlin.collections.l0.f74939b : set), (i5 & 64) != 0 ? 2000 : i4);
    }

    public j1(String str, Bundle bundle, Bundle bundle2, boolean z4, boolean z5, Set set, int i4, int i5, kotlin.jvm.internal.w wVar) {
        this(str, bundle, bundle2, z4, (i5 & 16) != 0 ? false : z5, (Set<ComponentName>) ((i5 & 32) != 0 ? kotlin.collections.l0.f74939b : set), (i5 & 64) != 0 ? 2000 : i4);
    }

    public j1(String str, Bundle bundle, Bundle bundle2, boolean z4, boolean z5, Set set, int i4, kotlin.jvm.internal.w wVar) {
        this(str, bundle, bundle2, z4, (i4 & 16) != 0 ? false : z5, (i4 & 32) != 0 ? kotlin.collections.l0.f74939b : set);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(@fg.l Bundle requestData, @fg.l String type, @fg.l Bundle candidateQueryData, boolean z4, boolean z5, @fg.l Set<ComponentName> allowedProviders, int i4) {
        super(type, requestData, candidateQueryData, z4, z5, allowedProviders, i4);
        kotlin.jvm.internal.l0.p(requestData, "requestData");
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.l0.p(allowedProviders, "allowedProviders");
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
        if (i4 == 100) {
            throw new IllegalArgumentException("Custom types should not have passkey level priority.");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public j1(@fg.l String type, @fg.l Bundle requestData, @fg.l Bundle candidateQueryData, boolean z4, boolean z5, @fg.l Set<ComponentName> allowedProviders) {
        this(requestData, type, candidateQueryData, z4, z5, allowedProviders, 0, 64, (kotlin.jvm.internal.w) null);
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(requestData, "requestData");
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.l0.p(allowedProviders, "allowedProviders");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j1(@fg.l String type, @fg.l Bundle requestData, @fg.l Bundle candidateQueryData, boolean z4, boolean z5, @fg.l Set<ComponentName> allowedProviders, int i4) {
        this(requestData, type, candidateQueryData, z4, z5, allowedProviders, i4);
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(requestData, "requestData");
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.l0.p(allowedProviders, "allowedProviders");
    }
}
