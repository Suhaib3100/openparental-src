package androidx.compose.material3;

import java.util.List;
import kotlin.Metadata;

/* compiled from: AppBar.kt */
@f5
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\bg\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eR\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/g0;", "", "", "e", "()F", "g", "(F)V", "heightOffsetLimit", "b", "f", "heightOffset", "c", "d", "contentOffset", "a", "collapsedFraction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface g0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f10835a;

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/g0$a;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/material3/g0;", "b", "Landroidx/compose/runtime/saveable/l;", "a", "()Landroidx/compose/runtime/saveable/l;", "Saver", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.g0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f10835a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final androidx.compose.runtime.saveable.l<g0, ?> Saver = androidx.compose.runtime.saveable.a.a(C0240a.f10837b, b.f10838b);

        /* compiled from: AppBar.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/material3/g0;", "it", "", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/material3/g0;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.g0$a$a, reason: collision with other inner class name */
        static final class C0240a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, g0, List<? extends Float>> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0240a f10837b = new C0240a(2);

            C0240a() {
                super(2);
            }

            @Override // ld.p
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Float> invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l g0 g0Var) {
                return kotlin.collections.w.O(Float.valueOf(g0Var.e()), Float.valueOf(g0Var.b()), Float.valueOf(g0Var.c()));
            }
        }

        /* compiled from: AppBar.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Landroidx/compose/material3/g0;", "a", "(Ljava/util/List;)Landroidx/compose/material3/g0;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.g0$a$b */
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<List<? extends Float>, g0> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f10838b = new b(1);

            b() {
                super(1);
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g0 invoke(@fg.l List<Float> list) {
                return p.e(list.get(0).floatValue(), list.get(1).floatValue(), list.get(2).floatValue());
            }
        }

        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.saveable.l<g0, ?> a() {
            return Saver;
        }
    }

    float a();

    float b();

    float c();

    void d(float f4);

    float e();

    void f(float f4);

    void g(float f4);
}
