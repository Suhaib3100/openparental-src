package androidx.compose.foundation.draganddrop;

import android.graphics.Picture;
import androidx.compose.foundation.z0;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.graphics.v1;
import androidx.compose.ui.unit.w;
import fg.m;
import i0.n;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import ld.l;

/* compiled from: AndroidDragAndDropSource.android.kt */
@z0
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/draganddrop/b;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/drawscope/f;", "drawScope", "Lkotlin/k2;", "b", "(Landroidx/compose/ui/graphics/drawscope/f;)V", "Landroidx/compose/ui/draw/g;", "scope", "Landroidx/compose/ui/draw/m;", "a", "(Landroidx/compose/ui/draw/g;)Landroidx/compose/ui/draw/m;", "Landroid/graphics/Picture;", "Landroid/graphics/Picture;", "cachedPicture", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidDragAndDropSource.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDragAndDropSource.android.kt\nandroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,146:1\n246#2:147\n*S KotlinDebug\n*F\n+ 1 AndroidDragAndDropSource.android.kt\nandroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback\n*L\n118#1:147\n*E\n"})
/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @m
    private Picture cachedPicture;

    /* compiled from: AndroidDragAndDropSource.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nAndroidDragAndDropSource.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDragAndDropSource.android.kt\nandroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback$cachePicture$1$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,146:1\n299#2,20:147\n246#2:167\n*S KotlinDebug\n*F\n+ 1 AndroidDragAndDropSource.android.kt\nandroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback$cachePicture$1$1\n*L\n132#1:147,20\n142#1:167\n*E\n"})
    static final class a extends n0 implements l<androidx.compose.ui.graphics.drawscope.c, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Picture f3619b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f3620c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f3621d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Picture picture, int i4, int i5) {
            super(1);
            this.f3619b = picture;
            this.f3620c = i4;
            this.f3621d = i5;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
            v1 b5 = h0.b(this.f3619b.beginRecording(this.f3620c, this.f3621d));
            w layoutDirection = cVar.getLayoutDirection();
            long e4 = cVar.e();
            androidx.compose.ui.unit.d b6 = cVar.getDrawContext().b();
            w layoutDirection2 = cVar.getDrawContext().getLayoutDirection();
            v1 i4 = cVar.getDrawContext().i();
            long e5 = cVar.getDrawContext().e();
            androidx.compose.ui.graphics.drawscope.d drawContext = cVar.getDrawContext();
            drawContext.g(cVar);
            drawContext.a(layoutDirection);
            drawContext.k(b5);
            drawContext.j(e4);
            b5.C();
            cVar.G6();
            b5.o();
            androidx.compose.ui.graphics.drawscope.d drawContext2 = cVar.getDrawContext();
            drawContext2.g(b6);
            drawContext2.a(layoutDirection2);
            drawContext2.k(i4);
            drawContext2.j(e5);
            this.f3619b.endRecording();
            h0.d(cVar.getDrawContext().i()).drawPicture(this.f3619b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.graphics.drawscope.c cVar) {
            a(cVar);
            return k2.f75408a;
        }
    }

    @fg.l
    public final androidx.compose.ui.draw.m a(@fg.l androidx.compose.ui.draw.g scope) {
        Picture picture = new Picture();
        this.cachedPicture = picture;
        return scope.p(new a(picture, (int) n.t(scope.e()), (int) n.m(scope.e())));
    }

    public final void b(@fg.l androidx.compose.ui.graphics.drawscope.f drawScope) {
        Picture picture = this.cachedPicture;
        if (picture == null) {
            throw new IllegalArgumentException("No cached drag shadow. Check if Modifier.cacheDragShadow(painter) was called.");
        }
        h0.d(drawScope.getDrawContext().i()).drawPicture(picture);
    }
}
