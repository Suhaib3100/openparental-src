package androidx.credentials.provider;

import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.ClearCredentialStateRequest;
import androidx.annotation.c1;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import kotlin.Metadata;

/* compiled from: CredentialProviderService.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\b¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u001a0\bH&¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010 \u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\bH&¢\u0006\u0004\b \u0010!J3\u0010%\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\bH&¢\u0006\u0004\b%\u0010&R*\u0010/\u001a\u00020'2\u0006\u0010(\u001a\u00020'8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R.\u00105\u001a\u0004\u0018\u00010\"2\b\u0010(\u001a\u0004\u0018\u00010\"8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b)\u00102\"\u0004\b3\u00104R.\u0010:\u001a\u0004\u0018\u00010\u001d2\b\u0010(\u001a\u0004\u0018\u00010\u001d8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u00106\u001a\u0004\b0\u00107\"\u0004\b8\u00109R.\u0010@\u001a\u0004\u0018\u00010\u00192\b\u0010(\u001a\u0004\u0018\u00010\u00198G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, d2 = {"Landroidx/credentials/provider/CredentialProviderService;", "Landroid/service/credentials/CredentialProviderService;", "<init>", "()V", "Landroid/service/credentials/BeginGetCredentialRequest;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Landroid/os/OutcomeReceiver;", "Landroid/service/credentials/BeginGetCredentialResponse;", "Landroid/credentials/GetCredentialException;", "callback", "Lkotlin/k2;", "onBeginGetCredential", "(Landroid/service/credentials/BeginGetCredentialRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroid/service/credentials/BeginCreateCredentialRequest;", "Landroid/service/credentials/BeginCreateCredentialResponse;", "Landroid/credentials/CreateCredentialException;", "onBeginCreateCredential", "(Landroid/service/credentials/BeginCreateCredentialRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroid/service/credentials/ClearCredentialStateRequest;", "Ljava/lang/Void;", "Landroid/credentials/ClearCredentialStateException;", "onClearCredentialState", "(Landroid/service/credentials/ClearCredentialStateRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroidx/credentials/provider/c2;", "Landroidx/credentials/exceptions/ClearCredentialException;", "g", "(Landroidx/credentials/provider/c2;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroidx/credentials/provider/v;", "Landroidx/credentials/provider/w;", "Landroidx/credentials/exceptions/GetCredentialException;", "f", "(Landroidx/credentials/provider/v;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroidx/credentials/provider/p;", "Landroidx/credentials/provider/q;", "Landroidx/credentials/exceptions/CreateCredentialException;", "e", "(Landroidx/credentials/provider/p;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "", "<set-?>", "b", "Z", "d", "()Z", "k", "(Z)V", "isTestMode", "c", "Landroidx/credentials/provider/p;", "()Landroidx/credentials/provider/p;", "i", "(Landroidx/credentials/provider/p;)V", "lastCreateRequest", "Landroidx/credentials/provider/v;", "()Landroidx/credentials/provider/v;", "j", "(Landroidx/credentials/provider/v;)V", "lastGetRequest", "Landroidx/credentials/provider/c2;", "a", "()Landroidx/credentials/provider/c2;", "h", "(Landroidx/credentials/provider/c2;)V", "lastClearRequest", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(34)
/* loaded from: classes3.dex */
public abstract class CredentialProviderService extends android.service.credentials.CredentialProviderService {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isTestMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private p lastCreateRequest;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private v lastGetRequest;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private c2 lastClearRequest;

