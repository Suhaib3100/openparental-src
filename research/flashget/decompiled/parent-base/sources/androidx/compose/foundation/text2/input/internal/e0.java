package androidx.compose.foundation.text2.input.internal;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.m4;
import androidx.compose.runtime.snapshots.p0;
import androidx.compose.runtime.snapshots.r0;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.n0;
import androidx.compose.ui.text.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextFieldLayoutStateCache.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0003\u00165;B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0011\u001a\u00020\u000e2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J0\u0010)\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J'\u00102\u001a\u00020+2\u0006\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020+H\u0016¢\u0006\u0004\b2\u00103R/\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u00104\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R/\u0010\t\u001a\u0004\u0018\u00010\b2\b\u00104\u001a\u0004\u0018\u00010\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b;\u00106\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010,\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/e0;", "Landroidx/compose/runtime/b5;", "Landroidx/compose/ui/text/n0;", "Landroidx/compose/runtime/snapshots/p0;", "<init>", "()V", "Landroidx/compose/foundation/text2/input/internal/e0$c;", "nonMeasureInputs", "Landroidx/compose/foundation/text2/input/internal/e0$b;", "measureInputs", "m", "(Landroidx/compose/foundation/text2/input/internal/e0$c;Landroidx/compose/foundation/text2/input/internal/e0$b;)Landroidx/compose/ui/text/n0;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text2/input/internal/e0$a;", "Lkotlin/k2;", "Lkotlin/u;", "block", "K", "(Lld/l;)V", "", "visualText", "prevResult", "a", "(Ljava/lang/CharSequence;Landroidx/compose/foundation/text2/input/internal/e0$c;Landroidx/compose/foundation/text2/input/internal/e0$b;Landroidx/compose/ui/text/n0;)Landroidx/compose/ui/text/n0;", "Landroidx/compose/foundation/text2/input/internal/m0;", "textFieldState", "Landroidx/compose/ui/text/v0;", "textStyle", "", "singleLine", "softWrap", "Q", "(Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/ui/text/v0;ZZ)V", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Landroidx/compose/ui/unit/b;", "constraints", "s", "(Landroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/text/font/y$b;J)Landroidx/compose/ui/text/n0;", "Landroidx/compose/runtime/snapshots/r0;", "value", "A", "(Landroidx/compose/runtime/snapshots/r0;)V", "previous", "current", "applied", "H", "(Landroidx/compose/runtime/snapshots/r0;Landroidx/compose/runtime/snapshots/r0;Landroidx/compose/runtime/snapshots/r0;)Landroidx/compose/runtime/snapshots/r0;", "<set-?>", "b", "Landroidx/compose/runtime/k2;", "l", "()Landroidx/compose/foundation/text2/input/internal/e0$c;", "G", "(Landroidx/compose/foundation/text2/input/internal/e0$c;)V", "c", "i", "()Landroidx/compose/foundation/text2/input/internal/e0$b;", "y", "(Landroidx/compose/foundation/text2/input/internal/e0$b;)V", "d", "Landroidx/compose/foundation/text2/input/internal/e0$a;", "record", "q", "()Landroidx/compose/ui/text/n0;", "F", "()Landroidx/compose/runtime/snapshots/r0;", "firstStateRecord", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@r1({"SMAP\nTextFieldLayoutStateCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldLayoutStateCache.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,412:1\n215#1,4:420\n220#1:430\n81#2:413\n107#2,2:414\n81#2:416\n107#2,2:417\n2283#3:419\n2165#3:424\n1714#3:425\n2166#3,2:427\n2165#3:431\n1714#3:432\n2166#3,2:434\n82#4:426\n82#4:433\n1#5:429\n1#5:436\n*S KotlinDebug\n*F\n+ 1 TextFieldLayoutStateCache.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldLayoutStateCache\n*L\n197#1:420,4\n197#1:430\n63#1:413\n63#1:414,2\n67#1:416\n67#1:417,2\n155#1:419\n197#1:424\n197#1:425\n197#1:427,2\n218#1:431\n218#1:432\n218#1:434,2\n197#1:426\n218#1:433\n197#1:429\n218#1:436\n*E\n"})
/* loaded from: classes.dex */
public final class e0 implements b5<n0>, p0 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f8627e = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 nonMeasureInputs;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 measureInputs;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private a record;

    /* compiled from: TextFieldLayoutStateCache.kt */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R$\u0010:\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010A\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>\"\u0004\b?\u0010@R(\u0010G\u001a\u00020B8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b1\u0010C\u001a\u0004\b0\u0010D\"\u0004\bE\u0010FR$\u0010N\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/e0$a;", "Landroidx/compose/runtime/snapshots/r0;", "<init>", "()V", "d", "()Landroidx/compose/runtime/snapshots/r0;", "value", "Lkotlin/k2;", "c", "(Landroidx/compose/runtime/snapshots/r0;)V", "", "toString", "()Ljava/lang/String;", "", "Ljava/lang/CharSequence;", "r", "()Ljava/lang/CharSequence;", "B", "(Ljava/lang/CharSequence;)V", "visualText", "Landroidx/compose/ui/text/v0;", "e", "Landroidx/compose/ui/text/v0;", "q", "()Landroidx/compose/ui/text/v0;", "A", "(Landroidx/compose/ui/text/v0;)V", "textStyle", "", "f", "Z", "o", "()Z", "y", "(Z)V", "singleLine", "g", "p", "z", "softWrap", "", "h", "F", "j", "()F", "t", "(F)V", "densityValue", "i", "l", "v", "fontScale", "Landroidx/compose/ui/unit/w;", "Landroidx/compose/ui/unit/w;", "m", "()Landroidx/compose/ui/unit/w;", "w", "(Landroidx/compose/ui/unit/w;)V", "layoutDirection", "Landroidx/compose/ui/text/font/y$b;", "k", "Landroidx/compose/ui/text/font/y$b;", "()Landroidx/compose/ui/text/font/y$b;", "u", "(Landroidx/compose/ui/text/font/y$b;)V", "fontFamilyResolver", "Landroidx/compose/ui/unit/b;", "J", "()J", "s", "(J)V", "constraints", "Landroidx/compose/ui/text/n0;", "Landroidx/compose/ui/text/n0;", "n", "()Landroidx/compose/ui/text/n0;", "x", "(Landroidx/compose/ui/text/n0;)V", "layoutResult", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a extends r0 {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private CharSequence visualText;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private v0 textStyle;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean singleLine;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean softWrap;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private androidx.compose.ui.unit.w layoutDirection;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private y.b fontFamilyResolver;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private n0 layoutResult;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private float densityValue = Float.NaN;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private float fontScale = Float.NaN;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private long constraints = androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null);

        public final void A(@fg.m v0 v0Var) {
            this.textStyle = v0Var;
        }

        public final void B(@fg.m CharSequence charSequence) {
            this.visualText = charSequence;
        }

        @Override // androidx.compose.runtime.snapshots.r0
        public void c(@fg.l r0 value) {
            kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord");
            a aVar = (a) value;
            this.visualText = aVar.visualText;
            this.textStyle = aVar.textStyle;
            this.singleLine = aVar.singleLine;
            this.softWrap = aVar.softWrap;
            this.densityValue = aVar.densityValue;
            this.fontScale = aVar.fontScale;
            this.layoutDirection = aVar.layoutDirection;
            this.fontFamilyResolver = aVar.fontFamilyResolver;
            this.constraints = aVar.constraints;
            this.layoutResult = aVar.layoutResult;
        }

        @Override // androidx.compose.runtime.snapshots.r0
        @fg.l
        public r0 d() {
            return new a();
        }

        /* renamed from: i, reason: from getter */
        public final long getConstraints() {
            return this.constraints;
        }

        /* renamed from: j, reason: from getter */
        public final float getDensityValue() {
            return this.densityValue;
        }

        @fg.m
        /* renamed from: k, reason: from getter */
        public final y.b getFontFamilyResolver() {
            return this.fontFamilyResolver;
        }

        /* renamed from: l, reason: from getter */
        public final float getFontScale() {
            return this.fontScale;
        }

        @fg.m
        /* renamed from: m, reason: from getter */
        public final androidx.compose.ui.unit.w getLayoutDirection() {
            return this.layoutDirection;
        }

        @fg.m
        /* renamed from: n, reason: from getter */
        public final n0 getLayoutResult() {
            return this.layoutResult;
        }

        /* renamed from: o, reason: from getter */
        public final boolean getSingleLine() {
            return this.singleLine;
        }

        /* renamed from: p, reason: from getter */
        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        @fg.m
        /* renamed from: q, reason: from getter */
        public final v0 getTextStyle() {
            return this.textStyle;
        }

        @fg.m
        /* renamed from: r, reason: from getter */
        public final CharSequence getVisualText() {
            return this.visualText;
        }

        public final void s(long j4) {
            this.constraints = j4;
        }

        public final void t(float f4) {
            this.densityValue = f4;
        }

        @fg.l
        public String toString() {
            return "CacheRecord(visualText=" + ((Object) this.visualText) + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", softWrap=" + this.softWrap + ", densityValue=" + this.densityValue + ", fontScale=" + this.fontScale + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) androidx.compose.ui.unit.b.w(this.constraints)) + ", layoutResult=" + this.layoutResult + ')';
        }

        public final void u(@fg.m y.b bVar) {
            this.fontFamilyResolver = bVar;
        }

        public final void v(float f4) {
            this.fontScale = f4;
        }

        public final void w(@fg.m androidx.compose.ui.unit.w wVar) {
            this.layoutDirection = wVar;
        }

        public final void x(@fg.m n0 n0Var) {
            this.layoutResult = n0Var;
        }

        public final void y(boolean z4) {
            this.singleLine = z4;
        }

        public final void z(boolean z4) {
            this.softWrap = z4;
        }
    }

    /* compiled from: TextFieldLayoutStateCache.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0013\u0010\u001cR\u0017\u0010 \u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/e0$b;", "", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Landroidx/compose/ui/unit/b;", "constraints", "<init>", "(Landroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/text/font/y$b;JLkotlin/jvm/internal/w;)V", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/unit/d;", "c", "()Landroidx/compose/ui/unit/d;", "b", "Landroidx/compose/ui/unit/w;", "g", "()Landroidx/compose/ui/unit/w;", "Landroidx/compose/ui/text/font/y$b;", "e", "()Landroidx/compose/ui/text/font/y$b;", "d", "J", "()J", "", "F", "()F", "densityValue", "f", "fontScale", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: h, reason: collision with root package name */
        @fg.l
        private static final m4<b> f8642h = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.ui.unit.d density;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.ui.unit.w layoutDirection;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final y.b fontFamilyResolver;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final long constraints;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float densityValue;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float fontScale;

        /* compiled from: TextFieldLayoutStateCache.kt */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/compose/foundation/text2/input/internal/e0$b$a", "Landroidx/compose/runtime/m4;", "Landroidx/compose/foundation/text2/input/internal/e0$b;", "a", "b", "", "d", "(Landroidx/compose/foundation/text2/input/internal/e0$b;Landroidx/compose/foundation/text2/input/internal/e0$b;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements m4<b> {
            a() {
            }

            @Override // androidx.compose.runtime.m4
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public boolean c(@fg.m b a5, @fg.m b b5) {
                if (a5 == null || b5 == null) {
                    if ((a5 == null) ^ (b5 == null)) {
                        return false;
                    }
                } else if (a5.getDensityValue() != b5.getDensityValue() || a5.getFontScale() != b5.getFontScale() || a5.getLayoutDirection() != b5.getLayoutDirection() || !kotlin.jvm.internal.l0.g(a5.getFontFamilyResolver(), b5.getFontFamilyResolver()) || !androidx.compose.ui.unit.b.g(a5.getConstraints(), b5.getConstraints())) {
                    return false;
                }
                return true;
            }
        }

        /* compiled from: TextFieldLayoutStateCache.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/e0$b$b;", "", "<init>", "()V", "Landroidx/compose/runtime/m4;", "Landroidx/compose/foundation/text2/input/internal/e0$b;", "mutationPolicy", "Landroidx/compose/runtime/m4;", "a", "()Landroidx/compose/runtime/m4;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.text2.input.internal.e0$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            public final m4<b> a() {
                return b.f8642h;
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        public /* synthetic */ b(androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, y.b bVar, long j4, kotlin.jvm.internal.w wVar2) {
            this(dVar, wVar, bVar, j4);
        }

        /* renamed from: b, reason: from getter */
        public final long getConstraints() {
            return this.constraints;
        }

        @fg.l
        /* renamed from: c, reason: from getter */
        public final androidx.compose.ui.unit.d getDensity() {
            return this.density;
        }

        /* renamed from: d, reason: from getter */
        public final float getDensityValue() {
            return this.densityValue;
        }

        @fg.l
        /* renamed from: e, reason: from getter */
        public final y.b getFontFamilyResolver() {
            return this.fontFamilyResolver;
        }

        /* renamed from: f, reason: from getter */
        public final float getFontScale() {
            return this.fontScale;
        }

        @fg.l
        /* renamed from: g, reason: from getter */
        public final androidx.compose.ui.unit.w getLayoutDirection() {
            return this.layoutDirection;
        }

        @fg.l
        public String toString() {
            return "MeasureInputs(density=" + this.density + ", densityValue=" + this.densityValue + ", fontScale=" + this.fontScale + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) androidx.compose.ui.unit.b.w(this.constraints)) + ')';
        }

        private b(androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, y.b bVar, long j4) {
            this.density = dVar;
            this.layoutDirection = wVar;
            this.fontFamilyResolver = bVar;
            this.constraints = j4;
            this.densityValue = dVar.getDensity();
            this.fontScale = dVar.getFontScale();
        }
    }

    /* compiled from: TextFieldLayoutStateCache.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/e0$c;", "", "Landroidx/compose/foundation/text2/input/internal/m0;", "textFieldState", "Landroidx/compose/ui/text/v0;", "textStyle", "", "singleLine", "softWrap", "<init>", "(Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/ui/text/v0;ZZ)V", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/foundation/text2/input/internal/m0;", "d", "()Landroidx/compose/foundation/text2/input/internal/m0;", "b", "Landroidx/compose/ui/text/v0;", "e", "()Landroidx/compose/ui/text/v0;", "c", "Z", "()Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: f, reason: collision with root package name */
        @fg.l
        private static final m4<c> f8650f = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final m0 textFieldState;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final v0 textStyle;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean singleLine;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean softWrap;

        /* compiled from: TextFieldLayoutStateCache.kt */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/compose/foundation/text2/input/internal/e0$c$a", "Landroidx/compose/runtime/m4;", "Landroidx/compose/foundation/text2/input/internal/e0$c;", "a", "b", "", "d", "(Landroidx/compose/foundation/text2/input/internal/e0$c;Landroidx/compose/foundation/text2/input/internal/e0$c;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements m4<c> {
            a() {
            }

            @Override // androidx.compose.runtime.m4
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public boolean c(@fg.m c a5, @fg.m c b5) {
                if (a5 == null || b5 == null) {
                    if ((a5 == null) ^ (b5 == null)) {
                        return false;
                    }
                } else if (a5.getTextFieldState() != b5.getTextFieldState() || !kotlin.jvm.internal.l0.g(a5.getTextStyle(), b5.getTextStyle()) || a5.getSingleLine() != b5.getSingleLine() || a5.getSoftWrap() != b5.getSoftWrap()) {
                    return false;
                }
                return true;
            }
        }

        /* compiled from: TextFieldLayoutStateCache.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/e0$c$b;", "", "<init>", "()V", "Landroidx/compose/runtime/m4;", "Landroidx/compose/foundation/text2/input/internal/e0$c;", "mutationPolicy", "Landroidx/compose/runtime/m4;", "a", "()Landroidx/compose/runtime/m4;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.text2.input.internal.e0$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            public final m4<c> a() {
                return c.f8650f;
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        public c(@fg.l m0 m0Var, @fg.l v0 v0Var, boolean z4, boolean z5) {
            this.textFieldState = m0Var;
            this.textStyle = v0Var;
            this.singleLine = z4;
            this.softWrap = z5;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getSingleLine() {
            return this.singleLine;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        @fg.l
        /* renamed from: d, reason: from getter */
        public final m0 getTextFieldState() {
            return this.textFieldState;
        }

        @fg.l
        /* renamed from: e, reason: from getter */
        public final v0 getTextStyle() {
            return this.textStyle;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("NonMeasureInputs(textFieldState=");
            sb.append(this.textFieldState);
            sb.append(", textStyle=");
            sb.append(this.textStyle);
            sb.append(", singleLine=");
            sb.append(this.singleLine);
            sb.append(", softWrap=");
            return androidx.compose.animation.l.a(sb, this.softWrap, ')');
        }
    }

    public e0() {
        c.INSTANCE.getClass();
        this.nonMeasureInputs = androidx.compose.runtime.b.e(null, c.f8650f);
        b.INSTANCE.getClass();
        this.measureInputs = androidx.compose.runtime.b.e(null, b.f8642h);
        this.record = new a();
    }

    private final void G(c cVar) {
        this.nonMeasureInputs.setValue(cVar);
    }

    private final void K(ld.l<? super a, kotlin.k2> block) {
        androidx.compose.runtime.snapshots.m.INSTANCE.getClass();
        androidx.compose.runtime.snapshots.m I = androidx.compose.runtime.snapshots.v.I();
        if (I.l()) {
            return;
        }
        a aVar = this.record;
        synchronized (androidx.compose.runtime.snapshots.v.K()) {
            block.invoke(androidx.compose.runtime.snapshots.v.r0(aVar, this, I));
        }
        androidx.compose.runtime.snapshots.v.U(I, this);
    }

    private final n0 a(CharSequence visualText, c nonMeasureInputs, b measureInputs, n0 prevResult) {
        return new androidx.compose.foundation.text.m0(new androidx.compose.ui.text.e(visualText.toString(), null, null, 6, null), nonMeasureInputs.getTextStyle(), 0, 0, nonMeasureInputs.getSoftWrap(), 0, measureInputs.getDensity(), measureInputs.getFontFamilyResolver(), kotlin.collections.j0.f74919b, 44, null).o(measureInputs.getConstraints(), measureInputs.getLayoutDirection(), prevResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final b i() {
        return (b) this.measureInputs.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final c l() {
        return (c) this.nonMeasureInputs.getValue();
    }

    private final n0 m(c nonMeasureInputs, b measureInputs) {
        CharSequence visualText;
        androidx.compose.foundation.text2.input.q k4 = nonMeasureInputs.getTextFieldState().k();
        a aVar = (a) androidx.compose.runtime.snapshots.v.G(this.record);
        n0 layoutResult = aVar.getLayoutResult();
        if (layoutResult != null && (visualText = aVar.getVisualText()) != null && kotlin.text.v.w1(visualText, k4) && aVar.getSingleLine() == nonMeasureInputs.getSingleLine() && aVar.getSoftWrap() == nonMeasureInputs.getSoftWrap() && aVar.getLayoutDirection() == measureInputs.getLayoutDirection() && aVar.getDensityValue() == measureInputs.getDensity().getDensity() && aVar.getFontScale() == measureInputs.getDensity().getFontScale() && androidx.compose.ui.unit.b.g(aVar.getConstraints(), measureInputs.getConstraints()) && kotlin.jvm.internal.l0.g(aVar.getFontFamilyResolver(), measureInputs.getFontFamilyResolver())) {
            if (kotlin.jvm.internal.l0.g(aVar.getTextStyle(), nonMeasureInputs.getTextStyle())) {
                return layoutResult;
            }
            v0 textStyle = aVar.getTextStyle();
            if (textStyle != null && textStyle.Z(nonMeasureInputs.getTextStyle())) {
                return n0.b(layoutResult, new androidx.compose.ui.text.m0(layoutResult.getLayoutInput().getText(), nonMeasureInputs.getTextStyle(), layoutResult.getLayoutInput().i(), layoutResult.getLayoutInput().getMaxLines(), layoutResult.getLayoutInput().getSoftWrap(), layoutResult.getLayoutInput().getOverflow(), layoutResult.getLayoutInput().getDensity(), layoutResult.getLayoutInput().getLayoutDirection(), layoutResult.getLayoutInput().getFontFamilyResolver(), layoutResult.getLayoutInput().getConstraints(), (kotlin.jvm.internal.w) null), 0L, 2, null);
            }
        }
        n0 a5 = a(k4, nonMeasureInputs, measureInputs, layoutResult);
        if (!kotlin.jvm.internal.l0.g(a5, layoutResult)) {
            androidx.compose.runtime.snapshots.m.INSTANCE.getClass();
            androidx.compose.runtime.snapshots.m I = androidx.compose.runtime.snapshots.v.I();
            if (!I.l()) {
                a aVar2 = this.record;
                synchronized (androidx.compose.runtime.snapshots.v.K()) {
                    a aVar3 = (a) androidx.compose.runtime.snapshots.v.r0(aVar2, this, I);
                    aVar3.B(k4);
                    aVar3.y(nonMeasureInputs.getSingleLine());
                    aVar3.z(nonMeasureInputs.getSoftWrap());
                    aVar3.A(nonMeasureInputs.getTextStyle());
                    aVar3.w(measureInputs.getLayoutDirection());
                    aVar3.t(measureInputs.getDensityValue());
                    aVar3.v(measureInputs.getFontScale());
                    aVar3.s(measureInputs.getConstraints());
                    aVar3.u(measureInputs.getFontFamilyResolver());
                    aVar3.x(a5);
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                }
                androidx.compose.runtime.snapshots.v.U(I, this);
            }
        }
        return a5;
    }

    private final void y(b bVar) {
        this.measureInputs.setValue(bVar);
    }

    @Override // androidx.compose.runtime.snapshots.p0
    public void A(@fg.l r0 value) {
        kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type androidx.compose.foundation.text2.input.internal.TextFieldLayoutStateCache.CacheRecord");
        this.record = (a) value;
    }

    @Override // androidx.compose.runtime.snapshots.p0
    @fg.l
    /* renamed from: F */
    public r0 getFirstStateRecord() {
        return this.record;
    }

    @Override // androidx.compose.runtime.snapshots.p0
    @fg.l
    public r0 H(@fg.l r0 previous, @fg.l r0 current, @fg.l r0 applied) {
        return applied;
    }

    public final void Q(@fg.l m0 textFieldState, @fg.l v0 textStyle, boolean singleLine, boolean softWrap) {
        G(new c(textFieldState, textStyle, singleLine, softWrap));
    }

    @Override // androidx.compose.runtime.b5
    @fg.m
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public n0 getValue() {
        b i4;
        c l4 = l();
        if (l4 == null || (i4 = i()) == null) {
            return null;
        }
        return m(l4, i4);
    }

    @fg.l
    public final n0 s(@fg.l androidx.compose.ui.unit.d density, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l y.b fontFamilyResolver, long constraints) {
        b bVar = new b(density, layoutDirection, fontFamilyResolver, constraints, null);
        y(bVar);
        c l4 = l();
        if (l4 != null) {
            return m(l4, bVar);
        }
        throw new IllegalStateException("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
    }
}
