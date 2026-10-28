package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.x0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: PersistableBundle.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\u001a?\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000b\u001a\u00020\u0005*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "Lkotlin/q0;", "", "", "pairs", "Landroid/os/PersistableBundle;", "b", "([Lkotlin/q0;)Landroid/os/PersistableBundle;", "a", "()Landroid/os/PersistableBundle;", "", "c", "(Ljava/util/Map;)Landroid/os/PersistableBundle;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPersistableBundle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,152:1\n13579#2,2:153\n*S KotlinDebug\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n*L\n34#1:153,2\n*E\n"})
/* loaded from: classes3.dex */
public final class b0 {
    @fg.l
    @x0(21)
    public static final PersistableBundle a() {
        return z.a(0);
    }

    @fg.l
    @x0(21)
    public static final PersistableBundle b(@fg.l kotlin.q0<String, ? extends Object>... q0VarArr) {
        PersistableBundle a5 = z.a(q0VarArr.length);
        for (kotlin.q0<String, ? extends Object> q0Var : q0VarArr) {
            z.b(a5, q0Var.a(), q0Var.b());
        }
        return a5;
    }

    @fg.l
    @x0(21)
    public static final PersistableBundle c(@fg.l Map<String, ? extends Object> map) {
        PersistableBundle a5 = z.a(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            z.b(a5, entry.getKey(), entry.getValue());
        }
        return a5;
    }
}
