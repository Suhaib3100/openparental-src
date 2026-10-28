package r8;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.credentials.f1;
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 \u000e2\u00020\u0001:\u0002\u001a\u001bBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0010\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u0012¨\u0006\u001c"}, d2 = {"Lr8/c;", "Landroidx/credentials/f1;", "", "id", "idToken", "displayName", "familyName", "givenName", "Landroid/net/Uri;", "profilePictureUri", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "Landroid/net/Uri;", "k", "()Landroid/net/Uri;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "f", "g", "h", "i", "j", "getPhoneNumber$annotations", "()V", "a", "b", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nGoogleIdTokenCredential.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleIdTokenCredential.kt\ncom/google/android/libraries/identity/googleid/GoogleIdTokenCredential\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,197:1\n1#2:198\n*E\n"})
/* loaded from: classes5.dex */
public final class c extends f1 {

    /* renamed from: d, reason: collision with root package name */
    @l
    private final String f89775d;

    /* renamed from: e, reason: collision with root package name */
    @l
    private final String f89776e;

    /* renamed from: f, reason: collision with root package name */
    @m
    private final String f89777f;

    /* renamed from: g, reason: collision with root package name */
    @m
    private final String f89778g;

    /* renamed from: h, reason: collision with root package name */
    @m
    private final String f89779h;

    /* renamed from: i, reason: collision with root package name */
    @m
    private final Uri f89780i;

    /* renamed from: j, reason: collision with root package name */
    @m
    private final String f89781j;

    /* renamed from: l, reason: collision with root package name */
    @l
    public static final String f89772l = ProtectedSandApp.s("\ueffd");

    /* renamed from: m, reason: collision with root package name */
    @l
    public static final String f89773m = ProtectedSandApp.s("\ueffe");

    /* renamed from: n, reason: collision with root package name */
    @l
    public static final String f89774n = ProtectedSandApp.s("\uefff");

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: com.google.android.libraries.identity.googleid:googleid@@1.1.1 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0007J\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lr8/c$a;", "", "<init>", "()V", "", "displayName", "b", "(Ljava/lang/String;)Lr8/c$a;", "familyName", "c", "givenName", "d", "id", "e", "idToken", "f", "phoneNumber", "g", "Landroid/net/Uri;", "profilePictureUri", "h", "(Landroid/net/Uri;)Lr8/c$a;", "Lr8/c;", "a", "()Lr8/c;", "Ljava/lang/String;", "Landroid/net/Uri;", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        private String f89782a = "";

        /* renamed from: b, reason: collision with root package name */
        @l
        private String f89783b = "";

        /* renamed from: c, reason: collision with root package name */
        @m
        private String f89784c;

        /* renamed from: d, reason: collision with root package name */
        @m
        private String f89785d;

        /* renamed from: e, reason: collision with root package name */
        @m
        private String f89786e;

        /* renamed from: f, reason: collision with root package name */
        @m
        private Uri f89787f;

        /* renamed from: g, reason: collision with root package name */
        @m
        private String f89788g;

        @l
        public final c a() {
            return new c(this.f89782a, this.f89783b, this.f89784c, this.f89785d, this.f89786e, this.f89787f, this.f89788g);
        }

        @l
        public final a b(@m String displayName) {
            this.f89784c = displayName;
            return this;
        }

        @l
        public final a c(@m String familyName) {
            this.f89785d = familyName;
            return this;
        }

        @l
        public final a d(@m String givenName) {
            this.f89786e = givenName;
            return this;
        }

        @l
        public final a e(@o0 String id2) {
            l0.p(id2, ProtectedSandApp.s("\ueff3"));
            this.f89782a = id2;
            return this;
        }

        @l
        public final a f(@o0 String idToken) {
            l0.p(idToken, ProtectedSandApp.s("\ueff4"));
            this.f89783b = idToken;
            return this;
        }

        @l
        public final a g(@m String phoneNumber) {
            this.f89788g = phoneNumber;
            return this;
        }

