package l1;

import android.content.pm.Signature;
import androidx.annotation.c1;
import androidx.annotation.x0;
import androidx.credentials.provider.a0;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import l1.n;

/* compiled from: WebAuthnUtilsApi28.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ll1/o;", "", "<init>", "()V", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(28)
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: WebAuthnUtilsApi28.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll1/o$a;", "", "<init>", "()V", "Landroidx/credentials/provider/a0;", "info", "", "a", "(Landroidx/credentials/provider/a0;)Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: l1.o$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final String a(@fg.l a0 info) {
            Signature[] apkContentsSigners;
            l0.p(info, "info");
            apkContentsSigners = info.getSigningInfo().getApkContentsSigners();
            byte[] certHash = MessageDigest.getInstance("SHA-256").digest(apkContentsSigners[0].toByteArray());
            StringBuilder sb = new StringBuilder("android:apk-key-hash:");
            n.Companion companion = n.INSTANCE;
            l0.o(certHash, "certHash");
            sb.append(companion.c(certHash));
            return sb.toString();
        }

        public Companion(w wVar) {
        }
    }
}
