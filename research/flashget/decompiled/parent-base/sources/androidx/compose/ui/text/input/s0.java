package androidx.compose.ui.text.input;

import androidx.compose.foundation.layout.f3;
import androidx.compose.runtime.m1;
import kotlin.Metadata;

/* compiled from: PlatformImeOptions.android.kt */
@m1
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/input/s0;", "", "", "privateImeOptions", "<init>", "(Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f21105b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String privateImeOptions;

    /* JADX WARN: Multi-variable type inference failed */
    public s0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final String getPrivateImeOptions() {
        return this.privateImeOptions;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof s0) && kotlin.jvm.internal.l0.g(this.privateImeOptions, ((s0) other).privateImeOptions);
    }

    public int hashCode() {
        String str = this.privateImeOptions;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @fg.l
    public String toString() {
        return f3.a(new StringBuilder("PlatformImeOptions(privateImeOptions="), this.privateImeOptions, ')');
    }

    public s0(@fg.m String str) {
        this.privateImeOptions = str;
    }

    public /* synthetic */ s0(String str, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? null : str);
    }
}
