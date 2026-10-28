package androidx.content;

import android.os.Bundle;
import androidx.core.os.e;
import fg.l;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlin.q0;

/* compiled from: NavDestinationBuilder.kt */
@h0
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/navigation/m;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/navigation/u0;", "Lkotlin/k2;", "Lkotlin/u;", "optionsBuilder", "d", "(Lld/l;)V", "Landroidx/navigation/l;", "a", "()Landroidx/navigation/l;", "", "I", "c", "()I", "e", "(I)V", "destinationId", "", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "defaultArguments", "Landroidx/navigation/t0;", "Landroidx/navigation/t0;", "navOptions", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int destinationId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final Map<String, Object> defaultArguments = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private t0 navOptions;

    @l
    public final l a() {
        Bundle b5;
        int i4 = this.destinationId;
        t0 t0Var = this.navOptions;
        if (this.defaultArguments.isEmpty()) {
            b5 = null;
        } else {
            Object[] array = z0.J1(this.defaultArguments).toArray(new q0[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            q0[] q0VarArr = (q0[]) array;
            b5 = e.b((q0[]) Arrays.copyOf(q0VarArr, q0VarArr.length));
        }
        return new l(i4, t0Var, b5);
    }

    @l
    public final Map<String, Object> b() {
        return this.defaultArguments;
    }

    /* renamed from: c, reason: from getter */
    public final int getDestinationId() {
        return this.destinationId;
    }

    public final void d(@l ld.l<? super u0, k2> optionsBuilder) {
        l0.p(optionsBuilder, "optionsBuilder");
        u0 u0Var = new u0();
        optionsBuilder.invoke(u0Var);
        this.navOptions = u0Var.b();
    }

    public final void e(int i4) {
        this.destinationId = i4;
    }
}
