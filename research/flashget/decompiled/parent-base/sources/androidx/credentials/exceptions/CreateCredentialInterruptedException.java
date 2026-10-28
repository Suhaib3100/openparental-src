package androidx.credentials.exceptions;

import fg.l;
import fg.m;
import kd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: CreateCredentialInterruptedException.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Landroidx/credentials/exceptions/CreateCredentialInterruptedException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "", "errorMessage", "<init>", "(Ljava/lang/CharSequence;)V", "d", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreateCredentialInterruptedException extends CreateCredentialException {

    /* renamed from: e, reason: collision with root package name */
    @l
    public static final String f27656e = "android.credentials.CreateCredentialException.TYPE_INTERRUPTED";

    /* JADX WARN: Multi-variable type inference failed */
    @j
    public CreateCredentialInterruptedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ CreateCredentialInterruptedException(CharSequence charSequence, int i4, w wVar) {
        this((i4 & 1) != 0 ? null : charSequence);
    }

    @j
    public CreateCredentialInterruptedException(@m CharSequence charSequence) {
        super("android.credentials.CreateCredentialException.TYPE_INTERRUPTED", charSequence);
    }
}
