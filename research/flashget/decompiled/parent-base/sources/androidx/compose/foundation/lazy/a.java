package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.layout.l1;
import androidx.compose.runtime.g3;
import androidx.compose.ui.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyDsl.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a«\u0001\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\n\u0010\t\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042%\b\n\u0010\n\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000423\b\u0004\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0084\u0001\u0010\u0013\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\n\u0010\t\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000423\b\u0004\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014\u001aê\u0001\u0010\u0018\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022:\b\n\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2:\b\u0006\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2H\b\u0004\u0010\u0010\u001aB\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a®\u0001\u0010\u001a\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022:\b\n\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2H\b\u0004\u0010\u0010\u001aB\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a«\u0001\u0010\u001d\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2%\b\n\u0010\t\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042%\b\n\u0010\n\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000423\b\u0004\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0086\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0084\u0001\u0010\u001f\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2%\b\n\u0010\t\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000423\b\u0004\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b\u001f\u0010 \u001aê\u0001\u0010!\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2:\b\n\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2:\b\u0006\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2H\b\u0004\u0010\u0010\u001aB\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0086\b¢\u0006\u0004\b!\u0010\"\u001a®\u0001\u0010#\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2:\b\n\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2H\b\u0004\u0010\u0010\u001aB\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0087\b¢\u0006\u0004\b#\u0010$\u001ax\u00105\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u00020+2\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b5\u00106\u001ax\u0010;\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u00108\u001a\u0002072\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u00020+2\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b;\u0010<\u001an\u0010=\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u00108\u001a\u0002072\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u00102\u001a\u0002012\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b=\u0010>\u001an\u0010?\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00102\u001a\u0002012\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b?\u0010@¨\u0006A"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "items", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "item", "", "key", "contentType", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/b;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "itemContent", "e", "(Landroidx/compose/foundation/lazy/y;Ljava/util/List;Lld/l;Lld/l;Lld/r;)V", "f", "(Landroidx/compose/foundation/lazy/y;Ljava/util/List;Lld/l;Lld/r;)V", "", "index", "Lkotlin/Function3;", "m", "(Landroidx/compose/foundation/lazy/y;Ljava/util/List;Lld/p;Lld/p;Lld/s;)V", "n", "(Landroidx/compose/foundation/lazy/y;Ljava/util/List;Lld/p;Lld/s;)V", "", "g", "(Landroidx/compose/foundation/lazy/y;[Ljava/lang/Object;Lld/l;Lld/l;Lld/r;)V", "h", "(Landroidx/compose/foundation/lazy/y;[Ljava/lang/Object;Lld/l;Lld/r;)V", "o", "(Landroidx/compose/foundation/lazy/y;[Ljava/lang/Object;Lld/p;Lld/p;Lld/s;)V", "p", "(Landroidx/compose/foundation/lazy/y;[Ljava/lang/Object;Lld/p;Lld/s;)V", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/foundation/lazy/c0;", "state", "Landroidx/compose/foundation/layout/l1;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/i$e;", "horizontalArrangement", "Landroidx/compose/ui/c$c;", "verticalAlignment", "Landroidx/compose/foundation/gestures/e0;", "flingBehavior", "userScrollEnabled", "content", "d", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/lazy/c0;Landroidx/compose/foundation/layout/l1;ZLandroidx/compose/foundation/layout/i$e;Landroidx/compose/ui/c$c;Landroidx/compose/foundation/gestures/e0;ZLld/l;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/foundation/layout/i$m;", "verticalArrangement", "Landroidx/compose/ui/c$b;", "horizontalAlignment", "b", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/lazy/c0;Landroidx/compose/foundation/layout/l1;ZLandroidx/compose/foundation/layout/i$m;Landroidx/compose/ui/c$b;Landroidx/compose/foundation/gestures/e0;ZLld/l;Landroidx/compose/runtime/t;II)V", "a", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/lazy/c0;Landroidx/compose/foundation/layout/l1;ZLandroidx/compose/foundation/layout/i$m;Landroidx/compose/ui/c$b;Landroidx/compose/foundation/gestures/e0;Lld/l;Landroidx/compose/runtime/t;II)V", "c", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/lazy/c0;Landroidx/compose/foundation/layout/l1;ZLandroidx/compose/foundation/layout/i$e;Landroidx/compose/ui/c$c;Landroidx/compose/foundation/gestures/e0;Lld/l;Landroidx/compose/runtime/t;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,426:1\n139#1,12:427\n174#1,12:439\n209#1,12:451\n244#1,12:463\n154#2:475\n154#2:476\n154#2:477\n154#2:478\n*S KotlinDebug\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n157#1:427,12\n192#1:439,12\n227#1:451,12\n262#1:463,12\n296#1:475\n352#1:476\n380#1:477\n406#1:478\n*E\n"})
/* loaded from: classes.dex */
public final class a {

