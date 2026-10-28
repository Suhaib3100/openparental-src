package androidx.credentials;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialProviderConfigurationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.q1;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: CredentialManagerImpl.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 )2\u00020\u0001:\u0001*B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u001a2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010\"\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020!0\fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Landroidx/credentials/n;", "Landroidx/credentials/l;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/credentials/h1;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/credentials/m;", "Landroidx/credentials/i1;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "Lkotlin/k2;", "m", "(Landroid/content/Context;Landroidx/credentials/h1;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "Landroidx/credentials/q1$b;", "pendingGetCredentialHandle", "i", "(Landroid/content/Context;Landroidx/credentials/q1$b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "Landroidx/credentials/q1;", "o", "(Landroidx/credentials/h1;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "Landroidx/credentials/b;", "Landroidx/credentials/c;", "Landroidx/credentials/exceptions/CreateCredentialException;", "h", "(Landroid/content/Context;Landroidx/credentials/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "Landroidx/credentials/a;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "l", "(Landroidx/credentials/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "Landroid/app/PendingIntent;", "g", "()Landroid/app/PendingIntent;", "b", "Landroid/content/Context;", "c", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ObsoleteSdkInt"})
/* loaded from: classes3.dex */
public final class n implements l {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Context context;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final String f27755d = "android.settings.CREDENTIAL_PROVIDER";

    public n(@fg.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        this.context = context;
    }

    @Override // androidx.credentials.l
    @fg.l
    @androidx.annotation.x0(34)
    public PendingIntent g() {
        Intent intent = new Intent("android.settings.CREDENTIAL_PROVIDER");
        intent.setData(Uri.parse("package:" + this.context.getPackageName()));
        PendingIntent activity = PendingIntent.getActivity(this.context, 0, intent, androidx.core.view.accessibility.b.f26943s);
        kotlin.jvm.internal.l0.o(activity, "getActivity(context, 0, …ingIntent.FLAG_IMMUTABLE)");
        return activity;
    }

    @Override // androidx.credentials.l
    public void h(@fg.l Context context, @fg.l b request, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<c, CreateCredentialException> callback) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(request, "request");
        kotlin.jvm.internal.l0.p(executor, "executor");
        kotlin.jvm.internal.l0.p(callback, "callback");
        p c5 = q.c(new q(this.context), false, 1, null);
        if (c5 == null) {
            callback.a(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            c5.onCreateCredential(context, request, cancellationSignal, executor, callback);
        }
    }

    @Override // androidx.credentials.l
    @androidx.annotation.x0(34)
    public void i(@fg.l Context context, @fg.l q1.b pendingGetCredentialHandle, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<i1, GetCredentialException> callback) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        kotlin.jvm.internal.l0.p(executor, "executor");
        kotlin.jvm.internal.l0.p(callback, "callback");
        p b5 = new q(context).b(false);
        if (b5 == null) {
            callback.a(new GetCredentialProviderConfigurationException("No Credential Manager provider found"));
        } else {
            b5.b(context, pendingGetCredentialHandle, cancellationSignal, executor, callback);
        }
    }

    @Override // androidx.credentials.l
    public void l(@fg.l a request, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<Void, ClearCredentialException> callback) {
        kotlin.jvm.internal.l0.p(request, "request");
        kotlin.jvm.internal.l0.p(executor, "executor");
        kotlin.jvm.internal.l0.p(callback, "callback");
        p c5 = q.c(new q(this.context), false, 1, null);
        if (c5 == null) {
            callback.a(new ClearCredentialProviderConfigurationException("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            c5.onClearCredential(request, cancellationSignal, executor, callback);
        }
    }

    @Override // androidx.credentials.l
    public void m(@fg.l Context context, @fg.l h1 request, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<i1, GetCredentialException> callback) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(request, "request");
        kotlin.jvm.internal.l0.p(executor, "executor");
        kotlin.jvm.internal.l0.p(callback, "callback");
        p c5 = q.c(new q(context), false, 1, null);
        if (c5 == null) {
            callback.a(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            c5.onGetCredential(context, request, cancellationSignal, executor, callback);
        }
    }

    @Override // androidx.credentials.l
    @androidx.annotation.x0(34)
    public void o(@fg.l h1 request, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<q1, GetCredentialException> callback) {
        kotlin.jvm.internal.l0.p(request, "request");
        kotlin.jvm.internal.l0.p(executor, "executor");
        kotlin.jvm.internal.l0.p(callback, "callback");
        p b5 = new q(this.context).b(false);
        if (b5 == null) {
            callback.a(new GetCredentialProviderConfigurationException("No Credential Manager provider found"));
        } else {
            b5.a(request, cancellationSignal, executor, callback);
        }
    }
}
