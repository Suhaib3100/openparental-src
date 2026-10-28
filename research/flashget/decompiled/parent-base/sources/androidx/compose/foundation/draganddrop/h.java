package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.z0;
import androidx.compose.ui.node.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import ld.p;

/* compiled from: AndroidDragAndDropSource.android.kt */
@z0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B0\u0012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nRC\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/draganddrop/h;", "Landroidx/compose/ui/node/l;", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/e;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "dragAndDropSourceHandler", "<init>", "(Lld/p;)V", "s", "Lld/p;", "J7", "()Lld/p;", "K7", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class h extends l {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private p<? super e, ? super kotlin.coroutines.d<? super k2>, ? extends Object> dragAndDropSourceHandler;

    /* compiled from: AndroidDragAndDropSource.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<androidx.compose.ui.graphics.drawscope.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.draganddrop.b f3636b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.draganddrop.b bVar) {
            super(1);
            this.f3636b = bVar;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
            this.f3636b.b(fVar);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidDragAndDropSource.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter$2", f = "AndroidDragAndDropSource.android.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/e;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/draganddrop/e;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends o implements p<e, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3637b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f3638c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l e eVar, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((b) create(eVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = h.this.new b(dVar);
            bVar.f3638c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f3637b;
            if (i4 == 0) {
                a1.n(obj);
                e eVar = (e) this.f3638c;
                p<e, kotlin.coroutines.d<? super k2>, Object> J7 = h.this.J7();
                this.f3637b = 1;
                if (J7.invoke(eVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidDragAndDropSource.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class c extends h0 implements ld.l<androidx.compose.ui.draw.g, androidx.compose.ui.draw.m> {
        c(Object obj) {
            super(1, obj, androidx.compose.foundation.draganddrop.b.class, "cachePicture", "cachePicture(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;", 0);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.draw.m invoke(@fg.l androidx.compose.ui.draw.g gVar) {
            return ((androidx.compose.foundation.draganddrop.b) this.receiver).a(gVar);
        }
    }

    public h(@fg.l p<? super e, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        this.dragAndDropSourceHandler = pVar;
        androidx.compose.foundation.draganddrop.b bVar = new androidx.compose.foundation.draganddrop.b();
        y7(androidx.compose.ui.draw.l.a(new c(bVar)));
        y7(new d(new a(bVar), new b(null)));
    }

    @fg.l
    public final p<e, kotlin.coroutines.d<? super k2>, Object> J7() {
        return this.dragAndDropSourceHandler;
    }

    public final void K7(@fg.l p<? super e, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        this.dragAndDropSourceHandler = pVar;
    }
}
