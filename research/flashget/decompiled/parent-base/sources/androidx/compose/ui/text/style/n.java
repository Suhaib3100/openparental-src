package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.graphics.a6;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.g6;
import androidx.compose.ui.graphics.t1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: TextForegroundStyle.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b`\u0018\u0000 \t2\u00020\u0001:\u0002\t\u0006J\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0006\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\b8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/style/n;", "", "other", "c", "(Landroidx/compose/ui/text/style/n;)Landroidx/compose/ui/text/style/n;", "Lkotlin/Function0;", "b", "(Lld/a;)Landroidx/compose/ui/text/style/n;", "Landroidx/compose/ui/graphics/d2;", "a", "()J", "color", "Landroidx/compose/ui/graphics/t1;", "d", "()Landroidx/compose/ui/graphics/t1;", "brush", "", "g", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f21377a;

    /* compiled from: TextForegroundStyle.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/style/n$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/ui/text/style/n;", "b", "(J)Landroidx/compose/ui/text/style/n;", "Landroidx/compose/ui/graphics/t1;", "brush", "", "alpha", "a", "(Landroidx/compose/ui/graphics/t1;F)Landroidx/compose/ui/text/style/n;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,149:1\n646#2:150\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n*L\n77#1:150\n*E\n"})
    /* renamed from: androidx.compose.ui.text.style.n$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f21377a = new Companion();

        private Companion() {
        }

        @fg.l
        public final n a(@fg.m t1 brush, float alpha) {
            if (brush == null) {
                return b.f21378b;
            }
            if (brush instanceof g6) {
                return b(m.c(((g6) brush).getValue(), alpha));
            }
            if (brush instanceof a6) {
                return new androidx.compose.ui.text.style.c((a6) brush, alpha);
            }
            throw new NoWhenBranchMatchedException();
        }

        @fg.l
        public final n b(long color) {
            d2.INSTANCE.getClass();
            return color != d2.f17778o ? new androidx.compose.ui.text.style.d(color, null) : b.f21378b;
        }
    }

    /* compiled from: TextForegroundStyle.kt */
    @u(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/style/n$b;", "Landroidx/compose/ui/text/style/n;", "<init>", "()V", "Landroidx/compose/ui/graphics/d2;", "a", "()J", "color", "Landroidx/compose/ui/graphics/t1;", "d", "()Landroidx/compose/ui/graphics/t1;", "brush", "", "g", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements n {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final b f21378b = new b();

        /* renamed from: c, reason: collision with root package name */
        public static final int f21379c = 0;

        private b() {
        }

        @Override // androidx.compose.ui.text.style.n
        /* renamed from: a */
        public long getValue() {
            d2.INSTANCE.getClass();
            return d2.f17778o;
        }

        @Override // androidx.compose.ui.text.style.n
        @fg.m
        public t1 d() {
            return null;
        }

        @Override // androidx.compose.ui.text.style.n
        public float g() {
            return Float.NaN;
        }
    }

    /* compiled from: TextForegroundStyle.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.a<Float> {
        c() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(n.this.g());
        }
    }

    /* compiled from: TextForegroundStyle.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/text/style/n;", "a", "()Landroidx/compose/ui/text/style/n;"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.a<n> {
        d() {
            super(0);
        }

        @fg.l
        public final n a() {
            return n.this;
        }

        @Override // ld.a
        public n invoke() {
            return n.this;
        }
    }

    /* renamed from: a */
    long getValue();

    @fg.l
    default n b(@fg.l ld.a<? extends n> other) {
        return !l0.g(this, b.f21378b) ? this : other.invoke();
    }

    @fg.l
    default n c(@fg.l n other) {
        float d5;
        boolean z4 = other instanceof androidx.compose.ui.text.style.c;
        if (!z4 || !(this instanceof androidx.compose.ui.text.style.c)) {
            return (!z4 || (this instanceof androidx.compose.ui.text.style.c)) ? (z4 || !(this instanceof androidx.compose.ui.text.style.c)) ? other.b(new d()) : this : other;
        }
        a6 j4 = ((androidx.compose.ui.text.style.c) other).j();
        d5 = m.d(((androidx.compose.ui.text.style.c) other).g(), new c());
        return new androidx.compose.ui.text.style.c(j4, d5);
    }

    @fg.m
    t1 d();

    float g();
}
