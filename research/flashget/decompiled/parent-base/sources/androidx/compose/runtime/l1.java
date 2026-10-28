package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: HotReloader.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r0\n0\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "context", "Lkotlin/k2;", "d", "(Ljava/lang/Object;)V", "", "key", "c", "(I)V", "", "Lkotlin/q0;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "b", "()Ljava/util/List;", "a", "()V", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nHotReloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotReloader.kt\nandroidx/compose/runtime/HotReloaderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1549#2:91\n1620#2,3:92\n*S KotlinDebug\n*F\n+ 1 HotReloader.kt\nandroidx/compose/runtime/HotReloaderKt\n*L\n83#1:91\n83#1:92,3\n*E\n"})
/* loaded from: classes.dex */
public final class l1 {
    @fg.p
    public static final void a() {
        k1.INSTANCE.a();
    }

    @fg.l
    @fg.p
    public static final List<kotlin.q0<Exception, Boolean>> b() {
        k1.INSTANCE.getClass();
        List<j3> e4 = i3.INSTANCE.e();
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(e4, 10));
        for (j3 j3Var : e4) {
            arrayList.add(new kotlin.q0(j3Var.getCause(), Boolean.valueOf(j3Var.getRecoverable())));
        }
        return arrayList;
    }

    @fg.p
    public static final void c(int i4) {
        k1.INSTANCE.c(i4);
    }

    @fg.p
    public static final void d(@fg.l Object obj) {
        k1.INSTANCE.f(obj);
    }
}
