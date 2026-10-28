package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.annotation.c1;
import androidx.credentials.internal.FrameworkClassParsingException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: CredentialOption.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b&\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0011\u0015BG\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0015\u0010 R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u001e\u0010\"¨\u0006#"}, d2 = {"Landroidx/credentials/o;", "", "", "type", "Landroid/os/Bundle;", "requestData", "candidateQueryData", "", "isSystemProviderRequired", "isAutoSelectAllowed", "", "Landroid/content/ComponentName;", "allowedProviders", "", "typePriorityHint", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;I)V", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "Landroid/os/Bundle;", "d", "()Landroid/os/Bundle;", "c", "Z", "h", "()Z", "g", "f", "Ljava/util/Set;", "()Ljava/util/Set;", "I", "()I", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: i, reason: collision with root package name */
    public static final int f27758i = 100;

    /* renamed from: j, reason: collision with root package name */
    public static final int f27759j = 500;

    /* renamed from: k, reason: collision with root package name */
    public static final int f27760k = 1000;

    /* renamed from: l, reason: collision with root package name */
    public static final int f27761l = 2000;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Bundle requestData;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Bundle candidateQueryData;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isSystemProviderRequired;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isAutoSelectAllowed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Set<ComponentName> allowedProviders;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int typePriorityHint;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    public static final String f27762m = "androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED";

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    public static final String f27763n = "androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE";

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: CredentialOption.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/credentials/o$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "data", "", "b", "(Landroid/os/Bundle;)Z", "", "type", "requestData", "candidateQueryData", "requireSystemProvider", "", "Landroid/content/ComponentName;", "allowedProviders", "Landroidx/credentials/o;", "a", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLjava/util/Set;)Landroidx/credentials/o;", "BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", "Ljava/lang/String;", "BUNDLE_KEY_TYPE_PRIORITY_VALUE", "", "PRIORITY_DEFAULT", "I", "PRIORITY_OIDC_OR_SIMILAR", "PRIORITY_PASSKEY_OR_SIMILAR", "PRIORITY_PASSWORD_OR_SIMILAR", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.o$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        public final o a(@fg.l String type, @fg.l Bundle requestData, @fg.l Bundle candidateQueryData, boolean requireSystemProvider, @fg.l Set<ComponentName> allowedProviders) {
            kotlin.jvm.internal.l0.p(type, "type");
            kotlin.jvm.internal.l0.p(requestData, "requestData");
            kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
            kotlin.jvm.internal.l0.p(allowedProviders, "allowedProviders");
            try {
                if (kotlin.jvm.internal.l0.g(type, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return k1.INSTANCE.a(requestData, allowedProviders, candidateQueryData);
                }
                if (!kotlin.jvm.internal.l0.g(type, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    throw new FrameworkClassParsingException();
                }
                String string = requestData.getString("androidx.credentials.BUNDLE_KEY_SUBTYPE");
                if (string != null && string.hashCode() == -613058807 && string.equals("androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION")) {
                    return l1.INSTANCE.a(requestData, allowedProviders, candidateQueryData);
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new j1(requestData, type, candidateQueryData, requireSystemProvider, requestData.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), allowedProviders, requestData.getInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 2000));
            }
        }

        public final boolean b(@fg.l Bundle data) {
            kotlin.jvm.internal.l0.p(data, "data");
            return data.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED");
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: CredentialOption.kt */
    @Target({ElementType.PARAMETER, ElementType.TYPE_USE})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/o$b;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.c1({c1.a.LIBRARY})
    @dd.e(dd.a.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    @dd.f(allowedTargets = {dd.b.PROPERTY, dd.b.VALUE_PARAMETER, dd.b.TYPE})
    public @interface b {
    }

    public o(@fg.l String type, @fg.l Bundle requestData, @fg.l Bundle candidateQueryData, boolean z4, boolean z5, @fg.l Set<ComponentName> allowedProviders, int i4) {
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(requestData, "requestData");
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.l0.p(allowedProviders, "allowedProviders");
        this.type = type;
        this.requestData = requestData;
        this.candidateQueryData = candidateQueryData;
        this.isSystemProviderRequired = z4;
        this.isAutoSelectAllowed = z5;
        this.allowedProviders = allowedProviders;
        this.typePriorityHint = i4;
        requestData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z5);
        candidateQueryData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z5);
        requestData.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i4);
        candidateQueryData.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i4);
    }

    @fg.l
    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static final o a(@fg.l String str, @fg.l Bundle bundle, @fg.l Bundle bundle2, boolean z4, @fg.l Set<ComponentName> set) {
        return INSTANCE.a(str, bundle, bundle2, z4, set);
    }

    @fg.l
    public final Set<ComponentName> b() {
        return this.allowedProviders;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final Bundle getRequestData() {
        return this.requestData;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: f, reason: from getter */
    public final int getTypePriorityHint() {
        return this.typePriorityHint;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsSystemProviderRequired() {
        return this.isSystemProviderRequired;
    }
}
