package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.g3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.t3;
import androidx.compose.ui.graphics.i5;
import androidx.compose.ui.graphics.i6;
import androidx.compose.ui.graphics.j6;
import androidx.compose.ui.graphics.t1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: VectorCompose.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0087\u0001\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a¦\u0001\u0010%\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"", "name", "", "rotation", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/i;", "clipPathData", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Landroidx/compose/ui/graphics/vector/q;", "content", "a", "(Ljava/lang/String;FFFFFFFLjava/util/List;Lld/p;Landroidx/compose/runtime/t;II)V", "pathData", "Landroidx/compose/ui/graphics/i5;", "pathFillType", "Landroidx/compose/ui/graphics/t1;", "fill", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/i6;", "strokeLineCap", "Landroidx/compose/ui/graphics/j6;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "b", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/t1;FLandroidx/compose/ui/graphics/t1;FFIIFFFFLandroidx/compose/runtime/t;III)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,165:1\n325#2,11:166\n251#2,10:177\n*S KotlinDebug\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n*L\n59#1:166,11\n116#1:177,10\n*E\n"})
/* loaded from: classes.dex */
public final class r {

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/c;", "a", "()Landroidx/compose/ui/graphics/vector/c;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<androidx.compose.ui.graphics.vector.c> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f18300b = new a(0);

        a() {
            super(0);
        }

        @fg.l
        public final androidx.compose.ui.graphics.vector.c a() {
            return new androidx.compose.ui.graphics.vector.c();
        }

