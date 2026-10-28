package r8;

import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.credentials.j1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kd.n;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: com.google.android.libraries.identity.googleid:googleid@@1.1.1 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001e"}, d2 = {"Lr8/a;", "Landroidx/credentials/j1;", "", "serverClientId", "nonce", "", "filterByAuthorizedAccounts", "linkedServiceId", "", "idTokenDepositionScopes", "requestVerifiedPhoneNumber", "autoSelectEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;ZZ)V", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "n", "p", "Ljava/util/List;", "l", "()Ljava/util/List;", "Z", "j", "()Z", "k", "o", "v", "a", "b", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nGetGoogleIdOption.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetGoogleIdOption.kt\ncom/google/android/libraries/identity/googleid/GetGoogleIdOption\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n1#2:259\n*E\n"})
/* loaded from: classes5.dex */
public final class a extends j1 {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: o, reason: collision with root package name */
    @l
    private final String f89750o;

    /* renamed from: p, reason: collision with root package name */
    @m
    private final String f89751p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f89752q;

    /* renamed from: r, reason: collision with root package name */
    @m
    private final String f89753r;

    /* renamed from: s, reason: collision with root package name */
    @m
    private final List f89754s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f89755t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f89756u;

    /* compiled from: com.google.android.libraries.identity.googleid:googleid@@1.1.1 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\rJ\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Lr8/a$a;", "", "<init>", "()V", "", "linkedServiceId", "", "idTokenDepositionScopes", "a", "(Ljava/lang/String;Ljava/util/List;)Lr8/a$a;", "", "autoSelectEnabled", "c", "(Z)Lr8/a$a;", "filterByAuthorizedAccounts", "d", "nonce", "e", "(Ljava/lang/String;)Lr8/a$a;", "requestVerifiedPhoneNumber", "f", "serverClientId", "g", "Lr8/a;", "b", "()Lr8/a;", "Z", "Ljava/util/List;", "Ljava/lang/String;", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nGetGoogleIdOption.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetGoogleIdOption.kt\ncom/google/android/libraries/identity/googleid/GetGoogleIdOption$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n1#2:259\n*E\n"})
    /* renamed from: r8.a$a, reason: collision with other inner class name */
    public static final class C1381a {

        /* renamed from: b, reason: collision with root package name */
        @m
        private String f89758b;

        /* renamed from: c, reason: collision with root package name */
        @m
        private String f89759c;

        /* renamed from: e, reason: collision with root package name */
        private boolean f89761e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f89762f;

        /* renamed from: g, reason: collision with root package name */
        @m
        private List f89763g;

        /* renamed from: a, reason: collision with root package name */
        @l
        private String f89757a = "";

        /* renamed from: d, reason: collision with root package name */
        private boolean f89760d = true;

        @l
        public final C1381a a(@o0 String linkedServiceId, @m List<String> idTokenDepositionScopes) {
            l0.p(linkedServiceId, ProtectedSandApp.s("\uefd5"));
            if (linkedServiceId.length() <= 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\uefd6"));
            }
            this.f89758b = linkedServiceId;
            this.f89763g = idTokenDepositionScopes != null ? w.V5(idTokenDepositionScopes) : null;
            return this;
        }

        @l
        public final a b() {
            return new a(this.f89757a, this.f89759c, this.f89760d, this.f89758b, this.f89763g, this.f89761e, this.f89762f);
        }

        @l
        public final C1381a c(boolean autoSelectEnabled) {
            this.f89762f = autoSelectEnabled;
            return this;
        }

        @l
        public final C1381a d(boolean filterByAuthorizedAccounts) {
            this.f89760d = filterByAuthorizedAccounts;
            return this;
        }

        @l
        public final C1381a e(@m String nonce) {
            this.f89759c = nonce;
            return this;
        }

        @l
        public final C1381a f(boolean requestVerifiedPhoneNumber) {
            this.f89761e = requestVerifiedPhoneNumber;
            return this;
        }

        @l
        public final C1381a g(@o0 String serverClientId) {
            l0.p(serverClientId, ProtectedSandApp.s("\uefd7"));
            if (serverClientId.length() <= 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\uefd8"));
            }
            this.f89757a = serverClientId;
            return this;
        }
    }

