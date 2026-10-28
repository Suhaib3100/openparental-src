package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.unit.c0;
import fg.l;
import fg.m;
import kotlin.Metadata;

/* compiled from: NestedScrollModifier.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/a;", "", "Li0/f;", "available", "Landroidx/compose/ui/input/nestedscroll/f;", "source", "i5", "(JI)J", "consumed", "H2", "(JJI)J", "Landroidx/compose/ui/unit/c0;", "F5", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "w0", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface a {

    /* compiled from: NestedScrollModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.input.nestedscroll.a$a, reason: collision with other inner class name */
    public static final class C0335a {
        @m
        @Deprecated
        public static Object a(@l a aVar, long j4, long j5, @l kotlin.coroutines.d<? super c0> dVar) {
            return a.Y3(aVar, j4, j5, dVar);
        }

        @Deprecated
        public static long b(@l a aVar, long j4, long j5, int i4) {
            return a.super.H2(j4, j5, i4);
        }

        @m
        @Deprecated
        public static Object c(@l a aVar, long j4, @l kotlin.coroutines.d<? super c0> dVar) {
            return a.H6(aVar, j4, dVar);
        }

        @Deprecated
        public static long d(@l a aVar, long j4, int i4) {
            return a.super.i5(j4, i4);
        }
    }

    static Object D0(a aVar, long j4, long j5, kotlin.coroutines.d<? super c0> dVar) {
        c0.INSTANCE.getClass();
        return c0.b(c0.f21491c);
    }

    static Object H6(a aVar, long j4, kotlin.coroutines.d dVar) {
        aVar.getClass();
        return z5(aVar, j4, dVar);
    }

    static Object Y3(a aVar, long j4, long j5, kotlin.coroutines.d dVar) {
        aVar.getClass();
        return D0(aVar, j4, j5, dVar);
    }

    static Object z5(a aVar, long j4, kotlin.coroutines.d<? super c0> dVar) {
        c0.INSTANCE.getClass();
        return c0.b(c0.f21491c);
    }

    @m
    default Object F5(long j4, @l kotlin.coroutines.d<? super c0> dVar) {
        return z5(this, j4, dVar);
    }

    default long H2(long consumed, long available, int source) {
        i0.f.INSTANCE.getClass();
        return i0.f.f74147c;
    }

    default long i5(long available, int source) {
        i0.f.INSTANCE.getClass();
        return i0.f.f74147c;
    }

    @m
    default Object w0(long j4, long j5, @l kotlin.coroutines.d<? super c0> dVar) {
        return D0(this, j4, j5, dVar);
    }
}
