package androidx.credentials;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.q1;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: CredentialProvider.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JE\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH&¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\nH&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u001b0\nH&¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f0\nH\u0017¢\u0006\u0004\b\u001f\u0010 JE\u0010#\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0017¢\u0006\u0004\b#\u0010$ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Landroidx/credentials/p;", "", "Landroid/content/Context;", "context", "Landroidx/credentials/h1;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/credentials/m;", "Landroidx/credentials/i1;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "Lkotlin/k2;", "onGetCredential", "(Landroid/content/Context;Landroidx/credentials/h1;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "Landroidx/credentials/b;", "Landroidx/credentials/c;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onCreateCredential", "(Landroid/content/Context;Landroidx/credentials/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "", "isAvailableOnDevice", "()Z", "Landroidx/credentials/a;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredential", "(Landroidx/credentials/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "Landroidx/credentials/q1;", "a", "(Landroidx/credentials/h1;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "Landroidx/credentials/q1$b;", "pendingGetCredentialHandle", "b", "(Landroid/content/Context;Landroidx/credentials/q1$b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/m;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface p {
    @androidx.annotation.x0(34)
    default void a(@fg.l h1 request, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<q1, GetCredentialException> callback) {
        kotlin.jvm.internal.l0.p(request, "request");
        kotlin.jvm.internal.l0.p(executor, "executor");
        kotlin.jvm.internal.l0.p(callback, "callback");
    }

    @androidx.annotation.x0(34)
    default void b(@fg.l Context context, @fg.l q1.b pendingGetCredentialHandle, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<i1, GetCredentialException> callback) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        kotlin.jvm.internal.l0.p(executor, "executor");
        kotlin.jvm.internal.l0.p(callback, "callback");
    }

    boolean isAvailableOnDevice();

    void onClearCredential(@fg.l a request, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<Void, ClearCredentialException> callback);

    void onCreateCredential(@fg.l Context context, @fg.l b request, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<c, CreateCredentialException> callback);

    void onGetCredential(@fg.l Context context, @fg.l h1 request, @fg.m CancellationSignal cancellationSignal, @fg.l Executor executor, @fg.l m<i1, GetCredentialException> callback);
}
