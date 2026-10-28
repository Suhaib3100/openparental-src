package l1;

import android.os.Build;
import android.util.Base64;
import androidx.annotation.c1;
import androidx.credentials.provider.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: WebAuthnUtils.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ll1/n;", "", "<init>", "()V", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: WebAuthnUtils.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll1/n$a;", "", "<init>", "()V", "", "str", "", "b", "(Ljava/lang/String;)[B", "data", "c", "([B)Ljava/lang/String;", "Landroidx/credentials/provider/a0;", "info", "a", "(Landroidx/credentials/provider/a0;)Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: l1.n$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final String a(@fg.l a0 info) {
            l0.p(info, "info");
            return Build.VERSION.SDK_INT >= 28 ? o.INSTANCE.a(info) : "";
        }

        @fg.l
        public final byte[] b(@fg.l String str) {
            l0.p(str, "str");
            byte[] decode = Base64.decode(str, 11);
            l0.o(decode, "decode(str, Base64.NO_PA…_WRAP or Base64.URL_SAFE)");
            return decode;
        }

        @fg.l
        public final String c(@fg.l byte[] data) {
            l0.p(data, "data");
            String encodeToString = Base64.encodeToString(data, 11);
            l0.o(encodeToString, "encodeToString(\n        …64.URL_SAFE\n            )");
            return encodeToString;
        }

        public Companion(w wVar) {
        }
    }
}
