package androidx.credentials.provider;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: BeginGetPasswordOption.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0001\u000eB%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/credentials/provider/y;", "Landroidx/credentials/provider/u;", "", "", "allowedUserIds", "Landroid/os/Bundle;", "candidateQueryData", "id", "<init>", "(Ljava/util/Set;Landroid/os/Bundle;Ljava/lang/String;)V", "e", "Ljava/util/Set;", "f", "()Ljava/util/Set;", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class y extends u {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Set<String> allowedUserIds;

    /* compiled from: BeginGetPasswordOption.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/credentials/provider/y$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "data", "", "id", "Landroidx/credentials/provider/y;", "a", "(Landroid/os/Bundle;Ljava/lang/String;)Landroidx/credentials/provider/y;", "b", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.y$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        @androidx.annotation.m1
        public final y a(@fg.l Bundle data, @fg.l String id2) {
            kotlin.jvm.internal.l0.p(data, "data");
            kotlin.jvm.internal.l0.p(id2, "id");
            return b(data, id2);
        }

        @fg.l
        public final y b(@fg.l Bundle data, @fg.l String id2) {
            Set set;
            kotlin.jvm.internal.l0.p(data, "data");
            kotlin.jvm.internal.l0.p(id2, "id");
            ArrayList<String> stringArrayList = data.getStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS");
            if (stringArrayList == null || (set = kotlin.collections.w.a6(stringArrayList)) == null) {
                set = kotlin.collections.l0.f74939b;
            }
            return new y(set, data, id2);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@fg.l Set<String> allowedUserIds, @fg.l Bundle candidateQueryData, @fg.l String id2) {
        super(id2, "android.credentials.TYPE_PASSWORD_CREDENTIAL", candidateQueryData);
        kotlin.jvm.internal.l0.p(allowedUserIds, "allowedUserIds");
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.l0.p(id2, "id");
        this.allowedUserIds = allowedUserIds;
    }

    @fg.l
    @kd.n
    @androidx.annotation.m1
    public static final y e(@fg.l Bundle bundle, @fg.l String str) {
        return INSTANCE.a(bundle, str);
    }

    @fg.l
    public final Set<String> f() {
        return this.allowedUserIds;
    }
}
