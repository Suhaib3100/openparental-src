package androidx.credentials;

import android.os.Bundle;
import kotlin.Metadata;

/* compiled from: CreatePasswordResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/credentials/g;", "Landroidx/credentials/c;", "Landroid/os/Bundle;", "data", "<init>", "(Landroid/os/Bundle;)V", "()V", "d", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends c {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: CreatePasswordResponse.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/g$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "data", "Landroidx/credentials/g;", "a", "(Landroid/os/Bundle;)Landroidx/credentials/g;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.g$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final g a(@fg.l Bundle data) {
            kotlin.jvm.internal.l0.p(data, "data");
            return new g(data, null);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ g(Bundle bundle, kotlin.jvm.internal.w wVar) {
        this(bundle);
    }

    @fg.l
    @kd.n
    public static final g d(@fg.l Bundle bundle) {
        return INSTANCE.a(bundle);
    }

    private g(Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
    }

    public g() {
        this(new Bundle());
    }
}