    /* compiled from: CredentialProviderService.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/provider/CredentialProviderService$a", "Landroid/os/OutcomeReceiver;", "Landroidx/credentials/provider/q;", "Landroidx/credentials/exceptions/CreateCredentialException;", "response", "Lkotlin/k2;", "b", "(Landroidx/credentials/provider/q;)V", "error", "a", "(Landroidx/credentials/exceptions/CreateCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements OutcomeReceiver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OutcomeReceiver f27974b;

        a(OutcomeReceiver outcomeReceiver) {
            this.f27974b = outcomeReceiver;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(@fg.l CreateCredentialException error) {
            kotlin.jvm.internal.l0.p(error, "error");
            OutcomeReceiver outcomeReceiver = this.f27974b;
            l0.a();
            outcomeReceiver.onError(k0.a(error.getType(), error.getMessage()));
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(@fg.l q response) {
            kotlin.jvm.internal.l0.p(response, "response");
            this.f27974b.onResult(androidx.credentials.provider.utils.w.INSTANCE.e(response));
        }
    }

    /* compiled from: CredentialProviderService.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/provider/CredentialProviderService$b", "Landroid/os/OutcomeReceiver;", "Landroidx/credentials/provider/w;", "Landroidx/credentials/exceptions/GetCredentialException;", "response", "Lkotlin/k2;", "b", "(Landroidx/credentials/provider/w;)V", "error", "a", "(Landroidx/credentials/exceptions/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements OutcomeReceiver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OutcomeReceiver f27975b;

        b(OutcomeReceiver outcomeReceiver) {
            this.f27975b = outcomeReceiver;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(@fg.l GetCredentialException error) {
            kotlin.jvm.internal.l0.p(error, "error");
            OutcomeReceiver outcomeReceiver = this.f27975b;
            n0.a();
            outcomeReceiver.onError(m0.a(error.getType(), error.getMessage()));
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(@fg.l w response) {
            kotlin.jvm.internal.l0.p(response, "response");
            this.f27975b.onResult(androidx.credentials.provider.utils.h1.INSTANCE.n(response));
        }
    }

    /* compiled from: CredentialProviderService.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/provider/CredentialProviderService$c", "Landroid/os/OutcomeReceiver;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "response", "Lkotlin/k2;", "b", "(Ljava/lang/Void;)V", "error", "a", "(Landroidx/credentials/exceptions/ClearCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements OutcomeReceiver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OutcomeReceiver f27976b;

        c(OutcomeReceiver outcomeReceiver) {
            this.f27976b = outcomeReceiver;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(@fg.l ClearCredentialException error) {
            kotlin.jvm.internal.l0.p(error, "error");
            OutcomeReceiver outcomeReceiver = this.f27976b;
            p0.a();
            outcomeReceiver.onError(o0.a(error.getType(), error.getMessage()));
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(@fg.m Void response) {
            this.f27976b.onResult(response);
        }
    }

    @fg.m
    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.m1
    /* renamed from: a, reason: from getter */
    public final c2 getLastClearRequest() {
        return this.lastClearRequest;
    }

    @fg.m
    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.m1
    /* renamed from: b, reason: from getter */
    public final p getLastCreateRequest() {
        return this.lastCreateRequest;
    }

    @fg.m
    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.m1
    /* renamed from: c, reason: from getter */
    public final v getLastGetRequest() {
        return this.lastGetRequest;
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.m1
    /* renamed from: d, reason: from getter */
    public final boolean getIsTestMode() {
        return this.isTestMode;
    }

    public abstract void e(@fg.l p request, @fg.l CancellationSignal cancellationSignal, @fg.l OutcomeReceiver callback);

    public abstract void f(@fg.l v request, @fg.l CancellationSignal cancellationSignal, @fg.l OutcomeReceiver callback);

    public abstract void g(@fg.l c2 request, @fg.l CancellationSignal cancellationSignal, @fg.l OutcomeReceiver callback);

    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.m1
    public final void h(@fg.m c2 c2Var) {
        this.lastClearRequest = c2Var;
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.m1
    public final void i(@fg.m p pVar) {
        this.lastCreateRequest = pVar;
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.m1
    public final void j(@fg.m v vVar) {
        this.lastGetRequest = vVar;
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.annotation.m1
    public final void k(boolean z4) {
        this.isTestMode = z4;
    }

    public final void onBeginCreateCredential(@fg.l BeginCreateCredentialRequest request, @fg.l CancellationSignal cancellationSignal, @fg.l OutcomeReceiver callback) {
        kotlin.jvm.internal.l0.p(request, "request");
        kotlin.jvm.internal.l0.p(cancellationSignal, "cancellationSignal");
        kotlin.jvm.internal.l0.p(callback, "callback");
        a aVar = new a(callback);
        p f4 = androidx.credentials.provider.utils.w.INSTANCE.f(request);
        if (this.isTestMode) {
            this.lastCreateRequest = f4;
        }
        e(f4, cancellationSignal, androidx.core.os.u.a(aVar));
    }

    public final void onBeginGetCredential(@fg.l BeginGetCredentialRequest request, @fg.l CancellationSignal cancellationSignal, @fg.l OutcomeReceiver callback) {
        kotlin.jvm.internal.l0.p(request, "request");
        kotlin.jvm.internal.l0.p(cancellationSignal, "cancellationSignal");
        kotlin.jvm.internal.l0.p(callback, "callback");
        v p4 = androidx.credentials.provider.utils.h1.INSTANCE.p(request);
        b bVar = new b(callback);
        if (this.isTestMode) {
            this.lastGetRequest = p4;
        }
        f(p4, cancellationSignal, androidx.core.os.u.a(bVar));
    }

    public final void onClearCredentialState(@fg.l ClearCredentialStateRequest request, @fg.l CancellationSignal cancellationSignal, @fg.l OutcomeReceiver callback) {
        kotlin.jvm.internal.l0.p(request, "request");
        kotlin.jvm.internal.l0.p(cancellationSignal, "cancellationSignal");
        kotlin.jvm.internal.l0.p(callback, "callback");
        c cVar = new c(callback);
        c2 a5 = androidx.credentials.provider.utils.n1.INSTANCE.a(request);
        if (this.isTestMode) {
            this.lastClearRequest = a5;
        }
        g(a5, cancellationSignal, androidx.core.os.u.a(cVar));
    }
}
