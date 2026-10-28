package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.interaction.m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001;B;\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010JF\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0004ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0014\u0010\u0013J*\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u0013J\u001a\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010!R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00102\u001a\u00020-8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109\u0082\u0001\u0002<=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Landroidx/compose/foundation/a;", "Landroidx/compose/ui/node/l;", "Landroidx/compose/ui/node/u1;", "Landroidx/compose/ui/input/key/g;", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/i;", "role", "Lkotlin/Function0;", "Lkotlin/k2;", "onClick", "<init>", "(Landroidx/compose/foundation/interaction/k;ZLjava/lang/String;Landroidx/compose/ui/semantics/i;Lld/a;)V", "O7", "j7", "()V", "K7", "Landroidx/compose/ui/input/pointer/p;", "pointerEvent", "Landroidx/compose/ui/input/pointer/r;", "pass", "Landroidx/compose/ui/unit/u;", "bounds", "g1", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/r;J)V", "E4", "Landroidx/compose/ui/input/key/c;", "event", "k4", "(Landroid/view/KeyEvent;)Z", "n3", "s", "Landroidx/compose/foundation/interaction/k;", "t", "Z", "u", "Ljava/lang/String;", "v", "Landroidx/compose/ui/semantics/i;", "w", "Lld/a;", "Landroidx/compose/foundation/a$a;", "x", "Landroidx/compose/foundation/a$a;", "N7", "()Landroidx/compose/foundation/a$a;", "interactionData", "Landroidx/compose/foundation/b;", "L7", "()Landroidx/compose/foundation/b;", "clickablePointerInputNode", "Landroidx/compose/foundation/k0;", "M7", "()Landroidx/compose/foundation/k0;", "clickableSemanticsNode", "a", "Landroidx/compose/foundation/i0;", "Landroidx/compose/foundation/o0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1070:1\n1855#2,2:1071\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n*L\n783#1:1071,2\n*E\n"})
/* loaded from: classes.dex */
abstract class a extends androidx.compose.ui.node.l implements androidx.compose.ui.node.u1, androidx.compose.ui.input.key.g {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.foundation.interaction.k interactionSource;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private String onClickLabel;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.semantics.i role;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.a<kotlin.k2> onClick;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final C0051a interactionData;

