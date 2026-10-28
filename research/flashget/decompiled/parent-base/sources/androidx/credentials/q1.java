package androidx.credentials;

import android.annotation.SuppressLint;
import android.credentials.PrepareGetCredentialResponse;
import android.os.Build;
import androidx.annotation.c1;
import kotlin.Metadata;

/* compiled from: PrepareGetCredentialResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0017\u001b\u001dBc\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\b\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nj\u0004\u0018\u0001`\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR+\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006#"}, d2 = {"Landroidx/credentials/q1;", "", "Landroidx/credentials/q1$b;", "pendingGetCredentialHandle", "Lkotlin/Function0;", "", "Landroidx/credentials/HasRemoteResultsDelegate;", "hasRemoteResultsDelegate", "Landroidx/credentials/HasAuthenticationResultsDelegate;", "hasAuthResultsDelegate", "Lkotlin/Function1;", "", "Landroidx/credentials/HasCredentialResultsDelegate;", "credentialTypeDelegate", "isNullHandlesForTest", "<init>", "(Landroidx/credentials/q1$b;Lld/a;Lld/a;Lld/l;Z)V", "credentialType", "f", "(Ljava/lang/String;)Z", "e", "()Z", "g", "a", "Landroidx/credentials/q1$b;", "d", "()Landroidx/credentials/q1$b;", "b", "Lld/a;", "c", "()Lld/a;", "Lld/l;", "()Lld/l;", "Z", "h", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"MissingGetterMatchingBuilder"})
@androidx.annotation.x0(34)
/* loaded from: classes3.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final b pendingGetCredentialHandle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.a<Boolean> hasRemoteResultsDelegate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.a<Boolean> hasAuthResultsDelegate;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<String, Boolean> credentialTypeDelegate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isNullHandlesForTest;

    /* compiled from: PrepareGetCredentialResponse.kt */
    @androidx.annotation.c1({c1.a.LIBRARY})
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aj\u0004\u0018\u0001`\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001dR*\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\"j\u0004\u0018\u0001`#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010&¨\u0006("}, d2 = {"Landroidx/credentials/q1$a;", "", "<init>", "()V", "", "credentialType", "", "f", "(Ljava/lang/String;)Z", "e", "()Z", "g", "Landroid/credentials/PrepareGetCredentialResponse;", "resp", "h", "(Landroid/credentials/PrepareGetCredentialResponse;)Landroidx/credentials/q1$a;", "Landroidx/credentials/q1$b;", "handle", "i", "(Landroidx/credentials/q1$b;)Landroidx/credentials/q1$a;", "Landroidx/credentials/q1;", "d", "()Landroidx/credentials/q1;", "a", "Landroidx/credentials/q1$b;", "pendingGetCredentialHandle", "Lkotlin/Function0;", "Landroidx/credentials/HasRemoteResultsDelegate;", "b", "Lld/a;", "hasRemoteResultsDelegate", "Landroidx/credentials/HasAuthenticationResultsDelegate;", "c", "hasAuthResultsDelegate", "Lkotlin/Function1;", "Landroidx/credentials/HasCredentialResultsDelegate;", "Lld/l;", "hasCredentialResultsDelegate", "Landroid/credentials/PrepareGetCredentialResponse;", "frameworkResponse", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private b pendingGetCredentialHandle;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private ld.a<Boolean> hasRemoteResultsDelegate;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private ld.a<Boolean> hasAuthResultsDelegate;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private ld.l<? super String, Boolean> hasCredentialResultsDelegate;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private PrepareGetCredentialResponse frameworkResponse;

        /* compiled from: PrepareGetCredentialResponse.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.credentials.q1$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0455a extends kotlin.jvm.internal.h0 implements ld.l<String, Boolean> {
            C0455a(Object obj) {
                super(1, obj, a.class, "hasCredentialType", "hasCredentialType(Ljava/lang/String;)Z", 0);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.l String p02) {
                kotlin.jvm.internal.l0.p(p02, "p0");
                return Boolean.valueOf(((a) this.receiver).f(p02));
            }
        }

        /* compiled from: PrepareGetCredentialResponse.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* synthetic */ class b extends kotlin.jvm.internal.h0 implements ld.a<Boolean> {
            b(Object obj) {
                super(0, obj, a.class, "hasAuthenticationResults", "hasAuthenticationResults()Z", 0);
            }

            @Override // ld.a
            @fg.l
            /* renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).e());
            }
        }

        /* compiled from: PrepareGetCredentialResponse.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* synthetic */ class c extends kotlin.jvm.internal.h0 implements ld.a<Boolean> {
            c(Object obj) {
                super(0, obj, a.class, "hasRemoteResults", "hasRemoteResults()Z", 0);
            }

            @Override // ld.a
            @fg.l
            /* renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).g());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @androidx.annotation.b1("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS")
        public final boolean e() {
            boolean hasAuthenticationResults;
            PrepareGetCredentialResponse prepareGetCredentialResponse = this.frameworkResponse;
            kotlin.jvm.internal.l0.m(prepareGetCredentialResponse);
            hasAuthenticationResults = prepareGetCredentialResponse.hasAuthenticationResults();
            return hasAuthenticationResults;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @androidx.annotation.b1("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS")
        public final boolean f(String credentialType) {
            boolean hasCredentialResults;
            PrepareGetCredentialResponse prepareGetCredentialResponse = this.frameworkResponse;
            kotlin.jvm.internal.l0.m(prepareGetCredentialResponse);
            hasCredentialResults = prepareGetCredentialResponse.hasCredentialResults(credentialType);
            return hasCredentialResults;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @androidx.annotation.b1("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS")
        public final boolean g() {
            boolean hasRemoteResults;
            PrepareGetCredentialResponse prepareGetCredentialResponse = this.frameworkResponse;
            kotlin.jvm.internal.l0.m(prepareGetCredentialResponse);
            hasRemoteResults = prepareGetCredentialResponse.hasRemoteResults();
            return hasRemoteResults;
        }

        @fg.l
        public final q1 d() {
            return new q1(this.pendingGetCredentialHandle, this.hasRemoteResultsDelegate, this.hasAuthResultsDelegate, this.hasCredentialResultsDelegate, false, null);
        }

        @fg.l
        public final a h(@fg.m PrepareGetCredentialResponse resp) {
            this.frameworkResponse = resp;
            if (resp != null) {
                this.hasCredentialResultsDelegate = new C0455a(this);
                this.hasAuthResultsDelegate = new b(this);
                this.hasRemoteResultsDelegate = new c(this);
            }
            return this;
        }

        @fg.l
        public final a i(@fg.l b handle) {
            kotlin.jvm.internal.l0.p(handle, "handle");
            this.pendingGetCredentialHandle = handle;
            return this;
        }
    }

    /* compiled from: PrepareGetCredentialResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/q1$b;", "", "Landroid/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "frameworkHandle", "<init>", "(Landroid/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;)V", "a", "Landroid/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "()Landroid/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(34)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final PrepareGetCredentialResponse.PendingGetCredentialHandle frameworkHandle;

        public b(@fg.m PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle) {
            this.frameworkHandle = pendingGetCredentialHandle;
            if (Build.VERSION.SDK_INT >= 34) {
                kotlin.jvm.internal.l0.m(pendingGetCredentialHandle);
            }
        }

        @fg.m
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
        /* renamed from: a, reason: from getter */
        public final PrepareGetCredentialResponse.PendingGetCredentialHandle getFrameworkHandle() {
            return this.frameworkHandle;
        }
    }

    /* compiled from: PrepareGetCredentialResponse.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00002\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00002\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u000bj\u0002`\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00002\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u000bj\u0002`\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bj\u0004\u0018\u0001`\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R$\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014R*\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0004\u0018\u0001`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/credentials/q1$c;", "", "<init>", "()V", "Lkotlin/Function1;", "", "", "Landroidx/credentials/HasCredentialResultsDelegate;", "handler", "b", "(Lld/l;)Landroidx/credentials/q1$c;", "Lkotlin/Function0;", "Landroidx/credentials/HasAuthenticationResultsDelegate;", "c", "(Lld/a;)Landroidx/credentials/q1$c;", "Landroidx/credentials/HasRemoteResultsDelegate;", "d", "Landroidx/credentials/q1;", "a", "()Landroidx/credentials/q1;", "Lld/a;", "hasRemoteResultsDelegate", "hasAuthResultsDelegate", "Lld/l;", "hasCredentialResultsDelegate", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.m1
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private ld.a<Boolean> hasRemoteResultsDelegate;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private ld.a<Boolean> hasAuthResultsDelegate;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private ld.l<? super String, Boolean> hasCredentialResultsDelegate;

        @fg.l
        public final q1 a() {
            return new q1(null, this.hasRemoteResultsDelegate, this.hasAuthResultsDelegate, this.hasCredentialResultsDelegate, true, null);
        }

        @fg.l
        @androidx.annotation.m1
        public final c b(@fg.l ld.l<? super String, Boolean> handler) {
            kotlin.jvm.internal.l0.p(handler, "handler");
            this.hasCredentialResultsDelegate = handler;
            return this;
        }

        @fg.l
        @androidx.annotation.m1
        public final c c(@fg.l ld.a<Boolean> handler) {
            kotlin.jvm.internal.l0.p(handler, "handler");
            this.hasAuthResultsDelegate = handler;
            return this;
        }

        @fg.l
        @androidx.annotation.m1
        public final c d(@fg.l ld.a<Boolean> handler) {
            kotlin.jvm.internal.l0.p(handler, "handler");
            this.hasRemoteResultsDelegate = handler;
            return this;
        }
    }

    public /* synthetic */ q1(b bVar, ld.a aVar, ld.a aVar2, ld.l lVar, boolean z4, kotlin.jvm.internal.w wVar) {
        this(bVar, aVar, aVar2, lVar, z4);
    }

    @fg.m
    public final ld.l<String, Boolean> a() {
        return this.credentialTypeDelegate;
    }

    @fg.m
    public final ld.a<Boolean> b() {
        return this.hasAuthResultsDelegate;
    }

    @fg.m
    public final ld.a<Boolean> c() {
        return this.hasRemoteResultsDelegate;
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final b getPendingGetCredentialHandle() {
        return this.pendingGetCredentialHandle;
    }

    @androidx.annotation.b1("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS")
    public final boolean e() {
        ld.a<Boolean> aVar = this.hasAuthResultsDelegate;
        if (aVar != null) {
            return aVar.invoke().booleanValue();
        }
        return false;
    }

    @androidx.annotation.b1("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS")
    public final boolean f(@fg.l String credentialType) {
        kotlin.jvm.internal.l0.p(credentialType, "credentialType");
        ld.l<String, Boolean> lVar = this.credentialTypeDelegate;
        if (lVar != null) {
            return lVar.invoke(credentialType).booleanValue();
        }
        return false;
    }

    @androidx.annotation.b1("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS")
    public final boolean g() {
        ld.a<Boolean> aVar = this.hasRemoteResultsDelegate;
        if (aVar != null) {
            return aVar.invoke().booleanValue();
        }
        return false;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsNullHandlesForTest() {
        return this.isNullHandlesForTest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private q1(b bVar, ld.a<Boolean> aVar, ld.a<Boolean> aVar2, ld.l<? super String, Boolean> lVar, boolean z4) {
        this.pendingGetCredentialHandle = bVar;
        this.hasRemoteResultsDelegate = aVar;
        this.hasAuthResultsDelegate = aVar2;
        this.credentialTypeDelegate = lVar;
        this.isNullHandlesForTest = z4;
        if (Build.VERSION.SDK_INT < 34 || z4) {
            return;
        }
        kotlin.jvm.internal.l0.m(bVar);
    }
}
