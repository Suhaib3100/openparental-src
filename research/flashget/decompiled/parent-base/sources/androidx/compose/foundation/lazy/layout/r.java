package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LazyLayoutItemContentFactory.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/lazy/layout/s;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/o0;", "Landroidx/compose/runtime/saveable/f;", "saveableStateHolder", "", "index", "", "key", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/layout/s;Ljava/lang/Object;ILjava/lang/Object;Landroidx/compose/runtime/t;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {

    /* compiled from: LazyLayoutItemContentFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f6126b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6127c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f6128d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s sVar, int i4, Object obj) {
            super(2);
            this.f6126b = sVar;
            this.f6127c = i4;
            this.f6128d = obj;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(980966366, i4, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:134)");
            }
            this.f6126b.i(this.f6127c, this.f6128d, tVar, 64);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyLayoutItemContentFactory.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f6129b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f6130c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6131d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f6132e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6133f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s sVar, Object obj, int i4, Object obj2, int i5) {
            super(2);
            this.f6129b = sVar;
            this.f6130c = obj;
            this.f6131d = i4;
            this.f6132e = obj2;
            this.f6133f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r.a(this.f6129b, this.f6130c, this.f6131d, this.f6132e, tVar, g3.b(this.f6133f | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i
    public static final void a(s sVar, Object obj, int i4, Object obj2, androidx.compose.runtime.t tVar, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(1439843069);
        if ((i5 & 14) == 0) {
            i6 = (o4.q0(sVar) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            i6 |= o4.q0(obj) ? 32 : 16;
        }
        if ((i5 & 896) == 0) {
            i6 |= o4.f(i4) ? 256 : 128;
        }
        if ((i5 & 7168) == 0) {
            i6 |= o4.q0(obj2) ? 2048 : 1024;
        }
        if ((i6 & 5851) == 1170 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1439843069, i6, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:132)");
            }
            ((androidx.compose.runtime.saveable.f) obj).b(obj2, androidx.compose.runtime.internal.c.b(o4, 980966366, true, new a(sVar, i4, obj2)), o4, 568);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(sVar, obj, i4, obj2, i5));
        }
    }
}
