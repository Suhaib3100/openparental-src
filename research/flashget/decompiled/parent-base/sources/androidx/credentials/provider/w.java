package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import android.service.credentials.BeginGetCredentialResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BeginGetCredentialResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u000f2\u00020\u0001:\u0003\r\u0011\u0012BC\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/credentials/provider/w;", "", "", "Landroidx/credentials/provider/f0;", "credentialEntries", "Landroidx/credentials/provider/a;", "actions", "Landroidx/credentials/provider/o;", "authenticationActions", "Landroidx/credentials/provider/g2;", "remoteEntry", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/credentials/provider/g2;)V", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "c", "d", "Landroidx/credentials/provider/g2;", "f", "()Landroidx/credentials/provider/g2;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<f0> credentialEntries;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<androidx.credentials.provider.a> actions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<o> authenticationActions;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final g2 remoteEntry;

    /* compiled from: BeginGetCredentialResponse.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/credentials/provider/w$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Landroidx/credentials/provider/w;", "response", "Lkotlin/k2;", "a", "(Landroid/os/Bundle;Landroidx/credentials/provider/w;)V", "b", "(Landroid/os/Bundle;)Landroidx/credentials/provider/w;", "", "Ljava/lang/String;", "REQUEST_KEY", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(34)
    private static final class a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final String REQUEST_KEY = "androidx.credentials.provider.BeginGetCredentialResponse";

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f28207a = new a();

        private a() {
        }

        @androidx.annotation.u
        @kd.n
        public static final void a(@fg.l Bundle bundle, @fg.l w response) {
            kotlin.jvm.internal.l0.p(bundle, "bundle");
            kotlin.jvm.internal.l0.p(response, "response");
            bundle.putParcelable("androidx.credentials.provider.BeginGetCredentialResponse", androidx.credentials.provider.utils.h1.INSTANCE.n(response));
        }

        @androidx.annotation.u
        @fg.m
        @kd.n
        public static final w b(@fg.l Bundle bundle) {
            kotlin.jvm.internal.l0.p(bundle, "bundle");
            BeginGetCredentialResponse beginGetCredentialResponse = (BeginGetCredentialResponse) bundle.getParcelable("androidx.credentials.provider.BeginGetCredentialResponse", BeginGetCredentialResponse.class);
            if (beginGetCredentialResponse != null) {
                return androidx.credentials.provider.utils.h1.INSTANCE.q(beginGetCredentialResponse);
            }
            return null;
        }
    }

    /* compiled from: BeginGetCredentialResponse.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\f¢\u0006\u0004\b\u0015\u0010\u000fJ\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\f¢\u0006\u0004\b\u001b\u0010\u000fJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010 R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010#¨\u0006$"}, d2 = {"Landroidx/credentials/provider/w$b;", "", "<init>", "()V", "Landroidx/credentials/provider/g2;", "remoteEntry", "h", "(Landroidx/credentials/provider/g2;)Landroidx/credentials/provider/w$b;", "Landroidx/credentials/provider/f0;", "entry", "c", "(Landroidx/credentials/provider/f0;)Landroidx/credentials/provider/w$b;", "", "entries", "g", "(Ljava/util/List;)Landroidx/credentials/provider/w$b;", "Landroidx/credentials/provider/a;", "action", "a", "(Landroidx/credentials/provider/a;)Landroidx/credentials/provider/w$b;", "actions", "e", "Landroidx/credentials/provider/o;", "authenticationAction", "b", "(Landroidx/credentials/provider/o;)Landroidx/credentials/provider/w$b;", "authenticationEntries", "f", "Landroidx/credentials/provider/w;", "d", "()Landroidx/credentials/provider/w;", "", "Ljava/util/List;", "credentialEntries", "authenticationActions", "Landroidx/credentials/provider/g2;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private List<f0> credentialEntries = new ArrayList();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private List<androidx.credentials.provider.a> actions = new ArrayList();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private List<o> authenticationActions = new ArrayList();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private g2 remoteEntry;

        @fg.l
        public final b a(@fg.l androidx.credentials.provider.a action) {
            kotlin.jvm.internal.l0.p(action, "action");
            this.actions.add(action);
            return this;
        }

        @fg.l
        public final b b(@fg.l o authenticationAction) {
            kotlin.jvm.internal.l0.p(authenticationAction, "authenticationAction");
            this.authenticationActions.add(authenticationAction);
            return this;
        }

        @fg.l
        public final b c(@fg.l f0 entry) {
            kotlin.jvm.internal.l0.p(entry, "entry");
            this.credentialEntries.add(entry);
            return this;
        }

        @fg.l
        public final w d() {
            return new w(kotlin.collections.w.V5(this.credentialEntries), kotlin.collections.w.V5(this.actions), kotlin.collections.w.V5(this.authenticationActions), this.remoteEntry);
        }

        @fg.l
        public final b e(@fg.l List<androidx.credentials.provider.a> actions) {
            kotlin.jvm.internal.l0.p(actions, "actions");
            this.actions = kotlin.collections.w.Y5(actions);
            return this;
        }

        @fg.l
        public final b f(@fg.l List<o> authenticationEntries) {
            kotlin.jvm.internal.l0.p(authenticationEntries, "authenticationEntries");
            this.authenticationActions = kotlin.collections.w.Y5(authenticationEntries);
            return this;
        }

        @fg.l
        public final b g(@fg.l List<? extends f0> entries) {
            kotlin.jvm.internal.l0.p(entries, "entries");
            this.credentialEntries = kotlin.collections.w.Y5(entries);
            return this;
        }

        @fg.l
        public final b h(@fg.m g2 remoteEntry) {
            this.remoteEntry = remoteEntry;
            return this;
        }
    }

    /* compiled from: BeginGetCredentialResponse.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/credentials/provider/w$c;", "", "<init>", "()V", "Landroidx/credentials/provider/w;", "response", "Landroid/os/Bundle;", "a", "(Landroidx/credentials/provider/w;)Landroid/os/Bundle;", "bundle", "b", "(Landroid/os/Bundle;)Landroidx/credentials/provider/w;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.w$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final Bundle a(@fg.l w response) {
            kotlin.jvm.internal.l0.p(response, "response");
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                a.a(bundle, response);
            }
            return bundle;
        }

        @fg.m
        @kd.n
        public final w b(@fg.l Bundle bundle) {
            kotlin.jvm.internal.l0.p(bundle, "bundle");
            if (Build.VERSION.SDK_INT >= 34) {
                return a.b(bundle);
            }
            return null;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public w() {
        this(null, null, null, null, 15, null);
    }

    @fg.l
    @kd.n
    public static final Bundle a(@fg.l w wVar) {
        return INSTANCE.a(wVar);
    }

    @fg.m
    @kd.n
    public static final w b(@fg.l Bundle bundle) {
        return INSTANCE.b(bundle);
    }

    @fg.l
    public final List<androidx.credentials.provider.a> c() {
        return this.actions;
    }

    @fg.l
    public final List<o> d() {
        return this.authenticationActions;
    }

    @fg.l
    public final List<f0> e() {
        return this.credentialEntries;
    }

    @fg.m
    /* renamed from: f, reason: from getter */
    public final g2 getRemoteEntry() {
        return this.remoteEntry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(@fg.l List<? extends f0> credentialEntries, @fg.l List<androidx.credentials.provider.a> actions, @fg.l List<o> authenticationActions, @fg.m g2 g2Var) {
        kotlin.jvm.internal.l0.p(credentialEntries, "credentialEntries");
        kotlin.jvm.internal.l0.p(actions, "actions");
        kotlin.jvm.internal.l0.p(authenticationActions, "authenticationActions");
        this.credentialEntries = credentialEntries;
        this.actions = actions;
        this.authenticationActions = authenticationActions;
        this.remoteEntry = g2Var;
    }

    public w(List list, List list2, List list3, g2 g2Var, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? kotlin.collections.j0.f74919b : list, (i4 & 2) != 0 ? kotlin.collections.j0.f74919b : list2, (i4 & 4) != 0 ? kotlin.collections.j0.f74919b : list3, (i4 & 8) != 0 ? null : g2Var);
    }
}
