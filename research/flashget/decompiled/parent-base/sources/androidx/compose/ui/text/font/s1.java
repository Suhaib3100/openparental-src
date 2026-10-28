package androidx.compose.ui.text.font;

import androidx.compose.runtime.b5;
import kotlin.Metadata;

/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/s1;", "Landroidx/compose/runtime/b5;", "", "", "h", "()Z", "cacheable", "a", "b", "Landroidx/compose/ui/text/font/s1$a;", "Landroidx/compose/ui/text/font/s1$b;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface s1 extends b5<Object> {

    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/s1$a;", "Landroidx/compose/ui/text/font/s1;", "Landroidx/compose/runtime/b5;", "", "Landroidx/compose/ui/text/font/n;", "current", "<init>", "(Landroidx/compose/ui/text/font/n;)V", "b", "Landroidx/compose/ui/text/font/n;", "a", "()Landroidx/compose/ui/text/font/n;", "getValue", "()Ljava/lang/Object;", "value", "", "h", "()Z", "cacheable", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    public static final class a implements s1, b5<Object> {

        /* renamed from: c, reason: collision with root package name */
        public static final int f20872c = 0;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final n current;

        public a(@fg.l n nVar) {
            this.current = nVar;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final n getCurrent() {
            return this.current;
        }

        @Override // androidx.compose.runtime.b5
        @fg.l
        public Object getValue() {
            return this.current.getValue();
        }

        @Override // androidx.compose.ui.text.font.s1
        /* renamed from: h */
        public boolean getCacheable() {
            return this.current.getCacheable();
        }
    }

    /* renamed from: h */
    boolean getCacheable();

    /* compiled from: FontFamilyResolver.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/s1$b;", "Landroidx/compose/ui/text/font/s1;", "", "value", "", "cacheable", "<init>", "(Ljava/lang/Object;Z)V", "b", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "c", "Z", "h", "()Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements s1 {

        /* renamed from: d, reason: collision with root package name */
        public static final int f20874d = 0;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Object value;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean cacheable;

        public b(@fg.l Object obj, boolean z4) {
            this.value = obj;
            this.cacheable = z4;
        }

        @Override // androidx.compose.runtime.b5
        @fg.l
        public Object getValue() {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.s1
        /* renamed from: h, reason: from getter */
        public boolean getCacheable() {
            return this.cacheable;
        }

        public /* synthetic */ b(Object obj, boolean z4, int i4, kotlin.jvm.internal.w wVar) {
            this(obj, (i4 & 2) != 0 ? true : z4);
        }
    }
}