        @l
        public final a h(@m Uri profilePictureUri) {
            this.f89787f = profilePictureUri;
            return this;
        }
    }

    /* compiled from: com.google.android.libraries.identity.googleid:googleid@@1.1.1 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJQ\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0017\u0010\u0003R\u001a\u0010\u0018\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u0012\u0004\b\u0019\u0010\u0003R\u001a\u0010\u001a\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u0012\u0004\b\u001b\u0010\u0003R\u0014\u0010\u001c\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u0012\u0004\b\u001e\u0010\u0003R\u001a\u0010\u001f\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u0012\u0004\b \u0010\u0003R\u001a\u0010!\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b!\u0010\u0016\u0012\u0004\b\"\u0010\u0003R\u001a\u0010#\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b#\u0010\u0016\u0012\u0004\b$\u0010\u0003R\u0014\u0010%\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0016R\u0014\u0010&\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0016¨\u0006'"}, d2 = {"Lr8/c$b;", "", "<init>", "()V", "Landroid/os/Bundle;", "data", "Lr8/c;", "a", "(Landroid/os/Bundle;)Lr8/c;", "", "id", "idToken", "displayName", "familyName", "givenName", "Landroid/net/Uri;", "profilePictureUri", "phoneNumber", "toBundle$java_com_google_android_libraries_identity_googleid_granule_granule", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)Landroid/os/Bundle;", "toBundle", "BUNDLE_KEY_DISPLAY_NAME", "Ljava/lang/String;", "getBUNDLE_KEY_DISPLAY_NAME$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_FAMILY_NAME", "getBUNDLE_KEY_FAMILY_NAME$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_GIVEN_NAME", "getBUNDLE_KEY_GIVEN_NAME$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "BUNDLE_KEY_ID", "getBUNDLE_KEY_ID$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_ID_TOKEN", "getBUNDLE_KEY_ID_TOKEN$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_PHONE_NUMBER", "getBUNDLE_KEY_PHONE_NUMBER$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_PROFILE_PICTURE_URI", "getBUNDLE_KEY_PROFILE_PICTURE_URI$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", "TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: r8.c$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
            throw null;
        }

        @l
        @n
        public final c a(@o0 Bundle data) {
            l0.p(data, ProtectedSandApp.s("\ueff5"));
            try {
                String string = data.getString(ProtectedSandApp.s("\ueff6"));
                String string2 = data.getString(ProtectedSandApp.s("\ueff7"));
                String string3 = data.getString(ProtectedSandApp.s("\ueff8"));
                String string4 = data.getString(ProtectedSandApp.s("\ueff9"));
                String string5 = data.getString(ProtectedSandApp.s("\ueffa"));
                int i4 = Build.VERSION.SDK_INT;
                String s4 = ProtectedSandApp.s("\ueffb");
                Uri uri = i4 >= 33 ? (Uri) com.flashget.parentalcontrol.ui.ios_app_manager.time_limit.c.a(data, s4, Uri.class) : (Uri) data.getParcelable(s4);
                String string6 = data.getString(ProtectedSandApp.s("\ueffc"));
                l0.m(string);
                l0.m(string2);
                return new c(string, string2, string3, string4, string5, uri, string6);
            } catch (Exception e4) {
                throw new GoogleIdTokenParsingException(e4);
            }
        }

        public /* synthetic */ Companion(@o0 w wVar) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(@androidx.annotation.o0 java.lang.String r3, @androidx.annotation.o0 java.lang.String r4, @fg.m java.lang.String r5, @fg.m java.lang.String r6, @fg.m java.lang.String r7, @fg.m android.net.Uri r8, @fg.m java.lang.String r9) {
        /*
            r2 = this;
            java.lang.String r0 = "\uf000"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r1 = "\uf001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.p(r4, r1)
            kotlin.jvm.internal.l0.p(r3, r0)
            kotlin.jvm.internal.l0.p(r4, r1)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "\uf002"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.putString(r1, r3)
            java.lang.String r1 = "\uf003"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.putString(r1, r4)
            java.lang.String r1 = "\uf004"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.putString(r1, r5)
            java.lang.String r1 = "\uf005"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.putString(r1, r6)
            java.lang.String r1 = "\uf006"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.putString(r1, r7)
            java.lang.String r1 = "\uf007"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.putString(r1, r9)
            java.lang.String r1 = "\uf008"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.putParcelable(r1, r8)
            java.lang.String r1 = "\ueffd"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r2.<init>(r1, r0)
            r2.f89775d = r3
            r2.f89776e = r4
            r2.f89777f = r5
            r2.f89778g = r6
            r2.f89779h = r7
            r2.f89780i = r8
            r2.f89781j = r9
            int r3 = r3.length()
            if (r3 <= 0) goto L8c
            int r3 = r4.length()
            if (r3 <= 0) goto L80
            return
        L80:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "\uf009"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            r3.<init>(r4)
            throw r3
        L8c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "\uf00a"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: r8.c.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.net.Uri, java.lang.String):void");
    }

    @l
    @n
    public static final c d(@o0 Bundle bundle) {
        return INSTANCE.a(bundle);
    }

    @q0
    /* renamed from: e, reason: from getter */
    public final String getF89777f() {
        return this.f89777f;
    }

    @q0
    /* renamed from: f, reason: from getter */
    public final String getF89778g() {
        return this.f89778g;
    }

    @q0
    /* renamed from: g, reason: from getter */
    public final String getF89779h() {
        return this.f89779h;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getF89775d() {
        return this.f89775d;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final String getF89776e() {
        return this.f89776e;
    }

    @q0
    /* renamed from: j, reason: from getter */
    public final String getF89781j() {
        return this.f89781j;
    }

    @q0
    /* renamed from: k, reason: from getter */
    public final Uri getF89780i() {
        return this.f89780i;
    }
}
