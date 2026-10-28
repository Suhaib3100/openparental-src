package androidx.credentials;

import android.os.Bundle;
import androidx.annotation.c1;
import androidx.credentials.b;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.Metadata;

/* compiled from: CreatePasswordRequest.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018BQ\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fB9\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0010B=\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/credentials/f;", "Landroidx/credentials/b;", "", "id", "password", "", "isAutoSelectAllowed", "Landroidx/credentials/b$b;", "displayInfo", "origin", "preferImmediatelyAvailableCredentials", "Landroid/os/Bundle;", "credentialData", "candidateQueryData", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/credentials/b$b;Ljava/lang/String;ZLandroid/os/Bundle;Landroid/os/Bundle;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "preferDefaultProvider", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "l", "Ljava/lang/String;", "()Ljava/lang/String;", "m", "n", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCreatePasswordRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatePasswordRequest.kt\nandroidx/credentials/CreatePasswordRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
/* loaded from: classes3.dex */
public final class f extends b {

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String id;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String password;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static final String f27694p = "androidx.credentials.BUNDLE_KEY_PASSWORD";

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static final String f27693o = "androidx.credentials.BUNDLE_KEY_ID";

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: CreatePasswordRequest.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/credentials/f$a;", "", "<init>", "()V", "", "id", "password", "Landroid/os/Bundle;", "c", "(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;", "b", "()Landroid/os/Bundle;", "data", "origin", "candidateQueryData", "Landroidx/credentials/f;", "a", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/credentials/f;", "BUNDLE_KEY_ID", "Ljava/lang/String;", "BUNDLE_KEY_PASSWORD", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.f$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        @androidx.annotation.x0(23)
        public final f a(@fg.l Bundle data, @fg.m String origin, @fg.l Bundle candidateQueryData) {
            b.C0444b c0444b;
            kotlin.jvm.internal.l0.p(data, "data");
            kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                kotlin.jvm.internal.l0.m(string);
                String string2 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                kotlin.jvm.internal.l0.m(string2);
                try {
                    c0444b = b.C0444b.INSTANCE.a(data);
                } catch (IllegalArgumentException unused) {
                    c0444b = new b.C0444b(string, null);
                }
                return new f(string, string2, data.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), c0444b, origin, data.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false), data, candidateQueryData, null);
            } catch (Exception unused2) {
                throw new FrameworkClassParsingException();
            }
        }

        @fg.l
        @kd.n
        public final Bundle b() {
            return new Bundle();
        }

        @fg.l
        @kd.n
        public final Bundle c(@fg.l String id2, @fg.l String password) {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public f(@fg.l String id2, @fg.l String password) {
        this(id2, password, null, false, false, 28, null);
        kotlin.jvm.internal.l0.p(id2, "id");
        kotlin.jvm.internal.l0.p(password, "password");
    }

    @fg.l
    @kd.n
    @androidx.annotation.x0(23)
    public static final f k(@fg.l Bundle bundle, @fg.m String str, @fg.l Bundle bundle2) {
        return INSTANCE.a(bundle, str, bundle2);
    }

    @fg.l
    @kd.n
    public static final Bundle n() {
        INSTANCE.getClass();
        return new Bundle();
    }

    @fg.l
    @kd.n
    public static final Bundle o(@fg.l String str, @fg.l String str2) {
        return INSTANCE.c(str, str2);
    }

    @fg.l
    /* renamed from: l, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public f(@fg.l String id2, @fg.l String password, @fg.m String str) {
        this(id2, password, str, false, false, 24, null);
        kotlin.jvm.internal.l0.p(id2, "id");
        kotlin.jvm.internal.l0.p(password, "password");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public f(@fg.l String id2, @fg.l String password, @fg.m String str, boolean z4) {
        this(id2, password, str, z4, false, 16, null);
        kotlin.jvm.internal.l0.p(id2, "id");
        kotlin.jvm.internal.l0.p(password, "password");
    }

    public /* synthetic */ f(String str, String str2, boolean z4, b.C0444b c0444b, String str3, boolean z5, Bundle bundle, Bundle bundle2, kotlin.jvm.internal.w wVar) {
        this(str, str2, z4, c0444b, str3, z5, bundle, bundle2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    f(java.lang.String r12, java.lang.String r13, boolean r14, androidx.credentials.b.C0444b r15, java.lang.String r16, boolean r17, android.os.Bundle r18, android.os.Bundle r19, int r20, kotlin.jvm.internal.w r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 16
            if (r1 == 0) goto L9
            r1 = 0
            r7 = r1
            goto Lb
        L9:
            r7 = r16
        Lb:
            r1 = r0 & 64
            if (r1 == 0) goto L19
            androidx.credentials.f$a r1 = androidx.credentials.f.INSTANCE
            r3 = r12
            r4 = r13
            android.os.Bundle r1 = r1.c(r12, r13)
            r9 = r1
            goto L1d
        L19:
            r3 = r12
            r4 = r13
            r9 = r18
        L1d:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L2d
            androidx.credentials.f$a r0 = androidx.credentials.f.INSTANCE
            r0.getClass()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r10 = r0
            goto L2f
        L2d:
            r10 = r19
        L2f:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r8 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.f.<init>(java.lang.String, java.lang.String, boolean, androidx.credentials.b$b, java.lang.String, boolean, android.os.Bundle, android.os.Bundle, int, kotlin.jvm.internal.w):void");
    }

    private f(String str, String str2, boolean z4, b.C0444b c0444b, String str3, boolean z5, Bundle bundle, Bundle bundle2) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle, bundle2, false, z4, c0444b, str3, z5);
        this.id = str;
        this.password = str2;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }

    public /* synthetic */ f(String str, String str2, String str3, boolean z4, boolean z5, int i4, kotlin.jvm.internal.w wVar) {
        this(str, str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? false : z4, (i4 & 16) != 0 ? false : z5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public f(@fg.l String id2, @fg.l String password, @fg.m String str, boolean z4, boolean z5) {
        this(id2, password, z5, new b.C0444b(id2, null), str, z4, null, null, 192, null);
        kotlin.jvm.internal.l0.p(id2, "id");
        kotlin.jvm.internal.l0.p(password, "password");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(@fg.l String id2, @fg.l String password, @fg.m String str, @fg.m String str2, boolean z4, boolean z5) {
        this(id2, password, z5, new b.C0444b(id2, null, str2), str, z4, null, null, 192, null);
        kotlin.jvm.internal.l0.p(id2, "id");
        kotlin.jvm.internal.l0.p(password, "password");
    }
}
