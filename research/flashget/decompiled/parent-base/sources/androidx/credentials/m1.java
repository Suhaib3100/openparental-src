package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.Metadata;

/* compiled from: PasswordCredential.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/credentials/m1;", "Landroidx/credentials/j;", "", "id", "password", "Landroid/os/Bundle;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "d", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "f", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nPasswordCredential.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PasswordCredential.kt\nandroidx/credentials/PasswordCredential\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
/* loaded from: classes3.dex */
public final class m1 extends j {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String id;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String password;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    public static final String f27749g = "android.credentials.TYPE_PASSWORD_CREDENTIAL";

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    public static final String f27750h = "androidx.credentials.BUNDLE_KEY_ID";

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    public static final String f27751i = "androidx.credentials.BUNDLE_KEY_PASSWORD";

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: PasswordCredential.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/credentials/m1$a;", "", "<init>", "()V", "", "id", "password", "Landroid/os/Bundle;", "b", "(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;", "data", "Landroidx/credentials/m1;", "a", "(Landroid/os/Bundle;)Landroidx/credentials/m1;", "BUNDLE_KEY_ID", "Ljava/lang/String;", "BUNDLE_KEY_PASSWORD", "TYPE_PASSWORD_CREDENTIAL", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.m1$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final m1 a(@fg.l Bundle data) {
            kotlin.jvm.internal.l0.p(data, "data");
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                String string2 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                kotlin.jvm.internal.l0.m(string);
                kotlin.jvm.internal.l0.m(string2);
                return new m1(string, string2, data, null);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        @fg.l
        @kd.n
        public final Bundle b(@fg.l String id2, @fg.l String password) {
            kotlin.jvm.internal.l0.p(id2, "id");
            kotlin.jvm.internal.l0.p(password, "password");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", id2);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", password);
            return bundle;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ m1(String str, String str2, Bundle bundle, kotlin.jvm.internal.w wVar) {
        this(str, str2, bundle);
    }

    @fg.l
    @kd.n
    public static final m1 d(@fg.l Bundle bundle) {
        return INSTANCE.a(bundle);
    }

    @fg.l
    @kd.n
    public static final Bundle g(@fg.l String str, @fg.l String str2) {
        return INSTANCE.b(str, str2);
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    private m1(String str, String str2, Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        this.id = str;
        this.password = str2;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m1(@fg.l String id2, @fg.l String password) {
        this(id2, password, INSTANCE.b(id2, password));
        kotlin.jvm.internal.l0.p(id2, "id");
        kotlin.jvm.internal.l0.p(password, "password");
    }
}
