package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: SuspendingPointerInputFilter.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B^\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006\u0012'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u000b*\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R#\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R8\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b¢\u0006\u0002\b\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/input/pointer/w0;", "", "key1", "key2", "", "keys", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "Lkotlin/u;", "pointerInputHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lld/p;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Landroidx/compose/ui/input/pointer/w0;", "node", "v", "(Landroidx/compose/ui/input/pointer/w0;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Ljava/lang/Object;", "o", "()Ljava/lang/Object;", "e", "r", "f", "[Ljava/lang/Object;", "s", "()[Ljava/lang/Object;", "g", "Lld/p;", "u", "()Lld/p;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends y0<w0> {

    /* renamed from: h, reason: collision with root package name */
    public static final int f18696h = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object key1;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object key2;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object[] keys;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<k0, kotlin.coroutines.d<? super k2>, Object> pointerInputHandler;

    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, ld.p pVar, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? null : obj, (i4 & 2) != 0 ? null : obj2, (i4 & 4) != 0 ? null : objArr, pVar);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) other;
        if (!kotlin.jvm.internal.l0.g(this.key1, suspendPointerInputElement.key1) || !kotlin.jvm.internal.l0.g(this.key2, suspendPointerInputElement.key2)) {
            return false;
        }
        Object[] objArr = this.keys;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.keys;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.keys != null) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        Object obj = this.key1;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.key2;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.keys;
        return hashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("pointerInput");
        a2Var.getProperties().c("key1", this.key1);
        a2Var.getProperties().c("key2", this.key2);
        a2Var.getProperties().c("keys", this.keys);
        a2Var.getProperties().c("pointerInputHandler", this.pointerInputHandler);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public w0 i() {
        return new w0(this.pointerInputHandler);
    }

    @fg.m
    /* renamed from: o, reason: from getter */
    public final Object getKey1() {
        return this.key1;
    }

    @fg.m
    /* renamed from: r, reason: from getter */
    public final Object getKey2() {
        return this.key2;
    }

    @fg.m
    /* renamed from: s, reason: from getter */
    public final Object[] getKeys() {
        return this.keys;
    }

    @fg.l
    public final ld.p<k0, kotlin.coroutines.d<? super k2>, Object> u() {
        return this.pointerInputHandler;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l w0 node) {
        node.B5(this.pointerInputHandler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuspendPointerInputElement(@fg.m Object obj, @fg.m Object obj2, @fg.m Object[] objArr, @fg.l ld.p<? super k0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this.pointerInputHandler = pVar;
    }
}
