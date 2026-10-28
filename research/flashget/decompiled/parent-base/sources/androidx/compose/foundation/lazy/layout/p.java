package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.foundation.lazy.layout.p.a;
import androidx.compose.foundation.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyLayoutIntervalContent.kt */
@z0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u001cB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tJV\u0010\u0013\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000b2\u0006\u0010\f\u001a\u00020\u000626\u0010\u0012\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00028\u00010\rH\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/lazy/layout/p;", "Landroidx/compose/foundation/lazy/layout/p$a;", "Interval", "", "<init>", "()V", "", "index", "z", "(I)Ljava/lang/Object;", "w", "T", "globalIndex", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "localIntervalIndex", "content", "block", "A", "(ILld/p;)Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/layout/c;", "x", "()Landroidx/compose/foundation/lazy/layout/c;", "intervals", "y", "()I", "itemCount", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 2)
@r1({"SMAP\nLazyLayoutIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,85:1\n60#1,3:86\n60#1,3:89\n*S KotlinDebug\n*F\n+ 1 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n40#1:86,3\n48#1:89,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class p<Interval extends a> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6111a = 0;

    /* compiled from: LazyLayoutIntervalContent.kt */
    @z0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001R1\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR1\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/p$a;", "", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "index", "getKey", "()Lld/l;", "key", "getType", "type", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {

        /* compiled from: LazyLayoutIntervalContent.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/layout/p$a;", "Interval", "", "it", "", "a", "(I)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.lazy.layout.p$a$a, reason: collision with other inner class name */
        static final class C0109a extends kotlin.jvm.internal.n0 implements ld.l {

            /* renamed from: b, reason: collision with root package name */
            public static final C0109a f6112b = new C0109a(1);

            C0109a() {
                super(1);
            }

            @fg.m
            public final Void a(int i4) {
                return null;
            }

            @Override // ld.l
            public Object invoke(Object obj) {
                ((Number) obj).intValue();
                return null;
            }
        }

        @fg.m
        default ld.l<Integer, Object> getKey() {
            return null;
        }

        @fg.l
        default ld.l<Integer, Object> getType() {
            return C0109a.f6112b;
        }
    }

    public final <T> T A(int globalIndex, @fg.l ld.p<? super Integer, ? super Interval, ? extends T> block) {
        c.a<Interval> aVar = x().get(globalIndex);
        return block.invoke(Integer.valueOf(globalIndex - aVar.getStartIndex()), aVar.c());
    }

    @fg.m
    public final Object w(int index) {
        c.a<Interval> aVar = x().get(index);
        return aVar.c().getType().invoke(Integer.valueOf(index - aVar.getStartIndex()));
    }

    @fg.l
    public abstract c<Interval> x();

    public final int y() {
        return x().getSize();
    }

    @fg.l
    public final Object z(int index) {
        Object invoke;
        c.a<Interval> aVar = x().get(index);
        int startIndex = index - aVar.getStartIndex();
        ld.l<Integer, Object> key = aVar.c().getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(startIndex))) == null) ? new DefaultLazyKey(index) : invoke;
    }
}
