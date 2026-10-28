package androidx.credentials;

import android.annotation.SuppressLint;
import android.content.Context;
import android.credentials.ClearCredentialStateException;
import android.credentials.ClearCredentialStateRequest;
import android.credentials.CreateCredentialRequest;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.credentials.PrepareGetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import androidx.credentials.c;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.ClearCredentialUnsupportedException;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialNoCreateOptionException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException;
import androidx.credentials.j;
import androidx.credentials.q1;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: CredentialProviderFrameworkImpl.kt */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010'\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#H\u0016¢\u0006\u0004\b'\u0010(JE\u0010,\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020%0#H\u0016¢\u0006\u0004\b,\u0010-JE\u0010.\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020%0#H\u0016¢\u0006\u0004\b.\u0010/JE\u00102\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010#H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020%2\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002012\u0006\u00105\u001a\u000208H\u0000¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020+2\u0006\u0010<\u001a\u00020;H\u0000¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020$2\u0006\u0010<\u001a\u00020?H\u0000¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\tH\u0016¢\u0006\u0004\bB\u0010CJ?\u0010G\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020D2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!2\u0014\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010E\u0012\u0004\u0012\u00020F0#H\u0016¢\u0006\u0004\bG\u0010HR\u0016\u0010K\u001a\u0004\u0018\u00010I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010J¨\u0006L"}, d2 = {"Landroidx/credentials/x0;", "Landroidx/credentials/p;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lkotlin/Function0;", "Lkotlin/k2;", "handleNullCredMan", "", "j", "(Lld/a;)Z", "Landroidx/credentials/b;", "request", "Landroid/credentials/CreateCredentialRequest;", "c", "(Landroidx/credentials/b;Landroid/content/Context;)Landroid/credentials/CreateCredentialRequest;", "Landroid/credentials/CreateCredentialRequest$Builder;", "builder", "k", "(Landroidx/credentials/b;Landroid/credentials/CreateCredentialRequest$Builder;)V", "Landroidx/credentials/h1;", "Landroid/credentials/GetCredentialRequest;", "d", "(Landroidx/credentials/h1;)Landroid/credentials/GetCredentialRequest;", "Landroid/credentials/GetCredentialRequest$Builder;", "l", "(Landroidx/credentials/h1;Landroid/credentials/GetCredentialRequest$Builder;)V", "Landroid/credentials/ClearCredentialStateRequest;", "i", "()Landroid/credentials/ClearCredentialStateRequest;", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/credentials/m;", "Landroidx/credentials/q1;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "a", "(Landroidx/credentials/h1;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "Landroidx/credentials/q1$b;", "pendingGetCredentialHandle", "Landroidx/credentials/i1;", "b", "(Landroid/content/Context;Landroidx/credentials/q1$b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "onGetCredential", "(Landroid/content/Context;Landroidx/credentials/h1;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "Landroidx/credentials/c;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onCreateCredential", "(Landroid/content/Context;Landroidx/credentials/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "Landroid/credentials/GetCredentialException;", "error", "h", "(Landroid/credentials/GetCredentialException;)Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/credentials/CreateCredentialException;", "g", "(Landroid/credentials/CreateCredentialException;)Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/credentials/GetCredentialResponse;", "response", "e", "(Landroid/credentials/GetCredentialResponse;)Landroidx/credentials/i1;", "Landroid/credentials/PrepareGetCredentialResponse;", "f", "(Landroid/credentials/PrepareGetCredentialResponse;)Landroidx/credentials/q1;", "isAvailableOnDevice", "()Z", "Landroidx/credentials/a;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredential", "(Landroidx/credentials/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "Landroid/credentials/CredentialManager;", "Landroid/credentials/CredentialManager;", "credentialManager", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(34)
@kotlin.jvm.internal.r1({"SMAP\nCredentialProviderFrameworkImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CredentialProviderFrameworkImpl.kt\nandroidx/credentials/CredentialProviderFrameworkImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,421:1\n1855#2,2:422\n*S KotlinDebug\n*F\n+ 1 CredentialProviderFrameworkImpl.kt\nandroidx/credentials/CredentialProviderFrameworkImpl\n*L\n271#1:422,2\n*E\n"})
/* loaded from: classes3.dex */
public final class x0 implements p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final CredentialManager credentialManager;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final String f28284c = "CredManProvService";

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final String f28285d = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION";

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final String f28286e = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION";

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final a f28283b = new a();

    /* compiled from: CredentialProviderFrameworkImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/credentials/x0$a;", "", "<init>", "()V", "", "CREATE_DOM_EXCEPTION_PREFIX", "Ljava/lang/String;", "GET_DOM_EXCEPTION_PREFIX", "TAG", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: CredentialProviderFrameworkImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<Void, ClearCredentialException> f28288b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m<Void, ClearCredentialException> mVar) {
            super(0);
            this.f28288b = mVar;
        }

        public final void a() {
            this.f28288b.a(new ClearCredentialUnsupportedException("Your device doesn't support credential manager"));
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderFrameworkImpl.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/x0$c", "Landroid/os/OutcomeReceiver;", "Ljava/lang/Void;", "Landroid/credentials/ClearCredentialStateException;", "response", "Lkotlin/k2;", "b", "(Ljava/lang/Void;)V", "error", "a", "(Landroid/credentials/ClearCredentialStateException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements OutcomeReceiver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<Void, ClearCredentialException> f28289b;

        c(m<Void, ClearCredentialException> mVar) {
            this.f28289b = mVar;
        }

        public void a(@fg.l ClearCredentialStateException error) {
            kotlin.jvm.internal.l0.p(error, "error");
            this.f28289b.a(new ClearCredentialUnknownException(null, 1, null));
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(@fg.m Void response) {
            this.f28289b.onResult(response);
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th) {
            a(y0.a(th));
        }
    }

    /* compiled from: CredentialProviderFrameworkImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<androidx.credentials.c, CreateCredentialException> f28290b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m<androidx.credentials.c, CreateCredentialException> mVar) {
            super(0);
            this.f28290b = mVar;
        }

        public final void a() {
            this.f28290b.a(new CreateCredentialUnsupportedException("Your device doesn't support credential manager"));
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderFrameworkImpl.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/x0$e", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/CreateCredentialResponse;", "Landroid/credentials/CreateCredentialException;", "response", "Lkotlin/k2;", "b", "(Landroid/credentials/CreateCredentialResponse;)V", "error", "a", "(Landroid/credentials/CreateCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements OutcomeReceiver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<androidx.credentials.c, CreateCredentialException> f28291b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.credentials.b f28292c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ x0 f28293d;

        e(m<androidx.credentials.c, CreateCredentialException> mVar, androidx.credentials.b bVar, x0 x0Var) {
            this.f28291b = mVar;
            this.f28292c = bVar;
            this.f28293d = x0Var;
        }

        public void a(@fg.l android.credentials.CreateCredentialException error) {
            kotlin.jvm.internal.l0.p(error, "error");
            this.f28291b.a(this.f28293d.g(error));
        }

        public void b(@fg.l CreateCredentialResponse response) {
            Bundle data;
            kotlin.jvm.internal.l0.p(response, "response");
            m<androidx.credentials.c, CreateCredentialException> mVar = this.f28291b;
            c.Companion companion = androidx.credentials.c.INSTANCE;
            String type = this.f28292c.getType();
            data = response.getData();
            kotlin.jvm.internal.l0.o(data, "response.data");
            mVar.onResult(companion.a(type, data));
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th) {
            a(z0.a(th));
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            b(b1.a(obj));
        }
    }

    /* compiled from: CredentialProviderFrameworkImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<i1, GetCredentialException> f28294b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(m<i1, GetCredentialException> mVar) {
            super(0);
            this.f28294b = mVar;
        }

        public final void a() {
            this.f28294b.a(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderFrameworkImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<i1, GetCredentialException> f28295b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(m<i1, GetCredentialException> mVar) {
            super(0);
            this.f28295b = mVar;
        }

        public final void a() {
            this.f28295b.a(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderFrameworkImpl.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/x0$h", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/GetCredentialResponse;", "Landroid/credentials/GetCredentialException;", "response", "Lkotlin/k2;", "b", "(Landroid/credentials/GetCredentialResponse;)V", "error", "a", "(Landroid/credentials/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h implements OutcomeReceiver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<i1, GetCredentialException> f28296b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x0 f28297c;

        h(m<i1, GetCredentialException> mVar, x0 x0Var) {
            this.f28296b = mVar;
            this.f28297c = x0Var;
        }

        public void a(@fg.l android.credentials.GetCredentialException error) {
            kotlin.jvm.internal.l0.p(error, "error");
            this.f28296b.a(this.f28297c.h(error));
        }

        public void b(@fg.l GetCredentialResponse response) {
            kotlin.jvm.internal.l0.p(response, "response");
            this.f28296b.onResult(this.f28297c.e(response));
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th) {
            a(d1.a(th));
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            b(c1.a(obj));
        }
    }

    /* compiled from: CredentialProviderFrameworkImpl.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/x0$i", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/GetCredentialResponse;", "Landroid/credentials/GetCredentialException;", "response", "Lkotlin/k2;", "b", "(Landroid/credentials/GetCredentialResponse;)V", "error", "a", "(Landroid/credentials/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class i implements OutcomeReceiver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<i1, GetCredentialException> f28298b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x0 f28299c;

        i(m<i1, GetCredentialException> mVar, x0 x0Var) {
            this.f28298b = mVar;
            this.f28299c = x0Var;
        }

        public void a(@fg.l android.credentials.GetCredentialException error) {
            kotlin.jvm.internal.l0.p(error, "error");
            this.f28298b.a(this.f28299c.h(error));
        }

        public void b(@fg.l GetCredentialResponse response) {
            kotlin.jvm.internal.l0.p(response, "response");
            this.f28298b.onResult(this.f28299c.e(response));
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th) {
            a(d1.a(th));
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            b(c1.a(obj));
        }
    }

    /* compiled from: CredentialProviderFrameworkImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<q1, GetCredentialException> f28300b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(m<q1, GetCredentialException> mVar) {
            super(0);
            this.f28300b = mVar;
        }

        public final void a() {
            this.f28300b.a(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: CredentialProviderFrameworkImpl.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/x0$k", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/PrepareGetCredentialResponse;", "Landroid/credentials/GetCredentialException;", "response", "Lkotlin/k2;", "b", "(Landroid/credentials/PrepareGetCredentialResponse;)V", "error", "a", "(Landroid/credentials/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class k implements OutcomeReceiver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<q1, GetCredentialException> f28301b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x0 f28302c;

        k(m<q1, GetCredentialException> mVar, x0 x0Var) {
            this.f28301b = mVar;
            this.f28302c = x0Var;
        }

        public void a(@fg.l android.credentials.GetCredentialException error) {
            kotlin.jvm.internal.l0.p(error, "error");
            this.f28301b.a(this.f28302c.h(error));
        }

        public void b(@fg.l PrepareGetCredentialResponse response) {
            kotlin.jvm.internal.l0.p(response, "response");
            this.f28301b.onResult(this.f28302c.f(response));
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th) {
            a(d1.a(th));
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            b(e1.a(obj));
        }
    }

    public x0(@fg.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        this.credentialManager = a0.a(context.getSystemService("credential"));
    }

    private final CreateCredentialRequest c(androidx.credentials.b request, Context context) {
        CreateCredentialRequest.Builder isSystemProviderRequired;
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider;
        CreateCredentialRequest build;
        m0.a();
        isSystemProviderRequired = l0.a(request.getType(), j1.a.INSTANCE.a(request, context), request.getCandidateQueryData()).setIsSystemProviderRequired(request.getIsSystemProviderRequired());
        alwaysSendAppInfoToProvider = isSystemProviderRequired.setAlwaysSendAppInfoToProvider(true);
        kotlin.jvm.internal.l0.o(alwaysSendAppInfoToProvider, "Builder(\n               …ndAppInfoToProvider(true)");
        k(request, alwaysSendAppInfoToProvider);
        build = alwaysSendAppInfoToProvider.build();
        kotlin.jvm.internal.l0.o(build, "createCredentialRequestBuilder.build()");
        return build;
    }

    private final GetCredentialRequest d(h1 request) {
        GetCredentialRequest build;
        CredentialOption.Builder isSystemProviderRequired;
        CredentialOption.Builder allowedProviders;
        CredentialOption build2;
        j0.a();
        GetCredentialRequest.Builder a5 = h0.a(h1.INSTANCE.b(request));
        for (o oVar : request.b()) {
            k0.a();
            isSystemProviderRequired = i0.a(oVar.getType(), oVar.getRequestData(), oVar.getCandidateQueryData()).setIsSystemProviderRequired(oVar.getIsSystemProviderRequired());
            allowedProviders = isSystemProviderRequired.setAllowedProviders(oVar.b());
            build2 = allowedProviders.build();
            a5.addCredentialOption(build2);
        }
        l(request, a5);
        build = a5.build();
        kotlin.jvm.internal.l0.o(build, "builder.build()");
        return build;
    }

    private final ClearCredentialStateRequest i() {
        p0.a();
        return o0.a(new Bundle());
    }

    private final boolean j(ld.a<k2> handleNullCredMan) {
        if (this.credentialManager != null) {
            return false;
        }
        handleNullCredMan.invoke();
        return true;
    }

    @SuppressLint({"MissingPermission"})
    private final void k(androidx.credentials.b request, CreateCredentialRequest.Builder builder) {
        if (request.getOrigin() != null) {
            builder.setOrigin(request.getOrigin());
        }
    }

    @SuppressLint({"MissingPermission"})
    private final void l(h1 request, GetCredentialRequest.Builder builder) {
        if (request.getOrigin() != null) {
            builder.setOrigin(request.getOrigin());
        }
    }

    @Override // androidx.credentials.p
    public void a(@fg.l h1 request, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<q1, GetCredentialException> callback) {
        kotlin.jvm.internal.l0.p(request, "request");
        kotlin.jvm.internal.l0.p(executor, "executor");
        kotlin.jvm.internal.l0.p(callback, "callback");
        if (j(new j(callback))) {
            return;
        }
        k kVar = new k(callback, this);
        CredentialManager credentialManager = this.credentialManager;
        kotlin.jvm.internal.l0.m(credentialManager);
        credentialManager.prepareGetCredential(d(request), cancellationSignal, executor, androidx.core.os.u.a(kVar));
    }

    @Override // androidx.credentials.p
    public void b(@fg.l Context context, @fg.l q1.b pendingGetCredentialHandle, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<i1, GetCredentialException> callback) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        kotlin.jvm.internal.l0.p(executor, "executor");
        kotlin.jvm.internal.l0.p(callback, "callback");
        if (j(new f(callback))) {
            return;
        }
        h hVar = new h(callback, this);
        CredentialManager credentialManager = this.credentialManager;
        kotlin.jvm.internal.l0.m(credentialManager);
        PrepareGetCredentialResponse.PendingGetCredentialHandle frameworkHandle = pendingGetCredentialHandle.getFrameworkHandle();
        kotlin.jvm.internal.l0.m(frameworkHandle);
        credentialManager.getCredential(context, frameworkHandle, cancellationSignal, executor, (OutcomeReceiver<GetCredentialResponse, android.credentials.GetCredentialException>) androidx.core.os.u.a(hVar));
    }

    @fg.l
    public final i1 e(@fg.l GetCredentialResponse response) {
        Credential credential;
        String type;
        Bundle data;
        kotlin.jvm.internal.l0.p(response, "response");
        credential = response.getCredential();
        kotlin.jvm.internal.l0.o(credential, "response.credential");
        j.Companion companion = androidx.credentials.j.INSTANCE;
        type = credential.getType();
        kotlin.jvm.internal.l0.o(type, "credential.type");
        data = credential.getData();
        kotlin.jvm.internal.l0.o(data, "credential.data");
        return new i1(companion.a(type, data));
    }

    @fg.l
    public final q1 f(@fg.l PrepareGetCredentialResponse response) {
        PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle;
        kotlin.jvm.internal.l0.p(response, "response");
        pendingGetCredentialHandle = response.getPendingGetCredentialHandle();
        return new q1.a().h(response).i(new q1.b(pendingGetCredentialHandle)).d();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @fg.l
    public final CreateCredentialException g(@fg.l android.credentials.CreateCredentialException error) {
        String type;
        String type2;
        String type3;
        String message;
        String type4;
        String message2;
        String message3;
        String message4;
        String message5;
        String message6;
        kotlin.jvm.internal.l0.p(error, "error");
        type = error.getType();
        switch (type.hashCode()) {
            case -2055374133:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    message3 = error.getMessage();
                    return new CreateCredentialCancellationException(message3);
                }
                break;
            case 1316905704:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    message4 = error.getMessage();
                    return new CreateCredentialUnknownException(message4);
                }
                break;
            case 2092588512:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                    message5 = error.getMessage();
                    return new CreateCredentialInterruptedException(message5);
                }
                break;
            case 2131915191:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                    message6 = error.getMessage();
                    return new CreateCredentialNoCreateOptionException(message6);
                }
                break;
        }
        type2 = error.getType();
        kotlin.jvm.internal.l0.o(type2, "error.type");
        if (!kotlin.text.v.s2(type2, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, null)) {
            type3 = error.getType();
            kotlin.jvm.internal.l0.o(type3, "error.type");
            message = error.getMessage();
            return new CreateCredentialCustomException(type3, message);
        }
        CreatePublicKeyCredentialException.Companion companion = CreatePublicKeyCredentialException.INSTANCE;
        type4 = error.getType();
        kotlin.jvm.internal.l0.o(type4, "error.type");
        message2 = error.getMessage();
        return companion.a(type4, message2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @fg.l
    public final GetCredentialException h(@fg.l android.credentials.GetCredentialException error) {
        String type;
        String type2;
        String type3;
        String message;
        String type4;
        String message2;
        String message3;
        String message4;
        String message5;
        String message6;
        kotlin.jvm.internal.l0.p(error, "error");
        type = error.getType();
        switch (type.hashCode()) {
            case -781118336:
                if (type.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    message3 = error.getMessage();
                    return new GetCredentialUnknownException(message3);
                }
                break;
            case -45448328:
                if (type.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    message4 = error.getMessage();
                    return new GetCredentialInterruptedException(message4);
                }
                break;
            case 580557411:
                if (type.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    message5 = error.getMessage();
                    return new GetCredentialCancellationException(message5);
                }
                break;
            case 627896683:
                if (type.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    message6 = error.getMessage();
                    return new NoCredentialException(message6);
                }
                break;
        }
        type2 = error.getType();
        kotlin.jvm.internal.l0.o(type2, "error.type");
        if (!kotlin.text.v.s2(type2, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, null)) {
            type3 = error.getType();
            kotlin.jvm.internal.l0.o(type3, "error.type");
            message = error.getMessage();
            return new GetCredentialCustomException(type3, message);
        }
        GetPublicKeyCredentialException.Companion companion = GetPublicKeyCredentialException.INSTANCE;
        type4 = error.getType();
        kotlin.jvm.internal.l0.o(type4, "error.type");
        message2 = error.getMessage();
        return companion.a(type4, message2);
    }

    @Override // androidx.credentials.p
    public boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.credentialManager != null;
    }

    @Override // androidx.credentials.p
    public void onClearCredential(@fg.l androidx.credentials.a request, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<Void, ClearCredentialException> callback) {
        kotlin.jvm.internal.l0.p(request, "request");
        kotlin.jvm.internal.l0.p(executor, "executor");
        kotlin.jvm.internal.l0.p(callback, "callback");
        if (j(new b(callback))) {
            return;
        }
        c cVar = new c(callback);
        CredentialManager credentialManager = this.credentialManager;
        kotlin.jvm.internal.l0.m(credentialManager);
        credentialManager.clearCredentialState(i(), cancellationSignal, executor, androidx.core.os.u.a(cVar));
    }

    @Override // androidx.credentials.p
    public void onCreateCredential(@fg.l Context context, @fg.l androidx.credentials.b request, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<androidx.credentials.c, CreateCredentialException> callback) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(request, "request");
        kotlin.jvm.internal.l0.p(executor, "executor");
        kotlin.jvm.internal.l0.p(callback, "callback");
        if (j(new d(callback))) {
            return;
        }
        e eVar = new e(callback, request, this);
        CredentialManager credentialManager = this.credentialManager;
        kotlin.jvm.internal.l0.m(credentialManager);
        credentialManager.createCredential(context, c(request, context), cancellationSignal, executor, androidx.core.os.u.a(eVar));
    }

    @Override // androidx.credentials.p
    public void onGetCredential(@fg.l Context context, @fg.l h1 request, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<i1, GetCredentialException> callback) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(request, "request");
        kotlin.jvm.internal.l0.p(executor, "executor");
        kotlin.jvm.internal.l0.p(callback, "callback");
        if (j(new g(callback))) {
            return;
        }
        i iVar = new i(callback, this);
        CredentialManager credentialManager = this.credentialManager;
        kotlin.jvm.internal.l0.m(credentialManager);
        credentialManager.getCredential(context, d(request), cancellationSignal, executor, (OutcomeReceiver<GetCredentialResponse, android.credentials.GetCredentialException>) androidx.core.os.u.a(iVar));
    }
}