    /* compiled from: Clickable.kt */
    @androidx.compose.runtime.internal.u(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0017\u001a\u00020\u00128\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0007\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/a$a;", "", "<init>", "()V", "", "Landroidx/compose/ui/input/key/b;", "Landroidx/compose/foundation/interaction/m$b;", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "currentKeyPressInteractions", "Landroidx/compose/foundation/interaction/m$b;", "c", "()Landroidx/compose/foundation/interaction/m$b;", "e", "(Landroidx/compose/foundation/interaction/m$b;)V", "pressInteraction", "Li0/f;", "J", "()J", "d", "(J)V", "centreOffset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.a$a, reason: collision with other inner class name */
    public static final class C0051a {

        /* renamed from: d, reason: collision with root package name */
        public static final int f3494d = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Map<androidx.compose.ui.input.key.b, m.b> currentKeyPressInteractions = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private m.b pressInteraction;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private long centreOffset;

        public C0051a() {
            i0.f.INSTANCE.getClass();
            this.centreOffset = i0.f.f74147c;
        }

        /* renamed from: a, reason: from getter */
        public final long getCentreOffset() {
            return this.centreOffset;
        }

        @fg.l
        public final Map<androidx.compose.ui.input.key.b, m.b> b() {
            return this.currentKeyPressInteractions;
        }

        @fg.m
        /* renamed from: c, reason: from getter */
        public final m.b getPressInteraction() {
            return this.pressInteraction;
        }

        public final void d(long j4) {
            this.centreOffset = j4;
        }

        public final void e(@fg.m m.b bVar) {
            this.pressInteraction = bVar;
        }
    }

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", i = {}, l = {810}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3498b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m.b f3500d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m.b bVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f3500d = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return a.this.new b(this.f3500d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f3498b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.foundation.interaction.k kVar = a.this.interactionSource;
                m.b bVar = this.f3500d;
                this.f3498b = 1;
                if (kVar.a(bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2$1", f = "Clickable.kt", i = {}, l = {819}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3501b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m.b f3503d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m.b bVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f3503d = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return a.this.new c(this.f3503d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f3501b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.foundation.interaction.k kVar = a.this.interactionSource;
                m.c cVar = new m.c(this.f3503d);
                this.f3501b = 1;
                if (kVar.a(cVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    public /* synthetic */ a(androidx.compose.foundation.interaction.k kVar, boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a aVar, kotlin.jvm.internal.w wVar) {
        this(kVar, z4, str, iVar, aVar);
    }

    public static /* synthetic */ void P7(a aVar, androidx.compose.foundation.interaction.k kVar, boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a aVar2, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCommon-XHw0xAI");
        }
        if ((i4 & 8) != 0) {
            iVar = null;
        }
        aVar.O7(kVar, z4, str, iVar, aVar2);
    }

    @Override // androidx.compose.ui.node.u1
    public void E4() {
        L7().E4();
    }

    protected final void K7() {
        m.b pressInteraction = this.interactionData.getPressInteraction();
        if (pressInteraction != null) {
            this.interactionSource.b(new m.a(pressInteraction));
        }
        Iterator<T> it = this.interactionData.b().values().iterator();
        while (it.hasNext()) {
            this.interactionSource.b(new m.a((m.b) it.next()));
        }
        this.interactionData.e(null);
        this.interactionData.b().clear();
    }

    @fg.l
    public abstract androidx.compose.foundation.b L7();

    @fg.l
    /* renamed from: M7 */
    public abstract k0 getClickableSemanticsNode();

    @fg.l
    /* renamed from: N7, reason: from getter */
    protected final C0051a getInteractionData() {
        return this.interactionData;
    }

    protected final void O7(@fg.l androidx.compose.foundation.interaction.k interactionSource, boolean enabled, @fg.m String onClickLabel, @fg.m androidx.compose.ui.semantics.i role, @fg.l ld.a<kotlin.k2> onClick) {
        if (!kotlin.jvm.internal.l0.g(this.interactionSource, interactionSource)) {
            K7();
            this.interactionSource = interactionSource;
        }
        if (this.enabled != enabled) {
            if (!enabled) {
                K7();
            }
            this.enabled = enabled;
        }
        this.onClickLabel = onClickLabel;
        this.role = role;
        this.onClick = onClick;
    }

    @Override // androidx.compose.ui.node.u1
    public void g1(@fg.l androidx.compose.ui.input.pointer.p pointerEvent, @fg.l androidx.compose.ui.input.pointer.r pass, long bounds) {
        L7().g1(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.q.d
    public void j7() {
        K7();
    }

    @Override // androidx.compose.ui.input.key.g
    public boolean k4(@fg.l KeyEvent event) {
        if (this.enabled && l0.f(event)) {
            if (this.interactionData.b().containsKey(androidx.compose.ui.input.key.b.B4(androidx.compose.ui.input.key.e.a(event)))) {
                return false;
            }
            m.b bVar = new m.b(this.interactionData.getCentreOffset(), null);
            this.interactionData.b().put(androidx.compose.ui.input.key.b.B4(androidx.compose.ui.input.key.e.a(event)), bVar);
            kotlinx.coroutines.k.f(V6(), null, null, new b(bVar, null), 3, null);
        } else {
            if (!this.enabled || !l0.b(event)) {
                return false;
            }
            m.b remove = this.interactionData.b().remove(androidx.compose.ui.input.key.b.B4(androidx.compose.ui.input.key.e.a(event)));
            if (remove != null) {
                kotlinx.coroutines.k.f(V6(), null, null, new c(remove, null), 3, null);
            }
            this.onClick.invoke();
        }
        return true;
    }

    @Override // androidx.compose.ui.input.key.g
    public boolean n3(@fg.l KeyEvent event) {
        return false;
    }

    private a(androidx.compose.foundation.interaction.k kVar, boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a<kotlin.k2> aVar) {
        this.interactionSource = kVar;
        this.enabled = z4;
        this.onClickLabel = str;
        this.role = iVar;
        this.onClick = aVar;
        this.interactionData = new C0051a();
    }
}
