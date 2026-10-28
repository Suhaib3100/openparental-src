package androidx.credentials.provider.utils;

import android.content.pm.SigningInfo;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.ClearCredentialStateRequest;
import androidx.annotation.c1;
import androidx.credentials.provider.c2;
import kotlin.Metadata;

/* compiled from: ClearCredentialUtil.kt */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/credentials/provider/utils/n1;", "", "<init>", "()V", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(34)
/* loaded from: classes3.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: ClearCredentialUtil.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/provider/utils/n1$a;", "", "<init>", "()V", "Landroid/service/credentials/ClearCredentialStateRequest;", "request", "Landroidx/credentials/provider/c2;", "a", "(Landroid/service/credentials/ClearCredentialStateRequest;)Landroidx/credentials/provider/c2;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.utils.n1$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final c2 a(@fg.l ClearCredentialStateRequest request) {
            CallingAppInfo callingAppInfo;
            String packageName;
            CallingAppInfo callingAppInfo2;
            SigningInfo signingInfo;
            CallingAppInfo callingAppInfo3;
            String origin;
            kotlin.jvm.internal.l0.p(request, "request");
            callingAppInfo = request.getCallingAppInfo();
            packageName = callingAppInfo.getPackageName();
            kotlin.jvm.internal.l0.o(packageName, "request.callingAppInfo.packageName");
            callingAppInfo2 = request.getCallingAppInfo();
            signingInfo = callingAppInfo2.getSigningInfo();
            kotlin.jvm.internal.l0.o(signingInfo, "request.callingAppInfo.signingInfo");
            callingAppInfo3 = request.getCallingAppInfo();
            origin = callingAppInfo3.getOrigin();
            return new c2(new androidx.credentials.provider.a0(packageName, signingInfo, origin));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    @fg.l
    @kd.n
    public static final c2 a(@fg.l ClearCredentialStateRequest clearCredentialStateRequest) {
        return INSTANCE.a(clearCredentialStateRequest);
    }
}
