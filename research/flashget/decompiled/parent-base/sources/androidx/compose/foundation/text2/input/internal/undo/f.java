package androidx.compose.foundation.text2.input.internal.undo;

import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.saveable.n;
import androidx.compose.runtime.snapshots.b0;
import fg.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: UndoManager.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 \u0011*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0013B1\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010#\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/undo/f;", "T", "", "", "initialUndoStack", "initialRedoStack", "", "capacity", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "undoableAction", "Lkotlin/k2;", "h", "(Ljava/lang/Object;)V", "j", "()Ljava/lang/Object;", "i", "d", "()V", "a", "I", "Landroidx/compose/runtime/snapshots/b0;", "b", "Landroidx/compose/runtime/snapshots/b0;", "undoStack", "c", "redoStack", "", "f", "()Z", "canUndo", "e", "canRedo", "g", "()I", "size", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f<T> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    public static final int f8971e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private b0<T> undoStack;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private b0<T> redoStack;

    /* compiled from: UndoManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00020\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/undo/f$a;", "", "<init>", "()V", "T", "Landroidx/compose/runtime/saveable/l;", "itemSaver", "Landroidx/compose/foundation/text2/input/internal/undo/f;", "a", "(Landroidx/compose/runtime/saveable/l;)Landroidx/compose/runtime/saveable/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.undo.f$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: UndoManager.kt */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001J!\u0010\u0006\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/compose/foundation/text2/input/internal/undo/f$a$a", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/foundation/text2/input/internal/undo/f;", "", "Landroidx/compose/runtime/saveable/n;", "value", "d", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/foundation/text2/input/internal/undo/f;)Ljava/lang/Object;", "c", "(Ljava/lang/Object;)Landroidx/compose/foundation/text2/input/internal/undo/f;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
        @r1({"SMAP\nUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text2/input/internal/undo/UndoManager$Companion$createSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,174:1\n33#2,6:175\n33#2,6:181\n*S KotlinDebug\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text2/input/internal/undo/UndoManager$Companion$createSaver$1\n*L\n140#1:175,6\n145#1:181,6\n*E\n"})
        /* renamed from: androidx.compose.foundation.text2.input.internal.undo.f$a$a, reason: collision with other inner class name */
        public static final class C0188a implements androidx.compose.runtime.saveable.l<f<T>, Object> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.saveable.l<T, Object> f8975a;

            public C0188a(androidx.compose.runtime.saveable.l<T, Object> lVar) {
                this.f8975a = lVar;
            }

            @Override // androidx.compose.runtime.saveable.l
            @l
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public f<T> b(@l Object value) {
                l0.n(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) value;
                int intValue = ((Number) list.get(0)).intValue();
                int intValue2 = ((Number) list.get(1)).intValue();
                int intValue3 = ((Number) list.get(2)).intValue();
                androidx.compose.runtime.saveable.l<T, Object> lVar = this.f8975a;
                kotlin.collections.builders.b bVar = new kotlin.collections.builders.b();
                int i4 = 3;
                while (i4 < intValue2 + 3) {
                    T b5 = lVar.b(list.get(i4));
                    l0.m(b5);
                    bVar.add(b5);
                    i4++;
                }
                List a5 = w.a(bVar);
                androidx.compose.runtime.saveable.l<T, Object> lVar2 = this.f8975a;
                kotlin.collections.builders.b bVar2 = new kotlin.collections.builders.b();
                while (i4 < intValue2 + intValue3 + 3) {
                    T b6 = lVar2.b(list.get(i4));
                    l0.m(b6);
                    bVar2.add(b6);
                    i4++;
                }
                return new f<>(a5, w.a(bVar2), intValue);
            }

            @Override // androidx.compose.runtime.saveable.l
            @l
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Object a(@l n nVar, @l f<T> fVar) {
                androidx.compose.runtime.saveable.l<T, Object> lVar = this.f8975a;
                kotlin.collections.builders.b bVar = new kotlin.collections.builders.b();
                bVar.add(Integer.valueOf(((f) fVar).capacity));
                bVar.add(Integer.valueOf(((f) fVar).undoStack.l()));
                bVar.add(Integer.valueOf(((f) fVar).redoStack.l()));
                b0 b0Var = ((f) fVar).undoStack;
                int size = b0Var.size();
                for (int i4 = 0; i4 < size; i4++) {
                    bVar.add(lVar.a(nVar, b0Var.get(i4)));
                }
                b0 b0Var2 = ((f) fVar).redoStack;
                int size2 = b0Var2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    bVar.add(lVar.a(nVar, b0Var2.get(i5)));
                }
                return w.a(bVar);
            }
        }

        private Companion() {
        }

        public final <T> androidx.compose.runtime.saveable.l<f<T>, Object> a(androidx.compose.runtime.saveable.l<T, Object> itemSaver) {
            l0.P();
            return new C0188a(itemSaver);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public f() {
        this(null, null, 0, 7, null);
    }

    public final void d() {
        this.undoStack.clear();
        this.redoStack.clear();
    }

    public final boolean e() {
        return !this.redoStack.isEmpty();
    }

    public final boolean f() {
        return !this.undoStack.isEmpty();
    }

    public final int g() {
        return this.redoStack.l() + this.undoStack.l();
    }

    public final void h(T undoableAction) {
        this.redoStack.clear();
        while (g() > this.capacity - 1) {
            w.M0(this.undoStack);
        }
        this.undoStack.add(undoableAction);
    }

    public final T i() {
        if (!e()) {
            throw new IllegalStateException("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
        }
        T t4 = (T) w.O0(this.redoStack);
        this.undoStack.add(t4);
        return t4;
    }

    public final T j() {
        if (!f()) {
            throw new IllegalStateException("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
        }
        T t4 = (T) w.O0(this.undoStack);
        this.redoStack.add(t4);
        return t4;
    }

    public f(@l List<? extends T> list, @l List<? extends T> list2, int i4) {
        this.capacity = i4;
        b0<T> b0Var = new b0<>();
        b0Var.addAll(list);
        this.undoStack = b0Var;
        b0<T> b0Var2 = new b0<>();
        b0Var2.addAll(list2);
        this.redoStack = b0Var2;
        if (i4 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive integer");
        }
        if (g() <= i4) {
            return;
        }
        throw new IllegalArgumentException(("Initial list of undo and redo operations have a size=(" + g() + ") greater than the given capacity=(" + i4 + ").").toString());
    }

    public f(List list, List list2, int i4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? j0.f74919b : list, (i5 & 2) != 0 ? j0.f74919b : list2, (i5 & 4) != 0 ? 100 : i4);
    }
}