        @Override // ld.a
        public androidx.compose.ui.graphics.vector.c invoke() {
            return new androidx.compose.ui.graphics.vector.c();
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a0 extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<androidx.compose.ui.graphics.vector.i> f18301b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f18302c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f18303d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ t1 f18304e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f18305f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ t1 f18306g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f18307h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f18308i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f18309j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f18310k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f18311l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f18312m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f18313n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ float f18314o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f18315p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f18316q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f18317r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a0(List<? extends androidx.compose.ui.graphics.vector.i> list, int i4, String str, t1 t1Var, float f4, t1 t1Var2, float f5, float f6, int i5, int i6, float f7, float f10, float f11, float f12, int i7, int i10, int i11) {
            super(2);
            this.f18301b = list;
            this.f18302c = i4;
            this.f18303d = str;
            this.f18304e = t1Var;
            this.f18305f = f4;
            this.f18306g = t1Var2;
            this.f18307h = f5;
            this.f18308i = f6;
            this.f18309j = i5;
            this.f18310k = i6;
            this.f18311l = f7;
            this.f18312m = f10;
            this.f18313n = f11;
            this.f18314o = f12;
            this.f18315p = i7;
            this.f18316q = i10;
            this.f18317r = i11;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r.b(this.f18301b, this.f18302c, this.f18303d, this.f18304e, this.f18305f, this.f18306g, this.f18307h, this.f18308i, this.f18309j, this.f18310k, this.f18311l, this.f18312m, this.f18313n, this.f18314o, tVar, g3.b(this.f18315p | 1), g3.b(this.f18316q), this.f18317r);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/c;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/c;Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.p<androidx.compose.ui.graphics.vector.c, String, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f18318b = new b(2);

        b() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.c cVar, @fg.l String str) {
            cVar.A(str);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.c cVar, String str) {
            cVar.A(str);
            return k2.f75408a;
        }
    }

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/runtime/p$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class b0 extends n0 implements ld.a<androidx.compose.ui.graphics.vector.h> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f18319b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(ld.a aVar) {
            super(0);
            this.f18319b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.graphics.vector.h, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final androidx.compose.ui.graphics.vector.h invoke() {
            return this.f18319b.invoke();
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/c;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/c;F)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.p<androidx.compose.ui.graphics.vector.c, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f18320b = new c(2);

        c() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.c cVar, float f4) {
            cVar.D(f4);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.c cVar, Float f4) {
            cVar.D(f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/c;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/c;F)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.p<androidx.compose.ui.graphics.vector.c, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f18321b = new d(2);

        d() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.c cVar, float f4) {
            cVar.B(f4);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.c cVar, Float f4) {
            cVar.B(f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/c;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/c;F)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends n0 implements ld.p<androidx.compose.ui.graphics.vector.c, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f18322b = new e(2);

        e() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.c cVar, float f4) {
            cVar.C(f4);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.c cVar, Float f4) {
            cVar.C(f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/c;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/c;F)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends n0 implements ld.p<androidx.compose.ui.graphics.vector.c, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f18323b = new f(2);

        f() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.c cVar, float f4) {
            cVar.E(f4);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.c cVar, Float f4) {
            cVar.E(f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/c;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/c;F)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends n0 implements ld.p<androidx.compose.ui.graphics.vector.c, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f18324b = new g(2);

        g() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.c cVar, float f4) {
            cVar.F(f4);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.c cVar, Float f4) {
            cVar.F(f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/c;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/c;F)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends n0 implements ld.p<androidx.compose.ui.graphics.vector.c, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f18325b = new h(2);

        h() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.c cVar, float f4) {
            cVar.G(f4);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.c cVar, Float f4) {
            cVar.G(f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/c;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/c;F)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends n0 implements ld.p<androidx.compose.ui.graphics.vector.c, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f18326b = new i(2);

        i() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.c cVar, float f4) {
            cVar.H(f4);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.c cVar, Float f4) {
            cVar.H(f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/graphics/vector/c;", "", "Landroidx/compose/ui/graphics/vector/i;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/c;Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class j extends n0 implements ld.p<androidx.compose.ui.graphics.vector.c, List<? extends androidx.compose.ui.graphics.vector.i>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f18327b = new j(2);

        j() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.c cVar, @fg.l List<? extends androidx.compose.ui.graphics.vector.i> list) {
            cVar.z(list);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.c cVar, List<? extends androidx.compose.ui.graphics.vector.i> list) {
            cVar.z(list);
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f18328b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f18329c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f18330d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f18331e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f18332f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f18333g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f18334h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f18335i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ List<androidx.compose.ui.graphics.vector.i> f18336j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f18337k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f18338l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f18339m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(String str, float f4, float f5, float f6, float f7, float f10, float f11, float f12, List<? extends androidx.compose.ui.graphics.vector.i> list, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, int i4, int i5) {
            super(2);
            this.f18328b = str;
            this.f18329c = f4;
            this.f18330d = f5;
            this.f18331e = f6;
            this.f18332f = f7;
            this.f18333g = f10;
            this.f18334h = f11;
            this.f18335i = f12;
            this.f18336j = list;
            this.f18337k = pVar;
            this.f18338l = i4;
            this.f18339m = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r.a(this.f18328b, this.f18329c, this.f18330d, this.f18331e, this.f18332f, this.f18333g, this.f18334h, this.f18335i, this.f18336j, this.f18337k, tVar, g3.b(this.f18338l | 1), this.f18339m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/h;", "a", "()Landroidx/compose/ui/graphics/vector/h;"}, k = 3, mv = {1, 8, 0})
    static final class l extends n0 implements ld.a<androidx.compose.ui.graphics.vector.h> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f18340b = new l(0);

        l() {
            super(0);
        }

        @fg.l
        public final androidx.compose.ui.graphics.vector.h a() {
            return new androidx.compose.ui.graphics.vector.h();
        }

        @Override // ld.a
        public androidx.compose.ui.graphics.vector.h invoke() {
            return new androidx.compose.ui.graphics.vector.h();
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/h;", "Landroidx/compose/ui/graphics/i6;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/h;I)V"}, k = 3, mv = {1, 8, 0})
    static final class m extends n0 implements ld.p<androidx.compose.ui.graphics.vector.h, i6, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f18341b = new m(2);

        m() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.h hVar, int i4) {
            hVar.A(i4);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.h hVar, i6 i6Var) {
            hVar.A(i6Var.getValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/h;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/h;F)V"}, k = 3, mv = {1, 8, 0})
    static final class n extends n0 implements ld.p<androidx.compose.ui.graphics.vector.h, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f18342b = new n(2);

        n() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.h hVar, float f4) {
            hVar.C(f4);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.h hVar, Float f4) {
            hVar.C(f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/h;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/h;F)V"}, k = 3, mv = {1, 8, 0})
    static final class o extends n0 implements ld.p<androidx.compose.ui.graphics.vector.h, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final o f18343b = new o(2);

        o() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.h hVar, float f4) {
            hVar.G(f4);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.h hVar, Float f4) {
            hVar.G(f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/h;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/h;F)V"}, k = 3, mv = {1, 8, 0})
    static final class p extends n0 implements ld.p<androidx.compose.ui.graphics.vector.h, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final p f18344b = new p(2);

        p() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.h hVar, float f4) {
            hVar.E(f4);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.h hVar, Float f4) {
            hVar.E(f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/h;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/h;F)V"}, k = 3, mv = {1, 8, 0})
    static final class q extends n0 implements ld.p<androidx.compose.ui.graphics.vector.h, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final q f18345b = new q(2);

        q() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.h hVar, float f4) {
            hVar.F(f4);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.h hVar, Float f4) {
            hVar.F(f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/h;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/h;Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.r$r, reason: collision with other inner class name */
    static final class C0334r extends n0 implements ld.p<androidx.compose.ui.graphics.vector.h, String, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0334r f18346b = new C0334r(2);

        C0334r() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.h hVar, @fg.l String str) {
            hVar.v(str);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.h hVar, String str) {
            hVar.v(str);
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/graphics/vector/h;", "", "Landroidx/compose/ui/graphics/vector/i;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/h;Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class s extends n0 implements ld.p<androidx.compose.ui.graphics.vector.h, List<? extends androidx.compose.ui.graphics.vector.i>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final s f18347b = new s(2);

        s() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.h hVar, @fg.l List<? extends androidx.compose.ui.graphics.vector.i> list) {
            hVar.w(list);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.h hVar, List<? extends androidx.compose.ui.graphics.vector.i> list) {
            hVar.w(list);
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/h;", "Landroidx/compose/ui/graphics/i5;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/h;I)V"}, k = 3, mv = {1, 8, 0})
    static final class t extends n0 implements ld.p<androidx.compose.ui.graphics.vector.h, i5, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final t f18348b = new t(2);

        t() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.h hVar, int i4) {
            hVar.x(i4);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.h hVar, i5 i5Var) {
            hVar.x(i5Var.getValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/h;", "Landroidx/compose/ui/graphics/t1;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/h;Landroidx/compose/ui/graphics/t1;)V"}, k = 3, mv = {1, 8, 0})
    static final class u extends n0 implements ld.p<androidx.compose.ui.graphics.vector.h, t1, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final u f18349b = new u(2);

        u() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.h hVar, @fg.m t1 t1Var) {
            hVar.t(t1Var);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.h hVar, t1 t1Var) {
            hVar.t(t1Var);
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/h;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/h;F)V"}, k = 3, mv = {1, 8, 0})
    static final class v extends n0 implements ld.p<androidx.compose.ui.graphics.vector.h, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final v f18350b = new v(2);

        v() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.h hVar, float f4) {
            hVar.u(f4);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.h hVar, Float f4) {
            hVar.u(f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/h;", "Landroidx/compose/ui/graphics/t1;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/h;Landroidx/compose/ui/graphics/t1;)V"}, k = 3, mv = {1, 8, 0})
    static final class w extends n0 implements ld.p<androidx.compose.ui.graphics.vector.h, t1, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final w f18351b = new w(2);

        w() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.h hVar, @fg.m t1 t1Var) {
            hVar.y(t1Var);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.h hVar, t1 t1Var) {
            hVar.y(t1Var);
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/h;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/h;F)V"}, k = 3, mv = {1, 8, 0})
    static final class x extends n0 implements ld.p<androidx.compose.ui.graphics.vector.h, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final x f18352b = new x(2);

        x() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.h hVar, float f4) {
            hVar.z(f4);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.h hVar, Float f4) {
            hVar.z(f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/h;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/h;F)V"}, k = 3, mv = {1, 8, 0})
    static final class y extends n0 implements ld.p<androidx.compose.ui.graphics.vector.h, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final y f18353b = new y(2);

        y() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.h hVar, float f4) {
            hVar.D(f4);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.h hVar, Float f4) {
            hVar.D(f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: VectorCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/graphics/vector/h;", "Landroidx/compose/ui/graphics/j6;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/h;I)V"}, k = 3, mv = {1, 8, 0})
    static final class z extends n0 implements ld.p<androidx.compose.ui.graphics.vector.h, j6, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final z f18354b = new z(2);

        z() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.vector.h hVar, int i4) {
            hVar.B(i4);
        }

        @Override // ld.p
        public k2 invoke(androidx.compose.ui.graphics.vector.h hVar, j6 j6Var) {
            hVar.B(j6Var.getValue());
            return k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010f  */
    @androidx.compose.ui.graphics.vector.q
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.m java.lang.String r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, @fg.m java.util.List<? extends androidx.compose.ui.graphics.vector.i> r28, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r29, @fg.m androidx.compose.runtime.t r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.r.a(java.lang.String, float, float, float, float, float, float, float, java.util.List, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    @androidx.compose.ui.graphics.vector.q
    @androidx.compose.runtime.i
    public static final void b(@fg.l List<? extends androidx.compose.ui.graphics.vector.i> list, int i4, @fg.m String str, @fg.m t1 t1Var, float f4, @fg.m t1 t1Var2, float f5, float f6, int i5, int i6, float f7, float f10, float f11, float f12, @fg.m androidx.compose.runtime.t tVar, int i7, int i10, int i11) {
        androidx.compose.runtime.t o4 = tVar.o(-1478270750);
        int c5 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.vector.u.c() : i4;
        String str2 = (i11 & 4) != 0 ? "" : str;
        t1 t1Var3 = (i11 & 8) != 0 ? null : t1Var;
        float f13 = (i11 & 16) != 0 ? 1.0f : f4;
        t1 t1Var4 = (i11 & 32) != 0 ? null : t1Var2;
        float f14 = (i11 & 64) != 0 ? 1.0f : f5;
        float f15 = (i11 & 128) != 0 ? 0.0f : f6;
        int d5 = (i11 & 256) != 0 ? androidx.compose.ui.graphics.vector.u.d() : i5;
        int e4 = (i11 & 512) != 0 ? androidx.compose.ui.graphics.vector.u.e() : i6;
        float f16 = (i11 & 1024) != 0 ? 4.0f : f7;
        float f17 = (i11 & 2048) != 0 ? 0.0f : f10;
        float f18 = (i11 & 4096) != 0 ? 1.0f : f11;
        float f19 = (i11 & 8192) != 0 ? 0.0f : f12;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1478270750, i7, i10, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:114)");
        }
        l lVar = l.f18340b;
        o4.P(1886828752);
        if (!(o4.s() instanceof androidx.compose.ui.graphics.vector.o)) {
            androidx.compose.runtime.p.n();
        }
        o4.v();
        if (o4.getInserting()) {
            o4.F(new b0(lVar));
        } else {
            o4.C();
        }
        m5.j(o4, str2, C0334r.f18346b);
        m5.j(o4, list, s.f18347b);
        m5.j(o4, i5.c(c5), t.f18348b);
        m5.j(o4, t1Var3, u.f18349b);
        m5.j(o4, Float.valueOf(f13), v.f18350b);
        m5.j(o4, t1Var4, w.f18351b);
        m5.j(o4, Float.valueOf(f14), x.f18352b);
        m5.j(o4, Float.valueOf(f15), y.f18353b);
        m5.j(o4, j6.d(e4), z.f18354b);
        m5.j(o4, i6.d(d5), m.f18341b);
        m5.j(o4, Float.valueOf(f16), n.f18342b);
        m5.j(o4, Float.valueOf(f17), o.f18343b);
        m5.j(o4, Float.valueOf(f18), p.f18344b);
        m5.j(o4, Float.valueOf(f19), q.f18345b);
        o4.H();
        o4.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new a0(list, c5, str2, t1Var3, f13, t1Var4, f14, f15, d5, e4, f16, f17, f18, f19, i7, i10, i11));
        }
    }
}
