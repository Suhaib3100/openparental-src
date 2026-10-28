package g0;

import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.t;
import fg.l;
import fg.m;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.u0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.s;

/* compiled from: ComposableMethod.jvm.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ<\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\r\"\u0004\u0018\u00010\u0001H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030 0\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lg0/c;", "", "Ljava/lang/reflect/Method;", "method", "Lg0/a;", "composableInfo", "<init>", "(Ljava/lang/reflect/Method;Lg0/a;)V", "a", "()Ljava/lang/reflect/Method;", "Landroidx/compose/runtime/t;", "composer", "instance", "", "args", "e", "(Landroidx/compose/runtime/t;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/reflect/Method;", "b", "Lg0/a;", "parameterCount", "Ljava/lang/reflect/Parameter;", "d", "()[Ljava/lang/reflect/Parameter;", "parameters", "Ljava/lang/Class;", "c", "()[Ljava/lang/Class;", "parameterTypes", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nComposableMethod.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n1549#2:223\n1620#2,3:224\n1804#2,4:227\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n*L\n145#1:223\n145#1:224,3\n146#1:227,4\n*E\n"})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final int f73894c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Method method;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final a composableInfo;

    public c(@l Method method, @l a aVar) {
        this.method = method;
        this.composableInfo = aVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Method getMethod() {
        return this.method;
    }

    public final int b() {
        return this.composableInfo.i();
    }

    @l
    public final Class<?>[] c() {
        return (Class[]) kotlin.collections.l.l1(this.method.getParameterTypes(), 0, this.composableInfo.i());
    }

    @l
    public final Parameter[] d() {
        return (Parameter[]) kotlin.collections.l.l1(this.method.getParameters(), 0, this.composableInfo.i());
    }

    @m
    public final Object e(@l t composer, @m Object instance, @l Object... args) {
        Object obj;
        a aVar = this.composableInfo;
        int realParamsCount = aVar.getRealParamsCount();
        int changedParams = aVar.getChangedParams();
        int defaultParams = aVar.getDefaultParams();
        int length = this.method.getParameterTypes().length;
        int i4 = realParamsCount + 1;
        int i5 = changedParams + i4;
        Object[] objArr = new Integer[defaultParams];
        int i6 = 0;
        for (int i7 = 0; i7 < defaultParams; i7++) {
            int i10 = i7 * 31;
            kotlin.ranges.l W1 = s.W1(i10, Math.min(i10 + 31, realParamsCount));
            ArrayList arrayList = new ArrayList(w.b0(W1, 10));
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                int c5 = ((u0) it).c();
                arrayList.add(Integer.valueOf((c5 >= args.length || args[c5] == null) ? 1 : 0));
            }
            int i11 = 0;
            int i12 = 0;
            for (Object obj2 : arrayList) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    w.Z();
                }
                i11 |= ((Number) obj2).intValue() << i12;
                i12 = i13;
            }
            objArr[i7] = Integer.valueOf(i11);
        }
        Object[] objArr2 = new Object[length];
        while (i6 < length) {
            if (i6 >= 0 && i6 < realParamsCount) {
                obj = (i6 < 0 || i6 > kotlin.collections.l.we(args)) ? d.h(this.method.getParameterTypes()[i6]) : args[i6];
            } else if (i6 == realParamsCount) {
                obj = composer;
            } else if (i6 == i4 || (realParamsCount + 2 <= i6 && i6 < i5)) {
                obj = 0;
            } else {
                if (i5 > i6 || i6 >= length) {
                    throw new IllegalStateException("Unexpected index");
                }
                obj = objArr[i6 - i5];
            }
            objArr2[i6] = obj;
            i6++;
        }
        return this.method.invoke(instance, Arrays.copyOf(objArr2, length));
    }

    public boolean equals(@m Object other) {
        if (other instanceof c) {
            return l0.g(this.method, ((c) other).method);
        }
        return false;
    }

    public int hashCode() {
        return this.method.hashCode();
    }
}