    /* compiled from: com.google.android.libraries.identity.googleid:googleid@@1.1.1 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0016\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJS\u0010\u0015\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0003R\u001a\u0010\u0019\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u0012\u0004\b\u001a\u0010\u0003R\u001a\u0010\u001b\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u0012\u0004\b\u001c\u0010\u0003R\u001a\u0010\u001d\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u0012\u0004\b\u001e\u0010\u0003R\u001a\u0010\u001f\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u0012\u0004\b \u0010\u0003R\u001a\u0010!\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b!\u0010\u0017\u0012\u0004\b\"\u0010\u0003R\u001a\u0010#\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b#\u0010\u0017\u0012\u0004\b$\u0010\u0003¨\u0006%"}, d2 = {"Lr8/a$b;", "", "<init>", "()V", "Landroid/os/Bundle;", "data", "Lr8/a;", "a", "(Landroid/os/Bundle;)Lr8/a;", "", "serverClientId", "nonce", "", "filterByAuthorizedAccounts", "linkedServiceId", "", "idTokenDepositionScopes", "requestVerifiedPhoneNumber", "autoSelectEnabled", "toBundle$java_com_google_android_libraries_identity_googleid_granule_granule", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;ZZ)Landroid/os/Bundle;", "toBundle", "BUNDLE_KEY_AUTO_SELECT_ENABLED", "Ljava/lang/String;", "getBUNDLE_KEY_AUTO_SELECT_ENABLED$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", "getBUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", "getBUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_LINKED_SERVICE_ID", "getBUNDLE_KEY_LINKED_SERVICE_ID$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_NONCE", "getBUNDLE_KEY_NONCE$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", "getBUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_SERVER_CLIENT_ID", "getBUNDLE_KEY_SERVER_CLIENT_ID$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: r8.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
            throw null;
        }

        @l
        @n
        public static final Bundle b(@o0 String str, @m String str2, boolean z4, @m String str3, @m List list, boolean z5, boolean z6) {
            l0.p(str, ProtectedSandApp.s("\uefd9"));
            Bundle bundle = new Bundle();
            bundle.putString(ProtectedSandApp.s("\uefda"), str);
            bundle.putString(ProtectedSandApp.s("\uefdb"), str2);
            bundle.putBoolean(ProtectedSandApp.s("\uefdc"), z4);
            bundle.putString(ProtectedSandApp.s("\uefdd"), str3);
            bundle.putStringArrayList(ProtectedSandApp.s("\uefde"), list == null ? null : new ArrayList<>(list));
            bundle.putBoolean(ProtectedSandApp.s("\uefdf"), z5);
            bundle.putBoolean(ProtectedSandApp.s("\uefe0"), z6);
            return bundle;
        }

        @l
        @n
        public final a a(@o0 Bundle data) {
            l0.p(data, ProtectedSandApp.s("\uefe1"));
            try {
                String string = data.getString(ProtectedSandApp.s("\uefda"));
                l0.m(string);
                return new a(string, data.getString(ProtectedSandApp.s("\uefdb")), data.getBoolean(ProtectedSandApp.s("\uefdc"), true), data.getString(ProtectedSandApp.s("\uefdd")), data.getStringArrayList(ProtectedSandApp.s("\uefde")), data.getBoolean(ProtectedSandApp.s("\uefdf"), false), data.getBoolean(ProtectedSandApp.s("\uefe0"), false));
            } catch (Exception e4) {
                throw new GoogleIdTokenParsingException(e4);
            }
        }

        public /* synthetic */ Companion(@o0 kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@o0 String str, @m String str2, boolean z4, @m String str3, @m List<String> list, boolean z5, boolean z6) {
        super(ProtectedSandApp.s("\uefe3"), Companion.b(str, str2, z4, str3, list, z5, z6), Companion.b(str, str2, z4, str3, list, z5, z6), true, z6, (Set) null, 500, 32, (kotlin.jvm.internal.w) null);
        l0.p(str, ProtectedSandApp.s("\uefe2"));
        this.f89750o = str;
        this.f89751p = str2;
        this.f89752q = z4;
        this.f89753r = str3;
        this.f89754s = list;
        this.f89755t = z5;
        this.f89756u = z6;
        if (str.length() <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uefe5"));
        }
        if (z4 && z5) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uefe4"));
        }
    }

    @l
    @n
    public static final a i(@o0 Bundle bundle) {
        return INSTANCE.a(bundle);
    }

    /* renamed from: j, reason: from getter */
    public final boolean getF89756u() {
        return this.f89756u;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getF89752q() {
        return this.f89752q;
    }

    @q0
    public final List<String> l() {
        return this.f89754s;
    }

    @q0
    /* renamed from: m, reason: from getter */
    public final String getF89753r() {
        return this.f89753r;
    }

    @q0
    /* renamed from: n, reason: from getter */
    public final String getF89751p() {
        return this.f89751p;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getF89755t() {
        return this.f89755t;
    }

    @l
    /* renamed from: p, reason: from getter */
    public final String getF89750o() {
        return this.f89750o;
    }
}
