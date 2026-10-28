package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.x0;
import kotlin.Metadata;

/* compiled from: Bundle.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/core/os/c;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "", "key", "Landroid/util/Size;", "value", "Lkotlin/k2;", "a", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/Size;)V", "Landroid/util/SizeF;", "b", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SizeF;)V", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(21)
/* loaded from: classes3.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final c f26499a = new c();

    private c() {
    }

    @kd.n
    public static final void a(@fg.l Bundle bundle, @fg.l String key, @fg.m Size value) {
        bundle.putSize(key, value);
    }

    @kd.n
    public static final void b(@fg.l Bundle bundle, @fg.l String key, @fg.m SizeF value) {
        bundle.putSizeF(key, value);
    }
}
