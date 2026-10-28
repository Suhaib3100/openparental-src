package androidx.compose.runtime.internal;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.p1;
import androidx.compose.runtime.t4;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: LiveLiteral.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u000b\u0010\f\"@\u0010\u0011\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000e0\rj\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000e`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0010\"*\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0019"}, d2 = {"Lkotlin/k2;", "a", "()V", "T", "", "key", "value", "Landroidx/compose/runtime/b5;", "d", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/compose/runtime/b5;", "", "e", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/util/HashMap;", "Landroidx/compose/runtime/k2;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "liveLiteralCache", "", "<set-?>", "b", "Z", "()Z", "c", "isLiveLiteralsEnabled", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLiveLiteral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,100:1\n361#2,7:101\n361#2,7:108\n*S KotlinDebug\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n*L\n81#1:101,7\n92#1:108,7\n*E\n"})
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final HashMap<String, k2<Object>> f16798a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f16799b;

    @p1
    public static final void a() {
        f16799b = true;
    }

    public static final boolean b() {
        return f16799b;
    }

    @p1
    @androidx.compose.runtime.q
    public static /* synthetic */ void c() {
    }

    @p1
    @fg.l
    @androidx.compose.runtime.q
    public static final <T> b5<T> d(@fg.l String str, T t4) {
        HashMap<String, k2<Object>> hashMap = f16798a;
        k2<Object> k2Var = hashMap.get(str);
        if (k2Var == null) {
            k2Var = t4.g(t4, null, 2, null);
            hashMap.put(str, k2Var);
        }
        l0.n(k2Var, "null cannot be cast to non-null type androidx.compose.runtime.State<T of androidx.compose.runtime.internal.LiveLiteralKt.liveLiteral>");
        return k2Var;
    }

    @p1
    public static final void e(@fg.l String str, @fg.m Object obj) {
        boolean z4;
        HashMap<String, k2<Object>> hashMap = f16798a;
        k2<Object> k2Var = hashMap.get(str);
        if (k2Var == null) {
            k2Var = t4.g(obj, null, 2, null);
            hashMap.put(str, k2Var);
            z4 = false;
        } else {
            z4 = true;
        }
        k2<Object> k2Var2 = k2Var;
        if (z4) {
            k2Var2.setValue(obj);
        }
    }
}
