package androidx.credentials.exceptions;

import androidx.annotation.c1;
import fg.l;
import fg.m;
import kd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: CreateCredentialException.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u000b\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/credentials/exceptions/CreateCredentialException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "type", "", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Ljava/lang/CharSequence;", "a", "()Ljava/lang/CharSequence;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CreateCredentialException extends Exception {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private final CharSequence errorMessage;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @j
    public CreateCredentialException(@l String type) {
        this(type, null, 2, 0 == true ? 1 : 0);
        l0.p(type, "type");
    }

    @m
    @c1({c1.a.LIBRARY_GROUP})
    /* renamed from: a, reason: from getter */
    public CharSequence getErrorMessage() {
        return this.errorMessage;
    }

    @l
    @c1({c1.a.LIBRARY_GROUP})
    /* renamed from: b, reason: from getter */
    public String getType() {
        return this.type;
    }

    public /* synthetic */ CreateCredentialException(String str, CharSequence charSequence, int i4, w wVar) {
        this(str, (i4 & 2) != 0 ? null : charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public CreateCredentialException(@l String type, @m CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        l0.p(type, "type");
        this.type = type;
        this.errorMessage = charSequence;
    }
}