    /* compiled from: LazyDsl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.a$a, reason: collision with other inner class name */
    static final class C0101a extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f5430b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f5431c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l1 f5432d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f5433e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i.m f5434f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c.b f5435g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.e0 f5436h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f5437i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.l<y, k2> f5438j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f5439k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f5440l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0101a(androidx.compose.ui.q qVar, c0 c0Var, l1 l1Var, boolean z4, i.m mVar, c.b bVar, androidx.compose.foundation.gestures.e0 e0Var, boolean z5, ld.l<? super y, k2> lVar, int i4, int i5) {
            super(2);
            this.f5430b = qVar;
            this.f5431c = c0Var;
            this.f5432d = l1Var;
            this.f5433e = z4;
            this.f5434f = mVar;
            this.f5435g = bVar;
            this.f5436h = e0Var;
            this.f5437i = z5;
            this.f5438j = lVar;
            this.f5439k = i4;
            this.f5440l = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a.b(this.f5430b, this.f5431c, this.f5432d, this.f5433e, this.f5434f, this.f5435g, this.f5436h, this.f5437i, this.f5438j, tVar, g3.b(this.f5439k | 1), this.f5440l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f5441b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f5442c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l1 f5443d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f5444e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i.m f5445f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c.b f5446g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.e0 f5447h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.l<y, k2> f5448i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f5449j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f5450k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.q qVar, c0 c0Var, l1 l1Var, boolean z4, i.m mVar, c.b bVar, androidx.compose.foundation.gestures.e0 e0Var, ld.l<? super y, k2> lVar, int i4, int i5) {
            super(2);
            this.f5441b = qVar;
            this.f5442c = c0Var;
            this.f5443d = l1Var;
            this.f5444e = z4;
            this.f5445f = mVar;
            this.f5446g = bVar;
            this.f5447h = e0Var;
            this.f5448i = lVar;
            this.f5449j = i4;
            this.f5450k = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a.a(this.f5441b, this.f5442c, this.f5443d, this.f5444e, this.f5445f, this.f5446g, this.f5447h, this.f5448i, tVar, g3.b(this.f5449j | 1), this.f5450k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f5451b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f5452c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l1 f5453d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f5454e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i.e f5455f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC0326c f5456g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.e0 f5457h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f5458i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.l<y, k2> f5459j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f5460k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f5461l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.q qVar, c0 c0Var, l1 l1Var, boolean z4, i.e eVar, c.InterfaceC0326c interfaceC0326c, androidx.compose.foundation.gestures.e0 e0Var, boolean z5, ld.l<? super y, k2> lVar, int i4, int i5) {
            super(2);
            this.f5451b = qVar;
            this.f5452c = c0Var;
            this.f5453d = l1Var;
            this.f5454e = z4;
            this.f5455f = eVar;
            this.f5456g = interfaceC0326c;
            this.f5457h = e0Var;
            this.f5458i = z5;
            this.f5459j = lVar;
            this.f5460k = i4;
            this.f5461l = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a.d(this.f5451b, this.f5452c, this.f5453d, this.f5454e, this.f5455f, this.f5456g, this.f5457h, this.f5458i, this.f5459j, tVar, g3.b(this.f5460k | 1), this.f5461l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f5462b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f5463c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l1 f5464d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f5465e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i.e f5466f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC0326c f5467g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.e0 f5468h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.l<y, k2> f5469i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f5470j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f5471k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(androidx.compose.ui.q qVar, c0 c0Var, l1 l1Var, boolean z4, i.e eVar, c.InterfaceC0326c interfaceC0326c, androidx.compose.foundation.gestures.e0 e0Var, ld.l<? super y, k2> lVar, int i4, int i5) {
            super(2);
            this.f5462b = qVar;
            this.f5463c = c0Var;
            this.f5464d = l1Var;
            this.f5465e = z4;
            this.f5466f = eVar;
            this.f5467g = interfaceC0326c;
            this.f5468h = e0Var;
            this.f5469i = lVar;
            this.f5470j = i4;
            this.f5471k = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a.c(this.f5462b, this.f5463c, this.f5464d, this.f5465e, this.f5466f, this.f5467g, this.f5468h, this.f5469i, tVar, g3.b(this.f5470j | 1), this.f5471k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$1\n*L\n1#1,426:1\n*E\n"})
    public static final class e extends n0 implements ld.l {

        /* renamed from: b, reason: collision with root package name */
        public static final e f5472b = new e(1);

        public e() {
            super(1);
        }

        @fg.m
        public final Void a(Object obj) {
            return null;
        }

        @Override // ld.l
        public Object invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$2\n*L\n1#1,426:1\n*E\n"})
    public static final class f extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Object> f5473b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f5474c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(ld.l<? super T, ? extends Object> lVar, List<? extends T> list) {
            super(1);
            this.f5473b = lVar;
            this.f5474c = list;
        }

        @fg.l
        public final Object a(int i4) {
            return this.f5473b.invoke(this.f5474c.get(i4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$3\n*L\n1#1,426:1\n*E\n"})
    public static final class g extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Object> f5475b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f5476c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(ld.l<? super T, ? extends Object> lVar, List<? extends T> list) {
            super(1);
            this.f5475b = lVar;
            this.f5476c = list;
        }

        @fg.m
        public final Object a(int i4) {
            return this.f5475b.invoke(this.f5476c.get(i4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/b;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/b;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n*L\n1#1,426:1\n*E\n"})
    public static final class h extends n0 implements ld.r<androidx.compose.foundation.lazy.b, Integer, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.r<androidx.compose.foundation.lazy.b, T, androidx.compose.runtime.t, Integer, k2> f5477b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f5478c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(ld.r<? super androidx.compose.foundation.lazy.b, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar, List<? extends T> list) {
            super(4);
            this.f5477b = rVar;
            this.f5478c = list;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.foundation.lazy.b bVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
            int i6;
            if ((i5 & 14) == 0) {
                i6 = (tVar.q0(bVar) ? 4 : 2) | i5;
            } else {
                i6 = i5;
            }
            if ((i5 & 112) == 0) {
                i6 |= tVar.f(i4) ? 32 : 16;
            }
            if ((i6 & 731) == 146 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-632812321, i6, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
            }
            this.f5477b.i(bVar, this.f5478c.get(i4), tVar, Integer.valueOf(i6 & 14));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ k2 i(androidx.compose.foundation.lazy.b bVar, Integer num, androidx.compose.runtime.t tVar, Integer num2) {
            a(bVar, num.intValue(), tVar, num2.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$5\n*L\n1#1,426:1\n*E\n"})
    public static final class i extends n0 implements ld.l {

        /* renamed from: b, reason: collision with root package name */
        public static final i f5479b = new i(1);

        public i() {
            super(1);
        }

        @fg.m
        public final Void a(Object obj) {
            return null;
        }

        @Override // ld.l
        public Object invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$6\n*L\n1#1,426:1\n*E\n"})
    public static final class j extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Object> f5480b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f5481c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(ld.l<? super T, ? extends Object> lVar, T[] tArr) {
            super(1);
            this.f5480b = lVar;
            this.f5481c = tArr;
        }

        @fg.l
        public final Object a(int i4) {
            return this.f5480b.invoke(this.f5481c[i4]);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$7\n*L\n1#1,426:1\n*E\n"})
    public static final class k extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Object> f5482b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f5483c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(ld.l<? super T, ? extends Object> lVar, T[] tArr) {
            super(1);
            this.f5482b = lVar;
            this.f5483c = tArr;
        }

        @fg.m
        public final Object a(int i4) {
            return this.f5482b.invoke(this.f5483c[i4]);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/b;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/b;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$8\n*L\n1#1,426:1\n*E\n"})
    public static final class l extends n0 implements ld.r<androidx.compose.foundation.lazy.b, Integer, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.r<androidx.compose.foundation.lazy.b, T, androidx.compose.runtime.t, Integer, k2> f5484b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f5485c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(ld.r<? super androidx.compose.foundation.lazy.b, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar, T[] tArr) {
            super(4);
            this.f5484b = rVar;
            this.f5485c = tArr;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.foundation.lazy.b bVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
            int i6;
            if ((i5 & 14) == 0) {
                i6 = (tVar.q0(bVar) ? 4 : 2) | i5;
            } else {
                i6 = i5;
            }
            if ((i5 & 112) == 0) {
                i6 |= tVar.f(i4) ? 32 : 16;
            }
            if ((i6 & 731) == 146 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1043393750, i6, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:218)");
            }
            this.f5484b.i(bVar, this.f5485c[i4], tVar, Integer.valueOf(i6 & 14));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ k2 i(androidx.compose.foundation.lazy.b bVar, Integer num, androidx.compose.runtime.t tVar, Integer num2) {
            a(bVar, num.intValue(), tVar, num2.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "androidx/compose/foundation/lazy/a$q"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$3\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$1\n*L\n1#1,426:1\n177#2:427\n*E\n"})
    public static final class m extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f5486b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(List list) {
            super(1);
            this.f5486b = list;
        }

        @fg.m
        public final Object a(int i4) {
            this.f5486b.get(i4);
            return null;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "androidx/compose/foundation/lazy/a$u"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$7\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$5\n*L\n1#1,426:1\n247#2:427\n*E\n"})
    public static final class n extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f5487b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Object[] objArr) {
            super(1);
            this.f5487b = objArr;
        }

        @fg.m
        public final Object a(int i4) {
            Object obj = this.f5487b[i4];
            return null;
        }

        @Override // ld.l
        public Object invoke(Integer num) {
            Object obj = this.f5487b[num.intValue()];
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "", "a", "(ILjava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$1\n*L\n1#1,426:1\n*E\n"})
    public static final class o extends n0 implements ld.p {

        /* renamed from: b, reason: collision with root package name */
        public static final o f5488b = new o(2);

        public o() {
            super(2);
        }

        @fg.m
        public final Void a(int i4, Object obj) {
            return null;
        }

        @Override // ld.p
        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).intValue();
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$2\n*L\n1#1,426:1\n*E\n"})
    public static final class p extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<Integer, T, Object> f5489b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f5490c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(ld.p<? super Integer, ? super T, ? extends Object> pVar, List<? extends T> list) {
            super(1);
            this.f5489b = pVar;
            this.f5490c = list;
        }

        @fg.l
        public final Object a(int i4) {
            return this.f5489b.invoke(Integer.valueOf(i4), this.f5490c.get(i4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$3\n*L\n1#1,426:1\n*E\n"})
    public static final class q extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<Integer, T, Object> f5491b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f5492c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(ld.p<? super Integer, ? super T, ? extends Object> pVar, List<? extends T> list) {
            super(1);
            this.f5491b = pVar;
            this.f5492c = list;
        }

        @fg.m
        public final Object a(int i4) {
            return this.f5491b.invoke(Integer.valueOf(i4), this.f5492c.get(i4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/b;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/b;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4\n*L\n1#1,426:1\n*E\n"})
    public static final class r extends n0 implements ld.r<androidx.compose.foundation.lazy.b, Integer, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.s<androidx.compose.foundation.lazy.b, Integer, T, androidx.compose.runtime.t, Integer, k2> f5493b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f5494c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(ld.s<? super androidx.compose.foundation.lazy.b, ? super Integer, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> sVar, List<? extends T> list) {
            super(4);
            this.f5493b = sVar;
            this.f5494c = list;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.foundation.lazy.b bVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
            int i6;
            if ((i5 & 14) == 0) {
                i6 = (tVar.q0(bVar) ? 4 : 2) | i5;
            } else {
                i6 = i5;
            }
            if ((i5 & 112) == 0) {
                i6 |= tVar.f(i4) ? 32 : 16;
            }
            if ((i6 & 731) == 146 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1091073711, i6, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
            }
            this.f5493b.a0(bVar, Integer.valueOf(i4), this.f5494c.get(i4), tVar, Integer.valueOf(i6 & 126));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ k2 i(androidx.compose.foundation.lazy.b bVar, Integer num, androidx.compose.runtime.t tVar, Integer num2) {
            a(bVar, num.intValue(), tVar, num2.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "", "a", "(ILjava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$5\n*L\n1#1,426:1\n*E\n"})
    public static final class s extends n0 implements ld.p {

        /* renamed from: b, reason: collision with root package name */
        public static final s f5495b = new s(2);

        public s() {
            super(2);
        }

        @fg.m
        public final Void a(int i4, Object obj) {
            return null;
        }

        @Override // ld.p
        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).intValue();
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$6\n*L\n1#1,426:1\n*E\n"})
    public static final class t extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<Integer, T, Object> f5496b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f5497c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public t(ld.p<? super Integer, ? super T, ? extends Object> pVar, T[] tArr) {
            super(1);
            this.f5496b = pVar;
            this.f5497c = tArr;
        }

        @fg.l
        public final Object a(int i4) {
            return this.f5496b.invoke(Integer.valueOf(i4), this.f5497c[i4]);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$7\n*L\n1#1,426:1\n*E\n"})
    public static final class u extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<Integer, T, Object> f5498b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f5499c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public u(ld.p<? super Integer, ? super T, ? extends Object> pVar, T[] tArr) {
            super(1);
            this.f5498b = pVar;
            this.f5499c = tArr;
        }

        @fg.m
        public final Object a(int i4) {
            return this.f5498b.invoke(Integer.valueOf(i4), this.f5499c[i4]);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/b;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/b;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$8\n*L\n1#1,426:1\n*E\n"})
    public static final class v extends n0 implements ld.r<androidx.compose.foundation.lazy.b, Integer, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.s<androidx.compose.foundation.lazy.b, Integer, T, androidx.compose.runtime.t, Integer, k2> f5500b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T[] f5501c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public v(ld.s<? super androidx.compose.foundation.lazy.b, ? super Integer, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> sVar, T[] tArr) {
            super(4);
            this.f5500b = sVar;
            this.f5501c = tArr;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.foundation.lazy.b bVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
            int i6;
            if ((i5 & 14) == 0) {
                i6 = (tVar.q0(bVar) ? 4 : 2) | i5;
            } else {
                i6 = i5;
            }
            if ((i5 & 112) == 0) {
                i6 |= tVar.f(i4) ? 32 : 16;
            }
            if ((i6 & 731) == 146 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1600639390, i6, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:253)");
            }
            this.f5500b.a0(bVar, Integer.valueOf(i4), this.f5501c[i4], tVar, Integer.valueOf(i6 & 126));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ k2 i(androidx.compose.foundation.lazy.b bVar, Integer num, androidx.compose.runtime.t tVar, Integer num2) {
            a(bVar, num.intValue(), tVar, num2.intValue());
            return k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e1  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use the non deprecated overload")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void a(androidx.compose.ui.q r23, androidx.compose.foundation.lazy.c0 r24, androidx.compose.foundation.layout.l1 r25, boolean r26, androidx.compose.foundation.layout.i.m r27, androidx.compose.ui.c.b r28, androidx.compose.foundation.gestures.e0 r29, ld.l r30, androidx.compose.runtime.t r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.a.a(androidx.compose.ui.q, androidx.compose.foundation.lazy.c0, androidx.compose.foundation.layout.l1, boolean, androidx.compose.foundation.layout.i$m, androidx.compose.ui.c$b, androidx.compose.foundation.gestures.e0, ld.l, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b3  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.m androidx.compose.ui.q r29, @fg.m androidx.compose.foundation.lazy.c0 r30, @fg.m androidx.compose.foundation.layout.l1 r31, boolean r32, @fg.m androidx.compose.foundation.layout.i.m r33, @fg.m androidx.compose.ui.c.b r34, @fg.m androidx.compose.foundation.gestures.e0 r35, boolean r36, @fg.l ld.l<? super androidx.compose.foundation.lazy.y, kotlin.k2> r37, @fg.m androidx.compose.runtime.t r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.a.b(androidx.compose.ui.q, androidx.compose.foundation.lazy.c0, androidx.compose.foundation.layout.l1, boolean, androidx.compose.foundation.layout.i$m, androidx.compose.ui.c$b, androidx.compose.foundation.gestures.e0, boolean, ld.l, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e1  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use the non deprecated overload")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void c(androidx.compose.ui.q r23, androidx.compose.foundation.lazy.c0 r24, androidx.compose.foundation.layout.l1 r25, boolean r26, androidx.compose.foundation.layout.i.e r27, androidx.compose.ui.c.InterfaceC0326c r28, androidx.compose.foundation.gestures.e0 r29, ld.l r30, androidx.compose.runtime.t r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.a.c(androidx.compose.ui.q, androidx.compose.foundation.lazy.c0, androidx.compose.foundation.layout.l1, boolean, androidx.compose.foundation.layout.i$e, androidx.compose.ui.c$c, androidx.compose.foundation.gestures.e0, ld.l, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b2  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@fg.m androidx.compose.ui.q r29, @fg.m androidx.compose.foundation.lazy.c0 r30, @fg.m androidx.compose.foundation.layout.l1 r31, boolean r32, @fg.m androidx.compose.foundation.layout.i.e r33, @fg.m androidx.compose.ui.c.InterfaceC0326c r34, @fg.m androidx.compose.foundation.gestures.e0 r35, boolean r36, @fg.l ld.l<? super androidx.compose.foundation.lazy.y, kotlin.k2> r37, @fg.m androidx.compose.runtime.t r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.a.d(androidx.compose.ui.q, androidx.compose.foundation.lazy.c0, androidx.compose.foundation.layout.l1, boolean, androidx.compose.foundation.layout.i$e, androidx.compose.ui.c$c, androidx.compose.foundation.gestures.e0, boolean, ld.l, androidx.compose.runtime.t, int, int):void");
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    public static final <T> void e(@fg.l y yVar, @fg.l List<? extends T> list, @fg.m ld.l<? super T, ? extends Object> lVar, @fg.l ld.l<? super T, ? extends Object> lVar2, @fg.l ld.r<? super androidx.compose.foundation.lazy.b, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar) {
        yVar.i(list.size(), lVar != null ? new f(lVar, list) : null, new g(lVar2, list), new androidx.compose.runtime.internal.b(-632812321, true, new h(rVar, list)));
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use the non deprecated overload")
    public static final <T> void f(y yVar, List<? extends T> list, ld.l<? super T, ? extends Object> lVar, ld.r<? super androidx.compose.foundation.lazy.b, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar) {
        yVar.i(list.size(), lVar != null ? new f(lVar, list) : null, new g(e.f5472b, list), new androidx.compose.runtime.internal.b(-632812321, true, new h(rVar, list)));
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    public static final <T> void g(@fg.l y yVar, @fg.l T[] tArr, @fg.m ld.l<? super T, ? extends Object> lVar, @fg.l ld.l<? super T, ? extends Object> lVar2, @fg.l ld.r<? super androidx.compose.foundation.lazy.b, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar) {
        yVar.i(tArr.length, lVar != null ? new j(lVar, tArr) : null, new k(lVar2, tArr), new androidx.compose.runtime.internal.b(-1043393750, true, new l(rVar, tArr)));
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use the non deprecated overload")
    public static final <T> void h(y yVar, T[] tArr, ld.l<? super T, ? extends Object> lVar, ld.r<? super androidx.compose.foundation.lazy.b, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar) {
        yVar.i(tArr.length, lVar != null ? new j(lVar, tArr) : null, new k(i.f5479b, tArr), new androidx.compose.runtime.internal.b(-1043393750, true, new l(rVar, tArr)));
    }

    public static void i(y yVar, List list, ld.l lVar, ld.l lVar2, ld.r rVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        if ((i4 & 4) != 0) {
            lVar2 = e.f5472b;
        }
        yVar.i(list.size(), lVar != null ? new f(lVar, list) : null, new g(lVar2, list), new androidx.compose.runtime.internal.b(-632812321, true, new h(rVar, list)));
    }

    public static void j(y yVar, List list, ld.l lVar, ld.r rVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        yVar.i(list.size(), lVar != null ? new f(lVar, list) : null, new g(e.f5472b, list), new androidx.compose.runtime.internal.b(-632812321, true, new h(rVar, list)));
    }

    public static void k(y yVar, Object[] objArr, ld.l lVar, ld.l lVar2, ld.r rVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        if ((i4 & 4) != 0) {
            lVar2 = i.f5479b;
        }
        yVar.i(objArr.length, lVar != null ? new j(lVar, objArr) : null, new k(lVar2, objArr), new androidx.compose.runtime.internal.b(-1043393750, true, new l(rVar, objArr)));
    }

    public static void l(y yVar, Object[] objArr, ld.l lVar, ld.r rVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        yVar.i(objArr.length, lVar != null ? new j(lVar, objArr) : null, new k(i.f5479b, objArr), new androidx.compose.runtime.internal.b(-1043393750, true, new l(rVar, objArr)));
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    public static final <T> void m(@fg.l y yVar, @fg.l List<? extends T> list, @fg.m ld.p<? super Integer, ? super T, ? extends Object> pVar, @fg.l ld.p<? super Integer, ? super T, ? extends Object> pVar2, @fg.l ld.s<? super androidx.compose.foundation.lazy.b, ? super Integer, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> sVar) {
        yVar.i(list.size(), pVar != null ? new p(pVar, list) : null, new q(pVar2, list), new androidx.compose.runtime.internal.b(-1091073711, true, new r(sVar, list)));
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use the non deprecated overload")
    public static final <T> void n(y yVar, List<? extends T> list, ld.p<? super Integer, ? super T, ? extends Object> pVar, ld.s<? super androidx.compose.foundation.lazy.b, ? super Integer, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> sVar) {
        yVar.i(list.size(), pVar != null ? new p(pVar, list) : null, new m(list), new androidx.compose.runtime.internal.b(-1091073711, true, new r(sVar, list)));
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    public static final <T> void o(@fg.l y yVar, @fg.l T[] tArr, @fg.m ld.p<? super Integer, ? super T, ? extends Object> pVar, @fg.l ld.p<? super Integer, ? super T, ? extends Object> pVar2, @fg.l ld.s<? super androidx.compose.foundation.lazy.b, ? super Integer, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> sVar) {
        yVar.i(tArr.length, pVar != null ? new t(pVar, tArr) : null, new u(pVar2, tArr), new androidx.compose.runtime.internal.b(1600639390, true, new v(sVar, tArr)));
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use the non deprecated overload")
    public static final <T> void p(y yVar, T[] tArr, ld.p<? super Integer, ? super T, ? extends Object> pVar, ld.s<? super androidx.compose.foundation.lazy.b, ? super Integer, ? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> sVar) {
        yVar.i(tArr.length, pVar != null ? new t(pVar, tArr) : null, new n(tArr), new androidx.compose.runtime.internal.b(1600639390, true, new v(sVar, tArr)));
    }

    public static void q(y yVar, List list, ld.p pVar, ld.p pVar2, ld.s sVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            pVar = null;
        }
        if ((i4 & 4) != 0) {
            pVar2 = o.f5488b;
        }
        yVar.i(list.size(), pVar != null ? new p(pVar, list) : null, new q(pVar2, list), new androidx.compose.runtime.internal.b(-1091073711, true, new r(sVar, list)));
    }

    public static void r(y yVar, List list, ld.p pVar, ld.s sVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            pVar = null;
        }
        yVar.i(list.size(), pVar != null ? new p(pVar, list) : null, new m(list), new androidx.compose.runtime.internal.b(-1091073711, true, new r(sVar, list)));
    }

    public static void s(y yVar, Object[] objArr, ld.p pVar, ld.p pVar2, ld.s sVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            pVar = null;
        }
        if ((i4 & 4) != 0) {
            pVar2 = s.f5495b;
        }
        yVar.i(objArr.length, pVar != null ? new t(pVar, objArr) : null, new u(pVar2, objArr), new androidx.compose.runtime.internal.b(1600639390, true, new v(sVar, objArr)));
    }

    public static void t(y yVar, Object[] objArr, ld.p pVar, ld.s sVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            pVar = null;
        }
        yVar.i(objArr.length, pVar != null ? new t(pVar, objArr) : null, new n(objArr), new androidx.compose.runtime.internal.b(1600639390, true, new v(sVar, objArr)));
    }
}
