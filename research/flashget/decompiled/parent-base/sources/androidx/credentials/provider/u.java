package androidx.credentials.provider;

import android.os.Bundle;
import kotlin.Metadata;

/* compiled from: BeginGetCredentialOption.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\r\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/credentials/provider/u;", "", "", "id", "type", "Landroid/os/Bundle;", "candidateQueryData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "d", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class u {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Bundle candidateQueryData;

    /* compiled from: BeginGetCredentialOption.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/credentials/provider/u$a;", "", "<init>", "()V", "", "id", "type", "Landroid/os/Bundle;", "candidateQueryData", "Landroidx/credentials/provider/u;", "a", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/credentials/provider/u;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.u$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final u a(@fg.l String id2, @fg.l String type, @fg.l Bundle candidateQueryData) {
            kotlin.jvm.internal.l0.p(id2, "id");
            kotlin.jvm.internal.l0.p(type, "type");
            kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
            return kotlin.jvm.internal.l0.g(type, "android.credentials.TYPE_PASSWORD_CREDENTIAL") ? y.INSTANCE.b(candidateQueryData, id2) : kotlin.jvm.internal.l0.g(type, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL") ? z.INSTANCE.a(candidateQueryData, id2) : new x(id2, type, candidateQueryData);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public u(@fg.l String id2, @fg.l String type, @fg.l Bundle candidateQueryData) {
        kotlin.jvm.internal.l0.p(id2, "id");
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(candidateQueryData, "candidateQueryData");
        this.id = id2;
        this.type = type;
        this.candidateQueryData = candidateQueryData;
    }

    @fg.l
    @kd.n
    public static final u a(@fg.l String str, @fg.l String str2, @fg.l Bundle bundle) {
        return INSTANCE.a(str, str2, bundle);
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
