package r8;

import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.credentials.j1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import fg.l;
import fg.m;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: com.google.android.libraries.identity.googleid:googleid@@1.1.1 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lr8/b;", "Landroidx/credentials/j1;", "", "serverClientId", "hostedDomainFilter", "nonce", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "k", "l", "r", "a", "b", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nGetSignInWithGoogleOption.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetSignInWithGoogleOption.kt\ncom/google/android/libraries/identity/googleid/GetSignInWithGoogleOption\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
/* loaded from: classes5.dex */
public final class b extends j1 {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: o, reason: collision with root package name */
    @l
    private final String f89765o;

    /* renamed from: p, reason: collision with root package name */
    @m
    private final String f89766p;

    /* renamed from: q, reason: collision with root package name */
    @m
    private final String f89767q;

    /* compiled from: com.google.android.libraries.identity.googleid:googleid@@1.1.1 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\bJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lr8/b$a;", "", "", "serverClientId", "<init>", "(Ljava/lang/String;)V", "hostedDomainFilter", "b", "(Ljava/lang/String;)Lr8/b$a;", "nonce", "c", "Lr8/b;", "a", "()Lr8/b;", "Ljava/lang/String;", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        private final String f89768a;

        /* renamed from: b, reason: collision with root package name */
        @m
        private String f89769b;

        /* renamed from: c, reason: collision with root package name */
        @m
        private String f89770c;

        public a(@o0 String str) {
            l0.p(str, ProtectedSandApp.s("\uefe6"));
            this.f89768a = str;
        }

        @l
        public final b a() {
            return new b(this.f89768a, this.f89769b, this.f89770c);
        }

        @l
        public final a b(@o0 String hostedDomainFilter) {
            l0.p(hostedDomainFilter, ProtectedSandApp.s("\uefe7"));
            this.f89769b = hostedDomainFilter;
            return this;
        }

        @l
        public final a c(@m String nonce) {
            this.f89770c = nonce;
            return this;
        }
    }

    /* compiled from: com.google.android.libraries.identity.googleid:googleid@@1.1.1 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0003R\u001a\u0010\u0015\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u0012\u0004\b\u0016\u0010\u0003R\u001a\u0010\u0017\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u0012\u0004\b\u0018\u0010\u0003R\u001a\u0010\u0019\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u0012\u0004\b\u001a\u0010\u0003¨\u0006\u001b"}, d2 = {"Lr8/b$b;", "", "<init>", "()V", "Landroid/os/Bundle;", "data", "Lr8/b;", "a", "(Landroid/os/Bundle;)Lr8/b;", "", "serverClientId", "hostedDomainFilter", "nonce", "", "autoSelectEnabled", "toBundle$java_com_google_android_libraries_identity_googleid_granule_granule", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Landroid/os/Bundle;", "toBundle", "BUNDLE_KEY_AUTO_SELECT_ENABLED", "Ljava/lang/String;", "getBUNDLE_KEY_AUTO_SELECT_ENABLED$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_HOSTED_DOMAIN_FILTER", "getBUNDLE_KEY_HOSTED_DOMAIN_FILTER$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_NONCE", "getBUNDLE_KEY_NONCE$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_SERVER_CLIENT_ID", "getBUNDLE_KEY_SERVER_CLIENT_ID$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: r8.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
            throw null;
        }

        @l
        @n
        public static final Bundle b(@o0 String str, @m String str2, @m String str3, boolean z4) {
            l0.p(str, ProtectedSandApp.s("\uefe8"));
            Bundle bundle = new Bundle();
            bundle.putString(ProtectedSandApp.s("\uefe9"), str);
            bundle.putString(ProtectedSandApp.s("\uefea"), str3);
            bundle.putString(ProtectedSandApp.s("\uefeb"), str2);
            bundle.putBoolean(ProtectedSandApp.s("\uefec"), true);
            bundle.putString(ProtectedSandApp.s("\uefed"), ProtectedSandApp.s("\uefee"));
            return bundle;
        }

        @l
        @n
        public final b a(@o0 Bundle data) {
            l0.p(data, ProtectedSandApp.s("\uefef"));
            try {
                String string = data.getString(ProtectedSandApp.s("\uefe9"));
                l0.m(string);
                return new b(string, data.getString(ProtectedSandApp.s("\uefeb")), data.getString(ProtectedSandApp.s("\uefea")));
            } catch (Exception e4) {
                throw new GoogleIdTokenParsingException(e4);
            }
        }

        public /* synthetic */ Companion(@o0 w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@o0 String str, @m String str2, @m String str3) {
        super(ProtectedSandApp.s("\ueff1"), Companion.b(str, str2, str3, true), Companion.b(str, str2, str3, true), true, true, null, 32, null);
        l0.p(str, ProtectedSandApp.s("\ueff0"));
        this.f89765o = str;
        this.f89766p = str2;
        this.f89767q = str3;
        if (str.length() <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\ueff2"));
        }
    }

    @l
    @n
    public static final b i(@o0 Bundle bundle) {
        return INSTANCE.a(bundle);
    }

    @q0
    /* renamed from: j, reason: from getter */
    public final String getF89766p() {
        return this.f89766p;
    }

    @q0
    /* renamed from: k, reason: from getter */
    public final String getF89767q() {
        return this.f89767q;
    }

    @l
    /* renamed from: l, reason: from getter */
    public final String getF89765o() {
        return this.f89765o;
    }
}
