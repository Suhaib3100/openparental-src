package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.z0;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: TextFieldLineLimits.kt */
@x4
@z0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text2/input/t;", "", "a", "b", "c", "Landroidx/compose/foundation/text2/input/t$b;", "Landroidx/compose/foundation/text2/input/t$c;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f9056a;

    /* compiled from: TextFieldLineLimits.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text2/input/t$a;", "", "<init>", "()V", "Landroidx/compose/foundation/text2/input/t;", "b", "Landroidx/compose/foundation/text2/input/t;", "a", "()Landroidx/compose/foundation/text2/input/t;", "Default", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.t$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f9056a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final t Default;

        static {
            int i4 = 0;
            Default = new b(i4, i4, 3, null);
        }

        private Companion() {
        }

        @fg.l
        public final t a() {
            return Default;
        }
    }

    /* compiled from: TextFieldLineLimits.kt */
    @m1
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/text2/input/t$b;", "Landroidx/compose/foundation/text2/input/t;", "", "minHeightInLines", "maxHeightInLines", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "I", "c", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements t {

        /* renamed from: d, reason: collision with root package name */
        public static final int f9058d = 0;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int minHeightInLines;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int maxHeightInLines;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.t.b.<init>():void");
        }

        /* renamed from: a, reason: from getter */
        public final int getMaxHeightInLines() {
            return this.maxHeightInLines;
        }

        /* renamed from: b, reason: from getter */
        public final int getMinHeightInLines() {
            return this.minHeightInLines;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || b.class != other.getClass()) {
                return false;
            }
            b bVar = (b) other;
            return this.minHeightInLines == bVar.minHeightInLines && this.maxHeightInLines == bVar.maxHeightInLines;
        }

        public int hashCode() {
            return (this.minHeightInLines * 31) + this.maxHeightInLines;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("MultiLine(minHeightInLines=");
            sb.append(this.minHeightInLines);
            sb.append(", maxHeightInLines=");
            return androidx.view.e.a(sb, this.maxHeightInLines, ')');
        }

        public b(int i4, int i5) {
            this.minHeightInLines = i4;
            this.maxHeightInLines = i5;
            if (1 > i4 || i4 > i5) {
                throw new IllegalArgumentException(androidx.compose.foundation.text.q.a("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were ", i4, ", ", i5).toString());
            }
        }

        public /* synthetic */ b(int i4, int i5, int i6, kotlin.jvm.internal.w wVar) {
            this((i6 & 1) != 0 ? 1 : i4, (i6 & 2) != 0 ? Integer.MAX_VALUE : i5);
        }
    }

    /* compiled from: TextFieldLineLimits.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text2/input/t$c;", "Landroidx/compose/foundation/text2/input/t;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements t {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final c f9061b = new c();

        /* renamed from: c, reason: collision with root package name */
        public static final int f9062c = 0;

        private c() {
        }
    }
}
