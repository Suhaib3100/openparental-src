package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0007J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\u0015J\u0015\u0010\"\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R6\u00102\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010+j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00108\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00069"}, d2 = {"Landroidx/compose/runtime/j1;", "", "", "key", "", "sourceInformation", "<init>", "(ILjava/lang/String;)V", "j", "()Landroidx/compose/runtime/j1;", "group", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/d;", "anchor", "", "i", "(Landroidx/compose/runtime/d;)Z", "q", "d", "()V", "Landroidx/compose/runtime/a4;", "writer", "m", "(Landroidx/compose/runtime/a4;I)V", "Landroidx/compose/runtime/x3;", "table", "l", "(Landroidx/compose/runtime/x3;I)V", "predecessor", "b", "(Landroidx/compose/runtime/a4;II)V", "c", "k", "I", "g", "()I", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "p", "(Ljava/lang/String;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "f", "()Ljava/util/ArrayList;", "o", "(Ljava/util/ArrayList;)V", "groups", "Z", "e", "()Z", "n", "(Z)V", "closed", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/GroupSourceInformation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3745:1\n1#2:3746\n788#3,8:3747\n778#3,7:3755\n93#4,2:3762\n33#4,4:3764\n95#4,2:3768\n38#4:3770\n97#4:3771\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/GroupSourceInformation\n*L\n726#1:3747,8\n740#1:3755,7\n750#1:3762,2\n750#1:3764,4\n750#1:3768,2\n750#1:3770\n750#1:3771\n*E\n"})
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f16812e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private String sourceInformation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ArrayList<Object> groups;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    public j1(int i4, @fg.m String str) {
        this.key = i4;
        this.sourceInformation = str;
    }

    private final void a(Object group) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.groups = arrayList;
        arrayList.add(group);
    }

    private final boolean i(d anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = arrayList.get(i4);
            if (kotlin.jvm.internal.l0.g(obj, anchor) || ((obj instanceof j1) && ((j1) obj).i(anchor))) {
                return true;
            }
        }
        return false;
    }

    private final j1 j() {
        Object obj;
        j1 j4;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if ((obj instanceof j1) && !((j1) obj).closed) {
                    break;
                }
            }
        }
        obj = null;
        j1 j1Var = obj instanceof j1 ? (j1) obj : null;
        return (j1Var == null || (j4 = j1Var.j()) == null) ? this : j4;
    }

    public final void b(@fg.l a4 writer, int predecessor, int group) {
        d A1;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.groups = arrayList;
        }
        int i4 = 0;
        if (predecessor >= 0 && (A1 = writer.A1(predecessor)) != null) {
            int size = arrayList.size();
            while (true) {
                if (i4 >= size) {
                    i4 = -1;
                    break;
                }
                Object obj = arrayList.get(i4);
                if (kotlin.jvm.internal.l0.g(obj, A1) || ((obj instanceof j1) && ((j1) obj).i(A1))) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        arrayList.add(i4, writer.F(group));
    }

    public final void c() {
        this.closed = true;
    }

    public final void d() {
        j().closed = true;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    @fg.m
    public final ArrayList<Object> f() {
        return this.groups;
    }

    /* renamed from: g, reason: from getter */
    public final int getKey() {
        return this.key;
    }

    @fg.m
    /* renamed from: h, reason: from getter */
    public final String getSourceInformation() {
        return this.sourceInformation;
    }

    public final boolean k(@fg.l d anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof d) {
                    if (kotlin.jvm.internal.l0.g(obj, anchor)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof j1) && !((j1) obj).k(anchor)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.groups = null;
                return false;
            }
        }
        return true;
    }

    public final void l(@fg.l x3 table, int group) {
        j().a(table.h(group));
    }

    public final void m(@fg.l a4 writer, int group) {
        j().a(writer.F(group));
    }

    public final void n(boolean z4) {
        this.closed = z4;
    }

    public final void o(@fg.m ArrayList<Object> arrayList) {
        this.groups = arrayList;
    }

    public final void p(@fg.m String str) {
        this.sourceInformation = str;
    }

    public final void q(int key, @fg.l String sourceInformation) {
        j().a(new j1(key, sourceInformation));
    }
}
