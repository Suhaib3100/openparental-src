package androidx.credentials;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.c1;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.Metadata;

/* compiled from: CreateCredentialRequest.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b&\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0010\u0014BK\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\r\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b!\u0010\u001b¨\u0006\""}, d2 = {"Landroidx/credentials/b;", "", "", "type", "Landroid/os/Bundle;", "credentialData", "candidateQueryData", "", "isSystemProviderRequired", "isAutoSelectAllowed", "Landroidx/credentials/b$b;", "displayInfo", "origin", "preferImmediatelyAvailableCredentials", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLandroidx/credentials/b$b;Ljava/lang/String;Z)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "Landroid/os/Bundle;", "d", "()Landroid/os/Bundle;", "c", "Z", "i", "()Z", "e", "h", "f", "Landroidx/credentials/b$b;", "()Landroidx/credentials/b$b;", "j", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Bundle credentialData;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Bundle candidateQueryData;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isSystemProviderRequired;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isAutoSelectAllowed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final C0444b displayInfo;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String origin;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean preferImmediatelyAvailableCredentials;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static final String f27616j = "androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS";

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static final String f27617k = "androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED";

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: CreateCredentialRequest.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/credentials/b$a;", "", "<init>", "()V", "", "type", "Landroid/os/Bundle;", "credentialData", "candidateQueryData", "", "requireSystemProvider", "origin", "Landroidx/credentials/b;", "b", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLjava/lang/String;)Landroidx/credentials/b;", "BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", "Ljava/lang/String;", "BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.b$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ b c(Companion companion, String str, Bundle bundle, Bundle bundle2, boolean z4, String str2, int i4, Object obj) {
            if ((i4 & 16) != 0) {
                str2 = null;
            }
            return companion.b(str, bundle, bundle2, z4, str2);
        }

        @kd.j
        @fg.l
        @kd.n
        @androidx.annotation.x0(23)
        public final b a(@fg.l String type, @fg.l Bundle credentialData, @fg.l Bundle candidateQueryData, boolean z4) {
            kotlin.jvm.internal.l0.p(type, "type");
            kotlin.jvm.internal.l0.p(credentialData, "credentialData");
            kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
            return c(this, type, credentialData, candidateQueryData, z4, null, 16, null);
        }

        @kd.j
        @fg.l
        @kd.n
        @androidx.annotation.x0(23)
        public final b b(@fg.l String type, @fg.l Bundle credentialData, @fg.l Bundle candidateQueryData, boolean requireSystemProvider, @fg.m String origin) {
            kotlin.jvm.internal.l0.p(type, "type");
            kotlin.jvm.internal.l0.p(credentialData, "credentialData");
            kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
            try {
                if (kotlin.jvm.internal.l0.g(type, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return f.INSTANCE.a(credentialData, origin, candidateQueryData);
                }
                if (!kotlin.jvm.internal.l0.g(type, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    throw new FrameworkClassParsingException();
                }
                String string = credentialData.getString("androidx.credentials.BUNDLE_KEY_SUBTYPE");
                if (string != null && string.hashCode() == 589054771 && string.equals("androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST")) {
                    return h.INSTANCE.a(credentialData, origin, candidateQueryData);
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new d(type, credentialData, candidateQueryData, requireSystemProvider, C0444b.INSTANCE.a(credentialData), credentialData.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), origin, credentialData.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false));
            }
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: CreateCredentialRequest.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00122\u00020\u0001:\u0001\u0010B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u000bB%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/credentials/b$b;", "", "", "userId", "userDisplayName", "Landroid/graphics/drawable/Icon;", "credentialTypeIcon", "", "preferDefaultProvider", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/drawable/Icon;Ljava/lang/String;)V", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;)V", "Landroid/os/Bundle;", "f", "()Landroid/os/Bundle;", "a", "Ljava/lang/CharSequence;", "e", "()Ljava/lang/CharSequence;", "b", "d", "c", "Landroid/graphics/drawable/Icon;", "()Landroid/graphics/drawable/Icon;", "Ljava/lang/String;", "()Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nCreateCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateCredentialRequest.kt\nandroidx/credentials/CreateCredentialRequest$DisplayInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,271:1\n1#2:272\n*E\n"})
    /* renamed from: androidx.credentials.b$b, reason: collision with other inner class name */
    public static final class C0444b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final CharSequence userId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final CharSequence userDisplayName;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final Icon credentialTypeIcon;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final String preferDefaultProvider;

        /* renamed from: f, reason: collision with root package name */
        @fg.l
        @androidx.annotation.c1({c1.a.LIBRARY})
        public static final String f27627f = "androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO";

        /* renamed from: g, reason: collision with root package name */
        @fg.l
        @androidx.annotation.c1({c1.a.LIBRARY})
        public static final String f27628g = "androidx.credentials.BUNDLE_KEY_USER_ID";

        /* renamed from: h, reason: collision with root package name */
        @fg.l
        public static final String f27629h = "androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME";

        /* renamed from: i, reason: collision with root package name */
        @fg.l
        @androidx.annotation.c1({c1.a.LIBRARY})
        public static final String f27630i = "androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON";

        /* renamed from: j, reason: collision with root package name */
        @fg.l
        public static final String f27631j = "androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER";

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* compiled from: CreateCredentialRequest.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Landroidx/credentials/b$b$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "from", "Landroidx/credentials/b$b;", "a", "(Landroid/os/Bundle;)Landroidx/credentials/b$b;", "", "BUNDLE_KEY_CREDENTIAL_TYPE_ICON", "Ljava/lang/String;", "BUNDLE_KEY_DEFAULT_PROVIDER", "BUNDLE_KEY_REQUEST_DISPLAY_INFO", "BUNDLE_KEY_USER_DISPLAY_NAME", "BUNDLE_KEY_USER_ID", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.credentials.b$b$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            @kd.n
            @androidx.annotation.x0(23)
            public final C0444b a(@fg.l Bundle from) {
                kotlin.jvm.internal.l0.p(from, "from");
                try {
                    Bundle bundle = from.getBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO");
                    kotlin.jvm.internal.l0.m(bundle);
                    CharSequence charSequence = bundle.getCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID");
                    CharSequence charSequence2 = bundle.getCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME");
                    Icon icon = (Icon) bundle.getParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON");
                    String string = bundle.getString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER");
                    kotlin.jvm.internal.l0.m(charSequence);
                    return new C0444b(charSequence, charSequence2, icon, string);
                } catch (Exception e4) {
                    throw new IllegalArgumentException(e4);
                }
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        @kd.j
        public C0444b(@fg.l CharSequence userId) {
            this(userId, (CharSequence) null, 2, (kotlin.jvm.internal.w) (0 == true ? 1 : 0));
            kotlin.jvm.internal.l0.p(userId, "userId");
        }

        @fg.l
        @kd.n
        @androidx.annotation.x0(23)
        public static final C0444b a(@fg.l Bundle bundle) {
            return INSTANCE.a(bundle);
        }

        @fg.m
        @androidx.annotation.c1({c1.a.LIBRARY})
        /* renamed from: b, reason: from getter */
        public final Icon getCredentialTypeIcon() {
            return this.credentialTypeIcon;
        }

        @fg.m
        @androidx.annotation.c1({c1.a.LIBRARY})
        /* renamed from: c, reason: from getter */
        public final String getPreferDefaultProvider() {
            return this.preferDefaultProvider;
        }

        @fg.m
        /* renamed from: d, reason: from getter */
        public final CharSequence getUserDisplayName() {
            return this.userDisplayName;
        }

        @fg.l
        /* renamed from: e, reason: from getter */
        public final CharSequence getUserId() {
            return this.userId;
        }

        @fg.l
        @androidx.annotation.c1({c1.a.LIBRARY})
        @androidx.annotation.x0(23)
        public final Bundle f() {
            Bundle bundle = new Bundle();
            bundle.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", this.userId);
            if (!TextUtils.isEmpty(this.userDisplayName)) {
                bundle.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", this.userDisplayName);
            }
            if (!TextUtils.isEmpty(this.preferDefaultProvider)) {
                bundle.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", this.preferDefaultProvider);
            }
            return bundle;
        }

        public C0444b(@fg.l CharSequence userId, @fg.m CharSequence charSequence, @fg.m Icon icon, @fg.m String str) {
            kotlin.jvm.internal.l0.p(userId, "userId");
            this.userId = userId;
            this.userDisplayName = charSequence;
            this.credentialTypeIcon = icon;
            this.preferDefaultProvider = str;
            if (userId.length() <= 0) {
                throw new IllegalArgumentException("userId should not be empty");
            }
        }

        public /* synthetic */ C0444b(CharSequence charSequence, CharSequence charSequence2, int i4, kotlin.jvm.internal.w wVar) {
            this(charSequence, (i4 & 2) != 0 ? null : charSequence2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @kd.j
        public C0444b(@fg.l CharSequence userId, @fg.m CharSequence charSequence) {
            this(userId, charSequence, (Icon) null, (String) null);
            kotlin.jvm.internal.l0.p(userId, "userId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C0444b(@fg.l CharSequence userId, @fg.m CharSequence charSequence, @fg.m String str) {
            this(userId, charSequence, (Icon) null, str);
            kotlin.jvm.internal.l0.p(userId, "userId");
        }
    }

    public b(@fg.l String type, @fg.l Bundle credentialData, @fg.l Bundle candidateQueryData, boolean z4, boolean z5, @fg.l C0444b displayInfo, @fg.m String str, boolean z6) {
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(credentialData, "credentialData");
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.l0.p(displayInfo, "displayInfo");
        this.type = type;
        this.credentialData = credentialData;
        this.candidateQueryData = candidateQueryData;
        this.isSystemProviderRequired = z4;
        this.isAutoSelectAllowed = z5;
        this.displayInfo = displayInfo;
        this.origin = str;
        this.preferImmediatelyAvailableCredentials = z6;
        credentialData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z5);
        credentialData.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z6);
        candidateQueryData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z5);
    }

    @kd.j
    @fg.l
    @kd.n
    @androidx.annotation.x0(23)
    public static final b a(@fg.l String str, @fg.l Bundle bundle, @fg.l Bundle bundle2, boolean z4) {
        return INSTANCE.a(str, bundle, bundle2, z4);
    }

    @kd.j
    @fg.l
    @kd.n
    @androidx.annotation.x0(23)
    public static final b b(@fg.l String str, @fg.l Bundle bundle, @fg.l Bundle bundle2, boolean z4, @fg.m String str2) {
        return INSTANCE.b(str, bundle, bundle2, z4, str2);
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final Bundle getCredentialData() {
        return this.credentialData;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final C0444b getDisplayInfo() {
        return this.displayInfo;
    }

    @fg.m
    /* renamed from: f, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsSystemProviderRequired() {
        return this.isSystemProviderRequired;
    }

    @kd.i(name = "preferImmediatelyAvailableCredentials")
    /* renamed from: j, reason: from getter */
    public final boolean getPreferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }
}
