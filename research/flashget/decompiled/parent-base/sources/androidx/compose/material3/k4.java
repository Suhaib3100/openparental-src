package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: DateInput.kt */
@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\b\u0005*\u0001\u0015\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/k4;", "Landroidx/compose/ui/text/input/k1;", "Landroidx/compose/material3/q3;", "dateInputFormat", "<init>", "(Landroidx/compose/material3/q3;)V", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/input/i1;", "a", "(Landroidx/compose/ui/text/e;)Landroidx/compose/ui/text/input/i1;", "b", "Landroidx/compose/material3/q3;", "", "c", "I", "firstDelimiterOffset", "d", "secondDelimiterOffset", "e", "dateFormatLength", "androidx/compose/material3/k4$a", "f", "Landroidx/compose/material3/k4$a;", "dateOffsetTranslator", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateVisualTransformation\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,377:1\n1183#2,3:378\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateVisualTransformation\n*L\n358#1:378,3\n*E\n"})
/* loaded from: classes.dex */
final class k4 implements androidx.compose.ui.text.input.k1 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q3 dateInputFormat;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int firstDelimiterOffset;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int secondDelimiterOffset;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int dateFormatLength;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a dateOffsetTranslator = new a();

    /* compiled from: DateInput.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"androidx/compose/material3/k4$a", "Landroidx/compose/ui/text/input/p0;", "", "offset", "b", "(I)I", "a", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements androidx.compose.ui.text.input.p0 {
        a() {
        }

        @Override // androidx.compose.ui.text.input.p0
        public int a(int offset) {
            return offset <= k4.this.firstDelimiterOffset + (-1) ? offset : offset <= k4.this.secondDelimiterOffset + (-1) ? offset - 1 : offset <= k4.this.dateFormatLength + 1 ? offset - 2 : k4.this.dateFormatLength;
        }

        @Override // androidx.compose.ui.text.input.p0
        public int b(int offset) {
            if (offset < k4.this.firstDelimiterOffset) {
                return offset;
            }
            if (offset < k4.this.secondDelimiterOffset) {
                return offset + 1;
            }
            if (offset > k4.this.dateFormatLength) {
                offset = k4.this.dateFormatLength;
            }
            return offset + 2;
        }
    }

    public k4(@fg.l q3 q3Var) {
        this.dateInputFormat = q3Var;
        this.firstDelimiterOffset = kotlin.text.v.o3(q3Var.f(), q3Var.e(), 0, false, 6, null);
        this.secondDelimiterOffset = kotlin.text.v.C3(q3Var.f(), q3Var.e(), 0, false, 6, null);
        this.dateFormatLength = q3Var.getPatternWithoutDelimiters().length();
    }

    @Override // androidx.compose.ui.text.input.k1
    @fg.l
    public androidx.compose.ui.text.input.i1 a(@fg.l androidx.compose.ui.text.e text) {
        int i4 = 0;
        String i5 = text.getText().length() > this.dateFormatLength ? kotlin.text.v.i5(text.getText(), kotlin.ranges.s.W1(0, this.dateFormatLength)) : text.getText();
        String str = "";
        int i6 = 0;
        while (i4 < i5.length()) {
            int i7 = i6 + 1;
            String str2 = str + i5.charAt(i4);
            if (i7 == this.firstDelimiterOffset || i6 + 2 == this.secondDelimiterOffset) {
                StringBuilder a5 = j4.a(str2);
                a5.append(this.dateInputFormat.e());
                str = a5.toString();
            } else {
                str = str2;
            }
            i4++;
            i6 = i7;
        }
        return new androidx.compose.ui.text.input.i1(new androidx.compose.ui.text.e(str, null, null, 6, null), this.dateOffsetTranslator);
    }
}
