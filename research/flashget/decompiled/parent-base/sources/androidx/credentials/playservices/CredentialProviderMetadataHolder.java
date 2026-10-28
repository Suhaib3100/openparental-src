package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.annotation.c1;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: CredentialProviderMetadataHolder.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u00060\tR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderMetadataHolder;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Landroidx/credentials/playservices/CredentialProviderMetadataHolder$a;", "b", "Landroidx/credentials/playservices/CredentialProviderMetadataHolder$a;", "binder", "a", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CredentialProviderMetadataHolder extends Service {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a binder = new a();

    /* compiled from: CredentialProviderMetadataHolder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderMetadataHolder$a;", "Landroid/os/Binder;", "<init>", "(Landroidx/credentials/playservices/CredentialProviderMetadataHolder;)V", "Landroidx/credentials/playservices/CredentialProviderMetadataHolder;", "a", "()Landroidx/credentials/playservices/CredentialProviderMetadataHolder;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class a extends Binder {
        public a() {
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final CredentialProviderMetadataHolder getF27772a() {
            return CredentialProviderMetadataHolder.this;
        }
    }

    @Override // android.app.Service
    @fg.l
    public IBinder onBind(@fg.l Intent intent) {
        l0.p(intent, "intent");
        return this.binder;
    }
}
