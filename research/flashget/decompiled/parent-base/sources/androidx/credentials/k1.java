package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: GetPasswordOption.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016BG\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB3\b\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\u000e\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/credentials/k1;", "Landroidx/credentials/o;", "", "", "allowedUserIds", "", "isAutoSelectAllowed", "Landroid/content/ComponentName;", "allowedProviders", "Landroid/os/Bundle;", "requestData", "candidateQueryData", "", "typePriorityHint", "<init>", "(Ljava/util/Set;ZLjava/util/Set;Landroid/os/Bundle;Landroid/os/Bundle;I)V", "(Ljava/util/Set;ZLjava/util/Set;)V", "o", "Ljava/util/Set;", "j", "()Ljava/util/Set;", "p", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k1 extends o {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Set<String> allowedUserIds;

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    public static final String f27728q = "androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS";

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: GetPasswordOption.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/credentials/k1$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "data", "", "Landroid/content/ComponentName;", "allowedProviders", "candidateQueryData", "Landroidx/credentials/k1;", "a", "(Landroid/os/Bundle;Ljava/util/Set;Landroid/os/Bundle;)Landroidx/credentials/k1;", "", "allowUserIds", "b", "(Ljava/util/Set;)Landroid/os/Bundle;", "BUNDLE_KEY_ALLOWED_USER_IDS", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.k1$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final k1 a(@fg.l Bundle data, @fg.l Set<ComponentName> allowedProviders, @fg.l Bundle candidateQueryData) {
            Set set;
            kotlin.jvm.internal.l0.p(data, "data");
            kotlin.jvm.internal.l0.p(allowedProviders, "allowedProviders");
            kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
            ArrayList<String> stringArrayList = data.getStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS");
            if (stringArrayList == null || (set = kotlin.collections.w.a6(stringArrayList)) == null) {
                set = kotlin.collections.l0.f74939b;
            }
            return new k1(set, data.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), allowedProviders, data, candidateQueryData, data.getInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 1000), null);
        }

        @fg.l
        @kd.n
        public final Bundle b(@fg.l Set<String> allowUserIds) {
            kotlin.jvm.internal.l0.p(allowUserIds, "allowUserIds");
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(allowUserIds));
            return bundle;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    @kd.j
    public k1() {
        this(null, false, null, 7, null);
    }

    @fg.l
    @kd.n
    public static final k1 i(@fg.l Bundle bundle, @fg.l Set<ComponentName> set, @fg.l Bundle bundle2) {
        return INSTANCE.a(bundle, set, bundle2);
    }

    @fg.l
    @kd.n
    public static final Bundle k(@fg.l Set<String> set) {
        return INSTANCE.b(set);
    }

    @fg.l
    public final Set<String> j() {
        return this.allowedUserIds;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public k1(@fg.l Set<String> allowedUserIds) {
        this(allowedUserIds, false, null, 6, null);
        kotlin.jvm.internal.l0.p(allowedUserIds, "allowedUserIds");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public k1(@fg.l Set<String> allowedUserIds, boolean z4) {
        this(allowedUserIds, z4, null, 4, null);
        kotlin.jvm.internal.l0.p(allowedUserIds, "allowedUserIds");
    }

    public /* synthetic */ k1(Set set, boolean z4, Set set2, Bundle bundle, Bundle bundle2, int i4, kotlin.jvm.internal.w wVar) {
        this(set, z4, set2, bundle, bundle2, i4);
    }

    /* synthetic */ k1(Set set, boolean z4, Set set2, Bundle bundle, Bundle bundle2, int i4, int i5, kotlin.jvm.internal.w wVar) {
        this(set, z4, set2, bundle, bundle2, (i5 & 32) != 0 ? 1000 : i4);
    }

    public k1(Set set, boolean z4, Set set2, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? kotlin.collections.l0.f74939b : set, (i4 & 2) != 0 ? false : z4, (i4 & 4) != 0 ? kotlin.collections.l0.f74939b : set2);
    }

    private k1(Set<String> set, boolean z4, Set<ComponentName> set2, Bundle bundle, Bundle bundle2, int i4) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle, bundle2, false, z4, set2, i4);
        this.allowedUserIds = set;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kd.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k1(@fg.l java.util.Set<java.lang.String> r11, boolean r12, @fg.l java.util.Set<android.content.ComponentName> r13) {
        /*
            r10 = this;
            java.lang.String r0 = "allowedUserIds"
            kotlin.jvm.internal.l0.p(r11, r0)
            java.lang.String r0 = "allowedProviders"
            kotlin.jvm.internal.l0.p(r13, r0)
            androidx.credentials.k1$a r0 = androidx.credentials.k1.INSTANCE
            android.os.Bundle r5 = r0.b(r11)
            android.os.Bundle r6 = r0.b(r11)
            r8 = 32
            r9 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.k1.<init>(java.util.Set, boolean, java.util.Set):void");
    }
}
