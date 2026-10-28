package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.Metadata;

/* compiled from: PublicKeyCredential.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u000b2\u00020\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/credentials/s1;", "Landroidx/credentials/j;", "", "authenticationResponseJson", "Landroid/os/Bundle;", "data", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "(Ljava/lang/String;)V", "d", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s1 extends j {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String authenticationResponseJson;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    public static final String f28274f = "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL";

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    public static final String f28275g = "androidx.credentials.BUNDLE_KEY_SUBTYPE";

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    public static final String f28276h = "androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON";

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: PublicKeyCredential.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/credentials/s1$a;", "", "<init>", "()V", "", "authenticationResponseJson", "Landroid/os/Bundle;", "b", "(Ljava/lang/String;)Landroid/os/Bundle;", "data", "Landroidx/credentials/s1;", "a", "(Landroid/os/Bundle;)Landroidx/credentials/s1;", "BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", "Ljava/lang/String;", "BUNDLE_KEY_SUBTYPE", "TYPE_PUBLIC_KEY_CREDENTIAL", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.s1$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final s1 a(@fg.l Bundle data) {
            kotlin.jvm.internal.l0.p(data, "data");
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                kotlin.jvm.internal.l0.m(string);
                return new s1(string, data, null);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        @fg.l
        @kd.n
        public final Bundle b(@fg.l String authenticationResponseJson) {
            kotlin.jvm.internal.l0.p(authenticationResponseJson, "authenticationResponseJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", authenticationResponseJson);
            return bundle;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ s1(String str, Bundle bundle, kotlin.jvm.internal.w wVar) {
        this(str, bundle);
    }

    @fg.l
    @kd.n
    public static final s1 d(@fg.l Bundle bundle) {
        return INSTANCE.a(bundle);
    }

    @fg.l
    @kd.n
    public static final Bundle f(@fg.l String str) {
        return INSTANCE.b(str);
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final String getAuthenticationResponseJson() {
        return this.authenticationResponseJson;
    }

    private s1(String str, Bundle bundle) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        this.authenticationResponseJson = str;
        if (!j1.b.INSTANCE.a(str)) {
            throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s1(@fg.l String authenticationResponseJson) {
        this(authenticationResponseJson, INSTANCE.b(authenticationResponseJson));
        kotlin.jvm.internal.l0.p(authenticationResponseJson, "authenticationResponseJson");
    }
}
