package androidx.credentials.playservices.controllers;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.collection.r2;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.b;
import fg.l;
import fg.m;
import java.util.concurrent.Executor;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.k2;
import ld.p;

/* compiled from: CredentialProviderController.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000 $*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u0001*\b\b\u0003\u0010\u0005*\u00020\u0001*\b\b\u0004\u0010\u0006*\u00020\u00012\u00020\u0007:\u0001%B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ[\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00028\u00040\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00028\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00132\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u0000H$¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00028\u00032\u0006\u0010 \u001a\u00028\u0002H$¢\u0006\u0004\b!\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Landroidx/credentials/playservices/controllers/b;", "", "T1", "T2", "R2", "R1", "E1", "Landroidx/credentials/playservices/controllers/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "resultData", "Lkotlin/Function2;", "", "conversionFn", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/credentials/m;", "callback", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "j", "(Landroid/os/Bundle;Lld/p;Ljava/util/concurrent/Executor;Landroidx/credentials/m;Landroid/os/CancellationSignal;)Z", "request", "Lkotlin/k2;", "i", "(Ljava/lang/Object;Landroidx/credentials/m;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "response", "h", "x", "Landroid/content/Context;", "y", "a", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class b<T1, T2, R2, R1, E1> extends a {

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @l
    private final Context context;

    /* renamed from: z, reason: collision with root package name */
    @l
    public static final String f27949z = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: CredentialProviderController.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042 \u0010\n\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016JW\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042 \u0010\n\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0005¢\u0006\u0004\b\u0018\u0010\u0011J'\u0010\u001a\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0005¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/credentials/playservices/controllers/b$a;", "", "<init>", "()V", "", "resultCode", "Lkotlin/Function2;", "Landroid/os/CancellationSignal;", "Lkotlin/Function0;", "Lkotlin/k2;", "cancelOnError", "Lkotlin/Function1;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onError", "cancellationSignal", "", "d", "(ILld/p;Lld/l;Landroid/os/CancellationSignal;)Z", "", "c", "(I)Ljava/lang/String;", "b", "()Ljava/lang/String;", "Landroidx/credentials/exceptions/GetCredentialException;", "e", "onResultOrException", "a", "(Landroid/os/CancellationSignal;Lld/a;)V", "ERROR_MESSAGE_START_ACTIVITY_FAILED", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.playservices.controllers.b$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: CredentialProviderController.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T1", "T2", "R2", "R1", "E1", "Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.playservices.controllers.b$a$a, reason: collision with other inner class name */
        static final class C0448a extends n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.l<CreateCredentialException, k2> f27951b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k1.h<CreateCredentialException> f27952c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0448a(ld.l<? super CreateCredentialException, k2> lVar, k1.h<CreateCredentialException> hVar) {
                super(0);
                this.f27951b = lVar;
                this.f27952c = hVar;
            }

            public final void a() {
                this.f27951b.invoke(this.f27952c.f75329b);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* compiled from: CredentialProviderController.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T1", "T2", "R2", "R1", "E1", "Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.playservices.controllers.b$a$b, reason: collision with other inner class name */
        static final class C0449b extends n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.l<GetCredentialException, k2> f27953b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k1.h<GetCredentialException> f27954c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0449b(ld.l<? super GetCredentialException, k2> lVar, k1.h<GetCredentialException> hVar) {
                super(0);
                this.f27953b = lVar;
                this.f27954c = hVar;
            }

            public final void a() {
                this.f27953b.invoke(this.f27954c.f75329b);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        private Companion() {
        }

        @n
        protected final void a(@m CancellationSignal cancellationSignal, @l ld.a<k2> onResultOrException) {
            l0.p(onResultOrException, "onResultOrException");
            if (CredentialProviderPlayServicesImpl.INSTANCE.a(cancellationSignal)) {
                return;
            }
            onResultOrException.invoke();
        }

        @l
        public final String b() {
            return "activity is cancelled by the user.";
        }

        @l
        public final String c(int resultCode) {
            return r2.a("activity with result code: ", resultCode, " indicating not RESULT_OK");
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.CreateCredentialUnknownException] */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, androidx.credentials.exceptions.CreateCredentialCancellationException] */
        @n
        protected final boolean d(int resultCode, @l p<? super CancellationSignal, ? super ld.a<k2>, k2> cancelOnError, @l ld.l<? super CreateCredentialException, k2> onError, @m CancellationSignal cancellationSignal) {
            l0.p(cancelOnError, "cancelOnError");
            l0.p(onError, "onError");
            if (resultCode == -1) {
                return false;
            }
            k1.h hVar = new k1.h();
            hVar.f75329b = new CreateCredentialUnknownException(c(resultCode));
            if (resultCode == 0) {
                hVar.f75329b = new CreateCredentialCancellationException("activity is cancelled by the user.");
            }
            cancelOnError.invoke(cancellationSignal, new C0448a(onError, hVar));
            return true;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, androidx.credentials.exceptions.GetCredentialCancellationException] */
        @n
        protected final boolean e(int resultCode, @l p<? super CancellationSignal, ? super ld.a<k2>, k2> cancelOnError, @l ld.l<? super GetCredentialException, k2> onError, @m CancellationSignal cancellationSignal) {
            l0.p(cancelOnError, "cancelOnError");
            l0.p(onError, "onError");
            if (resultCode == -1) {
                return false;
            }
            k1.h hVar = new k1.h();
            hVar.f75329b = new GetCredentialUnknownException(c(resultCode));
            if (resultCode == 0) {
                hVar.f75329b = new GetCredentialCancellationException("activity is cancelled by the user.");
            }
            cancelOnError.invoke(cancellationSignal, new C0449b(onError, hVar));
            return true;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: CredentialProviderController.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T1", "T2", "R2", "R1", "E1", "Lkotlin/k2;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.credentials.playservices.controllers.b$b, reason: collision with other inner class name */
    static final class C0450b extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f27955b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.credentials.m<R1, E1> f27956c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ E1 f27957d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0450b(Executor executor, androidx.credentials.m<R1, E1> mVar, E1 e12) {
            super(0);
            this.f27955b = executor;
            this.f27956c = mVar;
            this.f27957d = e12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(androidx.credentials.m callback, Object exception) {
            l0.p(callback, "$callback");
            l0.p(exception, "$exception");
            callback.a(exception);
        }

        public final void b() {
            Executor executor = this.f27955b;
            final androidx.credentials.m<R1, E1> mVar = this.f27956c;
            final E1 e12 = this.f27957d;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.C0450b.c(androidx.credentials.m.this, e12);
                }
            });
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            b();
            return k2.f75408a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@l Context context) {
        super(context);
        l0.p(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @n
    public static final void f(@m CancellationSignal cancellationSignal, @l ld.a<k2> aVar) {
        INSTANCE.a(cancellationSignal, aVar);
    }

    @n
    protected static final boolean k(int i4, @l p<? super CancellationSignal, ? super ld.a<k2>, k2> pVar, @l ld.l<? super CreateCredentialException, k2> lVar, @m CancellationSignal cancellationSignal) {
        return INSTANCE.d(i4, pVar, lVar, cancellationSignal);
    }

    @n
    protected static final boolean l(int i4, @l p<? super CancellationSignal, ? super ld.a<k2>, k2> pVar, @l ld.l<? super GetCredentialException, k2> lVar, @m CancellationSignal cancellationSignal) {
        return INSTANCE.e(i4, pVar, lVar, cancellationSignal);
    }

    @l
    protected abstract T2 g(@l T1 request);

    @l
    protected abstract R1 h(@l R2 response);

    public abstract void i(@l T1 request, @l androidx.credentials.m<R1, E1> callback, @l Executor executor, @m CancellationSignal cancellationSignal);

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean j(@l Bundle resultData, @l p<? super String, ? super String, ? extends E1> conversionFn, @l Executor executor, @l androidx.credentials.m<R1, E1> callback, @m CancellationSignal cancellationSignal) {
        l0.p(resultData, "resultData");
        l0.p(conversionFn, "conversionFn");
        l0.p(executor, "executor");
        l0.p(callback, "callback");
        if (!resultData.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        f(cancellationSignal, new C0450b(executor, callback, conversionFn.invoke(resultData.getString("EXCEPTION_TYPE"), resultData.getString("EXCEPTION_MESSAGE"))));
        return true;
    }
}
