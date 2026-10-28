package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BeginCreateCredentialResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u000b2\u00020\u0001:\u0003\t\r\u000bB#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/credentials/provider/q;", "", "", "Landroidx/credentials/provider/e0;", "createEntries", "Landroidx/credentials/provider/g2;", "remoteEntry", "<init>", "(Ljava/util/List;Landroidx/credentials/provider/g2;)V", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Landroidx/credentials/provider/g2;", "d", "()Landroidx/credentials/provider/g2;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<e0> createEntries;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final g2 remoteEntry;

    /* compiled from: BeginCreateCredentialResponse.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/credentials/provider/q$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Landroidx/credentials/provider/q;", "response", "Lkotlin/k2;", "a", "(Landroid/os/Bundle;Landroidx/credentials/provider/q;)V", "b", "(Landroid/os/Bundle;)Landroidx/credentials/provider/q;", "", "Ljava/lang/String;", "REQUEST_KEY", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(34)
    private static final class a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final String REQUEST_KEY = "androidx.credentials.provider.BeginCreateCredentialResponse";

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f28107a = new a();

        private a() {
        }

        @androidx.annotation.u
        @kd.n
        public static final void a(@fg.l Bundle bundle, @fg.l q response) {
            kotlin.jvm.internal.l0.p(bundle, "bundle");
            kotlin.jvm.internal.l0.p(response, "response");
            bundle.putParcelable("androidx.credentials.provider.BeginCreateCredentialResponse", androidx.credentials.provider.utils.w.INSTANCE.e(response));
        }

        @androidx.annotation.u
        @fg.m
        @kd.n
        public static final q b(@fg.l Bundle bundle) {
            kotlin.jvm.internal.l0.p(bundle, "bundle");
            BeginCreateCredentialResponse beginCreateCredentialResponse = (BeginCreateCredentialResponse) bundle.getParcelable("androidx.credentials.provider.BeginCreateCredentialResponse", BeginCreateCredentialResponse.class);
            if (beginCreateCredentialResponse != null) {
                return androidx.credentials.provider.utils.w.INSTANCE.g(beginCreateCredentialResponse);
            }
            return null;
        }
    }

    /* compiled from: BeginCreateCredentialResponse.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/credentials/provider/q$b;", "", "<init>", "()V", "", "Landroidx/credentials/provider/e0;", "createEntries", "c", "(Ljava/util/List;)Landroidx/credentials/provider/q$b;", "createEntry", "a", "(Landroidx/credentials/provider/e0;)Landroidx/credentials/provider/q$b;", "Landroidx/credentials/provider/g2;", "remoteEntry", "d", "(Landroidx/credentials/provider/g2;)Landroidx/credentials/provider/q$b;", "Landroidx/credentials/provider/q;", "b", "()Landroidx/credentials/provider/q;", "", "Ljava/util/List;", "Landroidx/credentials/provider/g2;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private List<e0> createEntries = new ArrayList();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private g2 remoteEntry;

        @fg.l
        public final b a(@fg.l e0 createEntry) {
            kotlin.jvm.internal.l0.p(createEntry, "createEntry");
            this.createEntries.add(createEntry);
            return this;
        }

        @fg.l
        public final q b() {
            return new q(kotlin.collections.w.V5(this.createEntries), this.remoteEntry);
        }

        @fg.l
        public final b c(@fg.l List<e0> createEntries) {
            kotlin.jvm.internal.l0.p(createEntries, "createEntries");
            this.createEntries = kotlin.collections.w.Y5(createEntries);
            return this;
        }

        @fg.l
        public final b d(@fg.m g2 remoteEntry) {
            this.remoteEntry = remoteEntry;
            return this;
        }
    }

    /* compiled from: BeginCreateCredentialResponse.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/credentials/provider/q$c;", "", "<init>", "()V", "Landroidx/credentials/provider/q;", "response", "Landroid/os/Bundle;", "a", "(Landroidx/credentials/provider/q;)Landroid/os/Bundle;", "bundle", "b", "(Landroid/os/Bundle;)Landroidx/credentials/provider/q;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.q$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final Bundle a(@fg.l q response) {
            kotlin.jvm.internal.l0.p(response, "response");
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                a.a(bundle, response);
            }
            return bundle;
        }

        @fg.m
        @kd.n
        public final q b(@fg.l Bundle bundle) {
            kotlin.jvm.internal.l0.p(bundle, "bundle");
            if (Build.VERSION.SDK_INT >= 34) {
                return a.b(bundle);
            }
            return null;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public q() {
        this(null, null, 3, null);
    }

    @fg.l
    @kd.n
    public static final Bundle a(@fg.l q qVar) {
        return INSTANCE.a(qVar);
    }

    @fg.m
    @kd.n
    public static final q b(@fg.l Bundle bundle) {
        return INSTANCE.b(bundle);
    }

    @fg.l
    public final List<e0> c() {
        return this.createEntries;
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final g2 getRemoteEntry() {
        return this.remoteEntry;
    }

    public q(@fg.l List<e0> createEntries, @fg.m g2 g2Var) {
        kotlin.jvm.internal.l0.p(createEntries, "createEntries");
        this.createEntries = createEntries;
        this.remoteEntry = g2Var;
    }

    public q(List list, g2 g2Var, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? kotlin.collections.j0.f74919b : list, (i4 & 2) != 0 ? null : g2Var);
    }
}
