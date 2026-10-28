package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.saveable.i;
import androidx.compose.runtime.z;
import androidx.compose.ui.node.p1;
import androidx.compose.ui.platform.a6;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;

/* compiled from: AndroidView.android.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004BI\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013BK\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\t\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010/\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b+\u0010,\"\u0004\b-\u0010.RB\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105RB\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105RB\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00101\u001a\u0004\b;\u00103\"\u0004\b<\u00105R\u0014\u0010@\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Landroidx/compose/ui/viewinterop/h;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/c;", "Landroidx/compose/ui/platform/a6;", "Landroid/content/Context;", "context", "Landroidx/compose/runtime/z;", "parentContext", "typedView", "Landroidx/compose/ui/input/nestedscroll/b;", "dispatcher", "Landroidx/compose/runtime/saveable/i;", "saveStateRegistry", "", "compositeKeyHash", "Landroidx/compose/ui/node/p1;", "owner", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/z;Landroid/view/View;Landroidx/compose/ui/input/nestedscroll/b;Landroidx/compose/runtime/saveable/i;ILandroidx/compose/ui/node/p1;)V", "Lkotlin/Function1;", "factory", "(Landroid/content/Context;Lld/l;Landroidx/compose/runtime/z;Landroidx/compose/runtime/saveable/i;ILandroidx/compose/ui/node/p1;)V", "Lkotlin/k2;", "a0", "()V", "f0", "B", "Landroid/view/View;", "C", "Landroidx/compose/ui/input/nestedscroll/b;", "W", "()Landroidx/compose/ui/input/nestedscroll/b;", "D", "Landroidx/compose/runtime/saveable/i;", "E", "I", "", "F", "Ljava/lang/String;", "saveStateKey", "Landroidx/compose/runtime/saveable/i$a;", "value", "G", "Landroidx/compose/runtime/saveable/i$a;", "d0", "(Landroidx/compose/runtime/saveable/i$a;)V", "savableRegistryEntry", "H", "Lld/l;", "Z", "()Lld/l;", "e0", "(Lld/l;)V", "updateBlock", "Y", "c0", "resetBlock", "J", "X", "b0", "releaseBlock", "d", "()Landroid/view/View;", "viewRoot", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/ViewFactoryHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,406:1\n1#2:407\n*E\n"})
/* loaded from: classes.dex */
public final class h<T extends View> extends androidx.compose.ui.viewinterop.c implements a6 {
    public static final int K = 8;

    /* renamed from: B, reason: from kotlin metadata */
    @l
    private final T typedView;

    /* renamed from: C, reason: from kotlin metadata */
    @l
    private final androidx.compose.ui.input.nestedscroll.b dispatcher;

    /* renamed from: D, reason: from kotlin metadata */
    @m
    private final i saveStateRegistry;

    /* renamed from: E, reason: from kotlin metadata */
    private final int compositeKeyHash;

    /* renamed from: F, reason: from kotlin metadata */
    @l
    private final String saveStateKey;

    /* renamed from: G, reason: from kotlin metadata */
    @m
    private i.a savableRegistryEntry;

    /* renamed from: H, reason: from kotlin metadata */
    @l
    private ld.l<? super T, k2> updateBlock;

    /* renamed from: I, reason: from kotlin metadata */
    @l
    private ld.l<? super T, k2> resetBlock;

    /* renamed from: J, reason: from kotlin metadata */
    @l
    private ld.l<? super T, k2> releaseBlock;

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends n0 implements ld.a<Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h<T> f21628b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h<T> hVar) {
            super(0);
            this.f21628b = hVar;
        }

        @Override // ld.a
        @m
        public final Object invoke() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            ((h) this.f21628b).typedView.saveHierarchyState(sparseArray);
            return sparseArray;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h<T> f21629b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h<T> hVar) {
            super(0);
            this.f21629b = hVar;
        }

        public final void a() {
            this.f21629b.X().invoke(((h) this.f21629b).typedView);
            h.V(this.f21629b);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h<T> f21630b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h<T> hVar) {
            super(0);
            this.f21630b = hVar;
        }

        public final void a() {
            this.f21630b.Y().invoke(((h) this.f21630b).typedView);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h<T> f21631b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h<T> hVar) {
            super(0);
            this.f21631b = hVar;
        }

        public final void a() {
            this.f21631b.Z().invoke(((h) this.f21631b).typedView);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* synthetic */ h(Context context, z zVar, View view, androidx.compose.ui.input.nestedscroll.b bVar, i iVar, int i4, p1 p1Var, int i5, w wVar) {
        this(context, (i5 & 2) != 0 ? null : zVar, view, (i5 & 8) != 0 ? new androidx.compose.ui.input.nestedscroll.b() : bVar, iVar, i4, p1Var);
    }

    public static final void V(h hVar) {
        hVar.d0(null);
    }

    private final void a0() {
        i iVar = this.saveStateRegistry;
        if (iVar != null) {
            d0(iVar.c(this.saveStateKey, new a(this)));
        }
    }

    private final void d0(i.a aVar) {
        i.a aVar2 = this.savableRegistryEntry;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.savableRegistryEntry = aVar;
    }

    private final void f0() {
        d0(null);
    }

    @l
    /* renamed from: W, reason: from getter */
    public final androidx.compose.ui.input.nestedscroll.b getDispatcher() {
        return this.dispatcher;
    }

    @l
    public final ld.l<T, k2> X() {
        return this.releaseBlock;
    }

    @l
    public final ld.l<T, k2> Y() {
        return this.resetBlock;
    }

    @l
    public final ld.l<T, k2> Z() {
        return this.updateBlock;
    }

    public final void b0(@l ld.l<? super T, k2> lVar) {
        this.releaseBlock = lVar;
        Q(new b(this));
    }

    public final void c0(@l ld.l<? super T, k2> lVar) {
        this.resetBlock = lVar;
        R(new c(this));
    }

    @Override // androidx.compose.ui.platform.a6
    @l
    public View d() {
        return this;
    }

    public final void e0(@l ld.l<? super T, k2> lVar) {
        this.updateBlock = lVar;
        T(new d(this));
    }

    private h(Context context, z zVar, T t4, androidx.compose.ui.input.nestedscroll.b bVar, i iVar, int i4, p1 p1Var) {
        super(context, zVar, i4, bVar, t4, p1Var);
        this.typedView = t4;
        this.dispatcher = bVar;
        this.saveStateRegistry = iVar;
        this.compositeKeyHash = i4;
        setClipChildren(false);
        String valueOf = String.valueOf(i4);
        this.saveStateKey = valueOf;
        Object f4 = iVar != null ? iVar.f(valueOf) : null;
        SparseArray<Parcelable> sparseArray = f4 instanceof SparseArray ? (SparseArray) f4 : null;
        if (sparseArray != null) {
            t4.restoreHierarchyState(sparseArray);
        }
        a0();
        this.updateBlock = e.e();
        this.resetBlock = e.e();
        this.releaseBlock = e.e();
    }

    public /* synthetic */ h(Context context, ld.l lVar, z zVar, i iVar, int i4, p1 p1Var, int i5, w wVar) {
        this(context, lVar, (i5 & 4) != 0 ? null : zVar, iVar, i4, p1Var);
    }

    public h(@l Context context, @l ld.l<? super Context, ? extends T> lVar, @m z zVar, @m i iVar, int i4, @l p1 p1Var) {
        this(context, zVar, lVar.invoke(context), null, iVar, i4, p1Var, 8, null);
    }
}
