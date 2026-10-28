package androidx.credentials.provider;

import android.os.Bundle;
import kotlin.Metadata;

/* compiled from: BeginCreateCustomCredentialRequest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/credentials/provider/r;", "Landroidx/credentials/provider/p;", "", "type", "Landroid/os/Bundle;", "candidateQueryData", "Landroidx/credentials/provider/a0;", "callingAppInfo", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroidx/credentials/provider/a0;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBeginCreateCustomCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginCreateCustomCredentialRequest.kt\nandroidx/credentials/provider/BeginCreateCustomCredentialRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
/* loaded from: classes3.dex */
public class r extends p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@fg.l String type, @fg.l Bundle candidateQueryData, @fg.m a0 a0Var) {
        super(type, candidateQueryData, a0Var);
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
