package androidx.compose.foundation.text2.input.internal.undo;

import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.saveable.n;
import androidx.compose.ui.text.t0;
import androidx.compose.ui.text.u0;
import fg.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;

/* compiled from: TextUndoOperation.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001\u0014BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\t\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u0014\u0010 R\u0017\u0010%\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010$R\u0011\u0010(\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/undo/d;", "", "", "index", "", "preText", "postText", "Landroidx/compose/ui/text/t0;", "preSelection", "postSelection", "", "timeInMillis", "", "canMerge", "<init>", "(ILjava/lang/String;Ljava/lang/String;JJJZLkotlin/jvm/internal/w;)V", "a", "I", "d", "()I", "b", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "c", "f", "J", "g", "()J", "e", "j", "Z", "()Z", "Landroidx/compose/foundation/text2/input/internal/undo/b;", "Landroidx/compose/foundation/text2/input/internal/undo/b;", "i", "()Landroidx/compose/foundation/text2/input/internal/undo/b;", "textEditType", "Landroidx/compose/foundation/text2/input/internal/undo/a;", "()Landroidx/compose/foundation/text2/input/internal/undo/a;", "deletionType", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: j, reason: collision with root package name */
    public static final int f8960j = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final String preText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final String postText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long preSelection;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long postSelection;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long timeInMillis;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean canMerge;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private final b textEditType;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: k, reason: collision with root package name */
    @l
    private static final androidx.compose.runtime.saveable.l<d, Object> f8961k = new a();

    /* compiled from: TextUndoOperation.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/compose/foundation/text2/input/internal/undo/d$a", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/foundation/text2/input/internal/undo/d;", "", "Landroidx/compose/runtime/saveable/n;", "value", "d", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/foundation/text2/input/internal/undo/d;)Ljava/lang/Object;", "c", "(Ljava/lang/Object;)Landroidx/compose/foundation/text2/input/internal/undo/d;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements androidx.compose.runtime.saveable.l<d, Object> {
        a() {
        }

        @Override // androidx.compose.runtime.saveable.l
        @l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d b(@l Object value) {
            l0.n(value, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) value;
            Object obj = list.get(0);
            l0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            l0.n(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(2);
            l0.n(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = list.get(3);
            l0.n(obj4, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = ((Integer) obj4).intValue();
            Object obj5 = list.get(4);
            l0.n(obj5, "null cannot be cast to non-null type kotlin.Int");
            long b5 = u0.b(intValue2, ((Integer) obj5).intValue());
            Object obj6 = list.get(5);
            l0.n(obj6, "null cannot be cast to non-null type kotlin.Int");
            int intValue3 = ((Integer) obj6).intValue();
            Object obj7 = list.get(6);
            l0.n(obj7, "null cannot be cast to non-null type kotlin.Int");
            long b6 = u0.b(intValue3, ((Integer) obj7).intValue());
            Object obj8 = list.get(7);
            l0.n(obj8, "null cannot be cast to non-null type kotlin.Long");
            return new d(intValue, str, str2, b5, b6, ((Long) obj8).longValue(), false, 64, null);
        }

        @Override // androidx.compose.runtime.saveable.l
        @l
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object a(@l n nVar, @l d dVar) {
            return w.O(Integer.valueOf(dVar.getIndex()), dVar.getPreText(), dVar.getPostText(), Integer.valueOf(t0.n(dVar.getPreSelection())), Integer.valueOf((int) (dVar.getPreSelection() & 4294967295L)), Integer.valueOf((int) (dVar.getPostSelection() >> 32)), Integer.valueOf((int) (4294967295L & dVar.getPostSelection())), Long.valueOf(dVar.getTimeInMillis()));
        }
    }

    /* compiled from: TextUndoOperation.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/undo/d$b;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/foundation/text2/input/internal/undo/d;", "Saver", "Landroidx/compose/runtime/saveable/l;", "a", "()Landroidx/compose/runtime/saveable/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.undo.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final androidx.compose.runtime.saveable.l<d, Object> a() {
            return d.f8961k;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ d(int i4, String str, String str2, long j4, long j5, long j6, boolean z4, kotlin.jvm.internal.w wVar) {
        this(i4, str, str2, j4, j5, j6, z4);
    }

    /* renamed from: b, reason: from getter */
    public final boolean getCanMerge() {
        return this.canMerge;
    }

    @l
    public final androidx.compose.foundation.text2.input.internal.undo.a c() {
        if (this.textEditType != b.Delete) {
            return androidx.compose.foundation.text2.input.internal.undo.a.NotByUser;
        }
        if (!t0.h(this.postSelection)) {
            return androidx.compose.foundation.text2.input.internal.undo.a.NotByUser;
        }
        if (t0.h(this.preSelection)) {
            return ((int) (this.preSelection >> 32)) > ((int) (this.postSelection >> 32)) ? androidx.compose.foundation.text2.input.internal.undo.a.Start : androidx.compose.foundation.text2.input.internal.undo.a.End;
        }
        long j4 = this.preSelection;
        return (((int) (j4 >> 32)) == ((int) (this.postSelection >> 32)) && ((int) (j4 >> 32)) == this.index) ? androidx.compose.foundation.text2.input.internal.undo.a.Inner : androidx.compose.foundation.text2.input.internal.undo.a.NotByUser;
    }

    /* renamed from: d, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: e, reason: from getter */
    public final long getPostSelection() {
        return this.postSelection;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getPostText() {
        return this.postText;
    }

    /* renamed from: g, reason: from getter */
    public final long getPreSelection() {
        return this.preSelection;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getPreText() {
        return this.preText;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final b getTextEditType() {
        return this.textEditType;
    }

    /* renamed from: j, reason: from getter */
    public final long getTimeInMillis() {
        return this.timeInMillis;
    }

    public d(int i4, String str, String str2, long j4, long j5, long j6, boolean z4, int i5, kotlin.jvm.internal.w wVar) {
        this(i4, str, str2, j4, j5, (i5 & 32) != 0 ? System.currentTimeMillis() : j6, (i5 & 64) != 0 ? true : z4);
    }

    private d(int i4, String str, String str2, long j4, long j5, long j6, boolean z4) {
        b bVar;
        this.index = i4;
        this.preText = str;
        this.postText = str2;
        this.preSelection = j4;
        this.postSelection = j5;
        this.timeInMillis = j6;
        this.canMerge = z4;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        if (str.length() != 0 || str2.length() <= 0) {
            bVar = (str.length() <= 0 || str2.length() != 0) ? b.Replace : b.Delete;
        } else {
            bVar = b.Insert;
        }
        this.textEditType = bVar;
    }
}
