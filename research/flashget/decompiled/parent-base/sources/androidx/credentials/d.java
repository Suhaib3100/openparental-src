package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.b;
import kotlin.Metadata;

/* compiled from: CreateCustomCredentialRequest.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/credentials/d;", "Landroidx/credentials/b;", "", "type", "Landroid/os/Bundle;", "credentialData", "candidateQueryData", "", "isSystemProviderRequired", "Landroidx/credentials/b$b;", "displayInfo", "isAutoSelectAllowed", "origin", "preferImmediatelyAvailableCredentials", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLandroidx/credentials/b$b;ZLjava/lang/String;Z)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCreateCustomCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateCustomCredentialRequest.kt\nandroidx/credentials/CreateCustomCredentialRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
/* loaded from: classes3.dex */
public class d extends b {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public d(@fg.l String type, @fg.l Bundle credentialData, @fg.l Bundle candidateQueryData, boolean z4, @fg.l b.C0444b displayInfo) {
        this(type, credentialData, candidateQueryData, z4, displayInfo, false, null, false, 224, null);
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(credentialData, "credentialData");
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.l0.p(displayInfo, "displayInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public d(@fg.l String type, @fg.l Bundle credentialData, @fg.l Bundle candidateQueryData, boolean z4, @fg.l b.C0444b displayInfo, boolean z5) {
        this(type, credentialData, candidateQueryData, z4, displayInfo, z5, null, false, 192, null);
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(credentialData, "credentialData");
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.l0.p(displayInfo, "displayInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public d(@fg.l String type, @fg.l Bundle credentialData, @fg.l Bundle candidateQueryData, boolean z4, @fg.l b.C0444b displayInfo, boolean z5, @fg.m String str) {
        this(type, credentialData, candidateQueryData, z4, displayInfo, z5, str, false, 128, null);
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(credentialData, "credentialData");
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.l0.p(displayInfo, "displayInfo");
    }

    public /* synthetic */ d(String str, Bundle bundle, Bundle bundle2, boolean z4, b.C0444b c0444b, boolean z5, String str2, boolean z6, int i4, kotlin.jvm.internal.w wVar) {
        this(str, bundle, bundle2, z4, c0444b, (i4 & 32) != 0 ? false : z5, (i4 & 64) != 0 ? null : str2, (i4 & 128) != 0 ? false : z6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kd.j
    public d(@fg.l String type, @fg.l Bundle credentialData, @fg.l Bundle candidateQueryData, boolean z4, @fg.l b.C0444b displayInfo, boolean z5, @fg.m String str, boolean z6) {
        super(type, credentialData, candidateQueryData, z4, z5, displayInfo, str, z6);
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(credentialData, "credentialData");
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.l0.p(displayInfo, "displayInfo");
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
