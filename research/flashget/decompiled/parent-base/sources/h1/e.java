package h1;

import androidx.annotation.c1;
import androidx.annotation.m1;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DomError.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lh1/e;", "", "", "type", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String type;

    public e(@fg.l String type) {
        l0.p(type, "type");
        this.type = type;
    }

    @fg.l
    @c1({c1.a.LIBRARY_GROUP})
    @m1(otherwise = 3)
    /* renamed from: a, reason: from getter */
    public String getType() {
        return this.type;
    }
}
