package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.x0;
import kotlin.Metadata;

/* compiled from: PersistableBundle.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/core/os/a0;", "", "<init>", "()V", "Landroid/os/PersistableBundle;", "persistableBundle", "", "key", "", "value", "Lkotlin/k2;", "a", "(Landroid/os/PersistableBundle;Ljava/lang/String;Z)V", "", "b", "(Landroid/os/PersistableBundle;Ljava/lang/String;[Z)V", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(22)
/* loaded from: classes3.dex */
final class a0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final a0 f26492a = new a0();

    private a0() {
    }

    @kd.n
    public static final void a(@fg.l PersistableBundle persistableBundle, @fg.m String key, boolean value) {
        persistableBundle.putBoolean(key, value);
    }

    @kd.n
    public static final void b(@fg.l PersistableBundle persistableBundle, @fg.m String key, @fg.l boolean[] value) {
        persistableBundle.putBooleanArray(key, value);
    }
}
