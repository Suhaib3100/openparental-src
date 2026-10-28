package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.collection.e1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: PointerEvent.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u00020\u00188\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001d\u0010\u001e\u001a\u00020\u001c8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001d\u0010\fR0\u0010#\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n8\u0006@@X\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\"R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/input/pointer/p;", "", "", "Landroidx/compose/ui/input/pointer/b0;", "changes", "Landroidx/compose/ui/input/pointer/h;", "internalPointerEvent", "<init>", "(Ljava/util/List;Landroidx/compose/ui/input/pointer/h;)V", "(Ljava/util/List;)V", "Landroidx/compose/ui/input/pointer/t;", "a", "()I", "b", "()Ljava/util/List;", "Landroid/view/MotionEvent;", "motionEvent", "c", "(Ljava/util/List;Landroid/view/MotionEvent;)Landroidx/compose/ui/input/pointer/p;", "Ljava/util/List;", "e", "Landroidx/compose/ui/input/pointer/h;", "f", "()Landroidx/compose/ui/input/pointer/h;", "Landroidx/compose/ui/input/pointer/o;", "I", "d", "buttons", "Landroidx/compose/ui/input/pointer/p0;", "g", "keyboardModifiers", "<set-?>", "i", "j", "(I)V", "type", "h", "()Landroid/view/MotionEvent;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,202:1\n33#2,6:203\n33#2,6:209\n*S KotlinDebug\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n*L\n72#1:203,6\n97#1:209,6\n*E\n"})
/* loaded from: classes.dex */
public final class p {

    /* renamed from: f, reason: collision with root package name */
    public static final int f18808f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<b0> changes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final h internalPointerEvent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int buttons;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int keyboardModifiers;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int type;

    public p(@fg.l List<b0> list, @fg.m h hVar) {
        this.changes = list;
        this.internalPointerEvent = hVar;
        MotionEvent h4 = h();
        this.buttons = h4 != null ? h4.getButtonState() : 0;
        MotionEvent h5 = h();
        this.keyboardModifiers = h5 != null ? h5.getMetaState() : 0;
        this.type = a();
    }

    private final int a() {
        MotionEvent h4 = h();
        if (h4 == null) {
            List<b0> list = this.changes;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                b0 b0Var = list.get(i4);
                if (q.e(b0Var)) {
                    t.INSTANCE.getClass();
                    return t.f18826e;
                }
                if (q.c(b0Var)) {
                    t.INSTANCE.getClass();
                    return t.f18825d;
                }
            }
            t.INSTANCE.getClass();
            return t.f18827f;
        }
        int actionMasked = h4.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            t.INSTANCE.getClass();
                            break;
                        case 9:
                            t.INSTANCE.getClass();
                            break;
                        case 10:
                            t.INSTANCE.getClass();
                            break;
                        default:
                            t.INSTANCE.getClass();
                            break;
                    }
                    return t.f18825d;
                }
                t.INSTANCE.getClass();
                return t.f18827f;
            }
            t.INSTANCE.getClass();
            return t.f18826e;
        }
        t.INSTANCE.getClass();
        return t.f18825d;
    }

    @fg.l
    public final List<b0> b() {
        return this.changes;
    }

    @fg.l
    public final p c(@fg.l List<b0> changes, @fg.m MotionEvent motionEvent) {
        if (motionEvent == null) {
            return new p(changes, null);
        }
        if (kotlin.jvm.internal.l0.g(motionEvent, h())) {
            return new p(changes, this.internalPointerEvent);
        }
        e1 e1Var = new e1(changes.size());
        ArrayList arrayList = new ArrayList(changes.size());
        int size = changes.size();
        int i4 = 0;
        while (i4 < size) {
            b0 b0Var = changes.get(i4);
            e1Var.p(b0Var.getId(), b0Var);
            long id2 = b0Var.getId();
            long uptimeMillis = b0Var.getUptimeMillis();
            long position = b0Var.getPosition();
            long position2 = b0Var.getPosition();
            boolean pressed = b0Var.getPressed();
            float pressure = b0Var.getPressure();
            int type = b0Var.getType();
            h hVar = this.internalPointerEvent;
            int i5 = i4;
            arrayList.add(new e0(id2, uptimeMillis, position, position2, pressed, pressure, type, hVar != null && hVar.e(b0Var.getId()), null, 0L, 0L, 1792, null));
            i4 = i5 + 1;
        }
        return new p(changes, new h(e1Var, new d0(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    /* renamed from: d, reason: from getter */
    public final int getButtons() {
        return this.buttons;
    }

    @fg.l
    public final List<b0> e() {
        return this.changes;
    }

    @fg.m
    /* renamed from: f, reason: from getter */
    public final h getInternalPointerEvent() {
        return this.internalPointerEvent;
    }

    /* renamed from: g, reason: from getter */
    public final int getKeyboardModifiers() {
        return this.keyboardModifiers;
    }

    @fg.m
    public final MotionEvent h() {
        h hVar = this.internalPointerEvent;
        if (hVar != null) {
            return hVar.b();
        }
        return null;
    }

    /* renamed from: i, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final void j(int i4) {
        this.type = i4;
    }

    public p(@fg.l List<b0> list) {
        this(list, null);
    }
}
