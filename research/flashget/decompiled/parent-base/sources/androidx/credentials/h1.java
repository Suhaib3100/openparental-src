package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.annotation.c1;
import androidx.credentials.internal.FrameworkClassParsingException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetCredentialRequest.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \u001b2\u00020\u0001:\u0002\u000e\u0010BC\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Landroidx/credentials/h1;", "", "", "Landroidx/credentials/o;", "credentialOptions", "", "origin", "", "preferIdentityDocUi", "Landroid/content/ComponentName;", "preferUiBrandingComponentName", "preferImmediatelyAvailableCredentials", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLandroid/content/ComponentName;Z)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Z", "d", "()Z", "Landroid/content/ComponentName;", "e", "()Landroid/content/ComponentName;", "f", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nGetCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetCredentialRequest.kt\nandroidx/credentials/GetCredentialRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"})
/* loaded from: classes3.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<o> credentialOptions;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String origin;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean preferIdentityDocUi;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ComponentName preferUiBrandingComponentName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean preferImmediatelyAvailableCredentials;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    public static final String f27707g = "androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS";

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final String f27708h = "androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI";

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final String f27709i = "androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME";

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: GetCredentialRequest.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0013J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u0016\u0010\u0018\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010 R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!¨\u0006#"}, d2 = {"Landroidx/credentials/h1$a;", "", "<init>", "()V", "Landroidx/credentials/o;", "credentialOption", "a", "(Landroidx/credentials/o;)Landroidx/credentials/h1$a;", "", "credentialOptions", "c", "(Ljava/util/List;)Landroidx/credentials/h1$a;", "", "origin", "d", "(Ljava/lang/String;)Landroidx/credentials/h1$a;", "", "preferImmediatelyAvailableCredentials", "f", "(Z)Landroidx/credentials/h1$a;", "Landroid/content/ComponentName;", "component", "g", "(Landroid/content/ComponentName;)Landroidx/credentials/h1$a;", "preferIdentityDocUi", "e", "Landroidx/credentials/h1;", "b", "()Landroidx/credentials/h1;", "", "Ljava/util/List;", "Ljava/lang/String;", "Z", "Landroid/content/ComponentName;", "preferUiBrandingComponentName", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private List<o> credentialOptions = new ArrayList();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private String origin;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean preferIdentityDocUi;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean preferImmediatelyAvailableCredentials;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private ComponentName preferUiBrandingComponentName;

        @fg.l
        public final a a(@fg.l o credentialOption) {
            kotlin.jvm.internal.l0.p(credentialOption, "credentialOption");
            this.credentialOptions.add(credentialOption);
            return this;
        }

        @fg.l
        public final h1 b() {
            return new h1(kotlin.collections.w.V5(this.credentialOptions), this.origin, this.preferIdentityDocUi, this.preferUiBrandingComponentName, this.preferImmediatelyAvailableCredentials);
        }

        @fg.l
        public final a c(@fg.l List<? extends o> credentialOptions) {
            kotlin.jvm.internal.l0.p(credentialOptions, "credentialOptions");
            this.credentialOptions = kotlin.collections.w.Y5(credentialOptions);
            return this;
        }

        @fg.l
        public final a d(@fg.l String origin) {
            kotlin.jvm.internal.l0.p(origin, "origin");
            this.origin = origin;
            return this;
        }

        @fg.l
        public final a e(boolean preferIdentityDocUi) {
            this.preferIdentityDocUi = preferIdentityDocUi;
            return this;
        }

        @fg.l
        public final a f(boolean preferImmediatelyAvailableCredentials) {
            this.preferImmediatelyAvailableCredentials = preferImmediatelyAvailableCredentials;
            return this;
        }

        @fg.l
        public final a g(@fg.m ComponentName component) {
            this.preferUiBrandingComponentName = component;
            return this;
        }
    }

    /* compiled from: GetCredentialRequest.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/credentials/h1$b;", "", "<init>", "()V", "Landroidx/credentials/h1;", "request", "Landroid/os/Bundle;", "b", "(Landroidx/credentials/h1;)Landroid/os/Bundle;", "", "Landroidx/credentials/o;", "credentialOptions", "", "origin", "data", "a", "(Ljava/util/List;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/credentials/h1;", "BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", "Ljava/lang/String;", "BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", "BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.h1$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        public final h1 a(@fg.l List<? extends o> credentialOptions, @fg.m String origin, @fg.l Bundle data) {
            kotlin.jvm.internal.l0.p(credentialOptions, "credentialOptions");
            kotlin.jvm.internal.l0.p(data, "data");
            try {
                boolean z4 = data.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI");
                a f4 = new a().c(credentialOptions).e(z4).g((ComponentName) data.getParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME")).f(data.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS"));
                if (origin != null) {
                    f4.d(origin);
                }
                return f4.b();
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        @fg.l
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        public final Bundle b(@fg.l h1 request) {
            kotlin.jvm.internal.l0.p(request, "request");
            Bundle bundle = new Bundle();
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", request.getPreferIdentityDocUi());
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", request.getPreferImmediatelyAvailableCredentials());
            bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", request.getPreferUiBrandingComponentName());
            return bundle;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public h1(@fg.l List<? extends o> credentialOptions) {
        this(credentialOptions, null, false, null, false, 30, null);
        kotlin.jvm.internal.l0.p(credentialOptions, "credentialOptions");
    }

    @fg.l
    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static final h1 a(@fg.l List<? extends o> list, @fg.m String str, @fg.l Bundle bundle) {
        return INSTANCE.a(list, str, bundle);
    }

    @fg.l
    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static final Bundle g(@fg.l h1 h1Var) {
        return INSTANCE.b(h1Var);
    }

    @fg.l
    public final List<o> b() {
        return this.credentialOptions;
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getPreferIdentityDocUi() {
        return this.preferIdentityDocUi;
    }

    @fg.m
    /* renamed from: e, reason: from getter */
    public final ComponentName getPreferUiBrandingComponentName() {
        return this.preferUiBrandingComponentName;
    }

    @kd.i(name = "preferImmediatelyAvailableCredentials")
    /* renamed from: f, reason: from getter */
    public final boolean getPreferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public h1(@fg.l List<? extends o> credentialOptions, @fg.m String str) {
        this(credentialOptions, str, false, null, false, 28, null);
        kotlin.jvm.internal.l0.p(credentialOptions, "credentialOptions");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public h1(@fg.l List<? extends o> credentialOptions, @fg.m String str, boolean z4) {
        this(credentialOptions, str, z4, null, false, 24, null);
        kotlin.jvm.internal.l0.p(credentialOptions, "credentialOptions");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public h1(@fg.l List<? extends o> credentialOptions, @fg.m String str, boolean z4, @fg.m ComponentName componentName) {
        this(credentialOptions, str, z4, componentName, false, 16, null);
        kotlin.jvm.internal.l0.p(credentialOptions, "credentialOptions");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kd.j
    public h1(@fg.l List<? extends o> credentialOptions, @fg.m String str, boolean z4, @fg.m ComponentName componentName, boolean z5) {
        kotlin.jvm.internal.l0.p(credentialOptions, "credentialOptions");
        this.credentialOptions = credentialOptions;
        this.origin = str;
        this.preferIdentityDocUi = z4;
        this.preferUiBrandingComponentName = componentName;
        this.preferImmediatelyAvailableCredentials = z5;
        if (credentialOptions.isEmpty()) {
            throw new IllegalArgumentException("credentialOptions should not be empty");
        }
    }

    public /* synthetic */ h1(List list, String str, boolean z4, ComponentName componentName, boolean z5, int i4, kotlin.jvm.internal.w wVar) {
        this(list, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? false : z4, (i4 & 8) != 0 ? null : componentName, (i4 & 16) != 0 ? false : z5);
    }
}
